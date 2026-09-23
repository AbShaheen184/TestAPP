package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface Delay {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        @c
        public static Object delay(Delay delay, long j, d<? super y> dVar) {
            y yVar = y.a;
            if (j <= 0) {
                return yVar;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo87scheduleResumeAfterDelay(j, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, j jVar) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, jVar);
        }
    }

    @c
    Object delay(long j, d<? super y> dVar);

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, j jVar);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation);
}
