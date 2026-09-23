package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {
    public static final float a = 8;
    public static final float b = 12;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        float f2 = 16;
        c = f2;
        d = f2;
        e = f2;
        f = f2;
    }

    public static final void a(androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final u1 u1Var, float f2, float f3, androidx.compose.runtime.s sVar, final int i) {
        final androidx.compose.runtime.internal.f fVar2;
        final float f4;
        final float f5;
        float f6;
        float f7;
        androidx.compose.runtime.internal.f fVar3;
        androidx.compose.runtime.internal.f fVar4;
        sVar.c0(487133126);
        int i2 = i | (sVar.f(rVar) ? 32 : 16) | 3456 | (sVar.f(u1Var) ? 1048576 : 524288) | 113246208;
        int i3 = 0;
        int i4 = 1;
        if (sVar.T(i2 & 1, (38347923 & i2) != 38347922)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                f6 = v1.a;
                f7 = f6;
            } else {
                sVar.W();
                f6 = f2;
                f7 = f3;
            }
            sVar.q();
            fVar2 = fVar;
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(629852750, new e0(i4, u1Var, fVar2), sVar);
            sVar.b0(-510713870);
            sVar.p(false);
            sVar.b0(-510395686);
            sVar.p(false);
            if (pVar == null) {
                sVar.b0(-510083888);
                sVar.p(false);
                fVar3 = null;
            } else {
                sVar.b0(-510083887);
                androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(449548451, new z1(u1Var, pVar, i3), sVar);
                sVar.p(false);
                fVar3 = fVarC2;
            }
            if (pVar2 == null) {
                sVar.b0(-509666659);
                sVar.p(false);
                fVar4 = null;
            } else {
                sVar.b0(-509666658);
                androidx.compose.runtime.internal.f fVarC3 = androidx.compose.runtime.internal.k.c(1946411067, new z1(u1Var, pVar2, i4), sVar);
                sVar.p(false);
                fVar4 = fVarC3;
            }
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.foundation.gestures.w1(26);
                sVar.l0(objQ);
            }
            androidx.compose.ui.r rVarD = androidx.compose.ui.semantics.q.a(androidx.compose.ui.o.b, true, (kotlin.jvm.functions.l) objQ).d(rVar);
            float f8 = v1.a;
            p5.a(rVarD, d5.a(androidx.compose.material3.tokens.n.c, sVar), u1Var.a, u1Var.b, f6, f7, androidx.compose.runtime.internal.k.c(1192488737, new y1(fVar3, fVar4, fVarC, (androidx.compose.runtime.internal.f) null, (androidx.compose.runtime.internal.f) null), sVar), sVar, 12804096, 64);
            f4 = f6;
            f5 = f7;
        } else {
            fVar2 = fVar;
            sVar.W();
            f4 = f2;
            f5 = f3;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(rVar, pVar, pVar2, u1Var, f4, f5, i) { // from class: androidx.compose.material3.x1
                public final /* synthetic */ kotlin.jvm.functions.p A;
                public final /* synthetic */ u1 B;
                public final /* synthetic */ float C;
                public final /* synthetic */ float D;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ kotlin.jvm.functions.p z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(221191);
                    a2.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-61277522);
        int i2 = 2;
        int i3 = i | (sVar.h(pVar) ? 4 : 2) | (sVar.h(pVar2) ? 32 : 16) | (sVar.h(pVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(pVar4) ? 16384 : 8192);
        if (sVar.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (objQ == fVar2) {
                objQ = new f2();
                sVar.l0(objQ);
            }
            f2 f2Var = (f2) objQ;
            androidx.compose.runtime.internal.f fVar3 = new androidx.compose.runtime.internal.f(true, 1271844412, new androidx.compose.animation.f(kotlin.collections.q.k(fVar, pVar3 == null ? w0.a : pVar3, pVar4 == null ? w0.b : pVar4, pVar == null ? w0.c : pVar, pVar2 == null ? w0.d : pVar2), i2));
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar2) {
                objQ2 = new androidx.compose.ui.layout.v0(f2Var);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ2;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, androidx.compose.ui.o.b);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar4);
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
            fVar3.invoke(sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.internal.q(pVar, pVar2, fVar, pVar3, pVar4, i);
        }
    }

    public static final void c(long j, androidx.compose.material3.tokens.d0 d0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i) {
        long j2;
        androidx.compose.runtime.s sVar2;
        kotlin.jvm.functions.p pVar2;
        sVar.c0(-285397024);
        int i2 = (sVar.e(j) ? 4 : 2) | i | (sVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            j2 = j;
            sVar2 = sVar;
            androidx.compose.material3.internal.i.b(j2, n6.a(d0Var, sVar), pVar, sVar2, i2 & 910);
            pVar2 = pVar;
        } else {
            j2 = j;
            sVar2 = sVar;
            pVar2 = pVar;
            sVar2.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.b(j2, d0Var, pVar2, i);
        }
    }

    public static final int d(androidx.compose.ui.layout.s sVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f2;
        if (i6 == 1) {
            f2 = androidx.compose.material3.tokens.n.m;
        } else {
            f2 = i6 == 2 ? androidx.compose.material3.tokens.n.s : androidx.compose.material3.tokens.n.p;
        }
        int iMax = Math.max(Math.max(androidx.compose.ui.unit.a.i(j), sVar.i0(f2)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iG = androidx.compose.ui.unit.a.g(j);
        return iMax > iG ? iG : iMax;
    }
}
