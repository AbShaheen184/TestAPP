package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static volatile com.google.android.gms.internal.base.g d;
    public final y1 a;
    public final com.google.common.util.concurrent.k0 b;
    public volatile long c;

    public n(y1 y1Var) {
        com.google.android.gms.common.internal.x.g(y1Var);
        this.a = y1Var;
        this.b = new com.google.common.util.concurrent.k0(12, this, y1Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            y1 y1Var = this.a;
            y1Var.c().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            y1Var.b().C.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        com.google.android.gms.internal.base.g gVar;
        if (d != null) {
            return d;
        }
        synchronized (n.class) {
            try {
                if (d == null) {
                    d = new com.google.android.gms.internal.base.g(this.a.f().getMainLooper(), 3);
                }
                gVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
