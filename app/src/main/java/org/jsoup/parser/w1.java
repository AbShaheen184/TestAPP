package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum w1 extends k3 {
    public w1() {
        super("BeforeAttributeValue", 36);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        a2 a2Var = k3.k0;
        if (cX == 0) {
            s0Var.m(this);
            s0Var.j.g((char) 65533, aVar.l0() - 1, aVar.l0());
            s0Var.o(a2Var);
            return;
        }
        if (cX != ' ') {
            if (cX == '\"') {
                s0Var.o(k3.i0);
                return;
            }
            if (cX != '`') {
                d1 d1Var = k3.e;
                if (cX == 65535) {
                    s0Var.l(this);
                    s0Var.k();
                    s0Var.o(d1Var);
                    return;
                }
                if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r') {
                    return;
                }
                if (cX == '&') {
                    aVar.o0();
                    s0Var.o(a2Var);
                    return;
                }
                if (cX == '\'') {
                    s0Var.o(k3.j0);
                    return;
                }
                switch (cX) {
                    case '<':
                    case '=':
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        s0Var.m(this);
                        s0Var.k();
                        s0Var.o(d1Var);
                        break;
                    default:
                        aVar.o0();
                        s0Var.o(a2Var);
                        break;
                }
                return;
            }
            s0Var.m(this);
            s0Var.j.g(cX, aVar.l0() - 1, aVar.l0());
            s0Var.o(a2Var);
        }
    }
}
