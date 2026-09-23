package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 {
    public static final b4 a = new b4();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static u5 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.s sVar, int i) {
        long j8 = androidx.compose.ui.graphics.t.i;
        long j9 = (i & 8388608) != 0 ? j8 : j6;
        long j10 = (i & 16777216) != 0 ? j8 : j7;
        t0 t0Var = (t0) sVar.j(u0.a);
        u5 u5VarA = t0Var.g0;
        boolean z = false;
        if (u5VarA == null) {
            sVar.b0(390452338);
            sVar.p(false);
            u5VarA = null;
        } else {
            sVar.b0(390452339);
            androidx.compose.foundation.text.selection.i1 i1Var = (androidx.compose.foundation.text.selection.i1) sVar.j(androidx.compose.foundation.text.selection.j1.a);
            if (!kotlin.jvm.internal.l.a(u5VarA.k, i1Var)) {
                u5VarA = u5VarA.a(u5VarA.a, u5VarA.b, u5VarA.c, u5VarA.d, u5VarA.e, u5VarA.f, u5VarA.g, u5VarA.h, u5VarA.i, u5VarA.j, i1Var, u5VarA.l, u5VarA.m, u5VarA.n, u5VarA.o, u5VarA.p, u5VarA.q, u5VarA.r, u5VarA.s, u5VarA.t, u5VarA.u, u5VarA.v, u5VarA.w, u5VarA.x, u5VarA.y, u5VarA.z, u5VarA.A, u5VarA.B, u5VarA.C, u5VarA.D, u5VarA.E, u5VarA.F, u5VarA.G, u5VarA.H, u5VarA.I, u5VarA.J, u5VarA.K, u5VarA.L, u5VarA.M, u5VarA.N, u5VarA.O, u5VarA.P, u5VarA.Q);
                t0Var.g0 = u5VarA;
                z = false;
            }
            sVar.p(z);
        }
        if (u5VarA == null) {
            sVar.b0(-1788321191);
            long jC = u0.c(t0Var, androidx.compose.material3.tokens.t.s);
            long jC2 = u0.c(t0Var, androidx.compose.material3.tokens.t.y);
            androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.t.f;
            long jB = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar));
            long jC3 = u0.c(t0Var, androidx.compose.material3.tokens.t.m);
            long j11 = androidx.compose.ui.graphics.t.h;
            long jC4 = u0.c(t0Var, androidx.compose.material3.tokens.t.d);
            long jC5 = u0.c(t0Var, androidx.compose.material3.tokens.t.l);
            androidx.compose.foundation.text.selection.i1 i1Var2 = (androidx.compose.foundation.text.selection.i1) sVar.j(androidx.compose.foundation.text.selection.j1.a);
            long jC6 = u0.c(t0Var, androidx.compose.material3.tokens.t.v);
            long jC7 = u0.c(t0Var, androidx.compose.material3.tokens.t.E);
            long jB2 = androidx.compose.ui.graphics.t.b(0.12f, u0.c(t0Var, androidx.compose.material3.tokens.t.i));
            long jC8 = u0.c(t0Var, androidx.compose.material3.tokens.t.p);
            long jC9 = u0.c(t0Var, androidx.compose.material3.tokens.t.u);
            long jC10 = u0.c(t0Var, androidx.compose.material3.tokens.t.D);
            long jB3 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.t.h));
            long jC11 = u0.c(t0Var, androidx.compose.material3.tokens.t.o);
            long jC12 = u0.c(t0Var, androidx.compose.material3.tokens.t.x);
            long jC13 = u0.c(t0Var, androidx.compose.material3.tokens.t.G);
            long jB4 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.t.k));
            long jC14 = u0.c(t0Var, androidx.compose.material3.tokens.t.r);
            long jC15 = u0.c(t0Var, androidx.compose.material3.tokens.t.t);
            long jC16 = u0.c(t0Var, androidx.compose.material3.tokens.t.C);
            long jB5 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.t.g));
            long jC17 = u0.c(t0Var, androidx.compose.material3.tokens.t.n);
            androidx.compose.material3.tokens.f fVar2 = androidx.compose.material3.tokens.t.z;
            long jC18 = u0.c(t0Var, fVar2);
            long jC19 = u0.c(t0Var, fVar2);
            long jB6 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar));
            long jC20 = u0.c(t0Var, fVar2);
            long jC21 = u0.c(t0Var, androidx.compose.material3.tokens.t.w);
            long jC22 = u0.c(t0Var, androidx.compose.material3.tokens.t.F);
            long jB7 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.t.j));
            long jC23 = u0.c(t0Var, androidx.compose.material3.tokens.t.q);
            androidx.compose.material3.tokens.f fVar3 = androidx.compose.material3.tokens.t.A;
            long jC24 = u0.c(t0Var, fVar3);
            long jC25 = u0.c(t0Var, fVar3);
            long jB8 = androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar3));
            long jC26 = u0.c(t0Var, fVar3);
            androidx.compose.material3.tokens.f fVar4 = androidx.compose.material3.tokens.t.B;
            u5VarA = new u5(jC, jC2, jB, jC3, j11, j11, j11, j11, jC4, jC5, i1Var2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, u0.c(t0Var, fVar4), u0.c(t0Var, fVar4), androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar4)), u0.c(t0Var, fVar4));
            t0Var.g0 = u5VarA;
            sVar.p(false);
        } else {
            sVar.b0(-1788515437);
            sVar.p(false);
        }
        return u5VarA.a(j, j2, j8, j8, j8, j8, j8, j8, j3, j8, null, j4, j5, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j9, j10, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:106:0x018f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Code duplicated, block: B:98:0x0152  */
    public final void a(final boolean z, final androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.r rVar, final u5 u5Var, final androidx.compose.ui.graphics.n0 n0Var, float f, float f2, androidx.compose.runtime.s sVar, final int i, final int i2) {
        androidx.compose.ui.r rVar2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        boolean z2;
        final androidx.compose.ui.r rVar3;
        final float f5;
        final float f6;
        androidx.compose.runtime.s1 s1VarT;
        androidx.compose.ui.r rVar4;
        float f7;
        boolean zBooleanValue;
        long j;
        androidx.compose.animation.core.k1 k1VarR;
        boolean z3;
        androidx.compose.runtime.w2 w2VarV;
        androidx.compose.animation.core.k1 k1VarR2;
        androidx.compose.runtime.w2 w2VarV2;
        long j2;
        float f8;
        sVar.c0(1035477640);
        int i6 = (sVar.g(z) ? 4 : 2) | i | (sVar.g(false) ? 32 : 16) | (sVar.f(jVar) ? LibretroCore.SCREEN_WIDTH : 128);
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                rVar2 = rVar;
                i6 |= sVar.f(rVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (sVar.f(u5Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            int i8 = i6 | i3;
            if (sVar.f(n0Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i5 = i8 | i4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = sVar.c(f3) ? 1048576 : 524288;
                    i5 |= i9;
                } else {
                    f3 = f;
                }
                i5 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i10 = sVar.c(f4) ? 8388608 : 4194304;
                    i5 |= i10;
                } else {
                    f4 = f2;
                }
                i5 |= i10;
            } else {
                f4 = f2;
            }
            if ((38347923 & i5) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i5 & 1, z2)) {
                sVar.Y();
                if ((i & 1) != 0 || sVar.C()) {
                    if (i7 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f7 = e;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        f4 = d;
                    }
                } else {
                    sVar.W();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    rVar4 = rVar2;
                    f7 = f3;
                }
                sVar.q();
                zBooleanValue = ((Boolean) _COROUTINE.a.B(jVar, sVar, (i5 >> 6) & 14).getValue()).booleanValue();
                float f9 = androidx.compose.material3.internal.a1.a;
                if (!z) {
                    j = u5Var.n;
                } else if (zBooleanValue) {
                    j = u5Var.l;
                } else {
                    j = u5Var.m;
                }
                androidx.compose.material3.tokens.p pVar = androidx.compose.material3.tokens.p.A;
                k1VarR = q.r(pVar, sVar);
                if (z) {
                    sVar.b0(-1674507999);
                    w2VarV = androidx.compose.animation.e1.a(j, k1VarR, sVar);
                    z3 = false;
                    sVar.p(false);
                } else {
                    z3 = false;
                    sVar.b0(-1674427244);
                    w2VarV = androidx.compose.runtime.t.v(new androidx.compose.ui.graphics.t(j), sVar);
                    sVar.p(false);
                }
                k1VarR2 = q.r(androidx.compose.material3.tokens.p.y, sVar);
                if (z) {
                    sVar.b0(-1674245832);
                    if (zBooleanValue) {
                        f8 = f7;
                    } else {
                        f8 = f4;
                    }
                    w2VarV2 = androidx.compose.animation.core.h.a(f8, k1VarR2, sVar);
                    sVar.p(z3);
                } else {
                    sVar.b0(-1674063769);
                    w2VarV2 = androidx.compose.runtime.t.v(new androidx.compose.ui.unit.f(f4), sVar);
                    sVar.p(z3);
                }
                androidx.compose.runtime.a1 a1VarV = androidx.compose.runtime.t.v(androidx.compose.foundation.s.a(((androidx.compose.ui.unit.f) w2VarV2.getValue()).e, ((androidx.compose.ui.graphics.t) w2VarV.getValue()).a), sVar);
                if (!z) {
                    j2 = u5Var.g;
                } else if (zBooleanValue) {
                    j2 = u5Var.e;
                } else {
                    j2 = u5Var.f;
                }
                androidx.compose.runtime.w2 w2VarA = androidx.compose.animation.e1.a(j2, q.r(pVar, sVar), sVar);
                androidx.compose.foundation.a0 a0Var = (androidx.compose.foundation.a0) a1VarV.getValue();
                androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.d(rVar4.d(new androidx.compose.foundation.z(a0Var.a, a0Var.b, n0Var)), new androidx.compose.material3.internal.r0(1, n0Var, new v5(new androidx.compose.foundation.lazy.n(0, 2, androidx.compose.runtime.w2.class, w2VarA, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;")))), sVar, 0);
                rVar3 = rVar4;
                f5 = f7;
            } else {
                sVar.W();
                rVar3 = rVar2;
                f5 = f3;
            }
            f6 = f4;
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.z3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.e.a(z, jVar, rVar3, u5Var, n0Var, f5, f6, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 3072;
        rVar2 = rVar;
        if (sVar.f(u5Var)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i11 = i6 | i3;
        if (sVar.f(n0Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        i5 = i11 | i4;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (sVar.c(f3)) {
                }
                i5 |= i9;
            } else {
                f3 = f;
            }
            i5 |= i9;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (sVar.c(f4)) {
                }
                i5 |= i10;
            } else {
                f4 = f2;
            }
            i5 |= i10;
        } else {
            f4 = f2;
        }
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sVar.T(i5 & 1, z2)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = e;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = d;
                }
            } else {
                if (i7 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = e;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = d;
                }
            }
            sVar.q();
            zBooleanValue = ((Boolean) _COROUTINE.a.B(jVar, sVar, (i5 >> 6) & 14).getValue()).booleanValue();
            float f10 = androidx.compose.material3.internal.a1.a;
            if (!z) {
                j = u5Var.n;
            } else if (zBooleanValue) {
                j = u5Var.l;
            } else {
                j = u5Var.m;
            }
            androidx.compose.material3.tokens.p pVar2 = androidx.compose.material3.tokens.p.A;
            k1VarR = q.r(pVar2, sVar);
            if (z) {
                sVar.b0(-1674507999);
                w2VarV = androidx.compose.animation.e1.a(j, k1VarR, sVar);
                z3 = false;
                sVar.p(false);
            } else {
                z3 = false;
                sVar.b0(-1674427244);
                w2VarV = androidx.compose.runtime.t.v(new androidx.compose.ui.graphics.t(j), sVar);
                sVar.p(false);
            }
            k1VarR2 = q.r(androidx.compose.material3.tokens.p.y, sVar);
            if (z) {
                sVar.b0(-1674245832);
                if (zBooleanValue) {
                    f8 = f7;
                } else {
                    f8 = f4;
                }
                w2VarV2 = androidx.compose.animation.core.h.a(f8, k1VarR2, sVar);
                sVar.p(z3);
            } else {
                sVar.b0(-1674063769);
                w2VarV2 = androidx.compose.runtime.t.v(new androidx.compose.ui.unit.f(f4), sVar);
                sVar.p(z3);
            }
            androidx.compose.runtime.a1 a1VarV2 = androidx.compose.runtime.t.v(androidx.compose.foundation.s.a(((androidx.compose.ui.unit.f) w2VarV2.getValue()).e, ((androidx.compose.ui.graphics.t) w2VarV.getValue()).a), sVar);
            if (!z) {
                j2 = u5Var.g;
            } else if (zBooleanValue) {
                j2 = u5Var.e;
            } else {
                j2 = u5Var.f;
            }
            androidx.compose.runtime.w2 w2VarA2 = androidx.compose.animation.e1.a(j2, q.r(pVar2, sVar), sVar);
            androidx.compose.foundation.a0 a0Var2 = (androidx.compose.foundation.a0) a1VarV2.getValue();
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.d(rVar4.d(new androidx.compose.foundation.z(a0Var2.a, a0Var2.b, n0Var)), new androidx.compose.material3.internal.r0(1, n0Var, new v5(new androidx.compose.foundation.lazy.n(0, 2, androidx.compose.runtime.w2.class, w2VarA2, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;")))), sVar, 0);
            rVar3 = rVar4;
            f5 = f7;
        } else {
            sVar.W();
            rVar3 = rVar2;
            f5 = f3;
        }
        f6 = f4;
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.z3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.a(z, jVar, rVar3, u5Var, n0Var, f5, f6, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public final void b(final String str, final kotlin.jvm.functions.p pVar, final boolean z, final boolean z2, final androidx.compose.ui.text.input.g0 g0Var, final androidx.compose.foundation.interaction.j jVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final kotlin.jvm.functions.p pVar4, final kotlin.jvm.functions.p pVar5, final u5 u5Var, androidx.compose.foundation.layout.z0 z0Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        kotlin.jvm.functions.p pVar6;
        boolean z3;
        final androidx.compose.foundation.layout.z0 z0Var2;
        androidx.compose.foundation.layout.z0 z0Var3;
        int i3;
        androidx.compose.runtime.internal.f fVar2;
        sVar.c0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pVar6 = pVar;
            i2 |= sVar.h(pVar6) ? 32 : 16;
        } else {
            pVar6 = pVar;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= sVar.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(g0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(jVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= sVar.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= sVar.h(pVar2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= sVar.h(pVar3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= sVar.h(pVar4) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (sVar.h(pVar5) ? 4 : 2) | (sVar.h(null) ? 32 : 16) | (sVar.h(null) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(null) ? 2048 : 1024) | (sVar.f(u5Var) ? 16384 : 8192) | Parser.ARGC_LIMIT;
        if (sVar.T(i2 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                float f = androidx.compose.material3.internal.a1.a;
                z0Var3 = new androidx.compose.foundation.layout.z0(f, f, f, f);
                i3 = i4 & (-458753);
            } else {
                sVar.W();
                i3 = i4 & (-458753);
                z0Var3 = z0Var;
            }
            sVar.q();
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objQ = sVar.Q();
            if (z4 || objQ == androidx.compose.runtime.n.a) {
                objQ = g0Var.b(new androidx.compose.ui.text.g(str));
                sVar.l0(objQ);
            }
            String str2 = ((androidx.compose.ui.text.input.e0) objQ).a.y;
            x5 x5Var = new x5();
            if (pVar2 == null) {
                sVar.b0(1927058812);
                sVar.p(false);
                fVar2 = null;
            } else {
                sVar.b0(1927058813);
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1459717586, new androidx.compose.foundation.text.contextmenu.internal.m(pVar2, 2), sVar);
                sVar.p(false);
                fVar2 = fVarC;
            }
            int i5 = i2 >> 9;
            int i6 = i3 << 21;
            androidx.compose.foundation.layout.z0 z0Var4 = z0Var3;
            androidx.compose.material3.internal.a1.a(str2, pVar6, x5Var, fVar2, pVar3, pVar4, pVar5, z3, z, jVar, z0Var4, u5Var, fVar, sVar, ((i2 << 3) & 896) | 6 | (i5 & 458752) | (i5 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), (i2 & 896) | ((i3 >> 9) & 14) | ((i2 >> 6) & Token.ASSIGN_MOD) | (i5 & 7168) | ((i2 >> 3) & 57344) | ((i3 << 6) & 3670016) | 12582912);
            z0Var2 = z0Var4;
        } else {
            sVar.W();
            z0Var2 = z0Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.a4
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(i | 1);
                    this.e.b(str, pVar, z, z2, g0Var, jVar, pVar2, pVar3, pVar4, pVar5, u5Var, z0Var2, fVar, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
