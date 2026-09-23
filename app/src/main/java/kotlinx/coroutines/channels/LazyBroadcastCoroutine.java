package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {
    private final kotlin.coroutines.d<y> continuation;

    public LazyBroadcastCoroutine(j jVar, BroadcastChannel<E> broadcastChannel, p pVar) {
        super(jVar, broadcastChannel, false);
        this.continuation = h.d(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReceiveChannel<E> receiveChannelOpenSubscription = get_channel().openSubscription();
        start();
        return receiveChannelOpenSubscription;
    }
}
