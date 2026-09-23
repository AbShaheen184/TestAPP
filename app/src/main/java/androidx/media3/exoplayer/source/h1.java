package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements u, t {
    public final u e;
    public final long y;
    public t z;

    public h1(u uVar, long j) {
        this.e = uVar;
        this.y = j;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        androidx.media3.exoplayer.m0 m0Var = new androidx.media3.exoplayer.m0();
        long j = n0Var.a;
        m0Var.b = n0Var.b;
        m0Var.c = n0Var.c;
        m0Var.a = j - this.y;
        return this.e.d(new androidx.media3.exoplayer.n0(m0Var));
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        long jG = this.e.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jG + this.y;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void i() {
        this.e.i();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j, androidx.media3.exoplayer.k1 k1Var) {
        long j2 = this.y;
        return this.e.j(j - j2, k1Var) + j2;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long k(long j) {
        long j2 = this.y;
        return this.e.k(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void l(long j) {
        this.e.l(j - this.y);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long m(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        x0[] x0VarArr2 = new x0[x0VarArr.length];
        int i = 0;
        while (true) {
            x0 x0Var = null;
            if (i >= x0VarArr.length) {
                break;
            }
            g1 g1Var = (g1) x0VarArr[i];
            if (g1Var != null) {
                x0Var = g1Var.e;
            }
            x0VarArr2[i] = x0Var;
            i++;
        }
        u uVar = this.e;
        long j2 = this.y;
        long jM = uVar.m(qVarArr, zArr, x0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < x0VarArr.length; i2++) {
            x0 x0Var2 = x0VarArr2[i2];
            if (x0Var2 == null) {
                x0VarArr[i2] = null;
            } else {
                x0 x0Var3 = x0VarArr[i2];
                if (x0Var3 == null || ((g1) x0Var3).e != x0Var2) {
                    x0VarArr[i2] = new g1(x0Var2, j2);
                }
            }
        }
        return jM + j2;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        return this.e.o();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        long jP = this.e.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jP + this.y;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.z = tVar;
        this.e.q(this, j - this.y);
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void s(u uVar) {
        t tVar = this.z;
        tVar.getClass();
        tVar.s(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final j1 t() {
        return this.e.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void u(z0 z0Var) {
        t tVar = this.z;
        tVar.getClass();
        tVar.u(this);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        long jV = this.e.v();
        if (jV == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jV + this.y;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        this.e.w(j - this.y);
    }
}
