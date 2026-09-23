package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class v1 extends androidx.compose.ui.node.w0 {
    public final l2 b;
    public final o1 c;
    public final boolean d;
    public final boolean e;
    public final androidx.compose.foundation.interaction.k f;

    public v1(l2 l2Var, o1 o1Var, boolean z, boolean z2, androidx.compose.foundation.interaction.k kVar) {
        this.b = l2Var;
        this.c = o1Var;
        this.d = z;
        this.e = z2;
        this.f = kVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        boolean z = this.e;
        return new k2(null, null, this.c, this.b, this.f, this.d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return kotlin.jvm.internal.l.a(this.b, v1Var.b) && this.c == v1Var.c && this.d == v1Var.d && this.e == v1Var.e && kotlin.jvm.internal.l.a(this.f, v1Var.f);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((k2) qVar).h1(null, null, this.c, this.b, this.f, this.d, this.e);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        androidx.compose.foundation.interaction.k kVar = this.f;
        return (iH + (kVar != null ? kVar.hashCode() : 0)) * 31;
    }
}
