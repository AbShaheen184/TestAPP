package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.b0;
import okhttp3.internal.http2.c0;
import okhttp3.internal.http2.x;
import okhttp3.k0;
import okhttp3.s;
import okhttp3.y;
import okhttp3.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends okhttp3.internal.http2.n implements okhttp3.internal.http.d {
    public final okhttp3.internal.concurrent.d b;
    public final k0 c;
    public final Socket d;
    public final Socket e;
    public final okhttp3.q f;
    public final z g;
    public final com.google.android.datatransport.runtime.j h;
    public final int i;
    public okhttp3.internal.http2.p j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final ArrayList q;
    public long r;

    public n(okhttp3.internal.concurrent.d dVar, androidx.compose.ui.graphics.vector.a aVar, k0 k0Var, Socket socket, Socket socket2, okhttp3.q qVar, z zVar, com.google.android.datatransport.runtime.j jVar, int i) {
        dVar.getClass();
        aVar.getClass();
        k0Var.getClass();
        socket.getClass();
        socket2.getClass();
        zVar.getClass();
        jVar.getClass();
        this.b = dVar;
        this.c = k0Var;
        this.d = socket;
        this.e = socket2;
        this.f = qVar;
        this.g = zVar;
        this.h = jVar;
        this.i = i;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void d(y yVar, k0 k0Var, IOException iOException) {
        yVar.getClass();
        k0Var.getClass();
        iOException.getClass();
        if (k0Var.b.type() != Proxy.Type.DIRECT) {
            okhttp3.a aVar = k0Var.a;
            aVar.g.connectFailed(aVar.h.i(), k0Var.b.address(), iOException);
        }
        com.google.android.material.behavior.d dVar = yVar.D;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.e).add(k0Var);
        }
    }

    @Override // okhttp3.internal.http2.n
    public final void a(okhttp3.internal.http2.p pVar, b0 b0Var) {
        b0Var.getClass();
        synchronized (this) {
            this.p = (b0Var.a & 8) != 0 ? b0Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // okhttp3.internal.http2.n
    public final void b(x xVar) {
        xVar.e(okhttp3.internal.http2.b.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.d
    public final void c(m mVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof c0)) {
                    if (!(this.j != null) || (iOException instanceof okhttp3.internal.http2.a)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                d(mVar.e, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((c0) iOException).e == okhttp3.internal.http2.b.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((c0) iOException).e != okhttp3.internal.http2.b.CANCEL || !mVar.N) {
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http.d
    public final void cancel() {
        okhttp3.internal.g.c(this.d);
    }

    public final boolean e(okhttp3.a aVar, List list) {
        s sVar = aVar.h;
        TimeZone timeZone = okhttp3.internal.g.a;
        if (this.q.size() < this.p && !this.k) {
            k0 k0Var = this.c;
            okhttp3.a aVar2 = k0Var.a;
            okhttp3.a aVar3 = k0Var.a;
            if (aVar2.a(aVar)) {
                String str = sVar.d;
                String str2 = sVar.d;
                if (!kotlin.jvm.internal.l.a(str, aVar3.h.d)) {
                    if (this.j != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            k0 k0Var2 = (k0) it.next();
                            Proxy.Type type = k0Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && k0Var.b.type() == type2 && kotlin.jvm.internal.l.a(k0Var.c, k0Var2.c)) {
                                if (aVar.d != okhttp3.internal.tls.c.a) {
                                    break;
                                }
                                TimeZone timeZone2 = okhttp3.internal.g.a;
                                s sVar2 = aVar3.h;
                                if (sVar.e != sVar2.e) {
                                    break;
                                }
                                boolean zA = kotlin.jvm.internal.l.a(str2, sVar2.d);
                                okhttp3.q qVar = this.f;
                                if (!zA) {
                                    if (!this.l && qVar != null) {
                                        List listA = qVar.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!okhttp3.internal.tls.c.c(str2, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    okhttp3.i iVar = aVar.e;
                                    iVar.getClass();
                                    qVar.getClass();
                                    List listA2 = qVar.a();
                                    str2.getClass();
                                    listA2.getClass();
                                    Iterator it2 = iVar.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    androidx.privacysandbox.ads.adservices.java.internal.a.D(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.d
    public final void f() {
        synchronized (this) {
            this.k = true;
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = okhttp3.internal.g.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        okhttp3.internal.http2.p pVar = this.j;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.C) {
                    return false;
                }
                return pVar.L >= pVar.K || jNanoTime < pVar.M;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        okio.b0 b0Var = (okio.b0) this.h.z;
        socket.getClass();
        b0Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !b0Var.a();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.d
    public final k0 h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        z zVar = this.g;
        if (zVar == z.HTTP_2 || zVar == z.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            okhttp3.internal.http2.c cVar = okhttp3.internal.http2.c.a;
            okhttp3.internal.concurrent.d dVar = this.b;
            dVar.getClass();
            androidx.appcompat.widget.o oVar = new androidx.appcompat.widget.o();
            oVar.b = dVar;
            oVar.e = okhttp3.internal.http2.n.a;
            oVar.f = okhttp3.internal.http2.c.a;
            com.google.android.datatransport.runtime.j jVar = this.h;
            String str = this.c.a.h.d;
            jVar.getClass();
            str.getClass();
            oVar.c = jVar;
            oVar.d = okhttp3.internal.g.b + ' ' + str;
            oVar.e = this;
            oVar.a = this.i;
            oVar.f = cVar;
            okhttp3.internal.http2.p pVar = new okhttp3.internal.http2.p(oVar);
            this.j = pVar;
            b0 b0Var = okhttp3.internal.http2.p.X;
            this.p = (b0Var.a & 8) != 0 ? b0Var.b[3] : Integer.MAX_VALUE;
            okhttp3.internal.http2.y yVar = pVar.U;
            synchronized (yVar) {
                try {
                    if (yVar.A) {
                        throw new IOException("closed");
                    }
                    Logger logger = okhttp3.internal.http2.y.C;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(okhttp3.internal.g.d(">> CONNECTION " + okhttp3.internal.http2.h.a.g(), new Object[0]));
                    }
                    yVar.e.J(okhttp3.internal.http2.h.a);
                    yVar.e.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            okhttp3.internal.http2.y yVar2 = pVar.U;
            b0 b0Var2 = pVar.O;
            yVar2.getClass();
            b0Var2.getClass();
            synchronized (yVar2) {
                try {
                    if (yVar2.A) {
                        throw new IOException("closed");
                    }
                    yVar2.n(0, Integer.bitCount(b0Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & b0Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            yVar2.e.writeShort(i);
                            yVar2.e.writeInt(b0Var2.b[i]);
                        }
                    }
                    yVar2.e.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = pVar.O.a();
            if (iA != 65535) {
                pVar.U.X(0, iA - 65535);
            }
            okhttp3.internal.concurrent.c.c(pVar.D.d(), pVar.z, 0L, pVar.V, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        k0 k0Var = this.c;
        sb.append(k0Var.a.h.d);
        sb.append(':');
        sb.append(k0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(k0Var.b);
        sb.append(" hostAddress=");
        sb.append(k0Var.c);
        sb.append(" cipherSuite=");
        okhttp3.q qVar = this.f;
        sb.append(qVar != null ? qVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
