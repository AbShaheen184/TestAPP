package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ResumeOnCompletion extends JobNode {
    private final d<y> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(d<? super y> dVar) {
        this.continuation = dVar;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.continuation.resumeWith(y.a);
    }
}
