package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.appcompat.widget.c2;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public final c2 a;
    public final int b;
    public final androidx.media3.common.util.v c;
    public r0 d;
    public r0 e;
    public r0 f;
    public long g;

    public s0(c2 c2Var) {
        int i;
        this.a = c2Var;
        synchronized (c2Var) {
            i = ((androidx.media3.exoplayer.g) c2Var.A).c.b;
        }
        this.b = i;
        this.c = new androidx.media3.common.util.v(32);
        r0 r0Var = new r0(0L, i);
        this.d = r0Var;
        this.e = r0Var;
        this.f = r0Var;
    }

    public static r0 c(r0 r0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= r0Var.y) {
            r0Var = (r0) r0Var.A;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (r0Var.y - j));
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            byteBuffer.put(aVar.a, ((int) (j - r0Var.e)) + aVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == r0Var.y) {
                r0Var = (r0) r0Var.A;
            }
        }
        return r0Var;
    }

    public static r0 d(r0 r0Var, long j, byte[] bArr, int i) {
        while (j >= r0Var.y) {
            r0Var = (r0) r0Var.A;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (r0Var.y - j));
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            System.arraycopy(aVar.a, ((int) (j - r0Var.e)) + aVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == r0Var.y) {
                r0Var = (r0) r0Var.A;
            }
        }
        return r0Var;
    }

    public static r0 e(r0 r0Var, androidx.media3.decoder.e eVar, androidx.media3.exoplayer.image.f fVar, androidx.media3.common.util.v vVar) {
        if (eVar.e(1073741824)) {
            long j = fVar.c;
            int iG = 1;
            vVar.J(1);
            r0 r0VarD = d(r0Var, j, vVar.a, 1);
            long j2 = j + 1;
            byte b = vVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            androidx.media3.decoder.a aVar = eVar.A;
            byte[] bArr = aVar.a;
            if (bArr == null) {
                aVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            r0Var = d(r0VarD, j2, aVar.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                vVar.J(2);
                r0Var = d(r0Var, j3, vVar.a, 2);
                j3 += 2;
                iG = vVar.G();
            }
            int[] iArr = aVar.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = aVar.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                vVar.J(i2);
                r0Var = d(r0Var, j3, vVar.a, i2);
                j3 += (long) i2;
                vVar.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = vVar.G();
                    iArr2[i3] = vVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fVar.b - ((int) (j3 - fVar.c));
            }
            androidx.media3.extractor.g0 g0Var = (androidx.media3.extractor.g0) fVar.d;
            String str = androidx.media3.common.util.i0.a;
            byte[] bArr2 = g0Var.b;
            byte[] bArr3 = aVar.a;
            int i4 = g0Var.a;
            int i5 = g0Var.c;
            int i6 = g0Var.d;
            aVar.f = iG;
            aVar.d = iArr;
            aVar.e = iArr2;
            aVar.b = bArr2;
            aVar.a = bArr3;
            aVar.c = i4;
            aVar.g = i5;
            aVar.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = aVar.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            androidx.localbroadcastmanager.content.b bVar = aVar.j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) bVar.z;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) bVar.y).setPattern(pattern);
            long j4 = fVar.c;
            int i7 = (int) (j3 - j4);
            fVar.c = j4 + ((long) i7);
            fVar.b -= i7;
        }
        if (!eVar.e(268435456)) {
            eVar.q(fVar.b);
            return c(r0Var, fVar.c, eVar.B, fVar.b);
        }
        vVar.J(4);
        r0 r0VarD2 = d(r0Var, fVar.c, vVar.a, 4);
        int iD = vVar.D();
        fVar.c += 4;
        fVar.b -= 4;
        eVar.q(iD);
        r0 r0VarC = c(r0VarD2, fVar.c, eVar.B, iD);
        fVar.c += (long) iD;
        int i8 = fVar.b - iD;
        fVar.b = i8;
        ByteBuffer byteBuffer = eVar.E;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            eVar.E = ByteBuffer.allocate(i8);
        } else {
            eVar.E.clear();
        }
        return c(r0VarC, fVar.c, eVar.E, fVar.b);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0040 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r7) {
        /*
            r6 = this;
            r0 = -1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L53
        L7:
            androidx.media3.exoplayer.source.r0 r0 = r6.d
            long r1 = r0.y
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 < 0) goto L47
            androidx.appcompat.widget.c2 r1 = r6.a
            java.lang.Object r0 = r0.z
            androidx.media3.exoplayer.upstream.a r0 = (androidx.media3.exoplayer.upstream.a) r0
            monitor-enter(r1)
            java.lang.Object r2 = r1.A     // Catch: java.lang.Throwable -> L40
            androidx.media3.exoplayer.g r2 = (androidx.media3.exoplayer.g) r2     // Catch: java.lang.Throwable -> L40
            androidx.media3.exoplayer.upstream.d r2 = r2.c     // Catch: java.lang.Throwable -> L40
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L40
            androidx.media3.exoplayer.upstream.a[] r3 = r2.f     // Catch: java.lang.Throwable -> L42
            int r4 = r2.e     // Catch: java.lang.Throwable -> L42
            int r5 = r4 + 1
            r2.e = r5     // Catch: java.lang.Throwable -> L42
            r3[r4] = r0     // Catch: java.lang.Throwable -> L42
            int r3 = r2.d     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            r2.d = r3     // Catch: java.lang.Throwable -> L42
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            r1.V(r0)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)
            androidx.media3.exoplayer.source.r0 r0 = r6.d
            r1 = 0
            r0.z = r1
            java.lang.Object r2 = r0.A
            androidx.media3.exoplayer.source.r0 r2 = (androidx.media3.exoplayer.source.r0) r2
            r0.A = r1
            r6.d = r2
            goto L7
        L40:
            r7 = move-exception
            goto L45
        L42:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L40
        L45:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r7
        L47:
            androidx.media3.exoplayer.source.r0 r7 = r6.e
            long r7 = r7.e
            long r1 = r0.e
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L53
            r6.e = r0
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.s0.a(long):void");
    }

    public final int b(int i) {
        androidx.media3.exoplayer.upstream.a aVarA;
        r0 r0Var = this.f;
        if (((androidx.media3.exoplayer.upstream.a) r0Var.z) == null) {
            c2 c2Var = this.a;
            synchronized (c2Var) {
                aVarA = ((androidx.media3.exoplayer.g) c2Var.A).c.a();
                ((HashMap) c2Var.y).put(aVarA, (androidx.media3.exoplayer.analytics.k) c2Var.z);
                androidx.media3.exoplayer.f fVar = (androidx.media3.exoplayer.f) ((androidx.media3.exoplayer.g) c2Var.A).q.get((androidx.media3.exoplayer.analytics.k) c2Var.z);
                if (fVar != null) {
                    synchronized (fVar) {
                        fVar.d++;
                    }
                }
            }
            r0 r0Var2 = new r0(this.f.y, this.b);
            r0Var.z = aVarA;
            r0Var.A = r0Var2;
        }
        return Math.min(i, (int) (this.f.y - this.g));
    }
}
