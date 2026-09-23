package kotlinx.coroutines.internal;

import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Expected positive parallelism level, but got "));
    }

    public static final CoroutineDispatcher namedOrThis(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
