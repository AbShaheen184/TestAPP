package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum e2 extends k3 {
    public e2() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        if (aVar.e0("--")) {
            s0Var.m.f();
            s0Var.o(k3.q0);
            return;
        }
        if (aVar.f0("DOCTYPE")) {
            s0Var.o(k3.w0);
            return;
        }
        if (aVar.e0("[CDATA[")) {
            s0Var.e();
            s0Var.o(k3.N0);
            return;
        }
        if (s0Var.g != 2 || !aVar.i0()) {
            s0Var.m(this);
            s0Var.m.f();
            s0Var.o(k3.n0);
        } else {
            p0 p0Var = s0Var.n;
            p0Var.f();
            p0Var.k = true;
            s0Var.j = p0Var;
            s0Var.o(k3.G);
        }
    }
}
