package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.work.impl.model.p;
import androidx.work.z;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.work.impl.constraints.controllers.d {
    public final ConnectivityManager a;

    public f(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final Flow a(androidx.work.e eVar) {
        eVar.getClass();
        return FlowKt.callbackFlow(new e(eVar, this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean b(p pVar) {
        pVar.getClass();
        androidx.work.e eVar = pVar.j;
        return (eVar.a() == null && eVar.a == z.e) ? false : true;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean c(p pVar) {
        if (!b(pVar)) {
            return false;
        }
        kotlinx.coroutines.future.a.u("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }
}
