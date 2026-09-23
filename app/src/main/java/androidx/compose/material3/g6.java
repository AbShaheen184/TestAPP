package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g6 {
    public static final float a;
    public static final float b = 24;
    public static final float c = 40;
    public static final androidx.compose.foundation.layout.z0 d;

    static {
        float f = 4;
        a = f;
        float f2 = 8;
        d = new androidx.compose.foundation.layout.z0(f2, f, f2, f);
    }

    public static final void a(final i6 i6Var, androidx.compose.ui.r rVar, float f, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f2, float f3, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        androidx.compose.ui.r rVar2;
        final float f4;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        float f7;
        long jD;
        int i3;
        long j5;
        float f8;
        androidx.compose.ui.graphics.n0 n0Var3;
        float f9;
        sVar.c0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(i6Var) : sVar.h(i6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= sVar.h(fVar) ? 536870912 : 268435456;
        }
        if (sVar.T(i5 & 1, (306783379 & i5) != 306783378)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                f7 = d6.a;
                androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.t.I, sVar);
                jD = u0.d(androidx.compose.material3.tokens.t.J, sVar);
                long jD2 = u0.d(androidx.compose.material3.tokens.t.H, sVar);
                i3 = i5 & (-4186113);
                rVar2 = androidx.compose.ui.o.b;
                j5 = jD2;
                f8 = 0;
                n0Var3 = n0VarA;
                f9 = 0;
            } else {
                sVar.W();
                i3 = i5 & (-4186113);
                rVar2 = rVar;
                f7 = f;
                n0Var3 = n0Var;
                jD = j;
                j5 = j2;
                f8 = f2;
                f9 = f3;
            }
            sVar.q();
            sVar.b0(-1719831991);
            sVar.p(false);
            int i6 = i3 >> 9;
            p5.a(rVar2, n0Var3, j5, 0L, f8, f9, androidx.compose.runtime.internal.k.c(-1573998995, new f6(f7, jD, fVar), sVar), sVar, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f4 = f7;
            j3 = jD;
            n0Var2 = n0Var3;
            j4 = j5;
            f5 = f8;
            f6 = f9;
        } else {
            sVar.W();
            rVar2 = rVar;
            f4 = f;
            n0Var2 = n0Var;
            j3 = j;
            j4 = j2;
            f5 = f2;
            f6 = f3;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            final androidx.compose.ui.r rVar3 = rVar2;
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.e6
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g6.a(i6Var, rVar3, f4, n0Var2, j3, j4, f5, f6, fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.window.c0 c0Var, androidx.compose.runtime.internal.f fVar, j6 j6Var, androidx.compose.ui.r rVar, boolean z, androidx.compose.runtime.internal.f fVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.ui.r rVar2;
        boolean z2;
        sVar.c0(-293753984);
        if ((i & 6) == 0) {
            i2 = (sVar.f(c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? sVar.f(j6Var) : sVar.h(j6Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= sVar.h(fVar2) ? 67108864 : 33554432;
        }
        if (sVar.T(i3 & 1, (38347923 & i3) != 38347922)) {
            androidx.compose.animation.core.e2 e2VarD = androidx.compose.animation.core.i2.d(((l6) j6Var).b, "tooltip transition", sVar, 48);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            if (objQ == fVar3) {
                objQ = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ);
            }
            androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar3) {
                new androidx.compose.foundation.lazy.m(a1Var, 7);
                objQ2 = new i6();
                sVar.l0(objQ2);
            }
            androidx.compose.material3.internal.i.a(c0Var, androidx.compose.runtime.internal.k.c(-527401546, new l2(e2VarD, fVar, (i6) objQ2), sVar), j6Var, androidx.compose.runtime.internal.k.c(-23901870, new e0(4, a1Var, fVar2), sVar), sVar, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            rVar2 = androidx.compose.ui.o.b;
            z2 = true;
        } else {
            sVar.W();
            rVar2 = rVar;
            z2 = z;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.l(c0Var, fVar, j6Var, rVar2, z2, fVar2, i);
        }
    }
}
