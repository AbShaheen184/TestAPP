package okio.internal;

import com.google.firebase.messaging.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.c0;
import okio.d0;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h0 {
    public final InputStream e;
    public final i y;
    public final /* synthetic */ n z;

    public e(n nVar) {
        this.z = nVar;
        Socket socket = (Socket) nVar.y;
        this.e = socket.getInputStream();
        this.y = new i(socket);
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        fVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            kotlinx.coroutines.future.a.s(androidx.compose.runtime.j.h("byteCount < 0: ", j));
            return 0L;
        }
        i iVar = this.y;
        iVar.f();
        c0 c0VarL0 = fVar.l0(1);
        int iMin = (int) Math.min(j, 8192 - c0VarL0.c);
        try {
            iVar.i();
            try {
                try {
                    int i = this.e.read(c0VarL0.a, c0VarL0.c, iMin);
                    if (iVar.j()) {
                        throw iVar.k(null);
                    }
                    if (i != -1) {
                        c0VarL0.c += i;
                        long j2 = i;
                        fVar.y += j2;
                        return j2;
                    }
                    if (c0VarL0.b != c0VarL0.c) {
                        return -1L;
                    }
                    fVar.e = c0VarL0.a();
                    d0.a(c0VarL0);
                    return -1L;
                } catch (IOException e) {
                    if (iVar.j()) {
                        throw iVar.k(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                iVar.j();
                throw th;
            }
        } catch (AssertionError e2) {
            if (m.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        n nVar = this.z;
        i iVar = this.y;
        iVar.i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) nVar.z;
                Socket socket = (Socket) nVar.y;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    iVar.j();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    iVar.j();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.e.close();
                    }
                }
                if (iVar.j()) {
                    throw iVar.k(null);
                }
            } catch (IOException e) {
                if (!iVar.j()) {
                    throw e;
                }
                throw iVar.k(e);
            }
        } catch (Throwable th) {
            iVar.j();
            throw th;
        }
    }

    @Override // okio.h0
    public final j0 e() {
        return this.y;
    }

    public final String toString() {
        return "source(" + ((Socket) this.z.y) + ')';
    }
}
