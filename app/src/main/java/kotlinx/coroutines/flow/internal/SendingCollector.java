package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.y;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public final class SendingCollector<T> implements FlowCollector<T> {
    private final SendChannel<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(SendChannel<? super T> sendChannel) {
        this.channel = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        Object objSend = this.channel.send(t, dVar);
        return objSend == kotlin.coroutines.intrinsics.a.e ? objSend : y.a;
    }
}
