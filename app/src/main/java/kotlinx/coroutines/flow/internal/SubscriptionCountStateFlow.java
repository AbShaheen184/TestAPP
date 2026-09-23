package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    public SubscriptionCountStateFlow(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        tryEmit(Integer.valueOf(i));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(getLastReplayedLocked().intValue());
        }
        return numValueOf;
    }

    public final boolean increment(int i) {
        boolean zTryEmit;
        synchronized (this) {
            zTryEmit = tryEmit(Integer.valueOf(getLastReplayedLocked().intValue() + i));
        }
        return zTryEmit;
    }
}
