package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.TmdbCreditsResponse;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.List;
import kotlin.collections.w;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ TmdbTvDetailResponse y;
    public final /* synthetic */ b2 z;

    public /* synthetic */ c(TmdbTvDetailResponse tmdbTvDetailResponse, b2 b2Var, kotlin.jvm.functions.l lVar) {
        this.y = tmdbTvDetailResponse;
        this.z = b2Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listA;
        List listB;
        switch (this.e) {
            case 0:
                s sVar = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    TmdbCreditsResponse tmdbCreditsResponseD = this.y.d();
                    List listX = (tmdbCreditsResponseD == null || (listA = tmdbCreditsResponseD.a()) == null) ? w.e : kotlin.collections.p.X(15, listA);
                    if (listX.isEmpty()) {
                        sVar.b0(791174444);
                        sVar.p(false);
                    } else {
                        sVar.b0(789691621);
                        androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                        int iHashCode = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL = sVar.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, oVar);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.o0();
                        }
                        t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
                        t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                        t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        t.t(sVar, androidx.compose.ui.node.g.h);
                        t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                        float f = 16;
                        androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
                        z5.b("Cast", androidx.compose.foundation.layout.b.s(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).h, sVar, 438, 0, 131064);
                        z0 z0VarB = androidx.compose.foundation.layout.b.b(2, f);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(12);
                        boolean zH = sVar.h(listX);
                        kotlin.jvm.functions.l lVar = this.A;
                        boolean zF = zH | sVar.f(lVar);
                        b2 b2Var = this.z;
                        boolean zH2 = zF | sVar.h(b2Var);
                        Object objQ = sVar.Q();
                        if (zH2 || objQ == androidx.compose.runtime.n.a) {
                            objQ = new e(listX, lVar, b2Var);
                            sVar.l0(objQ);
                        }
                        android.support.v4.media.session.b.d(null, null, z0VarB, fVarG, null, null, false, null, (kotlin.jvm.functions.l) objQ, sVar, 24960);
                        sVar.p(true);
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
            default:
                s sVar2 = (s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    TmdbPagedResponse tmdbPagedResponseO = this.y.o();
                    List listX2 = (tmdbPagedResponseO == null || (listB = tmdbPagedResponseO.b()) == null) ? w.e : kotlin.collections.p.X(15, listB);
                    if (listX2.isEmpty()) {
                        sVar2.b0(1834359277);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1833472274);
                        androidx.compose.foundation.layout.w wVarA2 = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, oVar2);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        t.x(sVar2, wVarA2, androidx.compose.ui.node.g.f);
                        t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                        t.p(sVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                        t.t(sVar2, androidx.compose.ui.node.g.h);
                        t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                        float f2 = 16;
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, f2));
                        List list = listX2;
                        z5.b("Similar Shows", androidx.compose.foundation.layout.b.s(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).h, sVar2, 438, 0, 131064);
                        z0 z0VarB2 = androidx.compose.foundation.layout.b.b(2, f2);
                        androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(8);
                        boolean zH3 = sVar2.h(list);
                        b2 b2Var2 = this.z;
                        boolean zH4 = zH3 | sVar2.h(b2Var2);
                        kotlin.jvm.functions.l lVar2 = this.A;
                        boolean zF2 = zH4 | sVar2.f(lVar2);
                        Object objQ2 = sVar2.Q();
                        if (zF2 || objQ2 == androidx.compose.runtime.n.a) {
                            objQ2 = new e(list, b2Var2, lVar2);
                            sVar2.l0(objQ2);
                        }
                        android.support.v4.media.session.b.d(null, null, z0VarB2, fVarG2, null, null, false, null, (kotlin.jvm.functions.l) objQ2, sVar2, 24960);
                        sVar2.p(true);
                        sVar2.p(false);
                    }
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ c(TmdbTvDetailResponse tmdbTvDetailResponse, kotlin.jvm.functions.l lVar, b2 b2Var) {
        this.y = tmdbTvDetailResponse;
        this.A = lVar;
        this.z = b2Var;
    }
}
