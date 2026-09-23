package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class b extends w0 {
    public final androidx.compose.foundation.contextmenu.f b;

    public b(androidx.compose.foundation.contextmenu.f fVar) {
        this.b = fVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        c cVar = new c();
        cVar.N = this.b;
        androidx.activity.compose.g gVar = new androidx.activity.compose.g(cVar, 18);
        a aVar = new a();
        aVar.L = gVar;
        cVar.M0(aVar);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.b == ((b) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        ((c) qVar).N = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
