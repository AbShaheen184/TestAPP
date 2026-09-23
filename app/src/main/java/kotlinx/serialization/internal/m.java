package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlinx.serialization.a {
    public static final m a = new m();
    public static final s0 b = new s0("kotlin.Char", kotlinx.serialization.descriptors.d.d);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        return Character.valueOf(bVar.e());
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        nVar.d(((Character) obj).charValue());
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
