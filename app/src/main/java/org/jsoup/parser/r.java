package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum r extends b0 {
    public r() {
        super("ForeignContent", 23);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(q0 q0Var, b bVar) {
        org.jsoup.nodes.b bVar2;
        org.jsoup.nodes.b bVar3;
        org.jsoup.nodes.b bVar4;
        org.jsoup.nodes.j jVarB;
        int iE = androidx.constraintlayout.core.g.e(q0Var.a);
        if (iE == 0) {
            bVar.z(this);
            return true;
        }
        if (iE == 1) {
            n0 n0Var = (n0) q0Var;
            if (org.jsoup.internal.k.c(n0Var.e, a0.L)) {
                return bVar.l.f(q0Var, bVar);
            }
            if (n0Var.e.equals("font") && (((bVar2 = n0Var.g) != null && bVar2.m("color") != -1) || (((bVar3 = n0Var.g) != null && bVar3.m("face") != -1) || ((bVar4 = n0Var.g) != null && bVar4.m("size") != -1)))) {
                return bVar.l.f(q0Var, bVar);
            }
            String str = bVar.b().A.e;
            bVar.N(n0Var, str);
            k3 k3VarF = bVar.i.d(n0Var.d.F(), n0Var.e, str, bVar.h.a).f();
            if (k3VarF != null) {
                boolean zEquals = n0Var.e.equals("script");
                s0 s0Var = bVar.c;
                if (zEquals) {
                    s0Var.o(k3.C);
                    return true;
                }
                s0Var.o(k3VarF);
            }
        } else if (iE == 2) {
            m0 m0Var = (m0) q0Var;
            if (m0Var.e.equals("br") || m0Var.e.equals("p")) {
                return bVar.l.f(q0Var, bVar);
            }
            if (m0Var.e.equals("script") && bVar.e.size() != 0 && (jVarB = bVar.b()) != null) {
                f0 f0Var = jVarB.A;
                if (f0Var.z.equals("script") && f0Var.e.equals("http://www.w3.org/2000/svg")) {
                    bVar.l();
                    return true;
                }
            }
            ArrayList arrayList = bVar.e;
            if (arrayList.isEmpty()) {
                kotlinx.coroutines.future.a.u("Stack unexpectedly empty");
                return false;
            }
            int size = arrayList.size() - 1;
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) arrayList.get(size);
            if (!jVar.s(m0Var.e)) {
                bVar.z(this);
            }
            while (size != 0) {
                if (jVar.s(m0Var.e)) {
                    String str2 = jVar.A.z;
                    for (int size2 = bVar.e.size() - 1; size2 >= 0 && !bVar.l().s(str2); size2--) {
                    }
                    break;
                }
                size--;
                jVar = (org.jsoup.nodes.j) arrayList.get(size);
                if (jVar.A.e.equals("http://www.w3.org/1999/xhtml")) {
                    return bVar.l.f(q0Var, bVar);
                }
            }
        } else {
            if (iE == 3) {
                bVar.K((j0) q0Var);
                return true;
            }
            if (iE == 4) {
                i0 i0Var = (i0) q0Var;
                if (b0.a(i0Var)) {
                    bVar.I(i0Var, false);
                    return true;
                }
                bVar.I(i0Var, true);
                bVar.v = false;
                return true;
            }
            if (iE != 6) {
                kotlinx.coroutines.future.a.u("Unexpected state: ".concat(org.jsoup.a.g(q0Var.a)));
                return false;
            }
        }
        return true;
    }
}
