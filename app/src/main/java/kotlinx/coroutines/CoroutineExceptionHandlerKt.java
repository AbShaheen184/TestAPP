package kotlinx.coroutines;

import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineExceptionHandlerKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class AnonymousClass1 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ p $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, CoroutineExceptionHandler.Key key) {
            super(key);
            this.$handler = pVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(j jVar, Throwable th) {
            this.$handler.invoke(jVar, th);
        }
    }

    public static final CoroutineExceptionHandler CoroutineExceptionHandler(p pVar) {
        return new AnonymousClass1(pVar, CoroutineExceptionHandler.Key);
    }

    @InternalCoroutinesApi
    public static final void handleCoroutineException(j jVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) jVar.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(jVar, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(jVar, th);
            }
        } catch (Throwable th2) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(jVar, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        kotlin.a.a(runtimeException, th);
        return runtimeException;
    }
}
