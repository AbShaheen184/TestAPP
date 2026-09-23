package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum a1 extends k3 {
    public a1() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        if (cX == '!') {
            s0Var.g("<!");
            s0Var.o(k3.Q);
            return;
        }
        if (cX == '/') {
            s0Var.e();
            s0Var.o(k3.O);
        } else if (cX != 65535) {
            s0Var.f('<');
            aVar.o0();
            s0Var.o(k3.C);
        } else {
            s0Var.f('<');
            s0Var.l(this);
            s0Var.o(k3.e);
        }
    }
}
