package coil3.request;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final kotlin.coroutines.j a;
    public final kotlin.coroutines.j b;
    public final kotlin.coroutines.j c;
    public final kotlin.jvm.functions.l d;
    public final kotlin.jvm.functions.l e;
    public final kotlin.jvm.functions.l f;
    public final coil3.size.i g;
    public final coil3.size.g h;
    public final coil3.size.d i;

    public f(kotlin.coroutines.j jVar, kotlin.coroutines.j jVar2, kotlin.coroutines.j jVar3, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, coil3.size.i iVar, coil3.size.g gVar, coil3.size.d dVar) {
        this.a = jVar;
        this.b = jVar2;
        this.c = jVar3;
        this.d = lVar;
        this.e = lVar2;
        this.f = lVar3;
        this.g = iVar;
        this.h = gVar;
        this.i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && kotlin.jvm.internal.l.a(this.b, fVar.b) && kotlin.jvm.internal.l.a(this.c, fVar.c) && kotlin.jvm.internal.l.a(this.d, fVar.d) && kotlin.jvm.internal.l.a(this.e, fVar.e) && kotlin.jvm.internal.l.a(this.f, fVar.f) && kotlin.jvm.internal.l.a(this.g, fVar.g) && this.h == fVar.h && this.i == fVar.i;
    }

    public final int hashCode() {
        kotlin.coroutines.j jVar = this.a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        kotlin.coroutines.j jVar2 = this.b;
        int iHashCode2 = (iHashCode + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        kotlin.coroutines.j jVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (jVar3 == null ? 0 : jVar3.hashCode())) * 923521;
        kotlin.jvm.functions.l lVar = this.d;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        kotlin.jvm.functions.l lVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        kotlin.jvm.functions.l lVar3 = this.f;
        int iHashCode6 = (iHashCode5 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        coil3.size.i iVar = this.g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        coil3.size.g gVar = this.h;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        coil3.size.d dVar = this.i;
        return iHashCode8 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ")";
    }
}
