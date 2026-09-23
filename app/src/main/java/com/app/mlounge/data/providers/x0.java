package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements okhttp3.n {
    private final Map<String, List<okhttp3.m>> store = new LinkedHashMap();

    @Override // okhttp3.n
    public final void a(okhttp3.s sVar, List list) {
        sVar.getClass();
        String str = sVar.d;
        Map<String, List<okhttp3.m>> map = this.store;
        List<okhttp3.m> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.addAll(list);
    }

    @Override // okhttp3.n
    public final List b(okhttp3.s sVar) {
        sVar.getClass();
        List<okhttp3.m> list = this.store.get(sVar.d);
        return list != null ? list : kotlin.collections.w.e;
    }
}
