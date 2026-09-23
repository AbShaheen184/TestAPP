package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum m2 extends k3 {
    public m2() {
        super("CommentEndBang", 50);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        i2 i2Var = k3.s0;
        if (cX == 0) {
            s0Var.m(this);
            j0 j0Var = s0Var.m;
            j0Var.d.l("--!");
            j0Var.g((char) 65533);
            s0Var.o(i2Var);
            return;
        }
        if (cX == '-') {
            s0Var.m.d.l("--!");
            s0Var.o(k3.t0);
            return;
        }
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.i();
            s0Var.o(d1Var);
        } else if (cX == 65535) {
            s0Var.l(this);
            s0Var.i();
            s0Var.o(d1Var);
        } else {
            j0 j0Var2 = s0Var.m;
            j0Var2.d.l("--!");
            j0Var2.g(cX);
            s0Var.o(i2Var);
        }
    }
}
