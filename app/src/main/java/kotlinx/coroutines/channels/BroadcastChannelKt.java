package kotlinx.coroutines.channels;

import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class BroadcastChannelKt {
    private static final Symbol NO_ELEMENT = new Symbol("NO_ELEMENT");

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E> BroadcastChannel<E> BroadcastChannel(int i) {
        if (i == -2) {
            return new BroadcastChannelImpl(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i == -1) {
            return new ConflatedBroadcastChannel();
        }
        if (i == 0) {
            kotlinx.coroutines.future.a.q("Unsupported 0 capacity for BroadcastChannel");
            return null;
        }
        if (i != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i);
        }
        kotlinx.coroutines.future.a.q("Unsupported UNLIMITED capacity for BroadcastChannel");
        return null;
    }
}
