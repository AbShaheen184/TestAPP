package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class m0 extends androidx.compose.ui.node.w0 {
    public final u1 b;

    public m0(u1 u1Var) {
        this.b = u1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return kotlin.jvm.internal.l.a(((m0) obj).b, this.b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        o0 o0Var = (o0) qVar;
        u1 u1Var = o0Var.N;
        u1 u1Var2 = this.b;
        if (kotlin.jvm.internal.l.a(u1Var2, u1Var)) {
            return;
        }
        o0Var.N = u1Var2;
        o0Var.N0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
