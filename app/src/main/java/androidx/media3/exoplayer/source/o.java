package androidx.media3.exoplayer.source;

import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements u, t {
    public a A;
    public u B;
    public t C;
    public long D = -9223372036854775807L;
    public final v e;
    public final long y;
    public final c2 z;

    public o(v vVar, c2 c2Var, long j) {
        this.e = vVar;
        this.z = c2Var;
        this.y = j;
    }

    public final void a(v vVar) {
        long j = this.D;
        if (j == -9223372036854775807L) {
            j = this.y;
        }
        a aVar = this.A;
        aVar.getClass();
        u uVarB = aVar.b(vVar, this.z, j);
        this.B = uVarB;
        if (this.C != null) {
            uVarB.q(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        u uVar = this.B;
        return uVar != null && uVar.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.g();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void i() {
        u uVar = this.B;
        if (uVar != null) {
            uVar.i();
            return;
        }
        a aVar = this.A;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j, androidx.media3.exoplayer.k1 k1Var) {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.j(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long k(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.k(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void l(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        uVar.l(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long m(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        long j2 = this.D;
        long j3 = (j2 == -9223372036854775807L || j != this.y) ? j : j2;
        this.D = -9223372036854775807L;
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.m(qVarArr, zArr, x0VarArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        u uVar = this.B;
        return uVar != null && uVar.o();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.p();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.C = tVar;
        u uVar = this.B;
        if (uVar != null) {
            long j2 = this.D;
            if (j2 == -9223372036854775807L) {
                j2 = this.y;
            }
            uVar.q(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void s(u uVar) {
        t tVar = this.C;
        String str = androidx.media3.common.util.i0.a;
        tVar.s(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final j1 t() {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void u(z0 z0Var) {
        t tVar = this.C;
        String str = androidx.media3.common.util.i0.a;
        tVar.u(this);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        return uVar.v();
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.i0.a;
        uVar.w(j);
    }
}
