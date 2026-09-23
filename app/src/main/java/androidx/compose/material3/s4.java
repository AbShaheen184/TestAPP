package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s4 {
    public static final float a = 240;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final androidx.compose.animation.core.v e;
    public static final androidx.compose.animation.core.v f;

    static {
        float f2 = androidx.compose.material3.tokens.m.a;
        b = androidx.compose.material3.tokens.m.a;
        c = 6;
        float f3 = androidx.compose.material3.tokens.c.a;
        d = androidx.compose.material3.tokens.c.a;
        androidx.compose.animation.core.v vVar = androidx.compose.material3.tokens.q.a;
        e = androidx.compose.material3.tokens.q.a;
        f = androidx.compose.material3.tokens.q.c;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.r rVar, long j, float f2, long j2, int i, float f3, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        androidx.compose.ui.r rVar2;
        int i4;
        long jD;
        float f4;
        int i5;
        boolean z;
        final long j3;
        final androidx.compose.ui.r rVar3;
        final long j4;
        final float f5;
        final int i6;
        final float f6;
        androidx.compose.runtime.s1 s1VarT;
        long j5;
        int i7;
        final int i8;
        final float f7;
        final androidx.compose.ui.graphics.drawscope.h hVar;
        final androidx.compose.animation.core.h0 h0VarE;
        final androidx.compose.animation.core.h0 h0VarE2;
        final androidx.compose.animation.core.h0 h0VarE3;
        boolean z2;
        boolean zF;
        Object objQ;
        final long j6;
        final float f8;
        final long j7;
        sVar.c0(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jD = j;
            i4 |= ((i3 & 2) == 0 && sVar.e(jD)) ? 32 : 16;
        } else {
            jD = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                f4 = f2;
                i4 |= sVar.c(f4) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            i5 = i4 | 222208;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i5 & 1, z)) {
                sVar.Y();
                if ((i2 & 1) != 0 || sVar.C()) {
                    if (i9 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i3 & 2) != 0) {
                        float f9 = k4.a;
                        jD = u0.d(androidx.compose.material3.tokens.t.L, sVar);
                        i5 &= -113;
                    }
                    if (i10 != 0) {
                        f4 = k4.a;
                    }
                    float f10 = k4.a;
                    j5 = androidx.compose.ui.graphics.t.h;
                    i7 = i5 & (-7169);
                    i8 = k4.c;
                    f7 = k4.f;
                } else {
                    sVar.W();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    androidx.compose.ui.r rVar4 = rVar2;
                    i7 = i5 & (-7169);
                    rVar3 = rVar4;
                    j5 = j2;
                    i8 = i;
                    f7 = f3;
                }
                sVar.q();
                hVar = new androidx.compose.ui.graphics.drawscope.h(((androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h)).W(f4), 0.0f, i8, 0, 26);
                androidx.compose.animation.core.k0 k0VarL = androidx.compose.animation.core.e.l(sVar);
                h0VarE = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 1080.0f, androidx.compose.animation.core.e.k(androidx.compose.animation.core.e.o(6000, 2, androidx.compose.animation.core.a0.b)), sVar);
                t3 t3Var = new t3(1);
                androidx.compose.animation.core.n0 n0Var = new androidx.compose.animation.core.n0();
                t3Var.invoke(n0Var);
                h0VarE2 = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 360.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var)), sVar);
                androidx.compose.animation.core.n0 n0Var2 = new androidx.compose.animation.core.n0();
                n0Var2.a = 6000;
                n0Var2.a(3000, Float.valueOf(0.87f)).b = f;
                n0Var2.a(6000, Float.valueOf(0.1f));
                h0VarE3 = androidx.compose.animation.core.e.e(k0VarL, 0.1f, 0.87f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var2)), sVar);
                androidx.compose.ui.r rVarM = androidx.compose.foundation.layout.i1.m(androidx.compose.ui.semantics.q.a(rVar3, true, new androidx.compose.animation.core.n1(26)), d);
                boolean zF2 = sVar.f(h0VarE3);
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zF = z2 | zF2 | sVar.f(h0VarE) | sVar.f(h0VarE2) | sVar.e(j5) | sVar.h(hVar) | ((((i7 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.e(jD)) || (i7 & 48) == 32);
                objQ = sVar.Q();
                if (!zF || objQ == androidx.compose.runtime.n.a) {
                    j6 = jD;
                    f8 = f4;
                    j7 = j5;
                    objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj) throws Throwable {
                            long j8;
                            long j9 = j7;
                            androidx.compose.ui.graphics.drawscope.h hVar2 = hVar;
                            long j10 = j6;
                            androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                            float fFloatValue = ((Number) h0VarE3.getValue()).floatValue() * 360.0f;
                            int i11 = i8;
                            float f11 = f7;
                            if (i11 != 0 && Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.d() >> 32))) {
                                f11 += f8;
                            }
                            float fP = (f11 / ((float) (((double) dVar.P(Float.intBitsToFloat((int) (dVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) h0VarE2.getValue()).floatValue() + ((Number) h0VarE.getValue()).floatValue();
                            long jK0 = dVar.k0();
                            androidx.appcompat.widget.c2 c2VarC0 = dVar.c0();
                            long jG = c2VarC0.G();
                            c2VarC0.v().f();
                            try {
                                ((com.google.firebase.platforminfo.d) c2VarC0.y).m(fFloatValue2, jK0);
                                s4.d(dVar, Math.min(fFloatValue, fP) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fP) * 2), j9, hVar2);
                                j8 = jG;
                                try {
                                    s4.d(dVar, 0.0f, fFloatValue, j10, hVar2);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                    return kotlin.y.a;
                                } catch (Throwable th) {
                                    th = th;
                                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j8 = jG;
                            }
                        }
                    };
                    sVar.l0(objQ);
                } else {
                    j6 = jD;
                    f8 = f4;
                    j7 = j5;
                }
                androidx.compose.foundation.s.b(rVarM, (kotlin.jvm.functions.l) objQ, sVar, 0);
                i6 = i8;
                f6 = f7;
                f5 = f8;
                j3 = j7;
                j4 = j6;
            } else {
                sVar.W();
                j3 = j2;
                rVar3 = rVar2;
                j4 = jD;
                f5 = f4;
                i6 = i;
                f6 = f3;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m4
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s4.a(rVar3, j4, f5, j3, i6, f6, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i4 |= 384;
        f4 = f2;
        i5 = i4 | 222208;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sVar.T(i5 & 1, z)) {
            sVar.Y();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                } else {
                    rVar3 = rVar2;
                }
                if ((i3 & 2) != 0) {
                    float f11 = k4.a;
                    jD = u0.d(androidx.compose.material3.tokens.t.L, sVar);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f4 = k4.a;
                }
                float f12 = k4.a;
                j5 = androidx.compose.ui.graphics.t.h;
                i7 = i5 & (-7169);
                i8 = k4.c;
                f7 = k4.f;
            } else {
                if (i9 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                } else {
                    rVar3 = rVar2;
                }
                if ((i3 & 2) != 0) {
                    float f13 = k4.a;
                    jD = u0.d(androidx.compose.material3.tokens.t.L, sVar);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f4 = k4.a;
                }
                float f14 = k4.a;
                j5 = androidx.compose.ui.graphics.t.h;
                i7 = i5 & (-7169);
                i8 = k4.c;
                f7 = k4.f;
            }
            sVar.q();
            hVar = new androidx.compose.ui.graphics.drawscope.h(((androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h)).W(f4), 0.0f, i8, 0, 26);
            androidx.compose.animation.core.k0 k0VarL2 = androidx.compose.animation.core.e.l(sVar);
            h0VarE = androidx.compose.animation.core.e.e(k0VarL2, 0.0f, 1080.0f, androidx.compose.animation.core.e.k(androidx.compose.animation.core.e.o(6000, 2, androidx.compose.animation.core.a0.b)), sVar);
            t3 t3Var2 = new t3(1);
            androidx.compose.animation.core.n0 n0Var3 = new androidx.compose.animation.core.n0();
            t3Var2.invoke(n0Var3);
            h0VarE2 = androidx.compose.animation.core.e.e(k0VarL2, 0.0f, 360.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var3)), sVar);
            androidx.compose.animation.core.n0 n0Var4 = new androidx.compose.animation.core.n0();
            n0Var4.a = 6000;
            n0Var4.a(3000, Float.valueOf(0.87f)).b = f;
            n0Var4.a(6000, Float.valueOf(0.1f));
            h0VarE3 = androidx.compose.animation.core.e.e(k0VarL2, 0.1f, 0.87f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var4)), sVar);
            androidx.compose.ui.r rVarM2 = androidx.compose.foundation.layout.i1.m(androidx.compose.ui.semantics.q.a(rVar3, true, new androidx.compose.animation.core.n1(26)), d);
            boolean zF3 = sVar.f(h0VarE3);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zF = z2 | zF3 | sVar.f(h0VarE) | sVar.f(h0VarE2) | sVar.e(j5) | sVar.h(hVar) | ((((i7 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.e(jD)) || (i7 & 48) == 32);
            objQ = sVar.Q();
            if (zF) {
                j6 = jD;
                f8 = f4;
                j7 = j5;
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) throws Throwable {
                        long j8;
                        long j9 = j7;
                        androidx.compose.ui.graphics.drawscope.h hVar2 = hVar;
                        long j10 = j6;
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                        float fFloatValue = ((Number) h0VarE3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f15 = f7;
                        if (i11 != 0 && Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.d() >> 32))) {
                            f15 += f8;
                        }
                        float fP = (f15 / ((float) (((double) dVar.P(Float.intBitsToFloat((int) (dVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) h0VarE2.getValue()).floatValue() + ((Number) h0VarE.getValue()).floatValue();
                        long jK0 = dVar.k0();
                        androidx.appcompat.widget.c2 c2VarC0 = dVar.c0();
                        long jG = c2VarC0.G();
                        c2VarC0.v().f();
                        try {
                            ((com.google.firebase.platforminfo.d) c2VarC0.y).m(fFloatValue2, jK0);
                            s4.d(dVar, Math.min(fFloatValue, fP) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fP) * 2), j9, hVar2);
                            j8 = jG;
                            try {
                                s4.d(dVar, 0.0f, fFloatValue, j10, hVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                return kotlin.y.a;
                            } catch (Throwable th) {
                                th = th;
                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j8 = jG;
                        }
                    }
                };
                sVar.l0(objQ);
            } else {
                j6 = jD;
                f8 = f4;
                j7 = j5;
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) throws Throwable {
                        long j8;
                        long j9 = j7;
                        androidx.compose.ui.graphics.drawscope.h hVar2 = hVar;
                        long j10 = j6;
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                        float fFloatValue = ((Number) h0VarE3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f15 = f7;
                        if (i11 != 0 && Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.d() >> 32))) {
                            f15 += f8;
                        }
                        float fP = (f15 / ((float) (((double) dVar.P(Float.intBitsToFloat((int) (dVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) h0VarE2.getValue()).floatValue() + ((Number) h0VarE.getValue()).floatValue();
                        long jK0 = dVar.k0();
                        androidx.appcompat.widget.c2 c2VarC0 = dVar.c0();
                        long jG = c2VarC0.G();
                        c2VarC0.v().f();
                        try {
                            ((com.google.firebase.platforminfo.d) c2VarC0.y).m(fFloatValue2, jK0);
                            s4.d(dVar, Math.min(fFloatValue, fP) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fP) * 2), j9, hVar2);
                            j8 = jG;
                            try {
                                s4.d(dVar, 0.0f, fFloatValue, j10, hVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                return kotlin.y.a;
                            } catch (Throwable th) {
                                th = th;
                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, j8);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j8 = jG;
                        }
                    }
                };
                sVar.l0(objQ);
            }
            androidx.compose.foundation.s.b(rVarM2, (kotlin.jvm.functions.l) objQ, sVar, 0);
            i6 = i8;
            f6 = f7;
            f5 = f8;
            j3 = j7;
            j4 = j6;
        } else {
            sVar.W();
            j3 = j2;
            rVar3 = rVar2;
            j4 = jD;
            f5 = f4;
            i6 = i;
            f6 = f3;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m4
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s4.a(rVar3, j4, f5, j3, i6, f6, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, final long j, long j2, int i, float f2, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        long jD;
        final int i5;
        final float f3;
        final kotlin.jvm.functions.l lVar2;
        final long j3;
        final int i6;
        float f4;
        int i7;
        kotlin.jvm.functions.l lVar3;
        final long j4;
        final kotlin.jvm.functions.l lVar4;
        Object obj;
        final int i8;
        final float f5;
        sVar.c0(-339970038);
        if ((i2 & 6) == 0) {
            i4 = (sVar.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.e(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            jD = j2;
            i4 |= ((i3 & 8) == 0 && sVar.e(jD)) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            jD = j2;
        }
        int i9 = i4 | 745472;
        if (sVar.T(i9 & 1, (599187 & i9) != 599186)) {
            sVar.Y();
            int i10 = i2 & 1;
            Object obj2 = androidx.compose.runtime.n.a;
            if (i10 == 0 || sVar.C()) {
                if ((i3 & 8) != 0) {
                    float f6 = k4.a;
                    jD = u0.d(androidx.compose.material3.tokens.t.M, sVar);
                    i9 &= -7169;
                }
                i6 = k4.b;
                f4 = k4.e;
                boolean z = (((i9 & 896) ^ 384) > 256 && sVar.e(j)) || (i9 & 384) == 256;
                Object objQ = sVar.Q();
                if (z || objQ == obj2) {
                    objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.n4
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj3) {
                            androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj3;
                            float fMin = Math.min(dVar.W(k4.d), Float.intBitsToFloat((int) (dVar.d() & 4294967295L)));
                            float fW = dVar.W(s4.c);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - fMin) / 2;
                            float f7 = fIntBitsToFloat > fW ? fW : fIntBitsToFloat;
                            androidx.compose.ui.unit.m layoutDirection = dVar.getLayoutDirection();
                            androidx.compose.ui.unit.m mVar = androidx.compose.ui.unit.m.y;
                            long j5 = j;
                            int i11 = i6;
                            if (layoutDirection == mVar) {
                                long jK0 = dVar.k0();
                                androidx.appcompat.widget.c2 c2VarC0 = dVar.c0();
                                long jG = c2VarC0.G();
                                c2VarC0.v().f();
                                try {
                                    ((com.google.firebase.platforminfo.d) c2VarC0.y).n(-1.0f, 1.0f, jK0);
                                    k4.a(dVar, i11, j5, fMin, f7);
                                } finally {
                                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarC0, jG);
                                }
                            } else {
                                k4.a(dVar, i11, j5, fMin, f7);
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ);
                }
                long j5 = jD;
                i7 = i9 & (-3670017);
                lVar3 = (kotlin.jvm.functions.l) objQ;
                j4 = j5;
            } else {
                sVar.W();
                if ((i3 & 8) != 0) {
                    i9 &= -7169;
                }
                i6 = i;
                f4 = f2;
                j4 = jD;
                i7 = i9 & (-3670017);
                lVar3 = lVar;
            }
            sVar.q();
            boolean z2 = (i7 & 14) == 4;
            Object objQ2 = sVar.Q();
            if (z2 || objQ2 == obj2) {
                objQ2 = new x2(2, aVar);
                sVar.l0(objQ2);
            }
            final kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ2;
            androidx.compose.ui.r rVarD = rVar.d(androidx.compose.material3.internal.b.c);
            boolean zF = sVar.f(aVar2);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == obj2) {
                objQ3 = new androidx.compose.foundation.text.selection.g1(3, aVar2);
                sVar.l0(objQ3);
            }
            androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.i1.n(androidx.compose.ui.semantics.q.a(rVarD, true, (kotlin.jvm.functions.l) objQ3), a, b);
            boolean zF2 = ((((i7 & 7168) ^ 3072) > 2048 && sVar.e(j4)) || (i7 & 3072) == 2048) | sVar.f(aVar2) | ((((i7 & 896) ^ 384) > 256 && sVar.e(j)) || (i7 & 384) == 256) | sVar.f(lVar3);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == obj2) {
                lVar4 = lVar3;
                i8 = i6;
                f5 = f4;
                obj = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.o4
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj3) {
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                        int i11 = i8;
                        float fP = f5;
                        if (i11 != 0 && Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.d() >> 32))) {
                            fP += dVar.P(fIntBitsToFloat);
                        }
                        float fP2 = fP / dVar.P(Float.intBitsToFloat((int) (dVar.d() >> 32)));
                        float fFloatValue = ((Number) aVar2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fP2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            s4.e(dVar, fMin, 1.0f, j4, fIntBitsToFloat, i11);
                        }
                        s4.e(dVar, 0.0f, fFloatValue, j, fIntBitsToFloat, i11);
                        lVar4.invoke(dVar);
                        return kotlin.y.a;
                    }
                };
                sVar.l0(obj);
            } else {
                lVar4 = lVar3;
                obj = objQ4;
                i8 = i6;
                f5 = f4;
            }
            androidx.compose.foundation.s.b(rVarN, (kotlin.jvm.functions.l) obj, sVar, 0);
            f3 = f5;
            j3 = j4;
            i5 = i8;
            lVar2 = lVar4;
        } else {
            sVar.W();
            i5 = i;
            f3 = f2;
            lVar2 = lVar;
            j3 = jD;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.p4
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    s4.b(aVar, rVar, j, j3, i5, f3, lVar2, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.A(i2 | 1), i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.r rVar, final long j, final long j2, int i, float f2, androidx.compose.runtime.s sVar, final int i2) {
        int i3;
        final int i4;
        final float f3;
        int i5;
        float f4;
        final int i6;
        final float f5;
        int i7;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        sVar.c0(567589233);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.e(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.e(j2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i8 = i3 | 27648;
        if (sVar.T(i8 & 1, (i8 & 9363) != 9362)) {
            sVar.Y();
            if ((i2 & 1) == 0 || sVar.C()) {
                i5 = k4.b;
                f4 = k4.e;
            } else {
                sVar.W();
                i5 = i;
                f4 = f2;
            }
            sVar.q();
            androidx.compose.animation.core.k0 k0VarL = androidx.compose.animation.core.e.l(sVar);
            androidx.compose.animation.core.n0 n0Var = new androidx.compose.animation.core.n0();
            int i9 = i5;
            n0Var.a = 1750;
            androidx.compose.animation.core.m0 m0VarA = n0Var.a(0, fValueOf2);
            androidx.compose.animation.core.v vVar = e;
            m0VarA.b = vVar;
            n0Var.a(1000, fValueOf);
            final androidx.compose.animation.core.h0 h0VarE = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 1.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var)), sVar);
            androidx.compose.animation.core.n0 n0Var2 = new androidx.compose.animation.core.n0();
            n0Var2.a = 1750;
            n0Var2.a(Context.VERSION_ECMASCRIPT, fValueOf2).b = vVar;
            n0Var2.a(1250, fValueOf);
            final androidx.compose.animation.core.h0 h0VarE2 = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 1.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var2)), sVar);
            androidx.compose.animation.core.n0 n0Var3 = new androidx.compose.animation.core.n0();
            float f6 = f4;
            n0Var3.a = 1750;
            n0Var3.a(650, fValueOf2).b = vVar;
            n0Var3.a(1500, fValueOf);
            final androidx.compose.animation.core.h0 h0VarE3 = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 1.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var3)), sVar);
            androidx.compose.animation.core.n0 n0Var4 = new androidx.compose.animation.core.n0();
            n0Var4.a = 1750;
            n0Var4.a(900, fValueOf2).b = vVar;
            n0Var4.a(1750, fValueOf);
            final androidx.compose.animation.core.h0 h0VarE4 = androidx.compose.animation.core.e.e(k0VarL, 0.0f, 1.0f, androidx.compose.animation.core.e.k(new androidx.compose.animation.core.o0(n0Var4)), sVar);
            androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.i1.n(androidx.compose.ui.semantics.q.a(rVar.d(androidx.compose.material3.internal.b.c), true, new androidx.compose.animation.core.n1(26)), a, b);
            boolean zF = sVar.f(h0VarE) | ((((i8 & 896) ^ 384) > 256 && sVar.e(j2)) || (i8 & 384) == 256) | sVar.f(h0VarE2) | ((((i8 & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.e(j)) || (i8 & 48) == 32) | sVar.f(h0VarE3) | sVar.f(h0VarE4);
            Object objQ = sVar.Q();
            if (zF || objQ == androidx.compose.runtime.n.a) {
                i6 = i9;
                f5 = f6;
                i7 = 0;
                Object obj = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.q4
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                        int i10 = i6;
                        float fP = f5;
                        if (i10 != 0 && Float.intBitsToFloat((int) (4294967295L & dVar.d())) <= Float.intBitsToFloat((int) (dVar.d() >> 32))) {
                            fP += dVar.P(fIntBitsToFloat);
                        }
                        float fP2 = fP / dVar.P(Float.intBitsToFloat((int) (dVar.d() >> 32)));
                        androidx.compose.runtime.w2 w2Var = h0VarE;
                        float fFloatValue = ((Number) w2Var.getValue()).floatValue();
                        float f7 = 1.0f - fP2;
                        long j3 = j2;
                        if (fFloatValue < f7) {
                            s4.e(dVar, ((Number) w2Var.getValue()).floatValue() > 0.0f ? ((Number) w2Var.getValue()).floatValue() + fP2 : 0.0f, 1.0f, j3, fIntBitsToFloat, i10);
                        }
                        long j4 = j3;
                        float fFloatValue2 = ((Number) w2Var.getValue()).floatValue();
                        androidx.compose.runtime.w2 w2Var2 = h0VarE2;
                        float fFloatValue3 = fFloatValue2 - ((Number) w2Var2.getValue()).floatValue();
                        long j5 = j;
                        if (fFloatValue3 > 0.0f) {
                            s4.e(dVar, ((Number) w2Var.getValue()).floatValue(), ((Number) w2Var2.getValue()).floatValue(), j5, fIntBitsToFloat, i10);
                        }
                        float fFloatValue4 = ((Number) w2Var2.getValue()).floatValue();
                        androidx.compose.runtime.w2 w2Var3 = h0VarE3;
                        if (fFloatValue4 > fP2) {
                            s4.e(dVar, ((Number) w2Var3.getValue()).floatValue() > 0.0f ? ((Number) w2Var3.getValue()).floatValue() + fP2 : 0.0f, ((Number) w2Var2.getValue()).floatValue() < 1.0f ? ((Number) w2Var2.getValue()).floatValue() - fP2 : 1.0f, j4, fIntBitsToFloat, i10);
                            j4 = j4;
                        }
                        float fFloatValue5 = ((Number) w2Var3.getValue()).floatValue();
                        androidx.compose.runtime.w2 w2Var4 = h0VarE4;
                        if (fFloatValue5 - ((Number) w2Var4.getValue()).floatValue() > 0.0f) {
                            s4.e(dVar, ((Number) w2Var3.getValue()).floatValue(), ((Number) w2Var4.getValue()).floatValue(), j5, fIntBitsToFloat, i10);
                        }
                        if (((Number) w2Var4.getValue()).floatValue() > fP2) {
                            s4.e(dVar, 0.0f, ((Number) w2Var4.getValue()).floatValue() < 1.0f ? ((Number) w2Var4.getValue()).floatValue() - fP2 : 1.0f, j4, fIntBitsToFloat, i10);
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(obj);
                objQ = obj;
            } else {
                i6 = i9;
                f5 = f6;
                i7 = 0;
            }
            androidx.compose.foundation.s.b(rVarN, (kotlin.jvm.functions.l) objQ, sVar, i7);
            i4 = i6;
            f3 = f5;
        } else {
            sVar.W();
            i4 = i;
            f3 = f2;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.r4
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s4.c(rVar, j, j2, i4, f3, (androidx.compose.runtime.s) obj2, androidx.compose.runtime.t.A(i2 | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(androidx.compose.ui.graphics.drawscope.d dVar, float f2, float f3, long j, androidx.compose.ui.graphics.drawscope.h hVar) {
        float f4 = 2;
        float f5 = hVar.a / f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32)) - (f4 * f5);
        dVar.s0(j, f2, f3, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), hVar);
    }

    public static final void e(androidx.compose.ui.graphics.drawscope.d dVar, float f2, float f3, long j, float f4, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
        float f5 = 2;
        float f6 = fIntBitsToFloat2 / f5;
        boolean z = dVar.getLayoutDirection() == androidx.compose.ui.unit.m.e;
        float f7 = (z ? f2 : 1.0f - f3) * fIntBitsToFloat;
        float f8 = (z ? f3 : 1.0f - f2) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            dVar.y(j, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), f4, (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 0);
            return;
        }
        float f9 = f4 / f5;
        float f10 = fIntBitsToFloat - f9;
        if (f7 < f9) {
            f7 = f9;
        }
        if (f7 > f10) {
            f7 = f10;
        }
        if (f8 < f9) {
            f8 = f9;
        }
        if (f8 <= f10) {
            f10 = f8;
        }
        if (Math.abs(f3 - f2) > 0.0f) {
            dVar.y(j, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), f4, (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : i);
        }
    }
}
