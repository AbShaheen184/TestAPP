package kotlinx.coroutines.flow;

import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ p $transform$inlined;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(Flow[] flowArr, p pVar) {
        this.$flows$inlined = flowArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        kotlin.jvm.functions.a unused = new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.a
            public final Void invoke() {
                return null;
            }
        };
        l.e();
        throw null;
    }

    public Object collect$$forInline(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        kotlin.jvm.functions.a unused = new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.a
            public final Void invoke() {
                return null;
            }
        };
        l.e();
        throw null;
    }
}
