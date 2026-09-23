package com.app.mlounge.ui.screens.settings;

import androidx.compose.foundation.c2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.v4;
import androidx.compose.material3.z5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ v(float f, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i) {
        this.y = f;
        this.z = lVar;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        v vVar = this;
        switch (vVar.e) {
            case 0:
                List<kotlin.k> list = (List) vVar.A;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = false;
                boolean z2 = true;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2 c2VarP = androidx.compose.foundation.s.p(sVar);
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(oVar, c2VarP, true);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    sVar.b0(-594663720);
                    for (kotlin.k kVar : list) {
                        float fFloatValue = ((Number) kVar.e).floatValue();
                        String str = (String) kVar.y;
                        androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                        kotlin.jvm.functions.l lVar = vVar.z;
                        boolean zF = sVar.f(lVar) | sVar.c(fFloatValue);
                        Object objQ = sVar.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                        if (zF || objQ == fVar2) {
                            objQ = new com.app.mlounge.ui.screens.player.k(lVar, fFloatValue, 2);
                            sVar.l0(objQ);
                        }
                        androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.k(rVarE, z, null, (kotlin.jvm.functions.a) objQ, 15), 4, 12);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                        int iHashCode2 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar3);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar, jVarL2, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar, rVarC2, androidx.compose.ui.node.g.d);
                        boolean z3 = vVar.y == fFloatValue ? z2 : z;
                        boolean zF2 = sVar.f(lVar) | sVar.c(fFloatValue);
                        Object objQ2 = sVar.Q();
                        if (zF2 || objQ2 == fVar2) {
                            objQ2 = new com.app.mlounge.ui.screens.player.k(lVar, fFloatValue, 3);
                            sVar.l0(objQ2);
                        }
                        v4.a(z3, (kotlin.jvm.functions.a) objQ2, null, false, androidx.compose.material3.q.m(com.app.mlounge.ui.theme.b.f, com.app.mlounge.ui.theme.b.m, sVar), sVar, 0);
                        androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, 8));
                        androidx.compose.runtime.s sVar2 = sVar;
                        boolean z4 = z2;
                        z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).k, sVar2, 0, 0, 131066);
                        sVar = sVar2;
                        sVar.p(z4);
                        z2 = z4;
                        oVar = oVar;
                        z = false;
                        vVar = this;
                    }
                    sVar.p(z);
                    sVar.p(z2);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e0.m(vVar.y, vVar.z, (kotlin.jvm.functions.a) vVar.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v(List list, kotlin.jvm.functions.l lVar, float f) {
        this.A = list;
        this.z = lVar;
        this.y = f;
    }
}
