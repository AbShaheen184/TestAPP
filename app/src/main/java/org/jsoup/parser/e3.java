package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum e3 extends k3 {
    public e3() {
        super("DoctypeInternalSubset", 67);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char c;
        com.google.android.material.internal.k kVar = s0Var.l.h;
        while (true) {
            char c2 = 0;
            while (true) {
                char cX = aVar.x();
                if (cX == 0) {
                    s0Var.m(this);
                    kVar.k((char) 65533);
                } else if (cX == '\"') {
                    kVar.k(cX);
                    c = 2;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 2) {
                        break;
                    }
                } else if (cX == '\'') {
                    kVar.k(cX);
                    c = 1;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 1) {
                        break;
                    }
                } else if (cX == '-') {
                    kVar.k(cX);
                    if (c2 == 3 && aVar.e0("->")) {
                        kVar.l("->");
                        break;
                    }
                } else if (cX == '<') {
                    kVar.k(cX);
                    if (c2 == 0) {
                        if (aVar.e0("!--")) {
                            kVar.l("!--");
                            c2 = 3;
                        } else if (aVar.e0("?")) {
                            kVar.k('?');
                            c2 = 4;
                        }
                    }
                } else if (cX == '?') {
                    kVar.k(cX);
                    if (c2 == 4 && aVar.g0('>')) {
                        aVar.a();
                        kVar.k('>');
                        break;
                    }
                } else {
                    d1 d1Var = k3.e;
                    if (cX != ']') {
                        if (cX == 65535) {
                            s0Var.l(this);
                            s0Var.j();
                            s0Var.o(d1Var);
                            return;
                        }
                        kVar.k(cX);
                    } else if (c2 == 0) {
                        aVar.g();
                        int i = aVar.A;
                        int i2 = aVar.B;
                        char[] cArr = aVar.z;
                        int i3 = i;
                        while (i3 < i2 && org.jsoup.internal.k.i(cArr[i3])) {
                            i3++;
                        }
                        aVar.A = i3;
                        String strN = i3 > i ? a.n(aVar.z, aVar.e, i, i3 - i) : "";
                        if (aVar.g0('>')) {
                            aVar.a();
                            s0Var.j();
                            s0Var.o(d1Var);
                            return;
                        }
                        kVar.k(cX);
                        kVar.l(strN);
                    } else {
                        kVar.k(cX);
                    }
                }
            }
        }
    }
}
