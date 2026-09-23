package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.datasource.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    public final e G;
    public androidx.localbroadcastmanager.content.b H;
    public long I;
    public volatile boolean J;

    public j(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, e eVar) {
        super(hVar, lVar, 2, rVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.G = eVar;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void f() {
        if (this.I == 0) {
            this.G.b(this.H, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            androidx.media3.datasource.l lVarC = this.y.c(this.I);
            y yVar = this.F;
            androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(yVar, lVarC.f, yVar.t(lVarC));
            while (!this.J) {
                try {
                    int iC = this.G.e.c(kVar, e.H);
                    boolean z = false;
                    _COROUTINE.a.A(iC != 1);
                    if (iC == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } catch (Throwable th) {
                    this.I = kVar.A - this.y.f;
                    this.G.a();
                    throw th;
                }
            }
            this.I = kVar.A - this.y.f;
            this.G.a();
            com.google.android.gms.dynamite.g.l(this.F);
        } catch (Throwable th2) {
            com.google.android.gms.dynamite.g.l(this.F);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void i() {
        this.J = true;
    }
}
