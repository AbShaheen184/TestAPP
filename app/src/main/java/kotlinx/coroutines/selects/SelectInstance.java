package kotlinx.coroutines.selects;

import kotlin.coroutines.j;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface SelectInstance<R> {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    j getContext();

    void selectInRegistrationPhase(Object obj);

    boolean trySelect(Object obj, Object obj2);
}
