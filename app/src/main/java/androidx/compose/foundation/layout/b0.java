package androidx.compose.foundation.layout;

import androidx.compose.foundation.b2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends k0 implements androidx.compose.ui.node.w {
    public u1 N;
    public b2 O;
    public u1 P;

    @Override // androidx.compose.foundation.layout.k0
    public final void N0() {
        this.P = new d0(this.N, this.L);
        super.N0();
        androidx.compose.ui.node.l.l(this);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iIntValue = ((Number) this.O.invoke(this.P, s0Var)).intValue();
        kotlin.collections.x xVar = kotlin.collections.x.e;
        if (iIntValue == 0) {
            return s0Var.q(0, 0, xVar, new androidx.compose.animation.core.n1(23));
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.a.a(j, 0, 0, iIntValue, iIntValue, 3));
        return s0Var.q(d1VarF.e, iIntValue, xVar, new j(d1VarF, 1));
    }

    @Override // androidx.compose.foundation.layout.k0
    public final u1 M0(u1 u1Var) {
        return u1Var;
    }
}
