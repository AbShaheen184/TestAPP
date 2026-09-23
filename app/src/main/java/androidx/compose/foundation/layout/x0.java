package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iI0 = s0Var.i0(this.N) + s0Var.i0(this.L);
        int iI1 = s0Var.i0(this.O) + s0Var.i0(this.M);
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.i(-iI0, -iI1, j));
        return s0Var.q(androidx.compose.ui.unit.b.g(d1VarF.e + iI0, j), androidx.compose.ui.unit.b.f(d1VarF.y + iI1, j), kotlin.collections.x.e, new androidx.activity.compose.h(15, this, d1VarF));
    }
}
