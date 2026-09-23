package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum p extends b0 {
    public p() {
        super("AfterAfterBody", 21);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (q0Var.a()) {
            bVar.K((j0) q0Var);
            return true;
        }
        if (q0Var.b() || (q0Var.e() && ((n0) q0Var).l().equals("html"))) {
            return b0.D.f(q0Var, bVar);
        }
        if (b0.a(q0Var)) {
            bVar.J((i0) q0Var, bVar.d);
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
