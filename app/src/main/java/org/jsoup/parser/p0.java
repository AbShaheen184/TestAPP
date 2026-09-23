package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends o0 {
    public boolean k;

    @Override // org.jsoup.parser.o0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ o0 f() {
        f();
        return this;
    }

    @Override // org.jsoup.parser.o0, org.jsoup.parser.q0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void f() {
        super.f();
        this.k = true;
    }

    public final String toString() {
        boolean z = this.k;
        String str = z ? "<!" : "<?";
        String str2 = z ? ">" : "?>";
        org.jsoup.nodes.b bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            StringBuilder sbP = androidx.compose.runtime.j.p(str);
            sbP.append(n());
            sbP.append(str2);
            return sbP.toString();
        }
        StringBuilder sbP2 = androidx.compose.runtime.j.p(str);
        sbP2.append(n());
        sbP2.append(" ");
        sbP2.append(this.g.toString());
        sbP2.append(str2);
        return sbP2.toString();
    }
}
