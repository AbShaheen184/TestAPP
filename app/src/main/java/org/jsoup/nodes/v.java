package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class v extends n {
    public static boolean O(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.o
    public void B(org.jsoup.internal.b bVar, f fVar) {
        String strJ = J();
        char[] cArr = l.a;
        l.c(strJ, bVar, fVar.e, fVar.y, 1);
    }

    @Override // org.jsoup.nodes.o
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public v l() {
        return (v) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final String toString() {
        return z();
    }

    @Override // org.jsoup.nodes.o
    public String v() {
        return "#text";
    }
}
