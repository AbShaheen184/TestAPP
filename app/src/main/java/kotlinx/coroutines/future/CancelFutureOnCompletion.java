package kotlinx.coroutines.future;

import java.util.concurrent.Future;
import kotlinx.coroutines.JobNode;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class CancelFutureOnCompletion extends JobNode {
    private final Future<?> future;

    public CancelFutureOnCompletion(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        if (th == null || this.future.isDone()) {
            return;
        }
        this.future.cancel(false);
    }
}
