package androidx.media3.exoplayer.dash.manifest;

import com.google.common.collect.h0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements androidx.media3.exoplayer.dash.j {
    public final n C;

    public k(androidx.media3.common.r rVar, h0 h0Var, n nVar, ArrayList arrayList) {
        super(rVar, h0Var, nVar, arrayList);
        this.C = nVar;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long A() {
        return this.C.d;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long D(long j) {
        return this.C.d(j);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long E(long j, long j2) {
        return this.C.b(j, j2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long a(long j) {
        return this.C.g(j);
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final String b() {
        return null;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final j d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long k(long j, long j2) {
        return this.C.e(j, j2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long m(long j, long j2) {
        return this.C.c(j, j2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long p(long j, long j2) {
        n nVar = this.C;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j, j2) + nVar.c(j, j2);
        return (nVar.e(jB, j) + nVar.g(jB)) - nVar.i;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final j q(long j) {
        return this.C.h(this, j);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final long s(long j, long j2) {
        return this.C.f(j, j2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public final boolean y() {
        return this.C.i();
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final androidx.media3.exoplayer.dash.j c() {
        return this;
    }
}
