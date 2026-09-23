package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class h0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final kotlin.jvm.functions.a c;
    public final kotlin.jvm.functions.a d;

    public h0(androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.b = kVar;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new l0(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.l.a(this.b, h0Var.b) && this.c == h0Var.c && this.d == h0Var.d;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        androidx.compose.ui.input.pointer.l0 l0Var;
        l0 l0Var2 = (l0) qVar;
        l0Var2.k0 = true;
        boolean z = false;
        boolean z2 = l0Var2.j0 == null;
        kotlin.jvm.functions.a aVar = this.d;
        if (z2 != (aVar == null)) {
            l0Var2.S0();
            androidx.compose.ui.node.l.m(l0Var2);
            z = true;
        }
        l0Var2.j0 = aVar;
        boolean z3 = l0Var2.S ? z : true;
        l0Var2.a1(this.b, null, false, true, null, null, this.c);
        if (!z3 || (l0Var = l0Var2.W) == null) {
            return;
        }
        l0Var.O0();
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        int iHashCode = (this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((kVar != null ? kVar.hashCode() : 0) * 961, 31, false), 29791, true)) * 961;
        kotlin.jvm.functions.a aVar = this.d;
        return Boolean.hashCode(true) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 961);
    }
}
