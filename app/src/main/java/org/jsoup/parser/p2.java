package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum p2 extends k3 {
    public p2() {
        super("DoctypeName", 53);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.i0()) {
            s0Var.l.d.l(aVar.L());
            return;
        }
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.m(this);
            s0Var.l.d.k((char) 65533);
            return;
        }
        if (cX != ' ') {
            d1 d1Var = k3.e;
            if (cX == '>') {
                s0Var.j();
                s0Var.o(d1Var);
                return;
            }
            if (cX == 65535) {
                s0Var.l(this);
                s0Var.l.j = true;
                s0Var.j();
                s0Var.o(d1Var);
                return;
            }
            if (cX != '\t' && cX != '\n' && cX != '\f' && cX != '\r') {
                s0Var.l.d.k(cX);
                return;
            }
        }
        s0Var.o(k3.z0);
    }
}
