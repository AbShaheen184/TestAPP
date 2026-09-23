package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum n extends b0 {
    public n() {
        super("InFrameset", 19);
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
        if (!q0Var.e()) {
            if (q0Var.d() && ((m0) q0Var).l().equals("frameset")) {
                if (!bVar.c("frameset")) {
                    bVar.z(this);
                    return false;
                }
                bVar.l();
                if (!bVar.x && !bVar.c("frameset")) {
                    bVar.l = b0.R;
                    return true;
                }
            } else {
                if (!q0Var.c()) {
                    bVar.z(this);
                    return false;
                }
                if (!bVar.c("html")) {
                    bVar.z(this);
                }
            }
            return true;
        }
        n0 n0Var = (n0) q0Var;
        String strL = n0Var.l();
        strL.getClass();
        switch (strL) {
            case "frameset":
                bVar.L(n0Var);
                return true;
            case "html":
                return b0.D.f(n0Var, bVar);
            case "frame":
                bVar.M(n0Var);
                return true;
            case "noframes":
                return b0.A.f(n0Var, bVar);
            default:
                bVar.z(this);
                return false;
        }
    }
}
