package androidx.compose.ui.graphics;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class n extends w0 {
    public final kotlin.jvm.functions.l b;

    public n(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new o(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.b == ((n) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        d1 d1Var;
        o oVar = (o) qVar;
        kotlin.jvm.functions.l lVar = this.b;
        oVar.L = lVar;
        if (oVar.e.K && (d1Var = androidx.compose.ui.node.l.t(oVar, 2).M) != null) {
            d1Var.s1(lVar, true);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
