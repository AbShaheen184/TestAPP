package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum f extends b0 {
    public f() {
        super("InTableBody", 12);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        int iE = androidx.constraintlayout.core.g.e(q0Var.a);
        z zVar = b0.F;
        if (iE == 1) {
            n0 n0Var = (n0) q0Var;
            String strL = n0Var.l();
            if (strL.equals("tr")) {
                bVar.u("tbody", "tfoot", "thead", "template");
                bVar.L(n0Var);
                bVar.l = b0.K;
                return true;
            }
            if (!org.jsoup.internal.k.d(strL, a0.u)) {
                return org.jsoup.internal.k.d(strL, a0.A) ? g(q0Var, bVar) : zVar.f(q0Var, bVar);
            }
            bVar.z(this);
            bVar.o("tr");
            return bVar.m(n0Var);
        }
        if (iE != 2) {
            return zVar.f(q0Var, bVar);
        }
        String strL2 = ((m0) q0Var).l();
        if (!org.jsoup.internal.k.d(strL2, a0.G)) {
            if (strL2.equals("table")) {
                return g(q0Var, bVar);
            }
            if (!org.jsoup.internal.k.d(strL2, a0.B)) {
                return zVar.f(q0Var, bVar);
            }
            bVar.z(this);
            return false;
        }
        if (!bVar.H(strL2)) {
            bVar.z(this);
            return false;
        }
        bVar.u("tbody", "tfoot", "thead", "template");
        bVar.l();
        bVar.l = zVar;
        return true;
    }

    public final boolean g(q0 q0Var, b bVar) {
        if (!bVar.H("tbody") && !bVar.H("thead") && !bVar.E("tfoot")) {
            bVar.z(this);
            return false;
        }
        bVar.u("tbody", "tfoot", "thead", "template");
        bVar.n(bVar.b().A.z);
        return bVar.m(q0Var);
    }
}
