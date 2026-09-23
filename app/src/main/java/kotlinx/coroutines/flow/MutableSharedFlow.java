package kotlinx.coroutines.flow;

import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t, kotlin.coroutines.d<? super y> dVar);

    StateFlow<Integer> getSubscriptionCount();

    @ExperimentalCoroutinesApi
    void resetReplayCache();

    boolean tryEmit(T t);
}
