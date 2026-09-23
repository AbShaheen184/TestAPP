package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ androidx.compose.foundation.a0 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ androidx.compose.foundation.interaction.k D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ kotlin.jvm.functions.a F;
    public final /* synthetic */ float G;
    public final /* synthetic */ androidx.compose.runtime.internal.f H;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 y;
    public final /* synthetic */ long z;

    public o5(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, float f, androidx.compose.foundation.a0 a0Var, boolean z, androidx.compose.foundation.interaction.k kVar, boolean z2, kotlin.jvm.functions.a aVar, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = n0Var;
        this.z = j;
        this.A = f;
        this.B = a0Var;
        this.C = z;
        this.D = kVar;
        this.E = z2;
        this.F = aVar;
        this.G = f2;
        this.H = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.layout.n nVar = t1.a;
            androidx.compose.ui.r rVarF = androidx.compose.material3.internal.i.f(androidx.compose.foundation.selection.c.a(p5.c(this.e.d(o2.b), this.y, p5.d(this.z, this.A, sVar), this.B, ((androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h)).W(this.G)), this.C, this.D, x4.a(false, 0.0f, 7), this.E, null, this.F));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarF);
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
            this.H.invoke(sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
