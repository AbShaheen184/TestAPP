package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.k;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher dispatcher;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        k kVar = k.e;
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, kVar)) {
            DispatchedContinuationKt.safeDispatch(this.dispatcher, kVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
