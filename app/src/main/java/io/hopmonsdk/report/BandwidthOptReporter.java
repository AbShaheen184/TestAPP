package io.hopmonsdk.report;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import androidx.constraintlayout.core.g;
import androidx.work.impl.h;
import io.hopmonsdk.util.LogUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class BandwidthOptReporter {
    public static final String DEFAULT_ENDPOINT_BASE = "https://pubs.abnetworks.io/api";
    private static final String IP_RESOLVER = "https://api.ipify.org";
    private static final String TAG = "BandwidthOptReporter";
    private static final int TIMEOUT_MS = 10000;

    private BandwidthOptReporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postIp$0(Context context, String str, String str2, String str3) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(IP_RESOLVER).openConnection();
            httpURLConnection.setConnectTimeout(TIMEOUT_MS);
            httpURLConnection.setReadTimeout(TIMEOUT_MS);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                httpURLConnection.disconnect();
                if (line != null && !line.trim().isEmpty()) {
                    String strTrim = line.trim();
                    String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setConnectTimeout(TIMEOUT_MS);
                    httpURLConnection2.setReadTimeout(TIMEOUT_MS);
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strEncodeToString = Base64.encodeToString((str3 + ":" + str2).getBytes("UTF-8"), 2);
                    StringBuilder sb = new StringBuilder("Basic ");
                    sb.append(strEncodeToString);
                    httpURLConnection2.setRequestProperty("Authorization", sb.toString());
                    httpURLConnection2.getOutputStream().write(("{\"ips\":[\"" + strTrim + "\"],\"device_id\":\"" + string + "\"}").getBytes("UTF-8"));
                    httpURLConnection2.getOutputStream().close();
                    LogUtils.d(TAG, "POST %s ip=%s HTTP %d", str, strTrim, Integer.valueOf(httpURLConnection2.getResponseCode()));
                    httpURLConnection2.disconnect();
                    return;
                }
                LogUtils.e(TAG, "could not resolve public IP", new Object[0]);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "opt report failed: %s", e.getMessage());
        }
    }

    private static void postIp(Context context, String str, String str2, String str3) {
        new Thread(new h(context.getApplicationContext(), str, str3, str2, 4)).start();
    }

    public static void reportOptIn(Context context, String str, String str2, String str3) {
        postIp(context, g.c(str, "/optin"), str2, str3);
    }

    public static void reportOptOut(Context context, String str, String str2, String str3) {
        postIp(context, g.c(str, "/optout"), str2, str3);
    }
}
