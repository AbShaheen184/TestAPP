package org.jsoup.select;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public b(List list) {
        this.a.addAll(list);
        g();
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        for (int i = 0; i < this.c; i++) {
            if (!((p) this.b.get(i)).b(jVar, jVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        for (int i = 0; i < this.c; i++) {
            if (!((p) this.b.get(i)).c(jVar, nVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return org.jsoup.internal.k.j(this.a, "");
    }
}
