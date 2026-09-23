package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ChildHandleNode extends JobNode implements ChildHandle {
    public final ChildJob childJob;

    public ChildHandleNode(ChildJob childJob) {
        this.childJob = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return getJob();
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }
}
