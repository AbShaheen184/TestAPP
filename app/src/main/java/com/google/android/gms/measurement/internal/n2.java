package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ s2 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ c2 y;
    public final /* synthetic */ long z;

    public /* synthetic */ n2(s2 s2Var, c2 c2Var, long j, boolean z, int i) {
        this.e = i;
        this.y = c2Var;
        this.z = j;
        this.A = z;
        this.B = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                s2 s2Var = this.B;
                c2 c2Var = this.y;
                s2Var.V(c2Var);
                s2Var.L(c2Var, this.z, this.A);
                break;
            default:
                s2 s2Var2 = this.B;
                c2 c2Var2 = this.y;
                s2Var2.V(c2Var2);
                s2Var2.L(c2Var2, this.z, this.A);
                break;
        }
    }
}
