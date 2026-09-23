package androidx.work.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public final ListenableFuture e;
    public final CancellableContinuationImpl y;

    public l(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = listenableFuture;
        this.y = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ListenableFuture listenableFuture = this.e;
        boolean zIsCancelled = listenableFuture.isCancelled();
        CancellableContinuationImpl cancellableContinuationImpl = this.y;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
            return;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                cancellableContinuationImpl.resumeWith(new kotlin.l(cause));
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        cancellableContinuationImpl.resumeWith(obj);
    }
}
