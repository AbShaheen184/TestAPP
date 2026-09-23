package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements x0 {
    public final x0 e;
    public boolean y;
    public final /* synthetic */ d z;

    public c(d dVar, x0 x0Var) {
        this.z = dVar;
        this.e = x0Var;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        return !this.z.a() && this.e.a();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() {
        this.e.b();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        d dVar = this.z;
        if (dVar.a()) {
            return -3;
        }
        if (this.y) {
            eVar.y = 4;
            return -4;
        }
        long jV = dVar.v();
        int iE = this.e.e(bVar, eVar, i);
        if (dVar.B != -9223372036854775807L && iE != -3) {
            dVar.B = -9223372036854775807L;
        }
        long j = dVar.C;
        if (iE != -5) {
            if (j == Long.MIN_VALUE || ((iE != -4 || eVar.D < j) && !(iE == -3 && jV == Long.MIN_VALUE && !eVar.C))) {
                return iE;
            }
            eVar.o();
            eVar.y = 4;
            this.y = true;
            return -4;
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.z;
        rVar.getClass();
        int i2 = rVar.K;
        int i3 = rVar.J;
        if (i3 != 0 || i2 != 0) {
            if (j != Long.MIN_VALUE) {
                i2 = 0;
            }
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.I = i3;
            qVarA.J = i2;
            bVar.z = new androidx.media3.common.r(qVarA);
        }
        return -5;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        if (this.z.a()) {
            return -3;
        }
        return this.e.h(j);
    }
}
