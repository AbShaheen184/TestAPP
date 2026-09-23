package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.source.w0;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a {
    public final int L;
    public final r M;
    public long N;
    public boolean O;

    public m(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, long j, long j2, long j3, int i2, r rVar2) {
        super(hVar, lVar, rVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.L = i2;
        this.M = rVar2;
    }

    @Override // androidx.media3.exoplayer.source.chunk.k
    public final boolean b() {
        return this.O;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void f() {
        y yVar = this.F;
        androidx.localbroadcastmanager.content.b bVar = this.J;
        bVar.getClass();
        int iA = 0;
        for (w0 w0Var : (w0[]) bVar.z) {
            if (w0Var.H != 0) {
                w0Var.H = 0L;
                w0Var.B = true;
            }
        }
        h0 h0VarH = bVar.H(this.L);
        h0VarH.e(this.M);
        try {
            long jT = yVar.t(this.y.c(this.N));
            if (jT != -1) {
                jT += this.N;
            }
            androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(this.F, this.N, jT);
            while (true) {
                long j = this.N;
                if (iA == -1) {
                    h0VarH.g(this.D, 1, (int) j, 0, null);
                    com.google.android.gms.dynamite.g.l(yVar);
                    this.O = true;
                    return;
                }
                this.N = j + ((long) iA);
                iA = h0VarH.a(kVar, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            com.google.android.gms.dynamite.g.l(yVar);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void i() {
    }
}
