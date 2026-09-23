package androidx.compose.foundation.text.selection;

import androidx.compose.material3.s4;
import androidx.compose.material3.z5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(String str, boolean z) {
        this.y = z;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                final kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar.b0(-196777734);
                final long j = ((i1) sVar.j(j1.a)).a;
                boolean zE = sVar.e(j) | sVar.f(aVar);
                final boolean z = this.y;
                boolean zG = zE | sVar.g(z);
                Object objQ = sVar.Q();
                if (zG || objQ == androidx.compose.runtime.n.a) {
                    objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.text.selection.i
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj4) {
                            androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj4;
                            return dVar.b(new a(0, aVar, kotlin.math.a.k(dVar, Float.intBitsToFloat((int) (dVar.e.d() >> 32)) / 2.0f), new androidx.compose.ui.graphics.m(j, 5), z));
                        }
                    };
                    sVar.l0(objQ);
                }
                androidx.compose.ui.r rVarD = androidx.compose.ui.draw.h.d(rVar, (kotlin.jvm.functions.l) objQ);
                sVar.p(false);
                return rVarD;
            default:
                String str = (String) this.z;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.g1) obj).getClass();
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z2 = this.y;
                    if (z2) {
                        sVar2.b0(1516335711);
                        long j2 = com.app.mlounge.ui.theme.b.f;
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        s4.a(androidx.compose.foundation.layout.i1.m(oVar, 18), j2, 2, 0L, 0, 0.0f, sVar2, 438, 56);
                        androidx.compose.foundation.layout.b.e(sVar2, androidx.compose.foundation.layout.i1.q(oVar, 8));
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1516552897);
                        sVar2.p(false);
                    }
                    if (z2) {
                        str = "Loading...";
                    }
                    z5.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 262142);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ h(kotlin.jvm.functions.a aVar, boolean z) {
        this.z = aVar;
        this.y = z;
    }
}
