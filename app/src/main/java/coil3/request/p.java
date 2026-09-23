package coil3.request;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements j {
    public final coil3.j a;
    public final g b;
    public final coil3.decode.h c;
    public final coil3.memory.a d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public p(coil3.j jVar, g gVar, coil3.decode.h hVar, coil3.memory.a aVar, String str, boolean z, boolean z2) {
        this.a = jVar;
        this.b = gVar;
        this.c = hVar;
        this.d = aVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // coil3.request.j
    public final coil3.j a() {
        return this.a;
    }

    @Override // coil3.request.j
    public final g b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.a, pVar.a) && kotlin.jvm.internal.l.a(this.b, pVar.b) && this.c == pVar.c && kotlin.jvm.internal.l.a(this.d, pVar.d) && kotlin.jvm.internal.l.a(this.e, pVar.e) && this.f == pVar.f && this.g == pVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        coil3.memory.a aVar = this.d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SuccessResult(image=" + this.a + ", request=" + this.b + ", dataSource=" + this.c + ", memoryCacheKey=" + this.d + ", diskCacheKey=" + this.e + ", isSampled=" + this.f + ", isPlaceholderCached=" + this.g + ")";
    }
}
