package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum y extends b0 {
    public y() {
        super("Text", 7);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        if (q0Var.a == 5) {
            bVar.I((i0) q0Var, false);
            return true;
        }
        if (!q0Var.c()) {
            if (!q0Var.d()) {
                return true;
            }
            bVar.l();
            bVar.l = bVar.m;
            return true;
        }
        bVar.z(this);
        bVar.l();
        b0 b0Var = bVar.m;
        bVar.l = b0Var;
        if (b0Var == b0.E) {
            bVar.l = b0.D;
        }
        return bVar.m(q0Var);
    }
}
