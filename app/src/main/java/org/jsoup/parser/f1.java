package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum f1 extends k3 {
    public f1() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (!aVar.g0('-')) {
            s0Var.o(k3.C);
        } else {
            s0Var.f('-');
            s0Var.a(k3.U);
        }
    }
}
