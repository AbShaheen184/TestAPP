package okhttp3.internal.cache;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.material.internal.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.w;
import kotlin.jvm.internal.l;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.internal.connection.o;
import okhttp3.j0;
import okhttp3.k0;
import okhttp3.m;
import okhttp3.m0;
import okhttp3.n;
import okhttp3.q;
import okhttp3.r;
import okhttp3.s;
import okhttp3.t;
import okhttp3.y;
import okhttp3.z;
import okio.h0;
import okio.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public b(n nVar) {
        nVar.getClass();
        this.b = nVar;
    }

    public static int d(g0 g0Var, int i) {
        String strG = g0.g("Retry-After", g0Var);
        if (strG == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strG).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strG);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:240:0x058e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0596  */
    /* JADX WARN: Code duplicated, block: B:246:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:247:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:253:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:256:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:258:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:260:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:268:0x0606 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0608  */
    /* JADX WARN: Code duplicated, block: B:270:0x060d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x060f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0614 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x0616  */
    /* JADX WARN: Code duplicated, block: B:276:0x063e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0670  */
    /* JADX WARN: Code duplicated, block: B:352:0x081f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0824  */
    /* JADX WARN: Code duplicated, block: B:356:0x0841  */
    /* JADX WARN: Code duplicated, block: B:363:0x086b  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:383:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:420:0x0900 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.t
    public final g0 a(u uVar) throws Throwable {
        g0 g0Var;
        int iP;
        long time;
        long time2;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        k kVar;
        long j;
        long time3;
        String string;
        int i;
        int i2;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j2;
        f0 f0VarN;
        int i3;
        g0 g0Var2;
        g0 g0VarM;
        g0 g0VarA;
        androidx.compose.material.ripple.g gVar;
        g0 g0VarA2;
        b1 b1VarN;
        b1 b1VarN2;
        g0 g0Var3;
        boolean z;
        j0 j0Var;
        g0 g0Var4;
        b0 b0Var;
        List list;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        okhttp3.internal.tls.c cVar;
        okhttp3.i iVar;
        switch (this.a) {
            case 0:
                okhttp3.f fVar = (okhttp3.f) this.b;
                if (fVar != null) {
                    b0 b0Var2 = (b0) uVar.i;
                    b0Var2.getClass();
                    s sVar = b0Var2.a;
                    try {
                        e eVarX = fVar.e.x(kotlin.enums.b.c(sVar));
                        if (eVarX == null) {
                            g0Var3 = null;
                        } else {
                            try {
                                okhttp3.d dVar = new okhttp3.d((h0) eVarX.z.get(0));
                                String str6 = dVar.c;
                                r rVar = dVar.b;
                                s sVar2 = dVar.a;
                                r rVar2 = dVar.g;
                                String strB = rVar2.b("Content-Type");
                                String strB2 = rVar2.b("Content-Length");
                                sVar2.getClass();
                                rVar.getClass();
                                str6.getClass();
                                a0 a0Var = new a0();
                                a0Var.a = sVar2;
                                a0Var.c = rVar.d();
                                a0Var.c(!str6.equals("\u0000") ? str6 : "GET", null);
                                b0 b0Var3 = new b0(a0Var);
                                i0 i0Var = j0.y;
                                okhttp3.b bVar = m0.w;
                                new ArrayList(20);
                                z zVar = dVar.d;
                                zVar.getClass();
                                int i4 = dVar.e;
                                String str7 = dVar.f;
                                str7.getClass();
                                androidx.compose.ui.graphics.vector.g gVarD = rVar2.d();
                                okhttp3.c cVar2 = new okhttp3.c(eVarX, strB, strB2);
                                q qVar = dVar.h;
                                long j3 = dVar.i;
                                long j4 = dVar.j;
                                if (i4 < 0) {
                                    kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.n(i4, "code < 0: "));
                                    return null;
                                }
                                r rVarK = gVarD.k();
                                g0Var3 = new g0(b0Var3, zVar, str7, i4, qVar, rVarK, cVar2, null, null, null, null, j3, j4, null, bVar);
                                if (sVar2.equals(sVar) && str6.equals(b0Var2.b)) {
                                    Set setH = kotlin.enums.b.h(rVarK);
                                    if (!(setH instanceof Collection) || !setH.isEmpty()) {
                                        Iterator it = setH.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str8 = (String) it.next();
                                                if (!rVar.h(str8).equals(b0Var2.c.h(str8))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                okhttp3.internal.e.b(g0Var3.D);
                                g0Var3 = null;
                            } catch (IOException unused) {
                                okhttp3.internal.e.b(eVarX);
                            }
                        }
                    } catch (IOException unused2) {
                    }
                    g0Var = g0Var3;
                } else {
                    g0Var = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                b0 b0Var4 = (b0) uVar.i;
                b0Var4.getClass();
                if (g0Var != null) {
                    time = g0Var.I;
                    time2 = g0Var.J;
                    r rVar3 = g0Var.C;
                    int size = rVar3.size();
                    int i5 = 0;
                    iP = -1;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    while (i5 < size) {
                        String strC = rVar3.c(i5);
                        long j5 = jCurrentTimeMillis;
                        String strF = rVar3.f(i5);
                        if (strC.equalsIgnoreCase("Date")) {
                            str3 = strF;
                            dateA3 = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("Expires")) {
                            dateA = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("Last-Modified")) {
                            str2 = strF;
                            dateA2 = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("ETag")) {
                            str = strF;
                        } else if (strC.equalsIgnoreCase("Age")) {
                            iP = okhttp3.internal.e.p(-1, strF);
                        }
                        i5++;
                        jCurrentTimeMillis = j5;
                    }
                } else {
                    iP = -1;
                    time = 0;
                    time2 = 0;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                long j6 = jCurrentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (g0Var == null) {
                    kVar = new k(20, b0Var4, null);
                } else {
                    int i6 = 20;
                    s sVar3 = b0Var4.a;
                    r rVar4 = b0Var4.c;
                    if (sVar3.f() && g0Var.B == null) {
                        kVar = new k(i6, b0Var4, null);
                    } else {
                        Object obj = null;
                        if (kotlin.coroutines.g.k(g0Var, b0Var4)) {
                            okhttp3.g gVarF = b0Var4.f;
                            if (gVarF == null) {
                                int i7 = okhttp3.g.n;
                                gVarF = dagger.hilt.android.internal.a.f(b0Var4.c);
                                b0Var4.f = gVarF;
                            }
                            if (!gVarF.a && rVar4.b("If-Modified-Since") == null && rVar4.b("If-None-Match") == null) {
                                okhttp3.g gVarA = g0Var.a();
                                long jMax = dateA3 != null ? Math.max(0L, time2 - dateA3.getTime()) : 0L;
                                if (iP != -1) {
                                    jMax = Math.max(jMax, timeUnit.toMillis(iP));
                                }
                                long jMax2 = jMax + Math.max(0L, time2 - time) + Math.max(0L, j6 - time2);
                                int i8 = g0Var.a().c;
                                if (i8 != -1) {
                                    time3 = timeUnit.toMillis(i8);
                                } else {
                                    if (dateA != null) {
                                        if (dateA3 != null) {
                                            time2 = dateA3.getTime();
                                        }
                                        time3 = dateA.getTime() - time2;
                                        if (time3 <= 0) {
                                            time3 = 0;
                                        }
                                    } else if (dateA2 == null) {
                                        j = 0;
                                        time3 = j;
                                    } else {
                                        List list2 = g0Var.e.a.g;
                                        if (list2 == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            okhttp3.b.d(list2, sb);
                                            string = sb.toString();
                                        }
                                        if (string == null) {
                                            if (dateA3 != null) {
                                                time = dateA3.getTime();
                                            }
                                            long time4 = time - dateA2.getTime();
                                            j = 0;
                                            if (time4 > 0) {
                                                time3 = time4 / ((long) 10);
                                            }
                                        } else {
                                            j = 0;
                                        }
                                        time3 = j;
                                    }
                                    i = gVarF.c;
                                    if (i != -1) {
                                        time3 = Math.min(time3, timeUnit.toMillis(i));
                                    }
                                    i2 = gVarF.i;
                                    if (i2 != -1) {
                                        millis = timeUnit.toMillis(i2);
                                    } else {
                                        millis = j;
                                    }
                                    if (!gVarA.g || (i3 = gVarF.h) == -1) {
                                        millis2 = j;
                                    } else {
                                        millis2 = timeUnit.toMillis(i3);
                                    }
                                    if (gVarA.a) {
                                        if (str != null) {
                                            str4 = str;
                                            str5 = "If-None-Match";
                                        } else {
                                            if (dateA2 != null) {
                                                str4 = str2;
                                            } else if (dateA3 != null) {
                                                str4 = str3;
                                            } else {
                                                kVar = new k(20, b0Var4, null);
                                            }
                                            str5 = "If-Modified-Since";
                                        }
                                        androidx.compose.ui.graphics.vector.g gVarD2 = rVar4.d();
                                        str4.getClass();
                                        kotlin.collections.builders.c.E(gVarD2, str5, str4);
                                        a0 a0VarA = b0Var4.a();
                                        a0VarA.c = gVarD2.k().d();
                                        kVar = new k(20, new b0(a0VarA), g0Var);
                                    } else {
                                        j2 = jMax2 + millis;
                                        if (j2 < millis2 + time3) {
                                            f0VarN = g0Var.n();
                                            if (j2 >= time3) {
                                                f0VarN.f.g("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (jMax2 > 86400000 && g0Var.a().c == -1 && dateA == null) {
                                                f0VarN.f.g("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            kVar = new k(20, null, f0VarN.a());
                                        } else {
                                            if (str != null) {
                                                str4 = str;
                                                str5 = "If-None-Match";
                                            } else {
                                                if (dateA2 != null) {
                                                    str4 = str2;
                                                } else if (dateA3 != null) {
                                                    str4 = str3;
                                                } else {
                                                    kVar = new k(20, b0Var4, null);
                                                }
                                                str5 = "If-Modified-Since";
                                            }
                                            androidx.compose.ui.graphics.vector.g gVarD3 = rVar4.d();
                                            str4.getClass();
                                            kotlin.collections.builders.c.E(gVarD3, str5, str4);
                                            a0 a0VarA2 = b0Var4.a();
                                            a0VarA2.c = gVarD3.k().d();
                                            kVar = new k(20, new b0(a0VarA2), g0Var);
                                        }
                                    }
                                }
                                j = 0;
                                i = gVarF.c;
                                if (i != -1) {
                                    time3 = Math.min(time3, timeUnit.toMillis(i));
                                }
                                i2 = gVarF.i;
                                if (i2 != -1) {
                                    millis = timeUnit.toMillis(i2);
                                } else {
                                    millis = j;
                                }
                                if (gVarA.g) {
                                    millis2 = j;
                                } else {
                                    millis2 = j;
                                }
                                if (gVarA.a) {
                                    j2 = jMax2 + millis;
                                    if (j2 < millis2 + time3) {
                                        f0VarN = g0Var.n();
                                        if (j2 >= time3) {
                                            f0VarN.f.g("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (jMax2 > 86400000) {
                                            f0VarN.f.g("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        kVar = new k(20, null, f0VarN.a());
                                    } else {
                                        if (str != null) {
                                            str4 = str;
                                            str5 = "If-None-Match";
                                        } else {
                                            if (dateA2 != null) {
                                                str4 = str2;
                                            } else if (dateA3 != null) {
                                                str4 = str3;
                                            } else {
                                                kVar = new k(20, b0Var4, null);
                                            }
                                            str5 = "If-Modified-Since";
                                        }
                                        androidx.compose.ui.graphics.vector.g gVarD4 = rVar4.d();
                                        str4.getClass();
                                        kotlin.collections.builders.c.E(gVarD4, str5, str4);
                                        a0 a0VarA3 = b0Var4.a();
                                        a0VarA3.c = gVarD4.k().d();
                                        kVar = new k(20, new b0(a0VarA3), g0Var);
                                    }
                                } else {
                                    if (str != null) {
                                        str4 = str;
                                        str5 = "If-None-Match";
                                    } else {
                                        if (dateA2 != null) {
                                            str4 = str2;
                                        } else if (dateA3 != null) {
                                            str4 = str3;
                                        } else {
                                            kVar = new k(20, b0Var4, null);
                                        }
                                        str5 = "If-Modified-Since";
                                    }
                                    androidx.compose.ui.graphics.vector.g gVarD5 = rVar4.d();
                                    str4.getClass();
                                    kotlin.collections.builders.c.E(gVarD5, str5, str4);
                                    a0 a0VarA4 = b0Var4.a();
                                    a0VarA4.c = gVarD5.k().d();
                                    kVar = new k(20, new b0(a0VarA4), g0Var);
                                }
                            } else {
                                kVar = new k(20, b0Var4, null);
                            }
                        } else {
                            kVar = new k(i6, b0Var4, obj);
                        }
                    }
                }
                if (((b0) kVar.y) == null) {
                    g0Var2 = null;
                } else {
                    okhttp3.g gVarF2 = b0Var4.f;
                    if (gVarF2 == null) {
                        int i9 = okhttp3.g.n;
                        gVarF2 = dagger.hilt.android.internal.a.f(b0Var4.c);
                        b0Var4.f = gVarF2;
                    }
                    if (gVarF2.j) {
                        g0Var2 = null;
                        kVar = new k(20, g0Var2, g0Var2);
                    } else {
                        g0Var2 = null;
                    }
                }
                b0 b0Var5 = (b0) kVar.y;
                g0 g0Var5 = (g0) kVar.z;
                okhttp3.f fVar2 = (okhttp3.f) this.b;
                if (fVar2 != null) {
                    synchronized (fVar2) {
                    }
                }
                if (g0Var != null && g0Var5 == null) {
                    okhttp3.internal.e.b(g0Var.D);
                }
                if (b0Var5 == null && g0Var5 == null) {
                    i0 i0Var2 = j0.y;
                    okhttp3.b bVar2 = m0.w;
                    ArrayList arrayList = new ArrayList(20);
                    b0 b0Var6 = (b0) uVar.i;
                    b0Var6.getClass();
                    return new g0(b0Var6, z.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new r((String[]) arrayList.toArray(new String[0])), i0Var2, null, null, null, null, -1L, System.currentTimeMillis(), null, bVar2);
                }
                if (b0Var5 == null) {
                    g0Var5.getClass();
                    f0 f0VarN2 = g0Var5.n();
                    g0 g0VarM2 = kotlin.collections.i0.m(g0Var5);
                    f0.b("cacheResponse", g0VarM2);
                    f0VarN2.j = g0VarM2;
                    return f0VarN2.a();
                }
                try {
                    g0 g0VarF = uVar.f(b0Var5);
                    if (g0Var5 == null) {
                        f0 f0VarN3 = g0VarF.n();
                        if (g0Var5 != null) {
                            g0VarM = kotlin.collections.i0.m(g0Var5);
                        } else {
                            g0VarM = g0Var2;
                        }
                        f0.b("cacheResponse", g0VarM);
                        f0VarN3.j = g0VarM;
                        g0 g0VarM3 = kotlin.collections.i0.m(g0VarF);
                        f0.b("networkResponse", g0VarM3);
                        f0VarN3.i = g0VarM3;
                        g0VarA = f0VarN3.a();
                        if (((okhttp3.f) this.b) != null) {
                            if (!okhttp3.internal.http.f.a(g0VarA) && kotlin.coroutines.g.k(g0VarA, b0Var5)) {
                                okhttp3.f fVar3 = (okhttp3.f) this.b;
                                f0 f0VarN4 = g0VarA.n();
                                f0VarN4.a = b0Var5;
                                g0 g0VarA3 = f0VarN4.a();
                                fVar3.getClass();
                                b0 b0Var7 = g0VarA3.e;
                                String str9 = b0Var7.b;
                                try {
                                    if (kotlin.enums.b.b(str9)) {
                                        fVar3.g(b0Var7);
                                    } else {
                                        if (str9.equals("GET") && !kotlin.enums.b.h(g0VarA3.C).contains("*")) {
                                            okhttp3.d dVar2 = new okhttp3.d(g0VarA3);
                                            try {
                                                h hVar = fVar3.e;
                                                String strC2 = kotlin.enums.b.c(b0Var7.a);
                                                kotlin.text.i iVar2 = h.Q;
                                                b1VarN = hVar.n(strC2, -1L);
                                                if (b1VarN == 0) {
                                                    gVar = g0Var2;
                                                } else {
                                                    try {
                                                        dVar2.c(b1VarN);
                                                        androidx.compose.material.ripple.g gVar2 = new androidx.compose.material.ripple.g();
                                                        gVar2.e = fVar3;
                                                        gVar2.b = b1VarN;
                                                        okio.f0 f0VarL = b1VarN.l(1);
                                                        gVar2.c = f0VarL;
                                                        gVar2.d = new okhttp3.e(fVar3, gVar2, f0VarL);
                                                        gVar = gVar2;
                                                    } catch (IOException unused3) {
                                                        if (b1VarN != 0) {
                                                            b1VarN.a();
                                                        }
                                                        gVar = g0Var2;
                                                    }
                                                }
                                            } catch (IOException unused4) {
                                                b1VarN = g0Var2;
                                            }
                                        } else {
                                            gVar = g0Var2;
                                        }
                                        if (gVar != 0) {
                                            a aVar = new a(g0VarA.D.P(), gVar, okio.b.b((okhttp3.e) gVar.d));
                                            String strG = g0.g("Content-Type", g0VarA);
                                            long jN = g0VarA.D.n();
                                            f0 f0VarN5 = g0VarA.n();
                                            f0VarN5.g = new okhttp3.internal.http.g(strG, jN, new okio.b0(aVar));
                                            g0VarA2 = f0VarN5.a();
                                        }
                                    }
                                    break;
                                } catch (IOException unused5) {
                                }
                                gVar = g0Var2;
                                if (gVar != 0) {
                                    a aVar2 = new a(g0VarA.D.P(), gVar, okio.b.b((okhttp3.e) gVar.d));
                                    String strG2 = g0.g("Content-Type", g0VarA);
                                    long jN2 = g0VarA.D.n();
                                    f0 f0VarN6 = g0VarA.n();
                                    f0VarN6.g = new okhttp3.internal.http.g(strG2, jN2, new okio.b0(aVar2));
                                    g0VarA2 = f0VarN6.a();
                                }
                            } else if (kotlin.enums.b.b(b0Var5.b)) {
                                try {
                                    ((okhttp3.f) this.b).g(b0Var5);
                                    break;
                                } catch (IOException unused6) {
                                }
                            }
                        }
                        return g0VarA;
                    }
                    if (g0VarF.A != 304) {
                        okhttp3.internal.e.b(g0Var5.D);
                        f0 f0VarN7 = g0VarF.n();
                        if (g0Var5 != null) {
                            g0VarM = kotlin.collections.i0.m(g0Var5);
                        } else {
                            g0VarM = g0Var2;
                        }
                        f0.b("cacheResponse", g0VarM);
                        f0VarN7.j = g0VarM;
                        g0 g0VarM4 = kotlin.collections.i0.m(g0VarF);
                        f0.b("networkResponse", g0VarM4);
                        f0VarN7.i = g0VarM4;
                        g0VarA = f0VarN7.a();
                        if (((okhttp3.f) this.b) != null) {
                            if (!okhttp3.internal.http.f.a(g0VarA)) {
                                if (kotlin.enums.b.b(b0Var5.b)) {
                                    ((okhttp3.f) this.b).g(b0Var5);
                                }
                            } else if (kotlin.enums.b.b(b0Var5.b)) {
                                ((okhttp3.f) this.b).g(b0Var5);
                            }
                            break;
                        }
                        return g0VarA;
                    }
                    f0 f0VarN8 = g0Var5.n();
                    r rVar5 = g0Var5.C;
                    r rVar6 = g0VarF.C;
                    ArrayList arrayList2 = new ArrayList(20);
                    int size2 = rVar5.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        String strC3 = rVar5.c(i10);
                        String strF2 = rVar5.f(i10);
                        if ((!"Warning".equalsIgnoreCase(strC3) || !kotlin.text.r.u(strF2, "1", false)) && ("Content-Length".equalsIgnoreCase(strC3) || "Content-Encoding".equalsIgnoreCase(strC3) || "Content-Type".equalsIgnoreCase(strC3) || !kotlin.comparisons.a.g(strC3) || rVar6.b(strC3) == null)) {
                            arrayList2.add(strC3);
                            arrayList2.add(kotlin.text.k.g0(strF2).toString());
                        }
                    }
                    int size3 = rVar6.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        String strC4 = rVar6.c(i11);
                        if (!"Content-Length".equalsIgnoreCase(strC4) && !"Content-Encoding".equalsIgnoreCase(strC4) && !"Content-Type".equalsIgnoreCase(strC4) && kotlin.comparisons.a.g(strC4)) {
                            String strF3 = rVar6.f(i11);
                            arrayList2.add(strC4);
                            arrayList2.add(kotlin.text.k.g0(strF3).toString());
                        }
                    }
                    f0VarN8.f = new r((String[]) arrayList2.toArray(new String[0])).d();
                    f0VarN8.l = g0VarF.I;
                    f0VarN8.m = g0VarF.J;
                    g0 g0VarM5 = kotlin.collections.i0.m(g0Var5);
                    f0.b("cacheResponse", g0VarM5);
                    f0VarN8.j = g0VarM5;
                    g0 g0VarM6 = kotlin.collections.i0.m(g0VarF);
                    f0.b("networkResponse", g0VarM6);
                    f0VarN8.i = g0VarM6;
                    g0VarA2 = f0VarN8.a();
                    g0VarF.D.close();
                    okhttp3.f fVar4 = (okhttp3.f) this.b;
                    fVar4.getClass();
                    synchronized (fVar4) {
                    }
                    ((okhttp3.f) this.b).getClass();
                    okhttp3.d dVar3 = new okhttp3.d(g0VarA2);
                    j0 j0Var2 = g0Var5.D;
                    j0Var2.getClass();
                    e eVar = ((okhttp3.c) j0Var2).z;
                    try {
                        b1VarN2 = eVar.A.n(eVar.e, eVar.y);
                        if (b1VarN2 != 0) {
                            try {
                                dVar3.c(b1VarN2);
                                b1VarN2.c();
                                break;
                            } catch (IOException unused7) {
                                if (b1VarN2 != 0) {
                                    try {
                                        b1VarN2.a();
                                        break;
                                    } catch (IOException unused8) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused9) {
                        b1VarN2 = g0Var2;
                    }
                    return g0VarA2;
                } catch (Throwable th) {
                    if (g0Var != null) {
                        okhttp3.internal.e.b(g0Var.D);
                    }
                    throw th;
                }
            case 1:
                n nVar = (n) this.b;
                b0 b0Var8 = (b0) uVar.i;
                a0 a0VarA5 = b0Var8.a();
                s sVar4 = b0Var8.a;
                r rVar7 = b0Var8.c;
                e0 e0Var = b0Var8.d;
                if (e0Var != null) {
                    okhttp3.u uVarB = e0Var.b();
                    if (uVarB != null) {
                        a0VarA5.b("Content-Type", uVarB.a);
                    }
                    long jA = e0Var.a();
                    if (jA != -1) {
                        a0VarA5.b("Content-Length", String.valueOf(jA));
                        a0VarA5.c.y("Transfer-Encoding");
                    } else {
                        a0VarA5.b("Transfer-Encoding", "chunked");
                        a0VarA5.c.y("Content-Length");
                    }
                }
                if (rVar7.b("Host") == null) {
                    a0VarA5.b("Host", okhttp3.internal.g.i(sVar4, false));
                }
                if (rVar7.b("Connection") == null) {
                    a0VarA5.b("Connection", "Keep-Alive");
                }
                if (rVar7.b("Accept-Encoding") == null && rVar7.b("Range") == null) {
                    a0VarA5.b("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                List listB = nVar.b(sVar4);
                if (!listB.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    for (Object obj2 : listB) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            kotlin.collections.q.o();
                            throw null;
                        }
                        m mVar = (m) obj2;
                        if (i12 > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(mVar.a);
                        sb2.append('=');
                        sb2.append(mVar.b);
                        i12 = i13;
                    }
                    a0VarA5.b("Cookie", sb2.toString());
                }
                if (rVar7.b("User-Agent") == null) {
                    a0VarA5.b("User-Agent", "okhttp/5.3.2");
                }
                b0 b0Var9 = new b0(a0VarA5);
                g0 g0VarF2 = uVar.f(b0Var9);
                r rVar8 = g0VarF2.C;
                okhttp3.internal.http.f.b(nVar, b0Var9.a, rVar8);
                f0 f0VarN9 = g0VarF2.n();
                f0VarN9.a = b0Var9;
                if (z && "gzip".equalsIgnoreCase(g0.g("Content-Encoding", g0VarF2)) && okhttp3.internal.http.f.a(g0VarF2) && (j0Var = g0VarF2.D) != null) {
                    p pVar = new p(j0Var.P());
                    androidx.compose.ui.graphics.vector.g gVarD6 = rVar8.d();
                    gVarD6.y("Content-Encoding");
                    gVarD6.y("Content-Length");
                    f0VarN9.f = gVarD6.k().d();
                    f0VarN9.g = new okhttp3.internal.http.g(g0.g("Content-Type", g0VarF2), -1L, new okio.b0(pVar));
                }
                return f0VarN9.a();
            default:
                b0 b0Var10 = (b0) uVar.i;
                okhttp3.internal.connection.m mVar2 = (okhttp3.internal.connection.m) uVar.g;
                List listN = w.e;
                g0 g0Var6 = null;
                int i14 = 0;
                b0 b0Var11 = b0Var10;
                boolean z3 = true;
                while (true) {
                    b0Var11.getClass();
                    if (mVar2.H == null) {
                        synchronized (mVar2) {
                            try {
                                try {
                                    if (mVar2.J) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (mVar2.I || mVar2.L || mVar2.K) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                mVar2 = mVar2;
                            }
                            throw th;
                        }
                        if (z3) {
                            List list3 = listN;
                            y yVar = mVar2.e;
                            okhttp3.internal.concurrent.d dVar4 = yVar.E;
                            androidx.compose.ui.graphics.vector.a aVar3 = mVar2.A;
                            int i15 = yVar.y;
                            int i16 = yVar.z;
                            int i17 = uVar.c;
                            int i18 = uVar.d;
                            g0Var4 = null;
                            int i19 = yVar.A;
                            boolean z4 = yVar.e;
                            boolean z5 = yVar.f;
                            s sVar5 = b0Var11.a;
                            sVar5.getClass();
                            b0 b0Var12 = b0Var11;
                            if (sVar5.f()) {
                                SSLSocketFactory sSLSocketFactory2 = yVar.p;
                                if (sSLSocketFactory2 != null) {
                                    okhttp3.internal.tls.c cVar3 = yVar.t;
                                    iVar = yVar.u;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    cVar = cVar3;
                                } else {
                                    kotlinx.coroutines.future.a.u("CLEARTEXT-only client");
                                }
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                iVar = null;
                            }
                            okhttp3.internal.connection.m mVar3 = mVar2;
                            list = list3;
                            o oVar = new o(dVar4, aVar3, i15, i16, i17, i18, i19, z4, z5, new okhttp3.a(sVar5.d, sVar5.e, yVar.l, yVar.o, sSLSocketFactory, cVar, iVar, yVar.n, yVar.s, yVar.r, yVar.m), mVar2.e.D, mVar3, b0Var12);
                            mVar2 = mVar3;
                            b0Var = b0Var12;
                            y yVar2 = mVar2.e;
                            mVar2.E = yVar2.f ? new c1(oVar, yVar2.E) : new com.google.android.gms.tasks.q(oVar);
                        } else {
                            mVar2 = mVar2;
                            b0Var = b0Var11;
                            list = listN;
                            g0Var4 = null;
                        }
                        try {
                            if (mVar2.N) {
                                throw new IOException("Canceled");
                            }
                            try {
                                f0 f0VarN10 = uVar.f(b0Var).n();
                                f0VarN10.a = b0Var;
                                f0VarN10.k = g0Var6 != null ? kotlin.collections.i0.m(g0Var6) : g0Var4;
                                g0 g0VarA4 = f0VarN10.a();
                                b0 b0VarB = b(g0VarA4, mVar2.H);
                                if (b0VarB == null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    e0 e0Var2 = b0VarB.d;
                                    if (e0Var2 == null || !e0Var2.c()) {
                                        okhttp3.internal.e.b(g0VarA4.D);
                                        int i20 = i14 + 1;
                                        if (i20 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i20);
                                        }
                                        mVar2.f(true);
                                        g0Var6 = g0VarA4;
                                        listN = list;
                                        i14 = i20;
                                        z3 = true;
                                        b0Var11 = b0VarB;
                                    }
                                }
                                mVar2.f(z2);
                                return g0VarA4;
                            } catch (IOException e) {
                                if (!c(e, mVar2, b0Var)) {
                                    byte[] bArr = okhttp3.internal.e.a;
                                    list.getClass();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        kotlin.a.a(e, (Exception) it2.next());
                                    }
                                    throw e;
                                }
                                listN = kotlin.collections.p.N(list, e);
                                mVar2.f(true);
                                b0Var11 = b0Var;
                                z3 = false;
                            }
                        } catch (Throwable th4) {
                            mVar2.f(true);
                            throw th4;
                        }
                    } else {
                        g0Var4 = null;
                        kotlinx.coroutines.future.a.u("Check failed.");
                    }
                }
                return g0Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    public b0 b(g0 g0Var, b1 b1Var) throws ProtocolException {
        y yVar;
        String strG;
        b0 b0Var;
        com.google.android.material.shape.y yVar2;
        s sVarC;
        a0 a0VarA;
        boolean z;
        e0 e0Var;
        g0 g0Var2;
        k0 k0Var = b1Var != null ? b1Var.i().c : null;
        int i = g0Var.A;
        b0 b0Var2 = g0Var.e;
        String str = b0Var2.b;
        if (i == 307 || i == 308) {
            yVar = (y) this.b;
            if (yVar.h) {
                strG = g0.g("Location", g0Var);
                b0Var = g0Var.e;
                if (strG != null) {
                    s sVar = b0Var.a;
                    sVar.getClass();
                    try {
                        yVar2 = new com.google.android.material.shape.y(1);
                        yVar2.f(sVar, strG);
                    } catch (IllegalArgumentException unused) {
                        yVar2 = null;
                    }
                    if (yVar2 != null) {
                        sVarC = yVar2.c();
                    } else {
                        sVarC = null;
                    }
                    if (sVarC != null && (l.a(sVarC.a, b0Var.a.a) || yVar.i)) {
                        a0VarA = b0Var.a();
                        if (kotlin.enums.b.d(str)) {
                            int i2 = g0Var.A;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                a0VarA.c(str, z ? b0Var.d : null);
                            } else {
                                a0VarA.c("GET", null);
                            }
                            if (!z) {
                                a0VarA.c.y("Transfer-Encoding");
                                a0VarA.c.y("Content-Length");
                                a0VarA.c.y("Content-Type");
                            }
                        }
                        if (!okhttp3.internal.g.a(b0Var.a, sVarC)) {
                            a0VarA.c.y("Authorization");
                        }
                        a0VarA.a = sVarC;
                        return new b0(a0VarA);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((y) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                e0 e0Var2 = b0Var2.d;
                if ((e0Var2 == null || !e0Var2.c()) && b1Var != null && !l.a(((okhttp3.internal.connection.g) b1Var.z).b().j.h.d, ((okhttp3.internal.http.e) b1Var.A).i().h().a.h.d)) {
                    okhttp3.internal.connection.n nVarI = b1Var.i();
                    synchronized (nVarI) {
                        nVarI.l = true;
                    }
                    return g0Var.e;
                }
            } else if (i == 503) {
                g0 g0Var3 = g0Var.H;
                if ((g0Var3 == null || g0Var3.A != 503) && d(g0Var, Integer.MAX_VALUE) == 0) {
                    return g0Var.e;
                }
            } else {
                if (i == 407) {
                    k0Var.getClass();
                    if (k0Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((y) this.b).n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            yVar = (y) this.b;
                            if (yVar.h) {
                                strG = g0.g("Location", g0Var);
                                b0Var = g0Var.e;
                                if (strG != null) {
                                    s sVar2 = b0Var.a;
                                    sVar2.getClass();
                                    yVar2 = new com.google.android.material.shape.y(1);
                                    yVar2.f(sVar2, strG);
                                    if (yVar2 != null) {
                                        sVarC = yVar2.c();
                                    } else {
                                        sVarC = null;
                                    }
                                    if (sVarC != null) {
                                        a0VarA = b0Var.a();
                                        if (kotlin.enums.b.d(str)) {
                                            int i3 = g0Var.A;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                a0VarA.c(str, z ? b0Var.d : null);
                                            } else {
                                                a0VarA.c(str, z ? b0Var.d : null);
                                            }
                                            if (!z) {
                                                a0VarA.c.y("Transfer-Encoding");
                                                a0VarA.c.y("Content-Length");
                                                a0VarA.c.y("Content-Type");
                                            }
                                        }
                                        if (!okhttp3.internal.g.a(b0Var.a, sVarC)) {
                                            a0VarA.c.y("Authorization");
                                        }
                                        a0VarA.a = sVarC;
                                        return new b0(a0VarA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((y) this.b).e && (((e0Var = b0Var2.d) == null || !e0Var.c()) && (((g0Var2 = g0Var.H) == null || g0Var2.A != 408) && d(g0Var, 0) <= 0))) {
                    return g0Var.e;
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, okhttp3.internal.connection.m mVar, b0 b0Var) {
        e0 e0Var;
        boolean z = iOException instanceof okhttp3.internal.http2.a;
        if (!((y) this.b).e) {
            return false;
        }
        if ((!z && (((e0Var = b0Var.d) != null && e0Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        b1 b1Var = mVar.O;
        if (b1Var == null || !b1Var.e) {
            return false;
        }
        okhttp3.internal.connection.g gVar = mVar.E;
        gVar.getClass();
        o oVarB = gVar.b();
        b1 b1Var2 = mVar.O;
        return oVarB.a(b1Var2 != null ? b1Var2.i() : null);
    }

    public b(okhttp3.f fVar) {
        this.b = fVar;
    }

    public b(y yVar) {
        yVar.getClass();
        this.b = yVar;
    }
}
