package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t5 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final androidx.compose.animation.core.i1 f;

    static {
        float f2 = androidx.compose.material3.tokens.a0.o;
        a = f2;
        b = androidx.compose.material3.tokens.a0.w;
        c = androidx.compose.material3.tokens.a0.u;
        float f3 = androidx.compose.material3.tokens.a0.r;
        d = f3;
        e = (f3 - f2) / 2;
        f = new androidx.compose.animation.core.i1(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, boolean z2, final q5 q5Var, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        boolean z3;
        q5 q5Var2;
        int i4;
        boolean z4;
        final boolean z5;
        final androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s1 s1VarT;
        int i5;
        androidx.compose.ui.r rVarB;
        androidx.compose.ui.r rVar3;
        Object objQ;
        androidx.compose.foundation.interaction.k kVar;
        int i6;
        sVar.c0(-263339167);
        if ((i & 6) == 0) {
            i3 = (sVar.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(lVar) ? 32 : 16;
        }
        int i7 = i3 | 3456;
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i7 |= sVar.g(z3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                q5Var2 = q5Var;
                if (sVar.f(q5Var2)) {
                    i6 = 131072;
                } else {
                    i6 = Parser.ARGC_LIMIT;
                }
                i7 |= i6;
            } else {
                q5Var2 = q5Var;
            }
            i4 = 1572864 | i7;
            if ((599187 & i4) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (sVar.T(i4 & 1, z4)) {
                sVar.Y();
                i5 = i & 1;
                rVarB = androidx.compose.ui.o.b;
                if (i5 != 0 || sVar.C()) {
                    z3 = i8 == 0 ? z3 : true;
                    rVar3 = rVarB;
                } else {
                    sVar.W();
                    rVar3 = rVar;
                }
                sVar.q();
                sVar.b0(1768604058);
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                kVar = (androidx.compose.foundation.interaction.k) objQ;
                sVar.p(false);
                if (lVar != null) {
                    androidx.compose.ui.layout.n nVar = t1.a;
                    rVarB = androidx.compose.foundation.selection.c.b(o2.b, z, kVar, z3, new androidx.compose.ui.semantics.j(2), lVar);
                    kVar = kVar;
                }
                boolean z6 = z3;
                int i9 = i4 << 3;
                int i10 = i4 >> 6;
                b(androidx.compose.foundation.layout.i1.k(androidx.compose.foundation.layout.i1.t(rVar3.d(rVarB)), c, d), z, z6, q5Var2, kVar, d5.a(androidx.compose.material3.tokens.a0.m, sVar), sVar, (i9 & 57344) | (i9 & Token.ASSIGN_MOD) | (i10 & 896) | (i10 & 7168));
                z5 = z6;
                rVar2 = rVar3;
            } else {
                sVar.W();
                z5 = z3;
                rVar2 = rVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.s5
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t5.a(z, lVar, rVar2, z5, q5Var, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 = i3 | 28032;
        z3 = z2;
        if ((196608 & i) == 0) {
            q5Var2 = q5Var;
            if (sVar.f(q5Var2)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i7 |= i6;
        } else {
            q5Var2 = q5Var;
        }
        i4 = 1572864 | i7;
        if ((599187 & i4) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (sVar.T(i4 & 1, z4)) {
            sVar.Y();
            i5 = i & 1;
            rVarB = androidx.compose.ui.o.b;
            if (i5 != 0) {
                z3 = i8 == 0 ? z3 : true;
                rVar3 = rVarB;
            } else {
                z3 = i8 == 0 ? z3 : true;
                rVar3 = rVarB;
            }
            sVar.q();
            sVar.b0(1768604058);
            objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            kVar = (androidx.compose.foundation.interaction.k) objQ;
            sVar.p(false);
            if (lVar != null) {
                androidx.compose.ui.layout.n nVar2 = t1.a;
                rVarB = androidx.compose.foundation.selection.c.b(o2.b, z, kVar, z3, new androidx.compose.ui.semantics.j(2), lVar);
                kVar = kVar;
            }
            boolean z7 = z3;
            int i11 = i4 << 3;
            int i12 = i4 >> 6;
            b(androidx.compose.foundation.layout.i1.k(androidx.compose.foundation.layout.i1.t(rVar3.d(rVarB)), c, d), z, z7, q5Var2, kVar, d5.a(androidx.compose.material3.tokens.a0.m, sVar), sVar, (i11 & 57344) | (i11 & Token.ASSIGN_MOD) | (i12 & 896) | (i12 & 7168));
            z5 = z7;
            rVar2 = rVar3;
        } else {
            sVar.W();
            z5 = z3;
            rVar2 = rVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.s5
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t5.a(z, lVar, rVar2, z5, q5Var, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.r rVar, final boolean z, final boolean z2, final q5 q5Var, final androidx.compose.foundation.interaction.j jVar, final androidx.compose.ui.graphics.n0 n0Var, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        sVar.c0(-670917213);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(q5Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(jVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.f(n0Var) ? 1048576 : 524288;
        }
        if (sVar.T(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? q5Var.b : q5Var.f;
            } else {
                j = z ? q5Var.j : q5Var.n;
            }
            if (z2) {
                j2 = z ? q5Var.a : q5Var.e;
            } else {
                j2 = z ? q5Var.i : q5Var.m;
            }
            androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.a0.t, sVar);
            float f2 = androidx.compose.material3.tokens.a0.s;
            if (z2) {
                j3 = z ? q5Var.c : q5Var.g;
            } else {
                j3 = z ? q5Var.k : q5Var.o;
            }
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVar, f2, j3, n0VarA), j, n0VarA);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarF);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            androidx.compose.ui.r rVarF2 = androidx.compose.foundation.s.f(androidx.compose.foundation.b1.a(androidx.compose.foundation.layout.t.e(androidx.compose.ui.o.b, androidx.compose.ui.c.A).d(new a6(jVar, z, q.r(androidx.compose.material3.tokens.p.y, sVar))), jVar, x4.a(false, androidx.compose.material3.tokens.a0.q / 2, 4)), j2, n0Var);
            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarF2);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD2, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            sVar.b0(1236071411);
            sVar.p(false);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.r5
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t5.b(rVar, z, z2, q5Var, jVar, n0Var, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }
}
