package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultExecutorKt {
    private static final boolean defaultMainDelayOptIn = SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);
    private static final Delay DefaultDelay = initializeDefaultDelay();

    public static final Delay getDefaultDelay() {
        return DefaultDelay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Delay initializeDefaultDelay() {
        if (!defaultMainDelayOptIn) {
            return DefaultExecutor.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        return (MainDispatchersKt.isMissing(main) || !(main instanceof Delay)) ? DefaultExecutor.INSTANCE : (Delay) main;
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }
}
