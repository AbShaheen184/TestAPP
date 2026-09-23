package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.LockFreeTaskQueue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class GlobalQueue extends LockFreeTaskQueue<Task> {
    public GlobalQueue() {
        super(false);
    }
}
