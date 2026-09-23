package kotlin.text;

import androidx.compose.animation.core.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends r {
    public static boolean A(CharSequence charSequence, char c) {
        charSequence.getClass();
        return G(charSequence, c, 0, 2) >= 0;
    }

    public static boolean C(CharSequence charSequence, String str) {
        return charSequence instanceof String ? r.n((String) charSequence, str, false) : O(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean D(String str, char c) {
        return str.length() > 0 && kotlin.comparisons.a.e(str.charAt(str.length() - 1), c, false);
    }

    public static final int E(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? F(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int F(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.b bVar;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            bVar = new kotlin.ranges.b(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            bVar = new kotlin.ranges.d(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = bVar.z;
        int i4 = bVar.y;
        int i5 = bVar.e;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (O(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (r.q(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? I(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return E(charSequence, str, i, z);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.o.A(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (kotlin.comparisons.a.e(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean J(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!kotlin.comparisons.a.h(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int K(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.o.A(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (kotlin.comparisons.a.e(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int L(String str, int i, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static List M(CharSequence charSequence) {
        charSequence.getClass();
        e eVar = new e(charSequence);
        if (!eVar.hasNext()) {
            return w.e;
        }
        Object next = eVar.next();
        if (!eVar.hasNext()) {
            return kotlin.collections.q.j(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (eVar.hasNext()) {
            arrayList.add(eVar.next());
        }
        return arrayList;
    }

    public static String N(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean O(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!kotlin.comparisons.a.e(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String P(String str, String str2) {
        str.getClass();
        return r.u(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String Q(String str, String str2) {
        return C(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String R(String str) {
        return (str.length() >= 2 && r.u(str, "\"", false) && C(str, "\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static final void S(int i) {
        if (i >= 0) {
            return;
        }
        kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Limit must be non-negative, but was "));
    }

    public static final List T(int i, CharSequence charSequence, String str) {
        S(i);
        int iE = E(charSequence, str, 0, false);
        if (iE == -1 || i == 1) {
            return kotlin.collections.q.j(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iE).toString());
            length = str.length() + iE;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iE = E(charSequence, str, length, false);
        } while (iE != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List U(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return T(i2, charSequence, str);
            }
        }
        S(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        kotlin.collections.n nVar = new kotlin.collections.n(new c(charSequence, i2, new com.app.mlounge.ui.screens.services.k(listAsList, 2, (byte) 0)), 2);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            kotlin.ranges.d dVar = (kotlin.ranges.d) bVar.next();
            dVar.getClass();
            arrayList.add(charSequence.subSequence(dVar.e, dVar.y + 1).toString());
        }
    }

    public static List V(String str, char[] cArr) {
        if (cArr.length == 1) {
            return T(0, str, String.valueOf(cArr[0]));
        }
        S(0);
        kotlin.collections.n nVar = new kotlin.collections.n(new c(str, 0, new g0(cArr, 29)), 2);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            kotlin.ranges.d dVar = (kotlin.ranges.d) bVar.next();
            dVar.getClass();
            arrayList.add(str.subSequence(dVar.e, dVar.y + 1).toString());
        }
    }

    public static String W(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iH = H(str, str2, 0, false, 6);
        return iH == -1 ? str3 : str.substring(str2.length() + iH, str.length());
    }

    public static String X(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iK = K(str, c, 0, 6);
        return iK == -1 ? str2 : str.substring(iK + 1, str.length());
    }

    public static String Y(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iL = L(str, 6, str2);
        return iL == -1 ? str3 : str.substring(str2.length() + iL, str.length());
    }

    public static String a0(String str, char c) {
        str.getClass();
        str.getClass();
        int iG = G(str, c, 0, 6);
        return iG == -1 ? str : str.substring(0, iG);
    }

    public static String b0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iH = H(str, str2, 0, false, 6);
        return iH == -1 ? str : str.substring(0, iH);
    }

    public static String c0(String str, char c) {
        int iK = K(str, c, 0, 6);
        return iK == -1 ? str : str.substring(0, iK);
    }

    public static String d0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iL = L(str, 6, str2);
        return iL == -1 ? str : str.substring(0, iL);
    }

    public static String e0(int i, String str) {
        str.getClass();
        if (i < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String f0(int i, String str) {
        str.getClass();
        if (i < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static CharSequence g0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zH = kotlin.comparisons.a.h(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zH) {
                    break;
                }
                length--;
            } else if (zH) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String h0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!kotlin.collections.o.a(str.charAt(length), cArr)) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence i0(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.comparisons.a.h(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static String j0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.collections.o.a(str.charAt(i), cArr)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static ArrayList y(int i, String str) {
        str.getClass();
        i0.a(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            CharSequence charSequenceSubSequence = str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i2 = i3;
        }
        return arrayList;
    }

    public static boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (H(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (F(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }
}
