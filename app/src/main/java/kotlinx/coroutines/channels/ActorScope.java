package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@ObsoleteCoroutinesApi
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(ActorScope<E> actorScope) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        @kotlin.c
        public static <E> E poll(ActorScope<E> actorScope) {
            return (E) ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        @kotlin.c
        public static <E> Object receiveOrNull(ActorScope<E> actorScope, kotlin.coroutines.d<? super E> dVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, dVar);
        }
    }

    Channel<E> getChannel();
}
