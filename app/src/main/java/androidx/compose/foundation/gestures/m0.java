package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends androidx.compose.ui.node.w0 {
    public static final androidx.compose.animation.core.n1 g = new androidx.compose.animation.core.n1(29);
    public final androidx.compose.foundation.text.input.internal.o b;
    public final boolean c;
    public final boolean d;
    public final kotlin.jvm.functions.q e;
    public final kotlin.jvm.functions.q f;

    public m0(androidx.compose.foundation.text.input.internal.o oVar, boolean z, boolean z2, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.q qVar2) {
        this.b = oVar;
        this.c = z;
        this.d = z2;
        this.e = qVar;
        this.f = qVar2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        androidx.compose.animation.core.n1 n1Var = g;
        boolean z = this.c;
        o1 o1Var = o1.e;
        q0 q0Var = new q0(n1Var, z, null, o1Var);
        q0Var.f0 = this.b;
        q0Var.g0 = o1Var;
        q0Var.h0 = this.d;
        q0Var.i0 = this.e;
        q0Var.j0 = this.f;
        return q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.l.a(this.b, m0Var.b) && this.c == m0Var.c && this.d == m0Var.d && kotlin.jvm.internal.l.a(this.e, m0Var.e) && kotlin.jvm.internal.l.a(this.f, m0Var.f);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        boolean z;
        boolean z2;
        q0 q0Var = (q0) qVar;
        androidx.compose.foundation.text.input.internal.o oVar = q0Var.f0;
        androidx.compose.foundation.text.input.internal.o oVar2 = this.b;
        if (kotlin.jvm.internal.l.a(oVar, oVar2)) {
            z = false;
        } else {
            q0Var.f0 = oVar2;
            z = true;
        }
        o1 o1Var = q0Var.g0;
        o1 o1Var2 = o1.e;
        if (o1Var != o1Var2) {
            q0Var.g0 = o1Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        q0Var.i0 = this.e;
        q0Var.j0 = this.f;
        q0Var.h0 = this.d;
        q0Var.g1(g, this.c, null, o1Var2, z2);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((o1.e.hashCode() + (this.b.hashCode() * 31)) * 31, 961, this.c), 31, this.d)) * 31)) * 31);
    }
}
