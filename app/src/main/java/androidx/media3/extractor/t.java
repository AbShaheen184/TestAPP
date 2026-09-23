package androidx.media3.extractor;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final androidx.localbroadcastmanager.content.b k;
    public final androidx.media3.common.h0 l;

    public t(byte[] bArr, int i) {
        androidx.media3.common.util.u uVar = new androidx.media3.common.util.u(bArr, bArr.length);
        uVar.m(i * 8);
        this.a = uVar.g(16);
        this.b = uVar.g(16);
        this.c = uVar.g(24);
        this.d = uVar.g(24);
        int iG = uVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = uVar.g(3) + 1;
        int iG2 = uVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = uVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final androidx.media3.common.r c(byte[] bArr, androidx.media3.common.h0 h0Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        androidx.media3.common.h0 h0Var2 = this.l;
        if (h0Var2 != null) {
            h0Var = h0Var2.b(h0Var);
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = androidx.media3.common.i0.p("audio/flac");
        qVar.o = i;
        qVar.F = this.g;
        qVar.G = this.e;
        String str = androidx.media3.common.util.i0.a;
        qVar.H = androidx.media3.common.util.i0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        qVar.q = Collections.singletonList(bArr);
        qVar.k = h0Var;
        return new androidx.media3.common.r(qVar);
    }

    public t(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, androidx.localbroadcastmanager.content.b bVar, androidx.media3.common.h0 h0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = bVar;
        this.l = h0Var;
    }
}
