package kotlinx.coroutines.flow;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1<T> implements FlowCollector {
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flattenConcat$1$1(FlowCollector<? super T> flowCollector) {
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object emit(Flow<? extends T> flow, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        if (dVar instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) dVar;
            int i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, dVar);
            }
        } else {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, dVar);
        }
        Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
        int i2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            FlowCollector<T> flowCollector = this.$this_flow;
            flowKt__MergeKt$flattenConcat$1$1$emit$1.label = 1;
            Object objEmitAll = FlowKt.emitAll(flowCollector, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmitAll == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return y.a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
        return emit((Flow) obj, (kotlin.coroutines.d<? super y>) dVar);
    }
}
