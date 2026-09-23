package coil3.compose.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends CoroutineDispatcher {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(e.class, "y");
    public final CoroutineDispatcher e;
    public volatile /* synthetic */ int y = 1;

    public e(CoroutineDispatcher coroutineDispatcher) {
        this.e = coroutineDispatcher;
    }

    public final CoroutineDispatcher a() {
        return z.get(this) == 1 ? Dispatchers.getUnconfined() : this.e;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo86dispatch(j jVar, Runnable runnable) {
        a().mo86dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(j jVar, Runnable runnable) {
        a().dispatchYield(jVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(j jVar) {
        return a().isDispatchNeeded(jVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        return a().limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.e + ")";
    }
}
