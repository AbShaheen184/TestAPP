package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.media3.common.v0 {
    public final androidx.media3.common.c0 b;

    public q(androidx.media3.common.c0 c0Var) {
        this.b = c0Var;
    }

    @Override // androidx.media3.common.v0
    public final int b(Object obj) {
        return obj == p.e ? 0 : -1;
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.t0 f(int i, androidx.media3.common.t0 t0Var, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? p.e : null;
        androidx.media3.common.c cVar = androidx.media3.common.c.c;
        t0Var.getClass();
        androidx.media3.common.c cVar2 = androidx.media3.common.c.c;
        t0Var.a = num;
        t0Var.b = obj;
        t0Var.c = 0;
        t0Var.d = -9223372036854775807L;
        t0Var.e = 0L;
        t0Var.g = cVar2;
        t0Var.f = true;
        return t0Var;
    }

    @Override // androidx.media3.common.v0
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.v0
    public final Object l(int i) {
        return p.e;
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.u0 m(int i, androidx.media3.common.u0 u0Var, long j) {
        Object obj = androidx.media3.common.u0.q;
        u0Var.b(this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        u0Var.k = true;
        return u0Var;
    }

    @Override // androidx.media3.common.v0
    public final int o() {
        return 1;
    }
}
