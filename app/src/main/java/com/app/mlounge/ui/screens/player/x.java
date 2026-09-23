package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ x(kotlin.jvm.functions.a aVar, List list, kotlin.jvm.functions.l lVar) {
        this.e = 0;
        this.A = aVar;
        this.y = list;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.material3.q.c(i1.c(i1.e(androidx.compose.ui.o.b, 0.85f), 0.5f), androidx.compose.foundation.shape.e.a(16), androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.b, sVar, 6), null, androidx.compose.runtime.internal.k.c(-513088039, new com.app.mlounge.ui.components.e0(2, this.A, this.y, this.z), sVar), sVar, 196614, 24);
                } else {
                    sVar.W();
                }
                return kotlin.y.a;
            case 1:
                ((Integer) obj2).getClass();
                k0.b(this.y, this.z, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1531277996, new x(this.y, this.A, this.z, 4), sVar2), sVar2, 12583296, Token.DOT);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 3:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.a(this.y, this.z, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 24);
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
                    z5.b("Select Debrid Service", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).h, sVar3, 1573254, 0, 131002);
                    androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 8));
                    z5.b("Choose which service to use for playback", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).l, sVar3, 390, 0, 131066);
                    androidx.compose.runtime.s sVar4 = sVar3;
                    androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar, 20));
                    sVar4.b0(888282193);
                    for (com.app.mlounge.ui.viewmodel.l lVar : this.y) {
                        Object objQ = sVar4.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                        if (objQ == fVar2) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar4);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        float f = 12;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.s(i1.e(oVar, 1.0f), 0.0f, 4, 1), androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                        kotlin.jvm.functions.l lVar2 = this.z;
                        boolean zF = sVar4.f(lVar2) | sVar4.d(lVar.ordinal());
                        Object objQ2 = sVar4.Q();
                        if (zF || objQ2 == fVar2) {
                            objQ2 = new com.app.mlounge.ui.screens.adult.b(17, lVar2, lVar);
                            sVar4.l0(objQ2);
                        }
                        androidx.compose.runtime.s sVar5 = sVar4;
                        p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-910138737, new androidx.compose.animation.core.g0(lVar, 26), sVar4), sVar5, 12583296, 120);
                        sVar4 = sVar5;
                    }
                    sVar4.p(false);
                    androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar, 12));
                    androidx.compose.material3.q.i(this.A, null, false, null, null, null, null, com.app.mlounge.ui.screens.sources.a.d, sVar4, 805306368, 510);
                    sVar4.p(true);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ x(List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = list;
        this.z = lVar;
        this.A = aVar;
    }

    public /* synthetic */ x(List list, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.y = list;
        this.A = aVar;
        this.z = lVar;
    }
}
