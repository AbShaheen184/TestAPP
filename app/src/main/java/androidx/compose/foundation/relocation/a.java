package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class a extends w0 {
    public final c b;

    public a(c cVar) {
        this.b = cVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        e eVar = new e();
        eVar.L = this.b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.a(this.b, ((a) obj).b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        e eVar = (e) qVar;
        c cVar = eVar.L;
        if (cVar != null) {
            cVar.a.j(eVar);
        }
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a.b(eVar);
        }
        eVar.L = cVar2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
