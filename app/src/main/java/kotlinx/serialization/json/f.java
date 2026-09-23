package kotlinx.serialization.json;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlinx.serialization.a {
    public static final f a = new f();
    public static final e b = e.b;

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlin.comparisons.a.b(bVar);
        k kVar = k.a;
        return new d((List) new kotlinx.serialization.internal.c().i(bVar));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        kotlin.comparisons.a.a(nVar);
        k kVar = k.a;
        kotlinx.serialization.descriptors.g gVar = k.b;
        gVar.getClass();
        kotlinx.serialization.internal.b bVar = new kotlinx.serialization.internal.b(gVar);
        List list = dVar.e;
        int size = list.size();
        kotlinx.serialization.json.internal.n nVarA = nVar.a(bVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            nVarA.o(bVar, i, kVar, it.next());
        }
        nVarA.s(bVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
