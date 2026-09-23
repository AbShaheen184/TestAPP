package androidx.compose.ui.input.nestedscroll;

import androidx.compose.animation.z;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final a b;
    public final d c;

    public e(a aVar, d dVar) {
        this.b = aVar;
        this.c = dVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new i(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(eVar.b, this.b) && l.a(eVar.c, this.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        i iVar = (i) qVar;
        iVar.L = this.b;
        d dVar = iVar.M;
        if (dVar.a == iVar) {
            dVar.a = null;
        }
        d dVar2 = this.c;
        if (dVar2 == null) {
            iVar.M = new d();
        } else if (!dVar2.equals(dVar)) {
            iVar.M = dVar2;
        }
        if (iVar.K) {
            d dVar3 = iVar.M;
            dVar3.a = iVar;
            dVar3.b = null;
            iVar.N = null;
            dVar3.c = new z(iVar, 4);
            dVar3.d = iVar.A0();
        }
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        d dVar = this.c;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
