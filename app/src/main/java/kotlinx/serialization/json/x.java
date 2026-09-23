package kotlinx.serialization.json;

import kotlin.collections.g0;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements kotlinx.serialization.a {
    public static final x a = new x();
    public static final kotlinx.serialization.descriptors.g b = g0.c("kotlinx.serialization.json.JsonPrimitive", kotlinx.serialization.descriptors.d.j, new kotlinx.serialization.descriptors.e[0]);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        i iVarK = kotlin.comparisons.a.b(bVar).K();
        if (iVarK instanceof w) {
            return (w) iVarK;
        }
        throw kotlinx.serialization.json.internal.i.b(-1, iVarK.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + a0.a(iVarK.getClass()));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        w wVar = (w) obj;
        wVar.getClass();
        kotlin.comparisons.a.a(nVar);
        if (wVar instanceof p) {
            nVar.p(q.a, p.INSTANCE);
        } else {
            nVar.p(n.a, (m) wVar);
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
