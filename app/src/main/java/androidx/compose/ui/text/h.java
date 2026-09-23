package androidx.compose.ui.text;

import androidx.compose.material3.t3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final g a = new g("");

    public static final List a(g gVar, int i, int i2, t3 t3Var) {
        List list;
        if (i == i2 || (list = gVar.e) == null) {
            return null;
        }
        if (i != 0 || i2 < gVar.y.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = (e) list.get(i3);
                if ((t3Var != null ? ((Boolean) t3Var.invoke(eVar.a)).booleanValue() : true) && b(i, i2, eVar.b, eVar.c)) {
                    arrayList.add(new e(kotlin.collections.i0.d(eVar.b, i, i2) - i, eVar.d, (b) eVar.a, kotlin.collections.i0.d(eVar.c, i, i2) - i));
                }
            }
            return arrayList;
        }
        if (t3Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) t3Var.invoke(((e) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
