package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static final float a;
    public static final androidx.compose.foundation.layout.z0 b;

    static {
        float f = 8;
        a = f;
        androidx.compose.foundation.layout.b.b(2, f);
        b = androidx.compose.foundation.layout.b.b(2, f);
        androidx.compose.foundation.layout.b.b(2, f);
    }

    public static final void a(final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.text.m0 m0Var, final long j, final long j2, final long j3, final float f, final androidx.compose.foundation.layout.z0 z0Var, androidx.compose.runtime.s sVar, final int i) {
        sVar.c0(-2070754602);
        int i2 = i | (sVar.h(fVar) ? 4 : 2) | (sVar.f(m0Var) ? 32 : 16) | (sVar.e(j) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(null) ? 16384 : 8192) | (sVar.h(null) ? 131072 : Parser.ARGC_LIMIT) | (sVar.e(j2) ? 1048576 : 524288) | (sVar.e(j3) ? 8388608 : 4194304) | (sVar.c(f) ? 67108864 : 33554432) | (sVar.f(z0Var) ? 536870912 : 268435456);
        if (sVar.T(i2 & 1, (306783379 & i2) != 306783378)) {
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{a1.a.a(new androidx.compose.ui.graphics.t(j)), z5.a.a(m0Var)}, androidx.compose.runtime.internal.k.c(-668234218, new o0(f, z0Var, j2, fVar, j3), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(m0Var, j, j2, j3, f, z0Var, i) { // from class: androidx.compose.material3.m0
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ float C;
                public final /* synthetic */ androidx.compose.foundation.layout.z0 D;
                public final /* synthetic */ androidx.compose.ui.text.m0 y;
                public final /* synthetic */ long z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    q0.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.r rVar, boolean z2, androidx.compose.ui.graphics.n0 n0Var, final z4 z4Var, a5 a5Var, androidx.compose.foundation.a0 a0Var, final androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.s sVar, final int i) {
        final boolean z3;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final a5 a5Var2;
        final androidx.compose.foundation.a0 a0VarA;
        int i2;
        boolean z4;
        sVar.c0(-1385473344);
        int i3 = i | (sVar.g(z) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 5988352 | (sVar.f(z4Var) ? 67108864 : 33554432) | 268435456;
        if (sVar.T(i3 & 1, (306783379 & i3) != 306783378)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                float f = k1.a;
                androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.l.b, sVar);
                float f2 = androidx.compose.material3.tokens.l.f;
                a5 a5Var3 = new a5(f2, androidx.compose.material3.tokens.l.o, androidx.compose.material3.tokens.l.l, androidx.compose.material3.tokens.l.m, androidx.compose.material3.tokens.l.e, f2);
                i2 = i3 & (-1908408321);
                long jD = u0.d(androidx.compose.material3.tokens.l.p, sVar);
                long j = androidx.compose.ui.graphics.t.h;
                androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.j, u0.d(androidx.compose.material3.tokens.l.i, sVar));
                float f3 = androidx.compose.material3.tokens.l.q;
                float f4 = androidx.compose.material3.tokens.l.n;
                if (z) {
                    jD = j;
                }
                if (z) {
                    f3 = f4;
                }
                n0Var2 = n0VarA;
                a0VarA = androidx.compose.foundation.s.a(f3, jD);
                a5Var2 = a5Var3;
                z4 = true;
            } else {
                sVar.W();
                i2 = i3 & (-1908408321);
                z4 = z2;
                n0Var2 = n0Var;
                a5Var2 = a5Var;
                a0VarA = a0Var;
            }
            sVar.q();
            c(z, rVar, aVar, z4, fVar, n6.a(androidx.compose.material3.tokens.l.r, sVar), n0Var2, z4Var, a5Var2, a0VarA, k1.a, b, kVar, sVar, (i2 & 14) | 12582912 | ((i2 >> 6) & Token.ASSIGN_MOD) | ((i2 << 3) & 896) | 102263808, ((i2 >> 24) & 14) | 224256);
            z3 = z4;
        } else {
            sVar.W();
            z3 = z2;
            n0Var2 = n0Var;
            a5Var2 = a5Var;
            a0VarA = a0Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(z, aVar, fVar, rVar, z3, n0Var2, z4Var, a5Var2, a0VarA, kVar, i) { // from class: androidx.compose.material3.k0
                public final /* synthetic */ androidx.compose.ui.r A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 C;
                public final /* synthetic */ z4 D;
                public final /* synthetic */ a5 E;
                public final /* synthetic */ androidx.compose.foundation.a0 F;
                public final /* synthetic */ androidx.compose.foundation.interaction.k G;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ kotlin.jvm.functions.a y;
                public final /* synthetic */ androidx.compose.runtime.internal.f z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(385);
                    q0.b(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static final void c(final boolean z, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.a aVar, final boolean z2, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.text.m0 m0Var, final androidx.compose.ui.graphics.n0 n0Var, final z4 z4Var, final a5 a5Var, final androidx.compose.foundation.a0 a0Var, final float f, final androidx.compose.foundation.layout.z0 z0Var, final androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.s sVar2;
        androidx.compose.foundation.interaction.k kVar2;
        long j;
        float f2;
        boolean z3;
        androidx.compose.animation.core.n nVar;
        ?? r12;
        sVar.c0(1786844928);
        if ((i & 6) == 0) {
            i3 = (sVar.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(rVar) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = LibretroCore.SCREEN_WIDTH;
        if (i5 == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i7 == 0) {
            i3 |= sVar.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(fVar) ? 16384 : 8192;
        }
        int i9 = i & 196608;
        int i10 = Parser.ARGC_LIMIT;
        if (i9 == 0) {
            i3 |= sVar.f(m0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sVar.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar.f(n0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.f(z4Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(a5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!sVar.f(a0Var)) {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (sVar.c(f)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= sVar.f(z0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            if (sVar.f(kVar)) {
                i10 = 131072;
            }
            i4 |= i10;
        }
        int i11 = i3;
        if (sVar.T(i11 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            Object obj = androidx.compose.runtime.n.a;
            if (kVar == null) {
                sVar.b0(73215547);
                Object objQ = sVar.Q();
                if (objQ == obj) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                sVar.p(false);
            } else {
                sVar.b0(-828922852);
                sVar.p(false);
                kVar2 = kVar;
            }
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = new androidx.compose.foundation.gestures.w1(25);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(rVar, false, (kotlin.jvm.functions.l) objQ2);
            if (z2) {
                j = !z ? z4Var.a : z4Var.i;
            } else {
                j = z ? z4Var.j : z4Var.e;
            }
            if (a5Var == null) {
                sVar.b0(73531126);
                sVar.p(false);
                kVar2 = kVar2;
                j = j;
                r12 = 0;
                nVar = null;
            } else {
                sVar.b0(-828912021);
                int i12 = ((i4 << 3) & 896) | ((i11 >> 9) & 14);
                Object objQ3 = sVar.Q();
                if (objQ3 == obj) {
                    objQ3 = new androidx.compose.runtime.snapshots.q();
                    sVar.l0(objQ3);
                }
                androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) objQ3;
                Object objQ4 = sVar.Q();
                if (objQ4 == obj) {
                    objQ4 = androidx.compose.runtime.t.r(null);
                    sVar.l0(objQ4);
                }
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ4;
                boolean zF = sVar.f(kVar2);
                Object objQ5 = sVar.Q();
                if (zF || objQ5 == obj) {
                    objQ5 = new z(kVar2, qVar, null, 1);
                    sVar.l0(objQ5);
                }
                androidx.compose.runtime.l0.c(sVar, kVar2, (kotlin.jvm.functions.p) objQ5);
                androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar);
                if (!z2) {
                    f2 = a5Var.f;
                } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                    f2 = a5Var.b;
                } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                    f2 = a5Var.d;
                } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                    f2 = a5Var.c;
                } else {
                    f2 = iVar instanceof androidx.compose.foundation.interaction.b ? a5Var.e : a5Var.a;
                }
                Object objQ6 = sVar.Q();
                if (objQ6 == obj) {
                    objQ6 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f2), androidx.compose.animation.core.e.l, null, 12);
                    sVar.l0(objQ6);
                }
                androidx.compose.animation.core.d dVar = (androidx.compose.animation.core.d) objQ6;
                androidx.compose.ui.unit.f fVar2 = new androidx.compose.ui.unit.f(f2);
                boolean zH = sVar.h(dVar) | sVar.c(f2) | ((((i12 & 14) ^ 6) > 4 && sVar.g(z2)) || (i12 & 6) == 4) | sVar.h(iVar);
                Object objQ7 = sVar.Q();
                if (zH || objQ7 == obj) {
                    z3 = false;
                    a0 a0Var2 = new a0(dVar, f2, z2, iVar, a1Var, (kotlin.coroutines.d) null);
                    sVar.l0(a0Var2);
                    objQ7 = a0Var2;
                } else {
                    z3 = false;
                }
                androidx.compose.runtime.l0.c(sVar, fVar2, (kotlin.jvm.functions.p) objQ7);
                nVar = dVar.c;
                sVar.p(z3);
                r12 = z3;
            }
            float f3 = nVar != null ? ((androidx.compose.ui.unit.f) nVar.y.getValue()).e : (float) r12;
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-990050154, new p0(z4Var, z2, z, fVar, m0Var, f, z0Var), sVar);
            androidx.compose.runtime.d0 d0Var = p5.a;
            long jB = u0.b(j, sVar);
            float f4 = (float) r12;
            if (kVar2 == null) {
                sVar.b0(1528143336);
                Object objQ8 = sVar.Q();
                if (objQ8 == obj) {
                    objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                sVar.p(r12);
                kVar2 = (androidx.compose.foundation.interaction.k) objQ8;
            } else {
                sVar.b0(-227800369);
                sVar.p(r12);
            }
            androidx.compose.runtime.d0 d0Var2 = p5.a;
            float f5 = ((androidx.compose.ui.unit.f) sVar.j(d0Var2)).e + f4;
            androidx.compose.runtime.s sVar3 = sVar;
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{a1.a.a(new androidx.compose.ui.graphics.t(jB)), d0Var2.a(new androidx.compose.ui.unit.f(f5))}, androidx.compose.runtime.internal.k.c(1508735219, new o5(rVarA, n0Var, j, f5, a0Var, z, kVar2, z2, aVar, f3, fVarC), sVar3), sVar3, 56);
            sVar2 = sVar3;
        } else {
            androidx.compose.runtime.s sVar4 = sVar;
            sVar4.W();
            sVar2 = sVar4;
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.l0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.t.A(i | 1);
                    int iA2 = androidx.compose.runtime.t.A(i2);
                    q0.c(z, rVar, aVar, z2, fVar, m0Var, n0Var, z4Var, a5Var, a0Var, f, z0Var, kVar, (androidx.compose.runtime.s) obj2, iA, iA2);
                    return kotlin.y.a;
                }
            };
        }
    }
}
