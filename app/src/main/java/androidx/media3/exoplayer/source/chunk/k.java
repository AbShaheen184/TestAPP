package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends f {
    public final long G;

    public k(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, long j, long j2, long j3) {
        super(hVar, lVar, 1, rVar, i, obj, j, j2);
        rVar.getClass();
        this.G = j3;
    }

    public long a() {
        long j = this.G;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
