package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.p y;

    public /* synthetic */ e(int i, kotlin.jvm.functions.p pVar) {
        this.e = i;
        this.y = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, j.f).d(new androidx.compose.foundation.layout.h0(androidx.compose.ui.c.J));
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
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
                    this.y.invoke(sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.r rVarD2 = androidx.compose.foundation.layout.b.p(new androidx.compose.foundation.layout.t0(1.0f, false), j.g).d(new androidx.compose.foundation.layout.h0(androidx.compose.ui.c.J));
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarD2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, q0VarD2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.g;
                    if (sVar2.S || !kotlin.jvm.internal.l.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar2, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                    this.y.invoke(sVar2, 0);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
