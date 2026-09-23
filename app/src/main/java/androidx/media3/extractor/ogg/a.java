package androidx.media3.extractor.ogg;

import androidx.media3.common.util.i0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        b bVar = this.a;
        long j2 = (((long) bVar.A.i) * j) / 1000000;
        long j3 = bVar.y;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = bVar.z;
        b0 b0Var = new b0(j, i0.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(bVar.C)).longValue() + j3) - 30000, bVar.y, j4 - 1));
        return new z(b0Var, b0Var);
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        b bVar = this.a;
        return (bVar.C * 1000000) / ((long) bVar.A.i);
    }
}
