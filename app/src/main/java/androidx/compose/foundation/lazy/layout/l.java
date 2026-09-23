package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.node.w0 {
    public final q b;
    public final com.google.firebase.platforminfo.d c;
    public final o1 d;

    public l(q qVar, com.google.firebase.platforminfo.d dVar, o1 o1Var) {
        this.b = qVar;
        this.c = dVar;
        this.d = o1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        p pVar = new p();
        pVar.L = this.b;
        pVar.M = this.c;
        pVar.N = this.d;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.b, lVar.b) && kotlin.jvm.internal.l.a(this.c, lVar.c) && this.d == lVar.d;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        p pVar = (p) qVar;
        pVar.L = this.b;
        pVar.M = this.c;
        pVar.N = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, false);
    }
}
