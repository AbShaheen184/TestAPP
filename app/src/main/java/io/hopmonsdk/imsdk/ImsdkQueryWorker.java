package io.hopmonsdk.imsdk;

import android.content.Context;
import android.provider.Settings;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.t;
import androidx.work.u;
import androidx.work.v;
import androidx.work.w;
import io.hopmonsdk.Hopmn;
import io.hopmonsdk.seed.SeedDiscovery;
import io.hopmonsdk.util.LogUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ImsdkQueryWorker extends Worker {
    private static final String TAG = "ImsdkQueryWorker";
    private static boolean isFirstRunInSession = true;
    private static volatile SeedDiscovery sharedDiscovery;

    public ImsdkQueryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static SeedDiscovery getDiscovery(String str, String str2) {
        if (sharedDiscovery == null) {
            synchronized (ImsdkQueryWorker.class) {
                try {
                    if (sharedDiscovery == null) {
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : str.split(",")) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        sharedDiscovery = new SeedDiscovery(arrayList, str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sharedDiscovery;
    }

    @Override // androidx.work.Worker
    public w doWork() {
        Context applicationContext = getApplicationContext();
        if (!Hopmn.isConsentAgreed(applicationContext)) {
            LogUtils.i(TAG, "Consent not granted - skip active check and stop imsdk", new Object[0]);
            ImsdkActivation.stopImsdk();
            isFirstRunInSession = true;
            return new v();
        }
        try {
            String strA = getInputData().a(ImsdkActivation.KEY_PUBLISHER);
            String strA2 = getInputData().a(ImsdkActivation.KEY_SEED_CSV);
            String string = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
            if (strA2 != null && !strA2.trim().isEmpty()) {
                SeedDiscovery discovery = getDiscovery(strA2, strA);
                String str = "/active.php?app=imsdk2&app2=appgain&pub=" + strA + "&deviceid=" + string + "&ver=extpub";
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                String strOptString = null;
                final AtomicReference atomicReference = new AtomicReference(null);
                final AtomicReference atomicReference2 = new AtomicReference(null);
                discovery.executeGet(str, new SeedDiscovery.StringCallback() { // from class: io.hopmonsdk.imsdk.ImsdkQueryWorker.1
                    @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
                    public void onFailure(String str2) {
                        atomicReference2.set(str2);
                        countDownLatch.countDown();
                    }

                    @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
                    public void onSuccess(String str2) {
                        atomicReference.set(str2);
                        countDownLatch.countDown();
                    }
                });
                if (!countDownLatch.await(90L, TimeUnit.SECONDS)) {
                    LogUtils.e(TAG, "active check timed out", new Object[0]);
                    return new u();
                }
                String str2 = (String) atomicReference.get();
                if (str2 == null) {
                    LogUtils.e(TAG, "active check failed: %s", atomicReference2.get());
                    return new u();
                }
                String strTrim = str2.trim();
                String str3 = "btv";
                if (strTrim.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(strTrim);
                        String strOptString2 = jSONObject.optString("status", null);
                        strOptString = jSONObject.optString("publisher", null);
                        strTrim = strOptString2;
                    } catch (Exception unused) {
                    }
                }
                if ("OK".equalsIgnoreCase(strTrim)) {
                    if (strOptString != null && !strOptString.trim().isEmpty()) {
                        str3 = strOptString;
                    }
                    LogUtils.i(TAG, "active OK, publisher=%s", str3);
                    if (isFirstRunInSession) {
                        ImsdkActivation.startImsdk(applicationContext, str3);
                        isFirstRunInSession = false;
                    }
                } else {
                    LogUtils.i(TAG, "active INACTIVE - stop imsdk", new Object[0]);
                    ImsdkActivation.stopImsdk();
                    isFirstRunInSession = true;
                }
                return new v();
            }
            LogUtils.e(TAG, "No seed CSV - cannot resolve API server", new Object[0]);
            return new t();
        } catch (Exception e) {
            LogUtils.e(TAG, "Exception in imsdk active check: %s", e.getMessage());
            return new u();
        }
    }
}
