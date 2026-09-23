package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.e0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        e0Var.a(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && this.b.equals(aVar.b) && Objects.equals(this.c, aVar.c) && Arrays.equals(this.e, aVar.e);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
