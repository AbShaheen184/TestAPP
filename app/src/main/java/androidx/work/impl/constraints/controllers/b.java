package androidx.work.impl.constraints.controllers;

import androidx.navigation.u;
import androidx.room.s;
import androidx.work.impl.model.p;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {
    public final u a;

    public b(u uVar) {
        uVar.getClass();
        this.a = uVar;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final Flow a(androidx.work.e eVar) {
        eVar.getClass();
        return FlowKt.callbackFlow(new s(this, (kotlin.coroutines.d) null, 6));
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean c(p pVar) {
        return b(pVar) && e(this.a.c());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
