package androidx.media3.extractor.metadata.id3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public final String b;
    public final String c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.c.equals(eVar.c) && this.b.equals(eVar.b) && Objects.equals(this.d, eVar.d);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
