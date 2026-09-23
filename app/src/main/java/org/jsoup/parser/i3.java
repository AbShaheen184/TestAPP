package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum i3 extends k3 {
    public i3() {
        super("TagOpen", 7);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == '!') {
            s0Var.a(k3.o0);
            return;
        }
        if (cB0 == '/') {
            s0Var.a(k3.F);
            return;
        }
        if (cB0 == '?') {
            if (s0Var.g == 2) {
                s0Var.a(k3.p0);
                return;
            } else {
                s0Var.m.f();
                s0Var.o(k3.n0);
                return;
            }
        }
        if (aVar.i0()) {
            s0Var.d(true);
            s0Var.o(k3.G);
        } else {
            s0Var.m(this);
            s0Var.f('<');
            s0Var.o(k3.e);
        }
    }
}
