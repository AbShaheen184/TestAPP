package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum x2 extends k3 {
    public x2() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            return;
        }
        if (cX == '\"') {
            s0Var.m(this);
            s0Var.o(k3.I0);
            return;
        }
        if (cX == '\'') {
            s0Var.m(this);
            s0Var.o(k3.J0);
            return;
        }
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.j();
            s0Var.o(d1Var);
            return;
        }
        d3 d3Var = k3.L0;
        if (cX != '[') {
            if (cX != 65535) {
                s0Var.m(this);
                s0Var.l.j = true;
                s0Var.o(d3Var);
                return;
            } else {
                s0Var.l(this);
                s0Var.l.j = true;
                s0Var.j();
                s0Var.o(d1Var);
                return;
            }
        }
        int i = s0Var.g;
        k0 k0Var = s0Var.l;
        if (i == 2) {
            k0Var.i = true;
            s0Var.o(k3.M0);
        } else {
            s0Var.m(this);
            k0Var.j = true;
            s0Var.o(d3Var);
        }
    }
}
