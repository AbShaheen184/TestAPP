package androidx.navigation.compose;

import androidx.compose.runtime.j1;
import androidx.navigation.b0;
import androidx.navigation.j0;
import androidx.navigation.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.g0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@j0("composable")
public final class i extends k0 {
    public final j1 c = androidx.compose.runtime.t.r(Boolean.FALSE);

    @Override // androidx.navigation.k0
    public final androidx.navigation.t a() {
        return new h(this, c.a);
    }

    @Override // androidx.navigation.k0
    public final void d(List list, b0 b0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.i iVar = (androidx.navigation.i) it.next();
            androidx.navigation.l lVarB = b();
            StateFlow stateFlow = lVarB.e;
            iVar.getClass();
            MutableStateFlow mutableStateFlow = lVarB.c;
            Iterable iterable = (Iterable) mutableStateFlow.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((androidx.navigation.i) it2.next()) == iVar) {
                            Iterable iterable2 = (Iterable) stateFlow.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((androidx.navigation.i) it3.next()) == iVar) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            androidx.navigation.i iVar2 = (androidx.navigation.i) kotlin.collections.p.K((List) stateFlow.getValue());
            if (iVar2 != null) {
                mutableStateFlow.setValue(g0.i((Set) mutableStateFlow.getValue(), iVar2));
            }
            mutableStateFlow.setValue(g0.i((Set) mutableStateFlow.getValue(), iVar));
            lVarB.f(iVar);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.k0
    public final void e(androidx.navigation.i iVar, boolean z) {
        b().e(iVar, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(androidx.navigation.i iVar) {
        androidx.navigation.l lVarB = b();
        iVar.getClass();
        MutableStateFlow mutableStateFlow = lVarB.c;
        mutableStateFlow.setValue(g0.i((Set) mutableStateFlow.getValue(), iVar));
        androidx.navigation.internal.f fVar = lVarB.h.b;
        fVar.getClass();
        if (fVar.f.contains(iVar)) {
            iVar.a(androidx.lifecycle.o.A);
        } else {
            kotlinx.coroutines.future.a.u("Cannot transition entry that is not in the back stack");
        }
    }
}
