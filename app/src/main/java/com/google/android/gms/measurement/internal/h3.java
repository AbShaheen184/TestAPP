package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ r4 y;
    public final /* synthetic */ m3 z;

    public h3(m3 m3Var, r4 r4Var) {
        this.e = 4;
        this.y = r4Var;
        Objects.requireNonNull(m3Var);
        this.z = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.e) {
            case 0:
                m3 m3Var = this.z;
                i0 i0Var = m3Var.A;
                p1 p1Var = (p1) m3Var.e;
                if (i0Var != null) {
                    try {
                        i0Var.l(this.y);
                    } catch (RemoteException e) {
                        u0 u0Var = p1Var.C;
                        p1.m(u0Var);
                        u0Var.C.b(e, "Failed to reset data on the service: remote exception");
                    }
                    m3Var.I();
                } else {
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                m3 m3Var2 = this.z;
                i0 i0Var2 = m3Var2.A;
                p1 p1Var2 = (p1) m3Var2.e;
                if (i0Var2 == null) {
                    u0 u0Var3 = p1Var2.C;
                    p1.m(u0Var3);
                    u0Var3.C.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        r4 r4Var = this.y;
                        g gVar = p1Var2.A;
                        e0 e0Var = f0.W0;
                        if (gVar.G(null, e0Var)) {
                            m3Var2.N(i0Var2, null, r4Var);
                        }
                        i0Var2.x(r4Var);
                        p1Var2.o().A();
                        p1Var2.A.G(null, e0Var);
                        m3Var2.N(i0Var2, null, r4Var);
                        m3Var2.I();
                    } catch (RemoteException e2) {
                        u0 u0Var4 = p1Var2.C;
                        p1.m(u0Var4);
                        u0Var4.C.b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                m3 m3Var3 = this.z;
                i0 i0Var3 = m3Var3.A;
                p1 p1Var3 = (p1) m3Var3.e;
                if (i0Var3 == null) {
                    u0 u0Var5 = p1Var3.C;
                    p1.m(u0Var5);
                    u0Var5.F.a("Failed to send app backgrounded");
                } else {
                    try {
                        i0Var3.z(this.y);
                        m3Var3.I();
                    } catch (RemoteException e3) {
                        u0 u0Var6 = p1Var3.C;
                        p1.m(u0Var6);
                        u0Var6.C.b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                m3 m3Var4 = this.z;
                i0 i0Var4 = m3Var4.A;
                p1 p1Var4 = (p1) m3Var4.e;
                if (i0Var4 == null) {
                    u0 u0Var7 = p1Var4.C;
                    p1.m(u0Var7);
                    u0Var7.C.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        i0Var4.q(this.y);
                        m3Var4.I();
                    } catch (RemoteException e4) {
                        u0 u0Var8 = p1Var4.C;
                        p1.m(u0Var8);
                        u0Var8.C.b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                m3 m3Var5 = this.z;
                i0 i0Var5 = m3Var5.A;
                p1 p1Var5 = (p1) m3Var5.e;
                if (i0Var5 == null) {
                    u0 u0Var9 = p1Var5.C;
                    p1.m(u0Var9);
                    u0Var9.C.a("Failed to send consent settings to service");
                } else {
                    try {
                        i0Var5.G(this.y);
                        m3Var5.I();
                    } catch (RemoteException e5) {
                        u0 u0Var10 = p1Var5.C;
                        p1.m(u0Var10);
                        u0Var10.C.b(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ h3(m3 m3Var, r4 r4Var, int i) {
        this.e = i;
        this.y = r4Var;
        this.z = m3Var;
    }
}
