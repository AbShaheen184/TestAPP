package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ v(int i, long j, kotlin.jvm.functions.l lVar) {
        this.e = 1;
        this.y = j;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(212433706, new v(this.y, this.z, 2, (byte) 0), sVar), sVar, 12583296, Token.DOT);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                k0.o(this.y, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 24);
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
                    x2 x2Var = n6.a;
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).h;
                    long j = androidx.compose.ui.graphics.t.d;
                    z5.b("Resume Playback?", null, j, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 1573254, 0, 131002);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                    z5.b("You stopped at ".concat(k0.s(this.y)), null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 384, 0, 131066);
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
                    androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                    androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarV = androidx.room.t.v();
                    g1 g1Var = g1.a;
                    androidx.compose.ui.r rVarA = g1.a(g1Var, oVar, 1.0f);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = sVar2.f(lVar);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zF || objQ == fVar2) {
                        objQ = new e(0, lVar);
                        sVar2.l0(objQ);
                    }
                    k0.d("Restart", fVarV, rVarA, (kotlin.jvm.functions.a) objQ, sVar2, 6);
                    androidx.compose.ui.graphics.vector.f fVarN = okhttp3.internal.platform.android.g.n();
                    androidx.compose.ui.r rVarA2 = g1.a(g1Var, oVar, 1.0f);
                    boolean zF2 = sVar2.f(lVar);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == fVar2) {
                        objQ2 = new e(1, lVar);
                        sVar2.l0(objQ2);
                    }
                    k0.d("Resume", fVarN, rVarA2, (kotlin.jvm.functions.a) objQ2, sVar2, 6);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v(long j, kotlin.jvm.functions.l lVar, int i, byte b) {
        this.e = i;
        this.y = j;
        this.z = lVar;
    }
}
