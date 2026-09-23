package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public int a() {
        return 5;
    }

    public abstract boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2);

    public boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        return false;
    }

    public final boolean d(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        if (oVar instanceof org.jsoup.nodes.j) {
            return b(jVar, (org.jsoup.nodes.j) oVar);
        }
        if ((oVar instanceof org.jsoup.nodes.n) && f()) {
            return c(jVar, (org.jsoup.nodes.n) oVar);
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public void e() {
    }
}
