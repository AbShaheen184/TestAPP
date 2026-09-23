package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class a extends w0 {
    public final kotlin.jvm.functions.a b;

    public a(kotlin.jvm.functions.a aVar) {
        this.b = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new d(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.b == ((a) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        ((d) qVar).N = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
