package kotlinx.coroutines;

import kotlin.coroutines.j;
import kotlin.coroutines.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@DelicateCoroutinesApi
public final class GlobalScope implements CoroutineScope {
    public static final GlobalScope INSTANCE = new GlobalScope();

    private GlobalScope() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public j getCoroutineContext() {
        return k.e;
    }
}
