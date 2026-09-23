package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ m3 y;

    public /* synthetic */ k3(m3 m3Var, int i) {
        this.e = i;
        this.y = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.B();
                break;
            case 1:
                m3 m3Var = this.y;
                p1 p1Var = (p1) m3Var.e;
                i0 i0Var = m3Var.A;
                if (i0Var == null) {
                    u0 u0Var = p1Var.C;
                    p1.m(u0Var);
                    u0Var.C.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        i0Var.r(m3Var.L(false));
                        m3Var.I();
                    } catch (RemoteException e) {
                        u0 u0Var2 = p1Var.C;
                        p1.m(u0Var2);
                        u0Var2.C.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                m3 m3Var2 = this.y;
                p1 p1Var2 = (p1) m3Var2.e;
                i0 i0Var2 = m3Var2.A;
                if (i0Var2 == null) {
                    u0 u0Var3 = p1Var2.C;
                    p1.m(u0Var3);
                    u0Var3.C.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        i0Var2.o(m3Var2.L(false));
                        m3Var2.I();
                    } catch (RemoteException e2) {
                        u0 u0Var4 = p1Var2.C;
                        p1.m(u0Var4);
                        u0Var4.C.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
