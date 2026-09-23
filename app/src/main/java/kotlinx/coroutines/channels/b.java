package kotlinx.coroutines.channels;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ b(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return ChannelsKt__DeprecatedKt.consumes$lambda$24$ChannelsKt__DeprecatedKt((ReceiveChannel) this.y, (Throwable) obj);
            case 1:
                return BroadcastKt.broadcast$lambda$1((ReceiveChannel) this.y, (Throwable) obj);
            default:
                return ChannelsKt__DeprecatedKt.consumesAll$lambda$2$ChannelsKt__DeprecatedKt((ReceiveChannel[]) this.y, (Throwable) obj);
        }
    }
}
