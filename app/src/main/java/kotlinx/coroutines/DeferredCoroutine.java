package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(j jVar, boolean z) {
        super(jVar, true, z);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(d<? super T> dVar) {
        return awaitInternal(dVar);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        selectClause1.getClass();
        return selectClause1;
    }
}
