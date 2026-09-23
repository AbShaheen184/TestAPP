package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import kotlin.collections.q;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.p y;
    public final /* synthetic */ p z;

    public /* synthetic */ g(com.app.mlounge.ui.viewmodel.p pVar, kotlin.jvm.functions.a aVar, p pVar2) {
        this.y = pVar;
        this.A = aVar;
        this.z = pVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar = o.b;
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 16);
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                    w wVarA = u.a(cVar, hVar, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    t.x(sVar, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    t.x(sVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    t.p(sVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    t.t(sVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    t.x(sVar, rVarC, eVar4);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar, oVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, f1VarA, eVar);
                    t.x(sVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                    t.x(sVar, rVarC2, eVar4);
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    t0 t0Var = new t0(1.0f, true);
                    w wVarA2 = u.a(cVar, hVar, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar, t0Var);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, wVarA2, eVar);
                    t.x(sVar, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar3, sVar, dVar);
                    t.x(sVar, rVarC3, eVar4);
                    x2 x2Var = n6.a;
                    z5.b("EasyNews", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).h, sVar, 390, 0, 131066);
                    z5.b("Usenet indexer with direct video links", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, 390, 0, 131066);
                    sVar.p(true);
                    com.app.mlounge.ui.viewmodel.p pVar = this.y;
                    n.l(pVar.a, sVar, 0);
                    sVar.p(true);
                    androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 12));
                    if (pVar.a) {
                        sVar.b0(1120312674);
                        String str = pVar.b;
                        if (str == null) {
                            str = "Unknown";
                        }
                        n.a(q.j(new kotlin.k("Username", str)), sVar, 0);
                        androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 8));
                        n.g(this.A, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.b0(1120571555);
                        sVar.b0(1120874518);
                        sVar.p(false);
                        n.o(this.z, sVar, 0);
                        androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 8));
                        n.d("https://easynews.com/", sVar, 6);
                        sVar.p(false);
                    }
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.f(this.y, this.z, this.A, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ g(com.app.mlounge.ui.viewmodel.p pVar, p pVar2, kotlin.jvm.functions.a aVar, int i) {
        this.y = pVar;
        this.z = pVar2;
        this.A = aVar;
    }
}
