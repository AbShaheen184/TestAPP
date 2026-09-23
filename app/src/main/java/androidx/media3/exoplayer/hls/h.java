package androidx.media3.exoplayer.hls;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.media3.exoplayer.trackselection.c {
    public int g;

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int d() {
        return this.g;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void l(long j, long j2, long j3, List list, androidx.media3.exoplayer.source.chunk.l[] lVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            org.mozilla.javascript.c.a();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int o() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final Object r() {
        return null;
    }
}
