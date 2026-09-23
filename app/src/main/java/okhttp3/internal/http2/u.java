package okhttp3.internal.http2;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import okio.f0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements f0 {
    public final /* synthetic */ x A;
    public final boolean e;
    public final okio.f y = new okio.f();
    public boolean z;

    public u(x xVar, boolean z) {
        this.A = xVar;
        this.e = z;
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) {
        TimeZone timeZone = okhttp3.internal.g.a;
        okio.f fVar2 = this.y;
        fVar2.E(fVar, j);
        while (fVar2.y >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        x xVar = this.A;
        synchronized (xVar) {
            xVar.H.i();
            while (xVar.A >= xVar.B && !this.e && !this.z && xVar.h() == null) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xVar.H.m();
                    throw th;
                }
            }
            xVar.H.m();
            xVar.b();
            jMin = Math.min(xVar.B - xVar.A, this.y.y);
            xVar.A += jMin;
            z2 = z && jMin == this.y.y;
        }
        this.A.H.i();
        try {
            x xVar2 = this.A;
            xVar2.y.L(xVar2.e, z2, this.y, jMin);
        } finally {
            this.A.H.m();
        }
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.A;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (xVar) {
            if (this.z) {
                return;
            }
            boolean z = xVar.h() == null;
            x xVar2 = this.A;
            if (!xVar2.F.e) {
                if (this.y.y > 0) {
                    while (this.y.y > 0) {
                        a(true);
                    }
                } else if (z) {
                    xVar2.y.L(xVar2.e, true, null, 0L);
                }
            }
            x xVar3 = this.A;
            synchronized (xVar3) {
                this.z = true;
                xVar3.notifyAll();
            }
            this.A.y.flush();
            this.A.a();
        }
    }

    @Override // okio.f0
    public final j0 e() {
        return this.A.H;
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() {
        x xVar = this.A;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.y.y > 0) {
            a(false);
            this.A.y.flush();
        }
    }
}
