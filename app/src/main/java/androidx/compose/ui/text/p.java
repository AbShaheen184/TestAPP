package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final a a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public p(a aVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final androidx.compose.ui.geometry.c a(androidx.compose.ui.geometry.c cVar) {
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = l0.b;
            if (l0.b(j, j2)) {
                return j2;
            }
        }
        int i = l0.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return d0.b(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final androidx.compose.ui.geometry.c c(androidx.compose.ui.geometry.c cVar) {
        float f = -this.f;
        return cVar.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return kotlin.collections.i0.d(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && Float.compare(this.f, pVar.f) == 0 && Float.compare(this.g, pVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.g, ')');
    }
}
