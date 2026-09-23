package kotlinx.coroutines.channels;

import kotlin.coroutines.j;
import kotlin.y;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(j jVar, Channel<E> channel) {
        super(jVar, channel, true, true);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ SendChannel getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        if (get_channel().close(th) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(y yVar) {
        SendChannel.DefaultImpls.close$default(get_channel(), null, 1, null);
    }
}
