package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum r2 extends k3 {
    public r2() {
        super("AfterDoctypePublicKeyword", 55);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            s0Var.o(k3.B0);
            return;
        }
        if (cX == '\"') {
            s0Var.m(this);
            s0Var.o(k3.C0);
            return;
        }
        if (cX == '\'') {
            s0Var.m(this);
            s0Var.o(k3.D0);
            return;
        }
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.m(this);
            s0Var.l.j = true;
            s0Var.j();
            s0Var.o(d1Var);
            return;
        }
        if (cX != 65535) {
            s0Var.m(this);
            s0Var.l.j = true;
            s0Var.o(k3.L0);
        } else {
            s0Var.l(this);
            s0Var.l.j = true;
            s0Var.j();
            s0Var.o(d1Var);
        }
    }
}
