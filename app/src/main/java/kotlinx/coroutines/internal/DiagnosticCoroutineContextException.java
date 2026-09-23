package kotlinx.coroutines.internal;

import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    private final transient j context;

    public DiagnosticCoroutineContextException(j jVar) {
        this.context = jVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.context);
    }
}
