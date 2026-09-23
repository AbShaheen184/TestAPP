package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.j;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private final /* synthetic */ SharedFlow<T> $$delegate_0;
    private final Job job;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlySharedFlow(SharedFlow<? extends T> sharedFlow, Job job) {
        this.$$delegate_0 = sharedFlow;
        this.job = job;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<?> dVar) {
        return this.$$delegate_0.collect(flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(j jVar, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, jVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }
}
