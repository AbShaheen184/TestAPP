package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class BroadcastCoroutine<E> extends AbstractCoroutine<y> implements ProducerScope<E>, BroadcastChannel<E> {
    private final BroadcastChannel<E> _channel;

    public BroadcastCoroutine(j jVar, BroadcastChannel<E> broadcastChannel, boolean z) {
        super(jVar, false, z);
        this._channel = broadcastChannel;
        initParentJob((Job) jVar.get(Job.Key));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.c
    public final /* synthetic */ boolean cancel(Throwable th) {
        if (th == null) {
            th = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        boolean zClose = this._channel.close(th);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    public final BroadcastChannel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this._channel.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.c
    public boolean offer(E e) {
        return this._channel.offer(e);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        if (this._channel.close(th) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(y yVar) {
        SendChannel.DefaultImpls.close$default(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this._channel.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        return this._channel.send(e, dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        return this._channel.mo28trySendJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<E> getChannel() {
        return this;
    }
}
