package kotlinx.coroutines.flow;

import kotlin.y;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {
    public kotlin.coroutines.d<? super y> cont;
    public long index = -1;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(SharedFlowImpl<?> sharedFlowImpl) {
        if (this.index >= 0) {
            return false;
        }
        this.index = sharedFlowImpl.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public kotlin.coroutines.d<y>[] freeLocked(SharedFlowImpl<?> sharedFlowImpl) {
        long j = this.index;
        this.index = -1L;
        this.cont = null;
        return sharedFlowImpl.updateCollectorIndexLocked$kotlinx_coroutines_core(j);
    }
}
