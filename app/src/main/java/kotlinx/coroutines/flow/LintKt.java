package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class LintKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @e(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        int label;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(Throwable th, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(th, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return Boolean.TRUE;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @kotlin.c
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @kotlin.c
    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    @kotlin.c
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m72catch(SharedFlow<? extends T> sharedFlow, q qVar) {
        sharedFlow.getClass();
        return FlowKt.m60catch(sharedFlow, qVar);
    }

    @kotlin.c
    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    @kotlin.c
    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, kotlin.coroutines.d<? super Integer> dVar) {
        sharedFlow.getClass();
        return FlowKt.count(sharedFlow, dVar);
    }

    @kotlin.c
    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    @kotlin.c
    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, j jVar) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    public static final j getCoroutineContext(FlowCollector<?> flowCollector) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        throw com.google.android.datatransport.runtime.a.o();
    }

    @kotlin.c
    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j, p pVar) {
        sharedFlow.getClass();
        return FlowKt.retry(sharedFlow, j, pVar);
    }

    public static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pVar = new AnonymousClass1(null);
        }
        sharedFlow.getClass();
        return FlowKt.retry(sharedFlow, j, pVar);
    }

    @kotlin.c
    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, r rVar) {
        sharedFlow.getClass();
        return FlowKt.retryWhen(sharedFlow, rVar);
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, kotlin.coroutines.d<?> dVar) {
        sharedFlow.getClass();
        FlowKt.toList(sharedFlow, list, dVar);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, kotlin.coroutines.d<?> dVar) {
        sharedFlow.getClass();
        FlowKt.toSet(sharedFlow, set, dVar);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.c
    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        sharedFlow.getClass();
        return FlowKt__CollectionKt.toList$default(sharedFlow, null, dVar, 1, null);
    }

    @kotlin.c
    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        sharedFlow.getClass();
        return FlowKt__CollectionKt.toSet$default(sharedFlow, null, dVar, 1, null);
    }

    @kotlin.c
    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    @kotlin.c
    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }
}
