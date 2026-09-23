package com.app.mlounge.ui.screens.services;

import android.content.Context;
import androidx.compose.foundation.a0;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.b4;
import androidx.compose.material3.h4;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q;
import androidx.compose.material3.s4;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.u5;
import androidx.compose.material3.w;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.r;
import androidx.compose.ui.text.input.f0;
import androidx.compose.ui.text.input.g0;
import androidx.lifecycle.y0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.v;
import com.app.mlounge.ui.components.x;
import com.app.mlounge.ui.viewmodel.c1;
import com.app.mlounge.ui.viewmodel.d1;
import com.app.mlounge.ui.viewmodel.p0;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y1;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(List list, s sVar, int i) {
        s sVar2;
        sVar.c0(1391151646);
        int i2 = (sVar.h(list) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            sVar2 = sVar;
            p5.a(i1.e(o.b, 1.0f), androidx.compose.foundation.shape.e.a(8), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2039517945, new k(list, 0, (byte) 0), sVar), sVar2, 12583302, 120);
        } else {
            sVar2 = sVar;
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new k(i, list);
        }
    }

    public static final void b(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, s sVar, int i) {
        sVar.c0(1388535569);
        int i2 = i | (sVar.f(dVar) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-68267946, new i(dVar, aVar3, aVar2, aVar), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new i(dVar, aVar, aVar2, aVar3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, boolean z, kotlin.jvm.functions.l lVar, s sVar, int i) {
        final boolean z2;
        kotlin.jvm.functions.l lVar2;
        a1 a1Var;
        int i2;
        a1 a1Var2;
        sVar.c0(-1619227453);
        int i3 = i | (sVar.g(z) ? 32 : 16) | (sVar.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = t.r("");
                sVar.l0(objQ);
            }
            a1 a1Var3 = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            a1 a1Var4 = (a1) objQ2;
            l2 l2Var = (l2) sVar.j(l1.p);
            Object objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            androidx.compose.ui.focus.l lVar3 = (androidx.compose.ui.focus.l) sVar.j(l1.i);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) a1Var4.getValue()).booleanValue());
            boolean zF = sVar.f(l2Var);
            Object objQ4 = sVar.Q();
            int i4 = 3;
            kotlin.coroutines.d dVar = null;
            if (zF || objQ4 == obj) {
                objQ4 = new v(l2Var, a1Var4, null, 3);
                sVar.l0(objQ4);
            }
            l0.c(sVar, boolValueOf, (p) objQ4);
            Object objQ5 = sVar.Q();
            if (objQ5 == obj) {
                objQ5 = new x(kVar, a1Var4, dVar, i4);
                sVar.l0(objQ5);
            }
            l0.c(sVar, kVar, (p) objQ5);
            String str2 = (String) a1Var3.getValue();
            boolean z3 = !((Boolean) a1Var4.getValue()).booleanValue();
            boolean z4 = !z;
            b4 b4Var = b4.a;
            long j = com.app.mlounge.ui.theme.b.f;
            long j2 = com.app.mlounge.ui.theme.b.e;
            long j3 = com.app.mlounge.ui.theme.b.l;
            u5 u5VarC = b4.c(j3, j3, j, j, j2, 0L, 0L, sVar, 2147477244);
            o oVar = o.b;
            r rVarE = i1.e(oVar, 1.0f);
            boolean zF2 = sVar.f(l2Var) | sVar.h(lVar3);
            Object objQ6 = sVar.Q();
            if (zF2 || objQ6 == obj) {
                a1Var = a1Var4;
                i2 = 1;
                objQ6 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar3, a1Var, i2);
                sVar.l0(objQ6);
            } else {
                a1Var = a1Var4;
                i2 = 1;
            }
            r rVarE2 = androidx.compose.ui.input.key.c.e(rVarE, (kotlin.jvm.functions.l) objQ6);
            Object objQ7 = sVar.Q();
            if (objQ7 == obj) {
                objQ7 = new m2(a1Var, 13);
                sVar.l0(objQ7);
            }
            r rVarT = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ7);
            Object objQ8 = sVar.Q();
            if (objQ8 == obj) {
                a1Var2 = a1Var3;
                objQ8 = new m2(a1Var2, 14);
                sVar.l0(objQ8);
            } else {
                a1Var2 = a1Var3;
            }
            a1 a1Var5 = a1Var2;
            int i5 = i2;
            h4.a(str2, (kotlin.jvm.functions.l) objQ8, rVarT, z4, z3, null, androidx.compose.runtime.internal.k.c(571472477, new com.app.mlounge.ui.components.r(str, 9), sVar), null, null, null, null, null, null, true, 0, 0, kVar, null, u5VarC, sVar, 1572912, 12582912, 6, 3014560);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 8));
            Object objQ9 = sVar.Q();
            if (objQ9 == obj) {
                objQ9 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ9;
            a1 a1VarB = _COROUTINE.a.B(kVar2, sVar, 6);
            boolean z5 = (kotlin.text.k.J((String) a1Var5.getValue()) || z) ? 0 : i5;
            z0 z0Var = androidx.compose.material3.x.a;
            w wVarA = androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, j3, sVar);
            a0 a0VarA = androidx.compose.foundation.s.a(2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : j2);
            r rVarE3 = i1.e(oVar, 1.0f);
            if ((i3 & 896) != 256) {
                i5 = 0;
            }
            Object objQ10 = sVar.Q();
            if (i5 != 0 || objQ10 == obj) {
                lVar2 = lVar;
                objQ10 = new l(lVar2, a1Var5, 0);
                sVar.l0(objQ10);
            } else {
                lVar2 = lVar;
            }
            z2 = z;
            q.h((kotlin.jvm.functions.a) objQ10, rVarE3, z5, null, wVarA, a0VarA, null, kVar2, androidx.compose.runtime.internal.k.c(-245442123, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.services.m
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    s sVar2 = (s) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((g1) obj2).getClass();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z6 = z2;
                        if (z6) {
                            sVar2.b0(-1931916693);
                            long j4 = com.app.mlounge.ui.theme.b.f;
                            o oVar2 = o.b;
                            s4.a(i1.m(oVar2, 18), j4, 2, 0L, 0, 0.0f, sVar2, 438, 56);
                            androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar2, 8));
                            sVar2.p(false);
                        } else {
                            sVar2.b0(-1931699507);
                            sVar2.p(false);
                        }
                        z5.b(z6 ? "Validating..." : "Sign In", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 262142);
                    } else {
                        sVar2.W();
                    }
                    return y.a;
                }
            }, sVar), sVar, 905969712);
        } else {
            z2 = z;
            lVar2 = lVar;
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.movies.c(str, z2, lVar2, i);
        }
    }

    public static final void d(String str, s sVar, int i) {
        sVar.c0(-259678260);
        if (sVar.T(i & 1, (i & 3) != 2)) {
            Context context = (Context) sVar.j(m0.b);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            r rVarG = androidx.compose.foundation.s.g(o.b, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(4));
            boolean zH = sVar.h(context);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new androidx.datastore.migrations.a(str, context);
                sVar.l0(objQ2);
            }
            q.i((kotlin.jvm.functions.a) objQ2, rVarG, false, null, null, null, kVar, a.g, sVar, 905969664, 252);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.r(str, i, 10);
        }
    }

    public static final void e(String str, String str2, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(1585337812);
        int i2 = i | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Context context = (Context) sVar.j(m0.b);
            p5.a(i1.e(o.b, 1.0f), androidx.compose.foundation.shape.e.a(8), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-501006865, new androidx.compose.foundation.text.contextmenu.internal.q(str, str2, (h1) sVar.j(l1.e), context, aVar, 4), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b2(str, str2, aVar, i, 13);
        }
    }

    public static final void f(com.app.mlounge.ui.viewmodel.p pVar, p pVar2, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(-329539759);
        int i2 = (sVar.f(pVar) ? 4 : 2) | i | (sVar.h(pVar2) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(563777558, new g(pVar, aVar, pVar2), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new g(pVar, pVar2, aVar, i);
        }
    }

    public static final void g(kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(-1214769174);
        int i2 = (sVar.h(aVar) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            q.i(aVar, androidx.compose.foundation.s.g(o.b, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(4)), false, null, null, null, kVar, a.f, sVar, (i2 & 14) | 905969664, 252);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.h(aVar, i, 2);
        }
    }

    public static final void h(com.app.mlounge.ui.viewmodel.m0 m0Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(1607067600);
        int i2 = (sVar.f(m0Var) ? 4 : 2) | i | (sVar.h(lVar) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(115928597, new j(m0Var, aVar, lVar), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(m0Var, lVar, aVar, i);
        }
    }

    public static final void i(p0 p0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, s sVar, int i) {
        sVar.c0(-1694104325);
        int i2 = i | (sVar.f(p0Var) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1522943744, new e(p0Var, aVar3, aVar2, aVar), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new e(p0Var, aVar, aVar2, aVar3, i);
        }
    }

    public static final void j(com.app.mlounge.ui.viewmodel.h1 h1Var, s sVar, int i) {
        final com.app.mlounge.ui.viewmodel.h1 h1Var2;
        com.app.mlounge.ui.viewmodel.h1 h1Var3;
        s sVar2 = sVar;
        sVar2.c0(-1256430746);
        int i2 = i | 2;
        if (sVar2.T(i2 & 1, (i2 & 3) != 2)) {
            sVar2.Y();
            if ((i & 1) == 0 || sVar2.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                h1Var3 = (com.app.mlounge.ui.viewmodel.h1) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(com.app.mlounge.ui.viewmodel.h1.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
            } else {
                sVar2.W();
                h1Var3 = h1Var;
            }
            sVar2.q();
            a1 a1VarG = t.g(h1Var3.j, sVar2);
            a1 a1VarG2 = t.g(h1Var3.l, sVar2);
            a1 a1VarG3 = t.g(h1Var3.n, sVar2);
            a1 a1VarG4 = t.g(h1Var3.p, sVar2);
            a1 a1VarG5 = t.g(h1Var3.r, sVar2);
            a1 a1VarG6 = t.g(h1Var3.t, sVar2);
            r rVarQ = androidx.compose.foundation.s.q(i1.c, androidx.compose.foundation.s.p(sVar2), true);
            androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
            t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            t.t(sVar2, androidx.compose.ui.node.g.h);
            t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(n6.a)).e;
            long j = ((t0) sVar2.j(u0.a)).o;
            float f = 16;
            o oVar = o.b;
            r rVarU = androidx.compose.foundation.layout.b.u(oVar, f, f, 0.0f, f, 4);
            com.app.mlounge.ui.viewmodel.h1 h1Var4 = h1Var3;
            z5.b("Services", rVarU, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 54, 0, 131064);
            sVar2 = sVar;
            com.app.mlounge.ui.viewmodel.m0 m0Var2 = (com.app.mlounge.ui.viewmodel.m0) a1VarG.getValue();
            h1Var2 = h1Var4;
            boolean zH = sVar2.h(h1Var2);
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (zH || objQ == fVar2) {
                final int i3 = 0;
                objQ = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.services.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        switch (i3) {
                            case 0:
                                str.getClass();
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new d1(0, h1Var5, str, null), 3, null);
                                break;
                            default:
                                str.getClass();
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var6), null, null, new d1(1, h1Var6, str, null), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ);
            }
            kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
            boolean zH2 = sVar2.h(h1Var2);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == fVar2) {
                final int i4 = 10;
                objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ2);
            }
            h(m0Var2, lVar, (kotlin.jvm.functions.a) objQ2, sVar2, 0);
            x1 x1Var = (x1) a1VarG2.getValue();
            boolean zH3 = sVar2.h(h1Var2);
            Object objQ3 = sVar2.Q();
            if (zH3 || objQ3 == fVar2) {
                final int i5 = 1;
                objQ3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.services.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        switch (i5) {
                            case 0:
                                str.getClass();
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new d1(0, h1Var5, str, null), 3, null);
                                break;
                            default:
                                str.getClass();
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var6), null, null, new d1(1, h1Var6, str, null), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ3);
            }
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ3;
            boolean zH4 = sVar2.h(h1Var2);
            Object objQ4 = sVar2.Q();
            if (zH4 || objQ4 == fVar2) {
                final int i6 = 11;
                objQ4 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ4);
            }
            m(x1Var, lVar2, (kotlin.jvm.functions.a) objQ4, sVar2, 0);
            com.app.mlounge.ui.viewmodel.d dVar = (com.app.mlounge.ui.viewmodel.d) a1VarG3.getValue();
            boolean zH5 = sVar2.h(h1Var2);
            Object objQ5 = sVar2.Q();
            if (zH5 || objQ5 == fVar2) {
                final int i7 = 0;
                objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ5);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ5;
            boolean zH6 = sVar2.h(h1Var2);
            Object objQ6 = sVar2.Q();
            if (zH6 || objQ6 == fVar2) {
                final int i8 = 1;
                objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ6);
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ6;
            boolean zH7 = sVar2.h(h1Var2);
            Object objQ7 = sVar2.Q();
            if (zH7 || objQ7 == fVar2) {
                final int i9 = 2;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ7);
            }
            b(dVar, aVar, aVar2, (kotlin.jvm.functions.a) objQ7, sVar2, 0);
            p0 p0Var = (p0) a1VarG4.getValue();
            boolean zH8 = sVar2.h(h1Var2);
            Object objQ8 = sVar2.Q();
            if (zH8 || objQ8 == fVar2) {
                final int i10 = 3;
                objQ8 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ8);
            }
            kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) objQ8;
            boolean zH9 = sVar2.h(h1Var2);
            Object objQ9 = sVar2.Q();
            if (zH9 || objQ9 == fVar2) {
                final int i11 = 4;
                objQ9 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ9);
            }
            kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ9;
            boolean zH10 = sVar2.h(h1Var2);
            Object objQ10 = sVar2.Q();
            if (zH10 || objQ10 == fVar2) {
                final int i12 = 5;
                objQ10 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ10);
            }
            i(p0Var, aVar3, aVar4, (kotlin.jvm.functions.a) objQ10, sVar2, 0);
            com.app.mlounge.ui.viewmodel.p pVar = (com.app.mlounge.ui.viewmodel.p) a1VarG5.getValue();
            boolean zH11 = sVar2.h(h1Var2);
            Object objQ11 = sVar2.Q();
            if (zH11 || objQ11 == fVar2) {
                objQ11 = new f(h1Var2);
                sVar2.l0(objQ11);
            }
            p pVar2 = (p) objQ11;
            boolean zH12 = sVar2.h(h1Var2);
            Object objQ12 = sVar2.Q();
            if (zH12 || objQ12 == fVar2) {
                final int i13 = 6;
                objQ12 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ12);
            }
            f(pVar, pVar2, (kotlin.jvm.functions.a) objQ12, sVar2, 0);
            y1 y1Var = (y1) a1VarG6.getValue();
            boolean zH13 = sVar2.h(h1Var2);
            Object objQ13 = sVar2.Q();
            if (zH13 || objQ13 == fVar2) {
                final int i14 = 7;
                objQ13 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ13);
            }
            kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) objQ13;
            boolean zH14 = sVar2.h(h1Var2);
            Object objQ14 = sVar2.Q();
            if (zH14 || objQ14 == fVar2) {
                final int i15 = 8;
                objQ14 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ14);
            }
            kotlin.jvm.functions.a aVar6 = (kotlin.jvm.functions.a) objQ14;
            boolean zH15 = sVar2.h(h1Var2);
            Object objQ15 = sVar2.Q();
            if (zH15 || objQ15 == fVar2) {
                final int i16 = 9;
                objQ15 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                com.app.mlounge.ui.viewmodel.h1 h1Var5 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var5), null, null, new c1(h1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                com.app.mlounge.ui.viewmodel.h1 h1Var6 = h1Var2;
                                Job job = h1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                com.app.mlounge.ui.viewmodel.h1 h1Var7 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var7), null, null, new c1(h1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                com.app.mlounge.ui.viewmodel.h1 h1Var8 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var8), null, null, new c1(h1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                com.app.mlounge.ui.viewmodel.h1 h1Var9 = h1Var2;
                                Job job2 = h1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var9.o.setValue(new p0(null, 63));
                                break;
                            case 5:
                                com.app.mlounge.ui.viewmodel.h1 h1Var10 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var10), null, null, new c1(h1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                com.app.mlounge.ui.viewmodel.h1 h1Var11 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var11), null, null, new c1(h1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                com.app.mlounge.ui.viewmodel.h1 h1Var12 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var12), null, null, new c1(h1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                com.app.mlounge.ui.viewmodel.h1 h1Var13 = h1Var2;
                                Job job3 = h1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                h1Var13.s.setValue(new y1(null, 63));
                                break;
                            case 9:
                                com.app.mlounge.ui.viewmodel.h1 h1Var14 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new c1(h1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                com.app.mlounge.ui.viewmodel.h1 h1Var15 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new c1(h1Var15, null, 8), 3, null);
                                break;
                            default:
                                com.app.mlounge.ui.viewmodel.h1 h1Var16 = h1Var2;
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var16), null, null, new c1(h1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar2.l0(objQ15);
            }
            n(y1Var, aVar5, aVar6, (kotlin.jvm.functions.a) objQ15, sVar2, 0);
            androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 32));
            sVar2.p(true);
        } else {
            sVar2.W();
            h1Var2 = h1Var;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new f(h1Var2, i);
        }
    }

    public static final void k(String str, boolean z, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(1064397775);
        int i2 = i | (sVar.g(z) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            boolean z2 = !z;
            z0 z0Var = androidx.compose.material3.x.a;
            q.h(aVar, i1.e(o.b, 1.0f), z2, null, androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, com.app.mlounge.ui.theme.b.l, sVar), androidx.compose.foundation.s.a(2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : com.app.mlounge.ui.theme.b.e), null, kVar, androidx.compose.runtime.internal.k.c(142923329, new androidx.compose.foundation.text.selection.h(str, z), sVar), sVar, ((i2 >> 6) & 14) | 905969712);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.adult.d(str, z, aVar, i, 1);
        }
    }

    public static final void l(boolean z, s sVar, int i) {
        sVar.c0(-484093933);
        int i2 = (sVar.g(z) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            p5.a(null, androidx.compose.foundation.shape.e.a(4), z ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.h) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(930037358, new com.app.mlounge.ui.components.o(z, 3, (byte) 0), sVar), sVar, 12582912, Token.DOT);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.o(i, z);
        }
    }

    public static final void m(x1 x1Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(-1198567248);
        int i2 = (sVar.f(x1Var) ? 4 : 2) | i | (sVar.h(lVar) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1450742795, new d(x1Var, aVar, lVar), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new d(x1Var, lVar, aVar, i);
        }
    }

    public static final void n(y1 y1Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, s sVar, int i) {
        sVar.c0(-2015935533);
        int i2 = i | (sVar.f(y1Var) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            p5.a(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(787892760, new h(y1Var, aVar3, aVar2, aVar), sVar), sVar, 12583302, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new h(y1Var, aVar, aVar2, aVar3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0373  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0241  */
    /* JADX WARN: Code duplicated, block: B:67:0x0246  */
    /* JADX WARN: Code duplicated, block: B:70:0x027c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0281  */
    /* JADX WARN: Code duplicated, block: B:74:0x0284  */
    /* JADX WARN: Code duplicated, block: B:78:0x029d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x030c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0324  */
    /* JADX WARN: Code duplicated, block: B:91:0x0333  */
    /* JADX WARN: Code duplicated, block: B:94:0x034d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0350  */
    /* JADX WARN: Code duplicated, block: B:98:0x0362  */
    /* JADX WARN: Code duplicated, block: B:99:0x0365  */
    public static final void o(p pVar, s sVar, int i) {
        p pVar2;
        Object obj;
        a1 a1Var;
        int i2;
        Object objQ;
        Object objQ2;
        a1 a1Var2;
        Object obj2;
        a1 a1Var3;
        g0 rVar;
        boolean zF;
        Object objQ3;
        Object obj3;
        a1 a1Var4;
        Object objQ4;
        Object objQ5;
        a1 a1Var5;
        a1 a1Var6;
        Object obj4;
        Object objQ6;
        a1 a1VarB;
        boolean z;
        long j;
        boolean z2;
        Object objQ7;
        sVar.c0(1041540505);
        int i3 = i | (sVar.g(false) ? 4 : 2) | (sVar.h(pVar) ? 32 : 16);
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ8 = sVar.Q();
            Object obj5 = androidx.compose.runtime.n.a;
            if (objQ8 == obj5) {
                objQ8 = t.r("");
                sVar.l0(objQ8);
            }
            a1 a1Var7 = (a1) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == obj5) {
                objQ9 = t.r("");
                sVar.l0(objQ9);
            }
            a1 a1Var8 = (a1) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == obj5) {
                objQ10 = t.r(Boolean.FALSE);
                sVar.l0(objQ10);
            }
            a1 a1Var9 = (a1) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == obj5) {
                objQ11 = t.r(Boolean.FALSE);
                sVar.l0(objQ11);
            }
            a1 a1Var10 = (a1) objQ11;
            l2 l2Var = (l2) sVar.j(l1.p);
            androidx.compose.ui.focus.l lVar = (androidx.compose.ui.focus.l) sVar.j(l1.i);
            Object objQ12 = sVar.Q();
            if (objQ12 == obj5) {
                objQ12 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ12;
            Object objQ13 = sVar.Q();
            if (objQ13 == obj5) {
                objQ13 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ13;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) a1Var9.getValue()).booleanValue());
            boolean zF2 = sVar.f(l2Var);
            Object objQ14 = sVar.Q();
            kotlin.coroutines.d dVar = null;
            if (zF2 || objQ14 == obj5) {
                objQ14 = new v(l2Var, a1Var9, null, 4);
                sVar.l0(objQ14);
            }
            l0.c(sVar, boolValueOf, (p) objQ14);
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) a1Var10.getValue()).booleanValue());
            boolean zF3 = sVar.f(l2Var);
            Object objQ15 = sVar.Q();
            int i4 = 5;
            if (zF3 || objQ15 == obj5) {
                objQ15 = new v(l2Var, a1Var10, null, 5);
                sVar.l0(objQ15);
            }
            l0.c(sVar, boolValueOf2, (p) objQ15);
            Object objQ16 = sVar.Q();
            if (objQ16 == obj5) {
                objQ16 = new x(kVar, a1Var9, dVar, 4);
                sVar.l0(objQ16);
            }
            l0.c(sVar, kVar, (p) objQ16);
            Object objQ17 = sVar.Q();
            if (objQ17 == obj5) {
                objQ17 = new x(kVar2, a1Var10, dVar, i4);
                sVar.l0(objQ17);
            }
            l0.c(sVar, kVar2, (p) objQ17);
            String str = (String) a1Var7.getValue();
            boolean z3 = !((Boolean) a1Var9.getValue()).booleanValue();
            b4 b4Var = b4.a;
            long j2 = com.app.mlounge.ui.theme.b.f;
            long j3 = com.app.mlounge.ui.theme.b.e;
            long j4 = com.app.mlounge.ui.theme.b.l;
            u5 u5VarC = b4.c(j4, j4, j2, j2, j3, 0L, 0L, sVar, 2147477244);
            o oVar = o.b;
            r rVarE = i1.e(oVar, 1.0f);
            boolean zF4 = sVar.f(l2Var) | sVar.h(lVar);
            Object objQ18 = sVar.Q();
            if (zF4) {
                obj = obj5;
            } else {
                obj = obj5;
                if (objQ18 != obj) {
                    a1Var = a1Var9;
                    i2 = 2;
                }
                r rVarE2 = androidx.compose.ui.input.key.c.e(rVarE, (kotlin.jvm.functions.l) objQ18);
                objQ = sVar.Q();
                if (objQ == obj) {
                    objQ = new m2(a1Var, 15);
                    sVar.l0(objQ);
                }
                r rVarT = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ);
                objQ2 = sVar.Q();
                if (objQ2 == obj) {
                    a1Var2 = a1Var7;
                    objQ2 = new m2(a1Var2, 16);
                    sVar.l0(objQ2);
                } else {
                    a1Var2 = a1Var7;
                }
                obj2 = obj;
                a1Var3 = a1Var2;
                h4.a(str, (kotlin.jvm.functions.l) objQ2, rVarT, true, z3, null, a.b, null, null, null, null, null, null, true, 0, 0, kVar, null, u5VarC, sVar, 1572912, 12582912, 6, 3014560);
                float f = 8;
                androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
                String str2 = (String) a1Var8.getValue();
                boolean z4 = !((Boolean) a1Var10.getValue()).booleanValue();
                if (((Boolean) a1Var10.getValue()).booleanValue()) {
                    rVar = f0.e;
                } else {
                    rVar = new androidx.compose.ui.text.input.r();
                }
                g0 g0Var = rVar;
                u5 u5VarC2 = b4.c(j4, j4, j2, j2, j3, 0L, 0L, sVar, 2147477244);
                r rVarE3 = i1.e(oVar, 1.0f);
                zF = sVar.f(l2Var) | sVar.h(lVar);
                objQ3 = sVar.Q();
                if (zF) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    if (objQ3 == obj3) {
                        a1Var4 = a1Var10;
                    }
                    r rVarE4 = androidx.compose.ui.input.key.c.e(rVarE3, (kotlin.jvm.functions.l) objQ3);
                    objQ4 = sVar.Q();
                    if (objQ4 == obj3) {
                        objQ4 = new m2(a1Var4, 17);
                        sVar.l0(objQ4);
                    }
                    r rVarT2 = androidx.compose.ui.focus.d.t(rVarE4, (kotlin.jvm.functions.l) objQ4);
                    objQ5 = sVar.Q();
                    if (objQ5 == obj3) {
                        a1Var5 = a1Var8;
                        objQ5 = new m2(a1Var5, 18);
                        sVar.l0(objQ5);
                    } else {
                        a1Var5 = a1Var8;
                    }
                    a1Var6 = a1Var5;
                    obj4 = obj3;
                    h4.a(str2, (kotlin.jvm.functions.l) objQ5, rVarT2, true, z4, null, a.c, null, null, null, g0Var, null, null, true, 0, 0, kVar2, null, u5VarC2, sVar, 1572912, 12582912, 6, 2998176);
                    androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
                    objQ6 = sVar.Q();
                    if (objQ6 == obj4) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ6;
                    a1VarB = _COROUTINE.a.B(kVar3, sVar, 6);
                    if (!kotlin.text.k.J((String) a1Var3.getValue()) || kotlin.text.k.J((String) a1Var6.getValue())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z0 z0Var = androidx.compose.material3.x.a;
                    w wVarA = androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, j4, sVar);
                    float f2 = 2;
                    if (((Boolean) a1VarB.getValue()).booleanValue()) {
                        j = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j = j3;
                    }
                    a0 a0VarA = androidx.compose.foundation.s.a(f2, j);
                    r rVarE5 = i1.e(oVar, 1.0f);
                    if ((i3 & Token.ASSIGN_MOD) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objQ7 = sVar.Q();
                    if (!z2 || objQ7 == obj4) {
                        pVar2 = pVar;
                        objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                        sVar.l0(objQ7);
                    } else {
                        pVar2 = pVar;
                    }
                    q.h((kotlin.jvm.functions.a) objQ7, rVarE5, z, null, wVarA, a0VarA, null, kVar3, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(27), sVar), sVar, 905969712);
                }
                a1Var4 = a1Var10;
                objQ3 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar, a1Var4, 3);
                sVar.l0(objQ3);
                r rVarE6 = androidx.compose.ui.input.key.c.e(rVarE3, (kotlin.jvm.functions.l) objQ3);
                objQ4 = sVar.Q();
                if (objQ4 == obj3) {
                    objQ4 = new m2(a1Var4, 17);
                    sVar.l0(objQ4);
                }
                r rVarT3 = androidx.compose.ui.focus.d.t(rVarE6, (kotlin.jvm.functions.l) objQ4);
                objQ5 = sVar.Q();
                if (objQ5 == obj3) {
                    a1Var5 = a1Var8;
                    objQ5 = new m2(a1Var5, 18);
                    sVar.l0(objQ5);
                } else {
                    a1Var5 = a1Var8;
                }
                a1Var6 = a1Var5;
                obj4 = obj3;
                h4.a(str2, (kotlin.jvm.functions.l) objQ5, rVarT3, true, z4, null, a.c, null, null, null, g0Var, null, null, true, 0, 0, kVar2, null, u5VarC2, sVar, 1572912, 12582912, 6, 2998176);
                androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
                objQ6 = sVar.Q();
                if (objQ6 == obj4) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                a1VarB = _COROUTINE.a.B(kVar4, sVar, 6);
                if (kotlin.text.k.J((String) a1Var3.getValue())) {
                    z = false;
                } else {
                    z = false;
                }
                z0 z0Var2 = androidx.compose.material3.x.a;
                w wVarA2 = androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, j4, sVar);
                float f3 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = j3;
                }
                a0 a0VarA2 = androidx.compose.foundation.s.a(f3, j);
                r rVarE7 = i1.e(oVar, 1.0f);
                if ((i3 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objQ7 = sVar.Q();
                if (z2) {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                    sVar.l0(objQ7);
                } else {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                    sVar.l0(objQ7);
                }
                q.h((kotlin.jvm.functions.a) objQ7, rVarE7, z, null, wVarA2, a0VarA2, null, kVar4, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(27), sVar), sVar, 905969712);
            }
            a1Var = a1Var9;
            i2 = 2;
            objQ18 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar, a1Var, i2);
            sVar.l0(objQ18);
            r rVarE8 = androidx.compose.ui.input.key.c.e(rVarE, (kotlin.jvm.functions.l) objQ18);
            objQ = sVar.Q();
            if (objQ == obj) {
                objQ = new m2(a1Var, 15);
                sVar.l0(objQ);
            }
            r rVarT4 = androidx.compose.ui.focus.d.t(rVarE8, (kotlin.jvm.functions.l) objQ);
            objQ2 = sVar.Q();
            if (objQ2 == obj) {
                a1Var2 = a1Var7;
                objQ2 = new m2(a1Var2, 16);
                sVar.l0(objQ2);
            } else {
                a1Var2 = a1Var7;
            }
            obj2 = obj;
            a1Var3 = a1Var2;
            h4.a(str, (kotlin.jvm.functions.l) objQ2, rVarT4, true, z3, null, a.b, null, null, null, null, null, null, true, 0, 0, kVar, null, u5VarC, sVar, 1572912, 12582912, 6, 3014560);
            float f4 = 8;
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f4));
            String str3 = (String) a1Var8.getValue();
            boolean z5 = !((Boolean) a1Var10.getValue()).booleanValue();
            if (((Boolean) a1Var10.getValue()).booleanValue()) {
                rVar = f0.e;
            } else {
                rVar = new androidx.compose.ui.text.input.r();
            }
            g0 g0Var2 = rVar;
            u5 u5VarC3 = b4.c(j4, j4, j2, j2, j3, 0L, 0L, sVar, 2147477244);
            r rVarE9 = i1.e(oVar, 1.0f);
            zF = sVar.f(l2Var) | sVar.h(lVar);
            objQ3 = sVar.Q();
            if (zF) {
                obj3 = obj2;
                if (objQ3 == obj3) {
                    a1Var4 = a1Var10;
                }
                r rVarE10 = androidx.compose.ui.input.key.c.e(rVarE9, (kotlin.jvm.functions.l) objQ3);
                objQ4 = sVar.Q();
                if (objQ4 == obj3) {
                    objQ4 = new m2(a1Var4, 17);
                    sVar.l0(objQ4);
                }
                r rVarT5 = androidx.compose.ui.focus.d.t(rVarE10, (kotlin.jvm.functions.l) objQ4);
                objQ5 = sVar.Q();
                if (objQ5 == obj3) {
                    a1Var5 = a1Var8;
                    objQ5 = new m2(a1Var5, 18);
                    sVar.l0(objQ5);
                } else {
                    a1Var5 = a1Var8;
                }
                a1Var6 = a1Var5;
                obj4 = obj3;
                h4.a(str3, (kotlin.jvm.functions.l) objQ5, rVarT5, true, z5, null, a.c, null, null, null, g0Var2, null, null, true, 0, 0, kVar2, null, u5VarC3, sVar, 1572912, 12582912, 6, 2998176);
                androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f4));
                objQ6 = sVar.Q();
                if (objQ6 == obj4) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ6;
                a1VarB = _COROUTINE.a.B(kVar5, sVar, 6);
                if (kotlin.text.k.J((String) a1Var3.getValue())) {
                    z = false;
                } else {
                    z = false;
                }
                z0 z0Var3 = androidx.compose.material3.x.a;
                w wVarA3 = androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, j4, sVar);
                float f5 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = j3;
                }
                a0 a0VarA3 = androidx.compose.foundation.s.a(f5, j);
                r rVarE11 = i1.e(oVar, 1.0f);
                if ((i3 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objQ7 = sVar.Q();
                if (z2) {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                    sVar.l0(objQ7);
                } else {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                    sVar.l0(objQ7);
                }
                q.h((kotlin.jvm.functions.a) objQ7, rVarE11, z, null, wVarA3, a0VarA3, null, kVar5, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(27), sVar), sVar, 905969712);
            } else {
                obj3 = obj2;
            }
            a1Var4 = a1Var10;
            objQ3 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar, a1Var4, 3);
            sVar.l0(objQ3);
            r rVarE12 = androidx.compose.ui.input.key.c.e(rVarE9, (kotlin.jvm.functions.l) objQ3);
            objQ4 = sVar.Q();
            if (objQ4 == obj3) {
                objQ4 = new m2(a1Var4, 17);
                sVar.l0(objQ4);
            }
            r rVarT6 = androidx.compose.ui.focus.d.t(rVarE12, (kotlin.jvm.functions.l) objQ4);
            objQ5 = sVar.Q();
            if (objQ5 == obj3) {
                a1Var5 = a1Var8;
                objQ5 = new m2(a1Var5, 18);
                sVar.l0(objQ5);
            } else {
                a1Var5 = a1Var8;
            }
            a1Var6 = a1Var5;
            obj4 = obj3;
            h4.a(str3, (kotlin.jvm.functions.l) objQ5, rVarT6, true, z5, null, a.c, null, null, null, g0Var2, null, null, true, 0, 0, kVar2, null, u5VarC3, sVar, 1572912, 12582912, 6, 2998176);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f4));
            objQ6 = sVar.Q();
            if (objQ6 == obj4) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ6;
            a1VarB = _COROUTINE.a.B(kVar6, sVar, 6);
            if (kotlin.text.k.J((String) a1Var3.getValue())) {
                z = false;
            } else {
                z = false;
            }
            z0 z0Var4 = androidx.compose.material3.x.a;
            w wVarA4 = androidx.compose.material3.x.a(androidx.compose.ui.graphics.t.h, j4, sVar);
            float f6 = 2;
            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                j = com.app.mlounge.ui.theme.b.q;
            } else {
                j = j3;
            }
            a0 a0VarA4 = androidx.compose.foundation.s.a(f6, j);
            r rVarE13 = i1.e(oVar, 1.0f);
            if ((i3 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objQ7 = sVar.Q();
            if (z2) {
                pVar2 = pVar;
                objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                sVar.l0(objQ7);
            } else {
                pVar2 = pVar;
                objQ7 = new androidx.compose.foundation.gestures.g(20, pVar2, a1Var3, a1Var6);
                sVar.l0(objQ7);
            }
            q.h((kotlin.jvm.functions.a) objQ7, rVarE13, z, null, wVarA4, a0VarA4, null, kVar6, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(27), sVar), sVar, 905969712);
        } else {
            pVar2 = pVar;
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.runtime.saveable.a(i, pVar2);
        }
    }

    public static final String p(String str) {
        try {
            Locale locale = Locale.US;
            for (SimpleDateFormat simpleDateFormat : kotlin.collections.q.k(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale), new SimpleDateFormat("yyyy-MM-dd", locale))) {
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                try {
                    Date date = simpleDateFormat.parse(str);
                    if (date != null) {
                        String str2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(date);
                        str2.getClass();
                        return str2;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return str;
    }
}
