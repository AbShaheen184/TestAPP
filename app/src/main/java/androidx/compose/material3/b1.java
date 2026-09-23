package androidx.compose.material3;

import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ b1(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        kotlin.y yVar = kotlin.y.a;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) obj3;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    String strI = androidx.compose.material3.internal.i.i(R.string.m3c_dialog, sVar);
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.i1.p((androidx.compose.ui.r) nVar.z, j.a, 0.0f, j.b, 10);
                    boolean zF = sVar.f(strI);
                    Object objQ = sVar.Q();
                    if (zF || objQ == fVar) {
                        objQ = new r(strI, 1);
                        sVar.l0(objQ);
                    }
                    androidx.compose.ui.r rVarD = rVarP.d(androidx.compose.ui.semantics.q.a(oVar, false, (kotlin.jvm.functions.l) objQ));
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
                    if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
                    }
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    ((androidx.compose.runtime.internal.f) nVar.B).invoke(sVar, 0);
                    sVar.p(true);
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                y3 y3Var = (y3) obj3;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(androidx.compose.foundation.layout.i1.b(androidx.compose.foundation.layout.b.z(androidx.compose.foundation.layout.i1.e(oVar, 1.0f), y3Var.d), 0.0f, x3.a, 1), false, new androidx.compose.foundation.gestures.w1(8));
                    androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(x3.b);
                    androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                    androidx.compose.runtime.internal.f fVar3 = y3Var.e;
                    androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(fVarG, iVar, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarA);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar4);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.g;
                    if (sVar2.S || !kotlin.jvm.internal.l.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar2, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                    fVar3.invoke(androidx.compose.foundation.layout.g1.a, sVar2, 6);
                    sVar2.p(true);
                }
                break;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    Object objQ2 = sVar3.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new androidx.compose.foundation.gestures.w1(29);
                        sVar3.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarA2 = androidx.compose.ui.semantics.q.a(oVar, false, (kotlin.jvm.functions.l) objQ2);
                    androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) obj3;
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar3, rVarA2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar5);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, q0VarD2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL3, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    if (sVar3.S || !kotlin.jvm.internal.l.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode3, sVar3, iHashCode3, eVar3);
                    }
                    androidx.compose.runtime.t.x(sVar3, rVarC3, androidx.compose.ui.node.g.d);
                    ((kotlin.jvm.functions.p) a1Var.getValue()).invoke(sVar3, 0);
                    sVar3.p(true);
                }
                break;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    androidx.compose.foundation.layout.p.a(androidx.compose.foundation.b1.a(androidx.compose.ui.draw.h.a(androidx.compose.ui.layout.a0.k(oVar, "indicatorRipple"), d5.a(androidx.compose.material3.tokens.r.c, sVar4)), (androidx.compose.material3.internal.k0) obj3, x4.a(false, 0.0f, 7)), sVar4, 0);
                }
                break;
            default:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    z5.b((String) obj3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 262142);
                }
                break;
        }
        return yVar;
    }
}
