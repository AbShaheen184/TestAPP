package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum d2 extends k3 {
    public d2() {
        super("BogusComment", 42);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        j0 j0Var = s0Var.m;
        j0Var.d.l(aVar.X('>'));
        char cB0 = aVar.b0();
        if (cB0 == '>' || cB0 == 65535) {
            aVar.x();
            s0Var.i();
            s0Var.o(k3.e);
        }
    }
}
