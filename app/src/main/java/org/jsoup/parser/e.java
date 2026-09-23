package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum e extends b0 {
    public e() {
        super("InColumnGroup", 11);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (b0.a(q0Var)) {
            bVar.I((i0) q0Var, false);
            return true;
        }
        int iE = androidx.constraintlayout.core.g.e(q0Var.a);
        if (iE == 0) {
            bVar.z(this);
            return true;
        }
        u uVar = b0.A;
        if (iE != 1) {
            if (iE != 2) {
                if (iE == 3) {
                    bVar.K((j0) q0Var);
                    return true;
                }
                if (iE != 6) {
                    return g(q0Var, bVar);
                }
                if (bVar.c("html")) {
                    return true;
                }
                return g(q0Var, bVar);
            }
            String strL = ((m0) q0Var).l();
            strL.getClass();
            if (strL.equals("template")) {
                uVar.f(q0Var, bVar);
                return true;
            }
            if (!strL.equals("colgroup")) {
                return g(q0Var, bVar);
            }
            if (!bVar.c(strL)) {
                bVar.z(this);
                return false;
            }
            bVar.l();
            bVar.l = b0.F;
            return true;
        }
        n0 n0Var = (n0) q0Var;
        String strL2 = n0Var.l();
        strL2.getClass();
        switch (strL2) {
            case "template":
                uVar.f(q0Var, bVar);
                return true;
            case "col":
                bVar.M(n0Var);
                return true;
            case "html":
                return b0.D.f(q0Var, bVar);
            default:
                return g(q0Var, bVar);
        }
    }

    public final boolean g(q0 q0Var, b bVar) {
        if (!bVar.c("colgroup")) {
            bVar.z(this);
            return false;
        }
        bVar.l();
        bVar.l = b0.F;
        bVar.m(q0Var);
        return true;
    }
}
