package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {
    @Override // org.jsoup.parser.o0, org.jsoup.parser.q0
    /* JADX INFO: renamed from: m */
    public final o0 f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f ? "/>" : ">";
        org.jsoup.nodes.b bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            return "<" + n() + str;
        }
        return "<" + n() + " " + this.g.toString() + str;
    }
}
