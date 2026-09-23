package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AbstractTimeSourceKt {
    private static AbstractTimeSource timeSource;

    private static final long currentTimeMillis() {
        AbstractTimeSource abstractTimeSource = timeSource;
        return abstractTimeSource != null ? abstractTimeSource.currentTimeMillis() : System.currentTimeMillis();
    }

    public static final void mockTimeSource(AbstractTimeSource abstractTimeSource) {
        timeSource = abstractTimeSource;
    }

    private static final long nanoTime() {
        AbstractTimeSource abstractTimeSource = timeSource;
        return abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime();
    }

    private static final void parkNanos(Object obj, long j) {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.parkNanos(obj, j);
        } else {
            LockSupport.parkNanos(obj, j);
        }
    }

    private static final void registerTimeLoopThread() {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.registerTimeLoopThread();
        }
    }

    private static final void trackTask() {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.trackTask();
        }
    }

    private static final void unTrackTask() {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.unTrackTask();
        }
    }

    private static final void unpark(Thread thread) {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.unpark(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    private static final void unregisterTimeLoopThread() {
        AbstractTimeSource abstractTimeSource = timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.unregisterTimeLoopThread();
        }
    }

    private static final Runnable wrapTask(Runnable runnable) {
        Runnable runnableWrapTask;
        AbstractTimeSource abstractTimeSource = timeSource;
        return (abstractTimeSource == null || (runnableWrapTask = abstractTimeSource.wrapTask(runnable)) == null) ? runnable : runnableWrapTask;
    }
}
