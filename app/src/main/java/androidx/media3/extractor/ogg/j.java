package androidx.media3.extractor.ogg;

import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.m0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.extractor.y;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public androidx.fragment.app.h n;
    public int o;
    public boolean p;
    public y q;
    public t r;

    @Override // androidx.media3.extractor.ogg.i
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        y yVar = this.q;
        this.o = yVar != null ? yVar.e : 0;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final long b(v vVar) {
        byte b = vVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        androidx.fragment.app.h hVar = this.n;
        hVar.getClass();
        boolean z = ((m0[]) hVar.C)[(b >> 1) & (255 >>> (8 - hVar.y))].e;
        y yVar = (y) hVar.z;
        int i = !z ? yVar.e : yVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = vVar.a;
        int length = bArr.length;
        int i2 = vVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            vVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            vVar.L(i2);
        }
        byte[] bArr2 = vVar.a;
        int i3 = vVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b0  */
    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // androidx.media3.extractor.ogg.i
    public final boolean c(v vVar, long j, androidx.localbroadcastmanager.content.b bVar) throws j0 {
        androidx.fragment.app.h hVar;
        if (this.n != null) {
            ((r) bVar.y).getClass();
            return false;
        }
        y yVar = this.q;
        int i = 4;
        if (yVar != null) {
            t tVar = this.r;
            if (tVar == null) {
                this.r = androidx.media3.extractor.b.u(vVar, true, true);
            } else {
                int i2 = vVar.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(vVar.a, 0, bArr, 0, i2);
                int i3 = yVar.a;
                int i4 = 5;
                androidx.media3.extractor.b.w(5, vVar, false);
                int iZ = vVar.z() + 1;
                u uVar = new u(vVar.a);
                int i5 = 8;
                uVar.o(vVar.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iZ) {
                        int i8 = i5;
                        if (uVar.g(24) != 5653314) {
                            throw j0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((uVar.d * 8) + uVar.e));
                        }
                        int iG = uVar.g(16);
                        int iG2 = uVar.g(24);
                        if (uVar.f()) {
                            uVar.o(i4);
                            int iG3 = 0;
                            while (iG3 < iG2) {
                                int i9 = 0;
                                for (int i10 = iG2 - iG3; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                iG3 += uVar.g(i9);
                            }
                        } else {
                            boolean zF = uVar.f();
                            for (int i11 = 0; i11 < iG2; i11++) {
                                if (!zF) {
                                    uVar.o(i4);
                                } else if (uVar.f()) {
                                    uVar.o(i4);
                                }
                            }
                        }
                        int iG4 = uVar.g(4);
                        if (iG4 > 2) {
                            throw j0.a(null, "lookup type greater than 2 not decodable: " + iG4);
                        }
                        if (iG4 == 1 || iG4 == 2) {
                            uVar.o(32);
                            uVar.o(32);
                            int iG5 = uVar.g(4) + 1;
                            uVar.o(1);
                            uVar.o((int) ((iG4 == 1 ? iG != 0 ? (long) Math.floor(Math.pow(iG2, 1.0d / ((double) iG))) : 0L : ((long) iG2) * ((long) iG)) * ((long) iG5)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i12 = i5;
                        int i13 = 6;
                        int iG6 = uVar.g(6) + 1;
                        for (int i14 = 0; i14 < iG6; i14++) {
                            if (uVar.g(16) != 0) {
                                throw j0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iG7 = uVar.g(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 >= iG7) {
                                int iG8 = uVar.g(i13) + 1;
                                int i18 = 0;
                                while (i18 < iG8) {
                                    if (uVar.g(16) > 2) {
                                        throw j0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    uVar.o(24);
                                    uVar.o(24);
                                    uVar.o(24);
                                    int iG9 = uVar.g(i13) + 1;
                                    int i19 = 8;
                                    uVar.o(8);
                                    int[] iArr = new int[iG9];
                                    for (int i20 = 0; i20 < iG9; i20++) {
                                        iArr[i20] = ((uVar.f() ? uVar.g(5) : 0) * 8) + uVar.g(3);
                                    }
                                    int i21 = 0;
                                    while (i21 < iG9) {
                                        int i22 = 0;
                                        while (i22 < i19) {
                                            if ((iArr[i21] & (1 << i22)) != 0) {
                                                uVar.o(i19);
                                            }
                                            i22++;
                                            i19 = 8;
                                        }
                                        i21++;
                                        i19 = 8;
                                    }
                                    i18++;
                                    i13 = 6;
                                }
                                int iG10 = uVar.g(i13) + 1;
                                for (int i23 = 0; i23 < iG10; i23++) {
                                    int iG11 = uVar.g(16);
                                    if (iG11 != 0) {
                                        androidx.media3.common.util.b.f("VorbisUtil", "mapping type other than 0 not supported: " + iG11);
                                    } else {
                                        int iG12 = uVar.f() ? uVar.g(4) + 1 : 1;
                                        if (uVar.f()) {
                                            int iG13 = uVar.g(8) + 1;
                                            for (int i24 = 0; i24 < iG13; i24++) {
                                                int i25 = i3 - 1;
                                                int i26 = 0;
                                                for (int i27 = i25; i27 > 0; i27 >>>= 1) {
                                                    i26++;
                                                }
                                                uVar.o(i26);
                                                int i28 = 0;
                                                while (i25 > 0) {
                                                    i28++;
                                                    i25 >>>= 1;
                                                }
                                                uVar.o(i28);
                                            }
                                        }
                                        if (uVar.g(2) != 0) {
                                            throw j0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iG12 > 1) {
                                            for (int i29 = 0; i29 < i3; i29++) {
                                                uVar.o(4);
                                            }
                                        }
                                        for (int i30 = 0; i30 < iG12; i30++) {
                                            uVar.o(8);
                                            uVar.o(8);
                                            uVar.o(8);
                                        }
                                    }
                                }
                                int iG14 = uVar.g(6);
                                int i31 = iG14 + 1;
                                m0[] m0VarArr = new m0[i31];
                                for (int i32 = 0; i32 < i31; i32++) {
                                    boolean zF2 = uVar.f();
                                    uVar.g(16);
                                    uVar.g(16);
                                    uVar.g(8);
                                    m0VarArr[i32] = new m0(zF2);
                                }
                                if (!uVar.f()) {
                                    throw j0.a(null, "framing bit after modes not set as expected");
                                }
                                int i33 = 0;
                                while (iG14 > 0) {
                                    i33++;
                                    iG14 >>>= 1;
                                }
                                hVar = new androidx.fragment.app.h(yVar, tVar, bArr, m0VarArr, i33);
                                break;
                            }
                            int iG15 = uVar.g(i7);
                            if (iG15 == 0) {
                                int i34 = i12;
                                uVar.o(i34);
                                uVar.o(16);
                                uVar.o(16);
                                uVar.o(6);
                                uVar.o(i34);
                                int iG16 = uVar.g(4) + 1;
                                int i35 = 0;
                                while (i35 < iG16) {
                                    uVar.o(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iG15 != i15) {
                                    throw j0.a(null, "floor type greater than 1 not decodable: " + iG15);
                                }
                                int iG17 = uVar.g(5);
                                int[] iArr2 = new int[iG17];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iG17; i37++) {
                                    int iG18 = uVar.g(i);
                                    iArr2[i37] = iG18;
                                    if (iG18 > i36) {
                                        i36 = iG18;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr3 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    iArr3[i39] = uVar.g(i17) + 1;
                                    int iG19 = uVar.g(2);
                                    int i40 = i12;
                                    if (iG19 > 0) {
                                        uVar.o(i40);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i41 = 0;
                                    for (int i42 = 1; i41 < (i42 << iG19); i42 = 1) {
                                        uVar.o(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    iArr3 = iArr4;
                                    i12 = 8;
                                    i17 = 3;
                                }
                                int[] iArr5 = iArr3;
                                uVar.o(2);
                                int iG20 = uVar.g(4);
                                int i43 = 0;
                                int i44 = 0;
                                for (int i45 = 0; i45 < iG17; i45++) {
                                    i43 += iArr5[iArr2[i45]];
                                    while (i44 < i43) {
                                        uVar.o(iG20);
                                        i44++;
                                    }
                                }
                            }
                            i16++;
                            i12 = 8;
                            i13 = 6;
                            i = 4;
                            i7 = 16;
                            i15 = 1;
                        }
                    }
                }
            }
            this.n = hVar;
            if (hVar == null) {
                return true;
            }
            y yVar2 = (y) hVar.z;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) yVar2.g);
            arrayList.add((byte[]) hVar.B);
            h0 h0VarR = androidx.media3.extractor.b.r(com.google.common.collect.h0.p((String[]) ((t) hVar.A).e));
            q qVar = new q();
            qVar.m = i0.p("audio/ogg");
            qVar.n = i0.p("audio/vorbis");
            qVar.h = yVar2.d;
            qVar.i = yVar2.c;
            qVar.F = yVar2.a;
            qVar.G = yVar2.b;
            qVar.q = arrayList;
            qVar.k = h0VarR;
            bVar.y = new r(qVar);
            return true;
        }
        androidx.media3.extractor.b.w(1, vVar, false);
        vVar.r();
        int iZ2 = vVar.z();
        int iR = vVar.r();
        int iO = vVar.o();
        if (iO <= 0) {
            iO = -1;
        }
        int iO2 = vVar.o();
        int i46 = iO2 > 0 ? iO2 : -1;
        vVar.o();
        int iZ3 = vVar.z();
        int iPow = (int) Math.pow(2.0d, iZ3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iZ3 & 240) >> 4);
        vVar.z();
        ?? CopyOf = Arrays.copyOf(vVar.a, vVar.c);
        y yVar3 = new y();
        yVar3.a = iZ2;
        yVar3.b = iR;
        yVar3.c = iO;
        yVar3.d = i46;
        yVar3.e = iPow;
        yVar3.f = iPow2;
        yVar3.g = CopyOf;
        this.q = yVar3;
        hVar = null;
        this.n = hVar;
        if (hVar == null) {
            return true;
        }
        y yVar4 = (y) hVar.z;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) yVar4.g);
        arrayList2.add((byte[]) hVar.B);
        h0 h0VarR2 = androidx.media3.extractor.b.r(com.google.common.collect.h0.p((String[]) ((t) hVar.A).e));
        q qVar2 = new q();
        qVar2.m = i0.p("audio/ogg");
        qVar2.n = i0.p("audio/vorbis");
        qVar2.h = yVar4.d;
        qVar2.i = yVar4.c;
        qVar2.F = yVar4.a;
        qVar2.G = yVar4.b;
        qVar2.q = arrayList2;
        qVar2.k = h0VarR2;
        bVar.y = new r(qVar2);
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
