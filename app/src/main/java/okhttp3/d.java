package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;
import com.google.android.gms.internal.measurement.hb;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String k;
    public static final String l;
    public final s a;
    public final r b;
    public final String c;
    public final z d;
    public final int e;
    public final String f;
    public final r g;
    public final q h;
    public final long i;
    public final long j;

    static {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.e.a.getClass();
        k = "OkHttp-Sent-Millis";
        okhttp3.internal.platform.e.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public d(okio.h0 h0Var) throws IOException {
        s sVarC;
        l0 l0VarG;
        h0Var.getClass();
        try {
            okio.b0 b0Var = new okio.b0(h0Var);
            String strT = b0Var.t(Long.MAX_VALUE);
            try {
                com.google.android.material.shape.y yVar = new com.google.android.material.shape.y(1);
                yVar.f(null, strT);
                sVarC = yVar.c();
            } catch (IllegalArgumentException unused) {
                sVarC = null;
            }
            if (sVarC == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strT));
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = sVarC;
            this.c = b0Var.t(Long.MAX_VALUE);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(4);
            int iE = kotlin.enums.b.e(b0Var);
            for (int i = 0; i < iE; i++) {
                gVar.i(b0Var.t(Long.MAX_VALUE));
            }
            this.b = gVar.k();
            androidx.appcompat.widget.x xVarE = dagger.hilt.android.internal.a.e(b0Var.t(Long.MAX_VALUE));
            this.d = (z) xVarE.z;
            this.e = xVarE.y;
            this.f = (String) xVarE.A;
            androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(4);
            int iE2 = kotlin.enums.b.e(b0Var);
            for (int i2 = 0; i2 < iE2; i2++) {
                gVar2.i(b0Var.t(Long.MAX_VALUE));
            }
            String str = k;
            String strO = gVar2.o(str);
            String str2 = l;
            String strO2 = gVar2.o(str2);
            gVar2.y(str);
            gVar2.y(str2);
            this.i = strO != null ? Long.parseLong(strO) : 0L;
            this.j = strO2 != null ? Long.parseLong(strO2) : 0L;
            this.g = gVar2.k();
            if (this.a.f()) {
                String strT2 = b0Var.t(Long.MAX_VALUE);
                if (strT2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strT2 + '\"');
                }
                k kVarF = k.b.f(b0Var.t(Long.MAX_VALUE));
                List listA = a(b0Var);
                List listA2 = a(b0Var);
                if (b0Var.a()) {
                    l0VarG = l0.SSL_3_0;
                } else {
                    b bVar = l0.y;
                    String strT3 = b0Var.t(Long.MAX_VALUE);
                    bVar.getClass();
                    l0VarG = b.g(strT3);
                }
                this.h = new q(l0VarG, kVarF, okhttp3.internal.g.j(listA2), new androidx.navigation.internal.h(okhttp3.internal.g.j(listA), 29));
            } else {
                this.h = null;
            }
            h0Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dagger.internal.d.b(h0Var, th);
                throw th2;
            }
        }
    }

    public static List a(okio.b0 b0Var) throws IOException {
        int iE = kotlin.enums.b.e(b0Var);
        if (iE == -1) {
            return kotlin.collections.w.e;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iE);
            for (int i = 0; i < iE; i++) {
                String strT = b0Var.t(Long.MAX_VALUE);
                okio.f fVar = new okio.f();
                okio.i iVar = okio.i.A;
                okio.i iVarD = com.google.android.gms.measurement.internal.a0.d(strT);
                if (iVarD == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                fVar.m0(iVarD);
                arrayList.add(certificateFactory.generateCertificate(new hb(fVar, 2)));
            }
            return arrayList;
        } catch (CertificateException e) {
            kotlinx.coroutines.future.a.w(e.getMessage());
            return null;
        }
    }

    public static void b(okio.z zVar, List list) throws IOException {
        try {
            zVar.S(list.size());
            zVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                okio.i iVar = okio.i.A;
                encoded.getClass();
                zVar.y(com.google.android.gms.measurement.internal.a0.h(encoded).a());
                zVar.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            kotlinx.coroutines.future.a.w(e.getMessage());
        }
    }

    public final void c(b1 b1Var) {
        s sVar = this.a;
        q qVar = this.h;
        r rVar = this.g;
        r rVar2 = this.b;
        okio.z zVar = new okio.z(b1Var.l(0));
        try {
            zVar.y(sVar.i);
            zVar.writeByte(10);
            zVar.y(this.c);
            zVar.writeByte(10);
            zVar.S(rVar2.size());
            zVar.writeByte(10);
            int size = rVar2.size();
            for (int i = 0; i < size; i++) {
                zVar.y(rVar2.c(i));
                zVar.y(": ");
                zVar.y(rVar2.f(i));
                zVar.writeByte(10);
            }
            z zVar2 = this.d;
            int i2 = this.e;
            String str = this.f;
            zVar2.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (zVar2 == z.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            zVar.y(sb.toString());
            zVar.writeByte(10);
            zVar.S(rVar.size() + 2);
            zVar.writeByte(10);
            int size2 = rVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zVar.y(rVar.c(i3));
                zVar.y(": ");
                zVar.y(rVar.f(i3));
                zVar.writeByte(10);
            }
            zVar.y(k);
            zVar.y(": ");
            zVar.S(this.i);
            zVar.writeByte(10);
            zVar.y(l);
            zVar.y(": ");
            zVar.S(this.j);
            zVar.writeByte(10);
            if (sVar.f()) {
                zVar.writeByte(10);
                qVar.getClass();
                zVar.y(qVar.b.a);
                zVar.writeByte(10);
                b(zVar, qVar.a());
                b(zVar, qVar.c);
                zVar.y(qVar.a.e);
                zVar.writeByte(10);
            }
            zVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dagger.internal.d.b(zVar, th);
                throw th2;
            }
        }
    }

    public d(g0 g0Var) {
        r rVarK;
        b0 b0Var = g0Var.e;
        this.a = b0Var.a;
        g0 g0Var2 = g0Var.F;
        g0Var2.getClass();
        r rVar = g0Var2.e.c;
        r rVar2 = g0Var.C;
        Set setH = kotlin.enums.b.h(rVar2);
        if (setH.isEmpty()) {
            rVarK = r.y;
        } else {
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(4);
            int size = rVar.size();
            for (int i = 0; i < size; i++) {
                String strC = rVar.c(i);
                if (setH.contains(strC)) {
                    gVar.g(strC, rVar.f(i));
                }
            }
            rVarK = gVar.k();
        }
        this.b = rVarK;
        this.c = b0Var.b;
        this.d = g0Var.y;
        this.e = g0Var.A;
        this.f = g0Var.z;
        this.g = rVar2;
        this.h = g0Var.B;
        this.i = g0Var.I;
        this.j = g0Var.J;
    }
}
