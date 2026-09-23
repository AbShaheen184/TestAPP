package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ChildContinuation extends JobNode {
    public final CancellableContinuationImpl<?> child;

    public ChildContinuation(CancellableContinuationImpl<?> cancellableContinuationImpl) {
        this.child = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        CancellableContinuationImpl<?> cancellableContinuationImpl = this.child;
        cancellableContinuationImpl.parentCancelled$kotlinx_coroutines_core(cancellableContinuationImpl.getContinuationCancellationCause(getJob()));
    }
}
