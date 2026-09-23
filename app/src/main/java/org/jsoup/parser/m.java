package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum m extends b0 {
    public m() {
        super("Initial", 0);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (b0.a(q0Var)) {
            return true;
        }
        if (q0Var.a()) {
            bVar.K((j0) q0Var);
            return true;
        }
        boolean zB = q0Var.b();
        s sVar = b0.y;
        if (!zB) {
            bVar.d.I = 2;
            bVar.l = sVar;
            return bVar.m(q0Var);
        }
        k0 k0Var = (k0) q0Var;
        d0 d0Var = bVar.h;
        String strF = k0Var.d.F();
        d0Var.getClass();
        String strTrim = strF.trim();
        if (!d0Var.a) {
            strTrim = org.jsoup.internal.b.c(strTrim);
        }
        org.jsoup.nodes.h hVar = new org.jsoup.nodes.h(strTrim, k0Var.f.F(), k0Var.g.F());
        String str = k0Var.e;
        if (str != null) {
            hVar.e("pubSysKey", str);
        }
        bVar.d.J(hVar);
        if (k0Var.j || !hVar.d("name").equals("html") || hVar.d("publicId").equalsIgnoreCase("HTML")) {
            bVar.d.I = 2;
        }
        bVar.l = sVar;
        return true;
    }
}
