package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum c extends b0 {
    public c() {
        super("InTableText", 9);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (q0Var.a == 5) {
            bVar.t.add(new i0((i0) q0Var));
            return true;
        }
        if (bVar.t.size() > 0) {
            q0 q0Var2 = bVar.g;
            for (i0 i0Var : bVar.t) {
                bVar.g = i0Var;
                if (b0.a(i0Var)) {
                    bVar.I(i0Var, false);
                } else {
                    bVar.z(this);
                    boolean zD = org.jsoup.internal.k.d(bVar.b().A.z, a0.z);
                    x xVar = b0.D;
                    if (zD) {
                        bVar.w = true;
                        xVar.f(i0Var, bVar);
                        bVar.w = false;
                    } else {
                        xVar.f(i0Var, bVar);
                    }
                }
            }
            bVar.g = q0Var2;
            bVar.t.clear();
        }
        bVar.l = bVar.m;
        return bVar.m(q0Var);
    }
}
