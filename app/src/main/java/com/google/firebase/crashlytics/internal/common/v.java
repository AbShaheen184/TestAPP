package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.foundation.s0;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final androidx.media3.container.a a;
    public final Context b;
    public final String c;
    public final com.google.firebase.installations.d d;
    public final com.google.android.gms.common.api.internal.m e;
    public c f;

    public v(Context context, String str, com.google.firebase.installations.d dVar, com.google.android.gms.common.api.internal.m mVar) {
        if (context == null) {
            kotlinx.coroutines.future.a.q("appContext must not be null");
            throw null;
        }
        if (str == null) {
            kotlinx.coroutines.future.a.q("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = mVar;
        this.a = new androidx.media3.container.a();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final u b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new s0(0, com.google.firebase.crashlytics.internal.concurrency.d.d, com.google.firebase.crashlytics.internal.concurrency.c.class, "isNotMainThread", "isNotMainThread()Z", 0, 14).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.google.firebase.installations.d dVar = this.d;
        if (z) {
            try {
                str = ((com.google.firebase.installations.a) org.jsoup.helper.n.g(((com.google.firebase.installations.c) dVar).d(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) org.jsoup.helper.n.g(((com.google.firebase.installations.c) dVar).c(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new u(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.b != null || !this.e.a())) {
            return this.f;
        }
        com.google.firebase.crashlytics.internal.b bVar = com.google.firebase.crashlytics.internal.b.a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            u uVarB = b(false);
            bVar.c("Fetched Firebase Installation ID: " + uVarB.a);
            if (uVarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                uVarB = new u(str, null);
            }
            if (Objects.equals(uVarB.a, string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), uVarB.a, uVarB.b);
            } else {
                this.f = new c(a(sharedPreferences, uVarB.a), uVarB.a, uVarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        bVar.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        androidx.media3.container.a aVar = this.a;
        Context context = this.b;
        synchronized (aVar) {
            try {
                if (aVar.e == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.e = installerPackageName;
                }
                str = "".equals(aVar.e) ? null : aVar.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
