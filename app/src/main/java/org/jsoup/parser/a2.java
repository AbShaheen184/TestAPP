package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum a2 extends k3 {
    public a2() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        aVar.l0();
        String strZ = aVar.Z(k3.P0);
        if (strZ.length() > 0) {
            s0Var.j.i.l(strZ);
        }
        int iL0 = aVar.l0();
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.m(this);
            s0Var.j.g((char) 65533, iL0, aVar.l0());
            return;
        }
        if (cX != ' ') {
            if (cX != '\"' && cX != '`') {
                d1 d1Var = k3.e;
                if (cX == 65535) {
                    s0Var.l(this);
                    s0Var.o(d1Var);
                    return;
                }
                if (cX != '\t' && cX != '\n' && cX != '\f' && cX != '\r') {
                    if (cX == '&') {
                        int[] iArrC = s0Var.c('>', true);
                        o0 o0Var = s0Var.j;
                        if (iArrC != null) {
                            o0Var.h(iArrC, iL0, aVar.l0());
                            return;
                        } else {
                            o0Var.g('&', iL0, aVar.l0());
                            return;
                        }
                    }
                    if (cX != '\'') {
                        switch (cX) {
                            case '<':
                            case '=':
                                break;
                            case Token.CATCH_SCOPE /* 62 */:
                                s0Var.k();
                                s0Var.o(d1Var);
                                break;
                            default:
                                s0Var.j.g(cX, iL0, aVar.l0());
                                break;
                        }
                        return;
                    }
                }
            }
            s0Var.m(this);
            s0Var.j.g(cX, iL0, aVar.l0());
            return;
        }
        s0Var.o(k3.e0);
    }
}
