package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum h1 extends k3 {
    public h1() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.c0()) {
            s0Var.l(this);
            s0Var.o(k3.e);
            return;
        }
        char cX = aVar.x();
        g1 g1Var = k3.S;
        if (cX == 0) {
            s0Var.m(this);
            s0Var.f((char) 65533);
            s0Var.o(g1Var);
        } else if (cX == '-') {
            s0Var.f(cX);
            s0Var.o(k3.U);
        } else if (cX == '<') {
            s0Var.o(k3.V);
        } else {
            s0Var.f(cX);
            s0Var.o(g1Var);
        }
    }
}
