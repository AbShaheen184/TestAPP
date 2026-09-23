package androidx.compose.animation.core;

import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements w2 {
    public t1 A;
    public boolean B;
    public boolean C;
    public long D;
    public final /* synthetic */ k0 E;
    public Float e;
    public Float y;
    public final androidx.compose.runtime.j1 z;

    public h0(k0 k0Var, Float f, Float f2, f0 f0Var) {
        l2 l2Var = e.j;
        this.E = k0Var;
        this.e = f;
        this.y = f2;
        this.z = androidx.compose.runtime.t.r(f);
        this.A = new t1(f0Var, l2Var, this.e, this.y, null);
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return this.z.getValue();
    }
}
