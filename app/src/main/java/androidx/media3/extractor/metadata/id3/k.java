package androidx.media3.extractor.metadata.id3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public final String b;
    public final String c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.c.equals(kVar.c) && this.b.equals(kVar.b) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(527, 31, this.b), 31, this.c);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
