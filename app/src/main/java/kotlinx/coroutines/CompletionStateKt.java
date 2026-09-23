package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.m;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, d<? super T> dVar) {
        return obj instanceof CompletedExceptionally ? kotlin.a.b(((CompletedExceptionally) obj).cause) : obj;
    }

    public static final <T> Object toState(Object obj) {
        Throwable thA = m.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thA = m.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }
}
