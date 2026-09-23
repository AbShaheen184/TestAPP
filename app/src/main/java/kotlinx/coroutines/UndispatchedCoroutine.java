package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.j;
import kotlin.k;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<k> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(j jVar, d<? super T> dVar) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.INSTANCE;
        super(jVar.get(undispatchedMarker) == null ? jVar.plus(undispatchedMarker) : jVar, dVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (dVar.getContext().get(e.e) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(jVar, null);
        ThreadContextKt.restoreThreadContext(jVar, objUpdateThreadContext);
        saveThreadContext(jVar, objUpdateThreadContext);
    }

    private final void clearThreadLocal() {
        if (this.threadLocalIsSet) {
            k kVar = this.threadStateToRecover.get();
            if (kVar != null) {
                ThreadContextKt.restoreThreadContext((j) kVar.e, kVar.y);
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterCompletionUndispatched() {
        clearThreadLocal();
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        clearThreadLocal();
        Object objRecoverResult = CompletionStateKt.recoverResult(obj, this.uCont);
        d<T> dVar = this.uCont;
        j context = dVar.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    public final void saveThreadContext(j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(new k(jVar, obj));
    }
}
