package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum g2 extends k3 {
    public g2() {
        super("CommentStart", 45);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        i2 i2Var = k3.s0;
        if (cX == 0) {
            s0Var.m(this);
            s0Var.m.g((char) 65533);
            s0Var.o(i2Var);
            return;
        }
        if (cX == '-') {
            s0Var.o(k3.r0);
            return;
        }
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.m(this);
            s0Var.i();
            s0Var.o(d1Var);
        } else if (cX != 65535) {
            aVar.o0();
            s0Var.o(i2Var);
        } else {
            s0Var.l(this);
            s0Var.i();
            s0Var.o(d1Var);
        }
    }
}
