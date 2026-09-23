package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum t0 extends k3 {
    public t0() {
        super("TagName", 9);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        s0Var.j.i(aVar.N(new kotlinx.coroutines.future.a()));
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.j.i(k3.Q0);
            return;
        }
        if (cX != ' ') {
            if (cX == '/') {
                s0Var.o(k3.m0);
                return;
            }
            d1 d1Var = k3.e;
            if (cX == '>') {
                s0Var.k();
                s0Var.o(d1Var);
                return;
            }
            if (cX == 65535) {
                s0Var.l(this);
                s0Var.o(d1Var);
                return;
            } else if (cX != '\t' && cX != '\n' && cX != '\f' && cX != '\r') {
                o0 o0Var = s0Var.j;
                o0Var.getClass();
                o0Var.i(String.valueOf(cX));
                return;
            }
        }
        s0Var.o(k3.e0);
    }
}
