package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements l {
    public final long e;
    public final long y;
    public long z;

    public b(long j, long j2) {
        this.e = j;
        this.y = j2;
        this.z = j - 1;
    }

    public final void a() {
        long j = this.z;
        if (j < this.e || j > this.y) {
            org.mozilla.javascript.typedarrays.c.a();
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final boolean next() {
        long j = this.z + 1;
        this.z = j;
        return !(j > this.y);
    }
}
