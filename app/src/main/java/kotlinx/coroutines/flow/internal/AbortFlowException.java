package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {
    public final transient Object owner;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
