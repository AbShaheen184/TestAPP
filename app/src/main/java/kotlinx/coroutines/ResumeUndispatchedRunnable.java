package kotlinx.coroutines;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ResumeUndispatchedRunnable implements Runnable {
    private final CancellableContinuation<y> continuation;
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation<? super y> cancellableContinuation) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, y.a);
    }
}
