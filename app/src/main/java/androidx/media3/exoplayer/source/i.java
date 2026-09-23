package androidx.media3.exoplayer.source;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements z0 {
    public final z0 e;
    public final com.google.common.collect.h0 y;

    public i(z0 z0Var, List list) {
        this.e = z0Var;
        this.y = com.google.common.collect.h0.o(list);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        return this.e.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        return this.e.g();
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        return this.e.o();
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        return this.e.v();
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        this.e.w(j);
    }
}
