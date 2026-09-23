package androidx.compose.foundation;

import androidx.compose.foundation.gestures.l2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class d2 extends androidx.compose.ui.node.w0 {
    public final l2 b;
    public final androidx.compose.foundation.gestures.o1 c;
    public final boolean d;
    public final androidx.compose.foundation.gestures.l e;
    public final androidx.compose.foundation.interaction.k f;
    public final boolean g;
    public final n h;

    public d2(n nVar, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.gestures.o1 o1Var, l2 l2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        this.b = l2Var;
        this.c = o1Var;
        this.d = z;
        this.e = lVar;
        this.f = kVar;
        this.g = z2;
        this.h = nVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        e2 e2Var = new e2();
        e2Var.N = this.b;
        e2Var.O = this.c;
        e2Var.P = this.d;
        e2Var.Q = this.e;
        e2Var.R = this.f;
        e2Var.S = this.g;
        e2Var.T = this.h;
        return e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2.class != obj.getClass()) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.l.a(this.b, d2Var.b) && this.c == d2Var.c && this.d == d2Var.d && kotlin.jvm.internal.l.a(this.e, d2Var.e) && kotlin.jvm.internal.l.a(this.f, d2Var.f) && this.g == d2Var.g && kotlin.jvm.internal.l.a(this.h, d2Var.h);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((e2) qVar).R0(this.h, this.e, this.c, this.b, this.f, this.g, this.d);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, false);
        androidx.compose.foundation.gestures.l lVar = this.e;
        int iHashCode = (iH + (lVar != null ? lVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.k kVar = this.f;
        int iH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, this.g);
        n nVar = this.h;
        return iH2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
