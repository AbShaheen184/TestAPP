package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ long B;
    public final /* synthetic */ float e;
    public final /* synthetic */ androidx.compose.foundation.layout.z0 y;
    public final /* synthetic */ long z;

    public o0(float f, androidx.compose.foundation.layout.z0 z0Var, long j, androidx.compose.runtime.internal.f fVar, long j2) {
        this.e = f;
        this.y = z0Var;
        this.z = j;
        this.A = fVar;
        this.B = j2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.animation.core.k1 k1VarR = q.r(androidx.compose.material3.tokens.p.B, sVar);
            androidx.compose.animation.core.k1 k1VarR2 = q.r(androidx.compose.material3.tokens.p.A, sVar);
            androidx.compose.animation.core.k1 k1VarR3 = q.r(androidx.compose.material3.tokens.p.y, sVar);
            androidx.compose.animation.core.k1 k1VarR4 = q.r(androidx.compose.material3.tokens.p.z, sVar);
            float f = this.e;
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.i1.b(oVar, 0.0f, f, 1), this.y);
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new s0();
                sVar.l0(objQ);
            }
            s0 s0Var = (s0) objQ;
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
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, s0Var, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(oVar, "leadingIcon");
            androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
            androidx.compose.animation.g0.b(false, rVarK, androidx.compose.animation.s0.a(k1VarR3, hVar).a(androidx.compose.animation.s0.b(k1VarR, 2)), androidx.compose.animation.s0.d(k1VarR4, hVar).a(androidx.compose.animation.s0.c(k1VarR2, 2)), null, androidx.compose.runtime.internal.k.c(687705959, new n0(this.z, 0), sVar), sVar, 196656);
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(androidx.compose.ui.layout.a0.k(oVar, "label"), q0.a, 0.0f, 2);
            androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarS);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            this.A.invoke(sVar, 0);
            sVar.p(true);
            androidx.compose.ui.r rVarK2 = androidx.compose.ui.layout.a0.k(oVar, "trailingIcon");
            androidx.compose.ui.h hVar2 = androidx.compose.ui.c.L;
            androidx.compose.animation.g0.b(false, rVarK2, androidx.compose.animation.s0.a(k1VarR3, hVar2).a(androidx.compose.animation.s0.b(k1VarR, 2)), androidx.compose.animation.s0.d(k1VarR4, hVar2).a(androidx.compose.animation.s0.c(k1VarR2, 2)), null, androidx.compose.runtime.internal.k.c(1905252304, new n0(this.B, 1), sVar), sVar, 196656);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
