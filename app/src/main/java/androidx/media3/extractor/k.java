package androidx.media3.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o {
    public long A;
    public int C;
    public int D;
    public final androidx.media3.common.i y;
    public final long z;
    public byte[] B = new byte[Parser.ARGC_LIMIT];
    public final byte[] e = new byte[4096];

    static {
        androidx.media3.common.d0.a("media3.extractor");
    }

    public k(androidx.media3.common.i iVar, long j, long j2) {
        this.y = iVar;
        this.A = j;
        this.z = j2;
    }

    public final boolean a(int i, boolean z) {
        h(i);
        int iK = this.D - this.C;
        while (iK < i) {
            int i2 = i;
            boolean z2 = z;
            iK = k(this.B, this.C, i2, iK, z2);
            if (iK == -1) {
                return false;
            }
            this.D = this.C + iK;
            i = i2;
            z = z2;
        }
        this.C += i;
        return true;
    }

    @Override // androidx.media3.extractor.o
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.D;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.B, 0, bArr, i, iMin);
            m(iMin);
        }
        int iK = iMin;
        while (iK < i2 && iK != -1) {
            iK = k(bArr, i, i2, iK, z);
        }
        if (iK != -1) {
            this.A += (long) iK;
        }
        return iK != -1;
    }

    @Override // androidx.media3.extractor.o
    public final boolean d(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.D, i);
        m(iMin);
        int iK = iMin;
        while (iK < i && iK != -1) {
            byte[] bArr = this.e;
            iK = k(bArr, -iK, Math.min(i, bArr.length + iK), iK, z);
        }
        if (iK != -1) {
            this.A += (long) iK;
        }
        return iK != -1;
    }

    @Override // androidx.media3.extractor.o
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.B, this.C - i2, bArr, i, i2);
        return true;
    }

    @Override // androidx.media3.extractor.o
    public final long f() {
        return this.A + ((long) this.C);
    }

    @Override // androidx.media3.extractor.o
    public final void g(int i) {
        a(i, false);
    }

    @Override // androidx.media3.extractor.o
    public final long getLength() {
        return this.z;
    }

    @Override // androidx.media3.extractor.o
    public final long getPosition() {
        return this.A;
    }

    public final void h(int i) {
        int i2 = this.C + i;
        byte[] bArr = this.B;
        if (i2 > bArr.length) {
            this.B = Arrays.copyOf(this.B, androidx.media3.common.util.i0.j(bArr.length * 2, Parser.ARGC_LIMIT + i2, i2 + 524288));
        }
    }

    @Override // androidx.media3.extractor.o
    public final int i(int i) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin = Math.min(this.D, i);
        m(iMin);
        if (iMin == 0) {
            byte[] bArr = this.e;
            kVar = this;
            iMin = kVar.k(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            kVar = this;
        }
        if (iMin != -1) {
            kVar.A += (long) iMin;
        }
        return iMin;
    }

    @Override // androidx.media3.extractor.o
    public final int j(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin;
        h(i2);
        int i3 = this.D;
        int i4 = this.C;
        int i5 = i3 - i4;
        if (i5 == 0) {
            kVar = this;
            iMin = kVar.k(this.B, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            kVar.D += iMin;
        } else {
            kVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(kVar.B, kVar.C, bArr, i, iMin);
        kVar.C += iMin;
        return iMin;
    }

    public final int k(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.y.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void m(int i) {
        int i2 = this.D - i;
        this.D = i2;
        this.C = 0;
        byte[] bArr = this.B;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[Parser.ARGC_LIMIT + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.B = bArr2;
    }

    @Override // androidx.media3.extractor.o
    public final void n() {
        this.C = 0;
    }

    @Override // androidx.media3.extractor.o
    public final void o(int i) throws EOFException, InterruptedIOException {
        d(i, false);
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        k kVar;
        int i3 = this.D;
        int iK = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.B, 0, bArr, i, iMin);
            m(iMin);
            iK = iMin;
        }
        if (iK == 0) {
            kVar = this;
            iK = kVar.k(bArr, i, i2, 0, true);
        } else {
            kVar = this;
        }
        if (iK != -1) {
            kVar.A += (long) iK;
        }
        return iK;
    }

    @Override // androidx.media3.extractor.o
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        b(bArr, i, i2, false);
    }

    @Override // androidx.media3.extractor.o
    public final void w(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }
}
