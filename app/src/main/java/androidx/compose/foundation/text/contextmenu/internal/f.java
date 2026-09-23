package androidx.compose.foundation.text.contextmenu.internal;

import kotlin.y;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.compose.foundation.text.contextmenu.data.g {
    public final Channel a = ChannelKt.Channel$default(0, null, null, 7, null);

    @Override // androidx.compose.foundation.text.contextmenu.data.g
    public final void close() {
        this.a.mo28trySendJP2dKIU(y.a);
    }
}
