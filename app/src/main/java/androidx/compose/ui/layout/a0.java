package androidx.compose.ui.layout;

import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final h a = new h(4);
    public static final Object b = new Object();

    public static final void a(m1 m1Var, androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-511989831);
        int i2 = (sVar.h(m1Var) ? 4 : 2) | i | (sVar.f(rVar) ? 32 : 16) | (sVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.q qVarU = androidx.compose.runtime.t.u(sVar);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.f.A;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, m1Var, m1Var.c);
            androidx.compose.runtime.t.x(sVar, qVarU, m1Var.d);
            androidx.compose.runtime.t.x(sVar, pVar, m1Var.e);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            sVar.p(true);
            if (sVar.F()) {
                sVar.b0(-1266202711);
            } else {
                sVar.b0(-1259244916);
                boolean zH = sVar.h(m1Var);
                Object objQ = sVar.Q();
                if (zH || objQ == androidx.compose.runtime.n.a) {
                    objQ = new androidx.compose.animation.z(m1Var, 6);
                    sVar.l0(objQ);
                }
                androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ, sVar);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new i1(m1Var, rVar, pVar, i, 0);
        }
    }

    public static final float b(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float c(c1 c1Var, boolean z, p[] pVarArr, float f) {
        float f2 = Float.NaN;
        for (p pVar : pVarArr) {
            float fC = c1Var.c(pVar);
            if (Float.isNaN(f2)) {
                f2 = fC;
            } else if (z == (fC > f2)) {
                f2 = fC;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final androidx.compose.ui.geometry.c d(x xVar) {
        x xVarN = xVar.N();
        return xVarN != null ? xVarN.s(xVar, true) : new androidx.compose.ui.geometry.c(0.0f, 0.0f, (int) (xVar.u() >> 32), (int) (xVar.u() & 4294967295L));
    }

    public static final androidx.compose.ui.geometry.c e(x xVar, boolean z) {
        x xVarG = g(xVar);
        float fU = (int) (xVarG.u() >> 32);
        float fU2 = (int) (xVarG.u() & 4294967295L);
        androidx.compose.ui.geometry.c cVarS = xVarG.s(xVar, z);
        float f = cVarS.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fU) {
                f = fU;
            }
        }
        float f2 = cVarS.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fU2) {
                f2 = fU2;
            }
        }
        float f3 = cVarS.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fU) {
                fU = f3;
            }
            f3 = fU;
        }
        float f4 = cVarS.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fU2) {
                fU2 = f5;
            }
            f4 = fU2;
        }
        if (f == f3 || f2 == f4) {
            return androidx.compose.ui.geometry.c.e;
        }
        long jF = xVarG.f((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jF2 = xVarG.f((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jF3 = xVarG.f((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jF4 = xVarG.f((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jF & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jF2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jF4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jF3 & 4294967295L));
        return new androidx.compose.ui.geometry.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final x g(x xVar) {
        x xVar2;
        x xVarN = xVar.N();
        while (true) {
            x xVar3 = xVarN;
            xVar2 = xVar;
            xVar = xVar3;
            if (xVar == null) {
                break;
            }
            xVarN = xVar.N();
        }
        androidx.compose.ui.node.d1 d1Var = xVar2 instanceof androidx.compose.ui.node.d1 ? (androidx.compose.ui.node.d1) xVar2 : null;
        if (d1Var == null) {
            return xVar2;
        }
        androidx.compose.ui.node.d1 d1Var2 = d1Var.N;
        while (true) {
            androidx.compose.ui.node.d1 d1Var3 = d1Var2;
            androidx.compose.ui.node.d1 d1Var4 = d1Var;
            d1Var = d1Var3;
            if (d1Var == null) {
                return d1Var4;
            }
            d1Var2 = d1Var.N;
        }
    }

    public static final Object h(p0 p0Var) {
        Object objL = p0Var.L();
        b0 b0Var = objL instanceof b0 ? (b0) objL : null;
        if (b0Var != null) {
            return b0Var.L;
        }
        return null;
    }

    public static final androidx.compose.ui.node.o0 i(androidx.compose.ui.node.o0 o0Var) {
        androidx.compose.ui.node.f0 f0Var = o0Var.L.L;
        while (true) {
            androidx.compose.ui.node.f0 f0VarV = f0Var.v();
            androidx.compose.ui.node.f0 f0Var2 = null;
            if ((f0VarV != null ? f0VarV.F : null) == null) {
                androidx.compose.ui.node.o0 o0VarS0 = ((androidx.compose.ui.node.d1) f0Var.d0.e).S0();
                o0VarS0.getClass();
                return o0VarS0;
            }
            androidx.compose.ui.node.f0 f0VarV2 = f0Var.v();
            if (f0VarV2 != null) {
                f0Var2 = f0VarV2.F;
            }
            f0Var2.getClass();
            androidx.compose.ui.node.f0 f0VarV3 = f0Var.v();
            f0VarV3.getClass();
            f0Var = f0VarV3.F;
            f0Var.getClass();
        }
    }

    public static final androidx.compose.ui.r j(androidx.compose.ui.r rVar, kotlin.jvm.functions.q qVar) {
        return rVar.d(new y(qVar));
    }

    public static final androidx.compose.ui.r k(androidx.compose.ui.r rVar, String str) {
        return rVar.d(new z(str));
    }

    public static final androidx.compose.ui.r l(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new w0(lVar));
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new y0(lVar));
    }

    public static final long n(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
