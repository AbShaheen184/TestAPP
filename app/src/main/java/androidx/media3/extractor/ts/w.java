package androidx.media3.extractor.ts;

import androidx.media3.common.util.g0;
import androidx.media3.common.util.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final /* synthetic */ int a;
    public final g0 b;
    public final androidx.media3.common.util.v c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public w(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new g0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new androidx.media3.common.util.v();
                break;
            default:
                this.b = new g0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new androidx.media3.common.util.v();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(androidx.media3.common.util.v vVar) {
        int i = vVar.b;
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.k(bArr, 0, 9);
        vVar.M(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(androidx.media3.extractor.o oVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = i0.b;
                androidx.media3.common.util.v vVar = this.c;
                vVar.getClass();
                vVar.K(bArr, bArr.length);
                this.d = true;
                oVar.n();
                break;
            default:
                byte[] bArr2 = i0.b;
                androidx.media3.common.util.v vVar2 = this.c;
                vVar2.getClass();
                vVar2.K(bArr2, bArr2.length);
                this.d = true;
                oVar.n();
                break;
        }
    }
}
