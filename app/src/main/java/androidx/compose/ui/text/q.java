package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final androidx.compose.ui.text.platform.d a;
    public final int b;
    public final int c;

    public q(androidx.compose.ui.text.platform.d dVar, int i, int i2) {
        this.a = dVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b == qVar.b && this.c == qVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.c, ')');
    }
}
