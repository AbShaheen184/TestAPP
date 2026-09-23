package coil3.disk;

import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.foundation.text.selection.q;
import androidx.compose.runtime.s2;
import androidx.work.impl.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.text.i;
import kotlin.text.r;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.b0;
import okio.h0;
import okio.k;
import okio.x;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AutoCloseable {
    public static final i O = new i("[a-z0-9_-]{1,120}");
    public final x A;
    public final x B;
    public final LinkedHashMap C;
    public final CoroutineScope D;
    public final Object E;
    public long F;
    public int G;
    public z H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final c N;
    public final x e;
    public final long y;
    public final x z;

    public d(long j, k kVar, x xVar) {
        this.e = xVar;
        this.y = j;
        if (j <= 0) {
            kotlinx.coroutines.future.a.q("maxSize <= 0");
            throw null;
        }
        this.z = xVar.g("journal");
        this.A = xVar.g("journal.tmp");
        this.B = xVar.g("journal.bkp");
        this.C = new LinkedHashMap(0, 0.75f, true);
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        completableJobSupervisorJob$default.getClass();
        CoroutineDispatcher.Key.getClass();
        this.D = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(CoroutineDispatcher.limitedParallelism$default(Dispatchers.getIO(), 1, null, 2, null)));
        this.E = new Object();
        this.N = new c(kVar);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0079, B:33:0x0080, B:28:0x005e, B:37:0x00a0, B:39:0x00a7, B:42:0x00ac, B:44:0x00bd, B:47:0x00c2, B:52:0x00fd, B:54:0x0108, B:58:0x0111, B:48:0x00da, B:50:0x00ef, B:51:0x00fa, B:36:0x0090, B:61:0x0116, B:62:0x011d), top: B:65:0x0003 }] */
    public static final void a(d dVar, b1 b1Var, boolean z) {
        synchronized (dVar.E) {
            a aVar = (a) b1Var.y;
            if (!l.a(aVar.g, b1Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || aVar.f) {
                for (int i = 0; i < 2; i++) {
                    dVar.N.L((x) aVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) b1Var.z)[i2] && !dVar.N.N((x) aVar.d.get(i2))) {
                        b1Var.d(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    x xVar = (x) aVar.d.get(i3);
                    x xVar2 = (x) aVar.c.get(i3);
                    boolean zN = dVar.N.N(xVar);
                    c cVar = dVar.N;
                    if (zN) {
                        cVar.g(xVar, xVar2);
                    } else {
                        v.h(cVar, (x) aVar.c.get(i3));
                    }
                    long j = aVar.b[i3];
                    Long l = (Long) dVar.N.Y(xVar2).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    aVar.b[i3] = jLongValue;
                    dVar.F = (dVar.F - j) + jLongValue;
                }
            }
            aVar.g = null;
            if (aVar.f) {
                dVar.Y(aVar);
                return;
            }
            dVar.G++;
            z zVar = dVar.H;
            zVar.getClass();
            if (z || aVar.e) {
                aVar.e = true;
                zVar.y("CLEAN");
                zVar.writeByte(32);
                zVar.y(aVar.a);
                for (long j2 : aVar.b) {
                    zVar.writeByte(32);
                    zVar.S(j2);
                }
                zVar.writeByte(10);
            } else {
                dVar.C.remove(aVar.a);
                zVar.y("REMOVE");
                zVar.writeByte(32);
                zVar.y(aVar.a);
                zVar.writeByte(10);
            }
            zVar.flush();
            if (dVar.F > dVar.y) {
                dVar.A();
            } else if (dVar.G >= 2000) {
                dVar.A();
            }
        }
    }

    public static void a0(String str) {
        if (O.e(str)) {
            return;
        }
        kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.r("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final void A() {
        BuildersKt__Builders_commonKt.launch$default(this.D, null, null, new q(this, null, 3), 3, null);
    }

    public final void L() {
        Iterator it = this.C.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i = 0;
            if (aVar.g == null) {
                while (i < 2) {
                    j += aVar.b[i];
                    i++;
                }
            } else {
                aVar.g = null;
                while (i < 2) {
                    x xVar = (x) aVar.c.get(i);
                    c cVar = this.N;
                    cVar.L(xVar);
                    cVar.L((x) aVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.F = j;
    }

    public final void N() throws Throwable {
        c cVar = this.N;
        x xVar = this.z;
        h0 h0VarC0 = cVar.c0(xVar);
        h0VarC0.getClass();
        b0 b0Var = new b0(h0VarC0);
        try {
            String strT = b0Var.t(Long.MAX_VALUE);
            String strT2 = b0Var.t(Long.MAX_VALUE);
            String strT3 = b0Var.t(Long.MAX_VALUE);
            String strT4 = b0Var.t(Long.MAX_VALUE);
            String strT5 = b0Var.t(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strT) || !"1".equals(strT2) || !l.a(String.valueOf(3), strT3) || !l.a(String.valueOf(2), strT4) || strT5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strT + ", " + strT2 + ", " + strT3 + ", " + strT4 + ", " + strT5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    X(b0Var.t(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.G = i - this.C.size();
                    if (b0Var.a()) {
                        cVar.getClass();
                        xVar.getClass();
                        this.H = new z(new e(cVar.a(xVar), new s2(this, 10)));
                    } else {
                        b0();
                    }
                    try {
                        b0Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                b0Var.close();
            } catch (Throwable th3) {
                kotlin.a.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void X(String str) throws IOException {
        String strSubstring;
        int iG = kotlin.text.k.G(str, ' ', 0, 6);
        if (iG == -1) {
            kotlinx.coroutines.future.a.w("unexpected journal line: ".concat(str));
            return;
        }
        int i = iG + 1;
        int iG2 = kotlin.text.k.G(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.C;
        if (iG2 == -1) {
            strSubstring = str.substring(i);
            if (iG == 6 && r.u(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iG2);
        }
        Object aVar = linkedHashMap.get(strSubstring);
        if (aVar == null) {
            aVar = new a(this, strSubstring);
            linkedHashMap.put(strSubstring, aVar);
        }
        a aVar2 = (a) aVar;
        if (iG2 == -1 || iG != 5 || !r.u(str, "CLEAN", false)) {
            if (iG2 == -1 && iG == 5 && r.u(str, "DIRTY", false)) {
                aVar2.g = new b1(this, aVar2);
                return;
            } else {
                if (iG2 == -1 && iG == 4 && r.u(str, "READ", false)) {
                    return;
                }
                kotlinx.coroutines.future.a.w("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listV = kotlin.text.k.V(str.substring(iG2 + 1), new char[]{' '});
        aVar2.e = true;
        aVar2.g = null;
        if (listV.size() != 2) {
            kotlinx.coroutines.future.a.x(listV, "unexpected journal line: ");
            return;
        }
        try {
            int size = listV.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar2.b[i2] = Long.parseLong((String) listV.get(i2));
            }
        } catch (NumberFormatException unused) {
            kotlinx.coroutines.future.a.x(listV, "unexpected journal line: ");
        }
    }

    public final void Y(a aVar) {
        z zVar;
        int i = aVar.h;
        String str = aVar.a;
        if (i > 0 && (zVar = this.H) != null) {
            zVar.y("DIRTY");
            zVar.writeByte(32);
            zVar.y(str);
            zVar.writeByte(10);
            zVar.flush();
        }
        if (aVar.h > 0 || aVar.g != null) {
            aVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.N.L((x) aVar.c.get(i2));
            long j = this.F;
            long[] jArr = aVar.b;
            this.F = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.G++;
        z zVar2 = this.H;
        if (zVar2 != null) {
            zVar2.y("REMOVE");
            zVar2.writeByte(32);
            zVar2.y(str);
            zVar2.writeByte(10);
            zVar2.flush();
        }
        this.C.remove(str);
        if (this.G >= 2000) {
            A();
        }
    }

    public final void Z() {
        while (this.F > this.y) {
            for (a aVar : this.C.values()) {
                if (!aVar.f) {
                    Y(aVar);
                }
            }
            return;
        }
        this.L = false;
    }

    public final void b0() {
        Throwable th;
        synchronized (this.E) {
            try {
                z zVar = this.H;
                if (zVar != null) {
                    zVar.close();
                }
                z zVarB = okio.b.b(this.N.b0(this.A, false));
                try {
                    zVarB.y("libcore.io.DiskLruCache");
                    zVarB.writeByte(10);
                    zVarB.y("1");
                    zVarB.writeByte(10);
                    zVarB.S(3);
                    zVarB.writeByte(10);
                    zVarB.S(2);
                    zVarB.writeByte(10);
                    zVarB.writeByte(10);
                    for (a aVar : this.C.values()) {
                        if (aVar.g != null) {
                            zVarB.y("DIRTY");
                            zVarB.writeByte(32);
                            zVarB.y(aVar.a);
                            zVarB.writeByte(10);
                        } else {
                            zVarB.y("CLEAN");
                            zVarB.writeByte(32);
                            zVarB.y(aVar.a);
                            for (long j : aVar.b) {
                                zVarB.writeByte(32);
                                zVarB.S(j);
                            }
                            zVarB.writeByte(10);
                        }
                    }
                    try {
                        zVarB.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        zVarB.close();
                    } catch (Throwable th4) {
                        kotlin.a.a(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zN = this.N.N(this.z);
                c cVar = this.N;
                if (zN) {
                    cVar.g(this.z, this.B);
                    this.N.g(this.A, this.z);
                    this.N.L(this.B);
                } else {
                    cVar.g(this.A, this.z);
                }
                c cVar2 = this.N;
                x xVar = this.z;
                cVar2.getClass();
                xVar.getClass();
                this.H = new z(new e(cVar2.a(xVar), new s2(this, 10)));
                this.G = 0;
                this.I = false;
                this.M = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.E) {
            try {
                if (this.J && !this.K) {
                    for (a aVar : (a[]) this.C.values().toArray(new a[0])) {
                        b1 b1Var = aVar.g;
                        if (b1Var != null) {
                            a aVar2 = (a) b1Var.y;
                            if (l.a(aVar2.g, b1Var)) {
                                aVar2.f = true;
                            }
                        }
                    }
                    Z();
                    CoroutineScopeKt.cancel$default(this.D, null, 1, null);
                    z zVar = this.H;
                    zVar.getClass();
                    zVar.close();
                    this.H = null;
                    this.K = true;
                    return;
                }
                this.K = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b1 g(String str) {
        synchronized (this.E) {
            if (this.K) {
                throw new IllegalStateException("cache is closed");
            }
            a0(str);
            x();
            a aVar = (a) this.C.get(str);
            if ((aVar != null ? aVar.g : null) != null) {
                return null;
            }
            if (aVar != null && aVar.h != 0) {
                return null;
            }
            if (!this.L && !this.M) {
                z zVar = this.H;
                zVar.getClass();
                zVar.y("DIRTY");
                zVar.writeByte(32);
                zVar.y(str);
                zVar.writeByte(10);
                zVar.flush();
                if (this.I) {
                    return null;
                }
                if (aVar == null) {
                    aVar = new a(this, str);
                    this.C.put(str, aVar);
                }
                b1 b1Var = new b1(this, aVar);
                aVar.g = b1Var;
                return b1Var;
            }
            A();
            return null;
        }
    }

    public final b n(String str) {
        b bVarA;
        synchronized (this.E) {
            if (this.K) {
                throw new IllegalStateException("cache is closed");
            }
            a0(str);
            x();
            a aVar = (a) this.C.get(str);
            if (aVar != null && (bVarA = aVar.a()) != null) {
                boolean z = true;
                this.G++;
                z zVar = this.H;
                zVar.getClass();
                zVar.y("READ");
                zVar.writeByte(32);
                zVar.y(str);
                zVar.writeByte(10);
                zVar.flush();
                if (this.G < 2000) {
                    z = false;
                }
                if (z) {
                    A();
                }
                return bVarA;
            }
            return null;
        }
    }

    public final void x() {
        synchronized (this.E) {
            try {
                if (this.J) {
                    return;
                }
                this.N.L(this.A);
                if (this.N.N(this.B)) {
                    boolean zN = this.N.N(this.z);
                    c cVar = this.N;
                    x xVar = this.B;
                    if (zN) {
                        cVar.L(xVar);
                    } else {
                        cVar.g(xVar, this.z);
                    }
                }
                if (this.N.N(this.z)) {
                    try {
                        N();
                        L();
                        this.J = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            v.m(this.N, this.e);
                            this.K = false;
                            b0();
                            this.J = true;
                        } catch (Throwable th) {
                            this.K = false;
                            throw th;
                        }
                    }
                }
                b0();
                this.J = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
