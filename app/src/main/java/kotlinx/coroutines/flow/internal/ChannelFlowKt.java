package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowKt {
    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> flow) {
        ChannelFlow<T> channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(j jVar, V v, Object obj, p pVar, d<? super T> dVar) {
        Object objInvoke;
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(jVar, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(dVar, jVar);
            if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
                c0.c(2, pVar);
                objInvoke = pVar.invoke(v, stackFrameContinuation);
            } else {
                objInvoke = h.h(pVar, v, stackFrameContinuation);
            }
            ThreadContextKt.restoreThreadContext(jVar, objUpdateThreadContext);
            if (objInvoke == kotlin.coroutines.intrinsics.a.e) {
                dVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(jVar, objUpdateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(j jVar, Object obj, Object obj2, p pVar, d dVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(jVar);
        }
        return withContextUndispatched(jVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> flowCollector, j jVar) {
        return ((flowCollector instanceof SendingCollector) || (flowCollector instanceof NopCollector)) ? flowCollector : new UndispatchedContextCollector(flowCollector, jVar);
    }
}
