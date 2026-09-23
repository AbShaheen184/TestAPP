package kotlinx.serialization.json;

import java.util.Map;
import kotlinx.serialization.internal.d0;
import kotlinx.serialization.internal.y0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kotlinx.serialization.a {
    public static final u a = new u();
    public static final t b = t.b;

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlin.comparisons.a.b(bVar);
        y0 y0Var = y0.a;
        return new s((Map) new d0(k.a).i(bVar));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        s sVar = (s) obj;
        sVar.getClass();
        kotlin.comparisons.a.a(nVar);
        y0 y0Var = y0.a;
        new d0(k.a).b(nVar, sVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
