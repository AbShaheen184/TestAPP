package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h0 {
    public boolean B;
    public final /* synthetic */ x C;
    public final long e;
    public boolean y;
    public final okio.f z = new okio.f();
    public final okio.f A = new okio.f();

    public v(x xVar, long j, boolean z) {
        this.C = xVar;
        this.e = j;
        this.y = z;
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws Throwable {
        boolean z;
        Throwable c0Var;
        long jK;
        fVar.getClass();
        long j2 = 0;
        if (j < 0) {
            kotlinx.coroutines.future.a.s(androidx.compose.runtime.j.h("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            x xVar = this.C;
            synchronized (xVar) {
                xVar.y.getClass();
                u uVar = xVar.F;
                z = true;
                boolean z2 = uVar.z || uVar.e;
                if (z2) {
                    xVar.G.i();
                }
                try {
                    if (xVar.h() == null || this.y) {
                        c0Var = null;
                    } else {
                        c0Var = xVar.J;
                        if (c0Var == null) {
                            b bVarH = xVar.h();
                            bVarH.getClass();
                            c0Var = new c0(bVarH);
                        }
                    }
                    if (this.B) {
                        throw new IOException("stream closed");
                    }
                    okio.f fVar2 = this.A;
                    long j3 = fVar2.y;
                    if (j3 > j2) {
                        jK = fVar2.K(fVar, Math.min(j, j3));
                        okhttp3.internal.http2.flowcontrol.a.b(xVar.z, jK, 0L, 2);
                        long jA = xVar.z.a();
                        if (c0Var == null && jA >= xVar.y.O.a() / 2) {
                            xVar.y.X(xVar.e, jA);
                            okhttp3.internal.http2.flowcontrol.a.b(xVar.z, 0L, jA, 1);
                        }
                        z = false;
                    } else {
                        if (this.y || c0Var != null) {
                            z = false;
                        } else {
                            try {
                                xVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jK = -1;
                    }
                    if (z2) {
                        xVar.G.m();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        xVar.G.m();
                    }
                    throw th;
                }
            }
            this.C.y.N.getClass();
            if (!z) {
                if (jK != -1) {
                    return jK;
                }
                if (c0Var == null) {
                    return -1L;
                }
                throw c0Var;
            }
            j2 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        x xVar = this.C;
        synchronized (xVar) {
            this.B = true;
            okio.f fVar = this.A;
            j = fVar.y;
            fVar.a();
            xVar.notifyAll();
        }
        if (j > 0) {
            x xVar2 = this.C;
            TimeZone timeZone = okhttp3.internal.g.a;
            xVar2.y.A(j);
        }
        this.C.a();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.C.G;
    }
}
