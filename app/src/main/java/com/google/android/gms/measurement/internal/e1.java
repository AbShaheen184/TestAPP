package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ServiceConnection {
    public final String e;
    public final /* synthetic */ f1 y;

    public e1(f1 f1Var, String str) {
        Objects.requireNonNull(f1Var);
        this.y = f1Var;
        this.e = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f1 f1Var = this.y;
        if (iBinder == null) {
            u0 u0Var = f1Var.b.C;
            p1.m(u0Var);
            u0Var.F.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = q5.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            r5 p5Var = iInterfaceQueryLocalInterface instanceof r5 ? (r5) iInterfaceQueryLocalInterface : new p5(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            p1 p1Var = f1Var.b;
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.K.a("Install Referrer Service connected");
            m1 m1Var = p1Var.D;
            p1.m(m1Var);
            m1Var.E(new com.google.common.util.concurrent.k0(this, p5Var, this));
        } catch (RuntimeException e) {
            u0 u0Var3 = f1Var.b.C;
            p1.m(u0Var3);
            u0Var3.F.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u0 u0Var = this.y.b.C;
        p1.m(u0Var);
        u0Var.K.a("Install Referrer Service disconnected");
    }
}
