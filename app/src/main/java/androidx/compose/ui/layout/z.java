package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class z extends androidx.compose.ui.node.w0 {
    public final String b;

    public z(String str) {
        this.b = str;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        b0 b0Var = new b0();
        b0Var.L = this.b;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.b.equals(((z) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((b0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ')';
    }
}
