package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class n1 extends androidx.compose.ui.node.w0 {
    public final g0 b;

    public n1(g0 g0Var) {
        this.b = g0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        o1 o1Var = new o1();
        o1Var.N = this.b;
        return o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return ((n1) obj).b.equals(this.b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        o1 o1Var = (o1) qVar;
        g0 g0Var = o1Var.N;
        g0 g0Var2 = this.b;
        if (g0Var2.equals(g0Var)) {
            return;
        }
        o1Var.N = g0Var2;
        o1Var.N0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
