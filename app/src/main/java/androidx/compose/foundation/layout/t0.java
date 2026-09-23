package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final boolean c;

    public t0(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        u0 u0Var = new u0();
        u0Var.L = this.b;
        u0Var.M = this.c;
        return u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        return t0Var != null && this.b == t0Var.b && this.c == t0Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        u0 u0Var = (u0) qVar;
        u0Var.L = this.b;
        u0Var.M = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
