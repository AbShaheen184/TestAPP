package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u, t {
    public long A;
    public long B;
    public long C;
    public final o e;
    public t y;
    public c[] z = new c[0];

    public d(o oVar, boolean z, long j) {
        this.e = oVar;
        this.A = z ? 0L : -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = j;
    }

    public final boolean a() {
        return this.A != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        return this.e.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        long jG = this.e.g();
        if (jG != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || jG < j) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void i() {
        this.e.i();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j, androidx.media3.exoplayer.k1 k1Var) {
        if (j == 0) {
            return 0L;
        }
        long jK = androidx.media3.common.util.i0.k(k1Var.a, 0L, j);
        long j2 = k1Var.b;
        long j3 = this.C;
        long jK2 = androidx.media3.common.util.i0.k(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != k1Var.a || jK2 != k1Var.b) {
            k1Var = new androidx.media3.exoplayer.k1(jK, jK2);
        }
        return this.e.j(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long k(long j) {
        this.A = -9223372036854775807L;
        for (c cVar : this.z) {
            if (cVar != null) {
                cVar.y = false;
            }
        }
        long jK = this.e.k(j);
        long j2 = this.C;
        long jMax = Math.max(jK, 0L);
        return j2 != Long.MIN_VALUE ? Math.min(jMax, j2) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void l(long j) {
        this.e.l(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long m(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        long j2;
        this.z = new c[x0VarArr.length];
        x0[] x0VarArr2 = new x0[x0VarArr.length];
        for (int i = 0; i < x0VarArr.length; i++) {
            c[] cVarArr = this.z;
            c cVar = (c) x0VarArr[i];
            cVarArr[i] = cVar;
            x0VarArr2[i] = cVar != null ? cVar.e : null;
        }
        long jM = this.e.m(qVarArr, zArr, x0VarArr2, zArr2, j);
        long j3 = this.C;
        long jMax = Math.max(jM, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (a()) {
            if (jM >= j) {
                if (jM != 0) {
                    int length = qVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i2];
                            if (qVar != null) {
                                androidx.media3.common.r rVarN = qVar.n();
                                if (!androidx.media3.common.i0.a(rVarN.o, rVarN.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.A = j2;
        for (int i3 = 0; i3 < x0VarArr.length; i3++) {
            x0 x0Var = x0VarArr2[i3];
            c[] cVarArr2 = this.z;
            if (x0Var == null) {
                cVarArr2[i3] = null;
            } else {
                c cVar2 = cVarArr2[i3];
                if (cVar2 == null || cVar2.e != x0Var) {
                    cVarArr2[i3] = new c(this, x0Var);
                }
            }
            x0VarArr[i3] = cVarArr2[i3];
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        return this.e.o();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        if (a()) {
            long j = this.A;
            this.A = -9223372036854775807L;
            this.B = j;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j;
        }
        long jP2 = this.e.p();
        if (jP2 != -9223372036854775807L) {
            long j2 = this.C;
            long jMax = Math.max(jP2, 0L);
            if (j2 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j2);
            }
            if (jMax != this.B) {
                this.B = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.y = tVar;
        this.e.q(this, j);
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void s(u uVar) {
        t tVar = this.y;
        tVar.getClass();
        tVar.s(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final j1 t() {
        return this.e.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void u(z0 z0Var) {
        t tVar = this.y;
        tVar.getClass();
        tVar.u(this);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        long jV = this.e.v();
        if (jV != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || jV < j) {
                return jV;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        this.e.w(j);
    }
}
