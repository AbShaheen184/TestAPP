package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class w1 extends androidx.compose.ui.node.w0 {
    public final c0 b;
    public final kotlin.jvm.functions.p c;
    public final Object d;

    public w1(c0 c0Var, kotlin.jvm.functions.p pVar, Object obj) {
        this.b = c0Var;
        this.c = pVar;
        this.d = obj;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        y1 y1Var = new y1();
        y1Var.L = this.b;
        y1Var.M = this.c;
        return y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1.class != obj.getClass()) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.b == w1Var.b && this.d.equals(w1Var.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        y1 y1Var = (y1) qVar;
        y1Var.L = this.b;
        y1Var.M = this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.b.hashCode() * 31, 31, false);
    }
}
