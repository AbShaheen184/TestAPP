package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {
    public final Class a;
    public final String b;

    public s(Class cls, String str) {
        this.a = cls;
        this.b = "::".concat(str);
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return 1;
    }

    @Override // org.jsoup.select.t
    public final boolean g(org.jsoup.nodes.o oVar) {
        return this.a.isInstance(oVar);
    }

    public final String toString() {
        return this.b;
    }
}
