package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.k1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.compose.foundation.text.x0 {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ boolean b;

    public y0(b1 b1Var, boolean z) {
        this.a = b1Var;
        this.b = z;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        b1 b1Var = this.a;
        b1Var.r.setValue(null);
        b1Var.s.setValue(null);
        b1Var.t(true);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
        b1 b1Var = this.a;
        b1Var.r.setValue(null);
        b1Var.s.setValue(null);
        b1Var.t(true);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
        k1 k1VarD;
        boolean z = this.b;
        androidx.compose.foundation.text.f0 f0Var = z ? androidx.compose.foundation.text.f0.y : androidx.compose.foundation.text.f0.z;
        b1 b1Var = this.a;
        b1Var.r.setValue(f0Var);
        long jA = j0.a(b1Var.l(z));
        androidx.compose.foundation.text.r0 r0Var = b1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return;
        }
        long jE = k1VarD.e(jA);
        b1Var.o = jE;
        b1Var.s.setValue(new androidx.compose.ui.geometry.b(jE));
        b1Var.q = 0L;
        b1Var.t = -1;
        androidx.compose.foundation.text.r0 r0Var2 = b1Var.d;
        if (r0Var2 != null) {
            r0Var2.q.setValue(Boolean.TRUE);
        }
        b1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        b1 b1Var = this.a;
        long jE = androidx.compose.ui.geometry.b.e(b1Var.q, j);
        b1Var.q = jE;
        b1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(b1Var.o, jE)));
        androidx.compose.ui.text.input.x xVarN = b1Var.n();
        androidx.compose.ui.geometry.b bVarI = b1Var.i();
        bVarI.getClass();
        b1.c(b1Var, xVarN, bVarI.a, false, this.b, a0.g, true);
        b1Var.t(false);
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
    }
}
