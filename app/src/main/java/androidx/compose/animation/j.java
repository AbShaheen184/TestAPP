package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ v B;
    public final /* synthetic */ androidx.compose.runtime.snapshots.q C;
    public final /* synthetic */ androidx.compose.runtime.internal.f D;
    public final /* synthetic */ e2 y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e2 e2Var, Object obj, kotlin.jvm.functions.l lVar, v vVar, androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.internal.f fVar) {
        super(2);
        this.y = e2Var;
        this.z = obj;
        this.A = lVar;
        this.B = vVar;
        this.C = qVar;
        this.D = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objQ = sVar.Q();
            kotlin.jvm.functions.l lVar = this.A;
            v vVar = this.B;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = (l0) lVar.invoke(vVar);
                sVar.l0(objQ);
            }
            l0 l0Var = (l0) objQ;
            e2 e2Var = this.y;
            y1 y1VarF = e2Var.f();
            j1 j1Var = e2Var.d;
            Object objC = y1VarF.c();
            Object obj3 = this.z;
            boolean zG = sVar.g(kotlin.jvm.internal.l.a(objC, obj3));
            Object objQ2 = sVar.Q();
            if (zG || objQ2 == fVar) {
                objQ2 = kotlin.jvm.internal.l.a(e2Var.f().c(), obj3) ? y0.b : ((l0) lVar.invoke(vVar)).b;
                sVar.l0(objQ2);
            }
            y0 y0Var = (y0) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar) {
                objQ3 = new q(kotlin.jvm.internal.l.a(obj3, j1Var.getValue()));
                sVar.l0(objQ3);
            }
            q qVar = (q) objQ3;
            x0 x0Var = l0Var.a;
            boolean zH = sVar.h(l0Var);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == fVar) {
                objQ4 = new d(l0Var);
                sVar.l0(objQ4);
            }
            androidx.compose.ui.r rVarJ = androidx.compose.ui.layout.a0.j(androidx.compose.ui.o.b, (kotlin.jvm.functions.q) objQ4);
            qVar.b.setValue(Boolean.valueOf(kotlin.jvm.internal.l.a(obj3, j1Var.getValue())));
            androidx.compose.ui.r rVarD = rVarJ.d(qVar);
            boolean zH2 = sVar.h(obj3);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == fVar) {
                objQ5 = new e(obj3, 0);
                sVar.l0(objQ5);
            }
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ5;
            boolean zF = sVar.f(y0Var);
            Object objQ6 = sVar.Q();
            if (zF || objQ6 == fVar) {
                objQ6 = new f(y0Var, 0);
                sVar.l0(objQ6);
            }
            g0.a(this.y, lVar2, rVarD, x0Var, y0Var, (kotlin.jvm.functions.p) objQ6, androidx.compose.runtime.internal.k.c(-143346359, new i(this.C, obj3, vVar, this.D), sVar), sVar, 12582912);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
