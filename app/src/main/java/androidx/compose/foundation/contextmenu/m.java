package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.text.n0;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.ui.draw.p;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.window.o;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.q;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final d a;

    static {
        d0 d0Var = o.a;
        long j = t.d;
        long j2 = t.b;
        a = new d(j, j2, j2, t.b(0.38f, j2), t.b(0.38f, j2));
    }

    public static final void a(d dVar, r rVar, androidx.compose.runtime.internal.f fVar, s sVar, int i) {
        int i2;
        sVar.c0(-527864079);
        if ((i & 6) == 0) {
            i2 = (sVar.f(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            float f = h.d;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(h.e);
            float f2 = 0;
            boolean z = androidx.compose.ui.unit.f.a(f, f2) > 0;
            long j = b0.a;
            r rVarQ = androidx.compose.foundation.s.q(androidx.compose.foundation.layout.b.s(androidx.compose.foundation.layout.b.x(androidx.compose.foundation.s.f((androidx.compose.ui.unit.f.a(f, f2) > 0 || z) ? rVar.d(new p(dVarA, z, j, j)) : rVar, dVar.a, a0.b)), 0.0f, h.i, 1), androidx.compose.foundation.s.p(sVar), true);
            int i3 = (i2 << 3) & 7168;
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            fVar.invoke(x.a, sVar, Integer.valueOf(((i3 >> 6) & Token.ASSIGN_MOD) | 6));
            sVar.p(true);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(dVar, rVar, fVar, i);
        }
    }

    public static final void b(r rVar, d dVar, kotlin.jvm.functions.l lVar, s sVar, int i, int i2) {
        int i3;
        int i4;
        sVar.c0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (sVar.f(dVar) ? 32 : 16);
        }
        int i7 = i4 | (sVar.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
            if (i5 != 0) {
                rVar = androidx.compose.ui.o.b;
            }
            if (i6 != 0) {
                dVar = a;
            }
            a(dVar, rVar, androidx.compose.runtime.internal.k.c(-250345048, new i(0, lVar, dVar), sVar), sVar, ((i7 << 3) & Token.ASSIGN_MOD) | ((i7 >> 3) & 14) | 384);
        } else {
            sVar.W();
        }
        r rVar2 = rVar;
        d dVar2 = dVar;
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar2, dVar2, lVar, i, i2);
        }
    }

    public static final void c(String str, boolean z, d dVar, r rVar, q qVar, kotlin.jvm.functions.a aVar, s sVar, int i) {
        int i2;
        sVar.c0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(dVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(qVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (sVar.T(i2 & 1, (74899 & i2) != 74898)) {
            androidx.compose.ui.i iVar = h.f;
            androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
            float f = h.h;
            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f);
            boolean z2 = ((i2 & Token.ASSIGN_MOD) == 32) | ((458752 & i2) == 131072);
            Object objQ = sVar.Q();
            if (z2 || objQ == n.a) {
                objQ = new k(z, aVar, 0);
                sVar.l0(objQ);
            }
            r rVarE = i1.e(androidx.compose.foundation.s.k(rVar, z, str, (kotlin.jvm.functions.a) objQ, 12), 1.0f);
            float f2 = h.a;
            float f3 = h.b;
            float f4 = h.c;
            r rVarS = androidx.compose.foundation.layout.b.s(i1.o(rVarE, f2, f4, f3, f4), f, 0.0f, 2);
            f1 f1VarA = d1.a(fVarG, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            r rVarC = androidx.compose.ui.a.c(sVar, rVarS);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            if (qVar == null) {
                sVar.b0(-1597947094);
                sVar.p(false);
            } else {
                sVar.b0(-1597947093);
                float f5 = h.j;
                r rVarL = i1.l(androidx.compose.ui.o.b, f5, 0.0f, f5, f5, 2);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                r rVarC2 = androidx.compose.ui.a.c(sVar, rVarL);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar);
                } else {
                    sVar.o0();
                }
                androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
                androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar2);
                androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
                qVar.invoke(new t(z ? dVar.c : dVar.e), sVar, 0);
                sVar.p(true);
                sVar.p(false);
            }
            m0 m0Var = new m0(z ? dVar.b : dVar.d, h.m, h.n, h.p, h.g, h.o, 16613240);
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            n0.a(str, new t0(1.0f, true), m0Var, 0, false, 1, 0, sVar, (i2 & 14) | 1572864, 952);
            sVar.p(true);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new l(str, z, dVar, rVar, qVar, aVar, i);
        }
    }
}
