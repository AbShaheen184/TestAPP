package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends kotlin.coroutines.intrinsics.h {
    public static String i(String str) {
        return kotlin.sequences.k.M(new kotlin.sequences.n(new u(str, 3), new com.app.mlounge.data.local.dao.l("    ", 6), 1), "\n");
    }

    public static String j(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        List listM = k.M(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (!k.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!kotlin.comparisons.a.h(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM.size();
        int size = listM.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            int i = length + 1;
            if (length < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && k.J(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested character count ", iIntValue, " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        kotlin.collections.p.H(arrayList3, sb, null, Token.IMPORT);
        return sb.toString();
    }

    public static String k(String str) {
        if (k.J("|")) {
            kotlinx.coroutines.future.a.q("marginPrefix must be non-blank string.");
            return null;
        }
        List listM = k.M(str);
        int length = str.length();
        listM.size();
        int size = listM.size() - 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = listM.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                kotlin.collections.p.H(arrayList, sb, null, Token.IMPORT);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != size) || !k.J(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!kotlin.comparisons.a.h(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && r.t(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
    }
}
