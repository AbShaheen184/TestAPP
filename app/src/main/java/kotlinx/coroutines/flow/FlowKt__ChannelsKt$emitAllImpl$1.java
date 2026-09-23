package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, Token.GETPROP}, m = "emitAllImpl$FlowKt__ChannelsKt")
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ChannelsKt$emitAllImpl$1(kotlin.coroutines.d<? super FlowKt__ChannelsKt$emitAllImpl$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
    }
}
