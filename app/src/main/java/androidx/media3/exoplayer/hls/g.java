package androidx.media3.exoplayer.hls;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.media3.exoplayer.source.chunk.b {
    public final List A;
    public final long B;

    public g(long j, List list) {
        super(0L, list.size() - 1);
        this.B = j;
        this.A = list;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long g() {
        a();
        return this.B + ((androidx.media3.exoplayer.hls.playlist.k) this.A.get((int) this.z)).B;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long k() {
        a();
        androidx.media3.exoplayer.hls.playlist.k kVar = (androidx.media3.exoplayer.hls.playlist.k) this.A.get((int) this.z);
        return this.B + kVar.B + kVar.z;
    }
}
