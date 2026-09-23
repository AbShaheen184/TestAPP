package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.b, fVar.b) && this.c.equals(fVar.c) && this.d.equals(fVar.d) && Arrays.equals(this.e, fVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
