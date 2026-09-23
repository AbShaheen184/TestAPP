package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public e0(kotlin.jvm.functions.q qVar, androidx.compose.material3.internal.x0 x0Var) {
        this.e = 6;
        this.z = qVar;
        this.y = x0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.i1.a(androidx.compose.ui.o.b, x.c, x.d), (androidx.compose.foundation.layout.z0) this.y);
                    androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                    androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                    kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) this.z;
                    androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(dVar, iVar, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarP);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
                    if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
                    }
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    qVar.invoke(androidx.compose.foundation.layout.g1.a, sVar, 6);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a2.c(((u1) this.y).b, androidx.compose.material3.tokens.n.k, (androidx.compose.runtime.internal.f) this.z, sVar2, 48);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z5.a(((m6) this.y).j, (androidx.compose.runtime.internal.f) this.z, sVar3, 0);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                androidx.compose.runtime.w2 w2Var = (androidx.compose.runtime.w2) this.y;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(androidx.compose.ui.o.b, "indicator");
                    boolean zF = sVar4.f(w2Var);
                    Object objQ = sVar4.Q();
                    if (zF || objQ == androidx.compose.runtime.n.a) {
                        objQ = new s3(w2Var, 0);
                        sVar4.l0(objQ);
                    }
                    androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(androidx.compose.ui.graphics.a0.o(rVarK, (kotlin.jvm.functions.l) objQ), ((n3) this.z).c, d5.a(androidx.compose.material3.tokens.r.c, sVar4)), sVar4, 0);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.y;
                    Object objQ2 = sVar5.Q();
                    if (objQ2 == androidx.compose.runtime.n.a) {
                        objQ2 = new androidx.compose.foundation.gestures.m2(a1Var, 5);
                        sVar5.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarL = androidx.compose.ui.layout.a0.l(androidx.compose.ui.o.b, (kotlin.jvm.functions.l) objQ2);
                    androidx.compose.runtime.internal.f fVar2 = (androidx.compose.runtime.internal.f) this.z;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar5.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar5, rVarL);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(fVar3);
                    } else {
                        sVar5.o0();
                    }
                    androidx.compose.runtime.t.x(sVar5, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar5, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.g;
                    if (sVar5.S || !kotlin.jvm.internal.l.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar5, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.t.x(sVar5, rVarC2, androidx.compose.ui.node.g.d);
                    fVar2.invoke(sVar5, 0);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                String str = (String) this.y;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF2 = sVar6.f(str);
                    Object objQ3 = sVar6.Q();
                    if (zF2 || objQ3 == androidx.compose.runtime.n.a) {
                        objQ3 = new r(str, 4);
                        sVar6.l0(objQ3);
                    }
                    androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ3);
                    androidx.compose.runtime.internal.f fVar4 = (androidx.compose.runtime.internal.f) this.z;
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar6.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar6, rVarA);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(fVar5);
                    } else {
                        sVar6.o0();
                    }
                    androidx.compose.runtime.t.x(sVar6, q0VarD2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar6, jVarL3, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    if (sVar6.S || !kotlin.jvm.internal.l.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode3, sVar6, iHashCode3, eVar3);
                    }
                    androidx.compose.runtime.t.x(sVar6, rVarC3, androidx.compose.ui.node.g.d);
                    fVar4.invoke(sVar6, 0);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((kotlin.jvm.functions.q) this.z).invoke((androidx.compose.material3.internal.x0) this.y, sVar7, 6);
                } else {
                    sVar7.W();
                }
                break;
            case 7:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.F()) {
                    sVar8.W();
                } else {
                    ((androidx.navigation.compose.m) this.y).D.invoke((androidx.navigation.i) this.z, sVar8, 0);
                }
                break;
            case 8:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.F()) {
                    sVar9.W();
                } else {
                    com.google.firebase.b.c((androidx.compose.runtime.saveable.d) this.y, (androidx.compose.runtime.internal.f) this.z, sVar9, 0);
                }
                break;
            default:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                androidx.navigation.i iVar2 = (androidx.navigation.i) this.y;
                if ((iIntValue8 & 3) == 2 && sVar10.F()) {
                    sVar10.W();
                } else {
                    androidx.navigation.t tVar = iVar2.y;
                    tVar.getClass();
                    ((androidx.navigation.compose.h) tVar).C.invoke((androidx.compose.animation.p) this.z, iVar2, sVar10, 0);
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
