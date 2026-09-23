package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends e0 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlinx.serialization.descriptors.e eVar) {
        super(eVar);
        eVar.getClass();
        this.b = eVar.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.b;
    }
}
