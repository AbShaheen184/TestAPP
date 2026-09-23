package androidx.compose.ui.semantics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static final Comparator[] a;
    public static final l b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new c0(new c0(i == 0 ? h.z : h.y));
            i++;
        }
        a = comparatorArr;
        b = l.T;
    }

    public static final void a(s sVar, ArrayList arrayList, androidx.compose.animation.e eVar, androidx.compose.animation.e eVar2, androidx.collection.z zVar) {
        n nVar = sVar.d;
        Object objG = nVar.e.g(w.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) eVar2.invoke(sVar)).booleanValue()) && ((Boolean) eVar.invoke(sVar)).booleanValue()) {
            arrayList.add(sVar);
        }
        if (zBooleanValue) {
            zVar.h(sVar.g, b(sVar, eVar, eVar2, s.j(7, sVar)));
            return;
        }
        List listJ = s.j(7, sVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((s) listJ.get(i), arrayList, eVar, eVar2, zVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(s sVar, androidx.compose.animation.e eVar, androidx.compose.animation.e eVar2, List list) {
        int i;
        androidx.collection.z zVar = androidx.collection.o.a;
        androidx.collection.z zVar2 = new androidx.collection.z();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((s) list.get(i2), arrayList, eVar, eVar2, zVar2);
        }
        int i3 = 1;
        char c = sVar.c.X == androidx.compose.ui.unit.m.y ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                s sVar2 = (s) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new kotlin.k(sVar2.h(), kotlin.collections.q.l(sVar2)));
                    break;
                }
                float f = sVar2.h().b;
                float f2 = sVar2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) ((kotlin.k) arrayList2.get(i6)).e;
                        i = i3;
                        float f3 = cVar.b;
                        float f4 = cVar.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new kotlin.k(new androidx.compose.ui.geometry.c(Math.max(cVar.a, 0.0f), Math.max(cVar.b, f), Math.min(cVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((kotlin.k) arrayList2.get(i6)).y));
                            ((List) ((kotlin.k) arrayList2.get(i6)).y).add(sVar2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new kotlin.k(sVar2.h(), kotlin.collections.q.l(sVar2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        kotlin.collections.t.s(h.A, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            kotlin.k kVar = (kotlin.k) arrayList2.get(i8);
            kotlin.collections.t.s(comparator, (List) kVar.y);
            arrayList3.addAll((Collection) kVar.y);
        }
        kotlin.collections.t.s(new b0(b, 0), arrayList3);
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) zVar2.b(((s) arrayList3.get(size5)).g);
            if (list2 != null) {
                if (((Boolean) eVar2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
