package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class bd implements dd {
    public static boolean d;
    public final com.google.common.base.q a;
    public final int b;
    public final f1 c;

    public bd(com.google.common.base.q qVar) {
        f1 f1Var = f1.D;
        this.a = qVar;
        this.b = Math.max(5, 10);
        this.c = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void a() {
        synchronized (bd.class) {
            try {
                if (!d) {
                    vc vcVar = new vc(this, 3);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    com.google.common.util.concurrent.v0 v0Var = (com.google.common.util.concurrent.v0) this.a.get();
                    ad adVar = new ad(this, vcVar, v0Var, j);
                    v0Var.getClass();
                    com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0(Executors.callable(adVar, null));
                    com.google.common.util.concurrent.t0 t0Var = new com.google.common.util.concurrent.t0(z0Var, v0Var.y.schedule(z0Var, j, timeUnit));
                    t0Var.a(new vc(t0Var, 1), com.google.common.util.concurrent.d0.e);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
