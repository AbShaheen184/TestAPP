package kotlinx.coroutines.internal;

import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> void callUndeliveredElement(l lVar, E e, j jVar) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lVar, e, null);
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(jVar, undeliveredElementExceptionCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(l lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(androidx.compose.runtime.j.f(e, "Exception in undelivered element handler for "), th);
            }
            kotlin.a.a(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(lVar, obj, undeliveredElementException);
    }
}
