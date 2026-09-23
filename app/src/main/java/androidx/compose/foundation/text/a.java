package androidx.compose.foundation.text;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(long j, kotlin.jvm.functions.p pVar, int i) {
        this.e = 1;
        this.y = j;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) this.z;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = this.y;
                    if (j != 9205357640488583168L) {
                        sVar.b0(-1244013944);
                        androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.i1.l(rVar, androidx.compose.ui.unit.h.b(j), androidx.compose.ui.unit.h.a(j), 0.0f, 0.0f, 12);
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.y, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL = sVar.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarL);
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
                        androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                        d.b(null, sVar, 0, 1);
                        sVar.p(true);
                        sVar.p(false);
                    } else {
                        sVar.b0(-1243644858);
                        d.b(rVar, sVar, 0, 0);
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.a1.c(this.y, (kotlin.jvm.functions.p) this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            default:
                String str = (String) this.z;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(str, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 24, 12), androidx.compose.ui.graphics.t.c(this.y, com.app.mlounge.ui.theme.b.f) ? androidx.compose.ui.graphics.t.d : com.app.mlounge.ui.theme.b.m, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).k, sVar2, 1572912, 0, 131000);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ a(long j, Object obj, int i) {
        this.e = i;
        this.y = j;
        this.z = obj;
    }
}
