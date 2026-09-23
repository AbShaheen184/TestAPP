package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum k2 extends k3 {
    public k2() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        int[] iArrC = s0Var.c(null, false);
        if (iArrC == null) {
            s0Var.f('&');
        } else {
            s0Var.g(new String(iArrC, 0, iArrC.length));
        }
        s0Var.o(k3.z);
    }
}
