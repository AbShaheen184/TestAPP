package androidx.compose.material3.internal;

import androidx.compose.material3.t3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.compose.ui.node.w0 {
    public final t3 b;

    public y(t3 t3Var) {
        this.b = t3Var;
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
        if (obj instanceof y) {
            return this.b == ((y) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        x xVar = (x) qVar;
        xVar.L = this.b;
        androidx.compose.ui.node.l.m(xVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
