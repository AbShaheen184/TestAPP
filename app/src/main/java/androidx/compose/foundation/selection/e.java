package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.j;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final boolean b;
    public final k c;
    public final boolean d;
    public final j e;
    public final l f;

    public e(boolean z, k kVar, boolean z2, j jVar, l lVar) {
        this.b = z;
        this.c = kVar;
        this.d = z2;
        this.e = jVar;
        this.f = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new h(this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.b && kotlin.jvm.internal.l.a(this.c, eVar.c) && this.d == eVar.d && this.e.equals(eVar.e) && this.f == eVar.f;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        h hVar = (h) qVar;
        boolean z = hVar.k0;
        boolean z2 = this.b;
        if (z != z2) {
            hVar.k0 = z2;
            androidx.compose.ui.node.l.m(hVar);
        }
        hVar.l0 = this.f;
        hVar.a1(this.c, null, false, this.d, null, this.e, hVar.m0);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        k kVar = this.c;
        return this.f.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.e.a, androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, false), 31, this.d), 31);
    }
}
