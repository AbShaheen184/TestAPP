package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public c(int i, String str, Object obj, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && kotlin.jvm.internal.l.a(this.d, cVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return androidx.compose.runtime.j.l(sb, this.d, ')');
    }
}
