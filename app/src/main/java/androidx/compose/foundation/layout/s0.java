package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public q0 L;
    public boolean M;

    @Override // androidx.compose.ui.node.w
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return this.L == q0.e ? p0Var.v(i) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return p0Var.a0(i);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iV = this.L == q0.e ? p0Var.v(androidx.compose.ui.unit.a.g(j)) : p0Var.B(androidx.compose.ui.unit.a.g(j));
        if (iV < 0) {
            iV = 0;
        }
        if (iV < 0) {
            androidx.compose.ui.unit.i.a("width must be >= 0");
        }
        long jH = androidx.compose.ui.unit.b.h(iV, iV, 0, Integer.MAX_VALUE);
        if (this.M) {
            jH = androidx.compose.ui.unit.b.e(j, jH);
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(jH);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new j(d1VarF, 3));
    }

    @Override // androidx.compose.ui.node.w
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return this.L == q0.e ? p0Var.v(i) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return p0Var.b(i);
    }
}
