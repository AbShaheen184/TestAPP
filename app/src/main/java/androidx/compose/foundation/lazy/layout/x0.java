package androidx.compose.foundation.lazy.layout;

import androidx.compose.material3.g5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.internal.f y;

    public /* synthetic */ x0(androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 1;
        float f = androidx.compose.material3.j.a;
        float f2 = androidx.compose.material3.j.a;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.internal.f fVar = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m.c(fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(7));
                break;
            case 1:
                float f = androidx.compose.material3.j.a;
                float f2 = androidx.compose.material3.j.a;
                ((Integer) obj2).getClass();
                androidx.compose.material3.j.b(fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(439));
                break;
            case 2:
                ((Integer) obj2).getClass();
                g5.a(fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(55));
                break;
            default:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, androidx.compose.ui.o.b);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    fVar.invoke(androidx.compose.foundation.layout.x.a, sVar, 6);
                    sVar.p(true);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ x0(androidx.compose.runtime.internal.f fVar) {
        this.e = 3;
        this.y = fVar;
    }

    public /* synthetic */ x0(androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.e = i2;
        this.y = fVar;
    }
}
