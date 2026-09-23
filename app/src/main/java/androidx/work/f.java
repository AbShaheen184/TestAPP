package androidx.work;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends CoroutineDispatcher {
    public static final f e = new f();
    public static final CoroutineDispatcher y = Dispatchers.getDefault();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo86dispatch(kotlin.coroutines.j jVar, Runnable runnable) {
        jVar.getClass();
        runnable.getClass();
        y.mo86dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(kotlin.coroutines.j jVar) {
        jVar.getClass();
        return y.isDispatchNeeded(jVar);
    }
}
