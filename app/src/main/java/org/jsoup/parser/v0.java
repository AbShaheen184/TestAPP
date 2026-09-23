package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum v0 extends k3 {
    public v0() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (!aVar.i0()) {
            s0Var.g("</");
            s0Var.o(k3.z);
            return;
        }
        s0Var.d(false);
        o0 o0Var = s0Var.j;
        char cB0 = aVar.b0();
        o0Var.getClass();
        o0Var.i(String.valueOf(cB0));
        s0Var.f.k(aVar.b0());
        s0Var.a(k3.J);
    }
}
