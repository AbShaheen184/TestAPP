package kotlinx.coroutines;

import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, CoroutineDispatcher coroutineDispatcher, j jVar) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + jVar, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
