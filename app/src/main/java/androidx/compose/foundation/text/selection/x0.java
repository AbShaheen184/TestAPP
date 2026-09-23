package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.k1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements androidx.compose.foundation.text.x0 {
    public final /* synthetic */ b1 a;

    public x0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
        k1 k1VarD;
        b1 b1Var = this.a;
        long jA = j0.a(b1Var.l(true));
        androidx.compose.foundation.text.r0 r0Var = b1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        long jE = k1VarD.e(jA);
        b1Var.o = jE;
        b1Var.s.setValue(new androidx.compose.ui.geometry.b(jE));
        b1Var.q = 0L;
        b1Var.r.setValue(androidx.compose.foundation.text.f0.e);
        b1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        b1 b1Var = this.a;
        b1Var.r.setValue(null);
        b1Var.s.setValue(null);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
        b1 b1Var = this.a;
        b1Var.r.setValue(null);
        b1Var.s.setValue(null);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        k1 k1VarD;
        androidx.compose.ui.hapticfeedback.a aVar;
        b1 b1Var = this.a;
        b1Var.q = androidx.compose.ui.geometry.b.e(b1Var.q, j);
        androidx.compose.foundation.text.r0 r0Var = b1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        b1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(b1Var.o, b1Var.q)));
        androidx.compose.ui.text.input.q qVar = b1Var.b;
        androidx.compose.ui.geometry.b bVarI = b1Var.i();
        bVarI.getClass();
        int iJ = qVar.j(k1VarD.b(bVarI.a, true));
        long jB = androidx.compose.ui.text.d0.b(iJ, iJ);
        if (androidx.compose.ui.text.l0.b(jB, b1Var.n().b)) {
            return;
        }
        androidx.compose.foundation.text.r0 r0Var2 = b1Var.d;
        if ((r0Var2 == null || ((Boolean) r0Var2.q.getValue()).booleanValue()) && (aVar = b1Var.k) != null) {
            aVar.a(9);
        }
        b1Var.c.invoke(b1.e(b1Var.n().a, jB));
        b1Var.w = new androidx.compose.ui.text.l0(jB);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
    }
}
