package okhttp3.internal.http2;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends okio.c {
    public final /* synthetic */ x n;

    public w(x xVar) {
        this.n = xVar;
    }

    @Override // okio.c
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // okio.c
    public final void l() {
        this.n.g(b.CANCEL);
        p pVar = this.n.y;
        synchronized (pVar) {
            long j = pVar.L;
            long j2 = pVar.K;
            if (j < j2) {
                return;
            }
            pVar.K = j2 + 1;
            pVar.M = System.nanoTime() + ((long) 1000000000);
            okhttp3.internal.concurrent.c.c(pVar.E, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), pVar.z, " ping"), 0L, new j(pVar, 0), 6);
        }
    }

    public final void m() {
        if (j()) {
            throw k(null);
        }
    }
}
