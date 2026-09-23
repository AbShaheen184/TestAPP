package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ m3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(m3 m3Var, p1 p1Var, int i) {
        super(p1Var);
        this.e = i;
        this.f = m3Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void a() {
        switch (this.e) {
            case 0:
                m3 m3Var = this.f;
                m3Var.v();
                if (m3Var.M()) {
                    u0 u0Var = ((p1) m3Var.e).C;
                    p1.m(u0Var);
                    u0Var.K.a("Inactivity, disconnecting from the service");
                    m3Var.D();
                    break;
                }
                break;
            default:
                u0 u0Var2 = ((p1) this.f.e).C;
                p1.m(u0Var2);
                u0Var2.F.a("Tasks have been queued for a long time");
                break;
        }
    }
}
