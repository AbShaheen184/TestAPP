package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ProxySelector {
    public static final a a = new a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return q.j(Proxy.NO_PROXY);
        }
        kotlinx.coroutines.future.a.q("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
