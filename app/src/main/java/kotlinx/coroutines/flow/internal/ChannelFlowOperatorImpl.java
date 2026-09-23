package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(Flow flow, j jVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(flow, (i2 & 2) != 0 ? k.e : jVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(j jVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(this.flow, jVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return (Flow<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        Object objCollect = this.flow.collect((FlowCollector<? super S>) flowCollector, dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    public ChannelFlowOperatorImpl(Flow<? extends T> flow, j jVar, int i, BufferOverflow bufferOverflow) {
        super(flow, jVar, i, bufferOverflow);
    }
}
