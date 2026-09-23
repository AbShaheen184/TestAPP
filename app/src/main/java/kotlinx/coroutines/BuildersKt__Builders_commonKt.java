package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar) {
        j jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, jVar);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.isLazy() ? new LazyDeferredCoroutine(jVarNewCoroutineContext, pVar) : new DeferredCoroutine(jVarNewCoroutineContext, true);
        ((AbstractCoroutine) lazyDeferredCoroutine).start(coroutineStart, lazyDeferredCoroutine, pVar);
        return (Deferred<T>) lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = k.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope, jVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt.withContext(coroutineDispatcher, pVar, dVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar) {
        j jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, jVar);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.isLazy() ? new LazyStandaloneCoroutine(jVarNewCoroutineContext, pVar) : new StandaloneCoroutine(jVarNewCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, pVar);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = k.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope, jVar, coroutineStart, pVar);
    }

    public static final <T> Object withContext(j jVar, p pVar, d<? super T> dVar) {
        j context = dVar.getContext();
        j jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, jVar);
        JobKt.ensureActive(jVarNewCoroutineContext);
        if (jVarNewCoroutineContext == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(jVarNewCoroutineContext, dVar);
            return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
        }
        e eVar = e.e;
        if (!l.a(jVarNewCoroutineContext.get(eVar), context.get(eVar))) {
            DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(jVarNewCoroutineContext, dVar);
            CancellableKt.startCoroutineCancellable(pVar, dispatchedCoroutine, dispatchedCoroutine);
            return dispatchedCoroutine.getResult$kotlinx_coroutines_core();
        }
        UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(jVarNewCoroutineContext, dVar);
        j context2 = undispatchedCoroutine.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
        try {
            return UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, pVar);
        } finally {
            ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
        }
    }
}
