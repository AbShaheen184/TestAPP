package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public e(c cVar) {
        cVar.getClass();
        LinkedHashMap linkedHashMap = cVar.a;
        linkedHashMap.getClass();
        this.a.putAll(linkedHashMap);
    }

    @Override // androidx.lifecycle.viewmodel.c
    public final Object a(b bVar) {
        return this.a.get(bVar);
    }

    public /* synthetic */ e(int i) {
        this(a.b);
    }
}
