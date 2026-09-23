package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum l extends b0 {
    public l() {
        super("AfterBody", 18);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        org.jsoup.nodes.j jVarC = bVar.C("html");
        boolean zA = b0.a(q0Var);
        x xVar = b0.D;
        if (zA) {
            if (jVarC != null) {
                bVar.J((i0) q0Var, jVarC);
                return true;
            }
            xVar.f(q0Var, bVar);
            return true;
        }
        if (q0Var.a()) {
            bVar.K((j0) q0Var);
            return true;
        }
        if (q0Var.b()) {
            bVar.z(this);
            return false;
        }
        if (q0Var.e() && ((n0) q0Var).l().equals("html")) {
            return xVar.f(q0Var, bVar);
        }
        if (q0Var.d() && ((m0) q0Var).l().equals("html")) {
            if (bVar.x) {
                bVar.z(this);
                return false;
            }
            bVar.l = b0.S;
            return true;
        }
        if (q0Var.c()) {
            return true;
        }
        bVar.z(this);
        bVar.Z();
        return bVar.m(q0Var);
    }
}
