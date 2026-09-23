package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class y0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.l b;

    public y0(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        z0 z0Var = new z0();
        z0Var.L = this.b;
        long j = Integer.MIN_VALUE;
        z0Var.M = (j & 4294967295L) | (j << 32);
        return z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.b == ((y0) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        z0 z0Var = (z0) qVar;
        z0Var.L = this.b;
        long j = Integer.MIN_VALUE;
        z0Var.M = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
