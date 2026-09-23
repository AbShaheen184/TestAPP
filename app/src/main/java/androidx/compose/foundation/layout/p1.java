package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class p1 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;

    public p1(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        q1 q1Var = new q1();
        q1Var.L = this.b;
        q1Var.M = this.c;
        return q1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return androidx.compose.ui.unit.f.d(this.b, p1Var.b) && androidx.compose.ui.unit.f.d(this.c, p1Var.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        q1 q1Var = (q1) qVar;
        q1Var.L = this.b;
        q1Var.M = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
