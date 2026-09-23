package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends kotlin.coroutines.jvm.internal.c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, kotlin.coroutines.d<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> dVar) {
        super(dVar);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM33receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m33receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM33receiveCatchingOnNoWaiterSuspendGKJJFZk == kotlin.coroutines.intrinsics.a.e ? objM33receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m42boximpl(objM33receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
