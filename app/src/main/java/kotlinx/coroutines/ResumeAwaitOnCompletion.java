package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ResumeAwaitOnCompletion<T> extends JobNode {
    private final CancellableContinuationImpl<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.continuation = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        boolean z = state$kotlinx_coroutines_core instanceof CompletedExceptionally;
        CancellableContinuationImpl<T> cancellableContinuationImpl = this.continuation;
        if (z) {
            cancellableContinuationImpl.resumeWith(kotlin.a.b(((CompletedExceptionally) state$kotlinx_coroutines_core).cause));
        } else {
            cancellableContinuationImpl.resumeWith(JobSupportKt.unboxState(state$kotlinx_coroutines_core));
        }
    }
}
