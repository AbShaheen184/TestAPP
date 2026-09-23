package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum f2 extends k3 {
    public f2() {
        super("MarkupProcessingOpen", 44);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.i0()) {
            p0 p0Var = s0Var.n;
            p0Var.f();
            p0Var.k = false;
            s0Var.j = p0Var;
            s0Var.o(k3.G);
            return;
        }
        s0Var.m(this);
        j0 j0Var = s0Var.m;
        j0Var.f();
        j0Var.g('?');
        s0Var.o(k3.n0);
    }
}
