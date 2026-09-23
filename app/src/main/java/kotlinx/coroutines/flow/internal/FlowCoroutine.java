package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class FlowCoroutine<T> extends ScopeCoroutine<T> {
    public FlowCoroutine(j jVar, d<? super T> dVar) {
        super(jVar, dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
