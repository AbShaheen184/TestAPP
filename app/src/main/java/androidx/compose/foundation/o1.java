package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static final void a(o1 o1Var, l1 l1Var) {
        AtomicReference atomicReference = o1Var.a;
        while (true) {
            l1 l1Var2 = (l1) atomicReference.get();
            if (l1Var2 != null && l1Var.a.compareTo(l1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(l1Var2, l1Var)) {
                    if (l1Var2 != null) {
                        l1Var2.b.cancel((CancellationException) new k1("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == l1Var2);
        }
    }
}
