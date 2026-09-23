package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {
    public final l a;
    public n b;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.n
    public final String c(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
