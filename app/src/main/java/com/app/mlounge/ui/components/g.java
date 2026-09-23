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
public final /* synthetic */ class g implements kotlin.jvm.functions.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ g(kotlin.jvm.functions.a aVar, a1 a1Var, a1 a1Var2, int i) {
        this.e = i;
        this.y = aVar;
        this.z = a1Var;
        this.A = a1Var2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        androidx.compose.runtime.s sVar;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(54060558, new g(this.y, this.z, this.A, 1), sVar2), sVar2, 12582912, Token.DOT);
                } else {
                    sVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar3, 48);
                    int iHashCode = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL = sVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                    x2 x2Var = n6.a;
                    z5.b("Changelog", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).h, sVar3, 1572870, 0, 131002);
                    androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 4));
                    z5.b("v8.2", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).l, sVar3, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 16));
                    if (((Boolean) this.z.getValue()).booleanValue()) {
                        sVar3.b0(877913545);
                        androidx.compose.ui.text.m0 m0Var = ((m6) sVar3.j(x2Var)).l;
                        long j = com.app.mlounge.ui.theme.b.m;
                        androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar, 0.0f, f, 1);
                        gVar = this;
                        z5.b("Loading...", rVarS, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar3, 54, 0, 131064);
                        sVar = sVar3;
                        sVar.p(false);
                    } else {
                        gVar = this;
                        sVar3.b0(878231512);
                        p5.a(i1.g(i1.e(oVar, 1.0f), 280), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(9369721, new androidx.compose.material3.m(gVar.A, 2), sVar3), sVar3, 12582918, 120);
                        sVar = sVar3;
                        sVar.p(false);
                    }
                    androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 20));
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    kotlin.jvm.functions.a aVar = gVar.y;
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == androidx.compose.runtime.n.a) {
                        objQ = new androidx.compose.material3.x2(5, aVar);
                        sVar.l0(objQ);
                    }
                    b0.l("Close", j2, (kotlin.jvm.functions.a) objQ, sVar, 6);
                    sVar.p(true);
                } else {
                    sVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
