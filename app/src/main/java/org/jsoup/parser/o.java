package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum o extends b0 {
    public o() {
        super("AfterFrameset", 20);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (b0.a(q0Var)) {
            bVar.I((i0) q0Var, false);
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
            return b0.D.f(q0Var, bVar);
        }
        if (q0Var.d() && ((m0) q0Var).l().equals("html")) {
            bVar.l = b0.T;
            return true;
        }
        if (q0Var.e() && ((n0) q0Var).l().equals("noframes")) {
            return b0.A.f(q0Var, bVar);
        }
        if (q0Var.c()) {
            return true;
        }
        bVar.z(this);
        return false;
    }
}
