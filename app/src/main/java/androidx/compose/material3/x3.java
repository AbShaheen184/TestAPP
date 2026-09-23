package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x3 {
    public static final float a = androidx.compose.material3.tokens.r.g;
    public static final float b = 8;
    public static final float c = 4;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final androidx.compose.runtime.d0 h;

    static {
        float f2 = androidx.compose.material3.tokens.s.b;
        float f3 = androidx.compose.material3.tokens.s.c;
        float f4 = 2;
        d = (f2 - f3) / f4;
        e = (androidx.compose.material3.tokens.s.a - f3) / f4;
        f = 12;
        g = 44;
        h = new androidx.compose.runtime.d0(new androidx.activity.compose.b(24));
    }

    public static final void a(final long j, final long j2, float f2, androidx.compose.foundation.layout.u1 u1Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        final float f3;
        final androidx.compose.foundation.layout.u1 u1Var2;
        float f4;
        androidx.compose.foundation.layout.u1 v0Var;
        sVar.c0(1054099326);
        if ((i & 6) == 0) {
            i2 = (sVar.f(androidx.compose.ui.o.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.e(j2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.h(fVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (sVar.T(i3 & 1, (74899 & i3) != 74898)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                float f5 = m3.a;
                WeakHashMap weakHashMap = androidx.compose.foundation.layout.v1.w;
                f4 = f5;
                v0Var = new androidx.compose.foundation.layout.v0(new androidx.compose.foundation.layout.m1(androidx.compose.foundation.layout.t.f(sVar).g, androidx.compose.foundation.layout.t.f(sVar).b), androidx.compose.foundation.layout.b.i | 32);
            } else {
                sVar.W();
                f4 = f2;
                v0Var = u1Var;
            }
            sVar.q();
            ((d1) sVar.j(h)).a(new y3(j, j2, f4, v0Var, fVar), sVar, 0);
            f3 = f4;
            u1Var2 = v0Var;
        } else {
            sVar.W();
            f3 = f2;
            u1Var2 = u1Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x3.a(j, j2, f3, u1Var2, fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.foundation.layout.g1 g1Var, final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.ui.r rVar, boolean z2, final kotlin.jvm.functions.p pVar, boolean z3, n3 n3Var, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        androidx.compose.runtime.s sVar2;
        n3 n3Var2;
        final androidx.compose.ui.r rVar2;
        final boolean z4;
        final boolean z5;
        androidx.compose.ui.r rVar3;
        boolean z6;
        androidx.compose.runtime.internal.f fVarC;
        sVar.c0(974293026);
        if ((i & 6) == 0) {
            i2 = (sVar.f(g1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= sVar.h(pVar) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i) == 0) {
            i4 |= sVar.f(n3Var) ? 67108864 : 33554432;
        }
        int i5 = i4 | 805306368;
        boolean z7 = true;
        if (sVar.T(i5 & 1, (306783379 & i5) != 306783378)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                rVar3 = androidx.compose.ui.o.b;
                z6 = true;
            } else {
                sVar.W();
                rVar3 = rVar;
                z6 = z2;
                z7 = z3;
            }
            sVar.q();
            sVar.b0(-224963495);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (objQ == fVar2) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            sVar.p(false);
            androidx.compose.material3.tokens.p pVar2 = androidx.compose.material3.tokens.p.z;
            androidx.compose.animation.core.k1 k1VarR = q.r(pVar2, sVar);
            boolean z8 = z7;
            androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(-876637252, new u3(n3Var, z, z6, k1VarR, pVar, z7, fVar), sVar);
            if (pVar == null) {
                sVar.b0(-224036658);
                sVar.p(false);
                fVarC = null;
            } else {
                sVar.b0(-224036657);
                fVarC = androidx.compose.runtime.internal.k.c(802208206, new v3(n3Var, z, z6, k1VarR, pVar), sVar);
                sVar.p(false);
            }
            androidx.compose.runtime.internal.f fVar3 = fVarC;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar2) {
                objQ2 = new androidx.compose.runtime.g1(0);
                sVar.l0(objQ2);
            }
            androidx.compose.runtime.g1 g1Var2 = (androidx.compose.runtime.g1) objQ2;
            boolean z9 = z6;
            n3Var2 = n3Var;
            androidx.compose.ui.r rVar4 = rVar3;
            androidx.compose.ui.r rVarA = androidx.compose.foundation.layout.g1.a(g1Var, androidx.compose.foundation.layout.i1.b(androidx.compose.foundation.selection.c.a(rVar4, z, kVar, null, z9, new androidx.compose.ui.semantics.j(4), aVar), 0.0f, a, 1), 1.0f);
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar2) {
                objQ3 = new androidx.activity.compose.g(g1Var2, 26);
                sVar.l0(objQ3);
            }
            androidx.compose.ui.r rVarM = androidx.compose.ui.layout.a0.m(rVarA, (kotlin.jvm.functions.l) objQ3);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, true);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarM);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar4);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
            }
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.runtime.w2 w2VarB = androidx.compose.animation.core.h.b(z ? 1.0f : 0.0f, q.r(pVar2, sVar), sVar, 0, 28);
            androidx.compose.runtime.w2 w2VarB2 = androidx.compose.animation.core.h.b(z ? 1.0f : 0.0f, q.r(androidx.compose.material3.tokens.p.y, sVar), sVar, 0, 28);
            androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.W(f))) & 4294967295L) | (((long) Float.floatToRawIntBits((g1Var2.g() - cVar.i0(androidx.compose.material3.tokens.s.b)) / 2)) << 32);
            boolean zF = sVar.f(kVar) | sVar.e(jFloatToRawIntBits);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == fVar2) {
                objQ4 = new androidx.compose.material3.internal.k0(kVar, jFloatToRawIntBits);
                sVar.l0(objQ4);
            }
            androidx.compose.runtime.internal.f fVarC3 = androidx.compose.runtime.internal.k.c(-2082182507, new b1((androidx.compose.material3.internal.k0) objQ4, 3), sVar);
            androidx.compose.runtime.internal.f fVarC4 = androidx.compose.runtime.internal.k.c(-799524251, new e0(3, w2VarB, n3Var2), sVar);
            boolean zF2 = sVar.f(w2VarB);
            Object objQ5 = sVar.Q();
            if (zF2 || objQ5 == fVar2) {
                objQ5 = new androidx.compose.foundation.text.selection.k0(w2VarB, 2);
                sVar.l0(objQ5);
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ5;
            boolean zF3 = sVar.f(w2VarB2);
            Object objQ6 = sVar.Q();
            if (zF3 || objQ6 == fVar2) {
                objQ6 = new androidx.compose.foundation.text.selection.k0(w2VarB2, 3);
                sVar.l0(objQ6);
            }
            sVar2 = sVar;
            c(fVarC3, fVarC4, fVarC2, fVar3, z8, aVar2, (kotlin.jvm.functions.a) objQ6, sVar2, ((i5 >> 9) & 57344) | 438);
            sVar2.p(true);
            z5 = z8;
            z4 = z9;
            rVar2 = rVar4;
        } else {
            sVar2 = sVar;
            n3Var2 = n3Var;
            sVar2.W();
            rVar2 = rVar;
            z4 = z2;
            z5 = z3;
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            final n3 n3Var3 = n3Var2;
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.p3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x3.b(g1Var, z, aVar, fVar, rVar2, z4, pVar, z5, n3Var3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.internal.f fVar2, androidx.compose.runtime.internal.f fVar3, kotlin.jvm.functions.p pVar, boolean z, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        kotlin.jvm.functions.p pVar2 = pVar;
        kotlin.jvm.functions.a aVar3 = aVar;
        sVar.c0(-1019541078);
        if ((i & 6) == 0) {
            i2 = (sVar.h(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(fVar3) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(pVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.h(aVar3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if (sVar.T(i2 & 1, (599187 & i2) != 599186)) {
            androidx.compose.foundation.contextmenu.b bVar = new androidx.compose.foundation.contextmenu.b(2);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarJ = androidx.compose.ui.layout.a0.j(oVar, bVar);
            int i3 = 57344 & i2;
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 3670016) == 1048576) | (i3 == 16384);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar4 = androidx.compose.runtime.n.a;
            if (z4 || objQ == fVar4) {
                objQ = new w3(aVar2, pVar2, z);
                sVar.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarJ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
            sVar.e0();
            int i4 = i2;
            if (sVar.S) {
                sVar.k(fVar5);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, q0Var, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            fVar.invoke(sVar, Integer.valueOf(i4 & 14));
            fVar2.invoke(sVar, Integer.valueOf((i4 >> 3) & 14));
            androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(oVar, "icon");
            androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarK);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar5);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            fVar3.invoke(sVar, Integer.valueOf((i4 >> 6) & 14));
            sVar.p(true);
            if (pVar != null) {
                sVar.b0(-660471321);
                androidx.compose.ui.r rVarK2 = androidx.compose.ui.layout.a0.k(oVar, "label");
                boolean z5 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objQ2 = sVar.Q();
                if (z5 || objQ2 == fVar4) {
                    z2 = z;
                    aVar3 = aVar;
                    objQ2 = new androidx.activity.compose.v(aVar3, z2);
                    sVar.l0(objQ2);
                } else {
                    z2 = z;
                    aVar3 = aVar;
                }
                androidx.compose.ui.r rVarO = androidx.compose.ui.graphics.a0.o(rVarK2, (kotlin.jvm.functions.l) objQ2);
                androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, rVarO);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar5);
                } else {
                    sVar.o0();
                }
                androidx.compose.runtime.t.x(sVar, q0VarD2, eVar);
                androidx.compose.runtime.t.x(sVar, jVarL3, eVar2);
                if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode3, sVar, iHashCode3, eVar3);
                }
                androidx.compose.runtime.t.x(sVar, rVarC3, eVar4);
                pVar2 = pVar;
                pVar2.invoke(sVar, Integer.valueOf((i4 >> 9) & 14));
                z3 = true;
                sVar.p(true);
                sVar.p(false);
            } else {
                pVar2 = pVar;
                z2 = z;
                aVar3 = aVar;
                z3 = true;
                sVar.b0(-660200319);
                sVar.p(false);
            }
            sVar.p(z3);
        } else {
            z2 = z;
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new n1(fVar, fVar2, fVar3, pVar2, z2, aVar3, aVar2, i);
        }
    }
}
