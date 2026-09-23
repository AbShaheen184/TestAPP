package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class r0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.a b;
    public final q0 c;
    public final o1 d;
    public final boolean e;

    public r0(kotlin.jvm.functions.a aVar, q0 q0Var, o1 o1Var, boolean z) {
        this.b = aVar;
        this.c = q0Var;
        this.d = o1Var;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new v0(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.b == r0Var.b && kotlin.jvm.internal.l.a(this.c, r0Var.c) && this.d == r0Var.d && this.e == r0Var.e;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        v0 v0Var = (v0) qVar;
        v0Var.L = this.b;
        v0Var.M = this.c;
        o1 o1Var = v0Var.N;
        o1 o1Var2 = this.d;
        if (o1Var != o1Var2) {
            v0Var.N = o1Var2;
            androidx.compose.ui.node.l.m(v0Var);
        }
        boolean z = v0Var.O;
        boolean z2 = this.e;
        if (z == z2) {
            return;
        }
        v0Var.O = z2;
        v0Var.M0();
        androidx.compose.ui.node.l.m(v0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + androidx.privacysandbox.ads.adservices.java.internal.a.h((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }
}
