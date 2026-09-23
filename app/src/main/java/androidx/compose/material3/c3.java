package androidx.compose.material3;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ i3 A;
    public final /* synthetic */ androidx.compose.animation.core.d B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ kotlin.jvm.functions.l D;
    public final /* synthetic */ androidx.compose.ui.r E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ float K;
    public final /* synthetic */ kotlin.jvm.functions.p L;
    public final /* synthetic */ kotlin.jvm.functions.p M;
    public final /* synthetic */ androidx.compose.runtime.internal.f N;
    public final /* synthetic */ long e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ j5 z;

    public c3(long j, kotlin.jvm.functions.a aVar, j5 j5Var, i3 i3Var, androidx.compose.animation.core.d dVar, CoroutineScope coroutineScope, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, float f, boolean z, androidx.compose.ui.graphics.n0 n0Var, long j2, long j3, float f2, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, androidx.compose.runtime.internal.f fVar) {
        this.e = j;
        this.y = aVar;
        this.z = j5Var;
        this.A = i3Var;
        this.B = dVar;
        this.C = coroutineScope;
        this.D = lVar;
        this.E = rVar;
        this.F = f;
        this.G = z;
        this.H = n0Var;
        this.I = j2;
        this.J = j3;
        this.K = f2;
        this.L = pVar;
        this.M = pVar2;
        this.N = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarM = androidx.compose.foundation.layout.b.m(androidx.compose.foundation.layout.i1.c);
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.foundation.gestures.w1(28);
                sVar.l0(objQ);
            }
            androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(rVarM, false, (kotlin.jvm.functions.l) objQ);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarA);
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
            j5 j5Var = this.z;
            boolean z = ((k5) j5Var.c.h.getValue()) != k5.e;
            boolean z2 = this.A.c;
            long j = this.e;
            kotlin.jvm.functions.a aVar = this.y;
            h3.c(j, aVar, z, z2, sVar, 0);
            h3.b(this.B, this.C, aVar, this.D, this.E, j5Var, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, sVar, 70);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
