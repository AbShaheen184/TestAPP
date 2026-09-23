package androidx.compose.foundation.layout;

import androidx.compose.foundation.b2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class a0 extends androidx.compose.ui.node.w0 {
    public final u1 b;

    public a0(u1 u1Var) {
        this.b = u1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        b2 b2Var = b.d;
        b0 b0Var = new b0();
        b0Var.N = this.b;
        b0Var.O = b2Var;
        b0Var.P = b.c;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return kotlin.jvm.internal.l.a(this.b, ((a0) obj).b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        b0 b0Var = (b0) qVar;
        b2 b2Var = b.d;
        u1 u1Var = b0Var.N;
        u1 u1Var2 = this.b;
        if (kotlin.jvm.internal.l.a(u1Var, u1Var2) && b2Var == b0Var.O) {
            return;
        }
        b0Var.N = u1Var2;
        b0Var.O = b2Var;
        b0Var.P = new d0(u1Var2, b0Var.L);
        androidx.compose.ui.node.l.l(b0Var);
    }

    public final int hashCode() {
        return b.d.hashCode() + (this.b.hashCode() * 31);
    }
}
