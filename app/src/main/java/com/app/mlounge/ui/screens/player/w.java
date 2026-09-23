package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ w(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = i;
        this.y = aVar;
        this.z = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        char c;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(803038851, new w(this.y, this.z, i2), sVar), sVar, 12583296, Token.DOT);
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    float f = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
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
                    androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar2, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarB = coil3.network.g.f;
                    if (fVarB != null) {
                        c = 0;
                    } else {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = androidx.compose.ui.graphics.vector.h0.a;
                        long j = androidx.compose.ui.graphics.t.b;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(j);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new androidx.compose.ui.graphics.vector.o(9.0f, 1.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.u(6.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.a0(2.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.u(-6.0f));
                        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
                        androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                        androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(j);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(19.03f, 7.39f);
                        gVar.u(1.42f, -1.42f);
                        gVar.n(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
                        gVar.u(-1.42f, 1.42f);
                        gVar.m(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
                        gVar.n(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                        gVar.n(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
                        gVar.x(9.0f, -4.03f, 9.0f, -9.0f);
                        gVar.m(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
                        gVar.l();
                        gVar.v(13.0f, 14.0f);
                        gVar.s(-2.0f);
                        gVar.z(8.0f);
                        c = 0;
                        gVar.s(2.0f);
                        gVar.z(14.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var2);
                        fVarB = eVar5.b();
                        coil3.network.g.f = fVarB;
                    }
                    q1.b(fVarB, null, i1.m(oVar, 48), androidx.compose.ui.graphics.t.g, sVar2, 3504, 0);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 16));
                    x2 x2Var = n6.a;
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).h;
                    long j2 = androidx.compose.ui.graphics.t.d;
                    z5.b("Seeking Unstable", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 390, 0, 131066);
                    z5.b("The stream is taking too long to resume after seeking. Large remux files often have this issue on some servers.", null, androidx.compose.ui.graphics.t.b(0.7f, j2), 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 390, 0, 130042);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f));
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
                    androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                    androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarV = androidx.room.t.v();
                    g1 g1Var = g1.a;
                    k0.d("Reset to 0:00", fVarV, g1.a(g1Var, oVar, 1.0f), this.y, sVar2, 6);
                    androidx.compose.ui.graphics.vector.f fVarB2 = android.support.v4.media.session.b.a;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.Block", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var3 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 2.0f);
                        gVarJ.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        gVarJ.x(4.48f, 10.0f, 10.0f, 10.0f);
                        gVarJ.x(10.0f, -4.48f, 10.0f, -10.0f);
                        gVarJ.w(17.52f, 2.0f, 12.0f, 2.0f);
                        gVarJ.l();
                        gVarJ.v(4.0f, 12.0f);
                        gVarJ.n(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
                        gVarJ.n(1.85f, 0.0f, 3.55f, 0.63f, 4.9f, 1.69f);
                        gVarJ.t(5.69f, 16.9f);
                        gVarJ.m(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
                        gVarJ.l();
                        gVarJ.v(12.0f, 20.0f);
                        gVarJ.n(-1.85f, 0.0f, -3.55f, -0.63f, -4.9f, -1.69f);
                        gVarJ.t(18.31f, 7.1f);
                        gVarJ.m(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
                        gVarJ.n(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
                        gVarJ.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVarJ.b, 0, p0Var3);
                        fVarB2 = eVar6.b();
                        android.support.v4.media.session.b.a = fVarB2;
                    }
                    k0.d("Disable Seeking", fVarB2, g1.a(g1Var, oVar, 1.0f), this.z, sVar2, 6);
                    sVar2.p(true);
                    sVar2.p(true);
                }
                break;
        }
        return yVar;
    }
}
