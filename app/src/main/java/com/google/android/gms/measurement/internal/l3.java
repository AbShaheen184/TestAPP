package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements ServiceConnection, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    public volatile boolean e;
    public volatile r0 y;
    public final /* synthetic */ m3 z;

    public l3(m3 m3Var) {
        this.z = m3Var;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void a(int i) {
        p1 p1Var = (p1) this.z.e;
        m1 m1Var = p1Var.D;
        p1.m(m1Var);
        m1Var.A();
        u0 u0Var = p1Var.C;
        p1.m(u0Var);
        u0Var.J.a("Service connection suspended");
        m1 m1Var2 = p1Var.D;
        p1.m(m1Var2);
        m1Var2.E(new androidx.appcompat.widget.z0(this, 19));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void c() {
        m1 m1Var = ((p1) this.z.e).D;
        p1.m(m1Var);
        m1Var.A();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.x.g(this.y);
                i0 i0Var = (i0) this.y.t();
                m1 m1Var2 = ((p1) this.z.e).D;
                p1.m(m1Var2);
                m1Var2.E(new j3(this, i0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.y = null;
                this.e = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void h(com.google.android.gms.common.b bVar) {
        m3 m3Var = this.z;
        m1 m1Var = ((p1) m3Var.e).D;
        p1.m(m1Var);
        m1Var.A();
        u0 u0Var = ((p1) m3Var.e).C;
        if (u0Var == null || !u0Var.y) {
            u0Var = null;
        }
        if (u0Var != null) {
            u0Var.K.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.e = false;
            this.y = null;
        }
        m1 m1Var2 = ((p1) this.z.e).D;
        p1.m(m1Var2);
        m1Var2.E(new com.google.common.util.concurrent.k0(23, this, bVar, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m1 m1Var = ((p1) this.z.e).D;
        p1.m(m1Var);
        m1Var.A();
        synchronized (this) {
            if (iBinder == null) {
                this.e = false;
                u0 u0Var = ((p1) this.z.e).C;
                p1.m(u0Var);
                u0Var.C.a("Service connected with null binder");
                return;
            }
            i0 g0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
                    u0 u0Var2 = ((p1) this.z.e).C;
                    p1.m(u0Var2);
                    u0Var2.K.a("Bound to IMeasurementService interface");
                } else {
                    u0 u0Var3 = ((p1) this.z.e).C;
                    p1.m(u0Var3);
                    u0Var3.C.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                u0 u0Var4 = ((p1) this.z.e).C;
                p1.m(u0Var4);
                u0Var4.C.a("Service connect failed to get IMeasurementService");
            }
            if (g0Var == null) {
                this.e = false;
                try {
                    com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
                    m3 m3Var = this.z;
                    aVarB.c(((p1) m3Var.e).e, m3Var.z);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                m1 m1Var2 = ((p1) this.z.e).D;
                p1.m(m1Var2);
                m1Var2.E(new j3(this, g0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p1 p1Var = (p1) this.z.e;
        m1 m1Var = p1Var.D;
        p1.m(m1Var);
        m1Var.A();
        u0 u0Var = p1Var.C;
        p1.m(u0Var);
        u0Var.J.a("Service disconnected");
        m1 m1Var2 = p1Var.D;
        p1.m(m1Var2);
        m1Var2.E(new com.google.common.util.concurrent.k0(22, this, componentName, false));
    }
}
