package androidx.media3.extractor.heif;

import androidx.media3.extractor.k;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public final boolean b = false;
    public final n a = new a();

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return this.b ? org.jsoup.helper.n.N((k) oVar, false) : this.a.a(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.a.b(j, j2);
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        return this.a.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.a.d(pVar);
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        this.a.release();
    }
}
