package androidx.compose.foundation.selection;

import androidx.compose.foundation.e1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class a extends w0 {
    public final boolean b;
    public final k c;
    public final e1 d;
    public final boolean e;
    public final j f;
    public final kotlin.jvm.functions.a g;

    public a(boolean z, k kVar, e1 e1Var, boolean z2, j jVar, kotlin.jvm.functions.a aVar) {
        this.b = z;
        this.c = kVar;
        this.d = e1Var;
        this.e = z2;
        this.f = jVar;
        this.g = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        d dVar = new d(this.c, this.d, false, this.e, null, this.f, this.g);
        dVar.k0 = this.b;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && l.a(this.c, aVar.c) && l.a(this.d, aVar.d) && this.e == aVar.e && l.a(this.f, aVar.f) && this.g == aVar.g;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        d dVar = (d) qVar;
        boolean z = dVar.k0;
        boolean z2 = this.b;
        if (z != z2) {
            dVar.k0 = z2;
            androidx.compose.ui.node.l.m(dVar);
        }
        dVar.a1(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        k kVar = this.c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e1 e1Var = this.d;
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode2 + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, false), 31, this.e);
        j jVar = this.f;
        return this.g.hashCode() + ((iH + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31);
    }
}
