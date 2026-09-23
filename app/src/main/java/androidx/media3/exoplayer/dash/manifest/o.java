package androidx.media3.exoplayer.dash.manifest;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(jVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.d));
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final boolean i() {
        return true;
    }
}
