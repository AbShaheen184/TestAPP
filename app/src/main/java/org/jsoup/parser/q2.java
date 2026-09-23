package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum q2 extends k3 {
    public q2() {
        super("AfterDoctypeName", 54);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        boolean zC0 = aVar.c0();
        d1 d1Var = k3.e;
        if (zC0) {
            s0Var.l(this);
            s0Var.l.j = true;
            s0Var.j();
            s0Var.o(d1Var);
            return;
        }
        if (aVar.h0('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.g0('>')) {
            s0Var.j();
            s0Var.a(d1Var);
            return;
        }
        int i = s0Var.g;
        k0 k0Var = s0Var.l;
        if (i == 2 && aVar.g0('[')) {
            k0Var.i = true;
            s0Var.a(k3.M0);
            return;
        }
        if (aVar.f0("PUBLIC")) {
            k0Var.e = "PUBLIC";
            s0Var.o(k3.A0);
        } else if (aVar.f0("SYSTEM")) {
            k0Var.e = "SYSTEM";
            s0Var.o(k3.G0);
        } else {
            s0Var.m(this);
            k0Var.j = true;
            s0Var.a(k3.L0);
        }
    }
}
