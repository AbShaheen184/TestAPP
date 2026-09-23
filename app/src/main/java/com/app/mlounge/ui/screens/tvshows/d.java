package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.work.impl.v;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ d(String str, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = i;
        this.y = str;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-190413534, new d(this.y, this.z, this.A, 1), sVar), sVar, 12583296, Token.DOT);
                } else {
                    sVar.W();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 24);
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
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
                    x2 x2Var = n6.a;
                    z5.b(this.y, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 2, false, 2, 0, ((m6) sVar2.j(x2Var)).h, sVar2, 1573248, 24960, 110522);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                    z5.b("What would you like to do?", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 390, 0, 131066);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 20));
                    androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, sVar2, 6);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarE);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA, eVar);
                    t.x(sVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                    t.x(sVar2, rVarC2, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarN = okhttp3.internal.platform.android.g.n();
                    g1 g1Var = g1.a;
                    com.app.mlounge.ui.screens.movies.a.b("Watch", fVarN, this.z, g1.a(g1Var, oVar, 1.0f), false, sVar2, 6, 48);
                    com.app.mlounge.ui.screens.movies.a.b("Download", v.u(), this.A, g1.a(g1Var, oVar, 1.0f), false, sVar2, 6, 48);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }
}
