package androidx.media3.extractor.flac;

import androidx.activity.y;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.metadata.id3.h;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n {
    public p e;
    public h0 f;
    public androidx.media3.common.h0 h;
    public t i;
    public int j;
    public int k;
    public b l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final v b = new v(new byte[32768], 0);
    public final boolean c = false;
    public final r d = new r();
    public int g = 0;

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        androidx.media3.common.h0 h0VarG = new androidx.media3.exoplayer.hls.c(4).G(oVar, h.n, 0);
        if (h0VarG != null) {
            int length = h0VarG.a.length;
        }
        v vVar = new v(4);
        ((k) oVar).e(vVar.a, 0, 4, false);
        return vVar.B() == 1716281667;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            b bVar = this.l;
            if (bVar != null) {
                bVar.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.J(0);
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        t tVar;
        a0 sVar;
        long j;
        long j2;
        boolean zA;
        long j3;
        int i = this.g;
        androidx.media3.common.h0 h0Var = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            oVar.n();
            long jF = oVar.f();
            androidx.media3.common.h0 h0VarG = new androidx.media3.exoplayer.hls.c(4).G(oVar, !this.c ? null : h.n, 0);
            if (h0VarG != null && h0VarG.a.length != 0) {
                h0Var = h0VarG;
            }
            oVar.o((int) (oVar.f() - jF));
            this.h = h0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            oVar.w(bArr, 0, bArr.length);
            oVar.n();
            this.g = 2;
            return 0;
        }
        int i3 = 3;
        if (i == 2) {
            v vVar = new v(4);
            oVar.readFully(vVar.a, 0, 4);
            if (vVar.B() != 1716281667) {
                throw j0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i4 = 7;
        if (i == 3) {
            int i5 = 0;
            t tVar2 = this.i;
            boolean z2 = false;
            while (!z2) {
                oVar.n();
                byte[] bArr2 = new byte[4];
                u uVar = new u(bArr2, 4);
                int i6 = i5;
                oVar.w(bArr2, i6, 4);
                boolean zF = uVar.f();
                int iG = uVar.g(i4);
                int iG2 = uVar.g(24) + 4;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    oVar.readFully(bArr3, i6, 38);
                    tVar2 = new t(bArr3, 4);
                } else {
                    if (tVar2 == null) {
                        kotlinx.coroutines.future.a.r();
                        return 0;
                    }
                    androidx.media3.common.h0 h0Var2 = tVar2.l;
                    if (iG == i3) {
                        v vVar2 = new v(iG2);
                        oVar.readFully(vVar2.a, i6, iG2);
                        tVar = new t(tVar2.a, tVar2.b, tVar2.c, tVar2.d, tVar2.e, tVar2.g, tVar2.h, tVar2.j, androidx.media3.extractor.b.t(vVar2), tVar2.l);
                    } else if (iG == 4) {
                        v vVar3 = new v(iG2);
                        oVar.readFully(vVar3.a, 0, iG2);
                        vVar3.N(4);
                        androidx.media3.common.h0 h0VarR = androidx.media3.extractor.b.r(Arrays.asList((String[]) androidx.media3.extractor.b.u(vVar3, false, false).e));
                        if (h0Var2 != null) {
                            h0VarR = h0Var2.b(h0VarR);
                        }
                        tVar = new t(tVar2.a, tVar2.b, tVar2.c, tVar2.d, tVar2.e, tVar2.g, tVar2.h, tVar2.j, tVar2.k, h0VarR);
                    } else if (iG == 6) {
                        v vVar4 = new v(iG2);
                        oVar.readFully(vVar4.a, 0, iG2);
                        vVar4.N(4);
                        androidx.media3.common.h0 h0Var3 = new androidx.media3.common.h0(com.google.common.collect.h0.s(androidx.media3.extractor.metadata.flac.a.d(vVar4)));
                        if (h0Var2 != null) {
                            h0Var3 = h0Var2.b(h0Var3);
                        }
                        tVar = new t(tVar2.a, tVar2.b, tVar2.c, tVar2.d, tVar2.e, tVar2.g, tVar2.h, tVar2.j, tVar2.k, h0Var3);
                    } else {
                        oVar.o(iG2);
                    }
                    tVar2 = tVar;
                }
                String str = i0.a;
                this.i = tVar2;
                z2 = zF;
                i3 = 3;
                i4 = 7;
                i5 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            androidx.media3.common.r rVarC = this.i.c(bArr, this.h);
            h0 h0Var4 = this.f;
            q qVarA = rVarC.a();
            qVarA.m = androidx.media3.common.i0.p("audio/flac");
            h0Var4.e(new androidx.media3.common.r(qVarA));
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        if (i == 4) {
            oVar.n();
            v vVar5 = new v(2);
            oVar.w(vVar5.a, 0, 2);
            int iG3 = vVar5.G();
            if ((iG3 >> 2) != 16382) {
                oVar.n();
                throw j0.a(null, "First frame does not start with sync code.");
            }
            oVar.n();
            this.k = iG3;
            p pVar = this.e;
            String str2 = i0.a;
            long position = oVar.getPosition();
            long length = oVar.getLength();
            this.i.getClass();
            t tVar3 = this.i;
            androidx.localbroadcastmanager.content.b bVar = tVar3.k;
            if (bVar != null && ((long[]) bVar.y).length > 0) {
                sVar = new s(tVar3, position, 0);
                i2 = 0;
            } else if (length == -1 || tVar3.j <= 0) {
                i2 = 0;
                sVar = new s(tVar3.b());
            } else {
                int i7 = this.k;
                int i8 = tVar3.c;
                y yVar = new y(tVar3, 19);
                a aVar = new a(tVar3, i7);
                long jB = tVar3.b();
                long j4 = tVar3.j;
                int i9 = tVar3.d;
                if (i9 > 0) {
                    j = ((((long) i9) + ((long) i8)) / 2) + 1;
                } else {
                    int i10 = tVar3.a;
                    j = 64 + (((((i10 != tVar3.b || i10 <= 0) ? 4096L : i10) * ((long) tVar3.g)) * ((long) tVar3.h)) / 8);
                }
                b bVar2 = new b(yVar, aVar, jB, j4, position, length, j, Math.max(6, i8));
                this.l = bVar2;
                sVar = bVar2.a;
            }
            pVar.h(sVar);
            this.g = 5;
            return i2;
        }
        if (i != 5) {
            org.mozilla.javascript.c.a();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        b bVar3 = this.l;
        if (bVar3 != null && bVar3.c != null) {
            return bVar3.b(oVar, rVar);
        }
        if (this.n == -1) {
            t tVar4 = this.i;
            oVar.n();
            oVar.g(1);
            byte[] bArr4 = new byte[1];
            oVar.w(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            oVar.g(2);
            i4 = z3 ? 7 : 6;
            v vVar6 = new v(i4);
            byte[] bArr5 = vVar6.a;
            int i11 = 0;
            while (i11 < i4) {
                int iJ = oVar.j(bArr5, i11, i4 - i11);
                if (iJ == -1) {
                    break;
                }
                i11 += iJ;
            }
            vVar6.L(i11);
            oVar.n();
            try {
                long jH = vVar6.H();
                if (!z3) {
                    jH *= (long) tVar4.b;
                }
                long j5 = tVar4.j;
                if (j5 == 0 || jH <= j5) {
                    j3 = jH;
                } else {
                    z = false;
                    j3 = 0;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z) {
                throw j0.a(null, null);
            }
            this.n = j3;
        } else {
            v vVar7 = this.b;
            int i12 = vVar7.c;
            if (i12 < 32768) {
                int i13 = oVar.read(vVar7.a, i12, 32768 - i12);
                z = i13 == -1;
                if (!z) {
                    vVar7.L(i12 + i13);
                } else if (vVar7.a() == 0) {
                    long j6 = this.n * 1000000;
                    t tVar5 = this.i;
                    String str3 = i0.a;
                    this.f.g(j6 / ((long) tVar5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i14 = vVar7.b;
            int i15 = this.m;
            int i16 = this.j;
            if (i15 < i16) {
                vVar7.N(Math.min(i16 - i15, vVar7.a()));
            }
            this.i.getClass();
            int i17 = vVar7.b;
            while (true) {
                int i18 = vVar7.c - 16;
                r rVar2 = this.d;
                if (i17 > i18) {
                    if (z) {
                        while (true) {
                            int i19 = vVar7.c;
                            if (i17 <= i19 - this.j) {
                                vVar7.M(i17);
                                try {
                                    zA = androidx.media3.extractor.b.a(vVar7, this.i, this.k, rVar2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (vVar7.b > vVar7.c) {
                                    zA = false;
                                }
                                if (zA) {
                                    vVar7.M(i17);
                                    j2 = rVar2.a;
                                    break;
                                }
                                i17++;
                            } else {
                                vVar7.M(i19);
                            }
                        }
                    } else {
                        vVar7.M(i17);
                    }
                    j2 = -1;
                    break;
                }
                vVar7.M(i17);
                if (androidx.media3.extractor.b.a(vVar7, this.i, this.k, rVar2)) {
                    vVar7.M(i17);
                    j2 = rVar2.a;
                    break;
                }
                i17++;
            }
            int i20 = vVar7.b - i14;
            vVar7.M(i14);
            this.f.f(i20, vVar7);
            int i21 = this.m + i20;
            this.m = i21;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                t tVar6 = this.i;
                String str4 = i0.a;
                this.f.g(j7 / ((long) tVar6.e), 1, i21, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = vVar7.a.length - vVar7.c;
            if (vVar7.a() < 16 && length2 < 16) {
                int iA = vVar7.a();
                byte[] bArr6 = vVar7.a;
                System.arraycopy(bArr6, vVar7.b, bArr6, 0, iA);
                vVar7.M(0);
                vVar7.L(iA);
            }
        }
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.e = pVar;
        this.f = pVar.u(0, 1);
        pVar.r();
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
