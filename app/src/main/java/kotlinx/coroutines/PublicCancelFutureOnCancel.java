package kotlinx.coroutines;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class PublicCancelFutureOnCancel implements CancelHandler {
    private final Future<?> future;

    public PublicCancelFutureOnCancel(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}
