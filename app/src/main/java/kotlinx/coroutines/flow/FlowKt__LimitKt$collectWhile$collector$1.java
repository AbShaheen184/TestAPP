package kotlinx.coroutines.flow;

import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements FlowCollector<T> {
    final /* synthetic */ p $predicate;

    public FlowKt__LimitKt$collectWhile$collector$1(p pVar) {
        this.$predicate = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        FlowKt__LimitKt$collectWhile$collector$1<T> flowKt__LimitKt$collectWhile$collector$1;
        if (dVar instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) dVar;
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, dVar);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, dVar);
        }
        Object objInvoke = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i2 == 0) {
            kotlin.a.e(objInvoke);
            p pVar = this.$predicate;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
            objInvoke = pVar.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
            flowKt__LimitKt$collectWhile$collector$1 = this;
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
            kotlin.a.e(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return y.a;
        }
        throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
    }

    public Object emit$$forInline(T t, kotlin.coroutines.d<? super y> dVar) {
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, dVar);
        if (((Boolean) this.$predicate.invoke(t, dVar)).booleanValue()) {
            return y.a;
        }
        throw new AbortFlowException(this);
    }
}
