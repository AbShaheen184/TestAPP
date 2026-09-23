package com.google.android.gms.measurement.internal;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ i0 y;
    public final /* synthetic */ l3 z;

    public /* synthetic */ j3(l3 l3Var, i0 i0Var, int i) {
        this.e = i;
        this.y = i0Var;
        this.z = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                l3 l3Var = this.z;
                synchronized (l3Var) {
                    try {
                        l3Var.e = false;
                        m3 m3Var = l3Var.z;
                        if (!m3Var.M()) {
                            u0 u0Var = ((p1) m3Var.e).C;
                            p1.m(u0Var);
                            u0Var.K.a("Connected to service");
                            i0 i0Var = this.y;
                            m3Var.v();
                            m3Var.A = i0Var;
                            m3Var.I();
                            m3Var.K();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                l3 l3Var2 = this.z;
                synchronized (l3Var2) {
                    try {
                        l3Var2.e = false;
                        m3 m3Var2 = l3Var2.z;
                        if (!m3Var2.M()) {
                            u0 u0Var2 = ((p1) m3Var2.e).C;
                            p1.m(u0Var2);
                            u0Var2.J.a("Connected to remote service");
                            i0 i0Var2 = this.y;
                            m3Var2.v();
                            m3Var2.A = i0Var2;
                            m3Var2.I();
                            m3Var2.K();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                m3 m3Var3 = this.z.z;
                ScheduledExecutorService scheduledExecutorService = m3Var3.D;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    m3Var3.D = null;
                    return;
                }
                return;
        }
    }
}
