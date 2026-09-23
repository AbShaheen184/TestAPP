package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class c1 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.j b;
    public final e1 c;

    public c1(androidx.compose.foundation.interaction.j jVar, e1 e1Var) {
        this.b = jVar;
        this.c = e1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        androidx.compose.ui.node.j jVarA = this.c.a(this.b);
        d1 d1Var = new d1();
        d1Var.N = jVarA;
        d1Var.M0(jVarA);
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.l.a(this.b, c1Var.b) && kotlin.jvm.internal.l.a(this.c, c1Var.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        d1 d1Var = (d1) qVar;
        androidx.compose.ui.node.j jVarA = this.c.a(this.b);
        d1Var.N0(d1Var.N);
        d1Var.N = jVarA;
        d1Var.M0(jVarA);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
