package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum t1 extends k3 {
    public t1() {
        super("BeforeAttributeName", 33);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cX = aVar.x();
        u1 u1Var = k3.f0;
        if (cX == 0) {
            aVar.o0();
            s0Var.m(this);
            s0Var.j.k();
            s0Var.o(u1Var);
            return;
        }
        if (cX != ' ') {
            if (cX != '\"' && cX != '\'') {
                if (cX == '/') {
                    s0Var.o(k3.m0);
                    return;
                }
                d1 d1Var = k3.e;
                if (cX == 65535) {
                    s0Var.l(this);
                    s0Var.o(d1Var);
                    return;
                }
                if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r') {
                    return;
                }
                switch (cX) {
                    case Token.CATCH_SCOPE /* 62 */:
                        s0Var.k();
                        s0Var.o(d1Var);
                        return;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        if (s0Var.j instanceof p0) {
                            return;
                        }
                        break;
                }
                s0Var.j.k();
                aVar.o0();
                s0Var.o(u1Var);
                return;
            }
            s0Var.m(this);
            s0Var.j.k();
            s0Var.j.h.k(cX);
            s0Var.o(u1Var);
        }
    }
}
