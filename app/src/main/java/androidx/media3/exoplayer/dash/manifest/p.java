package androidx.media3.exoplayer.dash.manifest;

import androidx.appcompat.widget.c2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {
    public final c2 j;
    public final c2 k;
    public final long l;

    public p(j jVar, long j, long j2, long j3, long j4, long j5, List list, long j6, c2 c2Var, c2 c2Var2, long j7, long j8) {
        super(jVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = c2Var;
        this.k = c2Var2;
        this.l = j4;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.s
    public final j a(m mVar) {
        c2 c2Var = this.j;
        if (c2Var == null) {
            return this.a;
        }
        androidx.media3.common.r rVar = mVar.e;
        return new j(0L, -1L, c2Var.q(rVar.a, 0L, rVar.j, 0L));
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = com.google.common.math.a.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final j h(k kVar, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((q) list.get((int) (j - j2))).a : (j - j2) * this.e;
        androidx.media3.common.r rVar = kVar.e;
        return new j(0L, -1L, this.k.q(rVar.a, j, rVar.j, j3));
    }
}
