package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tf {
    public static final androidx.room.t a;

    static {
        sf sfVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            sfVar = new sf(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            sfVar = new sf(1);
        }
        a = sfVar;
    }
}
