package androidx.compose.material3;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.animation.core.k1 A;
    public final /* synthetic */ kotlin.jvm.functions.p B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ androidx.compose.runtime.internal.f D;
    public final /* synthetic */ n3 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public u3(n3 n3Var, boolean z, boolean z2, androidx.compose.animation.core.k1 k1Var, kotlin.jvm.functions.p pVar, boolean z3, androidx.compose.runtime.internal.f fVar) {
        this.e = n3Var;
        this.y = z;
        this.z = z2;
        this.A = k1Var;
        this.B = pVar;
        this.C = z3;
        this.D = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        androidx.compose.ui.r cVar;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.z;
            boolean z2 = this.y;
            n3 n3Var = this.e;
            if (z) {
                j = z2 ? n3Var.a : n3Var.d;
            } else {
                j = n3Var.f;
            }
            androidx.compose.runtime.w2 w2VarA = androidx.compose.animation.e1.a(j, this.A, sVar);
            if (this.B == null || !(this.C || z2)) {
                sVar.b0(-634793532);
                sVar.p(false);
                cVar = androidx.compose.ui.o.b;
            } else {
                sVar.b0(-634794445);
                Object objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = new t3(0);
                    sVar.l0(objQ);
                }
                AtomicInteger atomicInteger = androidx.compose.ui.semantics.q.a;
                cVar = new androidx.compose.ui.semantics.c((kotlin.jvm.functions.l) objQ);
                sVar.p(false);
            }
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, cVar);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
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
            androidx.compose.runtime.t.a(a1.a.a(new androidx.compose.ui.graphics.t(((androidx.compose.ui.graphics.t) w2VarA.getValue()).a)), this.D, sVar, 8);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
