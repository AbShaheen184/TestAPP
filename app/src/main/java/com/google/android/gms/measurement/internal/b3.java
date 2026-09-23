package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ d3 B;
    public final /* synthetic */ a3 e;
    public final /* synthetic */ a3 y;
    public final /* synthetic */ long z;

    public b3(d3 d3Var, a3 a3Var, a3 a3Var2, long j, boolean z) {
        this.e = a3Var;
        this.y = a3Var2;
        this.z = j;
        this.A = z;
        this.B = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.B(this.e, this.y, this.z, this.A, null);
    }
}
