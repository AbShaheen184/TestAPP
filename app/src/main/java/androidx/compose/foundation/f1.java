package androidx.compose.foundation;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.text.selection.g1 b;
    public final androidx.compose.foundation.text.selection.e1 c;
    public final t1 d;

    public f1(androidx.compose.foundation.text.selection.g1 g1Var, androidx.compose.foundation.text.selection.e1 e1Var, t1 t1Var) {
        this.b = g1Var;
        this.c = e1Var;
        this.d = t1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new h1(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        h1 h1Var = (h1) qVar;
        h1Var.getClass();
        t1 t1Var = h1Var.N;
        View view = h1Var.O;
        androidx.compose.ui.unit.c cVar = h1Var.P;
        h1Var.L = this.b;
        h1Var.M = this.c;
        t1 t1Var2 = this.d;
        h1Var.N = t1Var2;
        View viewX = androidx.compose.ui.node.l.x(h1Var);
        androidx.compose.ui.unit.c cVar2 = androidx.compose.ui.node.l.v(h1Var).W;
        if (h1Var.Q != null) {
            androidx.compose.ui.semantics.z zVar = i1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !t1Var2.a()) || !androidx.compose.ui.unit.f.d(Float.NaN, Float.NaN) || !androidx.compose.ui.unit.f.d(Float.NaN, Float.NaN) || !t1Var2.equals(t1Var) || !viewX.equals(view) || !kotlin.jvm.internal.l.a(cVar2, cVar)) {
                h1Var.N0();
            }
        }
        h1Var.O0();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.c(Float.NaN, androidx.privacysandbox.ads.adservices.java.internal.a.c(Float.NaN, androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.c(Float.NaN, this.b.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
