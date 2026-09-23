package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.ui.h b;

    public h0(androidx.compose.ui.h hVar) {
        this.b = hVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        i0 i0Var = new i0();
        i0Var.L = this.b;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h0 h0Var = obj instanceof h0 ? (h0) obj : null;
        if (h0Var == null) {
            return false;
        }
        return this.b.equals(h0Var.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((i0) qVar).L = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
