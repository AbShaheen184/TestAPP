package okio.internal;

import java.io.IOException;
import okio.h0;
import okio.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n {
    public long A;
    public final long y;
    public final boolean z;

    public f(h0 h0Var, long j, boolean z) {
        super(h0Var);
        this.y = j;
        this.z = z;
    }

    @Override // okio.n, okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        fVar.getClass();
        long j2 = this.A;
        long j3 = this.y;
        if (j2 > j3) {
            j = 0;
        } else if (this.z) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jK = this.e.K(fVar, j);
        if (jK != -1) {
            this.A += jK;
        }
        long j5 = this.A;
        if ((j5 >= j3 || jK != -1) && j5 <= j3) {
            return jK;
        }
        if (jK > 0 && j5 > j3) {
            long j6 = fVar.y - (j5 - j3);
            okio.f fVar2 = new okio.f();
            fVar2.n0(fVar);
            fVar.E(fVar2, j6);
            fVar2.a();
        }
        StringBuilder sbO = androidx.compose.runtime.j.o(j3, "expected ", " bytes but got ");
        sbO.append(this.A);
        throw new IOException(sbO.toString());
    }
}
