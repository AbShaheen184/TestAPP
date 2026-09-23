package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchersKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    public static final DefaultIoScheduler INSTANCE = new DefaultIoScheduler();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final CoroutineDispatcher f1default;

    static {
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.INSTANCE;
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        f1default = CoroutineDispatcher.limitedParallelism$default(unlimitedIoScheduler, SystemPropsKt__SystemProps_commonKt.systemProp$default(DispatchersKt.IO_PARALLELISM_PROPERTY_NAME, 64 < available_processors ? available_processors : 64, 0, 0, 12, (Object) null), null, 2, null);
    }

    private DefaultIoScheduler() {
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(j jVar, Runnable runnable) {
        f1default.mo86dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(j jVar, Runnable runnable) {
        f1default.dispatchYield(jVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo86dispatch(k.e, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        return UnlimitedIoScheduler.INSTANCE.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this;
    }
}
