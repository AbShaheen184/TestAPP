package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements Closeable {
    public static final i0 y;
    public h0 e;

    static {
        okio.i iVar = okio.i.A;
        iVar.getClass();
        okio.f fVar = new okio.f();
        fVar.m0(iVar);
        y = new i0(null, iVar.e.length, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String A() {
        Charset charsetA;
        okio.h hVarP = P();
        String th = null;
        try {
            u uVarX = x();
            if (uVarX == null || (charsetA = u.a(uVarX)) == null) {
                charsetA = kotlin.text.a.a;
            }
            String strC = hVarP.C(okhttp3.internal.g.f(hVarP, charsetA));
            try {
                hVarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = strC;
        } catch (Throwable th3) {
            th = th3;
            if (hVarP != null) {
                try {
                    hVarP.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    public abstract okio.h P();

    public final InputStream a() {
        return P().V();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal.e.b(P());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] g() throws IOException {
        long jN = n();
        if (jN > 2147483647L) {
            kotlinx.coroutines.future.a.w(androidx.compose.runtime.j.h("Cannot buffer entire body for content length: ", jN));
            return null;
        }
        okio.h hVarP = P();
        byte[] th = null;
        try {
            byte[] bArrO = hVarP.o();
            try {
                hVarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrO;
        } catch (Throwable th3) {
            th = th3;
            if (hVarP != null) {
                try {
                    hVarP.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jN == -1 || jN == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jN + ") and stream length (" + length + ") disagree");
    }

    public abstract long n();

    public abstract u x();
}
