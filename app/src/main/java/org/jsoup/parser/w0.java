package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum w0 extends k3 {
    public w0() {
        super("RCDATAEndTagName", 12);
    }

    public static void g(s0 s0Var, a aVar) {
        s0Var.g("</");
        s0Var.g(s0Var.f.F());
        aVar.o0();
        s0Var.o(k3.z);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.i0()) {
            String strN = aVar.N(new kotlinx.coroutines.future.a());
            s0Var.j.i(strN);
            s0Var.f.l(strN);
            return;
        }
        char cX = aVar.x();
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            if (s0Var.n()) {
                s0Var.o(k3.e0);
                return;
            } else {
                g(s0Var, aVar);
                return;
            }
        }
        if (cX == '/') {
            if (s0Var.n()) {
                s0Var.o(k3.m0);
                return;
            } else {
                g(s0Var, aVar);
                return;
            }
        }
        if (cX != '>') {
            g(s0Var, aVar);
        } else if (!s0Var.n()) {
            g(s0Var, aVar);
        } else {
            s0Var.k();
            s0Var.o(k3.e);
        }
    }
}
