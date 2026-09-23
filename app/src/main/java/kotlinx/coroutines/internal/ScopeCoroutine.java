package kotlinx.coroutines.internal;

import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements d {
    public final kotlin.coroutines.d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(j jVar, kotlin.coroutines.d<? super T> dVar) {
        super(jVar, true, true);
        this.uCont = dVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        DispatchedContinuationKt.resumeCancellableWith(h.f(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        kotlin.coroutines.d<T> dVar = this.uCont;
        dVar.resumeWith(CompletionStateKt.recoverResult(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final d getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.uCont;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }

    public void afterCompletionUndispatched() {
    }
}
