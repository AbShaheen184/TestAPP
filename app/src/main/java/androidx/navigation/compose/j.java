package androidx.navigation.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.navigation.u {
    public final i f;
    public final androidx.compose.runtime.internal.f g;

    public j(i iVar, String str, androidx.compose.runtime.internal.f fVar) {
        super(iVar, str);
        this.f = iVar;
        this.g = fVar;
    }

    @Override // androidx.navigation.u
    public final androidx.navigation.t a() {
        return (h) super.a();
    }

    @Override // androidx.navigation.u
    public final androidx.navigation.t b() {
        return new h(this.f, this.g);
    }
}
