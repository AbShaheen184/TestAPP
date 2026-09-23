package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface w extends j {
    default int B(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, f1.e, g1.e, 2), androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    default int b0(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, f1.e, g1.y, 2), androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }

    androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j);

    default int v(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, f1.y, g1.e, 2), androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    default int x0(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, f1.y, g1.y, 2), androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }
}
