package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum t extends b0 {
    public t() {
        super("BeforeHead", 2);
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
        if (q0Var.e()) {
            n0 n0Var = (n0) q0Var;
            if (n0Var.l().equals("head")) {
                bVar.o = bVar.L(n0Var);
                bVar.l = b0.A;
                return true;
            }
        }
        if (q0Var.d() && org.jsoup.internal.k.d(((m0) q0Var).l(), a0.e)) {
            bVar.o("head");
            return bVar.m(q0Var);
        }
        if (q0Var.d()) {
            bVar.z(this);
            return false;
        }
        bVar.o("head");
        return bVar.m(q0Var);
    }
}
