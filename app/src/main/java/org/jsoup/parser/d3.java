package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum d3 extends k3 {
    public d3() {
        super("BogusDoctype", 66);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        d1 d1Var = k3.e;
        if (cX == '>') {
            s0Var.j();
            s0Var.o(d1Var);
        } else {
            if (cX != 65535) {
                return;
            }
            s0Var.j();
            s0Var.o(d1Var);
        }
    }
}
