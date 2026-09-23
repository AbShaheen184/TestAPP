package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum n2 extends k3 {
    public n2() {
        super("Doctype", 51);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        o2 o2Var = k3.x0;
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            s0Var.o(o2Var);
            return;
        }
        if (cX != '>') {
            if (cX != 65535) {
                s0Var.m(this);
                s0Var.o(o2Var);
                return;
            }
            s0Var.l(this);
        }
        s0Var.m(this);
        k0 k0Var = s0Var.l;
        k0Var.f();
        k0Var.j = true;
        s0Var.j();
        s0Var.o(k3.e);
    }
}
