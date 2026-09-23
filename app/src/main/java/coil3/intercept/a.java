package coil3.intercept;

import coil3.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final j a;
    public final boolean b;
    public final coil3.decode.h c;
    public final String d;

    public a(j jVar, boolean z, coil3.decode.h hVar, String str) {
        this.a = jVar;
        this.b = z;
        this.c = hVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && l.a(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
