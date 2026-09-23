package androidx.compose.animation;

import androidx.compose.ui.platform.k1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(androidx.compose.ui.platform.a aVar, int i, int i2) {
        super(2);
        this.y = i2;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                m0 m0Var = (m0) obj;
                m0 m0Var2 = (m0) obj2;
                m0 m0Var3 = m0.z;
                return Boolean.valueOf(m0Var == m0Var3 && m0Var2 == m0Var3 && !((y0) this.z).a.c);
            case 1:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
                androidx.compose.ui.r rVarB = (androidx.compose.ui.p) obj2;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) this.z;
                if (rVarB instanceof androidx.compose.ui.m) {
                    kotlin.jvm.functions.q qVar = ((androidx.compose.ui.m) rVarB).b;
                    kotlin.jvm.internal.c0.c(3, qVar);
                    rVarB = androidx.compose.ui.a.b(sVar, (androidx.compose.ui.r) qVar.invoke(androidx.compose.ui.o.b, sVar, 0));
                }
                return rVar.d(rVarB);
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.z;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) list.get(i);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.c;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        pVar.invoke(sVar2, 0);
                        sVar2.p(true);
                    }
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((androidx.compose.ui.platform.a) this.z).a(0, sVar3);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
            case 4:
                ((Number) obj2).intValue();
                ((k1) this.z).a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj);
                return kotlin.y.a;
            case 5:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objQ = sVar4.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.compose.ui.window.d.z;
                        sVar4.l0(objQ);
                    }
                    t1.d(androidx.compose.ui.semantics.q.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ), (kotlin.jvm.functions.p) ((androidx.compose.runtime.a1) this.z).getValue(), sVar4, 0);
                } else {
                    sVar4.W();
                }
                return kotlin.y.a;
            case 6:
                ((Number) obj2).intValue();
                ((androidx.compose.ui.window.v) this.z).a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj);
                return kotlin.y.a;
            default:
                ((Number) obj2).intValue();
                ((androidx.compose.ui.window.z) this.z).a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj);
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i) {
        super(2);
        this.y = i;
        this.z = obj;
    }
}
