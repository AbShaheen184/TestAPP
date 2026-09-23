package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineSchedulerKt {
    public static final boolean isSchedulerWorker(Thread thread) {
        return thread instanceof CoroutineScheduler.Worker;
    }

    public static final boolean mayNotBlock(Thread thread) {
        return (thread instanceof CoroutineScheduler.Worker) && ((CoroutineScheduler.Worker) thread).state == CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
