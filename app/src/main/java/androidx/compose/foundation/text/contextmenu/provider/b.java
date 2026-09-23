package androidx.compose.foundation.text.contextmenu.provider;

import kotlin.y;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.compose.foundation.text.contextmenu.data.g {
    public final e a;
    public final Channel b = ChannelKt.Channel$default(0, null, null, 7, null);

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.data.g
    public final void close() {
        this.b.mo28trySendJP2dKIU(y.a);
    }
}
