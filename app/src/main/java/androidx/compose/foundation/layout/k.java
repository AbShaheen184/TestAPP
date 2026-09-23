package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public float L;

    @Override // androidx.compose.ui.node.w
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.L) : p0Var.v(i);
    }

    public final long M0(long j, boolean z) {
        int iRound;
        int iG = androidx.compose.ui.unit.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.L)) <= 0) {
            return 0L;
        }
        if (!z || b.n(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long N0(long j, boolean z) {
        int iRound;
        int iH = androidx.compose.ui.unit.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.L)) <= 0) {
            return 0L;
        }
        if (!z || b.n(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long O0(long j, boolean z) {
        int i = androidx.compose.ui.unit.a.i(j);
        int iRound = Math.round(i * this.L);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || b.n(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long P0(long j, boolean z) {
        int iJ = androidx.compose.ui.unit.a.j(j);
        int iRound = Math.round(iJ / this.L);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || b.n(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.L) : p0Var.a0(i);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        long jN0 = N0(j, true);
        if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
            jN0 = M0(j, true);
            if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                jN0 = P0(j, true);
                if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                    jN0 = O0(j, true);
                    if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                        jN0 = N0(j, false);
                        if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                            jN0 = M0(j, false);
                            if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                                jN0 = P0(j, false);
                                if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                                    jN0 = O0(j, false);
                                    if (androidx.compose.ui.unit.l.a(jN0, 0L)) {
                                        jN0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!androidx.compose.ui.unit.l.a(jN0, 0L)) {
            int i = (int) (jN0 >> 32);
            int i2 = (int) (jN0 & 4294967295L);
            if (!((i2 >= 0) & (i >= 0))) {
                androidx.compose.ui.unit.i.a("width and height must be >= 0");
            }
            j = androidx.compose.ui.unit.b.h(i, i, i2, i2);
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new j(d1VarF, 0));
    }

    @Override // androidx.compose.ui.node.w
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.L) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.L) : p0Var.b(i);
    }
}
