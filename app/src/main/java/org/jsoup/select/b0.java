package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {
    @Override // org.jsoup.select.p
    public final int a() {
        return this.a.a() * 3;
    }

    @Override // org.jsoup.select.c0
    public final boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        if (jVar == oVar) {
            return false;
        }
        org.jsoup.nodes.j jVar2 = oVar.e;
        for (org.jsoup.nodes.o oVarP = jVar2 != null ? jVar2.p() : oVar; oVarP != null && oVarP != oVar; oVarP = oVarP.u()) {
            if (h(jVar, oVarP)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}
