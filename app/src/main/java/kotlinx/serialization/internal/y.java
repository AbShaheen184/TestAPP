package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w {
    public final /* synthetic */ kotlinx.serialization.a a;

    public y(kotlinx.serialization.a aVar) {
        this.a = aVar;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        return new kotlinx.serialization.a[]{this.a};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        throw new IllegalStateException("unsupported");
    }
}
