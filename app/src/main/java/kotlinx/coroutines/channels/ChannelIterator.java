package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface ChannelIterator<E> {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @kotlin.c
        public static Object next(ChannelIterator channelIterator, kotlin.coroutines.d dVar) {
            ChannelIterator$next0$1 channelIterator$next0$1;
            if (dVar instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) dVar;
                int i = channelIterator$next0$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelIterator$next0$1 = new ChannelIterator$next0$1(dVar);
                }
            } else {
                channelIterator$next0$1 = new ChannelIterator$next0$1(dVar);
            }
            Object objHasNext = channelIterator$next0$1.result;
            int i2 = channelIterator$next0$1.label;
            if (i2 == 0) {
                kotlin.a.e(objHasNext);
                channelIterator$next0$1.L$0 = channelIterator;
                channelIterator$next0$1.label = 1;
                objHasNext = channelIterator.hasNext(channelIterator$next0$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objHasNext == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                channelIterator = (ChannelIterator) channelIterator$next0$1.L$0;
                kotlin.a.e(objHasNext);
            }
            if (((Boolean) objHasNext).booleanValue()) {
                return channelIterator.next();
            }
            throw new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
    }

    Object hasNext(kotlin.coroutines.d<? super Boolean> dVar);

    E next();

    @kotlin.c
    /* synthetic */ Object next(kotlin.coroutines.d dVar);
}
