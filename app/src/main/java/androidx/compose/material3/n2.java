package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {
    public static final float a;
    public static final float b;
    public static final float c = 12;
    public static final float d = 8;
    public static final float e = Token.ASSIGN_MOD;
    public static final float f = 280;

    static {
        float f2 = 48;
        a = f2;
        b = f2;
    }

    public static final void a(final androidx.compose.ui.r rVar, final androidx.compose.animation.core.p0 p0Var, final androidx.compose.runtime.a1 a1Var, final androidx.compose.foundation.c2 c2Var, final androidx.compose.ui.graphics.n0 n0Var, final long j, final float f2, final float f3, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        sVar.c0(848986741);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.f(p0Var) ? 32 : 16) | (sVar.f(c2Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.f(n0Var) ? 16384 : 8192) | (sVar.e(j) ? 131072 : Parser.ARGC_LIMIT) | (sVar.c(f2) ? 1048576 : 524288) | (sVar.c(f3) ? 8388608 : 4194304) | (sVar.f(null) ? 67108864 : 33554432) | (sVar.h(fVar) ? 536870912 : 268435456);
        if (sVar.T(i2 & 1, (i2 & 306783379) != 306783378)) {
            androidx.compose.animation.core.e2 e2VarD = androidx.compose.animation.core.i2.d(p0Var, "DropDownMenu", sVar, (((i2 >> 3) & 14) | 48) & Token.ELSE);
            androidx.compose.animation.core.k1 k1VarR = q.r(androidx.compose.material3.tokens.p.y, sVar);
            androidx.compose.animation.core.k1 k1VarR2 = q.r(androidx.compose.material3.tokens.p.A, sVar);
            androidx.compose.animation.core.l2 l2Var = androidx.compose.animation.core.e.j;
            androidx.compose.animation.core.j2 j2Var = e2VarD.a;
            androidx.compose.runtime.j1 j1Var = e2VarD.d;
            boolean zBooleanValue = ((Boolean) j2Var.n()).booleanValue();
            sVar.b0(143964305);
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            sVar.p(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) j1Var.getValue()).booleanValue();
            sVar.b0(143964305);
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            sVar.p(false);
            Float fValueOf2 = Float.valueOf(f5);
            e2VarD.f();
            sVar.b0(-745957716);
            sVar.p(false);
            androidx.compose.animation.core.a2 a2VarC = androidx.compose.animation.core.i2.c(e2VarD, fValueOf, fValueOf2, k1VarR, l2Var, sVar, 0);
            boolean zBooleanValue3 = ((Boolean) e2VarD.a.n()).booleanValue();
            sVar.b0(892761509);
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            sVar.p(false);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) j1Var.getValue()).booleanValue();
            sVar.b0(892761509);
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            sVar.p(false);
            Float fValueOf4 = Float.valueOf(f7);
            e2VarD.f();
            sVar.b0(2839488);
            sVar.p(false);
            androidx.compose.animation.core.a2 a2VarC2 = androidx.compose.animation.core.i2.c(e2VarD, fValueOf3, fValueOf4, k1VarR2, l2Var, sVar, 0);
            boolean zBooleanValue5 = ((Boolean) sVar.j(androidx.compose.ui.platform.x1.a)).booleanValue();
            boolean zG = sVar.g(zBooleanValue5) | sVar.f(a2VarC) | ((i2 & Token.ASSIGN_MOD) == 32) | sVar.f(a2VarC2);
            Object objQ = sVar.Q();
            if (zG || objQ == androidx.compose.runtime.n.a) {
                Object j2Var2 = new j2(zBooleanValue5, p0Var, a1Var, a2VarC, a2VarC2);
                sVar.l0(j2Var2);
                objQ = j2Var2;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            p5.a(androidx.compose.ui.graphics.a0.o(androidx.compose.ui.o.b, (kotlin.jvm.functions.l) objQ), n0Var, j, 0L, f2, f3, androidx.compose.runtime.internal.k.c(-1463404422, new l2(rVar, c2Var, fVar), sVar), sVar, (i3 & 896) | (i3 & Token.ASSIGN_MOD) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(p0Var, a1Var, c2Var, n0Var, j, f2, f3, fVar, i) { // from class: androidx.compose.material3.k2
                public final /* synthetic */ androidx.compose.foundation.c2 A;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ float E;
                public final /* synthetic */ androidx.compose.runtime.internal.f F;
                public final /* synthetic */ androidx.compose.animation.core.p0 y;
                public final /* synthetic */ androidx.compose.runtime.a1 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(385);
                    n2.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, i2 i2Var, androidx.compose.foundation.layout.z0 z0Var, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (sVar.h(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.g(z) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.f(i2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= sVar.f(z0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= sVar.f(null) ? 67108864 : 33554432;
        }
        if (sVar.T(i2 & 1, (38347923 & i2) != 38347922)) {
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.i1.p(androidx.compose.foundation.layout.i1.e(androidx.compose.foundation.s.j(rVar, null, x4.a(true, 0.0f, 6), z, null, aVar, 24), 1.0f), e, b, f, 8), z0Var);
            androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarP);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
            }
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            z5.a(((m6) sVar.j(n6.a)).m, androidx.compose.runtime.internal.k.c(865999929, new m2(i2Var, z, fVar), sVar), sVar, 48);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new l(fVar, aVar, rVar, z, i2Var, z0Var, i, 1);
        }
    }
}
