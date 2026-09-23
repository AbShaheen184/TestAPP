package kotlin.collections;

import androidx.compose.runtime.s2;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends t {
    public static Object A(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return B((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        androidx.transition.k.m("Collection is empty.");
        return null;
    }

    public static Object B(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object C(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object D(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object E(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int F(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                q.o();
                throw null;
            }
            if (kotlin.jvm.internal.l.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void G(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, kotlin.jvm.functions.l lVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            kotlin.coroutines.intrinsics.h.b(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void H(List list, StringBuilder sb, s2 s2Var, int i) {
        if ((i & 64) != 0) {
            s2Var = null;
        }
        G(list, sb, "\n", "", "", "...", s2Var);
    }

    public static String I(Iterable iterable, CharSequence charSequence, String str, String str2, kotlin.jvm.functions.l lVar, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            lVar = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        G(iterable, sb, charSequence2, str3, str4, "...", lVar);
        return sb.toString();
    }

    public static Object J(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object K(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable L(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList M(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.l.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList N(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList O(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static Object P(List list) {
        kotlin.random.a aVar = kotlin.random.d.e;
        if (list.isEmpty()) {
            androidx.transition.k.m("Collection is empty.");
            return null;
        }
        return list.get(kotlin.random.d.e.g(list.size()));
    }

    public static Object Q(ArrayList arrayList) {
        kotlin.random.a aVar = kotlin.random.d.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(kotlin.random.d.e.g(arrayList.size()));
    }

    public static Object R(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object S(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object T(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List U(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return b0(iterable);
        }
        List listD0 = d0(iterable);
        Collections.reverse(listD0);
        return listD0;
    }

    public static List V(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listD0 = d0(iterable);
            t.r(listD0);
            return listD0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List W(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listD0 = d0(iterable);
            t.s(comparator, listD0);
            return listD0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List X(int i, List list) {
        list.getClass();
        if (i < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return w.e;
        }
        if (i >= list.size()) {
            return b0(list);
        }
        if (i == 1) {
            return q.j(A(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return q.m(arrayList);
    }

    public static byte[] Y(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void Z(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] a0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List b0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return q.m(d0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.e;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return q.j(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList c0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List d0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Z(iterable, arrayList);
        return arrayList;
    }

    public static Set e0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set f0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return g0.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(c0.j(collection.size()));
                Z(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Z(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : g0.k(linkedHashSet2.iterator().next());
            }
        }
        return y.e;
    }

    public static void t(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static u u(Iterable iterable) {
        iterable.getClass();
        return new u(iterable, 0);
    }

    public static double v(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static ArrayList w(int i, List list) {
        list.getClass();
        i0.a(i, i);
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itI = !it.hasNext() ? v.e : kotlin.collections.builders.c.I(new h0(i, i, it, null));
            while (itI.hasNext()) {
                arrayList.add((List) itI.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean x(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return F(iterable, obj) >= 0;
    }

    public static List y(int i, List list) {
        list.getClass();
        if (i < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return b0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return w.e;
        }
        if (size == 1) {
            return q.j(J(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList z(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
