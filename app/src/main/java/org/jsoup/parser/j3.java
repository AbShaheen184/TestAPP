package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum j3 extends k3 {
    public j3() {
        super("EndTagOpen", 8);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        boolean zC0 = aVar.c0();
        d1 d1Var = k3.e;
        if (zC0) {
            s0Var.l(this);
            s0Var.g("</");
            s0Var.o(d1Var);
        } else if (aVar.i0()) {
            s0Var.d(false);
            s0Var.o(k3.G);
        } else {
            if (aVar.g0('>')) {
                s0Var.m(this);
                s0Var.a(d1Var);
                return;
            }
            s0Var.m(this);
            j0 j0Var = s0Var.m;
            j0Var.f();
            j0Var.g('/');
            s0Var.o(k3.n0);
        }
    }
}
