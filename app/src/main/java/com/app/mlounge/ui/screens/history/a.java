package com.app.mlounge.ui.screens.history;

import android.content.Context;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.s0;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g1;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.viewmodel.s;
import com.app.mlounge.ui.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.q;
import kotlin.collections.w;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(false, -1934579980, new androidx.compose.foundation.contextmenu.b(16));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v9, types: [java.util.Collection, java.util.List] */
    public static final void a(final l lVar, final l lVar2, final l lVar3, final r rVar, final l lVar4, final boolean z, final kotlin.jvm.functions.a aVar, s sVar, androidx.compose.runtime.s sVar2, final int i) {
        final s sVar3;
        int i2;
        s sVar4;
        List list;
        List list2;
        ArrayList arrayList;
        Object obj;
        ?? r28;
        int i3;
        o oVar;
        s sVar5;
        androidx.compose.runtime.f fVar;
        boolean z2;
        s sVar6;
        boolean z3;
        List list3;
        String str;
        String str2;
        g1 g1Var;
        androidx.compose.runtime.f fVar2;
        s sVar7;
        androidx.compose.runtime.s sVar8 = sVar2;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        rVar.getClass();
        sVar8.c0(-234454454);
        int i4 = i | (sVar8.h(lVar) ? 4 : 2) | (sVar8.h(lVar2) ? 32 : 16) | (sVar8.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar8.h(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar8.h(lVar4) ? 16384 : 8192) | (sVar8.g(z) ? 131072 : Parser.ARGC_LIMIT) | 4194304;
        if (sVar8.T(i4 & 1, (4793491 & i4) != 4793490)) {
            sVar8.Y();
            if ((i & 1) == 0 || sVar8.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar8);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-29360129);
                    sVar4 = (s) _COROUTINE.b.J(a0.a(s.class), y0VarA, n.n(y0VarA, sVar8), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar8);
                }
            } else {
                sVar8.W();
                i2 = i4 & (-29360129);
                sVar4 = sVar;
            }
            sVar8.q();
            int i5 = i2;
            a1 a1VarF = t.f(sVar4.e, w.e, null, sVar8, 48, 2);
            a1 a1VarG = t.g(sVar4.c, sVar8);
            if (z) {
                list = (List) a1VarF.getValue();
            } else {
                List list4 = (List) a1VarF.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj2).b, "adult")) {
                        arrayList2.add(obj2);
                    }
                }
                list = arrayList2;
            }
            Context context = (Context) sVar8.j(m0.b);
            Object objQ = sVar8.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            if (objQ == fVar3) {
                objQ = new g1(0);
                sVar8.l0(objQ);
            }
            g1 g1Var2 = (g1) objQ;
            Object objQ2 = sVar8.Q();
            if (objQ2 == fVar3) {
                objQ2 = new LinkedHashMap();
                sVar8.l0(objQ2);
            }
            Map map = (Map) objQ2;
            Object objQ3 = sVar8.Q();
            s sVar9 = sVar4;
            if (objQ3 == fVar3) {
                objQ3 = t.r(null);
                sVar8.l0(objQ3);
            }
            a1 a1Var = (a1) objQ3;
            List listK = z ? q.k("All", "Movies", "TV Shows", "Live TV", "Anime", "Adult") : q.k("All", "Movies", "TV Shows", "Live TV", "Anime");
            boolean zD = sVar8.d(g1Var2.g()) | sVar8.f(list) | ((458752 & i5) == 131072);
            Object objQ4 = sVar8.Q();
            if (zD || objQ4 == fVar3) {
                int iG = g1Var2.g();
                if (iG == 1) {
                    list2 = list;
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj3).b, "movie")) {
                            arrayList.add(obj3);
                        }
                    }
                } else if (iG != 2) {
                    if (iG == 3) {
                        list2 = list;
                        arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj4).b, "live_tv")) {
                                arrayList.add(obj4);
                            }
                        }
                    } else if (iG == 4) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            List list5 = list;
                            if (kotlin.text.r.u(((com.app.mlounge.data.local.entity.c) obj5).b, "anime", false)) {
                                arrayList3.add(obj5);
                            }
                            list = list5;
                        }
                        obj = list;
                        objQ4 = arrayList3;
                    } else if (iG == 5 && z) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : list) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj6).b, "adult")) {
                                arrayList4.add(obj6);
                            }
                        }
                        obj = list;
                        objQ4 = arrayList4;
                    } else {
                        objQ4 = list;
                        obj = objQ4;
                    }
                    sVar8.l0(objQ4);
                    r28 = obj;
                } else {
                    list2 = list;
                    arrayList = new ArrayList();
                    for (Object obj7 : list2) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj7).b, "tv")) {
                            arrayList.add(obj7);
                        }
                    }
                }
                objQ4 = arrayList;
                obj = list2;
                sVar8.l0(objQ4);
                r28 = obj;
            } else {
                r28 = list;
            }
            List list6 = (List) objQ4;
            boolean zH = sVar8.h(map);
            Object objQ5 = sVar8.Q();
            if (zH || objQ5 == fVar3) {
                objQ5 = new c(map, a1Var, null, 0);
                sVar8.l0(objQ5);
            }
            l0.c(sVar8, list6, (p) objQ5);
            e0 e0Var = i1.c;
            androidx.compose.foundation.layout.w wVarA = u.a(h.c, androidx.compose.ui.c.J, sVar8, 0);
            int iHashCode = Long.hashCode(sVar8.T);
            androidx.compose.runtime.internal.j jVarL = sVar8.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar8, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar4 = g.b;
            sVar8.e0();
            if (sVar8.S) {
                sVar8.k(fVar4);
            } else {
                sVar8.o0();
            }
            androidx.compose.ui.node.e eVar = g.f;
            t.x(sVar8, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = g.e;
            t.x(sVar8, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = g.g;
            t.p(sVar8, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = g.h;
            t.t(sVar8, dVar);
            androidx.compose.ui.node.e eVar4 = g.d;
            t.x(sVar8, rVarC, eVar4);
            o oVar2 = o.b;
            float f = 16;
            androidx.compose.ui.r rVarT = androidx.compose.foundation.layout.b.t(i1.e(oVar2, 1.0f), f, f, f, 4);
            androidx.compose.foundation.layout.d dVar2 = h.e;
            i iVar = androidx.compose.ui.c.H;
            f1 f1VarA = d1.a(dVar2, iVar, sVar8, 54);
            int iHashCode2 = Long.hashCode(sVar8.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar8.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar8, rVarT);
            sVar8.e0();
            if (sVar8.S) {
                sVar8.k(fVar4);
            } else {
                sVar8.o0();
            }
            t.x(sVar8, f1VarA, eVar);
            t.x(sVar8, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar8, eVar3, sVar8, dVar);
            t.x(sVar8, rVarC2, eVar4);
            x2 x2Var = n6.a;
            g1 g1Var3 = g1Var2;
            List list7 = listK;
            z5.b("Watch History", null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar8.j(x2Var)).e, sVar8, 390, 0, 131066);
            androidx.compose.runtime.s sVar10 = sVar8;
            f1 f1VarA2 = d1.a(h.a, iVar, sVar10, 48);
            int iHashCode3 = Long.hashCode(sVar10.T);
            androidx.compose.runtime.internal.j jVarL3 = sVar10.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar10, oVar2);
            sVar10.e0();
            if (sVar10.S) {
                sVar10.k(fVar4);
            } else {
                sVar10.o0();
            }
            t.x(sVar10, f1VarA2, eVar);
            t.x(sVar10, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar10, eVar3, sVar10, dVar);
            t.x(sVar10, rVarC3, eVar4);
            if (r28.isEmpty()) {
                i3 = 8;
                oVar = oVar2;
                sVar5 = sVar9;
                fVar = fVar3;
                z2 = false;
                sVar10.b0(733538486);
                sVar10.p(false);
            } else {
                sVar10.b0(733115646);
                oVar = oVar2;
                i3 = 8;
                z5.b(androidx.compose.runtime.j.d(r28.size(), " items"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar10.j(x2Var)).k, sVar2, 384, 0, 131066);
                androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, 8));
                boolean zH2 = sVar2.h(sVar9);
                Object objQ6 = sVar2.Q();
                if (zH2) {
                    fVar2 = fVar3;
                } else {
                    if (objQ6 != fVar2) {
                        fVar2 = fVar3;
                        sVar7 = sVar9;
                    }
                    sVar5 = sVar7;
                    fVar = fVar2;
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), null, false, null, null, null, null, a, sVar2, 805306368, 510);
                    sVar10 = sVar2;
                    z2 = false;
                    sVar10.p(false);
                }
                fVar2 = fVar3;
                sVar7 = sVar9;
                objQ6 = new s0(0, sVar7, s.class, "clearAll", "clearAll()V", 0, 7);
                sVar2.l0(objQ6);
                sVar5 = sVar7;
                fVar = fVar2;
                androidx.compose.material3.q.i((kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), null, false, null, null, null, null, a, sVar2, 805306368, 510);
                sVar10 = sVar2;
                z2 = false;
                sVar10.p(false);
            }
            sVar10.p(true);
            sVar10.p(true);
            float f2 = i3;
            androidx.compose.foundation.layout.b.e(sVar10, i1.g(oVar, f2));
            float f3 = 12;
            float f4 = f3;
            androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar10), z2), f4, 0.0f, f3, f2, 2);
            f1 f1VarA3 = d1.a(h.g(f2), iVar, sVar10, 54);
            int iHashCode4 = Long.hashCode(sVar10.T);
            androidx.compose.runtime.internal.j jVarL4 = sVar10.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar10, rVarU);
            sVar10.e0();
            if (sVar10.S) {
                sVar10.k(fVar4);
            } else {
                sVar10.o0();
            }
            t.x(sVar10, f1VarA3, eVar);
            t.x(sVar10, jVarL4, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar10, eVar3, sVar10, dVar);
            t.x(sVar10, rVarC4, eVar4);
            sVar10.b0(-1216276067);
            int i6 = 0;
            for (Object obj8 : list7) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    q.o();
                    throw null;
                }
                String str3 = (String) obj8;
                Object objQ7 = sVar10.Q();
                androidx.compose.runtime.f fVar5 = fVar;
                if (objQ7 == fVar5) {
                    objQ7 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar10);
                }
                k kVar = (k) objQ7;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar10, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                boolean zD2 = sVar10.d(i6);
                Object objQ8 = sVar10.Q();
                if (zD2 || objQ8 == fVar5) {
                    g1Var = g1Var3;
                    objQ8 = new b0(i6, g1Var);
                    sVar10.l0(objQ8);
                } else {
                    g1Var = g1Var3;
                }
                p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ8, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), g1Var.g() == i6 ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1241326664, new v1(i6, str3, g1Var), sVar10), sVar2, 12582912, 120);
                i6 = i7;
                fVar = fVar5;
                g1Var3 = g1Var;
                sVar10 = sVar2;
                f4 = f4;
            }
            float f5 = f4;
            g1 g1Var4 = g1Var3;
            androidx.compose.runtime.f fVar6 = fVar;
            sVar10.p(false);
            sVar10.p(true);
            if (list6.isEmpty()) {
                sVar10.b0(-1679187041);
                e0 e0Var2 = i1.c;
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                int iHashCode5 = Long.hashCode(sVar10.T);
                androidx.compose.runtime.internal.j jVarL5 = sVar10.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar10, e0Var2);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar7 = g.b;
                sVar10.e0();
                if (sVar10.S) {
                    sVar10.k(fVar7);
                } else {
                    sVar10.o0();
                }
                androidx.compose.ui.node.e eVar5 = g.f;
                t.x(sVar10, q0VarD, eVar5);
                androidx.compose.ui.node.e eVar6 = g.e;
                t.x(sVar10, jVarL5, eVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                androidx.compose.ui.node.e eVar7 = g.g;
                t.p(sVar10, numValueOf2, eVar7);
                androidx.compose.ui.node.d dVar3 = g.h;
                t.t(sVar10, dVar3);
                androidx.compose.ui.node.e eVar8 = g.d;
                t.x(sVar10, rVarC5, eVar8);
                androidx.compose.foundation.layout.w wVarA2 = u.a(h.c, androidx.compose.ui.c.K, sVar10, 48);
                int iHashCode6 = Long.hashCode(sVar10.T);
                androidx.compose.runtime.internal.j jVarL6 = sVar10.l();
                androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar10, oVar);
                sVar10.e0();
                if (sVar10.S) {
                    sVar10.k(fVar7);
                } else {
                    sVar10.o0();
                }
                t.x(sVar10, wVarA2, eVar5);
                t.x(sVar10, jVarL6, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, sVar10, eVar7, sVar10, dVar3);
                t.x(sVar10, rVarC6, eVar8);
                androidx.compose.ui.graphics.vector.f fVarU = coil3.svg.internal.a.u();
                long j = com.app.mlounge.ui.theme.b.m;
                q1.b(fVarU, null, i1.m(oVar, 64), j, sVar10, 3504, 0);
                androidx.compose.foundation.layout.b.e(sVar10, i1.g(oVar, f));
                if (g1Var4.g() == 0) {
                    str = "No watch history yet";
                    list3 = list7;
                } else {
                    list3 = list7;
                    String lowerCase = ((String) list3.get(g1Var4.g())).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str = "No " + lowerCase + " in your history";
                }
                String str4 = str;
                x2 x2Var2 = n6.a;
                z5.b(str4, null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar10.j(x2Var2)).g, sVar2, 384, 0, 131066);
                androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f2));
                if (g1Var4.g() == 0) {
                    str2 = "Content you watch will appear here";
                } else {
                    String lowerCase2 = ((String) list3.get(g1Var4.g())).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = "Watch some " + lowerCase2 + " and they'll appear here";
                }
                z5.b(str2, null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).k, sVar2, 384, 0, 130042);
                z3 = true;
                androidx.room.b0.g(sVar2, true, true, false);
                sVar8 = sVar2;
                sVar6 = sVar5;
            } else {
                androidx.compose.runtime.s sVar11 = sVar10;
                sVar11.b0(-1677657005);
                androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar11.j(com.app.mlounge.ui.theme.g.a)).y);
                androidx.compose.foundation.layout.f fVarG = h.g(f2);
                androidx.compose.foundation.layout.f fVarG2 = h.g(f2);
                z0 z0Var = new z0(f5, f5, f5, f5);
                e0 e0Var3 = i1.c;
                s sVar12 = sVar5;
                boolean zH3 = sVar11.h(list6) | sVar11.h(map) | sVar11.f(a1VarG) | ((i5 & 14) == 4) | ((i5 & Token.ASSIGN_MOD) == 32) | ((i5 & 7168) == 2048) | ((i5 & 896) == 256) | ((57344 & i5) == 16384) | sVar11.h(sVar12) | sVar11.h(context);
                Object objQ9 = sVar11.Q();
                if (zH3 || objQ9 == fVar6) {
                    y yVar = new y(list6, map, lVar, lVar2, rVar, lVar3, lVar4, aVar, sVar12, context, a1VarG, a1Var);
                    sVar6 = sVar12;
                    sVar11.l0(yVar);
                    objQ9 = yVar;
                } else {
                    sVar6 = sVar12;
                }
                v.b(aVar2, e0Var3, null, z0Var, fVarG2, fVarG, null, false, null, (l) objQ9, sVar11, 1772592, 916);
                sVar8 = sVar11;
                sVar8.p(false);
                z3 = true;
            }
            sVar8.p(z3);
            sVar3 = sVar6;
        } else {
            sVar8.W();
            sVar3 = sVar;
        }
        s1 s1VarT = sVar8.t();
        if (s1VarT != null) {
            s1VarT.d = new p(lVar2, lVar3, rVar, lVar4, z, aVar, sVar3, i) { // from class: com.app.mlounge.ui.screens.history.b
                public final /* synthetic */ r A;
                public final /* synthetic */ l B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ kotlin.jvm.functions.a D;
                public final /* synthetic */ s E;
                public final /* synthetic */ l y;
                public final /* synthetic */ l z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int iA = t.A(1572865);
                    a.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (androidx.compose.runtime.s) obj9, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
