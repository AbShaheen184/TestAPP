package androidx.compose.foundation.contextmenu;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.b0;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.text.e1;
import androidx.compose.foundation.text.selection.k0;
import androidx.compose.foundation.text.selection.m0;
import androidx.compose.material3.internal.r0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.e0;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpCount;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.HiAnimeStats;
import com.app.mlounge.ui.f0;
import com.app.mlounge.ui.screens.player.c1;
import com.app.mlounge.ui.viewmodel.b1;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Typeface typeface;
        boolean z2;
        String strI;
        HiAnimeEpCount hiAnimeEpCountB;
        int i = this.e;
        int i2 = 6;
        o oVar = o.b;
        androidx.compose.runtime.f fVar = n.a;
        kotlin.coroutines.d dVar = null;
        y yVar = y.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        int i3 = 1;
        switch (i) {
            case 0:
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj5;
                d dVar2 = (d) obj4;
                s sVar = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ = sVar.Q();
                    if (objQ == fVar) {
                        objQ = new g();
                        sVar.l0(objQ);
                    }
                    g gVar = (g) objQ;
                    gVar.a.clear();
                    lVar.invoke(gVar);
                    gVar.a(dVar2, sVar, 0);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj5;
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) obj4;
                s sVar2 = (s) obj2;
                ((Integer) obj3).getClass();
                sVar2.b0(-102778667);
                Object objQ2 = sVar2.Q();
                Object obj6 = objQ2;
                if (objQ2 == fVar) {
                    CoroutineScope coroutineScopeF = l0.f(sVar2);
                    sVar2.l0(coroutineScopeF);
                    obj6 = coroutineScopeF;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                Object objQ3 = sVar2.Q();
                Object obj7 = objQ3;
                if (objQ3 == fVar) {
                    j1 j1VarR = t.r(null);
                    sVar2.l0(j1VarR);
                    obj7 = j1VarR;
                }
                a1 a1Var = (a1) obj7;
                a1 a1VarV = t.v(lVar2, sVar2);
                boolean zF = sVar2.f(kVar);
                Object objQ4 = sVar2.Q();
                Object obj8 = objQ4;
                if (zF || objQ4 == fVar) {
                    androidx.activity.compose.h hVar = new androidx.activity.compose.h(23, a1Var, kVar);
                    sVar2.l0(hVar);
                    obj8 = hVar;
                }
                l0.b(kVar, (kotlin.jvm.functions.l) obj8, sVar2);
                boolean zH = sVar2.h(coroutineScope) | sVar2.f(kVar) | sVar2.f(a1VarV);
                Object objQ5 = sVar2.Q();
                Object obj9 = objQ5;
                if (zH || objQ5 == fVar) {
                    e1 e1Var = new e1(coroutineScope, a1Var, kVar, a1VarV);
                    sVar2.l0(e1Var);
                    obj9 = e1Var;
                }
                r rVarA = h0.a(oVar, kVar, (PointerInputEventHandler) obj9);
                sVar2.p(false);
                return rVarA;
            case 2:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj5;
                s sVar3 = (s) obj2;
                ((Integer) obj3).getClass();
                sVar3.b0(759876635);
                Object objQ6 = sVar3.Q();
                Object obj10 = objQ6;
                if (objQ6 == fVar) {
                    g0 g0VarK = t.k(aVar);
                    sVar3.l0(g0VarK);
                    obj10 = g0VarK;
                }
                w2 w2Var = (w2) obj10;
                Object objQ7 = sVar3.Q();
                Object obj11 = objQ7;
                if (objQ7 == fVar) {
                    androidx.compose.animation.core.d dVar3 = new androidx.compose.animation.core.d(new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) w2Var.getValue()).a), m0.b, new androidx.compose.ui.geometry.b(m0.c), 8);
                    sVar3.l0(dVar3);
                    obj11 = dVar3;
                }
                androidx.compose.animation.core.d dVar4 = (androidx.compose.animation.core.d) obj11;
                boolean zH2 = sVar3.h(dVar4);
                Object objQ8 = sVar3.Q();
                Object obj12 = objQ8;
                if (zH2 || objQ8 == fVar) {
                    b0 b0Var = new b0(w2Var, dVar4, dVar, 14);
                    sVar3.l0(b0Var);
                    obj12 = b0Var;
                }
                l0.c(sVar3, yVar, (p) obj12);
                androidx.compose.animation.core.n nVar = dVar4.c;
                boolean zF2 = sVar3.f(nVar);
                Object objQ9 = sVar3.Q();
                if (zF2 || objQ9 == fVar) {
                    z = false;
                    objQ9 = new k0(nVar, false ? 1 : 0);
                    sVar3.l0(objQ9);
                } else {
                    z = false;
                }
                r rVar = (r) lVar3.invoke((kotlin.jvm.functions.a) objQ9);
                sVar3.p(z);
                return rVar;
            case 3:
                Spannable spannable = (Spannable) obj5;
                androidx.compose.ui.text.platform.c cVar = (androidx.compose.ui.text.platform.c) obj4;
                e0 e0Var = (e0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                androidx.compose.ui.text.font.r rVar2 = e0Var.f;
                androidx.compose.ui.text.font.k kVar2 = e0Var.c;
                if (kVar2 == null) {
                    kVar2 = androidx.compose.ui.text.font.k.z;
                }
                androidx.compose.ui.text.font.i iVar = e0Var.d;
                int i4 = iVar != null ? iVar.a : 0;
                androidx.compose.ui.text.font.j jVar = e0Var.e;
                int i5 = jVar != null ? jVar.a : 65535;
                androidx.compose.ui.text.platform.d dVar5 = (androidx.compose.ui.text.platform.d) cVar.y;
                androidx.compose.ui.text.font.t tVarB = ((androidx.compose.ui.text.font.e) dVar5.B).b(rVar2, kVar2, i4, i5);
                if (tVarB instanceof androidx.compose.ui.text.font.t) {
                    Object obj13 = tVarB.e;
                    obj13.getClass();
                    typeface = (Typeface) obj13;
                } else {
                    c2 c2Var = new c2(tVarB, dVar5.G);
                    dVar5.G = c2Var;
                    Object obj14 = c2Var.A;
                    obj14.getClass();
                    typeface = (Typeface) obj14;
                }
                spannable.setSpan(new androidx.compose.ui.text.android.style.b(typeface, 1), iIntValue2, iIntValue3, 33);
                return yVar;
            case 4:
                androidx.navigation.y yVar2 = (androidx.navigation.y) obj5;
                a1 a1Var2 = (a1) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                if (!f0.b(a1Var2)) {
                    a1Var2.setValue(Boolean.TRUE);
                    androidx.navigation.y.b(yVar2, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, 0, 0, 24));
                }
                return yVar;
            case 5:
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) obj4;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) obj5;
                s sVar4 = (s) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    List listC = hiAnimeDetailData.c();
                    List list = w.e;
                    if (listC == null) {
                        listC = list;
                    }
                    List listB = hiAnimeDetailData.b();
                    if (listB != null) {
                        list = listB;
                    }
                    ArrayList arrayListO = kotlin.collections.p.O(listC, list);
                    if (arrayListO.isEmpty()) {
                        sVar4.b0(-1229188770);
                        sVar4.p(false);
                    } else {
                        sVar4.b0(-1230135355);
                        androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar4, 0);
                        int iHashCode = Long.hashCode(sVar4.T);
                        androidx.compose.runtime.internal.j jVarL = sVar4.l();
                        r rVarC = androidx.compose.ui.a.c(sVar4, oVar);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar4.e0();
                        if (sVar4.S) {
                            sVar4.k(fVar2);
                        } else {
                            sVar4.o0();
                        }
                        t.x(sVar4, wVarA, androidx.compose.ui.node.g.f);
                        t.x(sVar4, jVarL, androidx.compose.ui.node.g.e);
                        t.p(sVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        t.t(sVar4, androidx.compose.ui.node.g.h);
                        t.x(sVar4, rVarC, androidx.compose.ui.node.g.d);
                        float f = 16;
                        androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar, f));
                        z5.b("Related Anime", androidx.compose.foundation.layout.b.s(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).h, sVar4, 438, 0, 131064);
                        float f2 = 8;
                        androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar, f2));
                        z0 z0VarB = androidx.compose.foundation.layout.b.b(2, f);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f2);
                        boolean zH3 = sVar4.h(arrayListO) | sVar4.f(lVar4);
                        Object objQ10 = sVar4.Q();
                        Object obj15 = objQ10;
                        if (zH3 || objQ10 == fVar) {
                            r0 r0Var = new r0(26, arrayListO, lVar4);
                            sVar4.l0(r0Var);
                            obj15 = r0Var;
                        }
                        android.support.v4.media.session.b.d(null, null, z0VarB, fVarG, null, null, false, null, (kotlin.jvm.functions.l) obj15, sVar4, 24960);
                        sVar4.p(true);
                        sVar4.p(false);
                    }
                } else {
                    sVar4.W();
                }
                return yVar;
            case 6:
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                HiAnimeMoreInfo hiAnimeMoreInfo = (HiAnimeMoreInfo) obj4;
                s sVar5 = (s) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    float f3 = 16;
                    r rVarS = androidx.compose.foundation.layout.b.s(oVar, f3, 0.0f, 2);
                    androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
                    androidx.compose.ui.i iVar2 = androidx.compose.ui.c.G;
                    f1 f1VarA = d1.a(tVar, iVar2, sVar5, 0);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar5.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar5, rVarS);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(fVar3);
                    } else {
                        sVar5.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    t.x(sVar5, f1VarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    t.x(sVar5, jVarL2, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    t.p(sVar5, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar6 = androidx.compose.ui.node.g.h;
                    t.t(sVar5, dVar6);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    t.x(sVar5, rVarC2, eVar4);
                    float f4 = 8;
                    coil3.compose.k.a(hiAnimeInfo.d(), hiAnimeInfo.c(), androidx.compose.ui.draw.h.a(i1.g(i1.q(oVar, 120), 180), androidx.compose.foundation.shape.e.a(f4)), null, androidx.compose.ui.layout.i.a, sVar5, 1572864, 1976);
                    androidx.compose.foundation.layout.b.e(sVar5, i1.q(oVar, f3));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarU = androidx.compose.foundation.layout.b.u(new t0(1.0f, true), 0.0f, f4, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.w wVarA2 = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar5, 0);
                    int iHashCode3 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar5.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar5, rVarU);
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(fVar3);
                    } else {
                        sVar5.o0();
                    }
                    t.x(sVar5, wVarA2, eVar);
                    t.x(sVar5, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar5, eVar3, sVar5, dVar6);
                    t.x(sVar5, rVarC3, eVar4);
                    String strC = hiAnimeInfo.c();
                    if (strC == null) {
                        strC = "";
                    }
                    String str4 = strC;
                    x2 x2Var = n6.a;
                    z5.b(str4, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).f, sVar5, 384, 0, 131066);
                    float f5 = 4;
                    androidx.compose.foundation.layout.b.e(sVar5, i1.g(oVar, f5));
                    f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar2, sVar5, 6);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar5.l();
                    r rVarC4 = androidx.compose.ui.a.c(sVar5, oVar);
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(fVar3);
                    } else {
                        sVar5.o0();
                    }
                    t.x(sVar5, f1VarA2, eVar);
                    t.x(sVar5, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar5, eVar3, sVar5, dVar6);
                    t.x(sVar5, rVarC4, eVar4);
                    HiAnimeStats hiAnimeStatsE = hiAnimeInfo.e();
                    String strD = hiAnimeStatsE != null ? hiAnimeStatsE.d() : null;
                    if (strD == null) {
                        sVar5.b0(1679240219);
                        z2 = false;
                        sVar5.p(false);
                    } else {
                        sVar5.b0(1679240220);
                        p5.a(null, androidx.compose.foundation.shape.e.a(f5), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1642406300, new com.app.mlounge.ui.components.r(strD, 2), sVar5), sVar5, 12583296, Token.DOT);
                        z2 = false;
                        sVar5.p(false);
                    }
                    HiAnimeStats hiAnimeStatsE2 = hiAnimeInfo.e();
                    String strC2 = hiAnimeStatsE2 != null ? hiAnimeStatsE2.c() : null;
                    if (strC2 == null) {
                        sVar5.b0(1679679799);
                        sVar5.p(z2);
                    } else {
                        sVar5.b0(1679679800);
                        p5.a(null, androidx.compose.foundation.shape.e.a(f5), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.h), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1293871835, new com.app.mlounge.ui.components.r(strC2, 3), sVar5), sVar5, 12583296, Token.DOT);
                        z2 = false;
                        sVar5.p(false);
                    }
                    String strC3 = hiAnimeMoreInfo != null ? hiAnimeMoreInfo.c() : null;
                    if (strC3 == null) {
                        sVar5.b0(1680114636);
                        sVar5.p(z2);
                    } else {
                        sVar5.b0(1680114637);
                        z5.b("★ ".concat(strC3), null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).n, sVar5, 384, 0, 131066);
                        sVar5.p(false);
                    }
                    sVar5.p(true);
                    androidx.compose.foundation.layout.b.e(sVar5, i1.g(oVar, f5));
                    HiAnimeStats hiAnimeStatsE3 = hiAnimeInfo.e();
                    String strE = hiAnimeStatsE3 != null ? hiAnimeStatsE3.e() : null;
                    HiAnimeStats hiAnimeStatsE4 = hiAnimeInfo.e();
                    String strA = hiAnimeStatsE4 != null ? hiAnimeStatsE4.a() : null;
                    HiAnimeStats hiAnimeStatsE5 = hiAnimeInfo.e();
                    if (hiAnimeStatsE5 == null || (hiAnimeEpCountB = hiAnimeStatsE5.b()) == null) {
                        strI = null;
                    } else {
                        Integer numB = hiAnimeEpCountB.b();
                        String strD2 = numB != null ? androidx.compose.runtime.j.d(numB.intValue(), " sub") : null;
                        Integer numA = hiAnimeEpCountB.a();
                        strI = kotlin.collections.p.I(kotlin.collections.o.q(new String[]{strD2, numA != null ? androidx.compose.runtime.j.d(numA.intValue(), " dub") : null}), ", ", null, null, null, 62);
                    }
                    String strI2 = kotlin.collections.p.I(kotlin.collections.o.q(new String[]{strE, strA, strI}), " • ", null, null, null, 62);
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar5.j(x2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.m;
                    z5.b(strI2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar5, 384, 0, 131066);
                    List listB2 = hiAnimeMoreInfo != null ? hiAnimeMoreInfo.b() : null;
                    if (listB2 == null) {
                        sVar5.b0(272150209);
                        sVar5.p(false);
                    } else {
                        sVar5.b0(272150210);
                        z5.b(kotlin.collections.p.I(listB2, ", ", null, null, null, 62), null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).l, sVar5, 384, 0, 131066);
                        sVar5.p(false);
                    }
                    sVar5.p(true);
                    sVar5.p(true);
                    androidx.compose.foundation.layout.b.e(sVar5, i1.g(oVar, f3));
                } else {
                    sVar5.W();
                }
                return yVar;
            case 7:
                c1 c1Var = (c1) obj5;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj4;
                s sVar6 = (s) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarX = _COROUTINE.b.x();
                    boolean z3 = c1Var == null;
                    boolean zF3 = sVar6.f(aVar2);
                    Object objQ11 = sVar6.Q();
                    if (zF3 || objQ11 == fVar) {
                        objQ11 = new androidx.compose.material3.x2(13, aVar2);
                        sVar6.l0(objQ11);
                    }
                    com.app.mlounge.ui.screens.player.k0.i("Off", fVarX, z3, null, (kotlin.jvm.functions.a) objQ11, sVar6, 6, 8);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 8:
                b1 b1Var = (b1) obj5;
                a1 a1Var3 = (a1) obj4;
                s sVar7 = (s) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    sVar7.W();
                    return yVar;
                }
                List listK = kotlin.collections.q.k("SNES", "Sega Genesis", "NES");
                float f6 = 8;
                r rVarU2 = androidx.compose.foundation.layout.b.u(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar7), false), 0.0f, 0.0f, 0.0f, f6, 7);
                f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(f6), androidx.compose.ui.c.G, sVar7, 6);
                int iHashCode5 = Long.hashCode(sVar7.T);
                androidx.compose.runtime.internal.j jVarL5 = sVar7.l();
                r rVarC5 = androidx.compose.ui.a.c(sVar7, rVarU2);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                sVar7.e0();
                if (sVar7.S) {
                    sVar7.k(fVar4);
                } else {
                    sVar7.o0();
                }
                t.x(sVar7, f1VarA3, androidx.compose.ui.node.g.f);
                t.x(sVar7, jVarL5, androidx.compose.ui.node.g.e);
                t.p(sVar7, Integer.valueOf(iHashCode5), androidx.compose.ui.node.g.g);
                t.t(sVar7, androidx.compose.ui.node.g.h);
                t.x(sVar7, rVarC5, androidx.compose.ui.node.g.d);
                sVar7.b0(-1327938921);
                int i6 = 0;
                for (Object obj16 : listK) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        kotlin.collections.q.o();
                        throw null;
                    }
                    String str5 = (String) obj16;
                    Object objQ12 = sVar7.Q();
                    if (objQ12 == fVar) {
                        objQ12 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar7);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ12;
                    y yVar3 = yVar;
                    r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f6)), 2, ((Boolean) _COROUTINE.a.B(kVar3, sVar7, i2).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f6));
                    boolean zH4 = sVar7.h(b1Var) | sVar7.d(i6);
                    Object objQ13 = sVar7.Q();
                    if (zH4 || objQ13 == fVar) {
                        objQ13 = new com.app.mlounge.ui.screens.search.c(b1Var, i6, 0);
                        sVar7.l0(objQ13);
                    }
                    p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) objQ13, 28), kVar3, i3), androidx.compose.foundation.shape.e.a(f6), ((Number) a1Var3.getValue()).intValue() == i6 ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1303824763, new com.app.mlounge.ui.screens.search.b(i6, str5, a1Var3, 1), sVar7), sVar7, 12582912, 120);
                    i6 = i7;
                    yVar = yVar3;
                    i2 = 6;
                    i3 = 1;
                }
                y yVar4 = yVar;
                sVar7.p(false);
                sVar7.p(true);
                return yVar4;
            case 9:
                p1 p1Var = (p1) obj5;
                w2 w2Var2 = (w2) obj4;
                s sVar8 = (s) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((x) obj).getClass();
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String str6 = ((Boolean) w2Var2.getValue()).booleanValue() ? "Orientation follows device rotation" : "Forced landscape mode";
                    boolean zBooleanValue = ((Boolean) w2Var2.getValue()).booleanValue();
                    boolean zH5 = sVar8.h(p1Var);
                    Object objQ14 = sVar8.Q();
                    if (zH5 || objQ14 == fVar) {
                        objQ14 = new com.app.mlounge.ui.screens.settings.u(p1Var, i2);
                        sVar8.l0(objQ14);
                    }
                    kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ14;
                    androidx.compose.ui.graphics.vector.f fVarB = coil3.svg.internal.a.e;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.ScreenRotation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(16.48f, 2.52f);
                        gVarJ.n(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
                        gVarJ.s(1.5f);
                        gVarJ.m(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
                        gVarJ.u(-0.66f, 0.03f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVarJ, 3.81f, 3.81f, 1.33f, -1.32f);
                        gVarJ.v(10.23f, 1.75f);
                        gVarJ.n(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
                        gVarJ.t(1.75f, 8.11f);
                        gVarJ.n(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
                        gVarJ.u(12.02f, 12.02f);
                        gVarJ.n(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
                        gVarJ.u(6.36f, -6.36f);
                        gVarJ.n(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
                        gVarJ.t(10.23f, 1.75f);
                        gVarJ.l();
                        gVarJ.v(14.83f, 21.19f);
                        gVarJ.t(2.81f, 9.17f);
                        gVarJ.u(6.36f, -6.36f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVarJ, 12.02f, 12.02f, -6.36f, 6.36f);
                        gVarJ.v(7.52f, 21.48f);
                        gVarJ.m(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
                        gVarJ.t(0.05f, 13.0f);
                        gVarJ.m(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
                        gVarJ.u(0.66f, -0.03f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVarJ, -3.81f, -3.81f, -1.33f, 1.32f);
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVarJ.b, 0, p0Var);
                        fVarB = eVar5.b();
                        coil3.svg.internal.a.e = fVarB;
                    }
                    com.app.mlounge.ui.screens.settings.e0.r("Allow Portrait Orientation", str6, zBooleanValue, lVar5, fVarB, false, sVar8, 6, 32);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 10:
                a1 a1Var4 = (a1) obj5;
                a1 a1Var5 = (a1) obj4;
                s sVar9 = (s) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((x) obj).getClass();
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB2 = android.support.v4.media.session.b.f;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.SystemUpdate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i9 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.v(17.0f, 1.01f);
                        gVar2.t(7.0f, 1.0f);
                        gVar2.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVar2.A(18.0f);
                        gVar2.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar2.s(10.0f);
                        gVar2.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar2.t(19.0f, 3.0f);
                        gVar2.n(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                        gVar2.l();
                        gVar2.v(17.0f, 19.0f);
                        gVar2.t(7.0f, 19.0f);
                        gVar2.t(7.0f, 5.0f);
                        gVar2.s(10.0f);
                        gVar2.A(14.0f);
                        gVar2.l();
                        gVar2.v(16.0f, 13.0f);
                        gVar2.s(-3.0f);
                        gVar2.t(13.0f, 8.0f);
                        gVar2.s(-2.0f);
                        gVar2.A(5.0f);
                        gVar2.t(8.0f, 13.0f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar2, 4.0f, 4.0f, 4.0f, -4.0f);
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.b, 0, p0Var2);
                        fVarB2 = eVar6.b();
                        android.support.v4.media.session.b.f = fVarB2;
                    }
                    androidx.compose.ui.graphics.vector.f fVar5 = fVarB2;
                    Object objQ15 = sVar9.Q();
                    if (objQ15 == fVar) {
                        objQ15 = new com.app.mlounge.ui.screens.settings.q(a1Var4, 12);
                        sVar9.l0(objQ15);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Check for Updates", "Check for new versions of CinemaHQ", fVar5, null, (kotlin.jvm.functions.a) objQ15, sVar9, 24630, 8);
                    androidx.compose.ui.graphics.vector.f fVarB3 = coil3.network.g.d;
                    if (fVarB3 == null) {
                        androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.NewReleases", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var3 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar3.v(23.0f, 12.0f);
                        gVar3.u(-2.44f, -2.78f);
                        gVar3.u(0.34f, -3.68f);
                        gVar3.u(-3.61f, -0.82f);
                        gVar3.u(-1.89f, -3.18f);
                        gVar3.t(12.0f, 3.0f);
                        gVar3.t(8.6f, 1.54f);
                        gVar3.t(6.71f, 4.72f);
                        gVar3.u(-3.61f, 0.81f);
                        gVar3.u(0.34f, 3.68f);
                        gVar3.t(1.0f, 12.0f);
                        gVar3.u(2.44f, 2.78f);
                        gVar3.u(-0.34f, 3.69f);
                        gVar3.u(3.61f, 0.82f);
                        gVar3.u(1.89f, 3.18f);
                        gVar3.t(12.0f, 21.0f);
                        gVar3.u(3.4f, 1.46f);
                        gVar3.u(1.89f, -3.18f);
                        gVar3.u(3.61f, -0.82f);
                        gVar3.u(-0.34f, -3.68f);
                        gVar3.t(23.0f, 12.0f);
                        gVar3.l();
                        gVar3.v(13.0f, 17.0f);
                        gVar3.s(-2.0f);
                        gVar3.A(-2.0f);
                        gVar3.s(2.0f);
                        gVar3.A(2.0f);
                        gVar3.l();
                        gVar3.v(13.0f, 13.0f);
                        gVar3.s(-2.0f);
                        gVar3.t(11.0f, 7.0f);
                        gVar3.s(2.0f);
                        gVar3.A(6.0f);
                        gVar3.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar7, gVar3.b, 0, p0Var3);
                        fVarB3 = eVar7.b();
                        coil3.network.g.d = fVarB3;
                    }
                    androidx.compose.ui.graphics.vector.f fVar6 = fVarB3;
                    Object objQ16 = sVar9.Q();
                    if (objQ16 == fVar) {
                        objQ16 = new com.app.mlounge.ui.screens.settings.q(a1Var5, 13);
                        sVar9.l0(objQ16);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Changelog", "View latest changes", fVar6, null, (kotlin.jvm.functions.a) objQ16, sVar9, 24630, 8);
                    androidx.compose.ui.graphics.vector.f fVarB4 = com.google.firebase.b.d;
                    if (fVarB4 == null) {
                        androidx.compose.ui.graphics.vector.e eVar8 = new androidx.compose.ui.graphics.vector.e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var4 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarJ2 = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 2.0f);
                        gVarJ2.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        gVarJ2.x(4.48f, 10.0f, 10.0f, 10.0f);
                        gVarJ2.x(10.0f, -4.48f, 10.0f, -10.0f);
                        gVarJ2.w(17.52f, 2.0f, 12.0f, 2.0f);
                        gVarJ2.l();
                        gVarJ2.v(13.0f, 17.0f);
                        gVarJ2.s(-2.0f);
                        gVarJ2.A(-6.0f);
                        gVarJ2.s(2.0f);
                        gVarJ2.A(6.0f);
                        gVarJ2.l();
                        gVarJ2.v(13.0f, 9.0f);
                        gVarJ2.s(-2.0f);
                        gVarJ2.t(11.0f, 7.0f);
                        gVarJ2.s(2.0f);
                        gVarJ2.A(2.0f);
                        gVarJ2.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar8, gVarJ2.b, 0, p0Var4);
                        fVarB4 = eVar8.b();
                        com.google.firebase.b.d = fVarB4;
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Version", "8.2", fVarB4, null, null, sVar9, 54, 24);
                } else {
                    sVar9.W();
                }
                return yVar;
            default:
                return BufferedChannel.bindCancellationFun$lambda$89((kotlin.jvm.functions.l) obj5, obj4, (Throwable) obj, obj2, (kotlin.coroutines.j) obj3);
        }
    }

    public /* synthetic */ i(Object obj, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.z = obj;
        this.y = lVar;
    }
}
