package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum y0 extends k3 {
    public y0() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.i0()) {
            s0Var.d(false);
            s0Var.o(k3.M);
        } else {
            s0Var.g("</");
            s0Var.o(k3.B);
        }
    }
}
