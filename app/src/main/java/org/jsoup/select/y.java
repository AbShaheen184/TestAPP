package org.jsoup.select;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends c0 {
    public static final com.google.android.material.internal.k e = new com.google.android.material.internal.k(new org.jsoup.internal.c(8));
    public final boolean d;

    public y(p pVar) {
        boolean z;
        super(pVar);
        if (pVar instanceof d) {
            for (p pVar2 : ((d) pVar).a) {
                if ((pVar2 instanceof b0) || (pVar2 instanceof a0)) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.d = z;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return this.a.a() * 10;
    }

    @Override // org.jsoup.select.c0, org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        boolean z = this.d;
        p pVar = this.a;
        if (z) {
            org.jsoup.nodes.j jVar3 = jVar2.e;
            for (org.jsoup.nodes.j jVarU = jVar3 != null ? jVar3.U() : jVar2; jVarU != null; jVarU = jVarU.t()) {
                if (jVarU != jVar2 && pVar.b(jVar2, jVarU)) {
                    return true;
                }
            }
        }
        com.google.android.material.internal.k kVar = e;
        org.jsoup.nodes.p pVar2 = (org.jsoup.nodes.p) kVar.n();
        if (pVar2.C.isInstance(jVar2)) {
            pVar2.y = jVar2;
        }
        pVar2.z = jVar2;
        pVar2.A = jVar2;
        pVar2.e = jVar2;
        pVar2.B = jVar2.D();
        while (pVar2.hasNext()) {
            try {
                pVar2.b();
                org.jsoup.nodes.o oVar = pVar2.y;
                if (oVar == null) {
                    throw new NoSuchElementException();
                }
                pVar2.A = pVar2.z;
                pVar2.z = oVar;
                pVar2.B = oVar.D();
                pVar2.y = null;
                if (oVar != jVar2 && pVar.d(jVar2, oVar)) {
                    kVar.A(pVar2);
                    return true;
                }
            } catch (Throwable th) {
                kVar.A(pVar2);
                throw th;
            }
        }
        kVar.A(pVar2);
        return false;
    }

    @Override // org.jsoup.select.c0
    public final boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
