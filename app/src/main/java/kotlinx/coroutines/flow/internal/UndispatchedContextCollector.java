package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    private final Object countOrElement;
    private final j emitContext;
    private final p emitRef;

    public UndispatchedContextCollector(FlowCollector<? super T> flowCollector, j jVar) {
        this.emitContext = jVar;
        this.countOrElement = ThreadContextKt.threadContextElements(jVar);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.emitContext, t, this.countOrElement, this.emitRef, dVar);
        return objWithContextUndispatched == kotlin.coroutines.intrinsics.a.e ? objWithContextUndispatched : y.a;
    }
}
