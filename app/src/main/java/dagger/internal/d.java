package dagger.internal;

import androidx.navigation.internal.h;
import java.io.Closeable;
import java.io.IOException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.w;
import okhttp3.internal.g;
import okhttp3.k;
import okhttp3.l0;
import okhttp3.q;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final void b(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.a.a(th, th2);
            }
        }
    }

    public static q c(SSLSession sSLSession) throws IOException {
        Object objK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            kotlinx.coroutines.future.a.u("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            kotlinx.coroutines.future.a.w("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        k kVarF = k.b.f(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            kotlinx.coroutines.future.a.u("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            kotlinx.coroutines.future.a.w("tlsVersion == NONE");
            return null;
        }
        l0.y.getClass();
        l0 l0VarG = okhttp3.b.g(protocol);
        try {
            objK = g.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objK = w.e;
        }
        return new q(l0VarG, kVarF, g.k(sSLSession.getLocalCertificates()), new h(objK, 29));
    }

    public static final long d(long j) {
        if (j < 0) {
            kotlin.time.g gVar = kotlin.time.a.y;
            return kotlin.time.a.A;
        }
        kotlin.time.g gVar2 = kotlin.time.a.y;
        return kotlin.time.a.z;
    }

    public static final long e(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        kotlin.time.c cVar = kotlin.time.c.NANOSECONDS;
        if (j4 >= 0) {
            return dagger.hilt.android.internal.a.i(j3, cVar);
        }
        kotlin.time.c cVar2 = kotlin.time.c.MILLISECONDS;
        if (cVar.compareTo(cVar2) >= 0) {
            return kotlin.time.a.l(d(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        kotlin.time.g gVar = kotlin.time.a.y;
        return kotlin.time.a.i(dagger.hilt.android.internal.a.i(j5, cVar2), dagger.hilt.android.internal.a.i(j6, cVar));
    }

    public static void f(okio.e eVar, byte[] bArr) {
        long j;
        eVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = eVar.B;
            int i2 = eVar.C;
            int i3 = eVar.D;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = eVar.A;
            f fVar = eVar.e;
            fVar.getClass();
            if (j2 == fVar.y) {
                kotlinx.coroutines.future.a.u("no more bytes");
                return;
            }
            j = eVar.A;
        } while (eVar.g(j == -1 ? 0L : j + ((long) (eVar.D - eVar.C))) != -1);
    }
}
