package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum x1 extends k3 {
    public x1() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char c;
        aVar.l0();
        aVar.g();
        int i = aVar.A;
        int i2 = aVar.B;
        char[] cArr = aVar.z;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != 0 && c != '&' && c != '\"') {
            i3++;
        }
        aVar.A = i3;
        String strN = i3 > i ? a.n(aVar.z, aVar.e, i, i3 - i) : "";
        if (strN.length() > 0) {
            s0Var.j.i.l(strN);
        } else {
            s0Var.j.j = true;
        }
        int iL0 = aVar.l0();
        char cX = aVar.x();
        if (cX == 0) {
            s0Var.m(this);
            s0Var.j.g((char) 65533, iL0, aVar.l0());
            return;
        }
        if (cX == '\"') {
            s0Var.o(k3.l0);
            return;
        }
        if (cX != '&') {
            if (cX != 65535) {
                s0Var.j.g(cX, iL0, aVar.l0());
                return;
            } else {
                s0Var.l(this);
                s0Var.o(k3.e);
                return;
            }
        }
        int[] iArrC = s0Var.c('\"', true);
        o0 o0Var = s0Var.j;
        if (iArrC != null) {
            o0Var.h(iArrC, iL0, aVar.l0());
        } else {
            o0Var.g('&', iL0, aVar.l0());
        }
    }
}
