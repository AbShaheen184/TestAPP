package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    public final String a;
    public final org.jsoup.helper.k b;

    public j(String str, org.jsoup.helper.k kVar) {
        this.a = org.jsoup.internal.b.d(str);
        this.b = kVar;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return 8;
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        String str = this.a;
        return jVar2.q(str) && this.b.b(jVar2.d(str)).a();
    }

    public final String toString() {
        return androidx.compose.runtime.j.k("[", this.a, "~=", this.b.toString(), "]");
    }
}
