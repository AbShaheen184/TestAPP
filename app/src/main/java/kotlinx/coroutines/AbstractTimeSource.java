package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractTimeSource {
    public abstract long currentTimeMillis();

    public abstract long nanoTime();

    public abstract void parkNanos(Object obj, long j);

    public abstract void registerTimeLoopThread();

    public abstract void trackTask();

    public abstract void unTrackTask();

    public abstract void unpark(Thread thread);

    public abstract void unregisterTimeLoopThread();

    public abstract Runnable wrapTask(Runnable runnable);
}
