package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class r0 extends androidx.compose.ui.node.w0 {
    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        s0 s0Var = new s0();
        s0Var.L = q0.y;
        s0Var.M = true;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0 ? (r0) obj : null) != null;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        s0 s0Var = (s0) qVar;
        s0Var.L = q0.y;
        s0Var.M = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (q0.y.hashCode() * 31);
    }
}
