package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.s0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.u0;
import androidx.compose.material3.x2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.lifecycle.y0;
import androidx.room.coroutines.c0;
import androidx.work.impl.v;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.b2;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlin.collections.i0;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 1437921525, new com.app.mlounge.ui.screens.sources.b(1));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 72181556, new com.app.mlounge.ui.screens.settings.a(14));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, 1051597153, new com.app.mlounge.ui.screens.settings.a(15));

    public static final void a(String str, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, s sVar, int i) {
        sVar.c0(2005859184);
        int i2 = (sVar.f(str) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            t1.a(aVar3, null, androidx.compose.runtime.internal.k.c(-2126052153, new d(str, aVar, aVar2, 0), sVar), sVar, 390, 2);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, aVar, aVar2, aVar3, i, 6);
        }
    }

    public static final void b(final androidx.compose.ui.r rVar, final TmdbEpisode tmdbEpisode, final String str, final float f, final boolean z, final kotlin.jvm.functions.a aVar, s sVar, final int i) {
        sVar.c0(-197155420);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.f(tmdbEpisode) ? 32 : 16) | (sVar.f(str) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.c(f) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.g(z) ? 16384 : 8192) | (sVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT);
        if (sVar.T(i2 & 1, (74899 & i2) != 74898)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            float f2 = 16;
            float f3 = 4;
            androidx.compose.ui.r rVarT = androidx.compose.foundation.layout.b.t(i1.e(rVar, 1.0f), f2, f3, f2, f > 0.0f ? 2 : f3);
            float f4 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarT, androidx.compose.foundation.shape.e.a(f4)), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f4));
            boolean z2 = (i2 & 458752) == 131072;
            Object objQ2 = sVar.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new x2(24, aVar);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f4), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(911966697, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.tvshows.f
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    s sVar2 = (s) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                        w wVarA = u.a(cVar, hVar, sVar2, 0);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL = sVar2.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, oVar);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar2, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
                        androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 8);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                        TmdbEpisode tmdbEpisode2 = tmdbEpisode;
                        float f5 = 4;
                        coil3.compose.k.a(str, tmdbEpisode2.c(), androidx.compose.ui.draw.h.a(i1.g(i1.q(oVar, 120), 68), androidx.compose.foundation.shape.e.a(f5)), null, androidx.compose.ui.layout.i.a, sVar2, 1572864, 1976);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, 12));
                        if (z) {
                            sVar2.b0(626549675);
                            q1.a(com.google.firebase.b.S(R.drawable.ic_check, sVar2), "Watched", androidx.compose.foundation.layout.b.u(i1.m(oVar, 20), 0.0f, 0.0f, f5, 0.0f, 11), com.app.mlounge.ui.theme.b.p, sVar2, 3512);
                            sVar2.p(false);
                        } else {
                            sVar2.b0(626832767);
                            sVar2.p(false);
                        }
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var = new t0(1.0f, true);
                        w wVarA2 = u.a(cVar, hVar, sVar2, 0);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar2, t0Var);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, wVarA2, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC3, eVar4);
                        int iA = tmdbEpisode2.a();
                        String strC = tmdbEpisode2.c();
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = "E" + iA + ": " + strC;
                        androidx.compose.runtime.x2 x2Var = n6.a;
                        z5.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar2.j(x2Var)).i, sVar2, 384, 24960, 110586);
                        s sVar3 = sVar2;
                        String strD = tmdbEpisode2.d();
                        if (strD == null) {
                            sVar3.b0(-464645642);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-464645641);
                            z5.b(strD, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((m6) sVar3.j(x2Var)).l, sVar3, 384, 24960, 110586);
                            sVar3 = sVar3;
                            sVar3.p(false);
                        }
                        Integer numE = tmdbEpisode2.e();
                        if (numE == null) {
                            sVar3.b0(-464401827);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-464401826);
                            s sVar4 = sVar3;
                            z5.b(androidx.compose.runtime.j.d(numE.intValue(), "min"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).o, sVar4, 384, 0, 131066);
                            sVar3 = sVar4;
                            sVar3.p(false);
                        }
                        sVar3.p(true);
                        androidx.compose.ui.graphics.vector.f fVarW = org.jsoup.helper.n.w();
                        long j = com.app.mlounge.ui.theme.b.f;
                        q1.b(fVarW, "Play", i1.m(oVar, 32), j, sVar3, 3504, 0);
                        sVar3.p(true);
                        float f6 = f;
                        if (f6 > 0.0f) {
                            sVar3.b0(-2057914606);
                            androidx.compose.ui.r rVarG2 = i1.g(i1.e(oVar, 1.0f), 3);
                            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                            int iHashCode4 = Long.hashCode(sVar3.T);
                            androidx.compose.runtime.internal.j jVarL4 = sVar3.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar3, rVarG2);
                            sVar3.e0();
                            if (sVar3.S) {
                                sVar3.k(fVar2);
                            } else {
                                sVar3.o0();
                            }
                            androidx.compose.runtime.t.x(sVar3, q0VarD, eVar);
                            androidx.compose.runtime.t.x(sVar3, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar3, eVar3, sVar3, dVar);
                            androidx.compose.runtime.t.x(sVar3, rVarC4, eVar4);
                            e0 e0Var = i1.c;
                            long jB = t.b(0.25f, t.d);
                            j0 j0Var = a0.b;
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(e0Var, jB, j0Var), sVar3, 6);
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(i1.e(i1.c(oVar, 1.0f), i0.c(f6, 0.0f, 1.0f)), j, j0Var), sVar3, 0);
                            sVar3.p(true);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-2057590749);
                            sVar3.p(false);
                        }
                        sVar3.p(true);
                    } else {
                        sVar2.W();
                    }
                    return y.a;
                }
            }, sVar), sVar, 12583296, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(tmdbEpisode, str, f, z, aVar, i) { // from class: com.app.mlounge.ui.screens.tvshows.g
                public final /* synthetic */ float A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ kotlin.jvm.functions.a C;
                public final /* synthetic */ TmdbEpisode y;
                public final /* synthetic */ String z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    a.b(this.e, this.y, this.z, this.A, this.B, this.C, (s) obj, iA);
                    return y.a;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v6 com.app.mlounge.ui.viewmodel.b2
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void c(int r39, final kotlin.jvm.functions.a r40, kotlin.jvm.functions.l r41, kotlin.jvm.functions.l r42, kotlin.jvm.functions.q r43, kotlin.jvm.functions.s r44, kotlin.jvm.functions.s r45, com.app.mlounge.ui.viewmodel.b2 r46, androidx.compose.runtime.s r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.tvshows.a.c(int, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.s, kotlin.jvm.functions.s, com.app.mlounge.ui.viewmodel.b2, androidx.compose.runtime.s, int):void");
    }

    public static final void d(kotlin.jvm.functions.l lVar, b2 b2Var, s sVar, int i) {
        s sVar2;
        b2 b2Var2;
        int i2;
        b2 b2Var3;
        a1 a1Var;
        b2 b2Var4;
        Object qVar;
        s sVar3;
        b2 b2Var5;
        boolean z;
        b2 b2Var6;
        lVar.getClass();
        sVar.c0(-1795253783);
        int i3 = i | (sVar.h(lVar) ? 4 : 2) | 16;
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-113);
                    b2Var3 = (b2) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(b2.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                }
            } else {
                sVar.W();
                i2 = i3 & (-113);
                b2Var3 = b2Var;
            }
            sVar.q();
            a1 a1VarG = androidx.compose.runtime.t.g(b2Var3.n, sVar);
            a1 a1VarG2 = androidx.compose.runtime.t.g(b2Var3.p, sVar);
            a1 a1VarG3 = androidx.compose.runtime.t.g(b2Var3.r, sVar);
            a1 a1VarG4 = androidx.compose.runtime.t.g(b2Var3.t, sVar);
            a1 a1VarG5 = androidx.compose.runtime.t.g(b2Var3.v, sVar);
            a1 a1VarG6 = androidx.compose.runtime.t.g(b2Var3.x, sVar);
            a1 a1VarG7 = androidx.compose.runtime.t.g(b2Var3.z, sVar);
            a1 a1VarG8 = androidx.compose.runtime.t.g(b2Var3.B, sVar);
            a1 a1VarG9 = androidx.compose.runtime.t.g(b2Var3.D, sVar);
            a1 a1VarG10 = androidx.compose.runtime.t.g(b2Var3.E, sVar);
            a1 a1VarG11 = androidx.compose.runtime.t.g(b2Var3.d, sVar);
            a1 a1VarG12 = androidx.compose.runtime.t.g(b2Var3.g, sVar);
            a1 a1VarG13 = androidx.compose.runtime.t.g(b2Var3.i, sVar);
            x xVarA = z.a(0, 0, sVar, 3);
            boolean zF = sVar.f(xVarA) | sVar.f(a1VarG) | sVar.h(b2Var3);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zF || objQ == fVar) {
                a1Var = a1VarG13;
                c0 c0Var = new c0(xVarA, b2Var3, a1VarG, (kotlin.coroutines.d) null, 17);
                sVar.l0(c0Var);
                objQ = c0Var;
            } else {
                a1Var = a1VarG13;
            }
            l0.c(sVar, xVarA, (kotlin.jvm.functions.p) objQ);
            e0 e0Var = i1.c;
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
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
            float f = 16;
            b2 b2Var7 = b2Var3;
            int i4 = i2;
            z5.b("TV Shows", androidx.compose.foundation.layout.b.u(androidx.compose.ui.o.b, f, f, 0.0f, 4, 4), ((androidx.compose.material3.t0) sVar.j(u0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).e, sVar, 54, 0, 131064);
            List list = (List) a1VarG2.getValue();
            TmdbGenre tmdbGenre = (TmdbGenre) a1VarG6.getValue();
            String str = (String) a1VarG7.getValue();
            Integer num = (Integer) a1VarG8.getValue();
            boolean zBooleanValue = ((Boolean) a1VarG9.getValue()).booleanValue();
            boolean zH = sVar.h(b2Var7);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar) {
                b2Var4 = b2Var7;
                androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, b2Var4, b2.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/TmdbGenre;)V", 0, 22);
                sVar.l0(cVar);
                objQ2 = cVar;
            } else {
                b2Var4 = b2Var7;
            }
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ2);
            boolean zH2 = sVar.h(b2Var4);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == fVar) {
                androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, b2Var4, b2.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 23);
                sVar.l0(cVar2);
                objQ3 = cVar2;
            }
            kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ3);
            boolean zH3 = sVar.h(b2Var4);
            Object objQ4 = sVar.Q();
            if (zH3 || objQ4 == fVar) {
                androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, b2Var4, b2.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 24);
                sVar.l0(cVar3);
                objQ4 = cVar3;
            }
            kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ4);
            boolean zH4 = sVar.h(b2Var4);
            Object objQ5 = sVar.Q();
            if (zH4 || objQ5 == fVar) {
                androidx.compose.foundation.c cVar4 = new androidx.compose.foundation.c(1, b2Var4, b2.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 25);
                sVar.l0(cVar4);
                objQ5 = cVar4;
            }
            b2 b2Var8 = b2Var4;
            b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar2, lVar3, lVar4, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ5), null, ((Boolean) a1VarG10.getValue()).booleanValue(), sVar, 0);
            sVar2 = sVar;
            if (((Boolean) a1VarG3.getValue()).booleanValue() && ((List) a1VarG.getValue()).isEmpty()) {
                sVar2.b0(-1939842427);
                b0.n(null, sVar2, 0);
                sVar2.p(false);
                b2Var5 = b2Var8;
            } else {
                if (((String) a1VarG5.getValue()) == null || !((List) a1VarG.getValue()).isEmpty()) {
                    sVar2.b0(-5333709);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                    float f2 = 12;
                    z0 z0Var = new z0(f2, f2, f2, f2);
                    float f3 = 8;
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    a1 a1Var2 = a1Var;
                    boolean zF2 = sVar2.f(a1VarG) | sVar2.f(a1VarG12) | sVar2.f(a1Var2) | sVar2.h(b2Var8) | sVar2.f(a1VarG11) | ((i4 & 14) == 4) | sVar2.f(a1VarG4);
                    Object objQ6 = sVar2.Q();
                    if (zF2 || objQ6 == fVar) {
                        sVar3 = sVar2;
                        qVar = new androidx.navigation.compose.q(a1VarG, b2Var8, lVar, a1VarG12, a1Var2, a1VarG11, a1VarG4);
                        b2Var5 = b2Var8;
                        sVar3.l0(qVar);
                    } else {
                        sVar3 = sVar2;
                        b2Var5 = b2Var8;
                        qVar = objQ6;
                    }
                    s sVar4 = sVar3;
                    lVar = lVar;
                    v.b(aVar, e0Var, xVarA, z0Var, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) qVar, sVar4, 1772592, 912);
                    sVar2 = sVar4;
                    sVar2.p(false);
                    z = true;
                } else {
                    sVar2.b0(-1939840172);
                    String str2 = (String) a1VarG5.getValue();
                    str2.getClass();
                    boolean zH5 = sVar2.h(b2Var8);
                    Object objQ7 = sVar2.Q();
                    if (zH5 || objQ7 == fVar) {
                        b2Var6 = b2Var8;
                        s0 s0Var = new s0(0, b2Var6, b2.class, "loadTvShows", "loadTvShows()V", 0, 11);
                        sVar2.l0(s0Var);
                        objQ7 = s0Var;
                    } else {
                        b2Var6 = b2Var8;
                    }
                    b0.i(str2, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ7), sVar2, 0);
                    sVar2.p(false);
                    b2Var5 = b2Var6;
                }
                sVar2.p(z);
                b2Var2 = b2Var5;
            }
            z = true;
            sVar2.p(z);
            b2Var2 = b2Var5;
        } else {
            i = i;
            sVar2 = sVar;
            lVar = lVar;
            sVar2.W();
            b2Var2 = b2Var;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new r(lVar, b2Var2, i);
        }
    }
}
