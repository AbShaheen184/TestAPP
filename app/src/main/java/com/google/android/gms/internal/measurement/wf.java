package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf implements sd {
    public static final zg e = new zg(1);
    public static final ah y = new ah(1);

    public static bh b(Set set) {
        bh bhVar = new bh();
        bhVar.d = y;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kg kgVar = (kg) it.next();
            e1.c(kgVar, "key");
            boolean z = kgVar.c;
            HashMap map = bhVar.b;
            HashMap map2 = bhVar.a;
            if (!z) {
                map.remove(kgVar);
                map2.put(kgVar, bh.e);
            } else {
                if (!z) {
                    kotlinx.coroutines.future.a.q("key must be repeating");
                    return null;
                }
                map2.remove(kgVar);
                map.put(kgVar, bh.f);
            }
        }
        return bhVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final InputStream d(rd rdVar) {
        be beVarA = rdVar.a.a(rdVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(beVarA);
        ArrayList arrayList2 = rdVar.c;
        if (!arrayList2.isEmpty()) {
            int i = pd.y;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.j.b(it);
            }
            pd pdVar = !arrayList3.isEmpty() ? new pd(beVarA, arrayList3) : null;
            if (pdVar != null) {
                arrayList.add(pdVar);
            }
        }
        Iterator it2 = rdVar.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            androidx.transition.k.h();
            return null;
        }
        throw null;
    }

    public static boolean e(byte b) {
        return b > -65;
    }
}
