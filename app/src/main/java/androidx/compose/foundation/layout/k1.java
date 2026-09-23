package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class k1 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.gestures.w1 b;

    public k1(androidx.compose.foundation.gestures.w1 w1Var) {
        this.b = w1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        l1 l1Var = new l1(b.c);
        l1Var.O = this.b;
        return l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return this.b == ((k1) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        l1 l1Var = (l1) qVar;
        androidx.compose.foundation.gestures.w1 w1Var = l1Var.O;
        androidx.compose.foundation.gestures.w1 w1Var2 = this.b;
        if (w1Var != w1Var2) {
            l1Var.O = w1Var2;
            v1 v1Var = l1Var.P;
            if (v1Var != null) {
                a aVar = v1Var.c;
                if (kotlin.jvm.internal.l.a(aVar, l1Var.N)) {
                    return;
                }
                l1Var.N = aVar;
                l1Var.N0();
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
