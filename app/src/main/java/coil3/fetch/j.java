package coil3.fetch;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {
    public final coil3.j a;
    public final boolean b;
    public final coil3.decode.h c;

    public j(coil3.j jVar, boolean z, coil3.decode.h hVar) {
        this.a = jVar;
        this.b = z;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b == jVar.b && this.c == jVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
