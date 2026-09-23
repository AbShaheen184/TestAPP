package coil3;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final Context a;
    public final coil3.request.e b;
    public final kotlin.o c;
    public final kotlin.o d;
    public final kotlin.o e;
    public final d f;
    public final androidx.media3.exoplayer.hls.c g;

    public n(Context context, coil3.request.e eVar, kotlin.o oVar, kotlin.o oVar2, kotlin.o oVar3, d dVar, androidx.media3.exoplayer.hls.c cVar) {
        this.a = context;
        this.b = eVar;
        this.c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f = dVar;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!kotlin.jvm.internal.l.a(this.a, nVar.a) || !this.b.equals(nVar.b) || !this.c.equals(nVar.c) || !this.d.equals(nVar.d) || !this.e.equals(nVar.e)) {
            return false;
        }
        Object obj2 = g.a;
        return obj2.equals(obj2) && this.f.equals(nVar.f) && kotlin.jvm.internal.l.a(this.g, nVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((g.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        androidx.media3.exoplayer.hls.c cVar = this.g;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + g.a + ", componentRegistry=" + this.f + ", logger=" + this.g + ")";
    }
}
