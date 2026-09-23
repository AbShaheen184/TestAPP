package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum b1 extends k3 {
    public b1() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.i0()) {
            s0Var.d(false);
            s0Var.o(k3.P);
        } else {
            s0Var.g("</");
            s0Var.o(k3.C);
        }
    }
}
