package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorsKt {
    public static final Executor asExecutor(CoroutineDispatcher coroutineDispatcher) {
        Executor executor;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) ? new DispatcherExecutor(coroutineDispatcher) : executor;
    }

    public static final CoroutineDispatcher from(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        DispatcherExecutor dispatcherExecutor = executor instanceof DispatcherExecutor ? (DispatcherExecutor) executor : null;
        return (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.dispatcher) == null) ? new ExecutorCoroutineDispatcherImpl(executor) : coroutineDispatcher;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
    }

    public static final ExecutorCoroutineDispatcher from(ExecutorService executorService) {
        return new ExecutorCoroutineDispatcherImpl(executorService);
    }
}
