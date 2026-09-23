package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.extractor.h0;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {
    public final /* synthetic */ int a;
    public final androidx.media3.common.util.u b;
    public final androidx.media3.common.util.v c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public h0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public androidx.media3.common.r m;
    public int n;
    public long o;

    public b(String str, int i, String str2, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                androidx.media3.common.util.u uVar = new androidx.media3.common.util.u(new byte[16], 16);
                this.b = uVar;
                this.c = new androidx.media3.common.util.v(uVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                androidx.media3.common.util.u uVar2 = new androidx.media3.common.util.u(new byte[128], 128);
                this.b = uVar2;
                this.c = new androidx.media3.common.util.v(uVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.v vVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int iG;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.a) {
            case 0:
                this.h.getClass();
                while (vVar.a() > 0) {
                    int i17 = this.i;
                    androidx.media3.common.util.v vVar2 = this.c;
                    if (i17 == 0) {
                        while (vVar.a() > 0) {
                            if (this.k) {
                                int iZ = vVar.z();
                                if (iZ == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = vVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                }
                                this.k = iZ == 11;
                            } else {
                                this.k = vVar.z() == 11;
                            }
                            break;
                        }
                    } else if (i17 == 1) {
                        byte[] bArr2 = vVar2.a;
                        int iMin = Math.min(vVar.a(), 128 - this.j);
                        vVar.k(bArr2, this.j, iMin);
                        int i18 = this.j + iMin;
                        this.j = i18;
                        if (i18 == 128) {
                            androidx.media3.common.util.u uVar = this.b;
                            uVar.m(0);
                            int[] iArr = androidx.media3.extractor.b.f;
                            int[] iArr2 = androidx.media3.extractor.b.d;
                            int iE = uVar.e();
                            uVar.o(40);
                            byte b2 = uVar.g(5) > 10;
                            uVar.m(iE);
                            if (b2 == true) {
                                uVar.o(16);
                                int iG2 = uVar.g(2);
                                if (iG2 == 0) {
                                    b = 0;
                                } else if (iG2 != 1) {
                                    b = iG2 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b = 1;
                                }
                                uVar.o(3);
                                iG = (uVar.g(11) + 1) * 2;
                                int iG3 = uVar.g(2);
                                if (iG3 == 3) {
                                    i5 = androidx.media3.extractor.b.e[uVar.g(2)];
                                    i6 = 3;
                                    i7 = 6;
                                } else {
                                    int iG4 = uVar.g(2);
                                    int i19 = androidx.media3.extractor.b.c[iG4];
                                    i5 = iArr2[iG3];
                                    i6 = iG4;
                                    i7 = i19;
                                }
                                i3 = i7 * LibretroCore.SCREEN_WIDTH;
                                int i20 = (iG * i5) / (i7 * 32);
                                int iG5 = uVar.g(3);
                                boolean zF = uVar.f();
                                i2 = iArr[iG5] + (zF ? 1 : 0);
                                uVar.o(10);
                                if (uVar.f()) {
                                    uVar.o(8);
                                }
                                if (iG5 == 0) {
                                    uVar.o(5);
                                    if (uVar.f()) {
                                        uVar.o(8);
                                    }
                                }
                                if (b == 1 && uVar.f()) {
                                    uVar.o(16);
                                }
                                if (uVar.f()) {
                                    if (iG5 > 2) {
                                        uVar.o(2);
                                    }
                                    if ((iG5 & 1) == 0 || iG5 <= 2) {
                                        i12 = 6;
                                    } else {
                                        i12 = 6;
                                        uVar.o(6);
                                    }
                                    if ((iG5 & 4) != 0) {
                                        uVar.o(i12);
                                    }
                                    if (zF && uVar.f()) {
                                        uVar.o(5);
                                    }
                                    if (b != 0) {
                                        i8 = i6;
                                    } else {
                                        if (uVar.f()) {
                                            i13 = 6;
                                            uVar.o(6);
                                        } else {
                                            i13 = 6;
                                        }
                                        if (iG5 == 0 && uVar.f()) {
                                            uVar.o(i13);
                                        }
                                        if (uVar.f()) {
                                            uVar.o(i13);
                                        }
                                        int iG6 = uVar.g(2);
                                        if (iG6 == 1) {
                                            uVar.o(5);
                                            i15 = 2;
                                        } else {
                                            if (iG6 == 2) {
                                                uVar.o(12);
                                            } else if (iG6 == 3) {
                                                int iG7 = uVar.g(5);
                                                if (uVar.f()) {
                                                    uVar.o(5);
                                                    if (uVar.f()) {
                                                        i16 = 4;
                                                        uVar.o(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        uVar.o(i16);
                                                    }
                                                    if (uVar.f()) {
                                                        if (uVar.f()) {
                                                            uVar.o(i16);
                                                        }
                                                        if (uVar.f()) {
                                                            uVar.o(i16);
                                                        }
                                                    }
                                                }
                                                if (uVar.f()) {
                                                    uVar.o(5);
                                                    if (uVar.f()) {
                                                        uVar.o(7);
                                                        if (uVar.f()) {
                                                            i14 = 8;
                                                            uVar.o(8);
                                                        } else {
                                                            i14 = 8;
                                                        }
                                                    } else {
                                                        i14 = 8;
                                                    }
                                                } else {
                                                    i14 = 8;
                                                }
                                                i15 = 2;
                                                uVar.o((iG7 + 2) * i14);
                                                uVar.c();
                                            }
                                            i15 = 2;
                                        }
                                        if (iG5 < i15) {
                                            if (uVar.f()) {
                                                uVar.o(14);
                                            }
                                            if (iG5 == 0 && uVar.f()) {
                                                uVar.o(14);
                                            }
                                        }
                                        if (uVar.f()) {
                                            i8 = i6;
                                            if (i8 == 0) {
                                                uVar.o(5);
                                            } else {
                                                for (int i21 = 0; i21 < i7; i21++) {
                                                    if (uVar.f()) {
                                                        uVar.o(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i8 = i6;
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                                if (uVar.f()) {
                                    uVar.o(5);
                                    if (iG5 == 2) {
                                        uVar.o(4);
                                    }
                                    if (iG5 >= 6) {
                                        uVar.o(2);
                                    }
                                    if (uVar.f()) {
                                        i11 = 8;
                                        uVar.o(8);
                                    } else {
                                        i11 = 8;
                                    }
                                    if (iG5 == 0 && uVar.f()) {
                                        uVar.o(i11);
                                    }
                                    i9 = 3;
                                    if (iG3 < 3) {
                                        uVar.n();
                                    }
                                } else {
                                    i9 = 3;
                                }
                                if (b == 0 && i8 != i9) {
                                    uVar.n();
                                }
                                if (b == 2 && (i8 == i9 || uVar.f())) {
                                    i10 = 6;
                                    uVar.o(6);
                                } else {
                                    i10 = 6;
                                }
                                str = (uVar.f() && uVar.g(i10) == 1 && uVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i4 = i20;
                            } else {
                                uVar.o(32);
                                int iG8 = uVar.g(2);
                                String str2 = iG8 == 3 ? null : "audio/ac3";
                                int iG9 = uVar.g(6);
                                int i22 = androidx.media3.extractor.b.g[iG9 / 2] * 1000;
                                int iE2 = androidx.media3.extractor.b.e(iG8, iG9);
                                uVar.o(8);
                                int iG10 = uVar.g(3);
                                if ((iG10 & 1) == 0 || iG10 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    uVar.o(2);
                                }
                                if ((iG10 & 4) != 0) {
                                    uVar.o(i);
                                }
                                if (iG10 == i) {
                                    uVar.o(i);
                                }
                                int i23 = iG8 < 3 ? iArr2[iG8] : -1;
                                i2 = iArr[iG10] + (uVar.f() ? 1 : 0);
                                i3 = 1536;
                                str = str2;
                                i4 = i22;
                                iG = iE2;
                                i5 = i23;
                            }
                            androidx.media3.common.r rVar = this.m;
                            if (rVar == null || i2 != rVar.G || i5 != rVar.H || !Objects.equals(str, rVar.o)) {
                                androidx.media3.common.q qVar = new androidx.media3.common.q();
                                qVar.a = this.g;
                                qVar.m = i0.p(this.f);
                                qVar.n = i0.p(str);
                                qVar.F = i2;
                                qVar.G = i5;
                                qVar.d = this.d;
                                qVar.f = this.e;
                                qVar.i = i4;
                                if ("audio/ac3".equals(str)) {
                                    qVar.h = i4;
                                }
                                androidx.media3.common.r rVar2 = new androidx.media3.common.r(qVar);
                                this.m = rVar2;
                                this.h.e(rVar2);
                            }
                            this.n = iG;
                            this.l = (((long) i3) * 1000000) / ((long) this.m.H);
                            vVar2.M(0);
                            this.h.f(128, vVar2);
                            this.i = 2;
                        }
                    } else if (i17 == 2) {
                        int iMin2 = Math.min(vVar.a(), this.n - this.j);
                        this.h.f(iMin2, vVar);
                        int i24 = this.j + iMin2;
                        this.j = i24;
                        if (i24 == this.n) {
                            _COROUTINE.a.A(this.o != -9223372036854775807L);
                            this.h.g(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                this.h.getClass();
                while (vVar.a() > 0) {
                    int i25 = this.i;
                    androidx.media3.common.util.v vVar3 = this.c;
                    if (i25 == 0) {
                        while (vVar.a() > 0) {
                            if (this.k) {
                                int iZ2 = vVar.z();
                                this.k = iZ2 == 172;
                                if (iZ2 == 64 || iZ2 == 65) {
                                    byte b3 = iZ2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = vVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b3 == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = vVar.z() == 172;
                            }
                            break;
                        }
                    } else if (i25 == 1) {
                        byte[] bArr4 = vVar3.a;
                        int iMin3 = Math.min(vVar.a(), 16 - this.j);
                        vVar.k(bArr4, this.j, iMin3);
                        int i26 = this.j + iMin3;
                        this.j = i26;
                        if (i26 == 16) {
                            androidx.media3.common.util.u uVar2 = this.b;
                            uVar2.m(0);
                            androidx.media3.container.j jVarM = androidx.media3.extractor.b.m(uVar2);
                            int i27 = jVarM.a;
                            androidx.media3.common.r rVar3 = this.m;
                            if (rVar3 == null || 2 != rVar3.G || i27 != rVar3.H || !"audio/ac4".equals(rVar3.o)) {
                                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                                qVar2.a = this.g;
                                qVar2.m = i0.p(this.f);
                                qVar2.n = i0.p("audio/ac4");
                                qVar2.F = 2;
                                qVar2.G = i27;
                                qVar2.d = this.d;
                                qVar2.f = this.e;
                                androidx.media3.common.r rVar4 = new androidx.media3.common.r(qVar2);
                                this.m = rVar4;
                                this.h.e(rVar4);
                            }
                            this.n = jVarM.b;
                            this.l = (((long) jVarM.c) * 1000000) / ((long) this.m.H);
                            vVar3.M(0);
                            this.h.f(16, vVar3);
                            this.i = 2;
                        }
                    } else if (i25 == 2) {
                        int iMin4 = Math.min(vVar.a(), this.n - this.j);
                        this.h.f(iMin4, vVar);
                        int i28 = this.j + iMin4;
                        this.j = i28;
                        if (i28 == this.n) {
                            _COROUTINE.a.A(this.o != -9223372036854775807L);
                            this.h.g(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
        int i = this.a;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                e0Var.a();
                e0Var.b();
                this.g = e0Var.e;
                e0Var.b();
                this.h = pVar.u(e0Var.d, 1);
                break;
            default:
                e0Var.a();
                e0Var.b();
                this.g = e0Var.e;
                e0Var.b();
                this.h = pVar.u(e0Var.d, 1);
                break;
        }
    }

    private final void b(boolean z) {
    }

    private final void g(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(null, 0, str, 0);
        this.a = 0;
    }
}
