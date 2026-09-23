package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum k extends b0 {
    public k() {
        super("InTemplate", 17);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        int iE = androidx.constraintlayout.core.g.e(q0Var.a);
        x xVar = b0.D;
        if (iE != 0) {
            u uVar = b0.A;
            if (iE == 1) {
                String strL = ((n0) q0Var).l();
                if (org.jsoup.internal.k.d(strL, a0.J)) {
                    uVar.f(q0Var, bVar);
                    return true;
                }
                if (org.jsoup.internal.k.d(strL, a0.K)) {
                    bVar.U();
                    z zVar = b0.F;
                    bVar.V(zVar);
                    bVar.l = zVar;
                    return bVar.m(q0Var);
                }
                if (strL.equals("col")) {
                    bVar.U();
                    e eVar = b0.I;
                    bVar.V(eVar);
                    bVar.l = eVar;
                    return bVar.m(q0Var);
                }
                if (strL.equals("tr")) {
                    bVar.U();
                    f fVar = b0.J;
                    bVar.V(fVar);
                    bVar.l = fVar;
                    return bVar.m(q0Var);
                }
                if (!strL.equals("td") && !strL.equals("th")) {
                    bVar.U();
                    bVar.V(xVar);
                    bVar.l = xVar;
                    return bVar.m(q0Var);
                }
                bVar.U();
                g gVar = b0.K;
                bVar.V(gVar);
                bVar.l = gVar;
                return bVar.m(q0Var);
            }
            if (iE == 2) {
                if (((m0) q0Var).l().equals("template")) {
                    uVar.f(q0Var, bVar);
                    return true;
                }
                bVar.z(this);
                return false;
            }
            if (iE != 3 && iE != 4) {
                if (iE != 6) {
                    kotlinx.coroutines.future.a.u("Unexpected state: ".concat(org.jsoup.a.g(q0Var.a)));
                    return false;
                }
                if (bVar.Q("template")) {
                    bVar.z(this);
                    bVar.T("template");
                    bVar.t();
                    bVar.U();
                    bVar.a0();
                    if (bVar.l != b0.O && bVar.s.size() < 12) {
                        return bVar.m(q0Var);
                    }
                }
                return true;
            }
        }
        xVar.f(q0Var, bVar);
        return true;
    }
}
