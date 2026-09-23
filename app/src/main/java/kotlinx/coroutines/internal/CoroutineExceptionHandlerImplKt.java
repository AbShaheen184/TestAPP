package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.k;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerImplKt {
    private static final Collection<CoroutineExceptionHandler> platformExceptionHandlers = k.O(k.K(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void ensurePlatformExceptionHandlerLoaded(CoroutineExceptionHandler coroutineExceptionHandler) {
        if (platformExceptionHandlers.contains(coroutineExceptionHandler)) {
            return;
        }
        kotlinx.coroutines.future.a.u("Exception handler was not found via a ServiceLoader");
    }

    public static final Collection<CoroutineExceptionHandler> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void propagateExceptionFinalResort(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
