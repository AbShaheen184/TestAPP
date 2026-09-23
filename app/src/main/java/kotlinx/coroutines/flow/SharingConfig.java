package kotlinx.coroutines.flow;

import kotlin.coroutines.j;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class SharingConfig<T> {
    public final j context;
    public final int extraBufferCapacity;
    public final BufferOverflow onBufferOverflow;
    public final Flow<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SharingConfig(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow, j jVar) {
        this.upstream = flow;
        this.extraBufferCapacity = i;
        this.onBufferOverflow = bufferOverflow;
        this.context = jVar;
    }
}
