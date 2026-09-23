package kotlinx.coroutines.android;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(f fVar) {
        this();
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return Delay.DefaultImpls.delay(this, j, dVar);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract HandlerDispatcher getImmediate();

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, j jVar) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, jVar);
    }

    private HandlerDispatcher() {
    }
}
