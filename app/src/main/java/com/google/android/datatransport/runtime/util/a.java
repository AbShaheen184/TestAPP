package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.d;
import com.google.firebase.platforminfo.b;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(d.e, 0);
        map.put(d.y, 1);
        map.put(d.z, 2);
        for (d dVar : map.keySet()) {
            a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        b.k(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i) {
        d dVar = (d) a.get(i);
        if (dVar != null) {
            return dVar;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Unknown Priority for value "));
        return null;
    }
}
