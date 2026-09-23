package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.selection.t0;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final t0 b;

    public e(t0 t0Var) {
        this.b = t0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new g(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.b == ((e) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        ((g) qVar).N = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
