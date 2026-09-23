package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final float a = 280;
    public static final float b = 560;
    public static final float c = 8;
    public static final float d = 12;
    public static final androidx.compose.foundation.layout.z0 e;
    public static final androidx.compose.foundation.layout.z0 f;
    public static final androidx.compose.foundation.layout.z0 g;
    public static final androidx.compose.runtime.d0 h;

    static {
        float f2 = 24;
        e = new androidx.compose.foundation.layout.z0(f2, f2, f2, f2);
        float f3 = 16;
        androidx.compose.foundation.layout.b.d(f3);
        f = androidx.compose.foundation.layout.b.d(f3);
        g = androidx.compose.foundation.layout.b.d(f2);
        h = new androidx.compose.runtime.d0(new androidx.activity.compose.b(16));
    }

    public static final void a(final androidx.compose.runtime.internal.f fVar, androidx.compose.ui.r rVar, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final androidx.compose.ui.graphics.n0 n0Var, final long j, final float f2, final long j2, final long j3, final long j4, final long j5, androidx.compose.runtime.s sVar, final int i) {
        final androidx.compose.ui.r rVar2;
        sVar.c0(1378716401);
        int i2 = i | 48 | (sVar.h(null) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(pVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(pVar2) ? 16384 : 8192) | (sVar.f(n0Var) ? 131072 : Parser.ARGC_LIMIT) | (sVar.e(j) ? 1048576 : 524288) | (sVar.c(f2) ? 8388608 : 4194304) | (sVar.e(j2) ? 67108864 : 33554432) | (sVar.e(j3) ? 536870912 : 268435456);
        if (sVar.T(i2 & 1, ((i2 & 306783379) == 306783378 && (((sVar.e(j4) ? (char) 4 : (char) 2) | (sVar.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-652798794, new f(pVar, pVar2, j3, j4, j5, j2, fVar), sVar);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & Token.ASSIGN_MOD) | 12582918 | ((i2 >> 9) & 57344);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            p5.a(oVar, n0Var, j, 0L, f2, 0.0f, fVarC, sVar, i4, Token.ASSIGN_LOGICAL_AND);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(rVar2, pVar, pVar2, n0Var, j, f2, j2, j3, j4, j5, i) { // from class: androidx.compose.material3.c
                public final /* synthetic */ kotlin.jvm.functions.p A;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ long E;
                public final /* synthetic */ long F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ kotlin.jvm.functions.p z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(7);
                    j.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-917637668);
        if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new g();
                sVar.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, androidx.compose.ui.o.b);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0Var, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
            }
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            fVar.invoke(sVar, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.layout.x0(fVar, i);
        }
    }

    public static final void c(final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final androidx.compose.ui.graphics.n0 n0Var, final long j, final long j2, final long j3, final long j4, final float f2, final androidx.compose.ui.window.w wVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.internal.f fVar2;
        kotlin.jvm.functions.p pVar4;
        int i4;
        sVar.c0(-867616355);
        if ((i & 6) == 0) {
            i3 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fVar2 = fVar;
            i3 |= sVar.h(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            pVar4 = pVar;
            i3 |= sVar.h(pVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            pVar4 = pVar;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.h(pVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar.h(pVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sVar.f(n0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.c(f2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(wVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i5 = i4;
        if (sVar.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(aVar, rVar, wVar, androidx.compose.runtime.internal.k.c(527420759, new i(pVar2, pVar3, n0Var, j, f2, j2, j3, j4, pVar4, fVar2), sVar), sVar, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD) | ((i5 >> 3) & 896));
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(i | 1);
                    int iA2 = androidx.compose.runtime.t.A(i2);
                    j.c(aVar, fVar, rVar, pVar, pVar2, pVar3, n0Var, j, j2, j3, j4, f2, wVar, (androidx.compose.runtime.s) obj, iA, iA2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, androidx.compose.ui.window.w wVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(24925658);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(wVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            ((c1) sVar.j(h)).a(new com.google.firebase.messaging.n(aVar, rVar, wVar, fVar, 3), sVar, 0);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new d(aVar, rVar, wVar, fVar, i, 0);
        }
    }
}
