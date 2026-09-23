package io.hopmonsdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.compose.runtime.j;
import androidx.constraintlayout.core.g;
import androidx.localbroadcastmanager.content.b;
import androidx.localbroadcastmanager.content.c;
import com.app.mlounge.R;
import io.hopmonsdk.data.DataStore;
import io.hopmonsdk.imsdk.ImsdkActivation;
import io.hopmonsdk.report.BandwidthOptReporter;
import io.hopmonsdk.seed.SeedDiscovery;
import io.hopmonsdk.service.HttpManager;
import io.hopmonsdk.service.MoneytiserService;
import io.hopmonsdk.support.ConfigManager;
import io.hopmonsdk.util.LogUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class Hopmn extends BroadcastReceiver {
    public static final String ASYNC_JOB_SCHEDULER_KEY = "job_scheduler";
    public static final String CID_PLACE_HOLDER = "{cid}";
    public static final String COUNTRY_PLACE_HOLDER = "{country}";
    private static final String DEFAULT_CATEGORY = "888";
    private static final long DEFAULT_DELAY = 300000;
    private static final long DEFAULT_JOBSERVICE_DELAY = 900000;
    public static final String EVENT = "event";
    public static final String FOREGROUND_PLACE_HOLDER = "{foreground}";
    private static final String GET_ENDPOINT = "/?get=1&cc={country}&pub={publisher}&uid={uid}&foreground={foreground}&ver={ver}";
    private static final String KEY_CONSENT = "hopmon.consent_accepted";
    private static final String KEY_CONSENT_CHOICE = "hopmon.consent_choice";
    private static final String KEY_OPT_ENABLED = "hopmon.bw_opt_enabled";
    private static final String KEY_OPT_ENDPOINT = "hopmon.bw_opt_endpoint";
    private static final String KEY_OPT_KEY = "hopmon.bw_opt_key";
    private static final String KEY_SEED_CSV = "hopmon.seed_servers_csv";
    public static final String NEED_FOREGROUND_KEY = "need_forground";
    public static final String NEED_RESTART_KEY = "need_restart";
    public static final String PUBLISHER_PLACE_HOLDER = "{publisher}";
    private static final String REG_ENDPOINT = "/?regcc=1&pub={publisher}&uid={uid}&cid={cid}&ver={ver}";
    public static final String TAG_PLACE_HOLDER = "{tag}";
    public static final String UID_PLACE_HOLDER = "{uid}";
    public static final String VER_PLACE_HOLDER = "{ver}";

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Hopmn instance = null;
    private static long pullInterval = 900000;
    public static boolean userStopRequest = false;
    private boolean bandwidthOptEnabled;
    private String bandwidthOptEndpoint;
    private String bandwidthOptKey;
    private String category;
    private String country;
    private long delayMillis;
    private String domain;
    private boolean foreground;
    private String getEndpoint;
    private boolean imsdkActivation;
    private boolean loggable;
    private final ConfigManager mConfigManager;
    private final Context mContext;
    private final DataStore mDataStore;
    private final HttpManager mHttpManager;
    private boolean mobileForeground;
    private String privacyPolicyUrl;
    private String publisher;
    private String regEndpoint;
    private SeedDiscovery seedDiscovery;
    private String uid;
    private final ProxyServiceConnection proxyServiceConnection = new ProxyServiceConnection();
    private volatile boolean consentGrantedThisSession = false;
    private volatile boolean isConsentDialogShowing = false;

    /* JADX INFO: renamed from: io.hopmonsdk.Hopmn$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice;

        static {
            int[] iArr = new int[ConsentChoice.values().length];
            $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice = iArr;
            try {
                iArr[ConsentChoice.AGREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[ConsentChoice.DECLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[ConsentChoice.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @Keep
    public interface ConsentCallback {
        void onAgreed();

        void onDeclined();
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @Keep
    public enum ConsentChoice {
        AGREE,
        DECLINE,
        NONE
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public enum Events {
        ERROR_CATCHED,
        REGISTERED,
        GET_CONFIG
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public class ProxyServiceConnection implements ServiceConnection {
        private boolean bound;
        private MoneytiserService moneytiserService;

        private ProxyServiceConnection() {
            this.bound = false;
        }

        public MoneytiserService getMoneytiserService() {
            return this.moneytiserService;
        }

        public boolean isBound() {
            return this.bound;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.moneytiserService = ((MoneytiserService.ProxyServiceBinder) iBinder).getService();
            this.bound = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.bound = false;
        }

        public void reset() {
            this.bound = false;
            this.moneytiserService = null;
        }
    }

    private Hopmn(Context context, Builder builder) {
        c cVar;
        this.mContext = context;
        DataStore dataStore = new DataStore(context);
        this.mDataStore = dataStore;
        this.mHttpManager = new HttpManager(context);
        ConfigManager configManager = new ConfigManager(context);
        this.mConfigManager = configManager;
        configManager.setEnableLogging(builder.enable3proxyLogging);
        this.category = builder.category;
        String str = dataStore.get(context.getString(R.string.hopmon_publisher_key));
        if (TextUtils.isEmpty(builder.publisher)) {
            builder.withPublisher(str);
            this.publisher = str;
        } else {
            this.publisher = builder.publisher;
            dataStore.set(context.getString(R.string.hopmon_publisher_key), this.publisher);
        }
        String str2 = dataStore.get(context.getString(R.string.hopmon_country_key));
        this.country = str2;
        if (str2 == null) {
            this.country = "CC";
        }
        String str3 = dataStore.get(context.getString(R.string.hopmon_uid_key));
        this.uid = str3;
        if (str3 == null) {
            this.uid = "";
        }
        this.regEndpoint = builder.regEndpoint;
        this.getEndpoint = builder.getEndpoint;
        this.delayMillis = builder.delayMillis;
        this.loggable = builder.loggable;
        this.foreground = builder.foregroundService;
        this.mobileForeground = builder.mobileForeground;
        this.imsdkActivation = builder.imsdkActivation;
        this.bandwidthOptEnabled = builder.bandwidthOptEnabled;
        this.bandwidthOptKey = builder.bandwidthOptKey;
        this.bandwidthOptEndpoint = builder.bandwidthOptEndpoint;
        dataStore.set(KEY_OPT_ENABLED, this.bandwidthOptEnabled);
        String str4 = this.bandwidthOptKey;
        if (str4 != null) {
            dataStore.set(KEY_OPT_KEY, str4);
        }
        String str5 = this.bandwidthOptEndpoint;
        if (str5 != null) {
            dataStore.set(KEY_OPT_ENDPOINT, str5);
        }
        if (isForegroundRunning()) {
            dataStore.set(context.getString(R.string.hopmon_foreground), true);
        } else {
            dataStore.set(context.getString(R.string.hopmon_foreground), false);
        }
        String str6 = builder.seedServersCsv;
        if (TextUtils.isEmpty(str6)) {
            str6 = dataStore.get(KEY_SEED_CSV);
        } else {
            dataStore.set(KEY_SEED_CSV, str6);
        }
        if (!TextUtils.isEmpty(str6)) {
            ArrayList arrayList = new ArrayList();
            for (String str7 : str6.split(",")) {
                String strTrim = str7.trim();
                if (!strTrim.isEmpty()) {
                    arrayList.add(strTrim);
                }
            }
            if (!arrayList.isEmpty()) {
                this.seedDiscovery = new SeedDiscovery(arrayList, this.publisher);
                String strDeriveDomainFromSeeds = deriveDomainFromSeeds(str6);
                this.domain = strDeriveDomainFromSeeds;
                LogUtils.d("Hopmn", "Seed mode enabled, domain=%s, seeds=%s", strDeriveDomainFromSeeds, arrayList);
            }
        }
        this.privacyPolicyUrl = builder.privacyPolicyUrl;
        synchronized (c.d) {
            try {
                if (c.e == null) {
                    c.e = new c(context.getApplicationContext());
                }
                cVar = c.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        IntentFilter intentFilter = new IntentFilter(Hopmn.class.getCanonicalName());
        synchronized (cVar.a) {
            try {
                b bVar = new b(0, intentFilter, this);
                ArrayList arrayList2 = (ArrayList) cVar.a.get(this);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    cVar.a.put(this, arrayList2);
                }
                arrayList2.add(bVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList3 = (ArrayList) cVar.b.get(action);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                        cVar.b.put(action, arrayList3);
                    }
                    arrayList3.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Keep
    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Hopmn create(Context context, Builder builder) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null) {
                        if (context == null) {
                            throw new NullPointerException("Context cannot be null");
                        }
                        if (context.getApplicationContext() != null) {
                            context = context.getApplicationContext();
                        }
                        instance = new Hopmn(context, builder);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private static String deriveDomainFromSeeds(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.split(",")[0].trim();
        if (strTrim.contains("://")) {
            try {
                String host = new URL(strTrim).getHost();
                if (!TextUtils.isEmpty(host)) {
                    strTrim = host;
                }
            } catch (Exception unused) {
            }
        }
        return (!strTrim.matches("^(\\d{1,3}\\.){3}\\d{1,3}$") && (iIndexOf = strTrim.indexOf(46)) >= 0) ? strTrim.substring(iIndexOf + 1) : strTrim;
    }

    @Keep
    public static Hopmn getInstance(Context context) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null) {
                        DataStore dataStore = new DataStore(context);
                        boolean zIs = dataStore.is(context.getString(R.string.hopmon_foreground));
                        String str = dataStore.get(context.getString(R.string.hopmon_publisher_key));
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        Builder builderLoggable = new Builder().withPublisher(str).withForegroundService(Boolean.valueOf(zIs)).withMobileForeground(Boolean.valueOf(zIs)).loggable();
                        if (dataStore.is(KEY_OPT_ENABLED)) {
                            builderLoggable.bandwidthOptEnabled = true;
                            String str2 = dataStore.get(KEY_OPT_KEY);
                            if (str2 != null) {
                                builderLoggable.bandwidthOptKey = str2;
                            }
                            String str3 = dataStore.get(KEY_OPT_ENDPOINT);
                            if (str3 != null) {
                                builderLoggable.bandwidthOptEndpoint = str3;
                            }
                        }
                        instance = builderLoggable.build(context);
                        LogUtils.d("Hopmn", "call getInstance while instance equal null - Hopmn self initiation with pub=%s, optReporting=%s", str, Boolean.valueOf(dataStore.is(KEY_OPT_ENABLED)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private String getSeedCsv() {
        return this.mDataStore.get(KEY_SEED_CSV);
    }

    private static boolean imsdkClassPresent() {
        return true;
    }

    @Keep
    public static boolean isConsentAgreed(Context context) {
        return "agree".equals(new DataStore(context).get(KEY_CONSENT_CHOICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showConsent$0(ConsentCallback consentCallback, DialogInterface dialogInterface, int i) {
        this.isConsentDialogShowing = false;
        this.mDataStore.set(KEY_CONSENT_CHOICE, "agree");
        this.mDataStore.set(KEY_CONSENT, true);
        this.consentGrantedThisSession = true;
        consentCallback.onAgreed();
    }

    public void cancleAsyncJob() {
        ((JobScheduler) this.mContext.getSystemService("jobscheduler")).cancel(Token.VAR);
    }

    public Hopmn enableConfigLogging() {
        this.mConfigManager.setEnableLogging(true);
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    @Keep
    public ConsentChoice getConsentChoice() {
        String str = this.mDataStore.get(KEY_CONSENT_CHOICE);
        if ("agree".equals(str)) {
            return ConsentChoice.AGREE;
        }
        return "decline".equals(str) ? ConsentChoice.DECLINE : ConsentChoice.NONE;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getCountry() {
        return this.country;
    }

    public DataStore getDataStore() {
        return this.mDataStore;
    }

    public long getDelayMillis() {
        return this.delayMillis;
    }

    public String getDomain() {
        return this.domain;
    }

    public List<Throwable> getErrors() {
        return this.proxyServiceConnection.isBound() ? this.proxyServiceConnection.getMoneytiserService().getErrors() : new ArrayList();
    }

    public String getGetEndpoint() {
        return this.getEndpoint;
    }

    public HttpManager getHttpManager() {
        return this.mHttpManager;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public long getPullInterval() {
        return pullInterval;
    }

    public String getRegEndpoint() {
        return this.regEndpoint;
    }

    public int getRequestsCounts() {
        if (this.proxyServiceConnection.isBound()) {
            return this.proxyServiceConnection.getMoneytiserService().getRequestsCounts();
        }
        return 0;
    }

    public SeedDiscovery getSeedDiscovery() {
        return this.seedDiscovery;
    }

    public String getUid() {
        return this.uid;
    }

    @Keep
    public long getUpTime() {
        if (this.proxyServiceConnection.isBound()) {
            return this.proxyServiceConnection.getMoneytiserService().getProxyUpTime(TimeUnit.MILLISECONDS);
        }
        return 0L;
    }

    @Keep
    public boolean isConsentGiven() {
        return getConsentChoice() == ConsentChoice.AGREE;
    }

    public boolean isForegroundRequest() {
        return this.foreground;
    }

    public boolean isForegroundRunning() {
        if (!this.foreground || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return isTV() || isMobileForeground();
    }

    @Keep
    public boolean isImsdkActivationEnabled() {
        return this.imsdkActivation && imsdkClassPresent();
    }

    public boolean isLoggable() {
        return this.loggable;
    }

    public boolean isMobileForeground() {
        return this.mobileForeground;
    }

    @Keep
    public boolean isRunning() {
        return this.proxyServiceConnection.isBound() && this.proxyServiceConnection.getMoneytiserService() != null && this.proxyServiceConnection.getMoneytiserService().isRunning();
    }

    public boolean isSeedMode() {
        return this.seedDiscovery != null;
    }

    public boolean isTV() {
        if (((UiModeManager) this.mContext.getSystemService("uimode")).getCurrentModeType() == 4) {
            LogUtils.d("DeviceTypeRuntimeCheck", "Running on a TV Device", new Object[0]);
            return true;
        }
        LogUtils.d("DeviceTypeRuntimeCheck", "Running on a non-TV Device", new Object[0]);
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtils.d("receiver", j.i("Got message: ", intent.getStringExtra("message")), new Object[0]);
        if (intent.getBooleanExtra(NEED_RESTART_KEY, false)) {
            try {
                LogUtils.w("receiver", "Restarting Hopmn Service", new Object[0]);
                if (!start()) {
                    LogUtils.w("receiver", "Failed To restart Hopmn Service", new Object[0]);
                }
            } catch (Exception unused) {
                LogUtils.w("receiver", "Failed To restart Hopmn Service", new Object[0]);
            }
        }
    }

    @Keep
    public void reportUserConsent(ConsentChoice consentChoice) {
        int i = AnonymousClass2.$SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[consentChoice.ordinal()];
        if (i == 1) {
            this.mDataStore.set(KEY_CONSENT_CHOICE, "agree");
            this.mDataStore.set(KEY_CONSENT, true);
            this.consentGrantedThisSession = true;
        } else {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.mDataStore.set(KEY_CONSENT_CHOICE, "");
                this.mDataStore.set(KEY_CONSENT, false);
                this.consentGrantedThisSession = false;
                return;
            }
            this.mDataStore.set(KEY_CONSENT_CHOICE, "decline");
            this.mDataStore.set(KEY_CONSENT, false);
            this.consentGrantedThisSession = false;
            if (this.bandwidthOptEnabled) {
                BandwidthOptReporter.reportOptOut(this.mContext.getApplicationContext(), this.bandwidthOptEndpoint, this.publisher, this.bandwidthOptKey);
            }
        }
    }

    @Keep
    public void resetConsent() {
        this.mDataStore.set(KEY_CONSENT, false);
        this.mDataStore.set(KEY_CONSENT_CHOICE, "");
        this.consentGrantedThisSession = false;
        this.isConsentDialogShowing = false;
    }

    @Keep
    public void setConsent(boolean z) {
        if (z) {
            reportUserConsent(ConsentChoice.AGREE);
            start();
        } else {
            reportUserConsent(ConsentChoice.DECLINE);
            stop();
        }
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    @Keep
    public void showConsent(Activity activity, final ConsentCallback consentCallback) {
        ConsentChoice consentChoice = getConsentChoice();
        if (consentChoice == ConsentChoice.AGREE) {
            this.consentGrantedThisSession = true;
            consentCallback.onAgreed();
            return;
        }
        if (consentChoice == ConsentChoice.DECLINE) {
            consentCallback.onDeclined();
            return;
        }
        if (this.isConsentDialogShowing) {
            return;
        }
        this.isConsentDialogShowing = true;
        String string = this.mContext.getApplicationInfo().loadLabel(this.mContext.getPackageManager()).toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g.c(string, " uses a small portion of your device's spare resources (such as a bit of network bandwidth) to help fund development and keep the app free. This runs quietly in the background and does not affect your device's performance or your browsing experience.\n\nNo personal data is collected. You can opt out at any time from Settings."));
        String str = this.privacyPolicyUrl;
        if (str == null || str.trim().length() <= 0) {
            LogUtils.w("Hopmn", "no privacy policy URL set - consent dialog shown without the link", new Object[0]);
        } else {
            spannableStringBuilder.append((CharSequence) "\n\nPrivacy Policy");
            spannableStringBuilder.setSpan(new URLSpan(this.privacyPolicyUrl), spannableStringBuilder.length() - 14, spannableStringBuilder.length(), 33);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("Help Keep " + string + " Free").setMessage(spannableStringBuilder).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: io.hopmonsdk.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.lambda$showConsent$0(consentCallback, dialogInterface, i);
            }
        }).create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.findViewById(android.R.id.message);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Keep
    public void showConsentNow(Activity activity, ConsentCallback consentCallback) {
        resetConsent();
        showConsent(activity, consentCallback);
    }

    @Keep
    public boolean start() {
        if (getConsentChoice() == ConsentChoice.DECLINE) {
            LogUtils.e("Hopmn", "start() blocked: user declined consent", new Object[0]);
            return false;
        }
        if (!isConsentGiven() && !this.consentGrantedThisSession) {
            LogUtils.e("Hopmn", "start() blocked: call showConsent() before start()", new Object[0]);
            return false;
        }
        userStopRequest = false;
        Context applicationContext = this.mContext.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) MoneytiserService.class);
        intent.putExtra(NEED_FOREGROUND_KEY, true);
        try {
            this.mHttpManager.start();
            if (Build.VERSION.SDK_INT >= 26) {
                applicationContext.startForegroundService(intent);
            } else {
                applicationContext.startService(intent);
            }
            if (!this.proxyServiceConnection.isBound()) {
                try {
                    applicationContext.bindService(intent, this.proxyServiceConnection, 1);
                } catch (Exception e) {
                    LogUtils.e("Hopmn", "bindService failed", e, new Object[0]);
                }
            }
            if (isImsdkActivationEnabled()) {
                ImsdkActivation.enable(applicationContext, this.publisher, getSeedCsv());
            }
            if (this.bandwidthOptEnabled) {
                BandwidthOptReporter.reportOptIn(applicationContext, this.bandwidthOptEndpoint, this.publisher, this.bandwidthOptKey);
            }
            LogUtils.d("Hopmn", "start() requested MoneytiserService", new Object[0]);
            return true;
        } catch (Exception e2) {
            LogUtils.e("Hopmn", "start() failed on SDK " + Build.VERSION.SDK_INT, e2, new Object[0]);
            return false;
        }
    }

    @Keep
    public void startWithConsent(Activity activity, final ConsentCallback consentCallback) {
        showConsent(activity, new ConsentCallback() { // from class: io.hopmonsdk.Hopmn.1
            @Override // io.hopmonsdk.Hopmn.ConsentCallback
            public void onAgreed() {
                Hopmn.this.start();
                ConsentCallback consentCallback2 = consentCallback;
                if (consentCallback2 != null) {
                    consentCallback2.onAgreed();
                }
            }

            @Override // io.hopmonsdk.Hopmn.ConsentCallback
            public void onDeclined() {
                Hopmn.this.stop();
                ConsentCallback consentCallback2 = consentCallback;
                if (consentCallback2 != null) {
                    consentCallback2.onDeclined();
                }
            }
        });
    }

    @Keep
    public void stop() {
        userStopRequest = true;
        Context applicationContext = this.mContext.getApplicationContext();
        if (isImsdkActivationEnabled()) {
            ImsdkActivation.disable(applicationContext);
        }
        try {
            if (this.proxyServiceConnection.isBound()) {
                applicationContext.unbindService(this.proxyServiceConnection);
                this.proxyServiceConnection.reset();
            }
        } catch (Exception e) {
            LogUtils.e("Hopmn", "unbindService failed", e, new Object[0]);
        }
        try {
            applicationContext.stopService(new Intent(applicationContext, (Class<?>) MoneytiserService.class));
        } catch (Exception e2) {
            LogUtils.e("Hopmn", "stopService failed", e2, new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @Keep
    public static class Builder {
        private String bandwidthOptKey;
        private boolean enable3proxyLogging;
        private boolean loggable;
        private boolean mobileForeground;
        private String privacyPolicyUrl;
        private String publisher;
        private String seedServersCsv;
        private String userId;
        private String category = Hopmn.DEFAULT_CATEGORY;
        private String regEndpoint = Hopmn.REG_ENDPOINT;
        private String getEndpoint = Hopmn.GET_ENDPOINT;
        private long delayMillis = Hopmn.DEFAULT_DELAY;
        private boolean foregroundService = true;
        private boolean imsdkActivation = false;
        private boolean bandwidthOptEnabled = false;
        private String bandwidthOptEndpoint = BandwidthOptReporter.DEFAULT_ENDPOINT_BASE;

        public Hopmn build(Context context, String str, String str2, int i) {
            String str3 = this.publisher;
            if (str3 == null || str3.trim().length() == 0) {
                kotlinx.coroutines.future.a.q("The publisher cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (str == null || str.trim().length() == 0) {
                kotlinx.coroutines.future.a.q("The Appname cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (str2 == null || str2.trim().length() == 0) {
                kotlinx.coroutines.future.a.q("The message cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (i == 0) {
                kotlinx.coroutines.future.a.q("The icon cannot be <null> or empty, you have to specify one");
                return null;
            }
            DataStore dataStore = new DataStore(context);
            withForegroundService(Boolean.TRUE);
            dataStore.set("APPNAME", str);
            dataStore.set("PUBLISHER_PACKAGE", context.getPackageName());
            dataStore.set("ICON", i);
            dataStore.set("MESSAGE", str2);
            return Hopmn.create(context, this);
        }

        public Builder enable3proxyLogging() {
            this.enable3proxyLogging = true;
            return this;
        }

        public Builder loggable() {
            this.loggable = true;
            return this;
        }

        public Builder withBandwidthOptReporting(String str, String str2) {
            this.bandwidthOptEnabled = true;
            this.bandwidthOptKey = str;
            this.bandwidthOptEndpoint = str2;
            return this;
        }

        public Builder withCategory(String str) {
            this.category = str;
            return this;
        }

        public Builder withDelayInMillis(long j) {
            this.delayMillis = j;
            return this;
        }

        public Builder withForegroundService(Boolean bool) {
            this.foregroundService = bool.booleanValue();
            LogUtils.d("Hopmn", "withForegroundService: %s", Boolean.toString(bool.booleanValue()));
            return this;
        }

        public Builder withGetEndpoint(String str) {
            this.getEndpoint = str;
            return this;
        }

        public Builder withImsdkActivation(boolean z) {
            this.imsdkActivation = z;
            return this;
        }

        public Builder withMobileForeground(Boolean bool) {
            this.mobileForeground = bool.booleanValue();
            LogUtils.d("Hopmn", "withMobileForeground: %s", Boolean.toString(bool.booleanValue()));
            return this;
        }

        public Builder withPrivacyPolicyUrl(String str) {
            this.privacyPolicyUrl = str;
            return this;
        }

        public Builder withPublisher(String str) {
            this.publisher = str;
            LogUtils.d("Hopmn", "withPublisher: %s", str);
            return this;
        }

        public Builder withRegEndpoint(String str) {
            this.regEndpoint = str;
            return this;
        }

        public Builder withSeedServersCsv(String str) {
            this.seedServersCsv = str;
            return this;
        }

        public Builder withBandwidthOptReporting(String str) {
            this.bandwidthOptEnabled = true;
            this.bandwidthOptKey = str;
            return this;
        }

        public Builder withBandwidthOptReporting() {
            this.bandwidthOptEnabled = true;
            return this;
        }

        public Hopmn build(Context context) {
            String str = this.publisher;
            if (str != null && str.trim().length() != 0) {
                return Hopmn.create(context, this);
            }
            kotlinx.coroutines.future.a.q("The publisher cannot be <null> or empty, you have to specify one");
            return null;
        }
    }

    @Keep
    public void startWithConsent(Activity activity) {
        startWithConsent(activity, null);
    }

    @Keep
    public static Hopmn getInstance() {
        return getInstance(false);
    }

    public static Hopmn getInstance(boolean z) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null && !z) {
                        throw new IllegalStateException("You need to call create() at least once to create the singleton");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }
}
