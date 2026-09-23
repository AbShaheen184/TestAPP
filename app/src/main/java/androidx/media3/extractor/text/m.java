package androidx.media3.extractor.text;

import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h0 {
    public final h0 a;
    public final j b;
    public l g;
    public r h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = i0.b;
    public final v c = new v();

    public m(h0 h0Var, j jVar) {
        this.a = h0Var;
        this.b = jVar;
    }

    @Override // androidx.media3.extractor.h0
    public final void b(v vVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(vVar, i, i2);
            return;
        }
        h(i);
        vVar.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(iVar, i, z);
        }
        h(i);
        int i2 = iVar.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.h0
    public final void e(r rVar) {
        rVar.o.getClass();
        String str = rVar.o;
        _COROUTINE.a.o(androidx.media3.common.i0.i(str) == 3);
        boolean zEquals = rVar.equals(this.h);
        j jVar = this.b;
        if (!zEquals) {
            this.h = rVar;
            this.g = jVar.o(rVar) ? jVar.m(rVar) : null;
        }
        l lVar = this.g;
        h0 h0Var = this.a;
        if (lVar == null) {
            h0Var.e(rVar);
            return;
        }
        q qVarA = rVar.a();
        qVarA.n = androidx.media3.common.i0.p("application/x-media3-cues");
        qVarA.j = str;
        qVarA.s = Long.MAX_VALUE;
        qVarA.L = jVar.e(rVar);
        h0Var.e(new r(qVarA));
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        if (this.g == null) {
            this.a.g(j, i, i2, i3, g0Var);
            return;
        }
        _COROUTINE.a.n("DRM on subtitles is not supported", g0Var == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.j(this.f, i4, i2, k.c, new androidx.media3.exoplayer.analytics.f(this, j, i));
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            androidx.media3.common.util.b.u("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
