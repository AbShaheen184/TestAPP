package androidx.compose.foundation.layout;

import androidx.compose.foundation.b2;
import androidx.compose.ui.node.a2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final t a = new t(1);
    public static final t b = new t(2);
    public static final g0 c = new g0(0);
    public static final b2 d = new b2(2);
    public static final int e = 9;
    public static final int f = 6;
    public static final int g = 10;
    public static final int h = 5;
    public static final int i = 15;

    public static final z0 a(float f2) {
        return new z0(f2, f2, f2, f2);
    }

    public static z0 b(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        float f3 = 0;
        return new z0(f2, f3, f2, f3);
    }

    public static final z0 c(float f2, float f3, float f4, float f5) {
        return new z0(f2, f3, f4, f5);
    }

    public static z0 d(float f2) {
        return new z0(0, 0, 0, f2);
    }

    public static final void e(androidx.compose.runtime.s sVar, androidx.compose.ui.r rVar) {
        o oVar = o.c;
        int iHashCode = Long.hashCode(sVar.T);
        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
        androidx.compose.runtime.internal.j jVarL = sVar.l();
        androidx.compose.ui.node.h.b.getClass();
        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
        a2 a2Var = sVar.a;
        sVar.e0();
        if (sVar.S) {
            sVar.k(fVar);
        } else {
            sVar.o0();
        }
        androidx.compose.runtime.t.x(sVar, oVar, androidx.compose.ui.node.g.f);
        androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
        androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
        androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
        androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
        sVar.p(true);
    }

    public static androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new i(f2));
    }

    public static final float h(z0 z0Var, androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? z0Var.b(mVar) : z0Var.a(mVar);
    }

    public static final float i(z0 z0Var, androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? z0Var.a(mVar) : z0Var.b(mVar);
    }

    public static final androidx.compose.ui.r j(androidx.compose.ui.r rVar, g0 g0Var) {
        return rVar.d(new n1(g0Var));
    }

    public static final c1 k(androidx.compose.ui.layout.p0 p0Var) {
        Object objL = p0Var.L();
        if (objL instanceof c1) {
            return (c1) objL;
        }
        return null;
    }

    public static final float l(c1 c1Var) {
        if (c1Var != null) {
            return c1Var.a;
        }
        return 0.0f;
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar) {
        return rVar.d(new k1(new androidx.compose.foundation.gestures.w1(1)));
    }

    public static final boolean n(int i2, int i3, long j) {
        int iJ = androidx.compose.ui.unit.a.j(j);
        if (i2 > androidx.compose.ui.unit.a.h(j) || iJ > i2) {
            return false;
        }
        return i3 <= androidx.compose.ui.unit.a.g(j) && androidx.compose.ui.unit.a.i(j) <= i3;
    }

    public static androidx.compose.ui.layout.r0 o(b1 b1Var, int i2, int i3, int i4, int i5, int i6, androidx.compose.ui.layout.s0 s0Var, List list, androidx.compose.ui.layout.d1[] d1VarArr, int i7) {
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        List list2 = list;
        long j = i6;
        int[] iArr = new int[i7];
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i12 < i7) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list2.get(i12);
            float fL = l(k(p0Var));
            if (fL > 0.0f) {
                f3 += fL;
                i13++;
                i9 = i12;
            } else {
                int i15 = i4 - i14;
                androidx.compose.ui.layout.d1 d1VarF = d1VarArr[i12];
                if (d1VarF == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        i9 = i12;
                        i10 = i13;
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i9 = i12;
                        i10 = i13;
                        i11 = i15 < 0 ? 0 : i15;
                    }
                    d1VarF = p0Var.F(b1Var.d(0, i11, i5, false));
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                androidx.compose.ui.layout.d1 d1Var = d1VarF;
                int iF = b1Var.f(d1Var);
                int i16 = b1Var.i(d1Var);
                iArr[i9] = iF;
                int i17 = i15 - iF;
                if (i17 < 0) {
                    i17 = 0;
                }
                iMin = Math.min(i6, i17);
                i14 += iF + iMin;
                iMax = Math.max(iMax, i16);
                d1VarArr[i9] = d1Var;
                i13 = i10;
            }
            i12 = i9 + 1;
            j = j;
        }
        long j2 = j;
        int i18 = i13;
        if (i18 == 0) {
            i14 -= iMin;
            i8 = 0;
        } else {
            long j3 = ((long) (i18 - 1)) * j2;
            long jRound = ((long) ((i4 != Integer.MAX_VALUE ? i4 : i2) - i14)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i19 = 0; i19 < i7; i19++) {
                jRound -= (long) Math.round(l(k((androidx.compose.ui.layout.p0) list2.get(i19))) * f4);
            }
            int i20 = iMax;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i7) {
                if (d1VarArr[i21] == null) {
                    androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list2.get(i21);
                    c1 c1VarK = k(p0Var2);
                    float fL2 = l(c1VarK);
                    if (fL2 <= 0.0f) {
                        androidx.compose.foundation.layout.internal.a.b("All weights <= 0 should have placeables");
                    }
                    f2 = f4;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fL2 * f2) + iSignum);
                    androidx.compose.ui.layout.d1 d1VarF2 = p0Var2.F(b1Var.d((!(c1VarK != null ? c1VarK.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i5, true));
                    int iF2 = b1Var.f(d1VarF2);
                    int i23 = b1Var.i(d1VarF2);
                    iArr[i21] = iF2;
                    i22 += iF2;
                    int iMax3 = Math.max(i20, i23);
                    d1VarArr[i21] = d1VarF2;
                    i20 = iMax3;
                } else {
                    f2 = f4;
                }
                i21++;
                list2 = list;
                f4 = f2;
            }
            i8 = (int) (((long) i22) + j3);
            int i24 = i4 - i14;
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 > i24) {
                i8 = i24;
            }
            iMax = i20;
        }
        int i25 = i8 + i14;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i2);
        int iMax5 = Math.max(iMax, Math.max(i3, 0));
        int[] iArr2 = new int[i7];
        b1Var.c(iMax4, s0Var, iArr, iArr2);
        return b1Var.j(d1VarArr, s0Var, iArr2, iMax4, iMax5);
    }

    public static final androidx.compose.ui.r p(androidx.compose.ui.r rVar, z0 z0Var) {
        return rVar.d(new y0(z0Var));
    }

    public static final androidx.compose.ui.r q(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new w0(f2, f2, f2, f2));
    }

    public static final androidx.compose.ui.r r(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new w0(f2, f3, f2, f3));
    }

    public static androidx.compose.ui.r s(androidx.compose.ui.r rVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return r(rVar, f2, f3);
    }

    public static final androidx.compose.ui.r t(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5) {
        return rVar.d(new w0(f2, f3, f4, f5));
    }

    public static androidx.compose.ui.r u(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return t(rVar, f2, f3, f4, f5);
    }

    public static final p0 v(androidx.core.graphics.c cVar) {
        return new p0(cVar.a, cVar.b, cVar.c, cVar.d);
    }

    public static final void w(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final androidx.compose.ui.r x(androidx.compose.ui.r rVar) {
        return rVar.d(new r0());
    }

    public static final androidx.compose.ui.r y(a aVar) {
        return new a0(aVar);
    }

    public static final androidx.compose.ui.r z(androidx.compose.ui.r rVar, u1 u1Var) {
        return rVar.d(new m0(u1Var));
    }

    public abstract int f(int i2, int i3, androidx.compose.ui.unit.m mVar);
}
