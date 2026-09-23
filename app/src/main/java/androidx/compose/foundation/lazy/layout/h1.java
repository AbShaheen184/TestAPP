package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class h1 extends androidx.compose.ui.node.w0 {
    public final m0 b;

    public h1(m0 m0Var) {
        this.b = m0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        i1 i1Var = new i1();
        i1Var.L = this.b;
        return i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && kotlin.jvm.internal.l.a(this.b, ((h1) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((i1) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
