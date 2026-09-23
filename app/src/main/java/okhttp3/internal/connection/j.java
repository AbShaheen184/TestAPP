package okhttp3.internal.connection;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {
    public final okhttp3.h e;
    public volatile AtomicInteger y = new AtomicInteger(0);
    public final /* synthetic */ m z;

    public j(m mVar, okhttp3.h hVar) {
        this.z = mVar;
        this.e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.messaging.n nVar;
        String strConcat = "OkHttp ".concat(this.z.y.a.h());
        m mVar = this.z;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            mVar.B.i();
            boolean z = false;
            try {
                try {
                    try {
                        this.e.d(mVar, mVar.g());
                        nVar = mVar.e.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                            okhttp3.internal.platform.e.a.i(4, "Callback failure for ".concat(m.a(mVar)), e);
                        } else {
                            this.e.h(mVar, e);
                        }
                        nVar = mVar.e.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        mVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.e.h(mVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        nVar = mVar.e.a;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                nVar.getClass();
                com.google.firebase.messaging.n.D(nVar, null, null, this, 3);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                com.google.firebase.messaging.n nVar2 = mVar.e.a;
                nVar2.getClass();
                com.google.firebase.messaging.n.D(nVar2, null, null, this, 3);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
