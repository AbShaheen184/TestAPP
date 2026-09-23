package kotlinx.coroutines.flow;

import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ContextKt {
    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            kotlinx.coroutines.future.a.q("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (flow instanceof FusibleFlow) {
            return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, null, i2, bufferOverflow2, 1, null);
        }
        return new ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return flow instanceof CancellableFlow ? flow : new CancellableFlowImpl(flow);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(j jVar) {
        if (jVar.get(Job.Key) == null) {
            return;
        }
        kotlinx.coroutines.future.a.p(jVar, "Flow context cannot contain job in it. Had ");
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return buffer$default(flow, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, j jVar) {
        checkFlowContext$FlowKt__ContextKt(jVar);
        if (l.a(jVar, k.e)) {
            return flow;
        }
        if (flow instanceof FusibleFlow) {
            return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, jVar, 0, null, 6, null);
        }
        return new ChannelFlowOperatorImpl(flow, jVar, 0, null, 12, null);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return buffer(flow, i);
    }

    @kotlin.c
    public static final /* synthetic */ Flow buffer(Flow flow, int i) {
        return buffer$default(flow, i, null, 2, null);
    }
}
