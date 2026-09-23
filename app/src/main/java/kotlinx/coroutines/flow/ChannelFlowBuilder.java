package kotlinx.coroutines.flow;

import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    private final p block;

    public /* synthetic */ ChannelFlowBuilder(p pVar, j jVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(pVar, (i2 & 2) != 0 ? k.e : jVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static <T> Object collectTo$suspendImpl(ChannelFlowBuilder<T> channelFlowBuilder, ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
        Object objInvoke = ((ChannelFlowBuilder) channelFlowBuilder).block.invoke(producerScope, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
        return collectTo$suspendImpl(this, producerScope, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(j jVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.block, jVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    public ChannelFlowBuilder(p pVar, j jVar, int i, BufferOverflow bufferOverflow) {
        super(jVar, i, bufferOverflow);
        this.block = pVar;
    }
}
