package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum c2 extends k3 {
    public c2() {
        super("SelfClosingStartTag", 41);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.j.f = true;
            s0Var.k();
            s0Var.o(d1Var);
        } else if (cX == 65535) {
            s0Var.l(this);
            s0Var.o(d1Var);
        } else {
            aVar.o0();
            s0Var.m(this);
            s0Var.o(k3.e0);
        }
    }
}
