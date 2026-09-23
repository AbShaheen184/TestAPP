package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends k0 implements androidx.compose.ui.node.w {
    public u1 N;

    public o0(u1 u1Var) {
        this.N = u1Var;
    }

    @Override // androidx.compose.foundation.layout.k0
    public final u1 M0(u1 u1Var) {
        return new m1(u1Var, this.N);
    }

    @Override // androidx.compose.foundation.layout.k0
    public final void N0() {
        super.N0();
        androidx.compose.ui.node.l.l(this);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iD = this.M.d(s0Var, s0Var.getLayoutDirection()) - this.L.d(s0Var, s0Var.getLayoutDirection());
        int iA = this.M.a(s0Var) - this.L.a(s0Var);
        int iB = (this.M.b(s0Var, s0Var.getLayoutDirection()) - this.L.b(s0Var, s0Var.getLayoutDirection())) + iD;
        int iC = (this.M.c(s0Var) - this.L.c(s0Var)) + iA;
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.i(-iB, -iC, j));
        return s0Var.q(androidx.compose.ui.unit.b.g(d1VarF.e + iB, j), androidx.compose.ui.unit.b.f(d1VarF.y + iC, j), kotlin.collections.x.e, new n0(iD, iA, 0, d1VarF));
    }
}
