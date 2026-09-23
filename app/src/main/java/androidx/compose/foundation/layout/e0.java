package androidx.compose.foundation.layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.compose.ui.node.w0 {
    public final c0 b;
    public final float c;

    public e0(c0 c0Var, float f) {
        this.b = c0Var;
        this.c = f;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        f0 f0Var = new f0();
        f0Var.L = this.b;
        f0Var.M = this.c;
        return f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.b == e0Var.b && this.c == e0Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        f0 f0Var = (f0) qVar;
        f0Var.L = this.b;
        f0Var.M = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
