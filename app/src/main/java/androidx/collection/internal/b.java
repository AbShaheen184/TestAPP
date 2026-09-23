package androidx.collection.internal;

import android.util.Log;
import androidx.lifecycle.viewmodel.d;
import androidx.lifecycle.viewmodel.f;
import androidx.media3.extractor.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.w;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.e;
import okhttp3.n;
import okhttp3.s;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public final LinkedHashMap e;

    public b(int i) {
        switch (i) {
            case 1:
                this.e = new LinkedHashMap();
                break;
            case 2:
                this.e = new LinkedHashMap();
                break;
            case 3:
                this.e = new LinkedHashMap();
                break;
            case 4:
                this.e = new LinkedHashMap();
                break;
            default:
                this.e = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    @Override // okhttp3.n
    public void a(s sVar, List list) {
        sVar.getClass();
        this.e.put(sVar.d, list);
    }

    @Override // okhttp3.n
    public List b(s sVar) {
        sVar.getClass();
        List list = (List) this.e.get(sVar.d);
        return list == null ? w.e : list;
    }

    public void c(j jVar) {
        long[] jArr = jVar.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.e;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    public void d(e eVar, l lVar) {
        lVar.getClass();
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap.containsKey(eVar)) {
            kotlinx.coroutines.future.a.f(eVar.b(), "A `initializer` with the same `clazz` has already been added: ", 46);
        } else {
            linkedHashMap.put(eVar, new f(eVar, lVar));
        }
    }

    public void e(androidx.room.migration.a aVar) {
        aVar.getClass();
        int i = aVar.a;
        int i2 = aVar.b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.e;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i2), aVar);
    }

    public d f() {
        Collection collectionValues = this.e.values();
        collectionValues.getClass();
        f[] fVarArr = (f[]) collectionValues.toArray(new f[0]);
        return new d((f[]) Arrays.copyOf(fVarArr, fVarArr.length), 0);
    }

    public j g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (j jVar : this.e.values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        _COROUTINE.a.m("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new j(iArr3, kotlin.math.a.j((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), kotlin.math.a.j((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), kotlin.math.a.j((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
