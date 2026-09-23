package androidx.compose.ui.window;

import androidx.compose.runtime.a1;
import androidx.compose.ui.layout.q0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, a1 a1Var, int i) {
        super(2);
        this.y = i;
        this.z = zVar;
        this.A = a1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.y;
        kotlin.y yVar = kotlin.y.a;
        a1 a1Var = this.A;
        z zVar = this.z;
        int i2 = 0;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    Object objQ = sVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (objQ == fVar) {
                        objQ = d.C;
                        sVar.l0(objQ);
                    }
                    androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ);
                    boolean zH = sVar.h(zVar);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new k(zVar, 1);
                        sVar.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarM = androidx.compose.ui.layout.a0.m(rVarA, (kotlin.jvm.functions.l) objQ2);
                    float f = zVar.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        rVarM = androidx.compose.ui.graphics.a0.q(rVarM, f, null, 520187);
                    }
                    androidx.compose.runtime.d0 d0Var = o.a;
                    kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) a1Var.getValue();
                    Object objQ3 = sVar.Q();
                    if (objQ3 == fVar) {
                        objQ3 = f.c;
                        sVar.l0(objQ3);
                    }
                    q0 q0Var = (q0) objQ3;
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarM);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, q0Var, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    pVar.invoke(sVar, 0);
                    sVar.p(true);
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    androidx.compose.runtime.t.a(o.b.a(Boolean.TRUE), androidx.compose.runtime.internal.k.c(1022273628, new n(zVar, a1Var, i2), sVar2), sVar2, 56);
                }
                break;
        }
        return yVar;
    }
}
