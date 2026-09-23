package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {
    public static final b0 X;
    public int A;
    public int B;
    public boolean C;
    public final okhttp3.internal.concurrent.d D;
    public final okhttp3.internal.concurrent.c E;
    public final okhttp3.internal.concurrent.c F;
    public final okhttp3.internal.concurrent.c G;
    public final a0 H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public final c N;
    public final b0 O;
    public b0 P;
    public final okhttp3.internal.http2.flowcontrol.a Q;
    public long R;
    public long S;
    public final com.google.android.datatransport.runtime.j T;
    public final y U;
    public final com.app.mlounge.ui.screens.downloads.e V;
    public final LinkedHashSet W;
    public final n e;
    public final LinkedHashMap y = new LinkedHashMap();
    public final String z;

    static {
        b0 b0Var = new b0();
        b0Var.b(4, 65535);
        b0Var.b(5, 16384);
        X = b0Var;
    }

    public p(androidx.appcompat.widget.o oVar) {
        this.e = (n) oVar.e;
        String str = (String) oVar.d;
        if (str == null) {
            kotlin.jvm.internal.l.f("connectionName");
            throw null;
        }
        this.z = str;
        this.B = 3;
        okhttp3.internal.concurrent.d dVar = (okhttp3.internal.concurrent.d) oVar.b;
        this.D = dVar;
        okhttp3.internal.concurrent.c cVarD = dVar.d();
        this.E = cVarD;
        this.F = dVar.d();
        this.G = dVar.d();
        this.H = a0.a;
        this.N = (c) oVar.f;
        b0 b0Var = new b0();
        b0Var.b(4, 16777216);
        this.O = b0Var;
        b0 b0Var2 = X;
        this.P = b0Var2;
        this.Q = new okhttp3.internal.http2.flowcontrol.a(0);
        this.S = b0Var2.a();
        com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) oVar.c;
        if (jVar == null) {
            kotlin.jvm.internal.l.f("socket");
            throw null;
        }
        this.T = jVar;
        this.U = new y((okio.z) jVar.A);
        this.V = new com.app.mlounge.ui.screens.downloads.e(this, new t((okio.b0) jVar.z));
        this.W = new LinkedHashSet();
        int i = oVar.a;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            cVarD.d(new okhttp3.internal.concurrent.b(str.concat(" ping"), new androidx.compose.ui.text.platform.e(this, nanos, 1)), nanos);
        }
    }

    public final void A(long j) {
        synchronized (this) {
            try {
                okhttp3.internal.http2.flowcontrol.a.b(this.Q, j, 0L, 2);
                long jA = this.Q.a();
                if (jA >= this.O.a() / 2) {
                    X(0, jA);
                    okhttp3.internal.http2.flowcontrol.a.b(this.Q, 0L, jA, 1);
                }
                c cVar = this.N;
                okhttp3.internal.http2.flowcontrol.a aVar = this.Q;
                cVar.getClass();
                aVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L(int i, boolean z, okio.f fVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.U.g(z, i, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.R;
                            j3 = this.S;
                            if (j2 >= j3) {
                                if (!this.y.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.U.z);
                j4 = iMin;
                this.R += j4;
            }
            j -= j4;
            this.U.g(z && j == 0, i, fVar, iMin);
        }
    }

    public final void N(int i, b bVar) {
        okhttp3.internal.concurrent.c.c(this.E, this.z + '[' + i + "] writeSynReset", 0L, new com.app.mlounge.ui.screens.movies.f(this, i, bVar, 1), 6);
    }

    public final void X(final int i, final long j) {
        okhttp3.internal.concurrent.c.c(this.E, this.z + '[' + i + "] windowUpdate", 0L, new kotlin.jvm.functions.a() { // from class: okhttp3.internal.http2.i
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                p pVar = this.e;
                try {
                    pVar.U.X(i, j);
                } catch (IOException e) {
                    b bVar = b.PROTOCOL_ERROR;
                    pVar.a(bVar, bVar, e);
                }
                return kotlin.y.a;
            }
        }, 6);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = okhttp3.internal.g.a;
        try {
            x(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.y.isEmpty()) {
                array = null;
            } else {
                array = this.y.values().toArray(new x[0]);
                this.y.clear();
            }
        }
        x[] xVarArr = (x[]) array;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.e(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.U.close();
        } catch (IOException unused3) {
        }
        try {
            this.T.cancel();
        } catch (IOException unused4) {
        }
        this.E.g();
        this.F.g();
        this.G.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final void flush() {
        this.U.flush();
    }

    public final x g(int i) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.y.get(Integer.valueOf(i));
        }
        return xVar;
    }

    public final x n(int i) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.y.remove(Integer.valueOf(i));
            notifyAll();
        }
        return xVar;
    }

    public final void x(b bVar) {
        synchronized (this.U) {
            synchronized (this) {
                if (this.C) {
                    return;
                }
                this.C = true;
                this.U.x(this.A, bVar, okhttp3.internal.e.a);
            }
        }
    }
}
