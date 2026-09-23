package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class w0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.l b;

    public w0(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        x0 x0Var = new x0();
        x0Var.L = this.b;
        return x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return this.b == ((w0) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((x0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
