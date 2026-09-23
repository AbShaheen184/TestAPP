package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SafeCollector_commonKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class AnonymousClass1<T> implements Flow<T> {
        final /* synthetic */ p $block;

        public AnonymousClass1(p pVar) {
            this.$block = pVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
            Object objInvoke = this.$block.invoke(flowCollector, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
        }

        public Object collect$$forInline(FlowCollector<? super T> flowCollector, final d<? super y> dVar) {
            new c(dVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.collect(null, this);
                }
            };
            this.$block.invoke(flowCollector, dVar);
            return y.a;
        }
    }

    public static final void checkContext(SafeCollector<?> safeCollector, j jVar) {
        if (((Number) jVar.fold(0, new a(safeCollector, 0))).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + jVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkContext$lambda$0(SafeCollector safeCollector, int i, h hVar) {
        i key = hVar.getKey();
        h hVar2 = safeCollector.collectContext.get(key);
        if (key != Job.Key) {
            if (hVar != hVar2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        Job job = (Job) hVar2;
        Job jobTransitiveCoroutineParent = transitiveCoroutineParent((Job) hVar, job);
        if (jobTransitiveCoroutineParent == job) {
            return job == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + jobTransitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final Job transitiveCoroutineParent(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = ((ScopeCoroutine) job).getParent();
        }
        return null;
    }

    public static final <T> Flow<T> unsafeFlow(p pVar) {
        return new AnonymousClass1(pVar);
    }
}
