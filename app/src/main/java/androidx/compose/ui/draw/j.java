package androidx.compose.ui.draw;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class j extends w0 {
    public final kotlin.jvm.functions.l b;

    public j(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new c(new d(), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.b == ((j) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        c cVar = (c) qVar;
        cVar.N = this.b;
        cVar.M0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
