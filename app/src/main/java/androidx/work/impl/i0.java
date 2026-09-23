package androidx.work.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final String a = androidx.work.y.g("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, androidx.work.x xVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object obj;
        try {
            if (!listenableFuture.isDone()) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(iVar), 1);
                cancellableContinuationImpl.initCancellability();
                listenableFuture.a(new l(listenableFuture, cancellableContinuationImpl), androidx.work.l.e);
                cancellableContinuationImpl.invokeOnCancellation(new androidx.compose.foundation.text.c0(5, xVar, listenableFuture));
                return cancellableContinuationImpl.getResult();
            }
            boolean z = false;
            while (true) {
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
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
