package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    public final byte[] b;

    public b(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && Arrays.equals(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + androidx.privacysandbox.ads.adservices.java.internal.a.g(527, 31, this.a);
    }
}
