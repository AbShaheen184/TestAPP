package okio.internal;

import androidx.media3.exoplayer.video.v;
import com.google.android.gms.measurement.internal.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.c0;
import kotlin.collections.p;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kotlin.text.r;
import okio.e0;
import okio.k0;
import okio.s;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] b = new byte[0];

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = x.y;
        x xVarD = b0.d("/");
        kotlin.k[] kVarArr = {new kotlin.k(xVarD, new j(xVarD, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.j(1));
        c0.m(linkedHashMap, kVarArr);
        for (j jVar : p.W(arrayList, new com.google.android.material.internal.j(2))) {
            if (((j) linkedHashMap.put(jVar.a, jVar)) == null) {
                while (true) {
                    x xVar = jVar.a;
                    x xVarE = xVar.e();
                    if (xVarE == null) {
                        break;
                    }
                    j jVar2 = (j) linkedHashMap.get(xVarE);
                    if (jVar2 != null) {
                        jVar2.q.add(xVar);
                        break;
                    }
                    j jVar3 = new j(xVarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(xVarE, jVar3);
                    jVar3.q.add(xVar);
                    jVar = jVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final long c(okio.b0 b0Var, okio.i iVar, int i, long j) {
        okio.i iVar2;
        okio.f fVar = b0Var.y;
        iVar.getClass();
        long j2 = i;
        okio.b.d(iVar.f(), 0, j2);
        if (b0Var.z) {
            kotlinx.coroutines.future.a.u("closed");
            return 0L;
        }
        long jMax = 0;
        int i2 = i;
        okio.i iVar3 = iVar;
        while (true) {
            long jA = a.a(fVar, iVar3, jMax, j, i2);
            if (jA != -1) {
                return jA;
            }
            long j3 = fVar.y;
            long j4 = (j3 - j2) + 1;
            if (j4 < j) {
                if (j3 < j) {
                    iVar2 = iVar;
                } else {
                    int iMax = (int) Math.max(1L, (j3 - j) + 1);
                    int iMin = ((int) Math.min(j2, (fVar.y - jMax) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            iVar2 = iVar;
                            if (fVar.b0(iMin, fVar.y - ((long) iMin), iVar2)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (b0Var.e.K(fVar, 8192L) != -1) {
                    jMax = Math.max(jMax, j4);
                    i2 = i;
                    iVar3 = iVar2;
                }
            }
            return -1L;
        }
    }

    public static final String d(int i) {
        kotlin.comparisons.a.c(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final k0 e(x xVar, okio.k kVar, kotlin.jvm.functions.l lVar) {
        Throwable th;
        Throwable th2;
        kVar.getClass();
        s sVarA0 = kVar.a0(xVar);
        try {
            long size = sVarA0.size() - ((long) 22);
            long j = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + sVarA0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            while (true) {
                okio.b0 b0Var = new okio.b0(sVarA0.a(size));
                try {
                    if (b0Var.x() == 101010256) {
                        int iL = b0Var.L() & 65535;
                        int iL2 = b0Var.L() & 65535;
                        long jL = b0Var.L() & 65535;
                        if (jL != (b0Var.L() & 65535) || iL != 0 || iL2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        long j2 = j;
                        b0Var.skip(4L);
                        long jX = 4294967295L & ((long) b0Var.x());
                        int iL3 = b0Var.L() & 65535;
                        v vVar = new v(jL, jX, iL3);
                        b0Var.N(iL3);
                        b0Var.close();
                        long j3 = size - ((long) 20);
                        Throwable th3 = null;
                        if (j3 > j2) {
                            okio.b0 b0Var2 = new okio.b0(sVarA0.a(j3));
                            try {
                                if (b0Var2.x() == 117853008) {
                                    int iX = b0Var2.x();
                                    long jA = b0Var2.A();
                                    if (b0Var2.x() != 1 || iX != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    okio.b0 b0Var3 = new okio.b0(sVarA0.a(jA));
                                    try {
                                        int iX2 = b0Var3.x();
                                        if (iX2 != 101075792) {
                                            throw new IOException("bad zip: expected " + d(101075792) + " but was " + d(iX2));
                                        }
                                        b0Var3.skip(12L);
                                        int iX3 = b0Var3.x();
                                        int iX4 = b0Var3.x();
                                        long jA2 = b0Var3.A();
                                        if (jA2 != b0Var3.A() || iX3 != 0 || iX4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        b0Var3.skip(8L);
                                        v vVar2 = new v(jA2, b0Var3.A(), iL3);
                                        try {
                                            b0Var3.close();
                                            th2 = null;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                        }
                                        vVar = vVar2;
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            b0Var3.close();
                                        } catch (Throwable th6) {
                                            kotlin.a.a(th5, th6);
                                        }
                                        th2 = th5;
                                    }
                                }
                                try {
                                    b0Var2.close();
                                    th = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    b0Var2.close();
                                } catch (Throwable th9) {
                                    kotlin.a.a(th8, th9);
                                }
                                th = th8;
                            }
                            if (th != null) {
                                throw th;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        okio.b0 b0Var4 = new okio.b0(sVarA0.a(vVar.b));
                        try {
                            long j4 = vVar.a;
                            while (j2 < j4) {
                                j jVarF = f(b0Var4);
                                if (jVarF.h >= vVar.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) lVar.invoke(jVarF)).booleanValue()) {
                                    arrayList.add(jVarF);
                                }
                                j2++;
                            }
                            try {
                                b0Var4.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        } catch (Throwable th11) {
                            try {
                                b0Var4.close();
                            } catch (Throwable th12) {
                                kotlin.a.a(th11, th12);
                            }
                            th3 = th11;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        k0 k0Var = new k0(xVar, kVar, b(arrayList));
                        try {
                            sVarA0.close();
                        } catch (Throwable unused) {
                        }
                        return k0Var;
                    }
                    long j5 = j;
                    b0Var.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j = j5;
                } catch (Throwable th13) {
                    b0Var.close();
                    throw th13;
                }
            }
        } catch (Throwable th14) {
            if (sVarA0 == null) {
                throw th14;
            }
            try {
                sVarA0.close();
                throw th14;
            } catch (Throwable th15) {
                kotlin.a.a(th14, th15);
                throw th14;
            }
        }
    }

    public static final j f(final okio.b0 b0Var) throws IOException {
        int iX = b0Var.x();
        if (iX != 33639248) {
            throw new IOException("bad zip: expected " + d(33639248) + " but was " + d(iX));
        }
        b0Var.skip(4L);
        short sL = b0Var.L();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            kotlinx.coroutines.future.a.w("unsupported zip: general purpose bit flag=".concat(d(i)));
            return null;
        }
        int iL = b0Var.L() & 65535;
        int iL2 = b0Var.L() & 65535;
        int iL3 = b0Var.L() & 65535;
        long jX = ((long) b0Var.x()) & 4294967295L;
        final y yVar = new y();
        yVar.e = ((long) b0Var.x()) & 4294967295L;
        final y yVar2 = new y();
        yVar2.e = ((long) b0Var.x()) & 4294967295L;
        int iL4 = b0Var.L() & 65535;
        int iL5 = b0Var.L() & 65535;
        int iL6 = b0Var.L() & 65535;
        b0Var.skip(8L);
        final y yVar3 = new y();
        yVar3.e = ((long) b0Var.x()) & 4294967295L;
        String strN = b0Var.N(iL4);
        if (kotlin.text.k.A(strN, (char) 0)) {
            kotlinx.coroutines.future.a.w("bad zip: filename contains 0x00");
            return null;
        }
        long j = yVar2.e == 4294967295L ? 8 : 0L;
        if (yVar.e == 4294967295L) {
            j += (long) 8;
        }
        if (yVar3.e == 4294967295L) {
            j += (long) 8;
        }
        final long j2 = j;
        final z zVar = new z();
        final z zVar2 = new z();
        final z zVar3 = new z();
        final kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        g(b0Var, iL5, new kotlin.jvm.functions.p() { // from class: okio.internal.l
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                okio.b0 b0Var2 = b0Var;
                if (iIntValue == 1) {
                    kotlin.jvm.internal.v vVar2 = vVar;
                    if (vVar2.e) {
                        kotlinx.coroutines.future.a.w("bad zip: zip64 extra repeated");
                        return null;
                    }
                    vVar2.e = true;
                    if (jLongValue < j2) {
                        kotlinx.coroutines.future.a.w("bad zip: zip64 extra too short");
                        return null;
                    }
                    y yVar4 = yVar2;
                    long jA = yVar4.e;
                    if (jA == 4294967295L) {
                        jA = b0Var2.A();
                    }
                    yVar4.e = jA;
                    y yVar5 = yVar;
                    yVar5.e = yVar5.e == 4294967295L ? b0Var2.A() : 0L;
                    y yVar6 = yVar3;
                    yVar6.e = yVar6.e == 4294967295L ? b0Var2.A() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        kotlinx.coroutines.future.a.w("bad zip: NTFS extra too short");
                        return null;
                    }
                    b0Var2.skip(4L);
                    b.g(b0Var2, (int) (jLongValue - 4), new k(zVar, b0Var2, zVar2, zVar3));
                }
                return kotlin.y.a;
            }
        });
        if (j2 > 0 && !vVar.e) {
            kotlinx.coroutines.future.a.w("bad zip: zip64 extra required but absent");
            return null;
        }
        String strN2 = b0Var.N(iL6);
        String str = x.y;
        return new j(b0.d("/").g(strN), r.n(strN, "/", false), strN2, jX, yVar.e, yVar2.e, iL, yVar3.e, iL3, iL2, (Long) zVar.e, (Long) zVar2.e, (Long) zVar3.e, 57344);
    }

    public static final void g(okio.b0 b0Var, int i, kotlin.jvm.functions.p pVar) throws IOException {
        okio.f fVar = b0Var.y;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                kotlinx.coroutines.future.a.w("bad zip: truncated header in extra field");
                return;
            }
            int iL = b0Var.L() & 65535;
            long jL = ((long) b0Var.L()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jL) {
                kotlinx.coroutines.future.a.w("bad zip: truncated value in extra field");
                return;
            }
            b0Var.R(jL);
            long j3 = fVar.y;
            pVar.invoke(Integer.valueOf(iL), Long.valueOf(jL));
            long j4 = (fVar.y + jL) - j3;
            if (j4 < 0) {
                kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iL, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    fVar.skip(j4);
                }
                j = j2 - jL;
            }
        }
    }

    public static final j h(okio.b0 b0Var, j jVar) throws IOException {
        int iX = b0Var.x();
        if (iX != 67324752) {
            throw new IOException("bad zip: expected " + d(67324752) + " but was " + d(iX));
        }
        b0Var.skip(2L);
        short sL = b0Var.L();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            kotlinx.coroutines.future.a.w("unsupported zip: general purpose bit flag=".concat(d(i)));
            return null;
        }
        b0Var.skip(18L);
        long jL = ((long) b0Var.L()) & 65535;
        int iL = b0Var.L() & 65535;
        b0Var.skip(jL);
        if (jVar == null) {
            b0Var.skip(iL);
            return null;
        }
        z zVar = new z();
        z zVar2 = new z();
        z zVar3 = new z();
        g(b0Var, iL, new k(b0Var, zVar, zVar2, zVar3));
        return new j(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g, jVar.h, jVar.i, jVar.j, jVar.k, jVar.l, jVar.m, (Integer) zVar.e, (Integer) zVar2.e, (Integer) zVar3.e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final int i(e0 e0Var, int i) {
        int i2;
        int[] iArr = e0Var.C;
        int i3 = i + 1;
        int length = e0Var.B.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
