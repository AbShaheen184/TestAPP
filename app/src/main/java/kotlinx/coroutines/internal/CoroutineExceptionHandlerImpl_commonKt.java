package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.coroutines.j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(j jVar, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(jVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(CoroutineExceptionHandlerKt.handlerException(th, th2));
            }
        }
        try {
            kotlin.a.a(th, new DiagnosticCoroutineContextException(jVar));
        } catch (Throwable unused2) {
        }
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th);
    }
}
