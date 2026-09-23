package io.hopmonsdk.seed;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.constraintlayout.core.g;
import androidx.media3.exoplayer.t;
import io.hopmonsdk.util.LogUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class SeedDiscovery {
    private static final long CACHE_TTL_MS = 300000;
    private static final int CONNECT_TIMEOUT_MS = 10000;
    private static final String DOH_URL_TEMPLATE = "https://cloudflare-dns.com/dns-query?name=%s&type=A";
    private static final String POSTCONSENT_KEY = "9221346234fa4fb880caf324effcff004025a41a51d672a7";
    private static final String[] POSTCONSENT_URLS = {"https://pubs.abnetworks.io/postconsent", "https://pubs.myrc.xyz/postconsent"};
    private static final int READ_TIMEOUT_MS = 10000;
    private static final String SEEDS_PATH = "/v1/seeds";
    public static final String TAG = "SeedDiscovery";
    private final ExecutorService bgExecutor;
    private final Object cacheLock;
    private List<String> cachedApiIps;
    private List<String> cachedSeedIps;
    String dohBaseUrl;
    private long lastRefreshMs;
    private String lastSuccessfulApiIp;
    private String lastSuccessfulSeedIp;
    private final Handler mainHandler;
    private final String publisher;
    private final List<String> seedFqdns;
    int testPort;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public interface StringCallback {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public SeedDiscovery(List<String> list, String str) {
        this.bgExecutor = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.testPort = -1;
        this.dohBaseUrl = "https://cloudflare-dns.com";
        this.cacheLock = new Object();
        List<String> list2 = Collections.EMPTY_LIST;
        this.cachedSeedIps = list2;
        this.cachedApiIps = list2;
        this.lastRefreshMs = 0L;
        this.seedFqdns = new ArrayList(list);
        this.publisher = str;
    }

    private static void applyTrustAll(HttpsURLConnection httpsURLConnection) throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: io.hopmonsdk.seed.SeedDiscovery.1
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }
        }};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        httpsURLConnection.setHostnameVerifier(new b());
    }

    private String buildUrl(String str, String str2) {
        if (this.testPort <= 0) {
            return androidx.privacysandbox.ads.adservices.java.internal.a.r("https://", str, str2);
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.testPort, str2, androidx.privacysandbox.ads.adservices.java.internal.a.x("http://", str, ":"));
    }

    private List<String> dohResolve(String str) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            HttpURLConnection httpURLConnectionOpenSmartConnection = openSmartConnection(this.dohBaseUrl + "/dns-query?name=" + str + "&type=A");
            httpURLConnectionOpenSmartConnection.setRequestProperty("accept", "application/dns-json");
            httpURLConnectionOpenSmartConnection.setConnectTimeout(10000);
            httpURLConnectionOpenSmartConnection.setReadTimeout(10000);
            httpURLConnectionOpenSmartConnection.setRequestMethod("GET");
            if (httpURLConnectionOpenSmartConnection.getResponseCode() != 200) {
                httpURLConnectionOpenSmartConnection.disconnect();
                return arrayList;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionOpenSmartConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            bufferedReader.close();
            httpURLConnectionOpenSmartConnection.disconnect();
            JSONObject jSONObject = new JSONObject(sb.toString());
            if (jSONObject.optInt("Status", -1) == 0 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("Answer")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    if (jSONObject2.optInt("type", 0) == 1) {
                        String strTrim = jSONObject2.optString("data", "").trim();
                        if (isValidIpv4(strTrim)) {
                            arrayList.add(strTrim);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            LogUtils.e(TAG, "DoH resolution failed for %s: %s", str, e.getMessage());
            return arrayList;
        }
    }

    private void execute(String str, boolean z, StringCallback stringCallback) {
        this.bgExecutor.execute(new t(this, str, z, stringCallback));
    }

    private static String extractHost(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return str;
        }
    }

    private List<String> fetchApiIpsFromUrl(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            HttpURLConnection httpURLConnectionOpenSmartConnection = openSmartConnection(str);
            httpURLConnectionOpenSmartConnection.setConnectTimeout(10000);
            httpURLConnectionOpenSmartConnection.setReadTimeout(10000);
            httpURLConnectionOpenSmartConnection.setRequestMethod("GET");
            int responseCode = httpURLConnectionOpenSmartConnection.getResponseCode();
            if (responseCode != 200) {
                LogUtils.w(TAG, "Seed %s returned HTTP %d", str, Integer.valueOf(responseCode));
                httpURLConnectionOpenSmartConnection.disconnect();
                return arrayList;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionOpenSmartConnection.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    httpURLConnectionOpenSmartConnection.disconnect();
                    LogUtils.d(TAG, "Seed %s returned %d API IPs", str, Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                String strTrim = line.trim();
                if (isValidIpv4(strTrim)) {
                    arrayList.add(strTrim);
                }
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "Failed to fetch API IPs from seed %s: %s", str, e.getMessage());
            return arrayList;
        }
    }

    private List<String> forceRefresh() {
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.seedFqdns) {
            if (str.contains("://")) {
                String strExtractHost = extractHost(str);
                arrayList.add(str);
                if (!TextUtils.isEmpty(strExtractHost)) {
                    arrayList2.add(strExtractHost);
                }
                LogUtils.d(TAG, "Seed entry is a full URL: %s (host=%s)", str, strExtractHost);
            } else if (isValidIpv4(str)) {
                arrayList.add(buildUrl(str, SEEDS_PATH));
                arrayList2.add(str);
                LogUtils.d(TAG, "Seed %s is a direct IP, skipping DoH", str);
            } else {
                List<String> listDohResolve = dohResolve(str);
                LogUtils.d(TAG, "DoH %s -> %s", str, listDohResolve);
                for (String str2 : listDohResolve) {
                    arrayList.add(buildUrl(str2, SEEDS_PATH));
                    arrayList2.add(str2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            synchronized (this.cacheLock) {
                this.cachedSeedIps = new ArrayList(arrayList2);
            }
            for (String str3 : arrayList) {
                List<String> listFetchApiIpsFromUrl = fetchApiIpsFromUrl(str3);
                if (!listFetchApiIpsFromUrl.isEmpty()) {
                    this.lastSuccessfulSeedIp = extractHost(str3);
                    arrayList3.addAll(listFetchApiIpsFromUrl);
                    break;
                }
            }
        } else {
            LogUtils.e(TAG, "No seed endpoints available for %s", this.seedFqdns);
        }
        if (arrayList3.isEmpty() && !TextUtils.isEmpty(this.publisher)) {
            LogUtils.w(TAG, "Seeds returned no API IPs; trying postconsent fallback for pub=%s", this.publisher);
            for (String str4 : POSTCONSENT_URLS) {
                List<String> listFetchApiIpsFromUrl2 = fetchApiIpsFromUrl(androidx.privacysandbox.ads.adservices.java.internal.a.u(g.d(str4, "?pub="), this.publisher, "&key=9221346234fa4fb880caf324effcff004025a41a51d672a7"));
                if (!listFetchApiIpsFromUrl2.isEmpty()) {
                    this.lastSuccessfulSeedIp = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), extractHost(str4), " (postconsent)");
                    arrayList3.addAll(listFetchApiIpsFromUrl2);
                    LogUtils.i(TAG, "FALLBACK USED: postconsent %s returned %d API IPs for pub=%s", extractHost(str4), Integer.valueOf(listFetchApiIpsFromUrl2.size()), this.publisher);
                    break;
                }
            }
        }
        if (arrayList3.isEmpty()) {
            LogUtils.e(TAG, "No API IPs from seeds or postconsent fallback", new Object[0]);
            return Collections.EMPTY_LIST;
        }
        Collections.shuffle(arrayList3);
        synchronized (this.cacheLock) {
            this.cachedApiIps = new ArrayList(arrayList3);
            this.lastRefreshMs = System.currentTimeMillis();
        }
        LogUtils.d(TAG, "API IP cache refreshed: %s", arrayList3);
        return new ArrayList(arrayList3);
    }

    private List<String> getOrRefreshApiIps() {
        return isCacheFresh() ? getCachedApiIps() : forceRefresh();
    }

    private static boolean isValidIpv4(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^(\\d{1,3}\\.){3}\\d{1,3}$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$applyTrustAll$1(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(String str, boolean z, StringCallback stringCallback) {
        String str2;
        String strTryRequest;
        List<String> orRefreshApiIps = getOrRefreshApiIps();
        if (!orRefreshApiIps.isEmpty() && (strTryRequest = tryRequest(orRefreshApiIps, str, z)) != null) {
            postSuccess(stringCallback, strTryRequest);
            return;
        }
        LogUtils.w(TAG, "All API IPs failed, forcing cache refresh...", new Object[0]);
        List<String> listForceRefresh = forceRefresh();
        if (listForceRefresh.isEmpty()) {
            str2 = "All API IPs failed and seed refresh returned no IPs";
        } else {
            String strTryRequest2 = tryRequest(listForceRefresh, str, z);
            if (strTryRequest2 != null) {
                postSuccess(stringCallback, strTryRequest2);
                return;
            }
            str2 = "All API IPs failed after seed refresh";
        }
        postFailure(stringCallback, str2);
    }

    private static HttpURLConnection openSmartConnection(String str) throws NoSuchAlgorithmException, KeyManagementException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            applyTrustAll((HttpsURLConnection) httpURLConnection);
        }
        return httpURLConnection;
    }

    private void postFailure(StringCallback stringCallback, String str) {
        this.mainHandler.post(new a(stringCallback, str, 0));
    }

    private void postSuccess(StringCallback stringCallback, String str) {
        this.mainHandler.post(new a(stringCallback, str, 1));
    }

    private String tryRequest(List<String> list, String str, boolean z) {
        for (String str2 : list) {
            try {
                String strBuildUrl = buildUrl(str2, str);
                LogUtils.d(TAG, "%s %s", z ? "POST" : "GET", strBuildUrl);
                HttpURLConnection httpURLConnectionOpenSmartConnection = openSmartConnection(strBuildUrl);
                httpURLConnectionOpenSmartConnection.setConnectTimeout(10000);
                httpURLConnectionOpenSmartConnection.setReadTimeout(10000);
                httpURLConnectionOpenSmartConnection.setRequestMethod(z ? "POST" : "GET");
                if (z) {
                    httpURLConnectionOpenSmartConnection.setDoOutput(true);
                    httpURLConnectionOpenSmartConnection.getOutputStream().close();
                }
                int responseCode = httpURLConnectionOpenSmartConnection.getResponseCode();
                if (responseCode >= 500) {
                    LogUtils.w(TAG, "API IP %s returned HTTP %d, trying next", str2, Integer.valueOf(responseCode));
                    httpURLConnectionOpenSmartConnection.disconnect();
                } else {
                    if (responseCode != 200) {
                        LogUtils.w(TAG, "API IP %s returned HTTP %d (no retry)", str2, Integer.valueOf(responseCode));
                        httpURLConnectionOpenSmartConnection.disconnect();
                        return null;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionOpenSmartConnection.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    httpURLConnectionOpenSmartConnection.disconnect();
                    String strTrim = sb.toString().trim();
                    if (!strTrim.isEmpty()) {
                        this.lastSuccessfulApiIp = str2;
                        LogUtils.d(TAG, "Success from API IP %s", str2);
                        return strTrim;
                    }
                    LogUtils.w(TAG, "API IP %s returned empty body, trying next", str2);
                }
            } catch (Exception e) {
                LogUtils.e(TAG, "Request to %s failed: %s", str2, e.getMessage());
            }
        }
        return null;
    }

    public void executeGet(String str, StringCallback stringCallback) {
        execute(str, false, stringCallback);
    }

    public void executePost(String str, StringCallback stringCallback) {
        execute(str, true, stringCallback);
    }

    public List<String> getCachedApiIps() {
        ArrayList arrayList;
        synchronized (this.cacheLock) {
            arrayList = new ArrayList(this.cachedApiIps);
        }
        return arrayList;
    }

    public String getLastSuccessfulApiIp() {
        return this.lastSuccessfulApiIp;
    }

    public String getLastSuccessfulSeedIp() {
        return this.lastSuccessfulSeedIp;
    }

    public boolean isCacheFresh() {
        boolean z;
        synchronized (this.cacheLock) {
            try {
                z = !this.cachedApiIps.isEmpty() && System.currentTimeMillis() - this.lastRefreshMs < CACHE_TTL_MS;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public SeedDiscovery(List<String> list) {
        this(list, null);
    }
}
