package kotlinx.coroutines.internal;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(CoroutineDispatcher coroutineDispatcher, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.dispatcher = coroutineDispatcher;
        this.name = str;
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return this.$$delegate_0.delay(j, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(j jVar, Runnable runnable) {
        this.dispatcher.mo86dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(j jVar, Runnable runnable) {
        this.dispatcher.dispatchYield(jVar, runnable);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, j jVar) {
        return this.$$delegate_0.invokeOnTimeout(j, runnable, jVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(j jVar) {
        return this.dispatcher.isDispatchNeeded(jVar);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        this.$$delegate_0.mo87scheduleResumeAfterDelay(j, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.name;
    }
}
