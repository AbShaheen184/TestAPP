package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ConcurrentKt {
    private static final Method REMOVE_FUTURE_ON_CANCEL;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        REMOVE_FUTURE_ON_CANCEL = method;
    }

    public static final <E> Set<E> identitySet(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    public static final boolean removeFutureOnCancel(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = REMOVE_FUTURE_ON_CANCEL) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, kotlin.jvm.functions.a aVar) {
        reentrantLock.lock();
        try {
            return (T) aVar.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
