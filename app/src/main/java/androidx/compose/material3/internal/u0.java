package androidx.compose.material3.internal;

import androidx.compose.material3.h4;
import androidx.compose.material3.x5;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ androidx.compose.runtime.a1 e;
    public final /* synthetic */ x5 y;
    public final /* synthetic */ androidx.compose.foundation.layout.z0 z;

    public u0(androidx.compose.runtime.a1 a1Var, x5 x5Var, androidx.compose.foundation.layout.z0 z0Var, androidx.compose.runtime.internal.f fVar) {
        this.e = a1Var;
        this.y = x5Var;
        this.z = z0Var;
        this.A = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(androidx.compose.ui.o.b, "Container");
            t0 t0Var = new t0(this.e, androidx.compose.runtime.a1.class, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;", 0);
            androidx.compose.ui.d dVarD = a1.d(this.y);
            float f = h4.a;
            androidx.compose.ui.r rVarE = androidx.compose.ui.draw.h.e(rVarK, new androidx.compose.animation.core.a(10, t0Var, this.z, dVarD));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarE);
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
            this.A.invoke(sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
