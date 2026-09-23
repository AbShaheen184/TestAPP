package androidx.navigation.compose;

import androidx.compose.foundation.text.c0;
import androidx.compose.runtime.a1;
import com.app.mlounge.ui.components.u0;
import com.app.mlounge.ui.viewmodel.w1;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ k(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = z;
        this.A = obj2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                final androidx.navigation.i iVar = (androidx.navigation.i) this.z;
                final List list = (List) this.A;
                final boolean z = this.y;
                androidx.lifecycle.t tVar = new androidx.lifecycle.t() { // from class: androidx.navigation.compose.l
                    @Override // androidx.lifecycle.t
                    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                        boolean z2 = z;
                        List list2 = list;
                        androidx.navigation.i iVar2 = iVar;
                        if (z2 && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_START && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_STOP) {
                            list2.remove(iVar2);
                        }
                    }
                };
                iVar.E.j.a(tVar);
                return new androidx.activity.compose.k(11, iVar, tVar);
            default:
                a1 a1Var = (a1) this.z;
                w1 w1Var = (w1) this.A;
                androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
                jVar.getClass();
                List list2 = (List) a1Var.getValue();
                jVar.q(list2.size(), new c0(29, new com.app.mlounge.ui.screens.sources.b(0), list2), new u0(22, list2), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.sources.d(list2, this.y, w1Var)));
                return y.a;
        }
    }
}
