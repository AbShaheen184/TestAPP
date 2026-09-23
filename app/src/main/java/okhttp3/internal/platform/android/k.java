package okhttp3.internal.platform.android;

import com.google.android.gms.measurement.internal.z;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n {
    public static final i a = new i();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable() && j.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean a() {
        return b;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.n
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) z.g(list).toArray(new String[0]));
        }
    }
}
