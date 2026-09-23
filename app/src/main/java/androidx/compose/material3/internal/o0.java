package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.animation.core.a b;

    public o0(androidx.compose.animation.core.a aVar) {
        this.b = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        n0 n0Var = new n0();
        n0Var.L = this.b;
        return n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return this.b == ((o0) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        n0 n0Var = (n0) qVar;
        n0Var.L = this.b;
        androidx.compose.ui.node.l.m(n0Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
