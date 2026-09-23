package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements kotlinx.serialization.a {
    public static final h1 a = new h1();
    public static final x b = m0.a("kotlin.ULong", h0.a);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        return new kotlin.t(bVar.u(b).o());
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        nVar.h(b).k(((kotlin.t) obj).e);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
