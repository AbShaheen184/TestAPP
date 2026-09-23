package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CancelledContinuation extends CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public CancelledContinuation(d<?> dVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z);
    }

    private final /* synthetic */ int get_resumed$volatile() {
        return this._resumed$volatile;
    }

    private final /* synthetic */ void set_resumed$volatile(int i) {
        this._resumed$volatile = i;
    }

    public final boolean makeResumed() {
        return _resumed$volatile$FU.compareAndSet(this, 0, 1);
    }
}
