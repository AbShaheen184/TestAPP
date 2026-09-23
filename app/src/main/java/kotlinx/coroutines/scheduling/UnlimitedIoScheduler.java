package kotlinx.coroutines.scheduling;

import kotlin.coroutines.j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class UnlimitedIoScheduler extends CoroutineDispatcher {
    public static final UnlimitedIoScheduler INSTANCE = new UnlimitedIoScheduler();

    private UnlimitedIoScheduler() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(j jVar, Runnable runnable) {
        DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(j jVar, Runnable runnable) {
        DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= TasksKt.MAX_POOL_SIZE ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
