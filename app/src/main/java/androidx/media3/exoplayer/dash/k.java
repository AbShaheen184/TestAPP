package androidx.media3.exoplayer.dash;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final androidx.media3.exoplayer.source.chunk.e a;
    public final androidx.media3.exoplayer.dash.manifest.m b;
    public final androidx.media3.exoplayer.dash.manifest.b c;
    public final j d;
    public final long e;
    public final long f;

    public k(long j, androidx.media3.exoplayer.dash.manifest.m mVar, androidx.media3.exoplayer.dash.manifest.b bVar, androidx.media3.exoplayer.source.chunk.e eVar, long j2, j jVar) {
        this.e = j;
        this.b = mVar;
        this.c = bVar;
        this.f = j2;
        this.a = eVar;
        this.d = jVar;
    }

    public final k a(long j, androidx.media3.exoplayer.dash.manifest.m mVar) throws androidx.media3.exoplayer.source.b {
        long jS;
        long jS2;
        j jVarC = this.b.c();
        j jVarC2 = mVar.c();
        if (jVarC == null) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC);
        }
        if (!jVarC.y()) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC2);
        }
        long jD = jVarC.D(j);
        if (jD == 0) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC2);
        }
        jVarC2.getClass();
        long jA = jVarC.A();
        long jA2 = jVarC.a(jA);
        long j2 = jD + jA;
        long j3 = j2 - 1;
        long jK = jVarC.k(j3, j) + jVarC.a(j3);
        long jA3 = jVarC2.A();
        long jA4 = jVarC2.a(jA3);
        long j4 = this.f;
        if (jK != jA4) {
            if (jK < jA4) {
                throw new androidx.media3.exoplayer.source.b();
            }
            if (jA4 < jA2) {
                jS2 = j4 - (jVarC2.s(jA2, j) - jA);
            } else {
                jS = jVarC.s(jA4, j) - jA3;
            }
            return new k(j, mVar, this.c, this.a, jS2, jVarC2);
        }
        jS = j2 - jA3;
        jS2 = jS + j4;
        return new k(j, mVar, this.c, this.a, jS2, jVarC2);
    }

    public final long b(long j) {
        j jVar = this.d;
        jVar.getClass();
        long j2 = this.e;
        long jM = jVar.m(j2, j) + this.f;
        jVar.getClass();
        return (jVar.E(j2, j) + jM) - 1;
    }

    public final long c() {
        j jVar = this.d;
        jVar.getClass();
        return jVar.D(this.e);
    }

    public final long d(long j) {
        long jE = e(j);
        j jVar = this.d;
        jVar.getClass();
        return jVar.k(j - this.f, this.e) + jE;
    }

    public final long e(long j) {
        j jVar = this.d;
        jVar.getClass();
        return jVar.a(j - this.f);
    }

    public final boolean f(long j, long j2) {
        j jVar = this.d;
        jVar.getClass();
        return jVar.y() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
