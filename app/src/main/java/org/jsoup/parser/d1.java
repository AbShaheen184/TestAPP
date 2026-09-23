package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum d1 extends k3 {
    public d1() {
        super("Data", 0);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            s0Var.m(this);
            s0Var.f(aVar.x());
        } else {
            if (cB0 == '&') {
                s0Var.a(k3.y);
                return;
            }
            if (cB0 == '<') {
                s0Var.a(k3.E);
            } else if (cB0 != 65535) {
                s0Var.g(aVar.A());
            } else {
                s0Var.h(new l0());
            }
        }
    }
}
