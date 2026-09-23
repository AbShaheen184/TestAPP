package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import kotlin.collections.i0;
import kotlin.jvm.functions.p;
import kotlin.y;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p {
    public final /* synthetic */ float e;
    public final /* synthetic */ HiAnimeEpisode y;
    public final /* synthetic */ boolean z;

    public h(float f, HiAnimeEpisode hiAnimeEpisode, boolean z) {
        this.e = f;
        this.y = hiAnimeEpisode;
        this.z = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        int i;
        androidx.compose.ui.node.f fVar;
        ?? r0;
        s sVar;
        s sVar2 = (s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
            androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
            w wVarA = u.a(cVar, hVar, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            o oVar2 = o.b;
            r rVarC = androidx.compose.ui.a.c(sVar2, oVar2);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            t.x(sVar2, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            t.x(sVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            t.p(sVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
            t.t(sVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            t.x(sVar2, rVarC, eVar4);
            r rVarQ = androidx.compose.foundation.layout.b.q(oVar2, 12);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            t.x(sVar2, f1VarA, eVar);
            t.x(sVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
            t.x(sVar2, rVarC2, eVar4);
            HiAnimeEpisode hiAnimeEpisode = this.y;
            String strValueOf = String.valueOf(hiAnimeEpisode.b());
            x2 x2Var = n6.a;
            m0 m0Var = ((m6) sVar2.j(x2Var)).h;
            long j = com.app.mlounge.ui.theme.b.f;
            z5.b(strValueOf, i1.q(oVar2, 32), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 432, 0, 131064);
            if (this.z) {
                sVar2.b0(-882619151);
                oVar = oVar2;
                q1.a(com.google.firebase.b.S(R.drawable.ic_check, sVar2), "Watched", androidx.compose.foundation.layout.b.u(i1.m(oVar, 20), 0.0f, 0.0f, 8, 0.0f, 11), com.app.mlounge.ui.theme.b.p, sVar2, 3512);
                i = 0;
                sVar2.p(false);
            } else {
                oVar = oVar2;
                i = 0;
                sVar2.b0(-882266495);
                sVar2.p(false);
            }
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            t0 t0Var = new t0(1.0f, true);
            w wVarA2 = u.a(cVar, hVar, sVar2, i);
            int iHashCode3 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
            r rVarC3 = androidx.compose.ui.a.c(sVar2, t0Var);
            sVar2.e0();
            if (sVar2.S) {
                fVar = fVar2;
                sVar2.k(fVar);
            } else {
                fVar = fVar2;
                sVar2.o0();
            }
            t.x(sVar2, wVarA2, eVar);
            t.x(sVar2, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
            t.x(sVar2, rVarC3, eVar4);
            String strC = hiAnimeEpisode.c();
            if (strC == null) {
                strC = "Episode " + hiAnimeEpisode.b();
            }
            o oVar3 = oVar;
            androidx.compose.ui.node.f fVar3 = fVar;
            z5.b(strC, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar2.j(x2Var)).k, sVar2, 384, 24960, 110586);
            s sVar3 = sVar2;
            if (kotlin.jvm.internal.l.a(hiAnimeEpisode.d(), Boolean.TRUE)) {
                sVar3.b0(1505401851);
                z5.b("Filler", null, com.app.mlounge.ui.theme.b.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).o, sVar3, 390, 0, 131066);
                sVar = sVar3;
                r0 = 0;
            } else {
                r0 = 0;
                sVar3.b0(1505478731);
                sVar = sVar3;
            }
            sVar.p(r0);
            sVar.p(true);
            q1.b(n.w(), "Play", i1.m(oVar3, 28), j, sVar, 3504, 0);
            sVar.p(true);
            float f = this.e;
            if (f > 0.0f) {
                sVar.b0(618770939);
                r rVarG = i1.g(i1.e(oVar3, 1.0f), 3);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, r0);
                int iHashCode4 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL4 = sVar.l();
                r rVarC4 = androidx.compose.ui.a.c(sVar, rVarG);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar3);
                } else {
                    sVar.o0();
                }
                t.x(sVar, q0VarD, eVar);
                t.x(sVar, jVarL4, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar3, sVar, dVar);
                t.x(sVar, rVarC4, eVar4);
                e0 e0Var = i1.c;
                long jB = androidx.compose.ui.graphics.t.b(0.25f, androidx.compose.ui.graphics.t.d);
                j0 j0Var = a0.b;
                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(e0Var, jB, j0Var), sVar, 6);
                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(i1.e(i1.c(oVar3, 1.0f), i0.c(f, 0.0f, 1.0f)), j, j0Var), sVar, r0);
                sVar.p(true);
                sVar.p(r0);
            } else {
                sVar.b0(619149573);
                sVar.p(r0);
            }
            sVar.p(true);
        } else {
            sVar2.W();
        }
        return y.a;
    }
}
