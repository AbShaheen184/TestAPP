package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.f0;
import okhttp3.g0;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements okhttp3.internal.http.e {
    public static final List g = okhttp3.internal.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = okhttp3.internal.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final okhttp3.internal.connection.n a;
    public final androidx.compose.foundation.lazy.grid.u b;
    public final p c;
    public volatile x d;
    public final okhttp3.z e;
    public volatile boolean f;

    public q(okhttp3.y yVar, okhttp3.internal.connection.n nVar, androidx.compose.foundation.lazy.grid.u uVar, p pVar) {
        yVar.getClass();
        pVar.getClass();
        this.a = nVar;
        this.b = uVar;
        this.c = pVar;
        List list = yVar.s;
        okhttp3.z zVar = okhttp3.z.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(zVar) ? zVar : okhttp3.z.HTTP_2;
    }

    @Override // okhttp3.internal.http.e
    public final void a() {
        x xVar = this.d;
        xVar.getClass();
        xVar.F.close();
    }

    @Override // okhttp3.internal.http.e
    public final void b(okhttp3.b0 b0Var) throws IOException {
        int i;
        x xVar;
        boolean z;
        b0Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = b0Var.d != null;
        okhttp3.r rVar = b0Var.c;
        ArrayList arrayList = new ArrayList(rVar.size() + 4);
        arrayList.add(new d(d.f, b0Var.b));
        okio.i iVar = d.g;
        okhttp3.s sVar = b0Var.a;
        sVar.getClass();
        String strB = sVar.b();
        String strD = sVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(iVar, strB));
        String strB2 = rVar.b("Host");
        if (strB2 != null) {
            arrayList.add(new d(d.i, strB2));
        }
        arrayList.add(new d(d.h, sVar.a));
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = rVar.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && rVar.f(i2).equals("trailers"))) {
                arrayList.add(new d(lowerCase, rVar.f(i2)));
            }
        }
        p pVar = this.c;
        pVar.getClass();
        boolean z3 = !z2;
        synchronized (pVar.U) {
            synchronized (pVar) {
                try {
                    if (pVar.B > 1073741823) {
                        pVar.x(b.REFUSED_STREAM);
                    }
                    if (pVar.C) {
                        throw new a();
                    }
                    i = pVar.B;
                    pVar.B = i + 2;
                    xVar = new x(i, pVar, z3, false, null);
                    z = !z2 || pVar.R >= pVar.S || xVar.A >= xVar.B;
                    if (xVar.j()) {
                        pVar.y.put(Integer.valueOf(i), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.U.A(z3, i, arrayList);
        }
        if (z) {
            pVar.U.flush();
        }
        this.d = xVar;
        boolean z4 = this.f;
        x xVar2 = this.d;
        if (z4) {
            xVar2.getClass();
            xVar2.g(b.CANCEL);
            kotlinx.coroutines.future.a.w("Canceled");
            return;
        }
        xVar2.getClass();
        w wVar = xVar2.G;
        long j = this.b.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j, timeUnit);
        x xVar3 = this.d;
        xVar3.getClass();
        xVar3.H.g(this.b.e, timeUnit);
    }

    @Override // okhttp3.internal.http.e
    public final boolean c() {
        boolean z;
        x xVar = this.d;
        if (xVar != null) {
            synchronized (xVar) {
                v vVar = xVar.E;
                z = vVar.y && vVar.A.X();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.e
    public final void cancel() {
        this.f = true;
        x xVar = this.d;
        if (xVar != null) {
            xVar.g(b.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.e
    public final h0 d(g0 g0Var) {
        x xVar = this.d;
        xVar.getClass();
        return xVar.E;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // okhttp3.internal.http.e
    public final f0 e(boolean z) throws IOException {
        okhttp3.r rVar;
        boolean z2;
        x xVar = this.d;
        if (xVar == null) {
            kotlinx.coroutines.future.a.w("stream wasn't created");
            return null;
        }
        synchronized (xVar) {
            while (true) {
                if (!xVar.C.isEmpty() || xVar.h() != null) {
                    break;
                }
                if (!z) {
                    xVar.y.getClass();
                    u uVar = xVar.F;
                    z2 = uVar.z || uVar.e;
                }
                if (z2) {
                    xVar.G.i();
                }
                try {
                    try {
                        xVar.wait();
                        if (z2) {
                            xVar.G.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        xVar.G.m();
                    }
                    throw th;
                }
            }
            if (xVar.C.isEmpty()) {
                IOException iOException = xVar.J;
                if (iOException != null) {
                    throw iOException;
                }
                b bVarH = xVar.h();
                bVarH.getClass();
                throw new c0(bVarH);
            }
            Object objRemoveFirst = xVar.C.removeFirst();
            objRemoveFirst.getClass();
            rVar = (okhttp3.r) objRemoveFirst;
        }
        okhttp3.z zVar = this.e;
        zVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = rVar.size();
        androidx.appcompat.widget.x xVarE = null;
        for (int i = 0; i < size; i++) {
            String strC = rVar.c(i);
            String strF = rVar.f(i);
            if (strC.equals(":status")) {
                xVarE = dagger.hilt.android.internal.a.e("HTTP/1.1 ".concat(strF));
            } else if (!h.contains(strC)) {
                arrayList.add(strC);
                arrayList.add(kotlin.text.k.g0(strF).toString());
            }
        }
        if (xVarE == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        f0 f0Var = new f0();
        f0Var.b = zVar;
        f0Var.c = xVarE.y;
        f0Var.d = (String) xVarE.A;
        f0Var.f = new okhttp3.r((String[]) arrayList.toArray(new String[0])).d();
        if (z && f0Var.c == 100) {
            return null;
        }
        return f0Var;
    }

    @Override // okhttp3.internal.http.e
    public final void f() {
        this.c.flush();
    }

    @Override // okhttp3.internal.http.e
    public final okio.g0 g() {
        x xVar = this.d;
        xVar.getClass();
        return xVar;
    }

    @Override // okhttp3.internal.http.e
    public final long h(g0 g0Var) {
        if (okhttp3.internal.http.f.a(g0Var)) {
            return okhttp3.internal.g.e(g0Var);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.e
    public final okhttp3.internal.http.d i() {
        return this.a;
    }

    @Override // okhttp3.internal.http.e
    public final okio.f0 j(okhttp3.b0 b0Var, long j) {
        b0Var.getClass();
        x xVar = this.d;
        xVar.getClass();
        return xVar.F;
    }
}
