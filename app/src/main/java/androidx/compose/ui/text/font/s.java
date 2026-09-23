package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final r a;
    public final k b;
    public final int c;
    public final int d;
    public final Object e;

    public s(r rVar, k kVar, int i, int i2, Object obj) {
        this.a = rVar;
        this.b = kVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.l.a(this.a, sVar.a) && kotlin.jvm.internal.l.a(this.b, sVar.b) && this.c == sVar.c && this.d == sVar.d && kotlin.jvm.internal.l.a(this.e, sVar.e);
    }

    public final int hashCode() {
        r rVar = this.a;
        int iD = androidx.privacysandbox.ads.adservices.java.internal.a.d(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
