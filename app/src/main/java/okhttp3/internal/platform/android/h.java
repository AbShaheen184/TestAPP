package okhttp3.internal.platform.android;

import com.google.android.gms.measurement.internal.z;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {
    public static final f a = new f();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean a() {
        return b;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
            parameters.setApplicationProtocols((String[]) z.g(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
