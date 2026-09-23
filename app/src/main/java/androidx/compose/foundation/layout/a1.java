package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public z0 L;

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float fA = this.L.a(s0Var.getLayoutDirection());
        z0 z0Var = this.L;
        float f = z0Var.b;
        float fB = z0Var.b(s0Var.getLayoutDirection());
        float f2 = this.L.d;
        float f3 = 0;
        if (!((androidx.compose.ui.unit.f.a(f2, f3) >= 0) & (androidx.compose.ui.unit.f.a(fA, f3) >= 0) & (androidx.compose.ui.unit.f.a(f, f3) >= 0) & (androidx.compose.ui.unit.f.a(fB, f3) >= 0))) {
            androidx.compose.foundation.layout.internal.a.a("Padding must be non-negative");
        }
        int iI0 = s0Var.i0(fA);
        int iI1 = s0Var.i0(fB) + iI0;
        int iI2 = s0Var.i0(f);
        int iI3 = s0Var.i0(f2) + iI2;
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.i(-iI1, -iI3, j));
        return s0Var.q(androidx.compose.ui.unit.b.g(d1VarF.e + iI1, j), androidx.compose.ui.unit.b.f(d1VarF.y + iI3, j), kotlin.collections.x.e, new n0(iI0, iI2, 1, d1VarF));
    }
}
