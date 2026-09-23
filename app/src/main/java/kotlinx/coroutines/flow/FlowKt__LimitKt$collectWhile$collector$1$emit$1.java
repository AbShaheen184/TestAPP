package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", l = {128}, m = "emit")
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, kotlin.coroutines.d<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
