package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public c0 L;
    public kotlin.jvm.functions.p M;

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(final androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        final androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.a(this.L != c0.e ? 0 : androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j), this.L == c0.y ? androidx.compose.ui.unit.a.i(j) : 0, androidx.compose.ui.unit.a.g(j)));
        final int iD = kotlin.collections.i0.d(d1VarF.e, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j));
        final int iD2 = kotlin.collections.i0.d(d1VarF.y, androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.g(j));
        return s0Var.q(iD, iD2, kotlin.collections.x.e, new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.layout.x1
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                kotlin.jvm.functions.p pVar = this.e.M;
                androidx.compose.ui.layout.d1 d1Var = d1VarF;
                androidx.compose.ui.layout.c1.k((androidx.compose.ui.layout.c1) obj, d1Var, ((androidx.compose.ui.unit.j) pVar.invoke(new androidx.compose.ui.unit.l((((long) (iD - d1Var.e)) << 32) | (((long) (iD2 - d1Var.y)) & 4294967295L)), s0Var.getLayoutDirection())).a);
                return kotlin.y.a;
            }
        });
    }
}
