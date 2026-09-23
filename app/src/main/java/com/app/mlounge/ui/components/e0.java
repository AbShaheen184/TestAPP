package com.app.mlounge.ui.components;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.s1;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.x2;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.c2;
import com.app.mlounge.ui.viewmodel.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e0(b2 b2Var, TmdbTvDetailResponse tmdbTvDetailResponse, String str) {
        this.e = 6;
        this.z = b2Var;
        this.A = tmdbTvDetailResponse;
        this.y = str;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
        c2 c2Var = (c2) this.z;
        a1 a1Var = (a1) this.A;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.layout.x) obj).getClass();
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (c2 c2Var2 : c2.A) {
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(2120706805, new com.app.mlounge.ui.screens.tvshows.r(c2Var2, c2Var, 1), sVar);
                boolean zF = sVar.f(lVar) | sVar.d(c2Var2.ordinal());
                Object objQ = sVar.Q();
                if (zF || objQ == androidx.compose.runtime.n.a) {
                    objQ = new androidx.compose.foundation.gestures.g(22, lVar, c2Var2, a1Var);
                    sVar.l0(objQ);
                }
                androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ, null, false, null, null, sVar, 6);
            }
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        boolean z;
        boolean z2;
        androidx.compose.ui.o oVar;
        float f;
        Integer num;
        int i = this.e;
        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        kotlin.y yVar = kotlin.y.a;
        Object obj4 = this.y;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
                    androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.g(i1.e(oVar2, 1.0f), 120), 8);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(dVar, hVar, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
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
                    Context context = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
                    Resources resources = (Resources) sVar.j(androidx.compose.ui.platform.m0.c);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = androidx.core.content.res.j.a;
                    long jC = androidx.compose.ui.graphics.a0.c(resources.getColor(R.color.gray_medium, theme));
                    if (str == null || kotlin.text.k.J(str)) {
                        sVar.b0(-1543719673);
                        q1.a(com.google.firebase.b.S(R.drawable.ic_menu_live_tv, sVar), str2, i1.m(oVar2, 42), jC, sVar, 392);
                        sVar.p(false);
                    } else {
                        sVar.b0(-1543436798);
                        Object objQ = sVar.Q();
                        if (objQ == fVar) {
                            objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                            sVar.l0(objQ);
                        }
                        a1 a1Var = (a1) objQ;
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            sVar.b0(-1543332173);
                            q1.a(com.google.firebase.b.S(R.drawable.ic_menu_live_tv, sVar), str2, i1.m(oVar2, 42), jC, sVar, 392);
                            z = false;
                            sVar.p(false);
                        } else {
                            sVar.b0(-1543018794);
                            androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_menu_live_tv, sVar);
                            androidx.compose.ui.graphics.painter.b bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_live_tv, sVar);
                            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(i1.m(oVar2, 42), androidx.compose.foundation.shape.e.a(6));
                            Object objQ2 = sVar.Q();
                            if (objQ2 == fVar) {
                                objQ2 = new m2(a1Var, 8);
                                sVar.l0(objQ2);
                            }
                            coil3.compose.k.c(str, str2, rVarA, bVarS, bVarS2, (kotlin.jvm.functions.l) objQ2, androidx.compose.ui.layout.i.b, sVar, 100700160, 6, 31456);
                            str2 = str2;
                            z = false;
                            sVar.p(false);
                        }
                        sVar.p(z);
                    }
                    androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar2, 6));
                    x2 x2Var = n6.a;
                    z5.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 2, false, 2, 0, ((m6) sVar.j(x2Var)).n, sVar, 384, 24960, 109562);
                    z5.b(str3 == null ? "" : str3, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar.j(x2Var)).o, sVar, 384, 24960, 110586);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                TmdbPersonDetail tmdbPersonDetail = (TmdbPersonDetail) obj4;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj6;
                a1 a1Var2 = (a1) obj5;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                    androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(cVar, hVar2, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.o oVar3 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, oVar3);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar2, wVarA2, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar2, dVar2);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                    androidx.compose.ui.r rVarE = androidx.compose.foundation.s.e(i1.g(i1.e(oVar3, 1.0f), org.mozilla.javascript.Context.VERSION_ES6), androidx.work.impl.model.f.t(kotlin.collections.q.k(new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.b), new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.a)), 0.0f, 0.0f, 14));
                    androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar2, rVarE);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, q0VarD, eVar);
                    androidx.compose.runtime.t.x(sVar2, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar2);
                    androidx.compose.runtime.t.x(sVar2, rVarC3, eVar4);
                    androidx.compose.material3.q.e(aVar, androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.t.e(oVar3, jVar), 8), false, null, null, null, com.app.mlounge.ui.screens.person.a.a, sVar2, 1572864, 60);
                    float f2 = 16;
                    androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.t.e(oVar3, androidx.compose.ui.c.D), f2);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.G, sVar2, 0);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar2.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar2, rVarQ2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                    androidx.compose.runtime.t.x(sVar2, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar3, sVar2, dVar2);
                    androidx.compose.runtime.t.x(sVar2, rVarC4, eVar4);
                    coil3.compose.k.a(androidx.compose.runtime.j.i("https://image.tmdb.org/t/p/w500", tmdbPersonDetail.f()), tmdbPersonDetail.d(), androidx.compose.ui.draw.h.a(i1.m(oVar3, 100), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, sVar2, 1572864, 1976);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar3, f2));
                    s1 s1Var = new s1();
                    androidx.compose.foundation.layout.w wVarA3 = androidx.compose.foundation.layout.u.a(cVar, hVar2, sVar2, 0);
                    int iHashCode5 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL5 = sVar2.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar2, s1Var);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, wVarA3, eVar);
                    androidx.compose.runtime.t.x(sVar2, jVarL5, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar2, eVar3, sVar2, dVar2);
                    androidx.compose.runtime.t.x(sVar2, rVarC5, eVar4);
                    String strD = tmdbPersonDetail.d();
                    String str4 = strD == null ? "" : strD;
                    x2 x2Var2 = n6.a;
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var2)).f;
                    long j = com.app.mlounge.ui.theme.b.l;
                    z5.b(str4, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 384, 0, 131066);
                    String strC = tmdbPersonDetail.c();
                    if (strC == null) {
                        sVar2.b0(1921364625);
                        z2 = false;
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1921364626);
                        z5.b(strC, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).l, sVar2, 384, 0, 131066);
                        z2 = false;
                        sVar2.p(false);
                    }
                    String strB = tmdbPersonDetail.b();
                    if (strB == null) {
                        sVar2.b0(1921578060);
                        sVar2.p(z2);
                    } else {
                        sVar2.b0(1921578061);
                        z5.b("Born: ".concat(strB), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).l, sVar2, 384, 0, 131066);
                        z2 = false;
                        sVar2.p(false);
                    }
                    String strE = tmdbPersonDetail.e();
                    if (strE == null) {
                        sVar2.b0(1921799989);
                        sVar2.p(z2);
                    } else {
                        sVar2.b0(1921799990);
                        z5.b(strE, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).l, sVar2, 384, 0, 131066);
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                    sVar2.p(true);
                    sVar2.p(true);
                    String strA = tmdbPersonDetail.a();
                    String str5 = (strA == null || kotlin.text.k.J(strA)) ? null : strA;
                    if (str5 == null) {
                        sVar2.b0(-1112868100);
                        sVar2.p(false);
                        oVar = oVar3;
                    } else {
                        sVar2.b0(-1112868099);
                        oVar = oVar3;
                        z5.b("Biography", androidx.compose.foundation.layout.b.u(oVar3, 0.0f, 12, 0.0f, 0.0f, 13), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).h, sVar2, 438, 0, 131064);
                        z5.b(str5, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 8, 0, ((m6) sVar2.j(x2Var2)).l, sVar2, 384, 24960, 110586);
                        sVar2.p(false);
                    }
                    if (((List) a1Var2.getValue()).isEmpty()) {
                        sVar2.b0(-1112171560);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(-1112414693);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 12));
                        z5.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Filmography (", ((List) a1Var2.getValue()).size(), ")"), null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).h, sVar2, 384, 0, 131066);
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 2:
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj4;
                List list = (List) obj6;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj5;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    androidx.compose.foundation.layout.w wVarA4 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, 0);
                    int iHashCode6 = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL6 = sVar3.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar3, oVar2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar4);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, wVarA4, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL6, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode6), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar3, rVarC6, androidx.compose.ui.node.g.d);
                    com.app.mlounge.ui.screens.player.k0.e("Audio Track", aVar2, sVar3, 6);
                    androidx.compose.material3.q.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.d), sVar3, 384, 3);
                    float f3 = 8;
                    z0 z0Var = new z0(f3, f3, f3, f3);
                    boolean zH = sVar3.h(list) | sVar3.f(lVar);
                    Object objQ3 = sVar3.Q();
                    if (zH || objQ3 == fVar) {
                        objQ3 = new com.app.mlounge.ui.screens.player.s(0, list, lVar);
                        sVar3.l0(objQ3);
                    }
                    android.support.v4.media.session.b.c(null, null, z0Var, null, null, null, false, null, (kotlin.jvm.functions.l) objQ3, sVar3, 384, 507);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return yVar;
            case 3:
                List list2 = (List) obj4;
                a1 a1Var3 = (a1) obj6;
                a1 a1Var4 = (a1) obj5;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1026691958, new androidx.compose.material3.m(a1Var3, 6), sVar4);
                    Object objQ4 = sVar4.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.a0(a1Var3, a1Var4, 1);
                        sVar4.l0(objQ4);
                    }
                    androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ4, null, false, null, null, sVar4, 54);
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj7 : list2) {
                        if (!kotlin.text.k.J((String) obj7)) {
                            arrayList.add(obj7);
                        }
                    }
                    for (String str6 : arrayList) {
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(1791810362, new com.app.mlounge.ui.screens.player.i(str6, a1Var3, 0), sVar4);
                        boolean zF = sVar4.f(str6);
                        Object objQ5 = sVar4.Q();
                        if (zF || objQ5 == fVar) {
                            objQ5 = new androidx.compose.foundation.gestures.g(18, str6, a1Var3, a1Var4);
                            sVar4.l0(objQ5);
                        }
                        androidx.compose.material3.p.b(fVarC2, (kotlin.jvm.functions.a) objQ5, null, false, null, null, sVar4, 6);
                    }
                } else {
                    sVar4.W();
                }
                return yVar;
            case 4:
                com.app.mlounge.ui.theme.a aVar3 = (com.app.mlounge.ui.theme.a) obj4;
                p1 p1Var = (p1) obj6;
                com.app.mlounge.ui.theme.c cVar2 = (com.app.mlounge.ui.theme.c) obj5;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB = coil3.network.g.c;
                    if (fVarB != null) {
                        f = 5.0f;
                    } else {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.GridView", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(3.0f, 3.0f);
                        gVar.A(8.0f);
                        gVar.s(8.0f);
                        gVar.t(11.0f, 3.0f);
                        gVar.t(3.0f, 3.0f);
                        gVar.l();
                        gVar.v(9.0f, 9.0f);
                        gVar.t(5.0f, 9.0f);
                        gVar.t(5.0f, 5.0f);
                        gVar.s(4.0f);
                        gVar.A(4.0f);
                        gVar.l();
                        gVar.v(3.0f, 13.0f);
                        gVar.A(8.0f);
                        gVar.s(8.0f);
                        gVar.A(-8.0f);
                        gVar.t(3.0f, 13.0f);
                        gVar.l();
                        gVar.v(9.0f, 19.0f);
                        gVar.t(5.0f, 19.0f);
                        gVar.A(-4.0f);
                        gVar.s(4.0f);
                        gVar.A(4.0f);
                        gVar.l();
                        gVar.v(13.0f, 3.0f);
                        gVar.A(8.0f);
                        gVar.s(8.0f);
                        gVar.t(21.0f, 3.0f);
                        gVar.s(-8.0f);
                        gVar.l();
                        gVar.v(19.0f, 9.0f);
                        gVar.s(-4.0f);
                        f = 5.0f;
                        gVar.t(15.0f, 5.0f);
                        gVar.s(4.0f);
                        gVar.A(4.0f);
                        gVar.l();
                        gVar.v(13.0f, 13.0f);
                        gVar.A(8.0f);
                        gVar.s(8.0f);
                        gVar.A(-8.0f);
                        gVar.s(-8.0f);
                        gVar.l();
                        gVar.v(19.0f, 19.0f);
                        gVar.s(-4.0f);
                        gVar.A(-4.0f);
                        gVar.s(4.0f);
                        gVar.A(4.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 1, p0Var);
                        fVarB = eVar5.b();
                        coil3.network.g.c = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar5 = fVarB;
                    kotlin.enums.c cVar3 = com.app.mlounge.ui.theme.a.B;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(cVar3, 10));
                    Iterator it = cVar3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((com.app.mlounge.ui.theme.a) it.next()).e);
                    }
                    String str7 = aVar3.e;
                    boolean zH2 = sVar5.h(p1Var);
                    Object objQ6 = sVar5.Q();
                    if (zH2 || objQ6 == fVar) {
                        objQ6 = new com.app.mlounge.ui.screens.settings.u(p1Var, 0);
                        sVar5.l0(objQ6);
                    }
                    com.app.mlounge.ui.screens.settings.e0.n("Card Size", "Size of content cards in grids", fVar5, arrayList2, str7, (kotlin.jvm.functions.l) objQ6, sVar5, 54);
                    androidx.compose.ui.graphics.vector.f fVarB2 = androidx.work.impl.v.C;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.TextFields", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.v(2.5f, 4.0f);
                        gVar2.A(3.0f);
                        gVar2.s(f);
                        gVar2.A(12.0f);
                        gVar2.s(3.0f);
                        gVar2.z(7.0f);
                        gVar2.s(f);
                        gVar2.z(4.0f);
                        gVar2.r(2.5f);
                        gVar2.l();
                        gVar2.v(21.5f, 9.0f);
                        gVar2.s(-9.0f);
                        gVar2.A(3.0f);
                        gVar2.s(3.0f);
                        gVar2.A(7.0f);
                        gVar2.s(3.0f);
                        gVar2.A(-7.0f);
                        gVar2.s(3.0f);
                        gVar2.z(9.0f);
                        gVar2.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.b, 0, p0Var2);
                        fVarB2 = eVar6.b();
                        androidx.work.impl.v.C = fVarB2;
                    }
                    androidx.compose.ui.graphics.vector.f fVar6 = fVarB2;
                    kotlin.enums.c cVar4 = com.app.mlounge.ui.theme.c.B;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(cVar4, 10));
                    Iterator it2 = cVar4.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((com.app.mlounge.ui.theme.c) it2.next()).e);
                    }
                    String str8 = cVar2.e;
                    boolean zH3 = sVar5.h(p1Var);
                    Object objQ7 = sVar5.Q();
                    if (zH3 || objQ7 == fVar) {
                        objQ7 = new com.app.mlounge.ui.screens.settings.u(p1Var, 1);
                        sVar5.l0(objQ7);
                    }
                    com.app.mlounge.ui.screens.settings.e0.n("Text Size", "Size of text throughout the app", fVar6, arrayList3, str8, (kotlin.jvm.functions.l) objQ7, sVar5, 54);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 5:
                p1 p1Var2 = (p1) obj4;
                Context context2 = (Context) obj6;
                w2 w2Var = (w2) obj5;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String str9 = ((Boolean) w2Var.getValue()).booleanValue() ? "Sharing spare resources to support CinemaHQ" : "Enable to help keep CinemaHQ free";
                    boolean zBooleanValue = ((Boolean) w2Var.getValue()).booleanValue();
                    boolean zH4 = sVar6.h(p1Var2) | sVar6.h(context2);
                    Object objQ8 = sVar6.Q();
                    if (zH4 || objQ8 == fVar) {
                        objQ8 = new com.app.mlounge.ui.screens.player.s(1, p1Var2, context2);
                        sVar6.l0(objQ8);
                    }
                    com.app.mlounge.ui.screens.settings.e0.r("Share Resources", str9, zBooleanValue, (kotlin.jvm.functions.l) objQ8, okhttp3.internal.platform.android.g.l(), false, sVar6, 6, 32);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 6:
                b2 b2Var = (b2) obj6;
                TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) obj5;
                String str10 = (String) obj4;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    float f4 = 16;
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar2, f4, 0.0f, 2);
                    androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
                    androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                    f1 f1VarA2 = d1.a(tVar, iVar, sVar7, 0);
                    int iHashCode7 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL7 = sVar7.l();
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(sVar7, rVarS);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar7 = androidx.compose.ui.node.g.b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar7);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar7, f1VarA2, eVar7);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar7, jVarL7, eVar8);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar7, numValueOf2, eVar9);
                    androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar7, dVar3);
                    androidx.compose.ui.node.e eVar10 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar7, rVarC7, eVar10);
                    String strM = tmdbTvDetailResponse.m();
                    b2Var.b.getClass();
                    String strB2 = com.app.mlounge.data.repository.j0.b(strM, "w500");
                    float f5 = 8;
                    coil3.compose.k.a(strB2 == null ? "" : strB2, tmdbTvDetailResponse.j(), androidx.compose.ui.draw.h.a(i1.g(i1.q(oVar2, 120), 180), androidx.compose.foundation.shape.e.a(f5)), null, androidx.compose.ui.layout.i.a, sVar7, 1572864, 1976);
                    androidx.compose.foundation.layout.b.e(sVar7, i1.q(oVar2, f4));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(new androidx.compose.foundation.layout.t0(1.0f, true), 0.0f, f5, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.w wVarA5 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar7, 0);
                    int iHashCode8 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL8 = sVar7.l();
                    androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(sVar7, rVarU);
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar7);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.runtime.t.x(sVar7, wVarA5, eVar7);
                    androidx.compose.runtime.t.x(sVar7, jVarL8, eVar8);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode8, sVar7, eVar9, sVar7, dVar3);
                    androidx.compose.runtime.t.x(sVar7, rVarC8, eVar10);
                    String strJ = tmdbTvDetailResponse.j();
                    String str11 = strJ == null ? "" : strJ;
                    x2 x2Var3 = n6.a;
                    z5.b(str11, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar7.j(x2Var3)).f, sVar7, 384, 0, 131066);
                    f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(f5), iVar, sVar7, 6);
                    int iHashCode9 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL9 = sVar7.l();
                    androidx.compose.ui.r rVarC9 = androidx.compose.ui.a.c(sVar7, oVar2);
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar7);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.runtime.t.x(sVar7, f1VarA3, eVar7);
                    androidx.compose.runtime.t.x(sVar7, jVarL9, eVar8);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode9, sVar7, eVar9, sVar7, dVar3);
                    androidx.compose.runtime.t.x(sVar7, rVarC9, eVar10);
                    p5.a(null, androidx.compose.foundation.shape.e.a(4), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-2071937597, new r(str10, 15), sVar7), sVar7, 12583296, Token.DOT);
                    Double dP = tmdbTvDetailResponse.p();
                    if (dP == null) {
                        sVar7.b0(43888797);
                        sVar7.p(false);
                    } else {
                        sVar7.b0(43888798);
                        z5.b("★ ".concat(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dP.doubleValue())}, 1))), null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar7.j(x2Var3)).n, sVar7, 384, 0, 131066);
                        sVar7.p(false);
                    }
                    sVar7.p(true);
                    String strF = tmdbTvDetailResponse.f();
                    String strE0 = strF != null ? kotlin.text.k.e0(4, strF) : null;
                    String strI = tmdbTvDetailResponse.i();
                    String strI2 = kotlin.collections.p.I(kotlin.collections.o.q(new String[]{strE0, strI != null ? kotlin.text.k.e0(4, strI) : null}), " - ", null, null, null, 62);
                    List listE = tmdbTvDetailResponse.e();
                    String strI3 = kotlin.collections.p.I(kotlin.collections.o.q(new String[]{strI2, (listE == null || (num = (Integer) kotlin.collections.p.D(listE)) == null) ? "" : androidx.compose.runtime.j.d(num.intValue(), "min/ep")}), " • ", null, null, null, 62);
                    androidx.compose.ui.text.m0 m0Var2 = ((m6) sVar7.j(x2Var3)).l;
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    z5.b(strI3, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var2, sVar7, 384, 0, 131066);
                    List listG = tmdbTvDetailResponse.g();
                    if (listG == null) {
                        sVar7.b0(-2106305978);
                        sVar7.p(false);
                    } else {
                        sVar7.b0(-2106305977);
                        Object objQ9 = sVar7.Q();
                        if (objQ9 == fVar) {
                            objQ9 = new com.app.mlounge.ui.t(27);
                            sVar7.l0(objQ9);
                        }
                        z5.b(kotlin.collections.p.I(listG, ", ", null, null, (kotlin.jvm.functions.l) objQ9, 30), null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar7.j(x2Var3)).l, sVar7, 384, 0, 131066);
                        sVar7.p(false);
                    }
                    sVar7.p(true);
                    sVar7.p(true);
                    androidx.compose.foundation.layout.b.e(sVar7, i1.g(oVar2, f4));
                } else {
                    sVar7.W();
                }
                return yVar;
            case 7:
                b2 b2Var2 = (b2) obj4;
                TmdbTvDetailResponse tmdbTvDetailResponse2 = (TmdbTvDetailResponse) obj6;
                w2 w2Var2 = (w2) obj5;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    androidx.compose.ui.r rVarS2 = androidx.compose.foundation.layout.b.s(i1.e(oVar2, 1.0f), 16, 0.0f, 2);
                    f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, sVar8, 6);
                    int iHashCode10 = Long.hashCode(sVar8.T);
                    androidx.compose.runtime.internal.j jVarL10 = sVar8.l();
                    androidx.compose.ui.r rVarC10 = androidx.compose.ui.a.c(sVar8, rVarS2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar8 = androidx.compose.ui.node.g.b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(fVar8);
                    } else {
                        sVar8.o0();
                    }
                    androidx.compose.runtime.t.x(sVar8, f1VarA4, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar8, jVarL10, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar8, Integer.valueOf(iHashCode10), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar8, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar8, rVarC10, androidx.compose.ui.node.g.d);
                    String str12 = ((Boolean) w2Var2.getValue()).booleanValue() ? "Favourited" : "Favourite";
                    androidx.compose.ui.graphics.vector.f fVarL = ((Boolean) w2Var2.getValue()).booleanValue() ? okhttp3.internal.platform.android.g.l() : kotlin.math.a.q();
                    boolean zH5 = sVar8.h(b2Var2) | sVar8.h(tmdbTvDetailResponse2);
                    Object objQ10 = sVar8.Q();
                    if (zH5 || objQ10 == fVar) {
                        objQ10 = new com.app.mlounge.ui.screens.adult.b(18, b2Var2, tmdbTvDetailResponse2);
                        sVar8.l0(objQ10);
                    }
                    kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ10;
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    com.app.mlounge.ui.screens.movies.a.b(str12, fVarL, aVar4, new androidx.compose.foundation.layout.t0(1.0f, true), false, sVar8, 0, 48);
                    sVar8.p(true);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 8:
                return e(obj, obj2, obj3);
            default:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(this.y, (BufferedChannel) obj6, (SelectInstance) obj5, (Throwable) obj, obj2, (kotlin.coroutines.j) obj3);
        }
    }

    public /* synthetic */ e0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
