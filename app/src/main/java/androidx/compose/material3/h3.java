package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 {
    public static final float a = 48;
    public static final float b = 24;
    public static final long c = androidx.compose.ui.graphics.a0.h(0.5f, 0.0f);

    public static final void a(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, j5 j5Var, float f, boolean z, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f2, long j3, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, i3 i3Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        final androidx.compose.ui.r rVar2;
        final j5 j5Var2;
        final float f3;
        final boolean z2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j4;
        final long j5;
        final float f4;
        final long j6;
        final kotlin.jvm.functions.p pVar3;
        final kotlin.jvm.functions.p pVar4;
        final i3 i3Var2;
        j5 j5Var3;
        float f5;
        boolean z3;
        androidx.compose.ui.graphics.n0 n0Var3;
        long j7;
        long j8;
        float f6;
        long j9;
        kotlin.jvm.functions.p pVar5;
        kotlin.jvm.functions.p pVar6;
        i3 i3Var3;
        androidx.compose.ui.r rVar3;
        CoroutineScope coroutineScope;
        androidx.compose.animation.core.d dVar;
        sVar.c0(1904798512);
        int i2 = i | 373910704;
        final int i3 = 0;
        final int i4 = 1;
        if (sVar.T(i2 & 1, (306783379 & i2) != 306783378)) {
            sVar.Y();
            int i5 = i & 1;
            Object obj = androidx.compose.runtime.n.a;
            if (i5 == 0 || sVar.C()) {
                Object objQ = sVar.Q();
                if (objQ == obj) {
                    objQ = new androidx.compose.foundation.gestures.w1(27);
                    sVar.l0(objQ);
                }
                Object obj2 = (kotlin.jvm.functions.l) objQ;
                float f7 = g5.a;
                final float f8 = u.c;
                final float f9 = u.d;
                final androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                boolean zF = sVar.f(cVar) | sVar.c(f8);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == obj) {
                    objQ2 = new kotlin.jvm.functions.a() { // from class: androidx.compose.material3.e5
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            float fW;
                            switch (i3) {
                                case 0:
                                    fW = cVar.W(f8);
                                    break;
                                default:
                                    fW = cVar.W(f8);
                                    break;
                            }
                            return Float.valueOf(fW);
                        }
                    };
                    sVar.l0(objQ2);
                }
                Object obj3 = (kotlin.jvm.functions.a) objQ2;
                boolean zF2 = sVar.f(cVar) | sVar.c(f9);
                Object objQ3 = sVar.Q();
                if (zF2 || objQ3 == obj) {
                    objQ3 = new kotlin.jvm.functions.a() { // from class: androidx.compose.material3.e5
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            float fW;
                            switch (i4) {
                                case 0:
                                    fW = cVar.W(f9);
                                    break;
                                default:
                                    fW = cVar.W(f9);
                                    break;
                            }
                            return Float.valueOf(fW);
                        }
                    };
                    sVar.l0(objQ3);
                }
                Object obj4 = (kotlin.jvm.functions.a) objQ3;
                Object[] objArr = {false, obj2, Boolean.FALSE};
                androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(14, new androidx.compose.foundation.b2(12), new androidx.compose.animation.core.a(11, obj3, obj4, obj2));
                boolean zG = sVar.g(false) | sVar.f(obj3) | sVar.f(obj4) | sVar.f(obj2) | sVar.g(false);
                Object objQ4 = sVar.Q();
                if (zG || objQ4 == obj) {
                    objQ4 = new androidx.compose.animation.core.l0(obj3, obj4, k5.e, obj2, 3);
                    sVar.l0(objQ4);
                }
                j5Var3 = (j5) androidx.compose.runtime.saveable.l.c(objArr, oVar, (kotlin.jvm.functions.a) objQ4, sVar, 0);
                float f10 = u.b;
                u uVar = u.a;
                androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.y.b, sVar);
                long jD = u0.d(androidx.compose.material3.tokens.y.a, sVar);
                long jB = u0.b(jD, sVar);
                long jB2 = androidx.compose.ui.graphics.t.b(0.32f, u0.d(androidx.compose.material3.tokens.t.N, sVar));
                f5 = f10;
                z3 = true;
                n0Var3 = n0VarA;
                j7 = jD;
                j8 = jB;
                f6 = 0;
                j9 = jB2;
                pVar5 = x0.a;
                pVar6 = v0.F;
                i3Var3 = new i3();
                rVar3 = androidx.compose.ui.o.b;
            } else {
                sVar.W();
                rVar3 = rVar;
                j5Var3 = j5Var;
                f5 = f;
                z3 = z;
                n0Var3 = n0Var;
                j7 = j;
                j8 = j2;
                f6 = f2;
                j9 = j3;
                pVar5 = pVar;
                pVar6 = pVar2;
                i3Var3 = i3Var;
            }
            sVar.q();
            androidx.compose.material3.tokens.p pVar7 = androidx.compose.material3.tokens.p.e;
            Object objR = q.r(pVar7, sVar);
            Object objR2 = q.r(pVar7, sVar);
            Object objR3 = q.r(androidx.compose.material3.tokens.p.A, sVar);
            boolean zF3 = sVar.f(j5Var3) | sVar.h(objR2) | sVar.h(objR3) | sVar.h(objR);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new androidx.compose.animation.core.l0(j5Var3, objR2, objR3, objR, 1);
                sVar.l0(objQ5);
            }
            androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ5, sVar);
            Object objQ6 = sVar.Q();
            if (objQ6 == obj) {
                objQ6 = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ6);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objQ6;
            boolean zF4 = sVar.f(j5Var3) | sVar.h(coroutineScope2);
            Object objQ7 = sVar.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new y2(j5Var3, coroutineScope2, aVar);
                sVar.l0(objQ7);
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ7;
            boolean zH = sVar.h(coroutineScope2) | sVar.f(j5Var3);
            Object objQ8 = sVar.Q();
            if (zH || objQ8 == obj) {
                objQ8 = new androidx.compose.animation.core.a(9, coroutineScope2, j5Var3, aVar);
                sVar.l0(objQ8);
            }
            kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == obj) {
                objQ9 = androidx.compose.animation.core.e.a(0.0f);
                sVar.l0(objQ9);
            }
            androidx.compose.animation.core.d dVar2 = (androidx.compose.animation.core.d) objQ9;
            boolean zF5 = sVar.f(j5Var3) | sVar.h(coroutineScope2) | sVar.h(dVar2);
            Object objQ10 = sVar.Q();
            if (zF5 || objQ10 == obj) {
                objQ10 = new androidx.compose.animation.core.l0(j5Var3, coroutineScope2, dVar2, aVar, 2);
                coroutineScope = coroutineScope2;
                dVar = dVar2;
                sVar.l0(objQ10);
            } else {
                coroutineScope = coroutineScope2;
                dVar = dVar2;
            }
            q.g((kotlin.jvm.functions.a) objQ10, j8, i3Var3, dVar, androidx.compose.runtime.internal.k.c(1010026864, new c3(j9, aVar2, j5Var3, i3Var3, dVar, coroutineScope, lVar, rVar3, f5, z3, n0Var3, j7, j8, f6, pVar5, pVar6, fVar), sVar), sVar, 29056);
            if (j5Var3.c.d().a.containsKey(k5.y)) {
                sVar.b0(748459762);
                boolean zF6 = sVar.f(j5Var3);
                Object objQ11 = sVar.Q();
                if (zF6 || objQ11 == obj) {
                    objQ11 = new b3(j5Var3, null, 2);
                    sVar.l0(objQ11);
                }
                androidx.compose.runtime.l0.c(sVar, j5Var3, (kotlin.jvm.functions.p) objQ11);
                sVar.p(false);
            } else {
                sVar.b0(748521266);
                sVar.p(false);
            }
            j5Var2 = j5Var3;
            j6 = j9;
            i3Var2 = i3Var3;
            rVar2 = rVar3;
            f3 = f5;
            z2 = z3;
            n0Var2 = n0Var3;
            j4 = j7;
            j5 = j8;
            f4 = f6;
            pVar3 = pVar5;
            pVar4 = pVar6;
        } else {
            sVar.W();
            rVar2 = rVar;
            j5Var2 = j5Var;
            f3 = f;
            z2 = z;
            n0Var2 = n0Var;
            j4 = j;
            j5 = j2;
            f4 = f2;
            j6 = j3;
            pVar3 = pVar;
            pVar4 = pVar2;
            i3Var2 = i3Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(rVar2, j5Var2, f3, z2, n0Var2, j4, j5, f4, j6, pVar3, pVar4, i3Var2, fVar, i) { // from class: androidx.compose.material3.z2
                public final /* synthetic */ float A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 C;
                public final /* synthetic */ long D;
                public final /* synthetic */ long E;
                public final /* synthetic */ float F;
                public final /* synthetic */ long G;
                public final /* synthetic */ kotlin.jvm.functions.p H;
                public final /* synthetic */ kotlin.jvm.functions.p I;
                public final /* synthetic */ i3 J;
                public final /* synthetic */ androidx.compose.runtime.internal.f K;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ j5 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iA = androidx.compose.runtime.t.A(7);
                    h3.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (androidx.compose.runtime.s) obj5, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.animation.core.d dVar, final CoroutineScope coroutineScope, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.r rVar, final j5 j5Var, final float f, final boolean z, final androidx.compose.ui.graphics.n0 n0Var, final long j, final long j2, final float f2, final kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        androidx.compose.ui.r rVarA;
        sVar.c0(-37400432);
        int i2 = i | (sVar.h(dVar) ? 32 : 16) | (sVar.h(coroutineScope) ? LibretroCore.SCREEN_WIDTH : 128);
        boolean zH = sVar.h(aVar);
        int i3 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        int i4 = i2 | (zH ? 2048 : 1024) | (sVar.h(lVar) ? 16384 : 8192);
        boolean zF = sVar.f(rVar);
        int i5 = Parser.ARGC_LIMIT;
        int i6 = i4 | (zF ? 131072 : 65536) | (sVar.f(j5Var) ? 1048576 : 524288) | (sVar.c(f) ? 8388608 : 4194304) | (sVar.g(z) ? 67108864 : 33554432) | (sVar.f(n0Var) ? 536870912 : 268435456);
        int i7 = (sVar.e(j) ? 4 : 2) | (sVar.e(j2) ? 32 : 16) | (sVar.c(f2) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.h(pVar)) {
            i3 = 2048;
        }
        int i8 = i7 | i3 | (sVar.h(pVar2) ? 16384 : 8192);
        if (sVar.h(fVar)) {
            i5 = 131072;
        }
        int i9 = i8 | i5;
        if (sVar.T(i6 & 1, ((i6 & 306783379) == 306783378 && (i9 & 74899) == 74898) ? false : true)) {
            sVar.Y();
            if ((i & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            String strI = androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_pane_title, sVar);
            androidx.compose.ui.r rVarE = androidx.compose.foundation.layout.i1.e(androidx.compose.foundation.layout.i1.r(androidx.compose.foundation.layout.t.e(rVar, androidx.compose.ui.c.y), f), 1.0f);
            Object obj = androidx.compose.runtime.n.a;
            if (z) {
                sVar.b0(-1582035383);
                boolean z2 = (((i6 & 3670016) ^ 1572864) > 1048576 && sVar.f(j5Var)) || (i6 & 1572864) == 1048576;
                Object objQ = sVar.Q();
                if (z2 || objQ == obj) {
                    float f3 = g5.a;
                    objQ = new f5(j5Var, lVar);
                    sVar.l0(objQ);
                }
                rVarA = androidx.compose.ui.input.nestedscroll.f.a((androidx.compose.ui.input.nestedscroll.a) objQ, null);
                sVar.p(false);
            } else {
                sVar.b0(-1582020872);
                sVar.p(false);
                rVarA = androidx.compose.ui.o.b;
            }
            androidx.compose.ui.r rVarD = rVarE.d(rVarA);
            androidx.compose.material3.internal.p pVar3 = j5Var.c;
            androidx.compose.material3.internal.p pVar4 = j5Var.c;
            int i10 = (i6 & 3670016) ^ 1572864;
            boolean z3 = (i10 > 1048576 && sVar.f(j5Var)) || (i6 & 1572864) == 1048576;
            Object objQ2 = sVar.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new androidx.compose.animation.core.g0(j5Var, 11);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarG = androidx.compose.material3.internal.i.g(rVarD, pVar3, (kotlin.jvm.functions.p) objQ2);
            androidx.compose.foundation.text.input.internal.o oVar = pVar4.f;
            boolean z4 = z && j5Var.d();
            boolean z5 = pVar4.l.getValue() != null;
            boolean z6 = (i6 & 57344) == 16384;
            Object objQ3 = sVar.Q();
            if (z6 || objQ3 == obj) {
                objQ3 = new e3(lVar, null);
                sVar.l0(objQ3);
            }
            androidx.compose.ui.r rVarD2 = rVarG.d(new androidx.compose.foundation.gestures.m0(oVar, z4, z5, androidx.compose.foundation.gestures.o0.a, (kotlin.jvm.functions.q) objQ3));
            boolean zF2 = sVar.f(strI);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new r(strI, 3);
                sVar.l0(objQ4);
            }
            androidx.compose.ui.r rVarA2 = androidx.compose.ui.semantics.q.a(rVarD2, false, (kotlin.jvm.functions.l) objQ4);
            int iG = (int) pVar4.j.g();
            if (iG < 0) {
                iG = 0;
            }
            androidx.compose.ui.r rVarJ = androidx.compose.foundation.layout.b.j(rVarA2, new androidx.compose.foundation.layout.g0(iG));
            boolean z7 = ((i10 > 1048576 && sVar.f(j5Var)) || (i6 & 1572864) == 1048576) | ((i6 & Token.ASSIGN_MOD) == 32 || sVar.h(dVar));
            Object objQ5 = sVar.Q();
            if (z7 || objQ5 == obj) {
                objQ5 = new androidx.activity.compose.h(26, j5Var, dVar);
                sVar.l0(objQ5);
            }
            int i11 = i9 << 6;
            p5.a(androidx.compose.ui.graphics.a0.o(androidx.compose.ui.graphics.a0.o(rVarJ, (kotlin.jvm.functions.l) objQ5), new v(j5Var, 1)), n0Var, j, j2, f2, 0.0f, androidx.compose.runtime.internal.k.c(728743275, new g3(pVar2, dVar, j5Var, pVar, fVar, aVar, coroutineScope, z), sVar), sVar, ((i6 >> 24) & Token.ASSIGN_MOD) | 12582912 | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 96);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(coroutineScope, aVar, lVar, rVar, j5Var, f, z, n0Var, j, j2, f2, pVar, pVar2, fVar, i) { // from class: androidx.compose.material3.w2
                public final /* synthetic */ kotlin.jvm.functions.l A;
                public final /* synthetic */ androidx.compose.ui.r B;
                public final /* synthetic */ j5 C;
                public final /* synthetic */ float D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ float I;
                public final /* synthetic */ kotlin.jvm.functions.p J;
                public final /* synthetic */ kotlin.jvm.functions.p K;
                public final /* synthetic */ androidx.compose.runtime.internal.f L;
                public final /* synthetic */ CoroutineScope y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.t.A(71);
                    h3.b(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (androidx.compose.runtime.s) obj2, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(final long j, final kotlin.jvm.functions.a aVar, final boolean z, final boolean z2, androidx.compose.runtime.s sVar, final int i) {
        sVar.c0(-391613911);
        int i2 = i | (sVar.e(j) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.g(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (!sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            sVar.W();
        } else if (j != 16) {
            sVar.b0(-1438582326);
            androidx.compose.runtime.w2 w2VarB = androidx.compose.animation.core.h.b(z ? 1.0f : 0.0f, q.r(androidx.compose.material3.tokens.p.z, sVar), sVar, 0, 28);
            String strI = androidx.compose.material3.internal.i.i(R.string.close_sheet, sVar);
            androidx.compose.ui.r rVarA = androidx.compose.ui.o.b;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (z2) {
                sVar.b0(-1438283579);
                int i3 = i2 & Token.ASSIGN_MOD;
                boolean z3 = i3 == 32;
                Object objQ = sVar.Q();
                if (z3 || objQ == fVar) {
                    objQ = new androidx.compose.foundation.m(aVar, 7);
                    sVar.l0(objQ);
                }
                androidx.compose.ui.r rVarA2 = androidx.compose.ui.input.pointer.h0.a(rVarA, aVar, (PointerInputEventHandler) objQ);
                boolean zF = (i3 == 32) | sVar.f(strI);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == fVar) {
                    objQ2 = new androidx.activity.compose.h(27, strI, aVar);
                    sVar.l0(objQ2);
                }
                rVarA = androidx.compose.ui.semantics.q.a(rVarA2, true, (kotlin.jvm.functions.l) objQ2);
                sVar.p(false);
            } else {
                sVar.b0(-1437857391);
                sVar.p(false);
            }
            androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.i1.c.d(rVarA);
            boolean zF2 = sVar.f(w2VarB) | ((i2 & 14) == 4);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == fVar) {
                objQ3 = new androidx.work.impl.model.q(j, w2VarB, 3);
                sVar.l0(objQ3);
            }
            androidx.compose.foundation.s.b(rVarD, (kotlin.jvm.functions.l) objQ3, sVar, 0);
            sVar.p(false);
        } else {
            sVar.b0(-1437676103);
            sVar.p(false);
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(j, aVar, z, z2, i) { // from class: androidx.compose.material3.v2
                public final /* synthetic */ boolean A;
                public final /* synthetic */ long e;
                public final /* synthetic */ kotlin.jvm.functions.a y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    h3.c(this.e, this.y, this.z, this.A, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final float d(androidx.compose.ui.graphics.k0 k0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (k0Var.I >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (com.google.firebase.b.M(0.0f, Math.min(k0Var.J.a() * a, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(androidx.compose.ui.graphics.k0 k0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (k0Var.I & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (com.google.firebase.b.M(0.0f, Math.min(k0Var.J.a() * b, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
