package io.hopmonsdk.imsdk;

import android.content.Context;
import android.support.v4.media.session.b;
import androidx.activity.compose.f;
import androidx.room.y;
import androidx.work.a0;
import androidx.work.b0;
import androidx.work.c0;
import androidx.work.g0;
import androidx.work.h0;
import androidx.work.i;
import androidx.work.impl.model.p;
import androidx.work.impl.o;
import androidx.work.impl.t;
import androidx.work.impl.utils.taskexecutor.c;
import androidx.work.impl.v;
import androidx.work.m;
import com.imsdk.a;
import io.hopmonsdk.util.LogUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i0;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ImsdkActivation {
    private static final String IMSDK_CLASS = "com.imsdk.IMSDK";
    public static final String KEY_PUBLISHER = "PUBLISHER_ID";
    public static final String KEY_SEED_CSV = "SEED_CSV";
    private static final String TAG = "ImsdkActivation";
    public static final String WORK_ONESHOT = "DownloaderSdkQueryWorkOnce";
    public static final String WORK_PERIODIC = "DownloaderSdkQueryWork";
    private static volatile Boolean imsdkPresent;

    private ImsdkActivation() {
    }

    public static void disable(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            t tVarB = t.b(applicationContext);
            tVarB.a(WORK_PERIODIC);
            tVarB.a(WORK_ONESHOT);
        } catch (Throwable th) {
            LogUtils.e(TAG, "cancel imsdk work failed: %s", th.getMessage());
        }
        stopImsdk();
    }

    public static void enable(Context context, String str, String str2) {
        if (!isImsdkPresent()) {
            LogUtils.w(TAG, "im-sdk not present on classpath - imsdk activation skipped", new Object[0]);
            return;
        }
        if (str2 == null || str2.trim().isEmpty()) {
            LogUtils.e(TAG, "no seed CSV - cannot schedule imsdk activation", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(KEY_PUBLISHER, str);
        linkedHashMap.put(KEY_SEED_CSV, str2);
        i iVar = new i(linkedHashMap);
        b.G(iVar);
        Context applicationContext = context.getApplicationContext();
        b0 b0Var = new b0(ImsdkQueryWorker.class);
        ((p) b0Var.d).e = iVar;
        c0 c0Var = (c0) ((b0) b0Var.n(30L)).b();
        applicationContext.getClass();
        new o(t.b(applicationContext), WORK_ONESHOT, m.e, q.j(c0Var), 0).a();
        TimeUnit.MINUTES.getClass();
        g0 g0Var = new g0(ImsdkQueryWorker.class);
        p pVar = (p) g0Var.d;
        pVar.getClass();
        String str3 = p.z;
        pVar.h = 3600000L;
        pVar.i = i0.e(3600000L, 300000L, 3600000L);
        ((p) g0Var.d).e = iVar;
        h0 h0Var = (h0) ((g0) g0Var.n(120L)).b();
        t tVarB = t.b(applicationContext);
        a0 a0Var = tVarB.b.m;
        String strConcat = "enqueueUniquePeriodic_".concat(WORK_PERIODIC);
        y yVar = ((c) tVarB.d).a;
        yVar.getClass();
        v.K(a0Var, strConcat, yVar, new f(22, tVarB, h0Var));
        LogUtils.d(TAG, "imsdk activation enabled (immediate + hourly), pub=%s", str);
    }

    public static boolean isImsdkPresent() {
        Boolean bool = imsdkPresent;
        if (bool == null) {
            try {
                bool = Boolean.TRUE;
            } catch (Throwable unused) {
                bool = Boolean.FALSE;
            }
            imsdkPresent = bool;
        }
        return bool.booleanValue();
    }

    public static void startImsdk(Context context, String str) {
        try {
            a.class.getMethod("start", Context.class, String.class).invoke(null, context.getApplicationContext(), str);
            LogUtils.i(TAG, "IMSDK.start(pub=%s) invoked", str);
        } catch (Throwable th) {
            LogUtils.e(TAG, "IMSDK.start reflection failed: %s", th.getMessage());
        }
    }

    public static void stopImsdk() {
        try {
            a.class.getMethod("stop", null).invoke(null, null);
            LogUtils.i(TAG, "IMSDK.stop() invoked", new Object[0]);
        } catch (Throwable th) {
            LogUtils.e(TAG, "IMSDK.stop reflection failed: %s", th.getMessage());
        }
    }
}
