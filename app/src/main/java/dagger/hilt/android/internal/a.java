package dagger.hilt.android.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.widget.x;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i0;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.time.c;
import kotlin.time.d;
import okhttp3.g;
import okhttp3.internal.e;
import okhttp3.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : i0.e(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        kotlin.time.a.y.getClass();
        int i = kotlin.time.b.a;
        return j2;
    }

    public static Application c(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        com.google.firebase.platforminfo.b.k(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static final int d(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                kotlinx.coroutines.future.a.q("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static x e(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zU = r.u(str, "HTTP/1.", false);
        z zVar = z.HTTP_1_0;
        z zVar2 = z.HTTP_1_1;
        if (zU) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                zVar = zVar2;
            }
        } else if (r.u(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!r.u(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            zVar = zVar2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numW = r.w(str.substring(i, i2));
        if (numW == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numW.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new x(iIntValue, strSubstring, zVar, 15);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x006a A[EDGE_INSN: B:109:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    public static g f(okhttp3.r rVar) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        okhttp3.r rVar2 = rVar;
        rVar2.getClass();
        int size = rVar2.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iP = -1;
        int iP2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iP3 = -1;
        int iP4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strC = rVar2.c(i3);
            String strF = rVar2.f(i3);
            if (strC.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strF;
                }
                i = 0;
                while (i < strF.length()) {
                    length = strF.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strF.length();
                            break;
                        }
                        i2 = size;
                        if (k.A("=,;", strF.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = k.g0(strF.substring(i, length2)).toString();
                    if (length2 != strF.length() || strF.charAt(length2) == ',' || strF.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = e.a;
                        int length4 = strF.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strF.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strF.length();
                                break;
                            }
                        }
                        if (length3 >= strF.length() || strF.charAt(length3) != '\"') {
                            int length5 = strF.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strF.length();
                                    break;
                                }
                                int i4 = length5;
                                if (k.A(",;", strF.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = k.g0(strF.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iG = k.G(strF, '\"', i6, 4);
                            string2 = strF.substring(i6, iG);
                            i = iG + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iP = e.p(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iP2 = e.p(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iP3 = e.p(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iP4 = e.p(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                rVar2 = rVar;
                size = size;
            } else {
                if (strC.equalsIgnoreCase("Pragma")) {
                }
                i3++;
                rVar2 = rVar;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strF.length()) {
                length = strF.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strF.length();
                        break;
                    }
                    i2 = size;
                    if (k.A("=,;", strF.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = k.g0(strF.substring(i, length2)).toString();
                if (length2 != strF.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iP = e.p(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iP2 = e.p(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iP3 = e.p(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iP4 = e.p(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            rVar2 = rVar;
            size = size;
        }
        return new g(z2, z3, iP, iP2, z4, z5, z6, iP3, iP4, z7, z8, z9, !z ? null : str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0170  */
    /* JADX WARN: Code duplicated, block: B:103:0x017c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0197 A[LOOP:7: B:108:0x0195->B:109:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0223  */
    /* JADX WARN: Code duplicated, block: B:140:0x0227  */
    /* JADX WARN: Code duplicated, block: B:142:0x022b  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0231  */
    /* JADX WARN: Code duplicated, block: B:146:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x0237  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024e  */
    /* JADX WARN: Code duplicated, block: B:158:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x025d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0270  */
    /* JADX WARN: Code duplicated, block: B:187:0x0214 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0190 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x015a A[LOOP:5: B:97:0x0158->B:98:0x015a, LOOP_END] */
    public static long g(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        char cCharAt;
        c cVar;
        int i7;
        char cCharAt2;
        c cVar2;
        long jA;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jI;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        if (str.length() == 0) {
            kotlinx.coroutines.future.a.q("The string is empty");
            return 0L;
        }
        char cCharAt7 = str.charAt(0);
        char c = '-';
        char c2 = '+';
        if (cCharAt7 != '+') {
            i2 = cCharAt7 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            kotlinx.coroutines.future.a.q("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            kotlinx.coroutines.future.a.q("");
            return 0L;
        }
        int i17 = i2 + 1;
        if (i17 == str.length()) {
            kotlinx.coroutines.future.a.q("");
            return 0L;
        }
        boolean z = false;
        c cVar3 = null;
        long jB = 0;
        long j2 = 0;
        while (i17 < str.length()) {
            char cCharAt8 = str.charAt(i17);
            if (cCharAt8 != 'T') {
                d dVar = d.e;
                if (dVar.b) {
                    char cCharAt9 = str.charAt(i17);
                    if (cCharAt9 == c2) {
                        i3 = i17 + 1;
                        i4 = 1;
                    } else if (cCharAt9 != c) {
                        i3 = i17;
                        i4 = 1;
                    } else {
                        i3 = i17 + 1;
                        i4 = -1;
                    }
                } else {
                    i3 = i17;
                    i4 = 1;
                }
                while (i3 < str.length() && str.charAt(i3) == '0') {
                    i3++;
                }
                long j3 = 0;
                while (true) {
                    if (i3 < str.length()) {
                        char cCharAt10 = str.charAt(i3);
                        i5 = i17;
                        if ('0' <= cCharAt10 && cCharAt10 < ':') {
                            int i18 = cCharAt10 - '0';
                            i6 = i;
                            long j4 = dVar.c;
                            if (j3 > j4 || (j3 == j4 && i18 > dVar.d)) {
                                while (i3 < str.length() && '0' <= (cCharAt6 = str.charAt(i3)) && cCharAt6 < ':') {
                                    i3++;
                                }
                                if (i3 != str.length()) {
                                    if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? 1 : 0)) {
                                        j = dVar.a;
                                        cCharAt = str.charAt(i3);
                                        cVar = c.SECONDS;
                                        i7 = i6;
                                        if (cCharAt == '.') {
                                            i8 = i3 + 1;
                                            iMin = Math.min(i3 + 7, str.length());
                                            i10 = 0;
                                            for (i9 = i8; i9 < iMin; i9++) {
                                                cCharAt5 = str.charAt(i9);
                                                if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                                    for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                                        i10 = (i10 << 1) + (i10 << 3);
                                                    }
                                                    iMin2 = Math.min(i9 + 9, str.length());
                                                    i12 = i9;
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i12 < iMin2) {
                                                            i16 = iMin2;
                                                            cCharAt4 = str.charAt(i12);
                                                            i14 = i12;
                                                            if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                                i12 = i14 + 1;
                                                                iMin2 = i16;
                                                            }
                                                        } else {
                                                            i14 = i12;
                                                        }
                                                    }
                                                    for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                                        i13 = (i13 << 1) + (i13 << 3);
                                                    }
                                                    i3 = i14;
                                                    while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                                        i3++;
                                                    }
                                                    if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                        kotlinx.coroutines.future.a.q("");
                                                        return 0L;
                                                    }
                                                    long j5 = (((long) 1000000000) * ((long) i10)) + ((long) i13);
                                                    long j6 = i4;
                                                    double d2 = j5;
                                                    switch (cVar.ordinal()) {
                                                        case 0:
                                                            d = 1.0E-15d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 1:
                                                            d = 1.0E-12d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 2:
                                                            d = 1.0E-9d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 3:
                                                            d = 1.0E-6d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 4:
                                                            d = 6.0E-5d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 5:
                                                            d = 0.0036d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        case 6:
                                                            d = 0.0864d;
                                                            jI = kotlin.math.a.I(d2 * d);
                                                            break;
                                                        default:
                                                            com.google.firebase.platforminfo.b.q(cVar, "Unknown unit: ");
                                                            jI = 0;
                                                            break;
                                                    }
                                                    j2 = jI * j6;
                                                } else {
                                                    i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                                }
                                            }
                                            while (i11 < 6 - (i9 - i8)) {
                                                i10 = (i10 << 1) + (i10 << 3);
                                            }
                                            iMin2 = Math.min(i9 + 9, str.length());
                                            i12 = i9;
                                            i13 = 0;
                                            while (true) {
                                                if (i12 < iMin2) {
                                                    i16 = iMin2;
                                                    cCharAt4 = str.charAt(i12);
                                                    i14 = i12;
                                                    if ('0' > cCharAt4) {
                                                    }
                                                } else {
                                                    i14 = i12;
                                                }
                                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                i12 = i14 + 1;
                                                iMin2 = i16;
                                            }
                                            while (i15 < 9 - (i14 - i9)) {
                                                i13 = (i13 << 1) + (i13 << 3);
                                            }
                                            i3 = i14;
                                            while (i3 < str.length()) {
                                                i3++;
                                            }
                                            if (i3 != i8) {
                                            }
                                            kotlinx.coroutines.future.a.q("");
                                            return 0L;
                                        }
                                        cCharAt2 = str.charAt(i3);
                                        cVar2 = c.DAYS;
                                        if (cCharAt2 != 'D') {
                                            cVar = cVar2;
                                        } else if (cCharAt2 != 'H') {
                                            cVar = c.HOURS;
                                        } else if (cCharAt2 != 'M') {
                                            cVar = c.MINUTES;
                                        } else if (cCharAt2 != 'S') {
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                        }
                                        if (cVar3 == null && cVar3.compareTo(cVar) <= 0) {
                                            kotlinx.coroutines.future.a.q("Unexpected order of duration components");
                                            return 0L;
                                        }
                                        if (cVar == cVar2) {
                                            if (!z) {
                                                kotlinx.coroutines.future.a.q("");
                                                return 0L;
                                            }
                                            jB = b.b(j, cVar) * ((long) i4);
                                        } else {
                                            if (z) {
                                                kotlinx.coroutines.future.a.q("");
                                                return 0L;
                                            }
                                            jA = a(jB, b.b(j, cVar) * ((long) i4));
                                            if (jA != 9223372036854759646L) {
                                                kotlinx.coroutines.future.a.q("");
                                                return 0L;
                                            }
                                            jB = jA;
                                        }
                                        i17 = i3 + 1;
                                        cVar3 = cVar;
                                        i = i7;
                                        c = '-';
                                        c2 = '+';
                                    }
                                }
                                kotlinx.coroutines.future.a.q("");
                                return 0L;
                            }
                            j3 = (j3 << 3) + (j3 << 1) + ((long) i18);
                            i3++;
                            i = i6;
                            i17 = i5;
                        }
                    } else {
                        i5 = i17;
                    }
                    i6 = i;
                    if (i3 != str.length()) {
                        if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? 1 : 0)) {
                            j = j3;
                            cCharAt = str.charAt(i3);
                            cVar = c.SECONDS;
                            i7 = i6;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    kotlinx.coroutines.future.a.q("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                kotlinx.coroutines.future.a.q("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            cVar2 = c.DAYS;
                            if (cCharAt2 != 'D') {
                                cVar = cVar2;
                            } else if (cCharAt2 != 'H') {
                                cVar = c.HOURS;
                            } else if (cCharAt2 != 'M') {
                                cVar = c.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                cVar = null;
                            }
                            if (cVar != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (cVar3 == null) {
                            }
                            if (cVar == cVar2) {
                                if (!z) {
                                    kotlinx.coroutines.future.a.q("");
                                    return 0L;
                                }
                                jB = b.b(j, cVar) * ((long) i4);
                            } else {
                                if (z) {
                                    kotlinx.coroutines.future.a.q("");
                                    return 0L;
                                }
                                jA = a(jB, b.b(j, cVar) * ((long) i4));
                                if (jA != 9223372036854759646L) {
                                    kotlinx.coroutines.future.a.q("");
                                    return 0L;
                                }
                                jB = jA;
                            }
                            i17 = i3 + 1;
                            cVar3 = cVar;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                    }
                    kotlinx.coroutines.future.a.q("");
                    return 0L;
                }
            }
            if (z || (i17 = i17 + 1) == str.length()) {
                kotlinx.coroutines.future.a.q("");
                return 0L;
            }
            z = true;
        }
        int i19 = i;
        long jI2 = kotlin.time.a.i(i(jB, c.MILLISECONDS), i(j2, c.NANOSECONDS));
        return (i19 == 0 || jI2 == kotlin.time.a.B) ? jI2 : kotlin.time.a.l(jI2);
    }

    public static final long h(int i, c cVar) {
        if (cVar.compareTo(c.SECONDS) > 0) {
            return i(i, cVar);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, cVar.e);
        kotlin.time.g gVar = kotlin.time.a.y;
        long j = jConvert << 1;
        int i2 = kotlin.time.b.a;
        return j;
    }

    public static final long i(long j, c cVar) {
        TimeUnit timeUnit = cVar.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            kotlin.time.g gVar = kotlin.time.a.y;
            long j2 = jConvert2 << 1;
            int i = kotlin.time.b.a;
            return j2;
        }
        if (cVar.compareTo(c.MILLISECONDS) < 0) {
            return b(i0.e(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return b(b.b(Math.abs(j), cVar) * jSignum);
    }
}
