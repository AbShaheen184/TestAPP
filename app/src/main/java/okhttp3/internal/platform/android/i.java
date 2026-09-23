package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    @Override // okhttp3.internal.platform.android.l
    public final boolean b(SSLSocket sSLSocket) {
        return k.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.l
    public final n c(SSLSocket sSLSocket) {
        return new k();
    }
}
