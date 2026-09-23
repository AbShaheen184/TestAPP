package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum j extends b0 {
    public j() {
        super("InSelectInTable", 16);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        boolean zE = q0Var.e();
        String[] strArr = a0.F;
        if (zE && org.jsoup.internal.k.d(((n0) q0Var).l(), strArr)) {
            bVar.z(this);
            bVar.T("select");
            bVar.a0();
            return bVar.m(q0Var);
        }
        if (q0Var.d()) {
            m0 m0Var = (m0) q0Var;
            if (org.jsoup.internal.k.d(m0Var.l(), strArr)) {
                bVar.z(this);
                if (!bVar.H(m0Var.l())) {
                    return false;
                }
                bVar.T("select");
                bVar.a0();
                return bVar.m(q0Var);
            }
        }
        return b0.M.f(q0Var, bVar);
    }
}
