package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum z extends b0 {
    public z() {
        super("InTable", 8);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (q0Var.a == 5 && org.jsoup.internal.k.d(bVar.b().A.z, a0.z)) {
            bVar.t.clear();
            bVar.m = bVar.l;
            bVar.l = b0.G;
            return bVar.m(q0Var);
        }
        if (q0Var.a()) {
            bVar.K((j0) q0Var);
            return true;
        }
        if (q0Var.b()) {
            bVar.z(this);
            return false;
        }
        boolean zE = q0Var.e();
        u uVar = b0.A;
        if (!zE) {
            if (!q0Var.d()) {
                if (!q0Var.c()) {
                    g(q0Var, bVar);
                    return true;
                }
                if (bVar.c("html")) {
                    bVar.z(this);
                }
                return true;
            }
            String strL = ((m0) q0Var).l();
            if (strL.equals("table")) {
                if (!bVar.H(strL)) {
                    bVar.z(this);
                    return false;
                }
                bVar.T("table");
                bVar.a0();
                return true;
            }
            if (org.jsoup.internal.k.d(strL, a0.y)) {
                bVar.z(this);
                return false;
            }
            if (strL.equals("template")) {
                uVar.f(q0Var, bVar);
                return true;
            }
            g(q0Var, bVar);
            return true;
        }
        n0 n0Var = (n0) q0Var;
        String strL2 = n0Var.l();
        if (strL2.equals("caption")) {
            bVar.v();
            bVar.r.add(null);
            bVar.L(n0Var);
            bVar.l = b0.H;
            return true;
        }
        if (strL2.equals("colgroup")) {
            bVar.v();
            bVar.L(n0Var);
            bVar.l = b0.I;
            return true;
        }
        if (strL2.equals("col")) {
            bVar.v();
            bVar.o("colgroup");
            return bVar.m(q0Var);
        }
        if (org.jsoup.internal.k.d(strL2, a0.r)) {
            bVar.v();
            bVar.L(n0Var);
            bVar.l = b0.J;
            return true;
        }
        if (org.jsoup.internal.k.d(strL2, a0.s)) {
            bVar.v();
            bVar.o("tbody");
            return bVar.m(q0Var);
        }
        if (strL2.equals("table")) {
            bVar.z(this);
            if (bVar.H(strL2)) {
                bVar.T(strL2);
                if (bVar.a0()) {
                    return bVar.m(q0Var);
                }
                bVar.L(n0Var);
                return true;
            }
        } else {
            if (org.jsoup.internal.k.d(strL2, a0.t)) {
                return uVar.f(q0Var, bVar);
            }
            if (strL2.equals("input")) {
                org.jsoup.nodes.b bVar2 = n0Var.g;
                if (bVar2 == null || !bVar2.h("type").equalsIgnoreCase("hidden")) {
                    g(q0Var, bVar);
                    return true;
                }
                bVar.M(n0Var);
                return true;
            }
            if (!strL2.equals("form")) {
                g(q0Var, bVar);
                return true;
            }
            bVar.z(this);
            if (bVar.p == null && !bVar.Q("template")) {
                bVar.O(n0Var, false, false);
                return true;
            }
        }
        return false;
    }

    public final void g(q0 q0Var, b bVar) {
        bVar.z(this);
        bVar.w = true;
        b0.D.f(q0Var, bVar);
        bVar.w = false;
    }
}
