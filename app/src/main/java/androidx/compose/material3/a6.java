package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class a6 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.j b;
    public final boolean c;
    public final androidx.compose.animation.core.k1 d;

    public a6(androidx.compose.foundation.interaction.j jVar, boolean z, androidx.compose.animation.core.k1 k1Var) {
        this.b = jVar;
        this.c = z;
        this.d = k1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        c6 c6Var = new c6();
        c6Var.L = this.b;
        c6Var.M = this.c;
        c6Var.N = this.d;
        c6Var.R = Float.NaN;
        c6Var.S = Float.NaN;
        return c6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return kotlin.jvm.internal.l.a(this.b, a6Var.b) && this.c == a6Var.c && this.d.equals(a6Var.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        c6 c6Var = (c6) qVar;
        c6Var.L = this.b;
        boolean z = c6Var.M;
        boolean z2 = this.c;
        if (z != z2) {
            androidx.compose.ui.node.l.l(c6Var);
        }
        c6Var.M = z2;
        c6Var.N = this.d;
        if (c6Var.Q == null && !Float.isNaN(c6Var.S)) {
            c6Var.Q = androidx.compose.animation.core.e.a(c6Var.S);
        }
        if (c6Var.P != null || Float.isNaN(c6Var.R)) {
            return;
        }
        c6Var.P = androidx.compose.animation.core.e.a(c6Var.R);
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ')';
    }
}
