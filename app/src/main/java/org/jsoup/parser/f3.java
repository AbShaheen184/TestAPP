package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum f3 extends k3 {
    public f3() {
        super("CdataSection", 68);
    }

    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        String strN;
        int iK0 = aVar.k0("]]>");
        if (iK0 != -1) {
            strN = a.n(aVar.z, aVar.e, aVar.A, iK0);
            aVar.A += iK0;
        } else {
            int i = aVar.B;
            int i2 = aVar.A;
            if (i - i2 < 3) {
                strN = aVar.a0();
            } else {
                int i3 = i - 2;
                strN = a.n(aVar.z, aVar.e, i2, i3 - i2);
                aVar.A = i3;
            }
        }
        s0Var.f.l(strN);
        if (aVar.e0("]]>") || aVar.c0()) {
            String strF = s0Var.f.F();
            h0 h0Var = new h0();
            com.google.android.material.internal.k kVar = h0Var.d;
            kVar.C();
            kVar.y = strF;
            s0Var.h(h0Var);
            s0Var.o(k3.e);
        }
    }
}
