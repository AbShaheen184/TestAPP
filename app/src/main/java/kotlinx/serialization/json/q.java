package kotlinx.serialization.json;

import kotlin.collections.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements kotlinx.serialization.a {
    public static final q a = new q();
    public static final kotlinx.serialization.descriptors.g b = g0.c("kotlinx.serialization.json.JsonNull", kotlinx.serialization.descriptors.h.c, new kotlinx.serialization.descriptors.e[0]);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlin.comparisons.a.b(bVar);
        if (bVar.r()) {
            throw new kotlinx.serialization.json.internal.g("Expected 'null' literal");
        }
        return p.INSTANCE;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        ((p) obj).getClass();
        kotlin.comparisons.a.a(nVar);
        nVar.m();
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
