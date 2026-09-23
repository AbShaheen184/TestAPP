package coil3.request;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e o;
    public final okio.k a;
    public final kotlin.coroutines.j b;
    public final kotlin.coroutines.j c;
    public final kotlin.coroutines.j d;
    public final b e;
    public final b f;
    public final b g;
    public final kotlin.jvm.functions.l h;
    public final kotlin.jvm.functions.l i;
    public final kotlin.jvm.functions.l j;
    public final coil3.size.i k;
    public final coil3.size.g l;
    public final coil3.size.d m;
    public final coil3.i n;

    static {
        t tVar = okio.k.e;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        coil3.size.e eVar = coil3.size.i.a;
        coil3.size.d dVar = coil3.size.d.e;
        coil3.i iVar = coil3.i.b;
        kotlin.coroutines.k kVar = kotlin.coroutines.k.e;
        b bVar = b.ENABLED;
        coil3.util.k kVar2 = coil3.util.k.e;
        o = new e(tVar, kVar, io2, io3, bVar, bVar, bVar, kVar2, kVar2, kVar2, eVar, coil3.size.g.y, dVar, iVar);
    }

    public e(okio.k kVar, kotlin.coroutines.j jVar, kotlin.coroutines.j jVar2, kotlin.coroutines.j jVar3, b bVar, b bVar2, b bVar3, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, coil3.size.i iVar, coil3.size.g gVar, coil3.size.d dVar, coil3.i iVar2) {
        this.a = kVar;
        this.b = jVar;
        this.c = jVar2;
        this.d = jVar3;
        this.e = bVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = lVar;
        this.i = lVar2;
        this.j = lVar3;
        this.k = iVar;
        this.l = gVar;
        this.m = dVar;
        this.n = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.a, eVar.a) && kotlin.jvm.internal.l.a(this.b, eVar.b) && kotlin.jvm.internal.l.a(this.c, eVar.c) && kotlin.jvm.internal.l.a(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && kotlin.jvm.internal.l.a(this.h, eVar.h) && kotlin.jvm.internal.l.a(this.i, eVar.i) && kotlin.jvm.internal.l.a(this.j, eVar.j) && kotlin.jvm.internal.l.a(this.k, eVar.k) && this.l == eVar.l && this.m == eVar.m && kotlin.jvm.internal.l.a(this.n, eVar.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
