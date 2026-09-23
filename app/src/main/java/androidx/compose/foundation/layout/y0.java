package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class y0 extends androidx.compose.ui.node.w0 {
    public final z0 b;

    public y0(z0 z0Var) {
        this.b = z0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        a1 a1Var = new a1();
        a1Var.L = this.b;
        return a1Var;
    }

    public final boolean equals(Object obj) {
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        if (y0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.b, y0Var.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((a1) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
