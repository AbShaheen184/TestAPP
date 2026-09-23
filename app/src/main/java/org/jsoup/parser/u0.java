package org.jsoup.parser;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum u0 extends k3 {
    public u0() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @Override // org.jsoup.parser.k3
    public final void f(s0 s0Var, a aVar) {
        Locale locale;
        int iK0;
        if (aVar.g0('/')) {
            s0Var.e();
            s0Var.a(k3.I);
            return;
        }
        if (aVar.F && aVar.i0() && s0Var.o != null) {
            if (s0Var.p == null) {
                s0Var.p = "</" + s0Var.o;
            }
            String str = s0Var.p;
            boolean z = true;
            if (str.equals(aVar.I)) {
                int i = aVar.J;
                if (i == -1) {
                    z = false;
                } else if (i < aVar.A) {
                    aVar.I = str;
                    locale = Locale.ENGLISH;
                    iK0 = aVar.k0(str.toLowerCase(locale));
                    if (iK0 > -1) {
                        aVar.J = aVar.A + iK0;
                    } else {
                        int iK1 = aVar.k0(str.toUpperCase(locale));
                        if (iK1 > -1) {
                        }
                        aVar.J = z ? aVar.A + iK1 : -1;
                    }
                }
            } else {
                aVar.I = str;
                locale = Locale.ENGLISH;
                iK0 = aVar.k0(str.toLowerCase(locale));
                if (iK0 > -1) {
                    aVar.J = aVar.A + iK0;
                } else {
                    int iK2 = aVar.k0(str.toUpperCase(locale));
                    z = iK2 > -1;
                    aVar.J = z ? aVar.A + iK2 : -1;
                }
            }
            if (!z) {
                o0 o0VarD = s0Var.d(false);
                o0VarD.j(s0Var.o);
                s0Var.j = o0VarD;
                s0Var.k();
                s0Var.o(k3.E);
                return;
            }
        }
        s0Var.f('<');
        s0Var.o(k3.z);
    }
}
