package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(p pVar, d<? super R> dVar) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(dVar.getContext(), dVar);
        return UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, pVar);
    }

    public static final <R> Flow<R> scopedFlow(final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, d<? super y> dVar) {
                Object objFlowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(qVar, flowCollector, null), dVar);
                return objFlowScope == kotlin.coroutines.intrinsics.a.e ? objFlowScope : y.a;
            }
        };
    }
}
