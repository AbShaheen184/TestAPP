package okhttp3;

import androidx.collection.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable, kotlin.jvm.internal.markers.a {
    public static final r y = new r(new String[0]);
    public final String[] e;

    public r(String[] strArr) {
        strArr.getClass();
        this.e = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.e;
        strArr.getClass();
        int length = strArr.length - 2;
        int iD = dagger.hilt.android.internal.a.d(length, 0, -2);
        if (iD > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iD) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        String str = (String) kotlin.collections.o.v(i * 2, this.e);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final androidx.compose.ui.graphics.vector.g d() {
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(4);
        ArrayList arrayList = gVar.b;
        arrayList.getClass();
        String[] strArr = this.e;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return gVar;
    }

    public final TreeMap e() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Arrays.equals(this.e, ((r) obj).e);
        }
        return false;
    }

    public final String f(int i) {
        String str = (String) kotlin.collections.o.v((i * 2) + 1, this.e);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final List h(String str) {
        str.getClass();
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? kotlin.collections.w.e : listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        kotlin.k[] kVarArr = new kotlin.k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = new kotlin.k(c(i), f(i));
        }
        return new b1(kVarArr);
    }

    public final int size() {
        return this.e.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strF = f(i);
            sb.append(strC);
            sb.append(": ");
            if (okhttp3.internal.e.m(strC)) {
                strF = "██";
            }
            sb.append(strF);
            sb.append("\n");
        }
        return sb.toString();
    }
}
