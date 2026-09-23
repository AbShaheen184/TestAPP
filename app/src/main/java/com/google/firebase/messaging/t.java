package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {
    public static final Object C = new Object();
    public static Boolean D;
    public static Boolean E;
    public final r A;
    public final long B;
    public final Context e;
    public final androidx.compose.runtime.snapshots.j y;
    public final PowerManager.WakeLock z;

    public t(r rVar, Context context, androidx.compose.runtime.snapshots.j jVar, long j) {
        this.A = rVar;
        this.e = context;
        this.B = j;
        this.y = jVar;
        this.z = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (C) {
            try {
                Boolean bool = E;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                E = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (C) {
            try {
                Boolean bool = D;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                D = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.e.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.A;
        Context context = this.e;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.z;
        if (zC) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    rVar.d(true);
                    if (!this.y.e()) {
                        rVar.d(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (rVar.e()) {
                            rVar.d(false);
                        } else {
                            rVar.f(this.B);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new s(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    rVar.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
