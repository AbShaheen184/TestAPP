package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.f6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 implements e2 {
    public final f6 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public q4(AppMeasurementDynamiteService appMeasurementDynamiteService, f6 f6Var) {
        this.b = appMeasurementDynamiteService;
        this.a = f6Var;
    }

    @Override // com.google.android.gms.measurement.internal.e2
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.g(str, str2, bundle, j);
        } catch (RemoteException e) {
            p1 p1Var = this.b.d;
            if (p1Var != null) {
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                u0Var.F.b(e, "Event listener threw exception");
            }
        }
    }
}
