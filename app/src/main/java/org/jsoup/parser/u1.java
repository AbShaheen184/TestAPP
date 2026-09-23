package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum u1 extends k3 {
    public u1() {
        super("AttributeName", 34);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        aVar.l0();
        String strZ = aVar.Z(k3.O0);
        o0 o0Var = s0Var.j;
        o0Var.getClass();
        o0Var.h.l(strZ.replace((char) 0, (char) 65533));
        char cX = aVar.x();
        v1 v1Var = k3.g0;
        if (cX == '\t' || cX == '\n' || cX == '\f' || cX == '\r' || cX == ' ') {
            s0Var.o(v1Var);
            return;
        }
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
            switch (cX) {
                case '=':
                    s0Var.o(k3.h0);
                    return;
                case Token.CATCH_SCOPE /* 62 */:
                    s0Var.k();
                    s0Var.o(d1Var);
                    return;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (s0Var.g == 2 && (s0Var.j instanceof p0)) {
                        s0Var.o(v1Var);
                        return;
                    }
                    break;
            }
            s0Var.j.h.k(cX);
            return;
        }
        s0Var.m(this);
        s0Var.j.h.k(cX);
    }
}
