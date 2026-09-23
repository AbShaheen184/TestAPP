package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.x2;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ f(kotlin.jvm.functions.a aVar, a1 a1Var, int i) {
        this.e = i;
        this.y = aVar;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-165668554, new f(this.y, this.z, 1), sVar), sVar, 12582912, Token.DOT);
                } else {
                    sVar.W();
                }
                break;
            case 1:
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
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    x2 x2Var = n6.a;
                    z5.b("You're Up To Date", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).h, sVar2, 1572870, 0, 131002);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.m;
                    z5.b("CinemaHQ v8.2 is the latest version.", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 16));
                    kotlin.jvm.functions.a aVar = this.y;
                    boolean zF = sVar2.f(aVar);
                    Object objQ = sVar2.Q();
                    if (zF || objQ == androidx.compose.runtime.n.a) {
                        objQ = new a(aVar, this.z, 3);
                        sVar2.l0(objQ);
                    }
                    b0.l("OK", j, (kotlin.jvm.functions.a) objQ, sVar2, 6);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kotlin.jvm.functions.a aVar2 = this.y;
                    boolean zF2 = sVar3.f(aVar2);
                    Object objQ2 = sVar3.Q();
                    if (zF2 || objQ2 == androidx.compose.runtime.n.a) {
                        objQ2 = new a(aVar2, this.z, 6);
                        sVar3.l0(objQ2);
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ2, null, false, null, null, null, null, com.app.mlounge.ui.screens.downloads.a.a, sVar3, 805306368, 510);
                } else {
                    sVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
