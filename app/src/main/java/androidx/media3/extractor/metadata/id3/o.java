package androidx.media3.extractor.metadata.id3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {
    public final String b;
    public final String c;

    public o(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && Objects.equals(this.b, oVar.b) && this.c.equals(oVar.c);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
