package androidx.media3.exoplayer.source;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.media3.extractor.h0 {
    public final w0 a;
    public final w0 b;
    public final androidx.media3.extractor.m c = new androidx.media3.extractor.m();
    public final AtomicReference d = new AtomicReference(j0.e);

    public k0(w0 w0Var) {
        this.a = w0Var;
        this.b = w0Var;
    }

    @Override // androidx.media3.extractor.h0
    public final int a(androidx.media3.common.i iVar, int i, boolean z) {
        return h().a(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void b(androidx.media3.common.util.v vVar, int i, int i2) {
        h().b(vVar, i, i2);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) {
        return h().c(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
        this.a.e(rVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void f(int i, androidx.media3.common.util.v vVar) {
        h().f(i, vVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, androidx.media3.extractor.g0 g0Var) {
        h().g(j, i, i2, i3, g0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == j0.y) {
            this.b.F(false);
            atomicReference.set(j0.z);
        }
    }

    public final androidx.media3.extractor.h0 h() {
        return this.d.get() == j0.z ? this.c : this.b;
    }

    @Override // androidx.media3.extractor.h0
    public final void d(long j) {
    }
}
