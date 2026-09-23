package kotlinx.coroutines;

import com.google.firebase.platforminfo.b;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableContinuationKt {
    @InternalCoroutinesApi
    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        invokeOnCancellation(cancellableContinuation, new DisposeOnCancel(disposableHandle));
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(d<? super T> dVar) {
        if (!(dVar instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(dVar, 1);
        }
        CancellableContinuationImpl<T> cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) dVar).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl<>(dVar, 2);
    }

    public static final <T> void invokeOnCancellation(CancellableContinuation<? super T> cancellableContinuation, CancelHandler cancelHandler) {
        if (cancellableContinuation instanceof CancellableContinuationImpl) {
            ((CancellableContinuationImpl) cancellableContinuation).invokeOnCancellationInternal$kotlinx_coroutines_core(cancelHandler);
        } else {
            b.n("third-party implementation of CancellableContinuation is not supported");
        }
    }

    public static final <T> Object suspendCancellableCoroutine(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        lVar.invoke(cancellableContinuationImpl);
        return cancellableContinuationImpl.getResult();
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        lVar.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.e) {
            dVar.getClass();
        }
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(h.f(dVar));
        try {
            lVar.invoke(orCreateCancellableContinuation);
            return orCreateCancellableContinuation.getResult();
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(h.f(dVar));
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.a.e) {
                dVar.getClass();
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
