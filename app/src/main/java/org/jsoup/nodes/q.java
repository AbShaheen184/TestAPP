package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class q extends com.google.android.datatransport.runtime.j {
    public boolean C;

    public static boolean A(o oVar) {
        return (oVar instanceof v) && org.jsoup.internal.k.f(((v) oVar).J());
    }

    public boolean B(o oVar) {
        if (oVar != null && (oVar instanceof j)) {
            j jVar = (j) oVar;
            if (!jVar.s("br") && !jVar.Y()) {
                if ((jVar.A.A & 1) == 0) {
                    if (!(jVar.e instanceof g)) {
                        j jVarU = jVar.U();
                        for (int i = 0; i < 5 && jVarU != null; i++) {
                            if (!jVarU.Y() && (jVarU.A.A & 1) != 0) {
                                jVarU = jVarU.t();
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean C(o oVar) {
        if (oVar != null && oVar != ((o) this.y) && !this.C && !A(oVar)) {
            if (B(oVar)) {
                return true;
            }
            o oVarE = oVar.E();
            while (A(oVarE)) {
                oVarE = oVarE.E();
            }
            if (B(oVarE)) {
                return true;
            }
            j jVar = oVar.e;
            if (B(jVar) && !jVar.A.b(8)) {
                o oVarP = jVar.p();
                for (int i = 0; i < 5 && oVarP != null; i++) {
                    if (!(oVarP instanceof v)) {
                        if (oVarE == null) {
                            return true;
                        }
                        if ((oVarE instanceof v) || (!B(oVarE) && (oVarE instanceof j))) {
                            break;
                        }
                        return true;
                    }
                    oVarP = oVarP.u();
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final void b(j jVar, int i) {
        if (C(jVar)) {
            t(i);
        }
        jVar.B((org.jsoup.internal.b) this.z, (f) this.A);
        if (jVar.A.b(64)) {
            this.C = true;
        }
    }

    @Override // com.google.android.datatransport.runtime.j
    public final void i(n nVar, int i) {
        if (C(nVar)) {
            t(i);
        }
        nVar.B((org.jsoup.internal.b) this.z, (f) this.A);
    }

    @Override // com.google.android.datatransport.runtime.j
    public final void l(j jVar, int i) {
        o oVarP = jVar.p();
        while (A(oVarP)) {
            oVarP = oVarP.u();
        }
        if (C(oVarP)) {
            t(i);
        }
        jVar.Z((org.jsoup.internal.b) this.z, (f) this.A);
        if (this.C && jVar.A.b(64)) {
            do {
                jVar = jVar.e;
                if (jVar == null) {
                    this.C = false;
                    return;
                }
            } while ((jVar.A.A & 64) == 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r1
  0x000e: PHI (r1v3 int) = (r1v0 int), (r1v2 int), (r1v2 int) binds: [B:5:0x000c, B:27:0x004a, B:29:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.datatransport.runtime.j
    public final void m(v vVar, int i, int i2) {
        int i3 = 0;
        if (!this.C) {
            int i4 = 4;
            if (B(vVar.e)) {
                o oVarE = vVar.E();
                o oVarU = vVar.u();
                if ((!(oVarE instanceof j) || B(oVarE)) && (oVarE == null || (!(oVarE instanceof v) && C(oVarE)))) {
                    i4 = 12;
                }
                if (oVarU != null && ((oVarU instanceof v) || !C(oVarU))) {
                    while (A(oVarU)) {
                        oVarU = oVarU.u();
                    }
                    if (!(oVarU instanceof v) || !org.jsoup.internal.k.i(((n) oVarU).J().codePointAt(0))) {
                        i3 = i4;
                    }
                }
                i3 = i4 | 16;
            } else {
                i3 = i4;
            }
            if (!org.jsoup.internal.k.f(vVar.J()) && B(vVar.e) && C(vVar)) {
                t(i2);
            }
        }
        super.m(vVar, i3, i2);
    }
}
