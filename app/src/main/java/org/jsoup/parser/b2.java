package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum b2 extends k3 {
    public b2() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        t1 t1Var = k3.e0;
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            s0Var.o(t1Var);
            return;
        }
        if (cX == '/') {
            s0Var.o(k3.m0);
            return;
        }
        d1 d1Var = k3.e;
        if (cX == 65535) {
            s0Var.l(this);
            s0Var.o(d1Var);
        } else if (cX == '>') {
            s0Var.k();
            s0Var.o(d1Var);
        } else {
            if (cX == '?' && (s0Var.j instanceof p0)) {
                return;
            }
            aVar.o0();
            s0Var.m(this);
            s0Var.o(t1Var);
        }
    }
}
