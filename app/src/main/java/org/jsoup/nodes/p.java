package org.jsoup.nodes;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator {
    public o A;
    public o B;
    public final Class C;
    public o e;
    public o y;
    public o z;

    public p(o oVar, Class cls) {
        org.jsoup.helper.n.D(oVar);
        this.C = cls;
        if (cls.isInstance(oVar)) {
            this.y = oVar;
        }
        this.z = oVar;
        this.A = oVar;
        this.e = oVar;
        this.B = oVar.D();
    }

    public final void b() {
        o oVar;
        if (this.y != null) {
            return;
        }
        if (this.B != null && this.z.e == null) {
            this.z = this.A;
        }
        o oVarD = this.z;
        do {
            oVar = null;
            if (oVarD.j() > 0) {
                oVarD = oVarD.i(0);
            } else {
                o oVar2 = this.e;
                oVar2.getClass();
                if (oVar2 == oVarD) {
                    oVarD = null;
                } else if (oVarD.u() != null) {
                    oVarD = oVarD.u();
                } else {
                    do {
                        oVarD = oVarD.D();
                        if (oVarD != null) {
                            o oVar3 = this.e;
                            oVar3.getClass();
                            if (oVar3 == oVarD) {
                            }
                        }
                        this.y = oVar;
                    } while (oVarD.u() == null);
                    oVarD = oVarD.u();
                }
            }
            if (oVarD == null) {
            }
            this.y = oVar;
        } while (!this.C.isInstance(oVarD));
        oVar = oVarD;
        this.y = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.y != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        o oVar = this.y;
        if (oVar == null) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.A = this.z;
        this.z = oVar;
        this.B = oVar.D();
        this.y = null;
        return oVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.z.F();
    }
}
