package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d1 {
    public h1 A;
    public int B;
    public androidx.media3.exoplayer.analytics.k C;
    public androidx.media3.common.util.d0 D;
    public int E;
    public androidx.media3.exoplayer.source.x0 F;
    public androidx.media3.common.r[] G;
    public long H;
    public long I;
    public boolean K;
    public boolean L;
    public androidx.media3.exoplayer.source.v N;
    public androidx.media3.exoplayer.trackselection.o O;
    public final int y;
    public final Object e = new Object();
    public final androidx.localbroadcastmanager.content.b z = new androidx.localbroadcastmanager.content.b(9, false);
    public long J = Long.MIN_VALUE;
    public androidx.media3.common.v0 M = androidx.media3.common.v0.a;

    public a(int i) {
        this.y = i;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final void A(androidx.media3.common.r[] rVarArr, androidx.media3.exoplayer.source.x0 x0Var, long j, long j2, androidx.media3.exoplayer.source.v vVar) {
        _COROUTINE.a.A(!this.K);
        this.F = x0Var;
        this.N = vVar;
        if (this.J == Long.MIN_VALUE) {
            this.J = j;
        }
        this.G = rVarArr;
        this.H = j2;
        w(rVarArr, j, j2, vVar);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.K = false;
        this.I = j;
        this.J = j;
        if (!z2) {
            androidx.media3.exoplayer.source.x0 x0Var = this.F;
            x0Var.getClass();
            z2 = x0Var.h(j - this.H) != 0;
        }
        r(j, z, z2);
    }

    public abstract int D(androidx.media3.common.r rVar);

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    public final j g(Exception exc, androidx.media3.common.r rVar, boolean z, int i) {
        int iD;
        if (rVar == null || this.L) {
            iD = 4;
        } else {
            this.L = true;
            try {
                iD = D(rVar) & 7;
                this.L = false;
            } catch (j unused) {
                this.L = false;
                iD = 4;
            } catch (Throwable th) {
                this.L = false;
                throw th;
            }
        }
        return new j(1, exc, i, k(), this.B, rVar, rVar == null ? 4 : iD, this.N, z);
    }

    public long i(long j, long j2) {
        if (this.E == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public o0 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.J == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public abstract void r(long j, boolean z, boolean z2);

    public final int y(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        androidx.media3.exoplayer.source.x0 x0Var = this.F;
        x0Var.getClass();
        int iE = x0Var.e(bVar, eVar, i);
        if (iE == -4) {
            if (eVar.e(4)) {
                this.J = Long.MIN_VALUE;
                return this.K ? -4 : -3;
            }
            long j = eVar.D + this.H;
            eVar.D = j;
            this.J = Math.max(this.J, j);
            return iE;
        }
        if (iE == -5) {
            androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.z;
            rVar.getClass();
            long j2 = rVar.t;
            if (j2 != Long.MAX_VALUE) {
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.s = j2 + this.H;
                bVar.z = new androidx.media3.common.r(qVarA);
            }
        }
        return iE;
    }

    public abstract void z(long j, long j2);

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f, float f2) {
    }

    @Override // androidx.media3.exoplayer.d1
    public void d(int i, Object obj) {
    }

    public void q(boolean z, boolean z2) {
    }

    public void w(androidx.media3.common.r[] rVarArr, long j, long j2, androidx.media3.exoplayer.source.v vVar) {
    }
}
