package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public float L;
    public float M;

    @Override // androidx.compose.ui.node.w
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iV = p0Var.v(i);
        int iI0 = !Float.isNaN(this.L) ? n0Var.i0(this.L) : 0;
        return iV < iI0 ? iI0 : iV;
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iA0 = p0Var.a0(i);
        int iI0 = !Float.isNaN(this.M) ? n0Var.i0(this.M) : 0;
        return iA0 < iI0 ? iI0 : iA0;
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.L) || androidx.compose.ui.unit.a.j(j) != 0) {
            iJ = androidx.compose.ui.unit.a.j(j);
        } else {
            int iI0 = s0Var.i0(this.L);
            iJ = androidx.compose.ui.unit.a.h(j);
            if (iI0 < 0) {
                iI0 = 0;
            }
            if (iI0 <= iJ) {
                iJ = iI0;
            }
        }
        int iH = androidx.compose.ui.unit.a.h(j);
        if (Float.isNaN(this.M) || androidx.compose.ui.unit.a.i(j) != 0) {
            i = androidx.compose.ui.unit.a.i(j);
        } else {
            int iI1 = s0Var.i0(this.M);
            i = androidx.compose.ui.unit.a.g(j);
            int i2 = iI1 >= 0 ? iI1 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.a(iJ, iH, i, androidx.compose.ui.unit.a.g(j)));
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new j(d1VarF, 5));
    }

    @Override // androidx.compose.ui.node.w
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iB = p0Var.B(i);
        int iI0 = !Float.isNaN(this.L) ? n0Var.i0(this.L) : 0;
        return iB < iI0 ? iI0 : iB;
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iB = p0Var.b(i);
        int iI0 = !Float.isNaN(this.M) ? n0Var.i0(this.M) : 0;
        return iB < iI0 ? iI0 : iB;
    }
}
