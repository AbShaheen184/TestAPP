package kotlinx.coroutines.internal;

import kotlin.coroutines.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ContextScope implements CoroutineScope {
    private final j coroutineContext;

    public ContextScope(j jVar) {
        this.coroutineContext = jVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public j getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
