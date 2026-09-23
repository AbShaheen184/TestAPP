package androidx.media3.extractor.avi;

import androidx.compose.runtime.j;
import androidx.media3.common.r;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import com.google.common.collect.a0;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.q;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {
    public final h0 a;
    public final int b;

    public f(int i, a1 a1Var) {
        this.b = i;
        this.a = a1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f c(int i, v vVar) {
        String str;
        a gVar;
        String str2;
        int i2 = 4;
        q.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = vVar.c;
        int iB = -2;
        int i4 = 0;
        while (vVar.a() > 8) {
            int iO = vVar.o();
            int iO2 = vVar.b + vVar.o();
            vVar.L(iO2);
            if (iO != 1414744396) {
                d dVar = null;
                switch (iO) {
                    case 1718776947:
                        if (iB != 2) {
                            if (iB == 1) {
                                int iS = vVar.s();
                                if (iS == 1) {
                                    str = "audio/raw";
                                } else if (iS == 85) {
                                    str = "audio/mpeg";
                                } else if (iS == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iS != 8192) {
                                    str = iS != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iS2 = vVar.s();
                                    int iO3 = vVar.o();
                                    vVar.N(6);
                                    int iS3 = vVar.s();
                                    String str3 = i0.a;
                                    int iD = i0.D(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = vVar.a() > 0 ? vVar.s() : 0;
                                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                                    qVar.n = androidx.media3.common.i0.p(str);
                                    qVar.F = iS2;
                                    qVar.G = iO3;
                                    if (str.equals("audio/raw") && iD != 0) {
                                        qVar.H = iD;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        vVar.k(bArr, 0, iS4);
                                        qVar.q = h0.s(bArr);
                                    }
                                    gVar = new g(new r(qVar));
                                } else {
                                    j.x("Ignoring track with unsupported format tag ", iS, "StreamFormatChunk");
                                }
                            } else {
                                androidx.media3.common.util.b.t("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(i0.H(iB)));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            vVar.N(i2);
                            int iO4 = vVar.o();
                            int iO5 = vVar.o();
                            vVar.N(i2);
                            int iO6 = vVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                                qVar2.u = iO4;
                                qVar2.v = iO5;
                                qVar2.n = androidx.media3.common.i0.p(str2);
                                gVar = new g(new r(qVar2));
                            } else {
                                j.x("Ignoring track with unsupported compression ", iO6, "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = vVar.o();
                        vVar.N(8);
                        int iO8 = vVar.o();
                        int iO9 = vVar.o();
                        vVar.N(i2);
                        vVar.o();
                        vVar.N(12);
                        gVar = new c(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = vVar.o();
                        vVar.N(12);
                        vVar.o();
                        int iO11 = vVar.o();
                        int iO12 = vVar.o();
                        vVar.N(i2);
                        int iO13 = vVar.o();
                        int iO14 = vVar.o();
                        vVar.N(i2);
                        dVar = new d(iO10, iO11, iO12, iO13, iO14, vVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(vVar.x(vVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = c(vVar.o(), vVar);
            }
            if (gVar != null) {
                if (gVar.a() == 1752331379) {
                    iB = ((d) gVar).b();
                }
                int i5 = i4 + 1;
                int iE = a0.e(objArrCopyOf.length, i5);
                if (iE > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                }
                objArrCopyOf[i4] = gVar;
                i4 = i5;
            }
            vVar.M(iO2);
            vVar.L(i3);
            i2 = 4;
        }
        return new f(i, h0.j(i4, objArrCopyOf));
    }

    @Override // androidx.media3.extractor.avi.a
    public final int a() {
        return this.b;
    }

    public final a b(Class cls) {
        e0 e0VarListIterator = this.a.listIterator(0);
        while (e0VarListIterator.hasNext()) {
            a aVar = (a) e0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
