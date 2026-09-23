package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum w extends b0 {
    public w() {
        super("AfterHead", 5);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (b0.a(q0Var)) {
            bVar.I((i0) q0Var, false);
        } else if (q0Var.a()) {
            bVar.K((j0) q0Var);
        } else if (q0Var.b()) {
            bVar.z(this);
        } else {
            boolean zE = q0Var.e();
            u uVar = b0.A;
            if (zE) {
                n0 n0Var = (n0) q0Var;
                String strL = n0Var.l();
                boolean zEquals = strL.equals("html");
                x xVar = b0.D;
                if (zEquals) {
                    return xVar.f(q0Var, bVar);
                }
                if (strL.equals("body")) {
                    bVar.L(n0Var);
                    bVar.v = false;
                    bVar.l = xVar;
                } else if (strL.equals("frameset")) {
                    bVar.L(n0Var);
                    bVar.l = b0.Q;
                } else if (org.jsoup.internal.k.d(strL, a0.g)) {
                    bVar.z(this);
                    org.jsoup.nodes.j jVar = bVar.o;
                    bVar.e.add(jVar);
                    uVar.f(q0Var, bVar);
                    bVar.Y(jVar);
                } else {
                    if (strL.equals("head")) {
                        bVar.z(this);
                        return false;
                    }
                    bVar.o("body");
                    bVar.v = true;
                    bVar.m(q0Var);
                }
            } else if (q0Var.d()) {
                String strL2 = ((m0) q0Var).l();
                if (org.jsoup.internal.k.d(strL2, a0.d)) {
                    bVar.o("body");
                    bVar.v = true;
                    bVar.m(q0Var);
                } else {
                    if (!strL2.equals("template")) {
                        bVar.z(this);
                        return false;
                    }
                    uVar.f(q0Var, bVar);
                }
            } else {
                bVar.o("body");
                bVar.v = true;
                bVar.m(q0Var);
            }
        }
        return true;
    }
}
