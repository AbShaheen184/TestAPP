package okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.google.android.gms.measurement.internal.z;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // okhttp3.internal.platform.android.n
    public final boolean a() {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.n
    public final String c(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.android.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
            sSLParameters.setApplicationProtocols((String[]) z.g(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
