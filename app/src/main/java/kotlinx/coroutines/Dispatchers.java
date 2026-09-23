package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatchers {
    public static final Dispatchers INSTANCE = new Dispatchers();
    private static final CoroutineDispatcher Default = DefaultScheduler.INSTANCE;
    private static final CoroutineDispatcher Unconfined = Unconfined.INSTANCE;

    private Dispatchers() {
    }

    public static final CoroutineDispatcher getDefault() {
        return Default;
    }

    public static final CoroutineDispatcher getIO() {
        return DefaultIoScheduler.INSTANCE;
    }

    public static final MainCoroutineDispatcher getMain() {
        return MainDispatcherLoader.dispatcher;
    }

    public static final CoroutineDispatcher getUnconfined() {
        return Unconfined;
    }

    @DelicateCoroutinesApi
    public final void shutdown() {
        DefaultExecutor.INSTANCE.shutdown();
        DefaultScheduler.INSTANCE.shutdown$kotlinx_coroutines_core();
    }

    public static /* synthetic */ void getDefault$annotations() {
    }

    public static /* synthetic */ void getIO$annotations() {
    }

    public static /* synthetic */ void getMain$annotations() {
    }

    public static /* synthetic */ void getUnconfined$annotations() {
    }
}
