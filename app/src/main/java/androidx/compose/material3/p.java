package androidx.compose.material3;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final androidx.compose.ui.window.d0 a = new androidx.compose.ui.window.d0(14, true);

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, long j, androidx.compose.foundation.c2 c2Var, androidx.compose.ui.window.d0 d0Var, androidx.compose.ui.graphics.n0 n0Var, long j2, float f, float f2, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        long jFloatToRawIntBits;
        int i3;
        int i4;
        boolean z2;
        final androidx.compose.ui.window.d0 d0Var2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j3;
        final float f3;
        final float f4;
        final long j4;
        final androidx.compose.foundation.c2 c2Var2;
        androidx.compose.runtime.s1 s1VarT;
        androidx.compose.foundation.c2 c2Var3;
        androidx.compose.ui.graphics.n0 n0Var3;
        float f5;
        long j5;
        float f6;
        int i5;
        androidx.compose.ui.window.d0 d0Var3;
        Object objQ;
        Object obj;
        androidx.compose.animation.core.p0 p0Var;
        Object objQ2;
        androidx.compose.runtime.a1 a1Var;
        androidx.compose.ui.unit.c cVar;
        boolean zF;
        Object objQ3;
        androidx.compose.ui.window.d0 d0Var4;
        sVar.c0(1725609375);
        int i6 = (sVar.g(z) ? 4 : 2) | i;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                jFloatToRawIntBits = j;
                i6 |= sVar.e(jFloatToRawIntBits) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 = i6 | 910893056;
            i4 = 0;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (sVar.T(i3 & 1, z2)) {
                sVar.Y();
                if ((i & 1) != 0 || sVar.C()) {
                    if (i7 != 0) {
                        float f7 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                    }
                    androidx.compose.foundation.c2 c2VarP = androidx.compose.foundation.s.p(sVar);
                    float f8 = h2.a;
                    androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.o.c, sVar);
                    long jD = u0.d(androidx.compose.material3.tokens.o.a, sVar);
                    c2Var3 = c2VarP;
                    n0Var3 = n0VarA;
                    f5 = h2.a;
                    j5 = jD;
                    f6 = h2.b;
                    i5 = i3 & (-33087489);
                    d0Var3 = a;
                } else {
                    sVar.W();
                    c2Var3 = c2Var;
                    n0Var3 = n0Var;
                    j5 = j2;
                    f5 = f;
                    f6 = f2;
                    i5 = i3 & (-33087489);
                    d0Var3 = d0Var;
                }
                sVar.q();
                objQ = sVar.Q();
                obj = androidx.compose.runtime.n.a;
                if (objQ == obj) {
                    objQ = new androidx.compose.animation.core.p0(Boolean.FALSE);
                    sVar.l0(objQ);
                }
                p0Var = (androidx.compose.animation.core.p0) objQ;
                p0Var.z.setValue(Boolean.valueOf(z));
                if (!((Boolean) p0Var.y.getValue()).booleanValue() || ((Boolean) p0Var.z.getValue()).booleanValue()) {
                    sVar.b0(1165905588);
                    objQ2 = sVar.Q();
                    if (objQ2 == obj) {
                        objQ2 = androidx.compose.runtime.t.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                        sVar.l0(objQ2);
                    }
                    a1Var = (androidx.compose.runtime.a1) objQ2;
                    cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                    zF = sVar.f(cVar) | ((i5 & 7168) == 2048);
                    objQ3 = sVar.Q();
                    if (zF || objQ3 == obj) {
                        objQ3 = new androidx.compose.material3.internal.b0(jFloatToRawIntBits, cVar, new m(a1Var, i4));
                        sVar.l0(objQ3);
                    }
                    androidx.compose.ui.window.d0 d0Var5 = d0Var3;
                    androidx.compose.ui.window.o.a((androidx.compose.material3.internal.b0) objQ3, aVar, d0Var5, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, a1Var, c2Var3, n0Var3, j5, f5, f6, fVar), sVar), sVar, 3504, 0);
                    d0Var4 = d0Var5;
                    sVar.p(false);
                } else {
                    sVar.b0(1166965571);
                    sVar.p(false);
                    d0Var4 = d0Var3;
                }
                j4 = jFloatToRawIntBits;
                d0Var2 = d0Var4;
                c2Var2 = c2Var3;
                n0Var2 = n0Var3;
                j3 = j5;
                f3 = f5;
                f4 = f6;
            } else {
                sVar.W();
                d0Var2 = d0Var;
                n0Var2 = n0Var;
                j3 = j2;
                f3 = f;
                f4 = f2;
                j4 = jFloatToRawIntBits;
                c2Var2 = c2Var;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.n
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = androidx.compose.runtime.t.A(i | 1);
                        p.a(z, aVar, rVar, j4, c2Var2, d0Var2, n0Var2, j3, f3, f4, fVar, (androidx.compose.runtime.s) obj2, iA, i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 3072;
        jFloatToRawIntBits = j;
        i3 = i6 | 910893056;
        i4 = 0;
        if ((306783379 & i3) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sVar.T(i3 & 1, z2)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    float f9 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                }
                androidx.compose.foundation.c2 c2VarP2 = androidx.compose.foundation.s.p(sVar);
                float f10 = h2.a;
                androidx.compose.ui.graphics.n0 n0VarA2 = d5.a(androidx.compose.material3.tokens.o.c, sVar);
                long jD2 = u0.d(androidx.compose.material3.tokens.o.a, sVar);
                c2Var3 = c2VarP2;
                n0Var3 = n0VarA2;
                f5 = h2.a;
                j5 = jD2;
                f6 = h2.b;
                i5 = i3 & (-33087489);
                d0Var3 = a;
            } else {
                if (i7 != 0) {
                    float f11 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                }
                androidx.compose.foundation.c2 c2VarP3 = androidx.compose.foundation.s.p(sVar);
                float f12 = h2.a;
                androidx.compose.ui.graphics.n0 n0VarA3 = d5.a(androidx.compose.material3.tokens.o.c, sVar);
                long jD3 = u0.d(androidx.compose.material3.tokens.o.a, sVar);
                c2Var3 = c2VarP3;
                n0Var3 = n0VarA3;
                f5 = h2.a;
                j5 = jD3;
                f6 = h2.b;
                i5 = i3 & (-33087489);
                d0Var3 = a;
            }
            sVar.q();
            objQ = sVar.Q();
            obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = new androidx.compose.animation.core.p0(Boolean.FALSE);
                sVar.l0(objQ);
            }
            p0Var = (androidx.compose.animation.core.p0) objQ;
            p0Var.z.setValue(Boolean.valueOf(z));
            if (((Boolean) p0Var.y.getValue()).booleanValue()) {
                sVar.b0(1165905588);
                objQ2 = sVar.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.t.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                    sVar.l0(objQ2);
                }
                a1Var = (androidx.compose.runtime.a1) objQ2;
                cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                zF = sVar.f(cVar) | ((i5 & 7168) == 2048);
                objQ3 = sVar.Q();
                if (zF) {
                    objQ3 = new androidx.compose.material3.internal.b0(jFloatToRawIntBits, cVar, new m(a1Var, i4));
                    sVar.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.material3.internal.b0(jFloatToRawIntBits, cVar, new m(a1Var, i4));
                    sVar.l0(objQ3);
                }
                androidx.compose.ui.window.d0 d0Var6 = d0Var3;
                androidx.compose.ui.window.o.a((androidx.compose.material3.internal.b0) objQ3, aVar, d0Var6, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, a1Var, c2Var3, n0Var3, j5, f5, f6, fVar), sVar), sVar, 3504, 0);
                d0Var4 = d0Var6;
                sVar.p(false);
            } else {
                sVar.b0(1165905588);
                objQ2 = sVar.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.t.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                    sVar.l0(objQ2);
                }
                a1Var = (androidx.compose.runtime.a1) objQ2;
                cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                zF = sVar.f(cVar) | ((i5 & 7168) == 2048);
                objQ3 = sVar.Q();
                if (zF) {
                    objQ3 = new androidx.compose.material3.internal.b0(jFloatToRawIntBits, cVar, new m(a1Var, i4));
                    sVar.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.material3.internal.b0(jFloatToRawIntBits, cVar, new m(a1Var, i4));
                    sVar.l0(objQ3);
                }
                androidx.compose.ui.window.d0 d0Var7 = d0Var3;
                androidx.compose.ui.window.o.a((androidx.compose.material3.internal.b0) objQ3, aVar, d0Var7, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, a1Var, c2Var3, n0Var3, j5, f5, f6, fVar), sVar), sVar, 3504, 0);
                d0Var4 = d0Var7;
                sVar.p(false);
            }
            j4 = jFloatToRawIntBits;
            d0Var2 = d0Var4;
            c2Var2 = c2Var3;
            n0Var2 = n0Var3;
            j3 = j5;
            f3 = f5;
            f4 = f6;
        } else {
            sVar.W();
            d0Var2 = d0Var;
            n0Var2 = n0Var;
            j3 = j2;
            f3 = f;
            f4 = f2;
            j4 = jFloatToRawIntBits;
            c2Var2 = c2Var;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.n
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.t.A(i | 1);
                    p.a(z, aVar, rVar, j4, c2Var2, d0Var2, n0Var2, j3, f3, f4, fVar, (androidx.compose.runtime.s) obj2, iA, i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, i2 i2Var, androidx.compose.foundation.layout.z0 z0Var, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.ui.r rVar2;
        boolean z2;
        i2 i2Var2;
        androidx.compose.foundation.layout.z0 z0Var2;
        int i3;
        i2 i2Var3;
        androidx.compose.foundation.layout.z0 z0Var3;
        androidx.compose.ui.r rVar3;
        boolean z3;
        sVar.c0(-532959117);
        if ((i & 48) == 0) {
            i2 = i | (sVar.h(aVar) ? 32 : 16);
        } else {
            i2 = i;
        }
        int i4 = i2 | 113995136;
        if (sVar.T(i4 & 1, (38347923 & i4) != 38347922)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                float f = h2.a;
                t0 t0Var = (t0) sVar.j(u0.a);
                i2 i2Var4 = t0Var.d0;
                if (i2Var4 == null) {
                    i2 i2Var5 = new i2(u0.c(t0Var, androidx.compose.material3.tokens.n.j), u0.c(t0Var, androidx.compose.material3.tokens.n.l), u0.c(t0Var, androidx.compose.material3.tokens.n.q), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.e, u0.c(t0Var, androidx.compose.material3.tokens.n.d)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.g, u0.c(t0Var, androidx.compose.material3.tokens.n.f)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.i, u0.c(t0Var, androidx.compose.material3.tokens.n.h)));
                    t0Var.d0 = i2Var5;
                    i2Var4 = i2Var5;
                }
                i3 = i4 & (-3670017);
                i2Var3 = i2Var4;
                z0Var3 = h2.c;
                rVar3 = androidx.compose.ui.o.b;
                z3 = true;
            } else {
                sVar.W();
                i3 = i4 & (-3670017);
                rVar3 = rVar;
                z3 = z;
                i2Var3 = i2Var;
                z0Var3 = z0Var;
            }
            sVar.q();
            n2.b(fVar, aVar, rVar3, z3, i2Var3, z0Var3, sVar, 268435454 & i3);
            i2Var2 = i2Var3;
            z0Var2 = z0Var3;
            rVar2 = rVar3;
            z2 = z3;
        } else {
            sVar.W();
            rVar2 = rVar;
            z2 = z;
            i2Var2 = i2Var;
            z0Var2 = z0Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new l(fVar, aVar, rVar2, z2, i2Var2, z0Var2, i, 0);
        }
    }
}
