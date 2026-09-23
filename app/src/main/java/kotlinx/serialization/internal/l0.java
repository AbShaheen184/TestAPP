package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements kotlinx.serialization.a {
    public final Object a = kotlin.a.c(kotlin.i.e, new com.app.mlounge.ui.theme.f(this));

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVarD = d();
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVarD);
        int iS = aVarN.s(d());
        if (iS != -1) {
            throw new kotlinx.serialization.d(androidx.privacysandbox.ads.adservices.java.internal.a.n(iS, "Unexpected index "));
        }
        aVarN.h(eVarD);
        return kotlin.y.a;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        obj.getClass();
        nVar.a(d()).s(d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return (kotlinx.serialization.descriptors.e) this.a.getValue();
    }
}
