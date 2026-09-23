package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum z1 extends k3 {
    public z1() {
        super("Rcdata", 2);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            s0Var.m(this);
            aVar.a();
            s0Var.f((char) 65533);
        } else {
            if (cB0 == '&') {
                s0Var.a(k3.A);
                return;
            }
            if (cB0 == '<') {
                s0Var.a(k3.H);
            } else if (cB0 != 65535) {
                s0Var.g(aVar.A());
            } else {
                s0Var.h(new l0());
            }
        }
    }
}
