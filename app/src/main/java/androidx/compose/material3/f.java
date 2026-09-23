package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ androidx.compose.runtime.internal.f C;
    public final /* synthetic */ kotlin.jvm.functions.p e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ long z;

    public f(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, long j, long j2, long j3, long j4, androidx.compose.runtime.internal.f fVar) {
        this.e = pVar;
        this.y = pVar2;
        this.z = j2;
        this.A = j3;
        this.B = j4;
        this.C = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, j.e);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
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
            androidx.compose.runtime.t.x(sVar, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            sVar.b0(346092326);
            sVar.p(false);
            kotlin.jvm.functions.p pVar = this.e;
            if (pVar == null) {
                sVar.b0(346396529);
            } else {
                sVar.b0(346396530);
                androidx.compose.material3.internal.i.b(this.z, n6.a(androidx.compose.material3.tokens.g.e, sVar), androidx.compose.runtime.internal.k.c(71284337, new e(0, pVar), sVar), sVar, 384);
            }
            sVar.p(false);
            kotlin.jvm.functions.p pVar2 = this.y;
            if (pVar2 == null) {
                sVar.b0(347174009);
            } else {
                sVar.b0(347174010);
                androidx.compose.material3.internal.i.b(this.A, n6.a(androidx.compose.material3.tokens.g.g, sVar), androidx.compose.runtime.internal.k.c(705583346, new e(1, pVar2), sVar), sVar, 384);
            }
            sVar.p(false);
            androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(androidx.compose.ui.c.L);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, h0Var);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            androidx.compose.material3.internal.i.b(this.B, n6.a(androidx.compose.material3.tokens.g.b, sVar), this.C, sVar, 0);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
