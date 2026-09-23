package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface DelayWithTimeoutDiagnostics extends Delay {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        @c
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, d<? super y> dVar) {
            Object objDelay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, dVar);
            return objDelay == kotlin.coroutines.intrinsics.a.e ? objDelay : y.a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, Runnable runnable, j jVar) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, jVar);
        }
    }

    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m19timeoutMessageLRDsOJo(long j);
}
