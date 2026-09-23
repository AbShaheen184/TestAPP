package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class n extends w0 {
    public final b0 b;

    public n(b0 b0Var) {
        this.b = b0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new o(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.b == ((n) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        o oVar = (o) qVar;
        b0 b0Var = this.b;
        oVar.L = b0Var;
        if (oVar.K) {
            b0Var.invoke(oVar.M);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
