package androidx.media3.exoplayer.dash;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.media3.exoplayer.source.chunk.b {
    public final k A;

    public l(k kVar, long j, long j2) {
        super(j, j2);
        this.A = kVar;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long g() {
        a();
        return this.A.e(this.z);
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long k() {
        a();
        return this.A.d(this.z);
    }
}
