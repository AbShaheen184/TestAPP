package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum t2 extends k3 {
    public t2() {
        super("DoctypePublicIdentifier_doubleQuoted", 57);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.m(this);
            s0Var.l.f.k((char) 65533);
            return;
        }
        if (cX == '\"') {
            s0Var.o(k3.E0);
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
            s0Var.l.f.k(cX);
            return;
        }
        s0Var.l(this);
        s0Var.l.j = true;
        s0Var.j();
        s0Var.o(d1Var);
    }
}
