package okio.internal;

import com.google.firebase.messaging.n;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.c0;
import okio.d0;
import okio.f0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {
    public final OutputStream e;
    public final i y;
    public final /* synthetic */ n z;

    public d(n nVar) {
        this.z = nVar;
        Socket socket = (Socket) nVar.y;
        this.e = socket.getOutputStream();
        this.y = new i(socket);
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) throws IOException {
        okio.b.d(fVar.y, 0L, j);
        while (j > 0) {
            i iVar = this.y;
            iVar.f();
            c0 c0Var = fVar.e;
            c0Var.getClass();
            int iMin = (int) Math.min(j, c0Var.c - c0Var.b);
            iVar.i();
            try {
                try {
                    this.e.write(c0Var.a, c0Var.b, iMin);
                    if (iVar.j()) {
                        throw iVar.k(null);
                    }
                    int i = c0Var.b + iMin;
                    c0Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    fVar.y -= j2;
                    if (i == c0Var.c) {
                        fVar.e = c0Var.a();
                        d0.a(c0Var);
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
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.e;
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
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    iVar.j();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    iVar.j();
                    return;
                }
                socket.close();
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

    @Override // okio.f0
    public final j0 e() {
        return this.y;
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() throws IOException {
        i iVar = this.y;
        iVar.i();
        try {
            try {
                this.e.flush();
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

    public final String toString() {
        return "sink(" + ((Socket) this.z.y) + ')';
    }
}
