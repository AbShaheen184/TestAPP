package androidx.media3.exoplayer.source;

import androidx.compose.animation.core.t2;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements u, androidx.media3.exoplayer.upstream.i {
    public final t2 A;
    public final androidx.media3.exoplayer.drm.d B;
    public final j1 C;
    public final ArrayList D = new ArrayList();
    public final long E;
    public final androidx.media3.exoplayer.upstream.n F;
    public final androidx.media3.common.r G;
    public final boolean H;
    public boolean I;
    public byte[] J;
    public int K;
    public final androidx.media3.datasource.l e;
    public final androidx.media3.datasource.g y;
    public final androidx.media3.exoplayer.upstream.f z;

    public e1(androidx.media3.datasource.l lVar, androidx.media3.datasource.g gVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.common.r rVar, long j, t2 t2Var, androidx.media3.exoplayer.drm.d dVar, boolean z, androidx.media3.exoplayer.util.a aVar) {
        this.e = lVar;
        this.y = gVar;
        this.z = fVar;
        this.G = rVar;
        this.E = j;
        this.A = t2Var;
        this.B = dVar;
        this.H = z;
        this.C = new j1(new androidx.media3.common.w0("", rVar));
        this.F = aVar != null ? new androidx.media3.exoplayer.upstream.n(aVar) : new androidx.media3.exoplayer.upstream.n("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        if (this.I) {
            return false;
        }
        androidx.media3.exoplayer.upstream.n nVar = this.F;
        if (nVar.d() || nVar.c()) {
            return false;
        }
        androidx.media3.datasource.h hVarB = this.y.b();
        androidx.media3.exoplayer.upstream.f fVar = this.z;
        if (fVar != null) {
            hVarB.c(fVar);
        }
        nVar.f(new d1(hVarB, this.e), this, this.A.f(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h f(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.h hVar;
        d1 d1Var = (d1) kVar;
        androidx.media3.datasource.y yVar = d1Var.y;
        n nVar = new n(d1Var.e, yVar.z, yVar.A, j, j2, yVar.y);
        androidx.media3.common.util.i0.d0(this.E);
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iOException, i, 3);
        t2 t2Var = this.A;
        long jG = t2Var.g(lVar);
        boolean z = jG == -9223372036854775807L || i >= t2Var.f(1);
        if (this.H && z) {
            androidx.media3.common.util.b.u("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.I = true;
            hVar = androidx.media3.exoplayer.upstream.n.e;
        } else {
            hVar = jG != -9223372036854775807L ? new androidx.media3.exoplayer.upstream.h(jG, 0, false) : androidx.media3.exoplayer.upstream.n.f;
        }
        androidx.media3.exoplayer.upstream.h hVar2 = hVar;
        this.B.e(nVar, 1, -1, this.G, 0, null, 0L, this.E, iOException, !hVar2.a());
        return hVar2;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        return (this.I || this.F.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i >= arrayList.size()) {
                return j;
            }
            c1 c1Var = (c1) arrayList.get(i);
            if (c1Var.e == 2) {
                c1Var.e = 1;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long m(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < qVarArr.length; i++) {
            x0 x0Var = x0VarArr[i];
            ArrayList arrayList = this.D;
            if (x0Var != null && (qVarArr[i] == null || !zArr[i])) {
                arrayList.remove(x0Var);
                x0VarArr[i] = null;
            }
            if (x0VarArr[i] == null && qVarArr[i] != null) {
                c1 c1Var = new c1(this);
                arrayList.add(c1Var);
                x0VarArr[i] = c1Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void n(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        d1 d1Var = (d1) kVar;
        androidx.media3.datasource.y yVar = d1Var.y;
        this.B.g(i == 0 ? new n(d1Var.e, j) : new n(d1Var.e, yVar.z, yVar.A, j, j2, yVar.y), 1, -1, this.G, 0, null, 0L, this.E, i);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        return this.F.d();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        tVar.s(this);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        d1 d1Var = (d1) kVar;
        this.K = (int) d1Var.y.y;
        byte[] bArr = d1Var.z;
        bArr.getClass();
        this.J = bArr;
        this.I = true;
        androidx.media3.datasource.y yVar = d1Var.y;
        n nVar = new n(d1Var.e, yVar.z, yVar.A, j, j2, this.K);
        this.A.getClass();
        this.B.d(nVar, 1, -1, this.G, 0, null, 0L, this.E);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final j1 t() {
        return this.C;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        return this.I ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void x(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        d1 d1Var = (d1) kVar;
        androidx.media3.datasource.y yVar = d1Var.y;
        n nVar = new n(d1Var.e, yVar.z, yVar.A, j, j2, yVar.y);
        this.A.getClass();
        this.B.c(nVar, 1, -1, null, 0, null, 0L, this.E);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void i() {
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void l(long j) {
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j, androidx.media3.exoplayer.k1 k1Var) {
        return j;
    }
}
