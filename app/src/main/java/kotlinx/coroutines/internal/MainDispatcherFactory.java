package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface MainDispatcherFactory {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static String hintOnError(MainDispatcherFactory mainDispatcherFactory) {
            return null;
        }
    }

    MainCoroutineDispatcher createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
