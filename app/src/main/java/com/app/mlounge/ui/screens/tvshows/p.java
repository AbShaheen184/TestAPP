package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.List;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements kotlin.jvm.functions.r {
    public final /* synthetic */ b2 A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public p(List list, b2 b2Var, kotlin.jvm.functions.l lVar) {
        this.y = list;
        this.A = b2Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (sVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) this.y.get(iIntValue);
                    sVar.b0(1605327097);
                    String strC = tmdbTvShow.c();
                    if (strC == null) {
                        strC = "";
                    }
                    String strF = tmdbTvShow.f();
                    this.A.b.getClass();
                    String strB = j0.b(strF, "w500");
                    Double dG = tmdbTvShow.g();
                    androidx.compose.ui.r rVarQ = i1.q(androidx.compose.ui.o.b, 130);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = sVar.f(lVar) | sVar.h(tmdbTvShow);
                    Object objQ = sVar.Q();
                    if (zF || objQ == androidx.compose.runtime.n.a) {
                        objQ = new com.app.mlounge.ui.screens.search.f(lVar, tmdbTvShow, 1);
                        sVar.l0(objQ);
                    }
                    b0.h(strC, strB, (kotlin.jvm.functions.a) objQ, rVarQ, dG, null, null, null, null, 0.0f, false, false, 0.0f, null, sVar, 3072, 0, 16352);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar2 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (sVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbCastMember tmdbCastMember = (TmdbCastMember) this.y.get(iIntValue3);
                    sVar2.b0(264823552);
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ2 = i1.q(oVar, 80);
                    kotlin.jvm.functions.l lVar2 = this.z;
                    boolean zF2 = sVar2.f(lVar2) | sVar2.f(tmdbCastMember);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == androidx.compose.runtime.n.a) {
                        objQ2 = new com.app.mlounge.ui.screens.movies.h(lVar2, tmdbCastMember, 1);
                        sVar2.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarQ3 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.s.n(androidx.compose.foundation.s.k(rVarQ2, false, null, (kotlin.jvm.functions.a) objQ2, 15), null, 3), 4);
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ3);
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
                    String strD = tmdbCastMember.d();
                    this.A.b.getClass();
                    coil3.compose.k.a(j0.b(strD, "w185"), tmdbCastMember.c(), androidx.compose.ui.draw.h.a(i1.m(oVar, 60), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, sVar2, 1572864, 1976);
                    String strC2 = tmdbCastMember.c();
                    if (strC2 == null) {
                        strC2 = "";
                    }
                    z5.b(strC2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar2.j(n6.a)).o, sVar2, 384, 24960, 110586);
                    sVar2.p(true);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }

    public p(List list, kotlin.jvm.functions.l lVar, b2 b2Var) {
        this.y = list;
        this.z = lVar;
        this.A = b2Var;
    }
}
