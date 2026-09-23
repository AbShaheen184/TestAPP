package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.s0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.x2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.c0;
import com.app.mlounge.ui.viewmodel.f0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, -203279274, new c0(25));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 899537153, new androidx.compose.foundation.contextmenu.b(17));

    public static final void a(String str, String str2, String str3, kotlin.jvm.functions.a aVar, s sVar, int i) {
        s sVar2;
        s sVar3 = sVar;
        sVar3.c0(-1340861145);
        int i2 = i | (sVar3.f(str) ? 4 : 2) | (sVar3.f(str2) ? 32 : 16) | (sVar3.f(str3) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar3.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar3.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = sVar3.Q();
            androidx.compose.runtime.f fVar = n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar3);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar3, 6);
            androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
            o oVar = o.b;
            r rVarQ = i1.q(oVar, 80);
            float f = 2;
            long j = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h;
            float f2 = 8;
            r rVarA = androidx.compose.ui.draw.h.a(androidx.compose.foundation.s.g(rVarQ, f, j, androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i2 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new x2(12, aVar);
                sVar2 = sVar;
                sVar2.l0(objQ2);
            } else {
                sVar2 = sVar;
            }
            r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarA, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
            float f3 = 4;
            r rVarQ2 = androidx.compose.foundation.layout.b.q(rVarN, f3);
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ2);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            coil3.compose.k.a(str3, str, androidx.compose.ui.draw.h.a(i1.m(oVar, 60), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, sVar2, ((i2 >> 6) & 14) | 1572864 | ((i2 << 3) & Token.ASSIGN_MOD), 1976);
            androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f3));
            androidx.compose.runtime.x2 x2Var = n6.a;
            z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar2.j(x2Var)).o, sVar, (i2 & 14) | 384, 24960, 110586);
            z5.b(str2, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar.j(x2Var)).o, sVar, ((i2 >> 3) & 14) | 384, 24960, 110586);
            sVar3 = sVar;
            sVar3.p(true);
        } else {
            sVar3.W();
        }
        s1 s1VarT = sVar3.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, str2, str3, aVar, i, 3);
        }
    }

    public static final void b(String str, androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, r rVar, boolean z, s sVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        aVar.getClass();
        sVar.c0(-434454158);
        if ((i & 6) == 0) {
            i3 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (sVar.f(fVar) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if ((i & 3072) == 0) {
            i5 |= sVar.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i6 = i5 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i5 | 221184;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (sVar.g(z2) ? 131072 : Parser.ARGC_LIMIT);
        }
        if (sVar.T(i4 & 1, (74899 & i4) != 74898)) {
            if (i7 != 0) {
                z2 = false;
            }
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = n.a;
            if (objQ == fVar2) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z3 = ((458752 & i4) == 131072) | ((i4 & 896) == 256);
            Object objQ2 = sVar.Q();
            if (z3 || objQ2 == fVar2) {
                objQ2 = new androidx.compose.foundation.contextmenu.k(z2, aVar, 1);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1028328649, new c(z2, fVar, str), sVar), sVar, 12582912, 120);
            z2 = z2;
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.t(str, fVar, aVar, rVar, z2, i, i2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void c(int r51, kotlin.jvm.functions.a r52, kotlin.jvm.functions.l r53, kotlin.jvm.functions.l r54, kotlin.jvm.functions.q r55, kotlin.jvm.functions.q r56, kotlin.jvm.functions.q r57, kotlin.jvm.functions.p r58, com.app.mlounge.ui.viewmodel.f0 r59, androidx.compose.runtime.s r60, int r61) {
        /*
            Method dump skipped, instruction units count: 3176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.movies.a.c(int, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.p, com.app.mlounge.ui.viewmodel.f0, androidx.compose.runtime.s, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0212  */
    /* JADX WARN: Code duplicated, block: B:50:0x0237  */
    /* JADX WARN: Code duplicated, block: B:54:0x025c  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x031c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0362  */
    /* JADX WARN: Code duplicated, block: B:72:0x0365  */
    /* JADX WARN: Code duplicated, block: B:75:0x0374 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0382  */
    public static final void d(l lVar, f0 f0Var, s sVar, int i) {
        s sVar2;
        f0 f0Var2;
        int i2;
        f0 f0Var3;
        Object c0Var;
        androidx.compose.runtime.f fVar;
        androidx.compose.runtime.f fVar2;
        f0 f0Var4;
        androidx.compose.runtime.f fVar3;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        boolean zH3;
        Object objQ3;
        f0 f0Var5;
        boolean z;
        boolean zF;
        Object rVar;
        s sVar3;
        f0 f0Var6;
        boolean z2;
        lVar.getClass();
        sVar.c0(-149693047);
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
                    f0Var3 = (f0) _COROUTINE.b.J(a0.a(f0.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                }
            } else {
                sVar.W();
                i2 = i3 & (-113);
                f0Var3 = f0Var;
            }
            sVar.q();
            a1 a1VarG = androidx.compose.runtime.t.g(f0Var3.h, sVar);
            a1 a1VarG2 = androidx.compose.runtime.t.g(f0Var3.j, sVar);
            a1 a1VarG3 = androidx.compose.runtime.t.g(f0Var3.l, sVar);
            a1 a1VarG4 = androidx.compose.runtime.t.g(f0Var3.n, sVar);
            a1 a1VarG5 = androidx.compose.runtime.t.g(f0Var3.p, sVar);
            a1 a1VarG6 = androidx.compose.runtime.t.g(f0Var3.r, sVar);
            a1 a1VarG7 = androidx.compose.runtime.t.g(f0Var3.t, sVar);
            a1 a1VarG8 = androidx.compose.runtime.t.g(f0Var3.v, sVar);
            a1 a1VarG9 = androidx.compose.runtime.t.g(f0Var3.x, sVar);
            a1 a1VarG10 = androidx.compose.runtime.t.g(f0Var3.y, sVar);
            a1 a1VarG11 = androidx.compose.runtime.t.g(f0Var3.e, sVar);
            a1 a1VarG12 = androidx.compose.runtime.t.g(f0Var3.f, sVar);
            x xVarA = z.a(0, 0, sVar, 3);
            boolean zF2 = sVar.f(xVarA) | sVar.f(a1VarG) | sVar.h(f0Var3);
            Object objQ4 = sVar.Q();
            androidx.compose.runtime.f fVar4 = n.a;
            if (zF2 || objQ4 == fVar4) {
                fVar = fVar4;
                c0Var = new androidx.room.coroutines.c0(xVarA, f0Var3, a1VarG, (kotlin.coroutines.d) null, 14);
                sVar.l0(c0Var);
            } else {
                c0Var = objQ4;
                fVar = fVar4;
            }
            l0.c(sVar, xVarA, (p) c0Var);
            e0 e0Var = i1.c;
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar5);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            float f = 16;
            f0 f0Var7 = f0Var3;
            int i4 = i2;
            z5.b("Movies", androidx.compose.foundation.layout.b.u(o.b, f, f, 0.0f, 4, 4), ((t0) sVar.j(u0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).e, sVar, 54, 0, 131064);
            List list = (List) a1VarG2.getValue();
            TmdbGenre tmdbGenre = (TmdbGenre) a1VarG6.getValue();
            String str = (String) a1VarG7.getValue();
            Integer num = (Integer) a1VarG8.getValue();
            boolean zBooleanValue = ((Boolean) a1VarG9.getValue()).booleanValue();
            boolean zH4 = sVar.h(f0Var7);
            Object objQ5 = sVar.Q();
            if (zH4) {
                fVar2 = fVar;
            } else {
                androidx.compose.runtime.f fVar6 = fVar;
                if (objQ5 == fVar6) {
                    fVar2 = fVar6;
                } else {
                    f0Var4 = f0Var7;
                    fVar3 = fVar6;
                }
                l lVar2 = (l) ((kotlin.reflect.e) objQ5);
                zH = sVar.h(f0Var4);
                objQ = sVar.Q();
                if (zH || objQ == fVar3) {
                    androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                    sVar.l0(cVar);
                    objQ = cVar;
                }
                l lVar3 = (l) ((kotlin.reflect.e) objQ);
                zH2 = sVar.h(f0Var4);
                objQ2 = sVar.Q();
                if (zH2 || objQ2 == fVar3) {
                    androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                    sVar.l0(cVar2);
                    objQ2 = cVar2;
                }
                l lVar4 = (l) ((kotlin.reflect.e) objQ2);
                zH3 = sVar.h(f0Var4);
                objQ3 = sVar.Q();
                if (zH3 || objQ3 == fVar3) {
                    androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                    sVar.l0(cVar3);
                    objQ3 = cVar3;
                }
                f0Var5 = f0Var4;
                b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar2, lVar3, lVar4, (l) ((kotlin.reflect.e) objQ3), null, ((Boolean) a1VarG10.getValue()).booleanValue(), sVar, 0);
                sVar2 = sVar;
                if (!((Boolean) a1VarG3.getValue()).booleanValue() && ((List) a1VarG.getValue()).isEmpty()) {
                    sVar2.b0(1373090245);
                    b0.n(null, sVar2, 0);
                    sVar2.p(false);
                    i = i;
                    z2 = true;
                    f0Var6 = f0Var5;
                } else if (((String) a1VarG5.getValue()) == null && ((List) a1VarG.getValue()).isEmpty()) {
                    sVar2.b0(1373092513);
                    String str2 = (String) a1VarG5.getValue();
                    str2.getClass();
                    boolean zH5 = sVar2.h(f0Var5);
                    Object objQ6 = sVar2.Q();
                    if (zH5 || objQ6 == fVar3) {
                        s0 s0Var = new s0(0, f0Var5, f0.class, "loadMovies", "loadMovies()V", 0, 9);
                        sVar2.l0(s0Var);
                        objQ6 = s0Var;
                    }
                    b0.i(str2, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), sVar2, 0);
                    sVar2.p(false);
                    i = i;
                    f0Var6 = f0Var5;
                    z2 = true;
                } else {
                    sVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                    float f2 = 12;
                    z0 z0Var = new z0(f2, f2, f2, f2);
                    float f3 = 8;
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    boolean zF3 = sVar2.f(a1VarG) | sVar2.h(f0Var5) | sVar2.f(a1VarG11) | sVar2.f(a1VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF3 | z | sVar2.f(a1VarG4);
                    Object objQ7 = sVar2.Q();
                    if (!zF || objQ7 == fVar3) {
                        sVar3 = sVar2;
                        rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                        f0Var6 = f0Var5;
                        sVar3.l0(rVar);
                    } else {
                        sVar3 = sVar2;
                        f0Var6 = f0Var5;
                        rVar = objQ7;
                    }
                    s sVar4 = sVar3;
                    v.b(aVar, e0Var, xVarA, z0Var, fVarG2, fVarG, null, false, null, (l) rVar, sVar4, 1772592, 912);
                    sVar2 = sVar4;
                    sVar2.p(false);
                    z2 = true;
                }
                sVar2.p(z2);
                f0Var2 = f0Var6;
            }
            f0Var4 = f0Var7;
            fVar3 = fVar2;
            androidx.compose.foundation.c cVar4 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/TmdbGenre;)V", 0, 7);
            sVar.l0(cVar4);
            objQ5 = cVar4;
            l lVar5 = (l) ((kotlin.reflect.e) objQ5);
            zH = sVar.h(f0Var4);
            objQ = sVar.Q();
            if (zH) {
                androidx.compose.foundation.c cVar5 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                sVar.l0(cVar5);
                objQ = cVar5;
            } else {
                androidx.compose.foundation.c cVar6 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                sVar.l0(cVar6);
                objQ = cVar6;
            }
            l lVar6 = (l) ((kotlin.reflect.e) objQ);
            zH2 = sVar.h(f0Var4);
            objQ2 = sVar.Q();
            if (zH2) {
                androidx.compose.foundation.c cVar7 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                sVar.l0(cVar7);
                objQ2 = cVar7;
            } else {
                androidx.compose.foundation.c cVar8 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                sVar.l0(cVar8);
                objQ2 = cVar8;
            }
            l lVar7 = (l) ((kotlin.reflect.e) objQ2);
            zH3 = sVar.h(f0Var4);
            objQ3 = sVar.Q();
            if (zH3) {
                androidx.compose.foundation.c cVar9 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                sVar.l0(cVar9);
                objQ3 = cVar9;
            } else {
                androidx.compose.foundation.c cVar10 = new androidx.compose.foundation.c(1, f0Var4, f0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                sVar.l0(cVar10);
                objQ3 = cVar10;
            }
            f0Var5 = f0Var4;
            b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar5, lVar6, lVar7, (l) ((kotlin.reflect.e) objQ3), null, ((Boolean) a1VarG10.getValue()).booleanValue(), sVar, 0);
            sVar2 = sVar;
            if (!((Boolean) a1VarG3.getValue()).booleanValue()) {
                if (((String) a1VarG5.getValue()) == null) {
                    sVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                    float f4 = 12;
                    z0 z0Var2 = new z0(f4, f4, f4, f4);
                    float f5 = 8;
                    androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f5);
                    androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f5);
                    boolean zF4 = sVar2.f(a1VarG) | sVar2.h(f0Var5) | sVar2.f(a1VarG11) | sVar2.f(a1VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF4 | z | sVar2.f(a1VarG4);
                    Object objQ8 = sVar2.Q();
                    if (zF) {
                        sVar3 = sVar2;
                        rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                        f0Var6 = f0Var5;
                        sVar3.l0(rVar);
                    } else {
                        sVar3 = sVar2;
                        rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                        f0Var6 = f0Var5;
                        sVar3.l0(rVar);
                    }
                    s sVar5 = sVar3;
                    v.b(aVar2, e0Var, xVarA, z0Var2, fVarG4, fVarG3, null, false, null, (l) rVar, sVar5, 1772592, 912);
                    sVar2 = sVar5;
                    sVar2.p(false);
                    z2 = true;
                } else {
                    sVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar3 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                    float f6 = 12;
                    z0 z0Var3 = new z0(f6, f6, f6, f6);
                    float f7 = 8;
                    androidx.compose.foundation.layout.f fVarG5 = androidx.compose.foundation.layout.h.g(f7);
                    androidx.compose.foundation.layout.f fVarG6 = androidx.compose.foundation.layout.h.g(f7);
                    boolean zF5 = sVar2.f(a1VarG) | sVar2.h(f0Var5) | sVar2.f(a1VarG11) | sVar2.f(a1VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF5 | z | sVar2.f(a1VarG4);
                    Object objQ9 = sVar2.Q();
                    if (zF) {
                        sVar3 = sVar2;
                        rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                        f0Var6 = f0Var5;
                        sVar3.l0(rVar);
                    } else {
                        sVar3 = sVar2;
                        rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                        f0Var6 = f0Var5;
                        sVar3.l0(rVar);
                    }
                    s sVar6 = sVar3;
                    v.b(aVar3, e0Var, xVarA, z0Var3, fVarG6, fVarG5, null, false, null, (l) rVar, sVar6, 1772592, 912);
                    sVar2 = sVar6;
                    sVar2.p(false);
                    z2 = true;
                }
            } else if (((String) a1VarG5.getValue()) == null) {
                sVar2.b0(-383598502);
                androidx.compose.foundation.lazy.grid.a aVar4 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                float f8 = 12;
                z0 z0Var4 = new z0(f8, f8, f8, f8);
                float f9 = 8;
                androidx.compose.foundation.layout.f fVarG7 = androidx.compose.foundation.layout.h.g(f9);
                androidx.compose.foundation.layout.f fVarG8 = androidx.compose.foundation.layout.h.g(f9);
                boolean zF6 = sVar2.f(a1VarG) | sVar2.h(f0Var5) | sVar2.f(a1VarG11) | sVar2.f(a1VarG12);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zF = zF6 | z | sVar2.f(a1VarG4);
                Object objQ10 = sVar2.Q();
                if (zF) {
                    sVar3 = sVar2;
                    rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                    f0Var6 = f0Var5;
                    sVar3.l0(rVar);
                } else {
                    sVar3 = sVar2;
                    rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                    f0Var6 = f0Var5;
                    sVar3.l0(rVar);
                }
                s sVar7 = sVar3;
                v.b(aVar4, e0Var, xVarA, z0Var4, fVarG8, fVarG7, null, false, null, (l) rVar, sVar7, 1772592, 912);
                sVar2 = sVar7;
                sVar2.p(false);
                z2 = true;
            } else {
                sVar2.b0(-383598502);
                androidx.compose.foundation.lazy.grid.a aVar5 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                float f10 = 12;
                z0 z0Var5 = new z0(f10, f10, f10, f10);
                float f11 = 8;
                androidx.compose.foundation.layout.f fVarG9 = androidx.compose.foundation.layout.h.g(f11);
                androidx.compose.foundation.layout.f fVarG10 = androidx.compose.foundation.layout.h.g(f11);
                boolean zF7 = sVar2.f(a1VarG) | sVar2.h(f0Var5) | sVar2.f(a1VarG11) | sVar2.f(a1VarG12);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zF = zF7 | z | sVar2.f(a1VarG4);
                Object objQ11 = sVar2.Q();
                if (zF) {
                    sVar3 = sVar2;
                    rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                    f0Var6 = f0Var5;
                    sVar3.l0(rVar);
                } else {
                    sVar3 = sVar2;
                    rVar = new androidx.compose.foundation.layout.r(a1VarG, f0Var5, lVar, a1VarG11, a1VarG12, a1VarG4, 1);
                    f0Var6 = f0Var5;
                    sVar3.l0(rVar);
                }
                s sVar8 = sVar3;
                v.b(aVar5, e0Var, xVarA, z0Var5, fVarG10, fVarG9, null, false, null, (l) rVar, sVar8, 1772592, 912);
                sVar2 = sVar8;
                sVar2.p(false);
                z2 = true;
            }
            sVar2.p(z2);
            f0Var2 = f0Var6;
        } else {
            i = i;
            sVar2 = sVar;
            lVar = lVar;
            sVar2.W();
            f0Var2 = f0Var;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, f0Var2, i, 21);
        }
    }
}
