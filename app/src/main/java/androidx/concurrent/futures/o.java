package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public final ListenableFuture e;
    public final CancellableContinuationImpl y;

    public o(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = listenableFuture;
        this.y = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.e;
        boolean zIsCancelled = listenableFuture.isCancelled();
        CancellableContinuationImpl cancellableContinuationImpl = this.y;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
            return;
        }
        try {
            cancellableContinuationImpl.resumeWith(h.i(listenableFuture));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            cancellableContinuationImpl.resumeWith(new kotlin.l(cause));
        }
    }
}
