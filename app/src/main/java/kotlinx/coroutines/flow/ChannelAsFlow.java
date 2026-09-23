package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    private final ReceiveChannel<T> channel;
    private final boolean consume;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z, j jVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(receiveChannel, z, (i2 & 4) != 0 ? k.e : jVar, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final void markConsumed() {
        if (this.consume && consumed$volatile$FU.getAndSet(this, 1) == 1) {
            kotlinx.coroutines.future.a.u("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        int i = this.capacity;
        y yVar = y.a;
        if (i != -3) {
            Object objCollect = super.collect(flowCollector, dVar);
            return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : yVar;
        }
        markConsumed();
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, this.channel, this.consume, dVar);
        return objEmitAllImpl$FlowKt__ChannelsKt == kotlin.coroutines.intrinsics.a.e ? objEmitAllImpl$FlowKt__ChannelsKt : yVar;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(new SendingCollector(producerScope), this.channel, this.consume, dVar);
        return objEmitAllImpl$FlowKt__ChannelsKt == kotlin.coroutines.intrinsics.a.e ? objEmitAllImpl$FlowKt__ChannelsKt : y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(j jVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.channel, this.consume, jVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        markConsumed();
        return this.capacity == -3 ? this.channel : super.produceImpl(coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(ReceiveChannel<? extends T> receiveChannel, boolean z, j jVar, int i, BufferOverflow bufferOverflow) {
        super(jVar, i, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z;
    }
}
