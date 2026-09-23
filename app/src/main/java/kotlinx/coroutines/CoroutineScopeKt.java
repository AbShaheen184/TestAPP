package kotlinx.coroutines;

import com.google.firebase.platforminfo.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineScopeKt {
    public static final CoroutineScope CoroutineScope(j jVar) {
        if (jVar.get(Job.Key) == null) {
            jVar = jVar.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        }
        return new ContextScope(jVar);
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            b.q(coroutineScope, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final <R> Object coroutineScope(p pVar, d<? super R> dVar) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(dVar.getContext(), dVar);
        return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
    }

    public static final Object currentCoroutineContext(d<? super j> dVar) {
        return dVar.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(d<? super j> dVar) {
        throw null;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope plus(CoroutineScope coroutineScope, j jVar) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(jVar));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(coroutineScope, str, th);
    }

    public static final void cancel(CoroutineScope coroutineScope, String str, Throwable th) {
        cancel(coroutineScope, ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void isActive$annotations(CoroutineScope coroutineScope) {
    }
}
