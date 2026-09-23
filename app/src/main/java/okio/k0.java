package okio;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends k {
    public static final x C;
    public final k A;
    public final LinkedHashMap B;
    public final x z;

    static {
        String str = x.y;
        C = com.google.android.gms.measurement.internal.b0.d("/");
    }

    public k0(x xVar, k kVar, LinkedHashMap linkedHashMap) {
        kVar.getClass();
        this.z = xVar;
        this.A = kVar;
        this.B = linkedHashMap;
    }

    @Override // okio.k
    public final void A(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final List X(x xVar) throws IOException {
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.j jVar = (okio.internal.j) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (jVar != null) {
            return kotlin.collections.p.b0(jVar.q);
        }
        kotlinx.coroutines.future.a.x(xVar, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    @Override // okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) throws Throwable {
        Long lValueOf;
        long j;
        Long l;
        Long lValueOf2;
        Long l2;
        Integer num;
        Long l3;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        okio.internal.j jVarH;
        xVar.getClass();
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.j jVar = (okio.internal.j) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (jVar == null) {
            return null;
        }
        long j2 = jVar.h;
        if (j2 != -1) {
            s sVarA0 = this.A.a0(this.z);
            try {
                b0 b0Var = new b0(sVarA0.a(j2));
                try {
                    jVarH = okio.internal.b.h(b0Var, jVar);
                    jVarH.getClass();
                    try {
                        b0Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        b0Var.close();
                    } catch (Throwable th5) {
                        kotlin.a.a(th4, th5);
                    }
                    th2 = th4;
                    jVarH = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    sVarA0.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
                okio.internal.j jVar2 = jVarH;
                th = th;
                jVar = jVar2;
            } catch (Throwable th7) {
                th = th7;
                if (sVarA0 != null) {
                    try {
                        sVarA0.close();
                    } catch (Throwable th8) {
                        kotlin.a.a(th, th8);
                    }
                }
                jVar = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = jVar.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(jVar.f);
        Long l4 = jVar.m;
        if (l4 != null) {
            lValueOf = Long.valueOf((l4.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num2 = jVar.p;
            lValueOf = num2 != null ? Long.valueOf(((long) num2.intValue()) * 1000) : null;
        }
        Long l5 = jVar.k;
        if (l5 != null) {
            j = 11644473600000L;
            lValueOf2 = Long.valueOf((l5.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            j = 11644473600000L;
            Integer num3 = jVar.n;
            if (num3 == null) {
                int i = jVar.j;
                if (i != -1) {
                    int i2 = jVar.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                    l2 = jVar.l;
                    if (l2 == null) {
                        num = jVar.o;
                        if (num != null) {
                            lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                        } else {
                            l3 = null;
                        }
                        return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                    }
                    lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
                    l3 = lValueOf3;
                    return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                }
                l = null;
                l2 = jVar.l;
                if (l2 == null) {
                    num = jVar.o;
                    if (num != null) {
                        lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                    } else {
                        l3 = null;
                    }
                    return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                }
                lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
                l3 = lValueOf3;
                return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
            }
            lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
        }
        l = lValueOf2;
        l2 = jVar.l;
        if (l2 == null) {
            num = jVar.o;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                l3 = null;
            }
            return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
        }
        lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
        l3 = lValueOf3;
        return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
    }

    @Override // okio.k
    public final f0 a(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final s a0(x xVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.k
    public final f0 b0(x xVar, boolean z) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final h0 c0(x xVar) throws Throwable {
        b0 b0Var;
        Throwable th;
        xVar.getClass();
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.j jVar = (okio.internal.j) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (jVar == null) {
            kotlinx.coroutines.future.a.v(xVar, "no such file: ");
            return null;
        }
        long j = jVar.f;
        s sVarA0 = this.A.a0(this.z);
        try {
            b0Var = new b0(sVarA0.a(jVar.h));
            try {
                sVarA0.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (sVarA0 != null) {
                try {
                    sVarA0.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th3, th4);
                }
            }
            b0Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        b0Var.getClass();
        okio.internal.b.h(b0Var, null);
        if (jVar.g == 0) {
            return new okio.internal.f(b0Var, j, true);
        }
        return new okio.internal.f(new q(new b0(new okio.internal.f(b0Var, jVar.e, true)), new Inflater(true)), j, false);
    }

    @Override // okio.k
    public final void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final void x(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
