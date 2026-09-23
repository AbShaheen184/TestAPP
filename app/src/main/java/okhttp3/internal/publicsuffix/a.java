package okhttp3.internal.publicsuffix;

import com.caverock.androidsvg.x1;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.b0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.u;
import kotlin.collections.w;
import kotlin.jvm.internal.l;
import kotlin.sequences.c;
import kotlin.sequences.d;
import kotlin.sequences.h;
import kotlin.text.k;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final i b = new i(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = q.j("*");
    public static final a d = new a(new x1(11));
    public final x1 a;

    public a(x1 x1Var) {
        this.a = x1Var;
    }

    public static List b(String str) {
        List listV = k.V(str, new char[]{'.'});
        if (!l.a(p.J(listV), "")) {
            return listV;
        }
        int size = listV.size() - 1;
        return p.X(size >= 0 ? size : 0, listV);
    }

    public final String a(String str) {
        String strB;
        String strB2;
        String strB3;
        List listV;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        x1 x1Var = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) x1Var.a;
        int i = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) x1Var.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        x1Var.b0();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        x1Var.e = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((i) x1Var.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(x1Var.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) x1Var.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        i[] iVarArr = new i[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            i iVar = i.A;
            iVarArr[i2] = a0.g((String) listB.get(i2));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strB = null;
                break;
            }
            i iVar2 = (i) x1Var.c;
            if (iVar2 == null) {
                l.f("bytes");
                throw null;
            }
            strB = b0.b(iVar2, iVarArr, i3);
            if (strB != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strB2 = null;
            break;
        }
        i[] iVarArr2 = (i[]) iVarArr.clone();
        int length = iVarArr2.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strB2 = null;
                break;
            }
            iVarArr2[i4] = b;
            i iVar3 = (i) x1Var.c;
            if (iVar3 == null) {
                l.f("bytes");
                throw null;
            }
            strB2 = b0.b(iVar3, iVarArr2, i4);
            if (strB2 != null) {
                break;
            }
            i4++;
        }
        if (strB2 == null) {
            strB3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strB3 = null;
                break;
            }
            i iVar4 = (i) x1Var.d;
            if (iVar4 == null) {
                l.f("exceptionBytes");
                throw null;
            }
            strB3 = b0.b(iVar4, iVarArr, i6);
            if (strB3 != null) {
                break;
            }
            i6++;
        }
        if (strB3 != null) {
            listV = k.V("!".concat(strB3), new char[]{'.'});
        } else if (strB == null && strB2 == null) {
            listV = c;
        } else {
            List listV2 = w.e;
            List listV3 = strB != null ? k.V(strB, new char[]{'.'}) : listV2;
            if (strB2 != null) {
                listV2 = k.V(strB2, new char[]{'.'});
            }
            listV = listV3.size() > listV2.size() ? listV3 : listV2;
        }
        if (listB.size() == listV.size() && ((String) listV.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listV.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listV.size();
        } else {
            size = listB.size();
            size2 = listV.size() + 1;
        }
        int i7 = size - size2;
        h uVar = new u(b(str), i);
        if (i7 < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested element count ", i7, " is less than zero."));
            return null;
        }
        if (i7 != 0) {
            uVar = uVar instanceof d ? ((d) uVar).a(i7) : new c(uVar, i7);
        }
        return kotlin.sequences.k.M(uVar, ".");
    }
}
