package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum p1 extends k3 {
    public p1() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        n1 n1Var = k3.Z;
        if (cX == 0) {
            s0Var.m(this);
            s0Var.f((char) 65533);
            s0Var.o(n1Var);
        } else if (cX == '-') {
            s0Var.f(cX);
            s0Var.o(k3.b0);
        } else if (cX == '<') {
            s0Var.f(cX);
            s0Var.o(k3.c0);
        } else if (cX != 65535) {
            s0Var.f(cX);
            s0Var.o(n1Var);
        } else {
            s0Var.l(this);
            s0Var.o(k3.e);
        }
    }
}
