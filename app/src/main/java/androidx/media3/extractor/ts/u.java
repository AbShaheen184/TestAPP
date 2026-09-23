package androidx.media3.extractor.ts;

import androidx.media3.common.j0;
import androidx.media3.common.util.i0;
import androidx.media3.extractor.h0;
import com.google.common.collect.a1;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h {
    public String e;
    public h0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final androidx.media3.common.util.v a = new androidx.media3.common.util.v(new byte[15], 2);
    public final androidx.media3.common.util.u b = new androidx.media3.common.util.u();
    public final androidx.media3.common.util.v c = new androidx.media3.common.util.v();
    public final androidx.media3.extractor.mp4.a p = new androidx.media3.extractor.mp4.a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.d = 0;
        this.l = 0;
        this.a.J(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.v vVar) throws j0 {
        int i;
        int i2;
        int iG;
        int iG2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        a1 a1VarT;
        int iG3;
        long j3;
        boolean z;
        int i4;
        this.f.getClass();
        while (vVar.a() > 0) {
            int i5 = this.d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                androidx.media3.common.util.v vVar2 = this.c;
                androidx.media3.extractor.mp4.a aVar = this.p;
                if (i5 == 1) {
                    int iA = vVar.a();
                    androidx.media3.common.util.v vVar3 = this.a;
                    int iMin = Math.min(iA, vVar3.a());
                    vVar.k(vVar3.a, vVar3.b, iMin);
                    vVar3.N(iMin);
                    if (vVar3.a() == 0) {
                        int i9 = vVar3.c;
                        byte[] bArr2 = vVar3.a;
                        androidx.media3.common.util.u uVar = this.b;
                        uVar.l(bArr2, i9);
                        uVar.d();
                        int iC = androidx.room.t.C(uVar, 3, 8, 8);
                        aVar.y = iC;
                        if (iC != -1) {
                            _COROUTINE.a.o(Math.max(Math.max(2, 8), 32) <= 63);
                            com.google.firebase.b.g(com.google.firebase.b.g(3L, 255L), 4294967296L);
                            if (uVar.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = uVar.i(2);
                                if (jI == 3) {
                                    if (uVar.b() >= 8) {
                                        long jI2 = uVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (uVar.b() >= 32) {
                                                jI = uVar.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            aVar.z = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw j0.c("Contains sub-stream with an invalid packet label " + aVar.z);
                                }
                                if (j3 == 0) {
                                    int i10 = aVar.y;
                                    if (i10 == 1) {
                                        throw j0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw j0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw j0.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iC2 = androidx.room.t.C(uVar, 11, 24, 24);
                                aVar.A = iC2;
                                if (iC2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.n = 0;
                            this.o = aVar.A + i9 + this.o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            vVar3.M(i4);
                            this.f.f(vVar3.c, vVar3);
                            vVar3.J(2);
                            vVar2.J(aVar.A);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i11 = vVar3.c;
                            if (i11 < 15) {
                                vVar3.L(i11 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i5 != 2) {
                        org.mozilla.javascript.c.a();
                        return;
                    }
                    int i12 = aVar.y;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = vVar.b;
                        int iMin2 = Math.min(vVar.a(), vVar2.a());
                        vVar.k(vVar2.a, vVar2.b, iMin2);
                        vVar2.N(iMin2);
                        vVar.M(i13);
                    }
                    int iMin3 = Math.min(vVar.a(), aVar.A - this.n);
                    this.f.f(iMin3, vVar);
                    int i14 = this.n + iMin3;
                    this.n = i14;
                    if (i14 != aVar.A) {
                        continue;
                    } else {
                        int i15 = aVar.y;
                        if (i15 == 1) {
                            byte[] bArr3 = vVar2.a;
                            androidx.media3.common.util.u uVar2 = new androidx.media3.common.util.u(bArr3, bArr3.length);
                            int iG4 = uVar2.g(8);
                            int iG5 = uVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw j0.c("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = uVar2.g(24);
                            }
                            int iG6 = uVar2.g(3);
                            if (iG6 == 0) {
                                i3 = 768;
                            } else if (iG6 == 1) {
                                i3 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw j0.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw j0.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            uVar2.o(2);
                            androidx.room.t.H(uVar2);
                            int iG7 = uVar2.g(5);
                            int i17 = 0;
                            int iC3 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iG7 + 1) {
                                    int iG8 = uVar2.g(3);
                                    iC3 = androidx.room.t.C(uVar2, 5, 8, 16) + 1 + iC3;
                                    if ((iG8 == 0 || iG8 == 2) && uVar2.f()) {
                                        androidx.room.t.H(uVar2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iC4 = androidx.room.t.C(uVar2, 4, 8, 16) + 1;
                                    uVar2.n();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iC4) {
                                            int iG9 = uVar2.g(2);
                                            if (iG9 == 0) {
                                                uVar2.o(i7);
                                                if (uVar2.f()) {
                                                    uVar2.o(13);
                                                }
                                                if (c > 0) {
                                                    androidx.room.t.G(uVar2);
                                                }
                                            } else if (iG9 == i18) {
                                                uVar2.o(i7);
                                                boolean zF = uVar2.f();
                                                if (zF) {
                                                    uVar2.o(13);
                                                }
                                                if (zF) {
                                                    uVar2.n();
                                                }
                                                if (c > 0) {
                                                    androidx.room.t.G(uVar2);
                                                    iG3 = uVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    uVar2.o(6);
                                                    int iG10 = uVar2.g(2);
                                                    uVar2.o(4);
                                                    if (uVar2.f()) {
                                                        uVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i7) {
                                                        uVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        uVar2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iC3 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = uVar2.g(2);
                                                if (iG11 > 0 && uVar2.f()) {
                                                    uVar2.o(iFloor);
                                                }
                                                if (uVar2.f()) {
                                                    uVar2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    uVar2.n();
                                                }
                                            } else if (iG9 == i7) {
                                                androidx.room.t.C(uVar2, 4, i6, i19);
                                                int iC5 = androidx.room.t.C(uVar2, 4, i6, i19);
                                                if (uVar2.f()) {
                                                    androidx.room.t.C(uVar2, i6, i19, 0);
                                                }
                                                uVar2.n();
                                                if (iC5 > 0) {
                                                    uVar2.o(iC5 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (uVar2.f()) {
                                                int i21 = 8;
                                                int iC6 = androidx.room.t.C(uVar2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iC6) {
                                                    int iC7 = androidx.room.t.C(uVar2, 4, i21, 16);
                                                    int iC8 = androidx.room.t.C(uVar2, 4, i21, 16);
                                                    if (iC7 == 7) {
                                                        int iG12 = uVar2.g(4) + 1;
                                                        uVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i23 = 0; i23 < iG12; i23++) {
                                                            bArr4[i23] = (byte) uVar2.g(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        uVar2.o(iC8 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.z;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            a1VarT = null;
                                                        } else {
                                                            a1VarT = com.google.common.collect.h0.t(i0.b, bArr);
                                                        }
                                                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                                                        qVar.a = this.e;
                                                        qVar.m = androidx.media3.common.i0.p("video/mp2t");
                                                        qVar.n = androidx.media3.common.i0.p("audio/mhm1");
                                                        qVar.G = this.q;
                                                        qVar.j = strConcat;
                                                        qVar.q = a1VarT;
                                                        this.f.e(new androidx.media3.common.r(qVar));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.z;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            a1VarT = null;
                                                        } else {
                                                            a1VarT = null;
                                                        }
                                                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                                                        qVar2.a = this.e;
                                                        qVar2.m = androidx.media3.common.i0.p("video/mp2t");
                                                        qVar2.n = androidx.media3.common.i0.p("audio/mhm1");
                                                        qVar2.G = this.q;
                                                        qVar2.j = strConcat;
                                                        qVar2.q = a1VarT;
                                                        this.f.e(new androidx.media3.common.r(qVar2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.z;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            a1VarT = null;
                                                        } else {
                                                            a1VarT = null;
                                                        }
                                                        androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                                                        qVar3.a = this.e;
                                                        qVar3.m = androidx.media3.common.i0.p("video/mp2t");
                                                        qVar3.n = androidx.media3.common.i0.p("audio/mhm1");
                                                        qVar3.G = this.q;
                                                        qVar3.j = strConcat;
                                                        qVar3.q = a1VarT;
                                                        this.f.e(new androidx.media3.common.r(qVar3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.z;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            a1VarT = null;
                                                        } else {
                                                            a1VarT = null;
                                                        }
                                                        androidx.media3.common.q qVar4 = new androidx.media3.common.q();
                                                        qVar4.a = this.e;
                                                        qVar4.m = androidx.media3.common.i0.p("video/mp2t");
                                                        qVar4.n = androidx.media3.common.i0.p("audio/mhm1");
                                                        qVar4.G = this.q;
                                                        qVar4.j = strConcat;
                                                        qVar4.q = a1VarT;
                                                        this.f.e(new androidx.media3.common.r(qVar4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw j0.c("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = vVar2.a;
                                androidx.media3.common.util.u uVar3 = new androidx.media3.common.util.u(bArr5, bArr5.length);
                                if (uVar3.f()) {
                                    uVar3.o(2);
                                    iG = uVar3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i15 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.g(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i24 = this.k;
                if ((i24 & 2) == 0) {
                    vVar.M(vVar.c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (vVar.a() > 0) {
                                int i25 = this.l << 8;
                                this.l = i25;
                                int iZ = i25 | vVar.z();
                                this.l = iZ;
                                if ((iZ & 16777215) == 12583333) {
                                    vVar.M(vVar.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.e = e0Var.e;
        e0Var.b();
        this.f = pVar.u(e0Var.d, 1);
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
    }
}
