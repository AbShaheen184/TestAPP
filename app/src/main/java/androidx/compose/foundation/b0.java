package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class b0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final e1 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final androidx.compose.ui.semantics.j g;
    public final kotlin.jvm.functions.a h;

    public b0(androidx.compose.foundation.interaction.k kVar, e1 e1Var, boolean z, boolean z2, String str, androidx.compose.ui.semantics.j jVar, kotlin.jvm.functions.a aVar) {
        this.b = kVar;
        this.c = e1Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = jVar;
        this.h = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new e0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.l.a(this.b, b0Var.b) && kotlin.jvm.internal.l.a(this.c, b0Var.c) && this.d == b0Var.d && this.e == b0Var.e && kotlin.jvm.internal.l.a(this.f, b0Var.f) && kotlin.jvm.internal.l.a(this.g, b0Var.g) && this.h == b0Var.h;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((e0) qVar).a1(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        e1 e1Var = this.c;
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iH + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.j jVar = this.g;
        return this.h.hashCode() + ((iHashCode2 + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31);
    }
}
