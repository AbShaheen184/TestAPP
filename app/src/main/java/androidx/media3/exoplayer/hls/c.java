package androidx.media3.exoplayer.hls;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.source.j1;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.source.y0;
import androidx.media3.exoplayer.source.z0;
import androidx.media3.extractor.g0;
import androidx.media3.ui.p0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.w0;
import androidx.work.impl.WorkDatabase;
import com.app.mlounge.R;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s0;
import com.google.android.gms.measurement.internal.u0;
import java.io.EOFException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements y0, androidx.media3.extractor.text.d, p0, androidx.profileinstaller.b, w0, androidx.sqlite.b, com.google.android.gms.tasks.d, com.google.android.gms.common.internal.d, com.google.android.gms.common.internal.b, o4, com.google.android.gms.tasks.f {
    public static c z;
    public final /* synthetic */ int e;
    public Object y;

    public c(int i) {
        this.e = i;
        switch (i) {
            case 4:
                this.y = new v(10);
                break;
            case 15:
                break;
            case 24:
                this.y = new EnumMap(b2.class);
                break;
            case 29:
                this.y = new com.google.android.gms.tasks.s();
                break;
            default:
                this.y = new CopyOnWriteArrayList();
                break;
        }
    }

    public static void E(String str, coil3.util.h hVar, String str2, Throwable th) {
        if (str2 != null) {
            coil3.util.m.c(hVar, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            string.getClass();
            coil3.util.m.c(hVar, str, string);
        }
    }

    public static c y() {
        if (z == null) {
            z = new c(new androidx.emoji2.text.r("HmacSHA256", false), 14);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public String A(androidx.media3.common.r rVar) {
        String strQ;
        String string;
        Resources resources = (Resources) this.y;
        String str = rVar.o;
        int i = rVar.j;
        int i2 = rVar.G;
        int i3 = rVar.w;
        int i4 = rVar.v;
        String str2 = rVar.k;
        int i5 = i0.i(str);
        if (i5 == -1) {
            if (i0.j(str2) != null) {
                i5 = 2;
            } else if (i0.b(str2) != null) {
                i5 = 1;
            } else if (i4 != -1 || i3 != -1) {
                i5 = 2;
            } else if (i2 == -1 && rVar.H == -1) {
                i5 = -1;
            } else {
                i5 = 1;
            }
        }
        if (i5 == 2) {
            strQ = D(v(rVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            String strQ2 = q(rVar);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strQ = D(strQ2, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strQ = q(rVar);
        }
        if (!strQ.isEmpty()) {
            return strQ;
        }
        String str3 = rVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    public void B(int i, long j) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.y;
        if (i == 240) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            if (eVar.H == -1) {
                eVar.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            if (eVar.G == -1) {
                eVar.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw j0.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw j0.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case Token.DO /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    eVar.g(i);
                    eVar.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    eVar.g(i);
                    eVar.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    eVar.g(i);
                    eVar.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    eVar.g(i);
                    eVar.y.e = -1;
                    return;
                } else {
                    eVar.g(i);
                    eVar.y.e = 5;
                    return;
                }
            case Token.WITH /* 136 */:
                eVar.g(i);
                eVar.y.Y = j == 1;
                return;
            case Token.LOCAL_BLOCK /* 155 */:
                eVar.Q = eVar.m(j);
                return;
            case Token.XML /* 159 */:
                eVar.g(i);
                eVar.y.Q = (int) j;
                return;
            case Token.GENEXPR /* 176 */:
                eVar.g(i);
                eVar.y.n = (int) j;
                return;
            case Token.YIELD_STAR /* 179 */:
                if (eVar.z) {
                    return;
                }
                eVar.f(i);
                eVar.E = eVar.m(j);
                return;
            case Token.QUESTION_DOT /* 186 */:
                eVar.g(i);
                eVar.y.o = (int) j;
                return;
            case 215:
                eVar.g(i);
                eVar.y.d = (int) j;
                return;
            case 231:
                eVar.M = eVar.m(j);
                return;
            case 238:
                eVar.X = (int) j;
                return;
            case 247:
                if (eVar.z) {
                    return;
                }
                eVar.f(i);
                eVar.F = (int) j;
                return;
            case 251:
                eVar.Y = true;
                return;
            case 16871:
                eVar.g(i);
                eVar.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw j0.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw j0.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw j0.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw j0.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw j0.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                eVar.B = j + eVar.s;
                return;
            case 21432:
                int i3 = (int) j;
                eVar.g(i);
                if (i3 == 0) {
                    eVar.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    eVar.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    eVar.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    eVar.y.y = 3;
                    return;
                }
            case 21680:
                eVar.g(i);
                eVar.y.q = (int) j;
                return;
            case 21682:
                eVar.g(i);
                eVar.y.s = (int) j;
                return;
            case 21690:
                eVar.g(i);
                eVar.y.r = (int) j;
                return;
            case 21930:
                eVar.g(i);
                eVar.y.X = j == 1;
                return;
            case 21938:
                eVar.g(i);
                androidx.media3.extractor.mkv.d dVar = eVar.y;
                dVar.z = true;
                dVar.p = (int) j;
                return;
            case 21998:
                eVar.g(i);
                eVar.y.g = (int) j;
                return;
            case 22186:
                eVar.g(i);
                eVar.y.T = j;
                return;
            case 22203:
                eVar.g(i);
                eVar.y.U = j;
                return;
            case 25188:
                eVar.g(i);
                eVar.y.R = (int) j;
                return;
            case 30114:
                eVar.Z = j;
                return;
            case 30321:
                eVar.g(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    eVar.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    eVar.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    eVar.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    eVar.y.t = 3;
                    return;
                }
            case 2352003:
                eVar.g(i);
                eVar.y.f = (int) j;
                return;
            case 2807729:
                eVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        eVar.g(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            eVar.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            eVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        eVar.g(i);
                        int iG = androidx.media3.common.h.g((int) j);
                        if (iG != -1) {
                            eVar.y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.g(i);
                        eVar.y.z = true;
                        int iF = androidx.media3.common.h.f((int) j);
                        if (iF != -1) {
                            eVar.y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.g(i);
                        eVar.y.D = (int) j;
                        return;
                    case 21949:
                        eVar.g(i);
                        eVar.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int C(View view) {
        return view.getRight() + ((d0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).rightMargin;
    }

    public String D(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.y).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void F() {
        l lVar = (l) this.y;
        int i = lVar.O - 1;
        lVar.O = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (r rVar : lVar.Q) {
            rVar.b();
            i2 += rVar.f0.a;
        }
        androidx.media3.common.w0[] w0VarArr = new androidx.media3.common.w0[i2];
        int i3 = 0;
        for (r rVar2 : lVar.Q) {
            rVar2.b();
            int i4 = rVar2.f0.a;
            int i5 = 0;
            while (i5 < i4) {
                rVar2.b();
                w0VarArr[i3] = rVar2.f0.a(i5);
                i5++;
                i3++;
            }
        }
        lVar.P = new j1(w0VarArr);
        lVar.N.s(lVar);
    }

    public h0 G(androidx.media3.extractor.o oVar, t0 t0Var, int i) {
        int i2;
        v vVar = (v) this.y;
        h0 h0VarD0 = null;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = vVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    oVar.w(vVar.a, i6 - i7, i7);
                    vVar.M(i5);
                    vVar.L(i6);
                    if (vVar.a() < 3) {
                        t0.d(vVar.b, vVar.c);
                        return null;
                    }
                    int iC = vVar.C();
                    i2 = vVar.b - 3;
                    vVar.b = i2;
                    if (iC == 4801587) {
                        break;
                    }
                    if (androidx.media3.extractor.b.h(vVar.i()) == -1) {
                        if (i4 == 0) {
                            vVar.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    oVar.n();
                    oVar.g(i3);
                    return h0VarD0;
                } catch (EOFException unused) {
                }
            }
            vVar.N(6);
            int iY = vVar.y();
            int i8 = iY + 10;
            if (h0VarD0 == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(vVar.a, i2, bArr2, 0, 10);
                oVar.w(bArr2, 10, iY);
                h0VarD0 = new androidx.media3.extractor.metadata.id3.h(t0Var).d0(bArr2, i8);
            } else {
                oVar.g(iY);
            }
            i3 += i8;
        }
    }

    public void H(long j, long j2, int i) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.y;
        eVar.j0.getClass();
        if (i == 160) {
            eVar.Y = false;
            eVar.Z = 0L;
            return;
        }
        if (i == 174) {
            androidx.media3.extractor.mkv.d dVar = new androidx.media3.extractor.mkv.d();
            dVar.n = -1;
            dVar.o = -1;
            dVar.p = -1;
            dVar.q = -1;
            dVar.r = -1;
            dVar.s = 0;
            dVar.t = -1;
            dVar.u = 0.0f;
            dVar.v = 0.0f;
            dVar.w = 0.0f;
            dVar.x = null;
            dVar.y = -1;
            dVar.z = false;
            dVar.A = -1;
            dVar.B = -1;
            dVar.C = -1;
            dVar.D = 1000;
            dVar.E = Context.VERSION_ES6;
            dVar.F = -1.0f;
            dVar.G = -1.0f;
            dVar.H = -1.0f;
            dVar.I = -1.0f;
            dVar.J = -1.0f;
            dVar.K = -1.0f;
            dVar.L = -1.0f;
            dVar.M = -1.0f;
            dVar.N = -1.0f;
            dVar.O = -1.0f;
            dVar.Q = 1;
            dVar.R = -1;
            dVar.S = 8000;
            dVar.T = 0L;
            dVar.U = 0L;
            dVar.W = false;
            dVar.Y = true;
            dVar.Z = "eng";
            eVar.y = dVar;
            dVar.a = eVar.w;
            return;
        }
        if (i == 183) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            eVar.F = -1;
            eVar.G = -1L;
            eVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            eVar.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            eVar.A = -1;
            eVar.B = -1L;
            return;
        }
        if (i == 20533) {
            eVar.g(i);
            eVar.y.i = true;
            return;
        }
        if (i == 21968) {
            eVar.g(i);
            eVar.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = eVar.s;
            if (j3 != -1 && j3 != j) {
                throw j0.a(null, "Multiple Segment elements not supported");
            }
            eVar.s = j;
            eVar.r = j2;
            return;
        }
        if (i == 475249515) {
            if (eVar.z) {
                return;
            }
            eVar.D = true;
        } else if (i == 524531317 && !eVar.z) {
            if (eVar.d && eVar.K != -1) {
                eVar.J = true;
            } else {
                eVar.j0.h(new androidx.media3.extractor.s(eVar.v));
                eVar.z = true;
            }
        }
    }

    public void I(int i, String str) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.y;
        if (i == 134) {
            eVar.g(i);
            eVar.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                eVar.w = str.equals("webm");
                return;
            }
            throw j0.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            eVar.g(i);
            eVar.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            eVar.g(i);
            eVar.y.Z = str;
        }
    }

    public void J(int i, String str, List list, boolean z2, boolean z3) {
        s0 s0Var;
        i1 i1Var = (i1) this.y;
        int i2 = i - 1;
        if (i2 == 0) {
            u0 u0Var = ((p1) i1Var.e).C;
            p1.m(u0Var);
            s0Var = u0Var.J;
        } else if (i2 != 1) {
            if (i2 == 3) {
                u0 u0Var2 = ((p1) i1Var.e).C;
                p1.m(u0Var2);
                s0Var = u0Var2.K;
            } else if (i2 != 4) {
                u0 u0Var3 = ((p1) i1Var.e).C;
                p1.m(u0Var3);
                s0Var = u0Var3.I;
            } else if (z2) {
                u0 u0Var4 = ((p1) i1Var.e).C;
                p1.m(u0Var4);
                s0Var = u0Var4.G;
            } else if (z3) {
                u0 u0Var5 = ((p1) i1Var.e).C;
                p1.m(u0Var5);
                s0Var = u0Var5.F;
            } else {
                u0 u0Var6 = ((p1) i1Var.e).C;
                p1.m(u0Var6);
                s0Var = u0Var6.H;
            }
        } else if (z2) {
            u0 u0Var7 = ((p1) i1Var.e).C;
            p1.m(u0Var7);
            s0Var = u0Var7.D;
        } else if (z3) {
            u0 u0Var8 = ((p1) i1Var.e).C;
            p1.m(u0Var8);
            s0Var = u0Var8.C;
        } else {
            u0 u0Var9 = ((p1) i1Var.e).C;
            p1.m(u0Var9);
            s0Var = u0Var9.E;
        }
        int size = list.size();
        if (size == 1) {
            s0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            s0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            s0Var.a(str);
        } else {
            s0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void K(b2 b2Var, int i) {
        com.google.android.gms.measurement.internal.h hVar;
        if (i == -30) {
            hVar = com.google.android.gms.measurement.internal.h.TCF;
        } else if (i == -20) {
            hVar = com.google.android.gms.measurement.internal.h.API;
        } else if (i == -10) {
            hVar = com.google.android.gms.measurement.internal.h.MANIFEST;
        } else if (i != 0) {
            hVar = i != 30 ? com.google.android.gms.measurement.internal.h.UNSET : com.google.android.gms.measurement.internal.h.INITIALIZATION;
        } else {
            hVar = com.google.android.gms.measurement.internal.h.API;
        }
        ((EnumMap) this.y).put(b2Var, hVar);
    }

    public void L(b2 b2Var, com.google.android.gms.measurement.internal.h hVar) {
        ((EnumMap) this.y).put(b2Var, hVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public void a(int i) {
        ((com.google.android.gms.common.api.g) this.y).a(i);
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((com.google.android.gms.tasks.j) ((com.google.android.gms.tasks.q) this.y).e).a.n();
    }

    @Override // com.google.android.gms.common.internal.b
    public void c() {
        ((com.google.android.gms.common.api.g) this.y).c();
    }

    @Override // com.google.android.gms.common.internal.d
    public void d(com.google.android.gms.common.b bVar) {
        boolean z2 = bVar.y == 0;
        com.google.android.gms.common.internal.e eVar = (com.google.android.gms.common.internal.e) this.y;
        if (z2) {
            eVar.c(null, eVar.s());
            return;
        }
        com.google.android.gms.common.internal.c cVar = eVar.M;
        if (cVar != null) {
            cVar.h(bVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.o4
    public void e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        j4 j4Var = (j4) this.y;
        if (!zIsEmpty) {
            j4Var.e().E(new androidx.appcompat.view.menu.e(this, str, str2, bundle, 10));
            return;
        }
        p1 p1Var = j4Var.I;
        if (p1Var != null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.b(str2, "AppId not known when logging event");
        }
    }

    @Override // androidx.media3.extractor.text.d
    public int f(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.d
    public long g(int i) {
        _COROUTINE.a.o(i == 0);
        return 0L;
    }

    @Override // androidx.sqlite.b
    public androidx.sqlite.a h(String str) {
        str.getClass();
        androidx.sqlite.db.b bVar = (androidx.sqlite.db.b) this.y;
        String databaseName = bVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.r("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !kotlin.text.k.X('/', databaseName, databaseName).equals(kotlin.text.k.X('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + bVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new androidx.sqlite.driver.a(bVar.z());
    }

    @Override // androidx.profileinstaller.b
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.b
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.y).setResultCode(i);
    }

    @Override // androidx.media3.extractor.text.d
    public List k(long j) {
        return j >= 0 ? (List) this.y : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.d
    public int l() {
        return 1;
    }

    @Override // androidx.sqlite.b
    public boolean m() {
        return true;
    }

    @Override // androidx.recyclerview.widget.w0
    public int n(View view) {
        return (view.getLeft() - ((d0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).leftMargin;
    }

    public void o(String str) {
        ((SharedPreferences) this.y).edit().putString("apiKey", str).apply();
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        ((CountDownLatch) this.y).countDown();
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02a7  */
    public void p(int i, int i2, androidx.media3.extractor.o oVar) throws j0 {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.y;
        androidx.media3.extractor.mkv.f fVar = eVar.b;
        SparseArray sparseArray = eVar.c;
        v vVar = eVar.k;
        v vVar2 = eVar.i;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (eVar.O != 2) {
                    return;
                }
                androidx.media3.extractor.mkv.d dVar = (androidx.media3.extractor.mkv.d) sparseArray.get(eVar.U);
                int i16 = eVar.X;
                v vVar3 = eVar.p;
                if (i16 != 4 || !"V_VP9".equals(dVar.c)) {
                    oVar.o(i2);
                    return;
                } else {
                    vVar3.J(i2);
                    oVar.readFully(vVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                eVar.g(i);
                androidx.media3.extractor.mkv.d dVar2 = eVar.y;
                int i17 = dVar2.h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    oVar.o(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                dVar2.P = bArr;
                oVar.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                eVar.g(i);
                byte[] bArr2 = new byte[i2];
                eVar.y.j = bArr2;
                oVar.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                oVar.readFully(bArr3, 0, i2);
                eVar.g(i);
                eVar.y.k = new g0(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(vVar.a, (byte) 0);
                oVar.readFully(vVar.a, 4 - i2, i2);
                vVar.M(0);
                eVar.A = (int) vVar.B();
                return;
            }
            if (i == 25506) {
                eVar.g(i);
                byte[] bArr4 = new byte[i2];
                eVar.y.l = bArr4;
                oVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw j0.a(null, "Unexpected id: " + i);
            }
            eVar.g(i);
            byte[] bArr5 = new byte[i2];
            eVar.y.x = bArr5;
            oVar.readFully(bArr5, 0, i2);
            return;
        }
        if (eVar.O == 0) {
            eVar.U = (int) fVar.b(oVar, false, true, 8);
            eVar.V = fVar.c;
            eVar.Q = -9223372036854775807L;
            eVar.O = 1;
            vVar2.J(0);
        }
        androidx.media3.extractor.mkv.d dVar3 = (androidx.media3.extractor.mkv.d) sparseArray.get(eVar.U);
        if (dVar3 == null) {
            oVar.o(i2 - eVar.V);
            eVar.O = 0;
            return;
        }
        dVar3.a0.getClass();
        if (eVar.O == 1) {
            eVar.k(oVar, 3);
            int i18 = (vVar2.a[2] & 6) >> 1;
            byte b = 255;
            if (i18 == 0) {
                eVar.S = 1;
                int[] iArr2 = eVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                eVar.T = iArr2;
                iArr2[0] = (i2 - eVar.V) - 3;
            } else {
                eVar.k(oVar, 4);
                int i19 = (vVar2.a[3] & 255) + 1;
                eVar.S = i19;
                int[] iArr3 = eVar.T;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                } else if (iArr3.length < i19) {
                    iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                }
                eVar.T = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - eVar.V) - 4;
                    int i21 = eVar.S;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 == 1) {
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 4;
                        while (true) {
                            i9 = eVar.S - 1;
                            iArr = eVar.T;
                            if (i22 >= i9) {
                                break;
                            }
                            iArr[i22] = 0;
                            while (true) {
                                i10 = i24 + 1;
                                eVar.k(oVar, i10);
                                int i25 = vVar2.a[i24] & 255;
                                int[] iArr4 = eVar.T;
                                i11 = iArr4[i22] + i25;
                                iArr4[i22] = i11;
                                if (i25 != 255) {
                                    break;
                                } else {
                                    i24 = i10;
                                }
                            }
                            i23 += i11;
                            i22++;
                            i24 = i10;
                        }
                        iArr[i9] = ((i2 - eVar.V) - i24) - i23;
                    } else {
                        if (i18 != 3) {
                            throw j0.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 4;
                        while (true) {
                            int i29 = eVar.S - i15;
                            int[] iArr5 = eVar.T;
                            if (i26 >= i29) {
                                i3 = i13;
                                i4 = i14;
                                i5 = i15;
                                iArr5[i29] = ((i2 - eVar.V) - i28) - i27;
                                break;
                            }
                            iArr5[i26] = i14;
                            int i30 = i28 + 1;
                            eVar.k(oVar, i30);
                            if (vVar2.a[i28] == 0) {
                                throw j0.a(null, "No valid varint length mask found");
                            }
                            int i31 = i14;
                            while (true) {
                                if (i31 >= 8) {
                                    i6 = i13;
                                    i7 = i15;
                                    j = 0;
                                    i8 = i30;
                                    break;
                                }
                                int i32 = i15 << (7 - i31);
                                i6 = i13;
                                if ((vVar2.a[i28] & i32) != 0) {
                                    int i33 = i30 + i31;
                                    eVar.k(oVar, i33);
                                    i7 = i15;
                                    j = vVar2.a[i28] & b & (~i32);
                                    while (i30 < i33) {
                                        j = (j << 8) | ((long) (vVar2.a[i30] & b));
                                        i30++;
                                        i33 = i33;
                                        b = 255;
                                    }
                                    i8 = i33;
                                    if (i26 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i31 * 7) + 6)) - 1;
                                    break;
                                }
                                i31++;
                                i13 = i6;
                                b = 255;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw j0.a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = eVar.T;
                            if (i26 != 0) {
                                i34 += iArr6[i26 - 1];
                            }
                            iArr6[i26] = i34;
                            i27 += i34;
                            i26++;
                            i14 = i31;
                            i13 = i6;
                            i15 = i7;
                            i28 = i8;
                            b = 255;
                        }
                    }
                    byte[] bArr6 = vVar2.a;
                    eVar.P = eVar.m((bArr6[i5] & 255) | (bArr6[i4] << 8)) + eVar.M;
                    if (dVar3.e != i5 || (i == 163 && (vVar2.a[i3] & 128) == 128)) {
                        i12 = 1;
                    } else {
                        i12 = i4;
                    }
                    eVar.W = i12;
                    eVar.O = i3;
                    eVar.R = i4;
                }
            }
            i3 = 2;
            i4 = 0;
            i5 = 1;
            byte[] bArr7 = vVar2.a;
            eVar.P = eVar.m((bArr7[i5] & 255) | (bArr7[i4] << 8)) + eVar.M;
            if (dVar3.e != i5) {
                i12 = 1;
            } else {
                i12 = 1;
            }
            eVar.W = i12;
            eVar.O = i3;
            eVar.R = i4;
        }
        if (i == 163) {
            while (true) {
                int i35 = eVar.R;
                if (i35 >= eVar.S) {
                    eVar.O = 0;
                    return;
                }
                eVar.h(dVar3, ((long) ((eVar.R * dVar3.f) / 1000)) + eVar.P, eVar.W, eVar.n(oVar, dVar3, eVar.T[i35], false), 0);
                eVar.R++;
            }
        } else {
            while (true) {
                int i36 = eVar.R;
                if (i36 >= eVar.S) {
                    return;
                }
                int[] iArr7 = eVar.T;
                iArr7[i36] = eVar.n(oVar, dVar3, iArr7[i36], true);
                eVar.R++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String q(androidx.media3.common.r rVar) {
        String displayName;
        String str = rVar.d;
        String str2 = rVar.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = androidx.media3.common.util.i0.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = D(displayName, v(rVar));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    @Override // androidx.recyclerview.widget.w0
    public int r() {
        return ((c0) this.y).D();
    }

    @Override // androidx.recyclerview.widget.w0
    public int t() {
        c0 c0Var = (c0) this.y;
        return c0Var.m - c0Var.E();
    }

    public String toString() {
        switch (this.e) {
            case 24:
                StringBuilder sb = new StringBuilder("1");
                for (b2 b2Var : b2.values()) {
                    com.google.android.gms.measurement.internal.h hVar = (com.google.android.gms.measurement.internal.h) ((EnumMap) this.y).get(b2Var);
                    if (hVar == null) {
                        hVar = com.google.android.gms.measurement.internal.h.UNSET;
                    }
                    sb.append(hVar.e);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public void u(z0 z0Var) {
        l lVar = (l) this.y;
        lVar.N.u(lVar);
    }

    public String v(androidx.media3.common.r rVar) {
        Resources resources = (Resources) this.y;
        int i = rVar.f;
        int i2 = rVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = D(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = D(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? D(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public byte[] w(byte[] bArr, byte[] bArr2, int i) {
        androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.y;
        SecretKeySpec secretKeySpec = (bArr == null || bArr.length <= 0) ? null : new SecretKeySpec(bArr, rVar.e);
        if (i <= 0) {
            kotlinx.coroutines.future.a.q("out length bytes must be at least 1");
            return null;
        }
        if (secretKeySpec == null) {
            kotlinx.coroutines.future.a.q("provided pseudoRandomKey must not be null");
            return null;
        }
        try {
            Mac macC = rVar.c();
            macC.init(secretKeySpec);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArrDoFinal = new byte[0];
            int iCeil = (int) Math.ceil(((double) i) / ((double) macC.getMacLength()));
            if (iCeil > 255) {
                kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("out length must be maximal 255 * hash-length; requested: ", i, " bytes"));
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < iCeil) {
                macC.update(bArrDoFinal);
                macC.update(bArr2);
                i2++;
                macC.update((byte) i2);
                bArrDoFinal = macC.doFinal();
                int iMin = Math.min(i, bArrDoFinal.length);
                byteBufferAllocate.put(bArrDoFinal, 0, iMin);
                i -= iMin;
            }
            return byteBufferAllocate.array();
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public byte[] x(byte[] bArr, byte[] bArr2) {
        androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.y;
        String str = rVar.e;
        SecretKeySpec secretKeySpec = bArr.length <= 0 ? null : new SecretKeySpec(bArr, str);
        if (secretKeySpec == null) {
            int macLength = rVar.c().getMacLength();
            secretKeySpec = macLength > 0 ? new SecretKeySpec(new byte[macLength], str) : null;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            kotlinx.coroutines.future.a.q("provided inputKeyingMaterial must be at least of size 1 and not null");
            return null;
        }
        try {
            Mac macC = rVar.c();
            macC.init(secretKeySpec);
            return macC.doFinal(bArr2);
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public View z(int i) {
        return ((c0) this.y).t(i);
    }

    public /* synthetic */ c(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public c(android.content.Context context) {
        this.e = 19;
        this.y = context.getSharedPreferences("fg-storage", 0);
    }

    public c(c cVar, com.google.android.gms.tasks.q qVar) {
        this.e = 28;
        this.y = qVar;
        Objects.requireNonNull(cVar);
    }

    public c(com.google.android.gms.common.internal.e eVar) {
        this.e = 22;
        Objects.requireNonNull(eVar);
        this.y = eVar;
    }

    public c(EnumMap enumMap) {
        this.e = 24;
        EnumMap enumMap2 = new EnumMap(b2.class);
        this.y = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public c(WorkDatabase workDatabase) {
        this.e = 13;
        workDatabase.getClass();
        this.y = workDatabase;
    }

    public c(androidx.sqlite.db.b bVar) {
        this.e = 12;
        bVar.getClass();
        this.y = bVar;
    }

    public c(Resources resources) {
        this.e = 8;
        resources.getClass();
        this.y = resources;
    }

    public c(androidx.compose.runtime.saveable.d dVar) {
        this.e = 9;
        this.y = new WeakReference(dVar);
    }

    public c(androidx.compose.material.ripple.g gVar, com.google.android.gms.common.api.internal.f fVar) {
        this.e = 21;
        this.y = gVar;
    }
}
