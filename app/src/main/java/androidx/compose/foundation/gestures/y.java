package androidx.compose.foundation.gestures;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.TmdbCreator;
import java.util.Map;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ y(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0751  */
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        int i = this.e;
        kotlin.coroutines.d dVar = null;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        int i2 = 2;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        boolean z2 = true;
        kotlin.y yVar = kotlin.y.a;
        Object obj5 = this.y;
        switch (i) {
            case 0:
                ((androidx.compose.foundation.text.s0) obj5).y.a(((androidx.compose.ui.input.pointer.v) obj2).c, androidx.compose.foundation.text.selection.a0.d);
                return yVar;
            case 1:
                androidx.compose.ui.text.m0 m0Var = (androidx.compose.ui.text.m0) obj5;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar.b0(1582736677);
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                androidx.compose.ui.text.font.d dVar2 = (androidx.compose.ui.text.font.d) sVar.j(androidx.compose.ui.platform.l1.k);
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) sVar.j(androidx.compose.ui.platform.l1.n);
                boolean zF = sVar.f(m0Var) | sVar.d(mVar.ordinal());
                Object objQ = sVar.Q();
                Object obj6 = objQ;
                if (zF || objQ == fVar) {
                    androidx.compose.ui.text.m0 m0VarH = androidx.compose.ui.text.d0.h(m0Var, mVar);
                    sVar.l0(m0VarH);
                    obj6 = m0VarH;
                }
                androidx.compose.ui.text.m0 m0Var2 = (androidx.compose.ui.text.m0) obj6;
                boolean zF2 = sVar.f(dVar2) | sVar.f(m0Var2);
                Object objQ2 = sVar.Q();
                Object obj7 = objQ2;
                if (zF2 || objQ2 == fVar) {
                    androidx.compose.ui.text.e0 e0Var = m0Var2.a;
                    androidx.compose.ui.text.font.r rVar = e0Var.f;
                    androidx.compose.ui.text.font.k kVar = e0Var.c;
                    if (kVar == null) {
                        kVar = androidx.compose.ui.text.font.k.z;
                    }
                    androidx.compose.ui.text.font.i iVar = e0Var.d;
                    int i3 = iVar != null ? iVar.a : 0;
                    androidx.compose.ui.text.font.j jVar = e0Var.e;
                    androidx.compose.ui.text.font.t tVarB = ((androidx.compose.ui.text.font.e) dVar2).b(rVar, kVar, i3, jVar != null ? jVar.a : 65535);
                    sVar.l0(tVarB);
                    obj7 = tVarB;
                }
                androidx.compose.runtime.w2 w2Var = (androidx.compose.runtime.w2) obj7;
                Object objQ3 = sVar.Q();
                Object obj8 = objQ3;
                if (objQ3 == fVar) {
                    Object value = w2Var.getValue();
                    androidx.compose.foundation.text.j1 j1Var = new androidx.compose.foundation.text.j1();
                    j1Var.a = mVar;
                    j1Var.b = cVar;
                    j1Var.c = dVar2;
                    j1Var.d = m0Var;
                    j1Var.e = value;
                    j1Var.f = androidx.compose.foundation.text.a1.a(m0Var, cVar, dVar2, androidx.compose.foundation.text.a1.a, 1);
                    sVar.l0(j1Var);
                    obj8 = j1Var;
                }
                androidx.compose.foundation.text.j1 j1Var2 = (androidx.compose.foundation.text.j1) obj8;
                Object value2 = w2Var.getValue();
                if (mVar != j1Var2.a || !kotlin.jvm.internal.l.a(cVar, j1Var2.b) || !kotlin.jvm.internal.l.a(dVar2, j1Var2.c) || !kotlin.jvm.internal.l.a(m0Var2, j1Var2.d) || !kotlin.jvm.internal.l.a(value2, j1Var2.e)) {
                    j1Var2.a = mVar;
                    j1Var2.b = cVar;
                    j1Var2.c = dVar2;
                    j1Var2.d = m0Var2;
                    j1Var2.e = value2;
                    j1Var2.f = androidx.compose.foundation.text.a1.a(m0Var2, cVar, dVar2, androidx.compose.foundation.text.a1.a, 1);
                }
                boolean zH = sVar.h(j1Var2);
                Object objQ4 = sVar.Q();
                Object obj9 = objQ4;
                if (zH || objQ4 == fVar) {
                    y yVar2 = new y(j1Var2, i2);
                    sVar.l0(yVar2);
                    obj9 = yVar2;
                }
                androidx.compose.ui.r rVarJ = androidx.compose.ui.layout.a0.j(oVar, (kotlin.jvm.functions.q) obj9);
                sVar.p(false);
                return rVarJ;
            case 2:
                androidx.compose.ui.unit.a aVar = (androidx.compose.ui.unit.a) obj3;
                long j = ((androidx.compose.foundation.text.j1) obj5).f;
                long j2 = aVar.a;
                int iJ = androidx.compose.ui.unit.a.j(j2);
                long j3 = aVar.a;
                androidx.compose.ui.layout.d1 d1VarF = ((androidx.compose.ui.layout.p0) obj2).F(androidx.compose.ui.unit.a.a(j2, kotlin.collections.i0.d((int) (j >> 32), iJ, androidx.compose.ui.unit.a.h(j3)), 0, kotlin.collections.i0.d((int) (j & 4294967295L), androidx.compose.ui.unit.a.i(j3), androidx.compose.ui.unit.a.g(j3)), 0, 10));
                return ((androidx.compose.ui.layout.s0) obj).q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.foundation.layout.j(d1VarF, 7));
            case 3:
                androidx.compose.foundation.text.input.internal.i iVar2 = (androidx.compose.foundation.text.input.internal.i) obj5;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = iVar2.T.j(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = iVar2.T.j(iIntValue2);
                }
                if (iVar2.R) {
                    long j4 = iVar2.O.b;
                    int i4 = androidx.compose.ui.text.l0.c;
                    if (iIntValue == ((int) (j4 >> 32)) && iIntValue2 == ((int) (j4 & 4294967295L))) {
                        z2 = false;
                    } else {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        androidx.compose.foundation.text.g0 g0Var = androidx.compose.foundation.text.g0.e;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > iVar2.O.a.y.length()) {
                            androidx.compose.foundation.text.selection.b1 b1Var = iVar2.U;
                            b1Var.t(false);
                            b1Var.q(g0Var);
                            z2 = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                androidx.compose.foundation.text.selection.b1 b1Var2 = iVar2.U;
                                b1Var2.t(false);
                                b1Var2.q(g0Var);
                            } else {
                                iVar2.U.h(true);
                            }
                            iVar2.P.v.invoke(new androidx.compose.ui.text.input.x(iVar2.O.a, androidx.compose.ui.text.d0.b(iIntValue, iIntValue2), (androidx.compose.ui.text.l0) null));
                        }
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                androidx.compose.foundation.text.selection.b1 b1Var3 = (androidx.compose.foundation.text.selection.b1) obj5;
                androidx.compose.ui.r rVar2 = (androidx.compose.ui.r) obj;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar2.b0(1980580247);
                androidx.compose.ui.unit.c cVar2 = (androidx.compose.ui.unit.c) sVar2.j(androidx.compose.ui.platform.l1.h);
                Object objQ5 = sVar2.Q();
                Object obj10 = objQ5;
                if (objQ5 == fVar) {
                    androidx.compose.runtime.j1 j1VarR = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.l(0L));
                    sVar2.l0(j1VarR);
                    obj10 = j1VarR;
                }
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) obj10;
                boolean zH2 = sVar2.h(b1Var3);
                Object objQ6 = sVar2.Q();
                Object obj11 = objQ6;
                if (zH2 || objQ6 == fVar) {
                    androidx.activity.compose.f fVar2 = new androidx.activity.compose.f(13, b1Var3, a1Var);
                    sVar2.l0(fVar2);
                    obj11 = fVar2;
                }
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj11;
                boolean zF3 = sVar2.f(cVar2);
                Object objQ7 = sVar2.Q();
                if (zF3 || objQ7 == fVar) {
                    z = false;
                    androidx.compose.foundation.text.selection.e1 e1Var = new androidx.compose.foundation.text.selection.e1(cVar2, a1Var, false ? 1 : 0);
                    sVar2.l0(e1Var);
                    obj4 = e1Var;
                } else {
                    z = false;
                    obj4 = objQ7;
                }
                androidx.compose.animation.core.p pVar = androidx.compose.foundation.text.selection.m0.a;
                androidx.compose.ui.r rVarA = androidx.compose.ui.a.a(rVar2, new androidx.compose.foundation.contextmenu.i(aVar2, (kotlin.jvm.functions.l) obj4, i2));
                sVar2.p(z);
                return rVarA;
            case 5:
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strA = hiAnimeInfo.a();
                    if (strA == null) {
                        sVar3.b0(-972565345);
                        sVar3.p(false);
                    } else {
                        sVar3.b0(-972565344);
                        float f = 16;
                        androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar, f, 0.0f, 2);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        androidx.compose.runtime.internal.j jVarL = sVar3.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarS);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(fVar3);
                        } else {
                            sVar3.o0();
                        }
                        androidx.compose.runtime.t.x(sVar3, wVarA, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                        androidx.compose.foundation.layout.b.e(sVar3, androidx.compose.foundation.layout.i1.g(oVar, f));
                        androidx.compose.runtime.x2 x2Var = n6.a;
                        z5.b("Synopsis", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).h, sVar3, 390, 0, 131066);
                        z5.b(strA, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).k, sVar3, 384, 0, 131066);
                        sVar3.p(true);
                        sVar3.p(false);
                    }
                } else {
                    sVar3.W();
                }
                return yVar;
            case 6:
                HiAnimeMoreInfo hiAnimeMoreInfo = (HiAnimeMoreInfo) obj5;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    sVar4.W();
                } else if (hiAnimeMoreInfo == null) {
                    sVar4.b0(373194039);
                    sVar4.p(false);
                } else {
                    sVar4.b0(373194040);
                    androidx.compose.ui.r rVarS2 = androidx.compose.foundation.layout.b.s(oVar, 16, 0.0f, 2);
                    androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar4, 0);
                    int iHashCode2 = Long.hashCode(sVar4.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar4.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar4, rVarS2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(fVar4);
                    } else {
                        sVar4.o0();
                    }
                    androidx.compose.runtime.t.x(sVar4, wVarA2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar4, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar4, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar4, rVarC2, androidx.compose.ui.node.g.d);
                    androidx.compose.foundation.layout.b.e(sVar4, androidx.compose.foundation.layout.i1.g(oVar, 12));
                    String strE = hiAnimeMoreInfo.e();
                    if (strE == null) {
                        sVar4.b0(-70471374);
                    } else {
                        sVar4.b0(-70471373);
                        z5.b("Studio: ".concat(strE), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).k, sVar4, 384, 0, 131066);
                    }
                    boolean z3 = false;
                    sVar4.p(false);
                    String strD = hiAnimeMoreInfo.d();
                    if (strD == null) {
                        sVar4.b0(-70334509);
                    } else {
                        sVar4.b0(-70334508);
                        z5.b("Status: ".concat(strD), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).l, sVar4, 384, 0, 131066);
                        z3 = false;
                    }
                    sVar4.p(z3);
                    String strA2 = hiAnimeMoreInfo.a();
                    if (strA2 == null) {
                        sVar4.b0(-70199628);
                    } else {
                        sVar4.b0(-70199627);
                        z5.b("Aired: ".concat(strA2), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).l, sVar4, 384, 0, 131066);
                        z3 = false;
                    }
                    sVar4.p(z3);
                    sVar4.p(true);
                    sVar4.p(z3);
                }
                return yVar;
            case 7:
                GameDetailResponse gameDetailResponse = (GameDetailResponse) obj5;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    coil3.compose.k.a(gameDetailResponse.f(), gameDetailResponse.d(), androidx.compose.foundation.layout.i1.g(androidx.compose.foundation.layout.i1.q(oVar, 150), Context.VERSION_ES6), null, androidx.compose.ui.layout.i.a, sVar5, 1573248, 1976);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 8:
                kotlin.jvm.functions.s sVar6 = (kotlin.jvm.functions.s) obj5;
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                str.getClass();
                str2.getClass();
                map.getClass();
                sVar6.d(str, str2, map, "hls", null);
                return yVar;
            case 9:
                String str3 = (String) obj5;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar7.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 16);
                    androidx.compose.foundation.layout.w wVarA3 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar7, 0);
                    int iHashCode3 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar7.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar7, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar5);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.runtime.t.x(sVar7, wVarA3, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar7, jVarL3, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar7, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar7, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar7, rVarC3, androidx.compose.ui.node.g.d);
                    androidx.compose.runtime.x2 x2Var2 = n6.a;
                    z5.b("Biography", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar7.j(x2Var2)).h, sVar7, 390, 0, 131066);
                    androidx.compose.foundation.layout.b.e(sVar7, androidx.compose.foundation.layout.i1.g(oVar, 8));
                    z5.b(str3, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar7.j(x2Var2)).k, sVar7, 384, 0, 131066);
                    sVar7.p(true);
                } else {
                    sVar7.W();
                }
                return yVar;
            case 10:
                android.content.Context context = (android.content.Context) obj5;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Object objQ8 = sVar8.Q();
                    if (objQ8 == fVar) {
                        objQ8 = androidx.compose.runtime.t.r("");
                        sVar8.l0(objQ8);
                    }
                    androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) objQ8;
                    boolean zH3 = sVar8.h(context);
                    Object objQ9 = sVar8.Q();
                    if (zH3 || objQ9 == fVar) {
                        objQ9 = new androidx.compose.foundation.text.input.internal.k(context, a1Var2, dVar, 14);
                        sVar8.l0(objQ9);
                    }
                    androidx.compose.runtime.l0.c(sVar8, yVar, (kotlin.jvm.functions.p) objQ9);
                    String strI = ((String) a1Var2.getValue()).length() > 0 ? androidx.compose.runtime.j.i("Cache size: ", (String) a1Var2.getValue()) : "Clear temporary files";
                    androidx.compose.ui.graphics.vector.f fVarB = org.jsoup.helper.n.b;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.DeleteSweep", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(15.0f, 16.0f);
                        gVar.s(4.0f);
                        gVar.A(2.0f);
                        gVar.s(-4.0f);
                        gVar.l();
                        gVar.v(15.0f, 8.0f);
                        gVar.s(7.0f);
                        gVar.A(2.0f);
                        gVar.s(-7.0f);
                        gVar.l();
                        gVar.v(15.0f, 12.0f);
                        gVar.s(6.0f);
                        gVar.A(2.0f);
                        gVar.s(-6.0f);
                        gVar.l();
                        gVar.v(3.0f, 18.0f);
                        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.s(6.0f);
                        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar.t(13.0f, 8.0f);
                        gVar.t(3.0f, 8.0f);
                        gVar.A(10.0f);
                        gVar.l();
                        gVar.v(14.0f, 5.0f);
                        gVar.s(-3.0f);
                        gVar.u(-1.0f, -1.0f);
                        gVar.t(6.0f, 4.0f);
                        gVar.t(5.0f, 5.0f);
                        gVar.t(2.0f, 5.0f);
                        gVar.A(2.0f);
                        gVar.s(12.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
                        fVarB = eVar.b();
                        org.jsoup.helper.n.b = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar6 = fVarB;
                    boolean zH4 = sVar8.h(context);
                    Object objQ10 = sVar8.Q();
                    if (zH4 || objQ10 == fVar) {
                        objQ10 = new com.app.mlounge.ui.screens.settings.x(context, a1Var2, 0);
                        sVar8.l0(objQ10);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Clear Cache", strI, fVar6, null, (kotlin.jvm.functions.a) objQ10, sVar8, 6, 8);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 11:
                TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) obj5;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strL = tmdbTvDetailResponse.l();
                    if (strL == null) {
                        sVar9.b0(909396742);
                        sVar9.p(false);
                    } else {
                        sVar9.b0(909396743);
                        androidx.compose.ui.r rVarS3 = androidx.compose.foundation.layout.b.s(oVar, 16, 0.0f, 2);
                        androidx.compose.foundation.layout.w wVarA4 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar9, 0);
                        int iHashCode4 = Long.hashCode(sVar9.T);
                        androidx.compose.runtime.internal.j jVarL4 = sVar9.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar9, rVarS3);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar7 = androidx.compose.ui.node.g.b;
                        sVar9.e0();
                        if (sVar9.S) {
                            sVar9.k(fVar7);
                        } else {
                            sVar9.o0();
                        }
                        androidx.compose.runtime.t.x(sVar9, wVarA4, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar9, jVarL4, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar9, Integer.valueOf(iHashCode4), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar9, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar9, rVarC4, androidx.compose.ui.node.g.d);
                        androidx.compose.foundation.layout.b.e(sVar9, androidx.compose.foundation.layout.i1.g(oVar, 12));
                        androidx.compose.runtime.x2 x2Var3 = n6.a;
                        z5.b("Synopsis", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar9.j(x2Var3)).h, sVar9, 390, 0, 131066);
                        z5.b(strL, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar9.j(x2Var3)).k, sVar9, 384, 0, 131066);
                        sVar9.p(true);
                        sVar9.p(false);
                    }
                } else {
                    sVar9.W();
                }
                return yVar;
            case 12:
                TmdbCreator tmdbCreator = (TmdbCreator) obj5;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!sVar10.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    sVar10.W();
                } else if (tmdbCreator == null) {
                    sVar10.b0(1953148348);
                    sVar10.p(false);
                } else {
                    sVar10.b0(1953148349);
                    z5.b(androidx.compose.runtime.j.i("Creator: ", tmdbCreator.a()), androidx.compose.foundation.layout.b.r(oVar, 16, 8), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar10.j(n6.a)).k, sVar10, 432, 0, 131064);
                    sVar10.p(false);
                }
                return yVar;
            case 13:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12((kotlin.jvm.functions.l) obj5, (Throwable) obj, obj2, (kotlin.coroutines.j) obj3);
            case 14:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) obj5, (SelectInstance) obj, obj2, obj3);
            default:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) obj5, (Throwable) obj, (kotlin.y) obj2, (kotlin.coroutines.j) obj3);
        }
    }
}
