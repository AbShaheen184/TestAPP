package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends ContentObserver {
    public final /* synthetic */ Channel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(Channel channel, Handler handler) {
        super(handler);
        this.a = channel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.mo28trySendJP2dKIU(kotlin.y.a);
    }
}
