package com.app.mlounge.ui.screens.player;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.extractor.a0 {
    public final long a;
    public final long b;

    public c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final androidx.media3.extractor.z e(long j) {
        long j2 = this.a;
        if (j2 > 0) {
            long j3 = this.b;
            if (j3 > 0) {
                long jE = kotlin.collections.i0.e(j, 0L, j2);
                androidx.media3.extractor.b0 b0Var = new androidx.media3.extractor.b0(jE, kotlin.collections.i0.e(BigInteger.valueOf(j3).multiply(BigInteger.valueOf(jE)).divide(BigInteger.valueOf(this.a)).longValue(), 0L, this.b));
                return new androidx.media3.extractor.z(b0Var, b0Var);
            }
        }
        androidx.media3.extractor.b0 b0Var2 = new androidx.media3.extractor.b0(j, 0L);
        return new androidx.media3.extractor.z(b0Var2, b0Var2);
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.a;
    }
}
