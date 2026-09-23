package coil3.request;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final Context a;
    public final coil3.size.h b;
    public final coil3.size.g c;
    public final coil3.size.d d;
    public final String e;
    public final okio.k f;
    public final b g;
    public final b h;
    public final b i;
    public final coil3.i j;

    public n(Context context, coil3.size.h hVar, coil3.size.g gVar, coil3.size.d dVar, String str, okio.k kVar, b bVar, b bVar2, b bVar3, coil3.i iVar) {
        this.a = context;
        this.b = hVar;
        this.c = gVar;
        this.d = dVar;
        this.e = str;
        this.f = kVar;
        this.g = bVar;
        this.h = bVar2;
        this.i = bVar3;
        this.j = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.a, nVar.a) && kotlin.jvm.internal.l.a(this.b, nVar.b) && this.c == nVar.c && this.d == nVar.d && kotlin.jvm.internal.l.a(this.e, nVar.e) && kotlin.jvm.internal.l.a(this.f, nVar.f) && this.g == nVar.g && this.h == nVar.h && this.i == nVar.i && kotlin.jvm.internal.l.a(this.j, nVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}
