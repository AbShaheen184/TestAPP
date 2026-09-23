package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends p {
    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        return g(jVar2);
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        return g(nVar);
    }

    @Override // org.jsoup.select.p
    public final boolean f() {
        return true;
    }

    public abstract boolean g(org.jsoup.nodes.o oVar);
}
