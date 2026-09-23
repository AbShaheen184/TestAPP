package androidx.compose.ui.focus;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class s extends w0 {
    public final v b;

    public s(v vVar) {
        this.b = vVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        x xVar = new x();
        xVar.L = this.b;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.b.equals(((s) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((x) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.e.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.b + ')';
    }
}
