package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__EmittersKt$invokeSafely$1(kotlin.coroutines.d<? super FlowKt__EmittersKt$invokeSafely$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(null, null, null, this);
    }
}
