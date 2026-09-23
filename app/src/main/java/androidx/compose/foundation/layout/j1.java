package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    @Override // androidx.compose.ui.node.w
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jM0 = M0(n0Var);
        if (androidx.compose.ui.unit.a.f(jM0)) {
            return androidx.compose.ui.unit.a.h(jM0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.f(i, jM0);
        }
        return androidx.compose.ui.unit.b.g(p0Var.v(i), jM0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long M0(androidx.compose.ui.layout.s0 s0Var) {
        int iI0;
        int iI1;
        int iI2;
        int i = 0;
        if (Float.isNaN(this.N)) {
            iI0 = Integer.MAX_VALUE;
        } else {
            iI0 = s0Var.i0(this.N);
            if (iI0 < 0) {
                iI0 = 0;
            }
        }
        if (Float.isNaN(this.O)) {
            iI1 = Integer.MAX_VALUE;
        } else {
            iI1 = s0Var.i0(this.O);
            if (iI1 < 0) {
                iI1 = 0;
            }
        }
        if (Float.isNaN(this.L)) {
            iI2 = 0;
        } else {
            iI2 = s0Var.i0(this.L);
            if (iI2 < 0) {
                iI2 = 0;
            }
            if (iI2 > iI0) {
                iI2 = iI0;
            }
            if (iI2 == Integer.MAX_VALUE) {
                iI2 = 0;
            }
        }
        if (!Float.isNaN(this.M)) {
            int iI3 = s0Var.i0(this.M);
            if (iI3 < 0) {
                iI3 = 0;
            }
            if (iI3 > iI1) {
                iI3 = iI1;
            }
            if (iI3 != Integer.MAX_VALUE) {
                i = iI3;
            }
        }
        return androidx.compose.ui.unit.b.a(iI2, iI0, i, iI1);
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jM0 = M0(n0Var);
        if (androidx.compose.ui.unit.a.e(jM0)) {
            return androidx.compose.ui.unit.a.g(jM0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.g(i, jM0);
        }
        return androidx.compose.ui.unit.b.f(p0Var.a0(i), jM0);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jM0 = M0(s0Var);
        if (this.P) {
            jA = androidx.compose.ui.unit.b.e(j, jM0);
        } else {
            if (Float.isNaN(this.L)) {
                iJ = androidx.compose.ui.unit.a.j(j);
                int iH2 = androidx.compose.ui.unit.a.h(jM0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = androidx.compose.ui.unit.a.j(jM0);
            }
            if (Float.isNaN(this.N)) {
                iH = androidx.compose.ui.unit.a.h(j);
                int iJ2 = androidx.compose.ui.unit.a.j(jM0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = androidx.compose.ui.unit.a.h(jM0);
            }
            if (Float.isNaN(this.M)) {
                i = androidx.compose.ui.unit.a.i(j);
                int iG2 = androidx.compose.ui.unit.a.g(jM0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = androidx.compose.ui.unit.a.i(jM0);
            }
            if (Float.isNaN(this.O)) {
                iG = androidx.compose.ui.unit.a.g(j);
                int i2 = androidx.compose.ui.unit.a.i(jM0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = androidx.compose.ui.unit.a.g(jM0);
            }
            jA = androidx.compose.ui.unit.b.a(iJ, iH, i, iG);
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(jA);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new j(d1VarF, 4));
    }

    @Override // androidx.compose.ui.node.w
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jM0 = M0(n0Var);
        if (androidx.compose.ui.unit.a.f(jM0)) {
            return androidx.compose.ui.unit.a.h(jM0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.f(i, jM0);
        }
        return androidx.compose.ui.unit.b.g(p0Var.B(i), jM0);
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jM0 = M0(n0Var);
        if (androidx.compose.ui.unit.a.e(jM0)) {
            return androidx.compose.ui.unit.a.g(jM0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.g(i, jM0);
        }
        return androidx.compose.ui.unit.b.f(p0Var.b(i), jM0);
    }
}
