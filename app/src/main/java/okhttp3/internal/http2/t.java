package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {
    public static final Logger A;
    public final okio.h e;
    public final s y;
    public final e z;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        logger.getClass();
        A = logger;
    }

    public t(okio.b0 b0Var) {
        b0Var.getClass();
        this.e = b0Var;
        s sVar = new s(b0Var);
        this.y = sVar;
        this.z = new e(sVar);
    }

    public final void A(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            kotlinx.coroutines.future.a.w("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.e.readInt() & Integer.MAX_VALUE;
        List listN = n(r.a(i - 4, i2, i4), i4, i2, i3);
        p pVar = (p) eVar.z;
        synchronized (pVar) {
            if (pVar.W.contains(Integer.valueOf(i6))) {
                pVar.N(i6, b.PROTOCOL_ERROR);
                return;
            }
            pVar.W.add(Integer.valueOf(i6));
            okhttp3.internal.concurrent.c.c(pVar.F, pVar.z + '[' + i6 + "] onRequest", 0L, new l(pVar, i6, listN, i5), 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f9 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #7 {, blocks: (B:194:0x02f3, B:196:0x02f9), top: B:240:0x02f3 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0306  */
    /* JADX WARN: Code duplicated, block: B:238:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    public final boolean a(boolean z, com.app.mlounge.ui.screens.downloads.e eVar) throws Exception {
        p pVar;
        x xVarN;
        okio.i iVarL;
        p pVar2;
        try {
            this.e.R(9L);
            int iO = okhttp3.internal.e.o(this.e);
            if (iO > 16384) {
                kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iO, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i = this.e.readByte() & 255;
            byte b = this.e.readByte();
            int i2 = b & 255;
            int i3 = this.e.readInt();
            int i4 = Integer.MAX_VALUE & i3;
            int i5 = 1;
            if (i != 8) {
                Logger logger = A;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i4, iO, i, i2));
                }
            }
            if (z && i != 4) {
                kotlinx.coroutines.future.a.t(h.a(i), "Expected a SETTINGS frame but was ");
                return false;
            }
            b bVar = null;
            switch (i) {
                case 0:
                    g(eVar, iO, i2, i4);
                    return true;
                case 1:
                    x(eVar, iO, i2, i4);
                    return true;
                case 2:
                    if (iO != 5) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.q("TYPE_PRIORITY length: ", iO, " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        kotlinx.coroutines.future.a.w("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    okio.h hVar = this.e;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (iO != 4) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.q("TYPE_RST_STREAM length: ", iO, " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        kotlinx.coroutines.future.a.w("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i6 = this.e.readInt();
                    b.y.getClass();
                    for (b bVar2 : b.values()) {
                        if (bVar2.e == i6) {
                            bVar = bVar2;
                            if (bVar != null) {
                                kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i6, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            pVar = (p) eVar.z;
                            if (i4 == 0 && (i3 & 1) == 0) {
                                okhttp3.internal.concurrent.c.c(pVar.F, pVar.z + '[' + i4 + "] onReset", 0L, new l(pVar, i4, bVar, i5), 6);
                                return true;
                            }
                            xVarN = pVar.n(i4);
                            if (xVarN != null) {
                                synchronized (xVarN) {
                                    if (xVarN.h() == null) {
                                        xVarN.I = bVar;
                                        xVarN.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (bVar != null) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i6, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    pVar = (p) eVar.z;
                    if (i4 == 0) {
                    }
                    xVarN = pVar.n(i4);
                    if (xVarN != null) {
                        synchronized (xVarN) {
                            if (xVarN.h() == null) {
                                xVarN.I = bVar;
                                xVarN.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    okio.h hVar2 = this.e;
                    if (i4 != 0) {
                        kotlinx.coroutines.future.a.w("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iO != 0) {
                            kotlinx.coroutines.future.a.w("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iO % 6 != 0) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iO, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    b0 b0Var = new b0();
                    kotlin.ranges.b bVarL = i0.l(i0.n(0, iO), 6);
                    int i7 = bVarL.e;
                    int i8 = bVarL.y;
                    int i9 = bVarL.z;
                    if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                        while (true) {
                            short s = hVar2.readShort();
                            byte[] bArr = okhttp3.internal.e.a;
                            int i10 = s & 65535;
                            int i11 = hVar2.readInt();
                            if (i10 != 2) {
                                if (i10 != 4) {
                                    if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (i11 < 0) {
                                    kotlinx.coroutines.future.a.w("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i11 != 0 && i11 != 1) {
                                kotlinx.coroutines.future.a.w("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            b0Var.b(i10, i11);
                            if (i7 != i8) {
                                i7 += i9;
                            }
                        }
                    }
                    p pVar3 = (p) eVar.z;
                    okhttp3.internal.concurrent.c.c(pVar3.E, androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), pVar3.z, " applyAndAckSettings"), 0L, new com.app.mlounge.ui.screens.adult.b(23, eVar, b0Var), 6);
                    return true;
                case 5:
                    A(eVar, iO, i2, i4);
                    return true;
                case 6:
                    if (iO != 8) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iO, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        kotlinx.coroutines.future.a.w("TYPE_PING streamId != 0");
                        return false;
                    }
                    final int i12 = this.e.readInt();
                    final int i13 = this.e.readInt();
                    i = (b & 1) != 0 ? 1 : 0;
                    p pVar4 = (p) eVar.z;
                    if (i == 0) {
                        okhttp3.internal.concurrent.c cVar = pVar4.E;
                        String strU = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), ((p) eVar.z).z, " ping");
                        final p pVar5 = (p) eVar.z;
                        okhttp3.internal.concurrent.c.c(cVar, strU, 0L, new kotlin.jvm.functions.a() { // from class: okhttp3.internal.http2.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                p pVar6 = pVar5;
                                try {
                                    pVar6.U.L(i12, i13, true);
                                } catch (IOException e) {
                                    b bVar3 = b.PROTOCOL_ERROR;
                                    pVar6.a(bVar3, bVar3, e);
                                }
                                return kotlin.y.a;
                            }
                        }, 6);
                        return true;
                    }
                    synchronized (pVar4) {
                        try {
                            if (i12 == 1) {
                                pVar4.J++;
                            } else if (i12 == 2) {
                                pVar4.L++;
                            } else if (i12 == 3) {
                                pVar4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iO < 8) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iO, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        kotlinx.coroutines.future.a.w("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i14 = this.e.readInt();
                    int i15 = this.e.readInt();
                    int i16 = iO - 8;
                    b.y.getClass();
                    for (b bVar3 : b.values()) {
                        if (bVar3.e == i15) {
                            bVar = bVar3;
                            if (bVar != null) {
                                kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i15, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            iVarL = okio.i.A;
                            if (i16 > 0) {
                                iVarL = this.e.l(i16);
                            }
                            iVarL.getClass();
                            iVarL.f();
                            pVar2 = (p) eVar.z;
                            synchronized (pVar2) {
                                Object[] array = pVar2.y.values().toArray(new x[0]);
                                pVar2.C = true;
                            }
                            for (x xVar : (x[]) array) {
                                if (xVar.e <= i14 && xVar.i()) {
                                    b bVar4 = b.REFUSED_STREAM;
                                    synchronized (xVar) {
                                        if (xVar.h() == null) {
                                            xVar.I = bVar4;
                                            xVar.notifyAll();
                                        }
                                        break;
                                    }
                                    ((p) eVar.z).n(xVar.e);
                                }
                            }
                            return true;
                        }
                    }
                    if (bVar != null) {
                        kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i15, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    iVarL = okio.i.A;
                    if (i16 > 0) {
                        iVarL = this.e.l(i16);
                    }
                    iVarL.getClass();
                    iVarL.f();
                    pVar2 = (p) eVar.z;
                    synchronized (pVar2) {
                        Object[] array2 = pVar2.y.values().toArray(new x[0]);
                        pVar2.C = true;
                        while (i < r3) {
                            if (xVar.e <= i14) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iO != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iO);
                        }
                        long j = 2147483647L & ((long) this.e.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = A;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i4, j, iO, true));
                        }
                        p pVar6 = (p) eVar.z;
                        if (i4 == 0) {
                            synchronized (pVar6) {
                                pVar6.S += j;
                                pVar6.notifyAll();
                            }
                            return true;
                        }
                        x xVarG = pVar6.g(i4);
                        if (xVarG != null) {
                            synchronized (xVarG) {
                                xVarG.B += j;
                                if (j > 0) {
                                    xVarG.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        A.fine(h.b(true, i4, iO, 8, i2));
                        throw e;
                    }
                default:
                    this.e.skip(iO);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    public final void g(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            kotlinx.coroutines.future.a.w("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            kotlinx.coroutines.future.a.w("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        final int iA = r.a(i, i2, i4);
        okio.h hVar = this.e;
        hVar.getClass();
        final p pVar = (p) eVar.z;
        if (i3 != 0 && (i3 & 1) == 0) {
            final okio.f fVar = new okio.f();
            long j = iA;
            hVar.R(j);
            hVar.K(fVar, j);
            okhttp3.internal.concurrent.c.c(pVar.F, pVar.z + '[' + i3 + "] onData", 0L, new kotlin.jvm.functions.a(i3, fVar, iA, z4) { // from class: okhttp3.internal.http2.k
                public final /* synthetic */ int A;
                public final /* synthetic */ int y;
                public final /* synthetic */ okio.f z;

                @Override // kotlin.jvm.functions.a
                public final Object invoke() {
                    p pVar2 = this.e;
                    int i5 = this.y;
                    okio.f fVar2 = this.z;
                    int i6 = this.A;
                    try {
                        pVar2.H.getClass();
                        fVar2.skip(i6);
                        pVar2.U.N(i5, b.CANCEL);
                        synchronized (pVar2) {
                            pVar2.W.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return kotlin.y.a;
                }
            }, 6);
        } else {
            x xVarG = pVar.g(i3);
            if (xVarG == null) {
                ((p) eVar.z).N(i3, b.PROTOCOL_ERROR);
                long j2 = iA;
                ((p) eVar.z).A(j2);
                hVar.skip(j2);
            } else {
                TimeZone timeZone = okhttp3.internal.g.a;
                v vVar = xVarG.E;
                long j3 = iA;
                vVar.getClass();
                long j4 = j3;
                while (true) {
                    x xVar = vVar.C;
                    if (j4 <= 0) {
                        z = z4;
                        TimeZone timeZone2 = okhttp3.internal.g.a;
                        xVar.y.A(j3);
                        vVar.C.y.N.getClass();
                        break;
                    }
                    synchronized (xVar) {
                        z2 = vVar.y;
                        z = z4;
                        z3 = vVar.A.y + j4 > vVar.e;
                    }
                    if (z3) {
                        hVar.skip(j4);
                        vVar.C.g(b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        hVar.skip(j4);
                        break;
                    }
                    long jK = hVar.K(vVar.z, j4);
                    if (jK == -1) {
                        throw new EOFException();
                    }
                    j4 -= jK;
                    x xVar2 = vVar.C;
                    synchronized (xVar2) {
                        try {
                            if (vVar.B) {
                                vVar.z.a();
                            } else {
                                okio.f fVar2 = vVar.A;
                                boolean z5 = fVar2.y == 0;
                                fVar2.n0(vVar.z);
                                if (z5) {
                                    xVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z4 = z;
                }
                if (z) {
                    xVarG.k(okhttp3.r.y, true);
                }
            }
        }
        this.e.skip(i4);
    }

    public final List n(int i, int i2, int i3, int i4) throws IOException {
        s sVar = this.y;
        sVar.B = i;
        sVar.y = i;
        sVar.C = i2;
        sVar.z = i3;
        sVar.A = i4;
        e eVar = this.z;
        okio.b0 b0Var = eVar.c;
        ArrayList arrayList = eVar.b;
        while (!b0Var.a()) {
            byte b = b0Var.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            int i5 = b & 255;
            if (i5 == 128) {
                kotlinx.coroutines.future.a.w("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = eVar.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    d[] dVarArr = g.a;
                    if (i6 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i6]);
                    }
                }
                int length = eVar.e + 1 + (i6 - g.a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        dVar.getClass();
                        arrayList.add(dVar);
                    }
                }
                kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                d[] dVarArr3 = g.a;
                okio.i iVarD = eVar.d();
                g.a(iVarD);
                eVar.c(new d(iVarD, eVar.d()));
            } else if ((b & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i5, 63) - 1), eVar.d()));
            } else if ((b & 32) == 32) {
                int iE2 = eVar.e(i5, 31);
                eVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.a);
                }
                int i7 = eVar.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        kotlin.collections.o.p(eVar.d, null);
                        eVar.e = eVar.d.length - 1;
                        eVar.f = 0;
                        eVar.g = 0;
                    } else {
                        eVar.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                d[] dVarArr4 = g.a;
                okio.i iVarD2 = eVar.d();
                g.a(iVarD2);
                arrayList.add(new d(iVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i5, 15) - 1), eVar.d()));
            }
        }
        List listB0 = kotlin.collections.p.b0(arrayList);
        arrayList.clear();
        return listB0;
    }

    public final void x(com.app.mlounge.ui.screens.downloads.e eVar, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        if (i3 == 0) {
            kotlinx.coroutines.future.a.w("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            byte b = this.e.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            okio.h hVar = this.e;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = okhttp3.internal.e.a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List listN = n(r.a(i5, i2, i4), i4, i2, i3);
        p pVar = (p) eVar.z;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            okhttp3.internal.concurrent.c.c(pVar.F, pVar.z + '[' + i3 + "] onHeaders", 0L, new l(pVar, i3, listN, z2), 6);
            return;
        }
        synchronized (pVar) {
            try {
                x xVarG = pVar.g(i3);
                if (xVarG != null) {
                    xVarG.k(okhttp3.internal.g.h(listN), z2);
                    return;
                }
                if (pVar.C) {
                    return;
                }
                if (i3 <= pVar.A) {
                    return;
                }
                if (i3 % 2 == pVar.B % 2) {
                    return;
                }
                try {
                    x xVar = new x(i3, pVar, false, z2, okhttp3.internal.g.h(listN));
                    pVar.A = i3;
                    pVar.y.put(Integer.valueOf(i3), xVar);
                    okhttp3.internal.concurrent.c.c(pVar.D.d(), pVar.z + '[' + i3 + "] onStream", 0L, new com.app.mlounge.ui.screens.adult.b(22, pVar, xVar), 6);
                    return;
                } catch (Throwable th) {
                    th = th;
                    pVar = pVar;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }
    }
}
