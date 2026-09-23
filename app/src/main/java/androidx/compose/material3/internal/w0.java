package androidx.compose.material3.internal;

import androidx.compose.animation.core.a2;
import androidx.compose.material3.s3;
import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ w2 e;
    public final /* synthetic */ long y;
    public final /* synthetic */ androidx.compose.ui.text.m0 z;

    public w0(a2 a2Var, long j, androidx.compose.ui.text.m0 m0Var, kotlin.jvm.functions.p pVar) {
        this.e = a2Var;
        this.y = j;
        this.z = m0Var;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= sVar.f(rVar) ? 4 : 2;
        }
        if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            w2 w2Var = this.e;
            boolean zF = sVar.f(w2Var);
            Object objQ = sVar.Q();
            if (zF || objQ == androidx.compose.runtime.n.a) {
                objQ = new s3(w2Var, 1);
                sVar.l0(objQ);
            }
            androidx.compose.ui.r rVarO = androidx.compose.ui.graphics.a0.o(rVar, (kotlin.jvm.functions.l) objQ);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarO);
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
            a1.b(this.y, this.z, this.A, sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
