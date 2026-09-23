package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {
    @Override // okhttp3.internal.platform.android.l
    public final boolean b(SSLSocket sSLSocket) {
        boolean z = h.b;
        return false;
    }

    @Override // okhttp3.internal.platform.android.l
    public final n c(SSLSocket sSLSocket) {
        return new h();
    }
}
