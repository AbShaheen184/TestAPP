package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum n1 extends k3 {
    public n1() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            s0Var.m(this);
            aVar.a();
            s0Var.f((char) 65533);
        } else if (cB0 == '-') {
            s0Var.f(cB0);
            s0Var.a(k3.a0);
        } else if (cB0 == '<') {
            s0Var.f(cB0);
            s0Var.a(k3.c0);
        } else if (cB0 != 65535) {
            s0Var.g(aVar.Y('-', '<', 0));
        } else {
            s0Var.l(this);
            s0Var.o(k3.e);
        }
    }
}
