package kotlin.enums;

import com.google.android.gms.measurement.internal.a0;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.y;
import kotlin.jvm.internal.l;
import kotlin.r;
import kotlin.t;
import kotlin.text.k;
import okhttp3.s;
import okio.b0;
import okio.f;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final c a(Enum[] enumArr) {
        enumArr.getClass();
        return new c(enumArr);
    }

    public static final boolean b(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static String c(s sVar) {
        sVar.getClass();
        i iVar = i.A;
        return a0.g(sVar.i).e("MD5").g();
    }

    public static final boolean d(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static int e(b0 b0Var) throws IOException {
        try {
            f fVar = b0Var.y;
            b0Var.R(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!b0Var.request(j2)) {
                    break;
                }
                byte bY = fVar.Y(j);
                if ((bY >= 48 && bY <= 57) || (j == 0 && bY == 45)) {
                    j = j2;
                }
                if (j != 0) {
                    break;
                }
                kotlin.comparisons.a.c(16);
                String string = Integer.toString(bY, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jE0 = fVar.e0();
            String strT = b0Var.t(Long.MAX_VALUE);
            if (jE0 >= 0 && jE0 <= 2147483647L && strT.length() <= 0) {
                return (int) jE0;
            }
            throw new IOException("expected an int but was \"" + jE0 + strT + '\"');
        } catch (NumberFormatException e) {
            kotlinx.coroutines.future.a.w(e.getMessage());
            return 0;
        }
    }

    public static final r f(String str) {
        int i;
        kotlin.comparisons.a.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (l.b(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new r(i2);
    }

    public static final t g(String str) {
        int i;
        str.getClass();
        int i2 = 10;
        kotlin.comparisons.a.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i3 = 1;
        if (l.b(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i2);
            if (iDigit < 0) {
                return null;
            }
            int i4 = length;
            long j4 = j2 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j4, j3 ^ Long.MIN_VALUE) <= 0) {
                j = j;
            } else {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                if (j < 0) {
                    j3 = Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j5 = (Long.MAX_VALUE / j) << i3;
                    j3 = j5 + ((long) ((((-1) - (j5 * j)) ^ Long.MIN_VALUE) >= (j ^ Long.MIN_VALUE) ? i3 : 0));
                }
                if (Long.compare(j4, j3 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j6 = j2 * j;
            long j7 = (((long) iDigit) & 4294967295L) + j6;
            if (Long.compare(j7 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j2 = j7;
            length = i4;
            j = j;
            i2 = 10;
            i3 = 1;
        }
        return new t(j2);
    }

    public static Set h(okhttp3.r rVar) {
        int size = rVar.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(rVar.c(i))) {
                String strF = rVar.f(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = k.V(strF, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(k.g0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? y.e : treeSet;
    }
}
