package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.j;
import kotlin.coroutines.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(kotlin.coroutines.d dVar) {
        super(dVar);
        if (dVar == null || dVar.getContext() == k.e) {
            return;
        }
        kotlinx.coroutines.future.a.q("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.d
    public j getContext() {
        return k.e;
    }
}
