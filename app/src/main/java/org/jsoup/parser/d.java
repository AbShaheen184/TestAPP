package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum d extends b0 {
    public d() {
        super("InCaption", 10);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        boolean zD = q0Var.d();
        z zVar = b0.F;
        if (zD && ((m0) q0Var).l().equals("caption")) {
            if (!bVar.H("caption")) {
                bVar.z(this);
                return false;
            }
            bVar.B(false);
            if (!bVar.c("caption")) {
                bVar.z(this);
            }
            bVar.T("caption");
            bVar.t();
            bVar.l = zVar;
            return true;
        }
        if ((!q0Var.e() || !org.jsoup.internal.k.d(((n0) q0Var).l(), a0.x)) && (!q0Var.d() || !((m0) q0Var).l().equals("table"))) {
            if (!q0Var.d() || !org.jsoup.internal.k.d(((m0) q0Var).l(), a0.I)) {
                return b0.D.f(q0Var, bVar);
            }
            bVar.z(this);
            return false;
        }
        if (!bVar.H("caption")) {
            bVar.z(this);
            return false;
        }
        bVar.B(false);
        if (!bVar.c("caption")) {
            bVar.z(this);
        }
        bVar.T("caption");
        bVar.t();
        bVar.l = zVar;
        zVar.f(q0Var, bVar);
        return true;
    }
}
