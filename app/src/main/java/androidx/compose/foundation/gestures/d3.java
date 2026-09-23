package androidx.compose.foundation.gestures;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements androidx.media3.exoplayer.dash.j, androidx.media3.extractor.o, androidx.media3.extractor.p, com.google.android.gms.tasks.e {
    public final /* synthetic */ int e;
    public long y;
    public Object z;

    public d3(androidx.media3.extractor.o oVar, long j) {
        this.e = 2;
        this.z = oVar;
        _COROUTINE.a.o(oVar.getPosition() >= j);
        this.y = j;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long A() {
        return 0L;
    }

    public int B(int i) {
        d3 d3Var = (d3) this.z;
        if (d3Var == null) {
            long j = this.y;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(this.y & ((1 << i) - 1));
        }
        return Long.bitCount(this.y) + d3Var.B(i - 64);
    }

    public void C() {
        if (((d3) this.z) == null) {
            this.z = new d3();
        }
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long D(long j) {
        return ((androidx.media3.extractor.j) this.z).a;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long E(long j, long j2) {
        return ((androidx.media3.extractor.j) this.z).a;
    }

    @Override // com.google.android.gms.tasks.e
    public /* synthetic */ void F(Exception exc) {
        com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) this.z;
        ((AtomicLong) jVar.A).set(this.y);
    }

    public boolean G(int i) {
        if (i < 64) {
            return (this.y & (1 << i)) != 0;
        }
        C();
        return ((d3) this.z).G(i - 64);
    }

    public void H(int i, boolean z) {
        if (i >= 64) {
            C();
            ((d3) this.z).H(i - 64, z);
            return;
        }
        long j = this.y;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.y = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            L(i);
        } else {
            z(i);
        }
        if (z2 || ((d3) this.z) != null) {
            C();
            ((d3) this.z).H(0, z2);
        }
    }

    public float I(long j) {
        return Float.intBitsToFloat((int) (((o1) this.z) == o1.y ? j >> 32 : j & 4294967295L));
    }

    public boolean J(int i) {
        if (i >= 64) {
            C();
            return ((d3) this.z).J(i - 64);
        }
        long j = 1 << i;
        long j2 = this.y;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.y = j3;
        long j4 = j - 1;
        this.y = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        d3 d3Var = (d3) this.z;
        if (d3Var != null) {
            if (d3Var.G(0)) {
                L(63);
            }
            ((d3) this.z).J(0);
        }
        return z;
    }

    public void K() {
        this.y = 0L;
        d3 d3Var = (d3) this.z;
        if (d3Var != null) {
            d3Var.K();
        }
    }

    public void L(int i) {
        if (i < 64) {
            this.y |= 1 << i;
        } else {
            C();
            ((d3) this.z).L(i - 64);
        }
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long a(long j) {
        return ((androidx.media3.extractor.j) this.z).e[(int) j] - this.y;
    }

    @Override // androidx.media3.extractor.o
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        return ((androidx.media3.extractor.o) this.z).b(bArr, 0, i2, z);
    }

    @Override // androidx.media3.extractor.o
    public boolean d(int i, boolean z) {
        return ((androidx.media3.extractor.o) this.z).d(i, true);
    }

    @Override // androidx.media3.extractor.o
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        return ((androidx.media3.extractor.o) this.z).e(bArr, i, i2, z);
    }

    @Override // androidx.media3.extractor.o
    public long f() {
        return ((androidx.media3.extractor.o) this.z).f() - this.y;
    }

    @Override // androidx.media3.extractor.o
    public void g(int i) {
        ((androidx.media3.extractor.o) this.z).g(i);
    }

    @Override // androidx.media3.extractor.o
    public long getLength() {
        return ((androidx.media3.extractor.o) this.z).getLength() - this.y;
    }

    @Override // androidx.media3.extractor.o
    public long getPosition() {
        return ((androidx.media3.extractor.o) this.z).getPosition() - this.y;
    }

    @Override // androidx.media3.extractor.p
    public void h(androidx.media3.extractor.a0 a0Var) {
        ((androidx.media3.extractor.p) this.z).h(new androidx.media3.extractor.f0(this, a0Var, a0Var));
    }

    @Override // androidx.media3.extractor.o
    public int i(int i) {
        return ((androidx.media3.extractor.o) this.z).i(i);
    }

    @Override // androidx.media3.extractor.o
    public int j(byte[] bArr, int i, int i2) {
        return ((androidx.media3.extractor.o) this.z).j(bArr, i, i2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long k(long j, long j2) {
        return ((androidx.media3.extractor.j) this.z).d[(int) j];
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long m(long j, long j2) {
        return 0L;
    }

    @Override // androidx.media3.extractor.o
    public void n() {
        ((androidx.media3.extractor.o) this.z).n();
    }

    @Override // androidx.media3.extractor.o
    public void o(int i) {
        ((androidx.media3.extractor.o) this.z).o(i);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long p(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public androidx.media3.exoplayer.dash.manifest.j q(long j) {
        androidx.media3.extractor.j jVar = (androidx.media3.extractor.j) this.z;
        int i = (int) j;
        return new androidx.media3.exoplayer.dash.manifest.j(jVar.c[i], jVar.b[i], null);
    }

    @Override // androidx.media3.extractor.p
    public void r() {
        ((androidx.media3.extractor.p) this.z).r();
    }

    @Override // androidx.media3.common.i
    public int read(byte[] bArr, int i, int i2) {
        return ((androidx.media3.extractor.o) this.z).read(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.o
    public void readFully(byte[] bArr, int i, int i2) {
        ((androidx.media3.extractor.o) this.z).readFully(bArr, i, i2);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long s(long j, long j2) {
        return androidx.media3.common.util.i0.f(((androidx.media3.extractor.j) this.z).e, j + this.y, true);
    }

    public String toString() {
        switch (this.e) {
            case 5:
                if (((d3) this.z) == null) {
                    return Long.toBinaryString(this.y);
                }
                return ((d3) this.z).toString() + "xx" + Long.toBinaryString(this.y);
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        return ((androidx.media3.extractor.p) this.z).u(i, i2);
    }

    @Override // androidx.media3.extractor.o
    public void w(byte[] bArr, int i, int i2) {
        ((androidx.media3.extractor.o) this.z).w(bArr, i, i2);
    }

    public long x(long j, long j2, float f) {
        long jE = androidx.compose.ui.geometry.b.e(this.y, androidx.compose.ui.geometry.b.d(j, j2));
        this.y = jE;
        if ((((o1) this.z) == null ? androidx.compose.ui.geometry.b.c(jE) : Math.abs(I(jE))) < f) {
            return 9205357640488583168L;
        }
        o1 o1Var = (o1) this.z;
        long j3 = this.y;
        if (o1Var == null) {
            float fC = androidx.compose.ui.geometry.b.c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fC;
            return androidx.compose.ui.geometry.b.d(this.y, androidx.compose.ui.geometry.b.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fI = I(j3) - (Math.signum(I(this.y)) * f);
        long j4 = this.y;
        o1 o1Var2 = (o1) this.z;
        o1 o1Var3 = o1.y;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (o1Var2 == o1Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((o1) this.z) != o1Var3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fI)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fI)) << 32);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public boolean y() {
        return true;
    }

    public void z(int i) {
        if (i < 64) {
            this.y &= ~(1 << i);
            return;
        }
        d3 d3Var = (d3) this.z;
        if (d3Var != null) {
            d3Var.z(i - 64);
        }
    }

    public /* synthetic */ d3(Object obj, long j, int i) {
        this.e = i;
        this.z = obj;
        this.y = j;
    }

    public d3(com.google.android.gms.common.util.a aVar) {
        this.e = 7;
        com.google.android.gms.common.internal.x.g(aVar);
        this.z = aVar;
    }

    public d3(okio.b0 b0Var) {
        this.e = 8;
        b0Var.getClass();
        this.z = b0Var;
        this.y = 262144L;
    }

    public /* synthetic */ d3(long j, Object obj, int i) {
        this.e = i;
        this.y = j;
        this.z = obj;
    }

    public d3() {
        this.e = 5;
        this.y = 0L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(o1 o1Var) {
        this(o1Var, 0L, 0);
        this.e = 0;
    }
}
