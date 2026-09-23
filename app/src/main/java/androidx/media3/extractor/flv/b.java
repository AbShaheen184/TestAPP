package androidx.media3.extractor.flv;

import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.m;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public final v a = new v(4);
    public final v b = new v(9);
    public final v c = new v(11);
    public final v d = new v();
    public final c e;
    public p f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public e p;

    public b() {
        c cVar = new c(new m());
        cVar.y = -9223372036854775807L;
        cVar.z = new long[0];
        cVar.A = new long[0];
        this.e = cVar;
        this.g = 1;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        v vVar = this.a;
        k kVar = (k) oVar;
        kVar.e(vVar.a, 0, 3, false);
        vVar.M(0);
        if (vVar.C() == 4607062) {
            kVar.e(vVar.a, 0, 2, false);
            vVar.M(0);
            if ((vVar.G() & Context.VERSION_ECMASCRIPT) == 0) {
                kVar.e(vVar.a, 0, 4, false);
                vVar.M(0);
                int iM = vVar.m();
                kVar.C = 0;
                kVar.a(iM, false);
                kVar.e(vVar.a, 0, 4, false);
                vVar.M(0);
                if (vVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:184:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0189  */
    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        boolean z;
        boolean z2;
        long j4;
        boolean z3;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                v vVar = this.b;
                if (!oVar.b(vVar.a, 0, 9, true)) {
                    return -1;
                }
                vVar.M(0);
                vVar.N(4);
                int iZ = vVar.z();
                boolean z4 = (iZ & 4) != 0;
                boolean z5 = (iZ & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new a(this.f.u(8, 1));
                }
                if (z5 && this.p == null) {
                    this.p = new e(this.f.u(9, 2));
                }
                this.f.r();
                this.j = vVar.m() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                oVar.o(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                v vVar2 = this.c;
                if (!oVar.b(vVar2.a, 0, 11, true)) {
                    return -1;
                }
                vVar2.M(0);
                this.k = vVar2.z();
                this.l = vVar2.C();
                this.m = vVar2.C();
                this.m = (((long) (vVar2.z() << 24)) | this.m) * 1000;
                vVar2.N(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    org.mozilla.javascript.c.a();
                    return 0;
                }
                boolean z6 = this.h;
                c cVar = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (cVar.y == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        i2 = 0;
                        if (i == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (i == 18 || this.n) {
                                oVar.o(this.l);
                                z = false;
                                z2 = false;
                            } else {
                                v vVarF = f(oVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (vVarF.z() == 2 && "onMetaData".equals(c.y(vVarF)) && vVarF.a() != 0 && vVarF.z() == 8) {
                                    HashMap mapX = c.x(vVarF);
                                    Object obj = mapX.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.y = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapX.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.z = new long[size];
                                            cVar.A = new long[size];
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.z = new long[0];
                                                    cVar.A = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                cVar.z[i4] = (long) (((Double) obj6).doubleValue() * d2);
                                                cVar.A[i4] = ((Double) obj5).longValue();
                                                i4++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j5 = cVar.y;
                                if (j5 != -9223372036854775807L) {
                                    this.f.h(new x(j5, cVar.A, cVar.z));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.h(new s(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            v vVarF2 = f(oVar);
                            eVar.getClass();
                            int iZ2 = vVarF2.z();
                            int i5 = (iZ2 >> 4) & 15;
                            int i6 = iZ2 & 15;
                            if (i6 != 7) {
                                throw new d(androidx.privacysandbox.ads.adservices.java.internal.a.n(i6, "Video format not supported: "));
                            }
                            eVar.D = i5;
                            if (i5 != 5) {
                                v vVar3 = eVar.y;
                                h0 h0Var = (h0) eVar.e;
                                v vVar4 = eVar.z;
                                int iZ3 = vVarF2.z();
                                vVarF2.f(3);
                                byte[] bArr = vVarF2.a;
                                j3 = -9223372036854775807L;
                                int i7 = vVarF2.b;
                                int i8 = i7 + 1;
                                vVarF2.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                vVarF2.b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                vVarF2.b = i7 + 3;
                                long j6 = (((long) ((bArr[i10] & 255) | i11)) * 1000) + j2;
                                boolean z7 = false;
                                if (iZ3 == 0 && !eVar.B) {
                                    byte[] bArr2 = new byte[vVarF2.a()];
                                    v vVar5 = new v(bArr2);
                                    vVarF2.k(bArr2, 0, vVarF2.a());
                                    androidx.media3.extractor.d dVarA = androidx.media3.extractor.d.a(vVar5);
                                    eVar.A = dVarA.b;
                                    q qVar = new q();
                                    qVar.m = i0.p("video/x-flv");
                                    qVar.n = i0.p("video/avc");
                                    qVar.j = dVarA.l;
                                    qVar.u = dVarA.c;
                                    qVar.v = dVarA.d;
                                    qVar.A = dVarA.k;
                                    qVar.q = dVarA.a;
                                    h0Var.e(new androidx.media3.common.r(qVar));
                                    eVar.B = true;
                                } else if (iZ3 == 1 && eVar.B) {
                                    int i12 = eVar.D == 1 ? 1 : 0;
                                    if (eVar.C || i12 != 0) {
                                        byte[] bArr3 = vVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i13 = 4 - eVar.A;
                                        int i14 = 0;
                                        while (vVarF2.a() > 0) {
                                            vVarF2.k(vVar4.a, i13, eVar.A);
                                            vVar4.M(0);
                                            int iD = vVar4.D();
                                            vVar3.M(0);
                                            h0Var.f(4, vVar3);
                                            h0Var.f(iD, vVarF2);
                                            i14 = i14 + 4 + iD;
                                        }
                                        ((h0) eVar.e).g(j6, i12, i14, 0, null);
                                        eVar.C = true;
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                        }
                        z = false;
                        z2 = true;
                    } else {
                        if (!this.n) {
                            this.f.h(new s(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        v vVarF3 = f(oVar);
                        h0 h0Var2 = (h0) aVar.e;
                        if (aVar.y) {
                            i2 = 0;
                            vVarF3.N(1);
                        } else {
                            int iZ4 = vVarF3.z();
                            int i15 = (iZ4 >> 4) & 15;
                            aVar.A = i15;
                            i2 = 0;
                            if (i15 == 2) {
                                int i16 = a.B[(iZ4 >> 2) & 3];
                                q qVar2 = new q();
                                qVar2.m = i0.p("video/x-flv");
                                qVar2.n = i0.p("audio/mpeg");
                                qVar2.F = 1;
                                qVar2.G = i16;
                                h0Var2.e(new androidx.media3.common.r(qVar2));
                                aVar.z = true;
                            } else if (i15 == 7 || i15 == 8) {
                                String str = i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                q qVar3 = new q();
                                qVar3.m = i0.p("video/x-flv");
                                qVar3.n = i0.p(str);
                                qVar3.F = 1;
                                qVar3.G = 8000;
                                h0Var2.e(new androidx.media3.common.r(qVar3));
                                aVar.z = true;
                            } else if (i15 != 10) {
                                throw new d("Audio format not supported: " + aVar.A);
                            }
                            aVar.y = true;
                        }
                        h0 h0Var3 = (h0) aVar.e;
                        if (aVar.A == 2) {
                            int iA = vVarF3.a();
                            h0Var3.f(iA, vVarF3);
                            ((h0) aVar.e).g(j2, 1, iA, 0, null);
                        } else {
                            int iZ5 = vVarF3.z();
                            z3 = false;
                            if (iZ5 == 0 && !aVar.z) {
                                int iA2 = vVarF3.a();
                                byte[] bArr4 = new byte[iA2];
                                vVarF3.k(bArr4, 0, iA2);
                                androidx.media3.extractor.a aVarN = androidx.media3.extractor.b.n(new u(bArr4, iA2), false);
                                q qVar4 = new q();
                                qVar4.m = i0.p("video/x-flv");
                                qVar4.n = i0.p("audio/mp4a-latm");
                                qVar4.j = aVarN.a;
                                qVar4.F = aVarN.c;
                                qVar4.G = aVarN.b;
                                qVar4.q = Collections.singletonList(bArr4);
                                h0Var3.e(new androidx.media3.common.r(qVar4));
                                aVar.z = true;
                            } else if (aVar.A != 10 || iZ5 == 1) {
                                int iA3 = vVarF3.a();
                                h0Var3.f(iA3, vVarF3);
                                ((h0) aVar.e).g(j2, 1, iA3, 0, null);
                            }
                            z2 = true;
                            j3 = -9223372036854775807L;
                            z = z3;
                        }
                        z3 = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                        z = z3;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (cVar.y == j3) {
                            j4 = -this.m;
                        } else {
                            j4 = 0;
                        }
                        this.i = j4;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z2) {
                        return i2;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    i2 = 0;
                    if (i == 9) {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                        }
                        oVar.o(this.l);
                        z = false;
                        z2 = false;
                    } else {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                        }
                        oVar.o(this.l);
                        z = false;
                        z2 = false;
                    }
                } else {
                    i2 = 0;
                    if (i == 9) {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                        }
                        oVar.o(this.l);
                        z = false;
                        z2 = false;
                    } else {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                        }
                        oVar.o(this.l);
                        z = false;
                        z2 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (cVar.y == j3) {
                        j4 = -this.m;
                    } else {
                        j4 = 0;
                    }
                    this.i = j4;
                }
                this.j = 4;
                this.g = 2;
                if (z2) {
                    return i2;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.f = pVar;
    }

    public final v f(o oVar) {
        int i = this.l;
        v vVar = this.d;
        byte[] bArr = vVar.a;
        if (i > bArr.length) {
            vVar.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            vVar.M(0);
        }
        vVar.L(this.l);
        oVar.readFully(vVar.a, 0, this.l);
        return vVar;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
