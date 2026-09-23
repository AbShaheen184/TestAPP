package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum o2 extends k3 {
    public o2() {
        super("BeforeDoctypeName", 52);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        boolean zI0 = aVar.i0();
        p2 p2Var = k3.y0;
        if (zI0) {
            s0Var.l.f();
            s0Var.o(p2Var);
            return;
        }
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.m(this);
            k0 k0Var = s0Var.l;
            k0Var.f();
            k0Var.d.k((char) 65533);
            s0Var.o(p2Var);
            return;
        }
        if (cX != ' ') {
            if (cX == 65535) {
                s0Var.l(this);
                k0 k0Var2 = s0Var.l;
                k0Var2.f();
                k0Var2.j = true;
                s0Var.j();
                s0Var.o(k3.e);
                return;
            }
            if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r') {
                return;
            }
            s0Var.l.f();
            s0Var.l.d.k(cX);
            s0Var.o(p2Var);
        }
    }
}
