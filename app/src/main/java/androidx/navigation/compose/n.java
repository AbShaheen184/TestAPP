package androidx.navigation.compose;

import androidx.navigation.b0;
import androidx.navigation.j0;
import androidx.navigation.k0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@j0("dialog")
public final class n extends k0 {
    @Override // androidx.navigation.k0
    public final androidx.navigation.t a() {
        androidx.compose.runtime.internal.f fVar = e.a;
        return new m(this);
    }

    @Override // androidx.navigation.k0
    public final void d(List list, b0 b0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((androidx.navigation.i) it.next());
        }
    }

    @Override // androidx.navigation.k0
    public final void e(androidx.navigation.i iVar, boolean z) {
        b().e(iVar, z);
        int iF = kotlin.collections.p.F((Iterable) b().f.getValue(), iVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            androidx.navigation.i iVar2 = (androidx.navigation.i) obj;
            if (i > iF) {
                b().c(iVar2);
            }
            i = i2;
        }
    }
}
