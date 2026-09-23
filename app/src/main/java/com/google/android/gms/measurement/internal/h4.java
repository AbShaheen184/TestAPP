package com.google.android.gms.measurement.internal;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 {
    public final String a;
    public final long b;

    public h4(j4 j4Var, String str) {
        this.a = str;
        j4Var.c().getClass();
        this.b = SystemClock.elapsedRealtime();
    }
}
