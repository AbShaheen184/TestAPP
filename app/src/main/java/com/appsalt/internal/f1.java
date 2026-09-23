package com.appsalt.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final long d;
    public final List a;
    public String b;
    public androidx.work.impl.k c;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        d = dagger.hilt.android.internal.a.h(3, kotlin.time.c.MINUTES);
    }

    public f1(List list) {
        this.a = list;
        kotlin.random.a aVar = kotlin.random.d.e;
        this.b = (String) kotlin.collections.p.P(list);
    }

    public final void a(ArrayList arrayList) {
        long jB = kotlin.time.e.b();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("wss://" + kotlin.text.k.g0((String) it.next()).toString());
        }
        this.c = new androidx.work.impl.k(14, new kotlin.time.f(jB), arrayList2);
    }
}
