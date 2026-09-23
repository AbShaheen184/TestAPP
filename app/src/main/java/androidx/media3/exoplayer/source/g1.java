package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements x0 {
    public final x0 e;
    public final long y;

    public g1(x0 x0Var, long j) {
        this.e = x0Var;
        this.y = j;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        return this.e.a();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() {
        this.e.b();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        int iE = this.e.e(bVar, eVar, i);
        if (iE == -4) {
            eVar.D += this.y;
        }
        return iE;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        return this.e.h(j - this.y);
    }
}
