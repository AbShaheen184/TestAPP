package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ androidx.compose.foundation.a0 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ androidx.compose.runtime.internal.f D;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 y;
    public final /* synthetic */ long z;

    public m5(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, float f, androidx.compose.foundation.a0 a0Var, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = n0Var;
        this.z = j;
        this.A = f;
        this.B = a0Var;
        this.C = f2;
        this.D = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zT = sVar.T(iIntValue & 1, (iIntValue & 3) != 2);
        kotlin.y yVar = kotlin.y.a;
        if (!zT) {
            sVar.W();
            return yVar;
        }
        androidx.compose.ui.r rVarC = p5.c(this.e, this.y, p5.d(this.z, this.A, sVar), this.B, ((androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h)).W(this.C));
        Object objQ = sVar.Q();
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        if (objQ == fVar) {
            objQ = new t3(2);
            sVar.l0(objQ);
        }
        androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(rVarC, false, (kotlin.jvm.functions.l) objQ);
        Object objQ2 = sVar.Q();
        if (objQ2 == fVar) {
            objQ2 = l5.a;
            sVar.l0(objQ2);
        }
        androidx.compose.ui.r rVarA2 = androidx.compose.ui.input.pointer.h0.a(rVarA, yVar, (PointerInputEventHandler) objQ2);
        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
        int iHashCode = Long.hashCode(sVar.T);
        androidx.compose.runtime.internal.j jVarL = sVar.l();
        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarA2);
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
        androidx.compose.runtime.t.x(sVar, rVarC2, androidx.compose.ui.node.g.d);
        this.D.invoke(sVar, 0);
        sVar.p(true);
        return yVar;
    }
}
