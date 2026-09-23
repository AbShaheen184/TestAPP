package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.k1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.compose.foundation.text.x0 {
    public androidx.compose.ui.text.l0 b;
    public final /* synthetic */ b1 d;
    public boolean a = true;
    public androidx.collection.g c = a0.d;

    public z0(b1 b1Var) {
        this.d = b1Var;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void a(long j, androidx.collection.g gVar) {
        long j2;
        k1 k1VarD;
        k1 k1VarD2;
        b1 b1Var = this.d;
        androidx.compose.runtime.j1 j1Var = b1Var.r;
        if (b1Var.k() && ((androidx.compose.foundation.text.f0) j1Var.getValue()) == null) {
            j1Var.setValue(androidx.compose.foundation.text.f0.z);
            b1Var.t = -1;
            this.a = true;
            this.c = gVar;
            b1Var.o();
            androidx.compose.foundation.text.r0 r0Var = b1Var.d;
            if (r0Var == null || (k1VarD2 = r0Var.d()) == null || !k1VarD2.c(j)) {
                j2 = j;
                androidx.compose.foundation.text.r0 r0Var2 = b1Var.d;
                if (r0Var2 != null && (k1VarD = r0Var2.d()) != null) {
                    int iJ = b1Var.b.j(k1VarD.b(j2, true));
                    androidx.compose.ui.text.input.x xVarE = b1.e(b1Var.n().a, androidx.compose.ui.text.d0.b(iJ, iJ));
                    b1Var.h(false);
                    androidx.compose.ui.hapticfeedback.a aVar = b1Var.k;
                    if (aVar != null) {
                        aVar.a(9);
                    }
                    b1Var.c.invoke(xVarE);
                    b1Var.w = new androidx.compose.ui.text.l0(xVarE.b);
                }
                this.a = false;
            } else {
                if (b1Var.n().a.y.length() == 0) {
                    return;
                }
                b1Var.h(false);
                long jC = b1.c(b1Var, androidx.compose.ui.text.input.x.a(b1Var.n(), null, androidx.compose.ui.text.l0.b, 5), j, true, false, this.c, true);
                j2 = j;
                b1Var.p = new androidx.compose.ui.text.l0(jC);
                this.b = new androidx.compose.ui.text.l0(jC);
            }
            b1Var.q(androidx.compose.foundation.text.g0.e);
            b1Var.o = j2;
            b1Var.s.setValue(new androidx.compose.ui.geometry.b(j2));
            b1Var.q = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.x0
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    @Override // androidx.compose.foundation.text.x0
    public final void e(long j) {
        k1 k1VarD;
        androidx.compose.ui.text.l0 l0Var;
        int iB;
        long jC;
        b1 b1Var = this.d;
        if (!b1Var.k() || b1Var.n().a.y.length() == 0) {
            return;
        }
        b1Var.q = androidx.compose.ui.geometry.b.e(b1Var.q, j);
        androidx.compose.foundation.text.r0 r0Var = b1Var.d;
        if (r0Var != null && (k1VarD = r0Var.d()) != null) {
            b1Var.s.setValue(new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(b1Var.o, b1Var.q)));
            if (b1Var.p == null) {
                androidx.compose.ui.geometry.b bVarI = b1Var.i();
                bVarI.getClass();
                if (k1VarD.c(bVarI.a)) {
                    l0Var = b1Var.p;
                    if (l0Var != null) {
                        iB = (int) (l0Var.a >> 32);
                    } else {
                        iB = k1VarD.b(b1Var.o, false);
                    }
                    androidx.compose.ui.geometry.b bVarI2 = b1Var.i();
                    bVarI2.getClass();
                    int iB2 = k1VarD.b(bVarI2.a, false);
                    if (b1Var.p != null && iB == iB2) {
                        return;
                    }
                    androidx.compose.ui.text.input.x xVarN = b1Var.n();
                    androidx.compose.ui.geometry.b bVarI3 = b1Var.i();
                    bVarI3.getClass();
                    jC = b1.c(b1Var, xVarN, bVarI3.a, false, false, this.c, true);
                } else {
                    int iJ = b1Var.b.j(k1VarD.b(b1Var.o, true));
                    androidx.compose.ui.text.input.q qVar = b1Var.b;
                    androidx.compose.ui.geometry.b bVarI4 = b1Var.i();
                    bVarI4.getClass();
                    androidx.collection.g gVar = iJ == qVar.j(k1VarD.b(bVarI4.a, true)) ? a0.d : a0.e;
                    androidx.compose.ui.text.input.x xVarN2 = b1Var.n();
                    androidx.compose.ui.geometry.b bVarI5 = b1Var.i();
                    bVarI5.getClass();
                    jC = b1.c(b1Var, xVarN2, bVarI5.a, false, false, gVar, true);
                }
            } else {
                l0Var = b1Var.p;
                if (l0Var != null) {
                    iB = (int) (l0Var.a >> 32);
                } else {
                    iB = k1VarD.b(b1Var.o, false);
                }
                androidx.compose.ui.geometry.b bVarI6 = b1Var.i();
                bVarI6.getClass();
                int iB3 = k1VarD.b(bVarI6.a, false);
                if (b1Var.p != null) {
                }
                androidx.compose.ui.text.input.x xVarN3 = b1Var.n();
                androidx.compose.ui.geometry.b bVarI7 = b1Var.i();
                bVarI7.getClass();
                jC = b1.c(b1Var, xVarN3, bVarI7.a, false, false, this.c, true);
            }
            this.b = new androidx.compose.ui.text.l0(jC);
            if (!androidx.compose.ui.text.l0.a(jC, b1Var.p)) {
                this.a = false;
            }
        }
        b1Var.t(false);
    }

    public final void f() {
        b1 b1Var = this.d;
        b1Var.r.setValue(null);
        b1Var.s.setValue(null);
        this.c = a0.d;
        b1Var.t(true);
        androidx.compose.ui.text.l0 l0Var = this.b;
        boolean zC = androidx.compose.ui.text.l0.c(l0Var != null ? l0Var.a : b1Var.n().b);
        b1Var.q(zC ? androidx.compose.foundation.text.g0.z : androidx.compose.foundation.text.g0.y);
        androidx.compose.foundation.text.r0 r0Var = b1Var.d;
        if (r0Var != null) {
            r0Var.m.setValue(Boolean.valueOf(!zC && coil3.svg.internal.a.C(b1Var, true)));
        }
        androidx.compose.foundation.text.r0 r0Var2 = b1Var.d;
        if (r0Var2 != null) {
            r0Var2.n.setValue(Boolean.valueOf(!zC && coil3.svg.internal.a.C(b1Var, false)));
        }
        androidx.compose.foundation.text.r0 r0Var3 = b1Var.d;
        if (r0Var3 != null) {
            r0Var3.o.setValue(Boolean.valueOf(zC && coil3.svg.internal.a.C(b1Var, true)));
        }
        if (this.a) {
            b1.b(b1Var, b1Var.p);
        }
        b1Var.p = null;
    }

    @Override // androidx.compose.foundation.text.x0
    public final void onCancel() {
        f();
    }

    @Override // androidx.compose.foundation.text.x0
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.x0
    public final void d() {
    }
}
