package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.b6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ b6 y;
    public final /* synthetic */ AppMeasurementDynamiteService z;

    public /* synthetic */ n1(AppMeasurementDynamiteService appMeasurementDynamiteService, b6 b6Var, int i) {
        this.e = i;
        this.y = b6Var;
        this.z = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                m3 m3VarP = this.z.d.p();
                b6 b6Var = this.y;
                m3VarP.v();
                m3VarP.w();
                m3VarP.J(new androidx.core.provider.m(11, m3VarP, m3VarP.L(false), b6Var, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.z;
                p4 p4Var = appMeasurementDynamiteService.d.F;
                p1.k(p4Var);
                p1 p1Var = appMeasurementDynamiteService.d;
                p4Var.n0(this.y, p1Var.V != null && p1Var.V.booleanValue());
                break;
        }
    }
}
