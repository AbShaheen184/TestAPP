package androidx.compose.foundation.contextmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.lazy.layout.x;
import androidx.compose.foundation.s0;
import androidx.compose.foundation.text.contextmenu.internal.v;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.c1;
import androidx.compose.material3.d1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.y3;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.layout.n1;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.input.q;
import androidx.room.b0;
import com.app.mlounge.ui.screens.player.k0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        int i2 = 6;
        o oVar = o.b;
        int i3 = 16;
        androidx.compose.runtime.f fVar = n.a;
        int i4 = 2;
        y yVar = y.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((g) obj4).a((d) obj3, (s) obj, t.A(1));
                return yVar;
            case 1:
                androidx.compose.foundation.lazy.grid.a aVar = (androidx.compose.foundation.lazy.grid.a) obj4;
                androidx.compose.foundation.layout.e eVar = (androidx.compose.foundation.layout.e) obj3;
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) obj;
                androidx.compose.ui.unit.a aVar2 = (androidx.compose.ui.unit.a) obj2;
                if (androidx.compose.ui.unit.a.h(aVar2.a) == Integer.MAX_VALUE) {
                    androidx.compose.foundation.internal.b.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = androidx.compose.ui.unit.a.h(aVar2.a);
                int iI0 = cVar.i0(eVar.a());
                int iMax = Math.max((iH + iI0) / (cVar.i0(aVar.a) + iI0), 1);
                int i5 = iH - ((iMax - 1) * iI0);
                int i6 = i5 / iMax;
                int i7 = i5 % iMax;
                ArrayList arrayList = new ArrayList(iMax);
                int i8 = 0;
                while (i8 < iMax) {
                    arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
                    i8++;
                }
                int[] iArrA0 = kotlin.collections.p.a0(arrayList);
                int[] iArr = new int[iArrA0.length];
                eVar.c(cVar, iH, iArrA0, androidx.compose.ui.unit.m.e, iArr);
                return new androidx.compose.foundation.text.input.internal.o(5, iArrA0, iArr);
            case 2:
                x xVar = (x) obj4;
                w wVar = (w) obj3;
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.foundation.lazy.layout.y yVar2 = (androidx.compose.foundation.lazy.layout.y) xVar.b.invoke();
                    int iE = wVar.c;
                    Object obj5 = wVar.a;
                    if ((iE >= yVar2.a() || !yVar2.b(iE).equals(obj5)) && (iE = yVar2.e(obj5)) != -1) {
                        wVar.c = iE;
                    }
                    if (iE != -1) {
                        sVar.b0(-1664741271);
                        androidx.compose.foundation.lazy.layout.m.d(yVar2, xVar.a, iE, wVar.a, sVar, 0);
                        z = false;
                    } else {
                        z = false;
                        sVar.b0(-1668376610);
                    }
                    sVar.p(z);
                    boolean zH = sVar.h(wVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == fVar) {
                        objQ = new androidx.activity.compose.g(wVar, 12);
                        sVar.l0(objQ);
                    }
                    l0.b(obj5, (kotlin.jvm.functions.l) objQ, sVar);
                } else {
                    sVar.W();
                }
                return yVar;
            case 3:
                return ((c0) obj3).a(new d0((x) obj4, (n1) obj), ((androidx.compose.ui.unit.a) obj2).a);
            case 4:
                androidx.compose.runtime.internal.f fVar2 = (androidx.compose.runtime.internal.f) obj4;
                w0 w0Var = (w0) obj3;
                s sVar2 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fVar2.invoke(w0Var, sVar2, 0);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 5:
                androidx.compose.foundation.text.contextmenu.provider.e eVar2 = (androidx.compose.foundation.text.contextmenu.provider.e) obj4;
                androidx.compose.foundation.text.contextmenu.data.g gVar = (androidx.compose.foundation.text.contextmenu.data.g) obj3;
                s sVar3 = (s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF = sVar3.f(eVar2);
                    Object objQ2 = sVar3.Q();
                    if (zF || objQ2 == fVar) {
                        objQ2 = t.k(new s0(0, eVar2, androidx.compose.foundation.text.contextmenu.provider.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 1));
                        sVar3.l0(objQ2);
                    }
                    androidx.compose.foundation.text.contextmenu.internal.n.a(gVar, (androidx.compose.foundation.text.contextmenu.data.c) ((w2) objQ2).getValue(), sVar3, 0);
                } else {
                    sVar3.W();
                }
                return yVar;
            case 6:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.contextmenu.internal.n.a((androidx.compose.foundation.text.contextmenu.data.g) obj4, (androidx.compose.foundation.text.contextmenu.data.c) obj3, (s) obj, t.A(1));
                return yVar;
            case 7:
                ((Integer) obj2).getClass();
                ((v) obj4).d((Drawable) obj3, (s) obj, t.A(49));
                return yVar;
            case 8:
                ((Integer) obj2).getClass();
                androidx.work.impl.v.c((r) obj4, (androidx.compose.runtime.internal.f) obj3, (s) obj, t.A(49));
                return yVar;
            case 9:
                b1 b1Var = (b1) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                androidx.compose.foundation.text.contextmenu.builder.a aVar3 = (androidx.compose.foundation.text.contextmenu.builder.a) obj;
                Context context = (Context) obj2;
                boolean zJ = b1Var.j();
                androidx.compose.ui.text.g gVarM = b1Var.m();
                androidx.compose.ui.text.l0 l0Var = null;
                String str = gVarM != null ? gVarM.y : null;
                androidx.compose.ui.text.l0 l0Var2 = b1Var.w;
                if (l0Var2 != null) {
                    long j = l0Var2.a;
                    q qVar = b1Var.b;
                    l0Var = new androidx.compose.ui.text.l0(androidx.compose.ui.text.d0.b(qVar.v((int) (j >> 32)), qVar.v((int) (j & 4294967295L))));
                }
                androidx.compose.foundation.text.selection.n nVar = b1Var.j;
                androidx.compose.animation.core.a aVar4 = new androidx.compose.animation.core.a(8, b1Var, coroutineScope, context);
                x2 x2Var = androidx.compose.foundation.text.selection.v.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || l0Var == null || nVar == null || !(nVar instanceof androidx.compose.foundation.text.selection.t)) {
                    aVar4.invoke(aVar3);
                    if (str != null && l0Var != null) {
                        androidx.compose.foundation.text.contextmenu.b.a(aVar3, context, zJ, str, l0Var.a);
                    }
                } else {
                    String str2 = str;
                    ((androidx.compose.foundation.text.selection.t) nVar).b(aVar3, str2, l0Var.a, aVar4);
                    androidx.compose.foundation.text.contextmenu.b.a(aVar3, context, zJ, str2, l0Var.a);
                }
                return yVar;
            case 10:
                ((Integer) obj2).getClass();
                ((c1) obj4).a((com.google.firebase.messaging.n) obj3, (s) obj, t.A(1));
                return yVar;
            case 11:
                ((Integer) obj2).getClass();
                ((d1) obj4).a((y3) obj3, (s) obj, t.A(1));
                return yVar;
            case 12:
                androidx.compose.runtime.internal.l lVar = (androidx.compose.runtime.internal.l) obj4;
                k2 k2Var = (k2) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof androidx.compose.runtime.i) {
                    lVar.f.b((androidx.compose.runtime.i) obj2);
                } else if (!(obj2 instanceof f2)) {
                    if (obj2 instanceof c2) {
                        t.w(k2Var, iIntValue4, obj2);
                        lVar.e((c2) obj2);
                    } else if (obj2 instanceof s1) {
                        t.w(k2Var, iIntValue4, obj2);
                        ((s1) obj2).c();
                    }
                }
                return yVar;
            case 13:
                ((Integer) obj2).getClass();
                com.google.android.gms.dynamite.g.c((List) obj4, (Collection) obj3, (s) obj, t.A(1));
                return yVar;
            case 14:
                ((Integer) obj2).getClass();
                com.google.firebase.b.c((androidx.compose.runtime.saveable.d) obj4, (androidx.compose.runtime.internal.f) obj3, (s) obj, t.A(1));
                return yVar;
            case 15:
                String str3 = (String) obj3;
                s sVar4 = (s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r rVarR = androidx.compose.foundation.layout.b.r(oVar, 12, 8);
                    f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, sVar4, 54);
                    int iHashCode = Long.hashCode(sVar4.T);
                    androidx.compose.runtime.internal.j jVarL = sVar4.l();
                    r rVarC = androidx.compose.ui.a.c(sVar4, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(fVar3);
                    } else {
                        sVar4.o0();
                    }
                    t.x(sVar4, f1VarA, androidx.compose.ui.node.g.f);
                    t.x(sVar4, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar4, androidx.compose.ui.node.g.h);
                    t.x(sVar4, rVarC, androidx.compose.ui.node.g.d);
                    z5.b(str3, null, obj4 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).n, sVar4, 0, 0, 131066);
                    q1.b(okhttp3.internal.platform.android.g.i(), null, i1.m(oVar, 16), obj4 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, sVar4, 432, 0);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 16:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) obj4, (com.app.mlounge.ui.viewmodel.c) obj3, (s) obj, t.A(1));
                return yVar;
            case 17:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) obj4, (com.app.mlounge.ui.viewmodel.g) obj3, (s) obj, t.A(1));
                return yVar;
            case 18:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.downloads.a.b((kotlin.jvm.functions.s) obj4, (com.app.mlounge.ui.viewmodel.o) obj3, (s) obj, t.A(1));
                return yVar;
            case 19:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.d((p) obj4, (com.app.mlounge.ui.viewmodel.r) obj3, (s) obj, t.A(1));
                return yVar;
            case 20:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.c((kotlin.jvm.functions.s) obj4, (a0) obj3, (s) obj, t.A(1));
                return yVar;
            case 21:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) obj4, (f0) obj3, (s) obj, t.A(1));
                return yVar;
            case 22:
                androidx.compose.ui.graphics.vector.f fVar4 = (androidx.compose.ui.graphics.vector.f) obj4;
                String str4 = (String) obj3;
                s sVar5 = (s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 12);
                    f1 f1VarA2 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.d, androidx.compose.ui.c.H, sVar5, 54);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar5.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar5, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(fVar5);
                    } else {
                        sVar5.o0();
                    }
                    t.x(sVar5, f1VarA2, androidx.compose.ui.node.g.f);
                    t.x(sVar5, jVarL2, androidx.compose.ui.node.g.e);
                    t.p(sVar5, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                    t.t(sVar5, androidx.compose.ui.node.g.h);
                    t.x(sVar5, rVarC2, androidx.compose.ui.node.g.d);
                    r rVarM = i1.m(oVar, 16);
                    long j2 = com.app.mlounge.ui.theme.b.l;
                    q1.b(fVar4, null, rVarM, j2, sVar5, 3504, 0);
                    androidx.compose.foundation.layout.b.e(sVar5, i1.q(oVar, 6));
                    z5.b(str4, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(n6.a)).o, sVar5, 384, 0, 131066);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 23:
                ((Integer) obj2).getClass();
                k0.g((r) obj4, (kotlin.jvm.functions.a) obj3, (s) obj, t.A(1));
                return yVar;
            case 24:
                com.app.mlounge.ui.viewmodel.b1 b1Var2 = (com.app.mlounge.ui.viewmodel.b1) obj4;
                a1 a1Var = (a1) obj3;
                s sVar6 = (s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!sVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar6.W();
                } else if (((String) a1Var.getValue()).length() > 0) {
                    sVar6.b0(725214986);
                    boolean zH2 = sVar6.h(b1Var2);
                    Object objQ3 = sVar6.Q();
                    if (zH2 || objQ3 == fVar) {
                        objQ3 = new androidx.navigation.internal.h(b1Var2, 23);
                        sVar6.l0(objQ3);
                    }
                    androidx.compose.material3.q.e((kotlin.jvm.functions.a) objQ3, null, false, null, null, null, com.app.mlounge.ui.screens.search.a.c, sVar6, 1572864, 62);
                    sVar6.p(false);
                } else {
                    sVar6.b0(725407186);
                    sVar6.p(false);
                }
                return yVar;
            case 25:
                Context context2 = (Context) obj4;
                a1 a1Var2 = (a1) obj3;
                s sVar7 = (s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i9 = 1;
                if (sVar7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zH3 = sVar7.h(context2);
                    Object objQ4 = sVar7.Q();
                    if (zH3 || objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.screens.settings.x(context2, a1Var2, i9);
                        sVar7.l0(objQ4);
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.a, sVar7, 805306368, 510);
                } else {
                    sVar7.W();
                }
                return yVar;
            case 26:
                ((Integer) obj2).getClass();
                e0.p((p1) obj4, (com.app.mlounge.ui.viewmodel.k) obj3, (s) obj, t.A(1));
                return yVar;
            case 27:
                List list = (List) obj4;
                p pVar = (p) obj3;
                s sVar8 = (s) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                if (!sVar8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar8.W();
                } else if (list.isEmpty()) {
                    sVar8.b0(971480235);
                    z5.b("No other video players found on this device.", androidx.compose.foundation.layout.b.s(oVar, 0.0f, 16, 1), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar8.j(n6.a)).k, sVar8, 54, 0, 131064);
                    sVar8.p(false);
                } else {
                    s sVar9 = sVar8;
                    sVar9.b0(971810106);
                    r rVarQ2 = androidx.compose.foundation.s.q(oVar, androidx.compose.foundation.s.p(sVar9), true);
                    androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar9, 0);
                    int iHashCode3 = Long.hashCode(sVar9.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar9.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar9, rVarQ2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(fVar6);
                    } else {
                        sVar9.o0();
                    }
                    t.x(sVar9, wVarA, androidx.compose.ui.node.g.f);
                    t.x(sVar9, jVarL3, androidx.compose.ui.node.g.e);
                    t.p(sVar9, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                    t.t(sVar9, androidx.compose.ui.node.g.h);
                    t.x(sVar9, rVarC3, androidx.compose.ui.node.g.d);
                    sVar9.b0(-1461008085);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kotlin.k kVar = (kotlin.k) it.next();
                        String str5 = (String) kVar.e;
                        String str6 = (String) kVar.y;
                        Object objQ5 = sVar9.Q();
                        if (objQ5 == fVar) {
                            objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar9);
                        }
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ5;
                        r rVarG = androidx.compose.foundation.s.g(i1.e(oVar, 1.0f), i4, ((Boolean) _COROUTINE.a.B(kVar2, sVar9, i2).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                        boolean zF2 = sVar9.f(pVar) | sVar9.f(str5) | sVar9.f(str6);
                        Object objQ6 = sVar9.Q();
                        if (zF2 || objQ6 == fVar) {
                            objQ6 = new androidx.compose.foundation.gestures.g(21, pVar, str5, str6);
                            sVar9.l0(objQ6);
                        }
                        r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ6, 28), kVar2, 1);
                        float f = 12;
                        r rVarR2 = androidx.compose.foundation.layout.b.r(rVarN, 4, f);
                        f1 f1VarA3 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar9, 48);
                        int iHashCode4 = Long.hashCode(sVar9.T);
                        androidx.compose.runtime.internal.j jVarL4 = sVar9.l();
                        r rVarC4 = androidx.compose.ui.a.c(sVar9, rVarR2);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar7 = androidx.compose.ui.node.g.b;
                        sVar9.e0();
                        if (sVar9.S) {
                            sVar9.k(fVar7);
                        } else {
                            sVar9.o0();
                        }
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.f;
                        t.x(sVar9, f1VarA3, eVar3);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.e;
                        t.x(sVar9, jVarL4, eVar4);
                        Integer numValueOf = Integer.valueOf(iHashCode4);
                        androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.g;
                        t.p(sVar9, numValueOf, eVar5);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        t.t(sVar9, dVar);
                        Iterator it2 = it;
                        androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.d;
                        t.x(sVar9, rVarC4, eVar6);
                        androidx.compose.ui.graphics.vector.f fVarB = coil3.svg.internal.a.d;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.OndemandVideo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i10 = h0.a;
                            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                            gVar2.v(21.0f, 3.0f);
                            gVar2.t(3.0f, 3.0f);
                            gVar2.n(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
                            gVar2.A(12.0f);
                            gVar2.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                            gVar2.s(5.0f);
                            gVar2.A(2.0f);
                            gVar2.s(8.0f);
                            gVar2.A(-2.0f);
                            gVar2.s(5.0f);
                            gVar2.n(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            gVar2.t(23.0f, 5.0f);
                            gVar2.n(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
                            gVar2.l();
                            gVar2.v(21.0f, 17.0f);
                            gVar2.t(3.0f, 17.0f);
                            gVar2.t(3.0f, 5.0f);
                            gVar2.s(18.0f);
                            gVar2.A(12.0f);
                            gVar2.l();
                            gVar2.v(16.0f, 11.0f);
                            gVar2.u(-7.0f, 4.0f);
                            gVar2.t(9.0f, 7.0f);
                            gVar2.l();
                            androidx.compose.ui.graphics.vector.e.a(eVar7, gVar2.b, 0, p0Var);
                            fVarB = eVar7.b();
                            coil3.svg.internal.a.d = fVarB;
                        }
                        androidx.compose.ui.graphics.vector.f fVar8 = fVarB;
                        long j3 = com.app.mlounge.ui.theme.b.m;
                        s sVar10 = sVar9;
                        q1.b(fVar8, null, i1.m(oVar, 24), j3, sVar10, 432, 0);
                        sVar9 = sVar10;
                        androidx.compose.foundation.layout.b.e(sVar9, i1.q(oVar, f));
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var = new t0(1.0f, true);
                        androidx.compose.foundation.layout.w wVarA2 = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar9, 0);
                        androidx.compose.ui.h hVar2 = hVar;
                        int iHashCode5 = Long.hashCode(sVar9.T);
                        androidx.compose.runtime.internal.j jVarL5 = sVar9.l();
                        r rVarC5 = androidx.compose.ui.a.c(sVar9, t0Var);
                        sVar9.e0();
                        if (sVar9.S) {
                            sVar9.k(fVar7);
                        } else {
                            sVar9.o0();
                        }
                        t.x(sVar9, wVarA2, eVar3);
                        t.x(sVar9, jVarL5, eVar4);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar9, eVar5, sVar9, dVar);
                        t.x(sVar9, rVarC5, eVar6);
                        x2 x2Var2 = n6.a;
                        z5.b(str6, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar9.j(x2Var2)).k, sVar9, 0, 0, 131066);
                        str5.getClass();
                        z5.b(str5, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar9.j(x2Var2)).l, sVar9, 0, 0, 131066);
                        sVar9.p(true);
                        sVar9.p(true);
                        hVar = hVar2;
                        it = it2;
                        i2 = 6;
                        i4 = 2;
                    }
                    b0.g(sVar9, false, true, false);
                }
                return yVar;
            case 28:
                ((Integer) obj2).getClass();
                e0.i((kotlin.jvm.functions.l) obj4, (kotlin.jvm.functions.a) obj3, (s) obj, t.A(49));
                return yVar;
            default:
                androidx.activity.compose.t tVar = (androidx.activity.compose.t) obj4;
                a1 a1Var3 = (a1) obj3;
                s sVar11 = (s) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (sVar11.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zH4 = sVar11.h(tVar);
                    Object objQ7 = sVar11.Q();
                    if (zH4 || objQ7 == fVar) {
                        objQ7 = new com.app.mlounge.ui.screens.adult.b(i3, tVar, a1Var3);
                        sVar11.l0(objQ7);
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ7, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.t, sVar11, 805306368, 510);
                } else {
                    sVar11.W();
                }
                return yVar;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = obj2;
    }
}
