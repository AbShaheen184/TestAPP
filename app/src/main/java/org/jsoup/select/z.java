package org.jsoup.select;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 {
    public final ArrayList d;
    public int e;

    public z(p pVar) {
        super(pVar);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = 2;
        arrayList.add(pVar);
        this.e = pVar.a() + this.e;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return this.e;
    }

    @Override // org.jsoup.select.c0, org.jsoup.select.p
    public final void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((p) it.next()).e();
        }
        super.e();
    }

    @Override // org.jsoup.select.c0
    public final boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        if (oVar == jVar) {
            return false;
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (oVar == null || !((p) arrayList.get(size)).d(jVar, oVar)) {
                return false;
            }
            oVar = oVar.D();
        }
        return true;
    }

    public final String toString() {
        return org.jsoup.internal.k.j(this.d, " > ");
    }
}
