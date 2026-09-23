package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements androidx.media3.common.util.h {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d e;
    public final /* synthetic */ n y;
    public final /* synthetic */ s z;

    public /* synthetic */ x(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, int i) {
        this.e = dVar;
        this.y = nVar;
        this.z = sVar;
        this.A = i;
    }

    @Override // androidx.media3.common.util.h
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        androidx.media3.exoplayer.drm.d dVar = this.e;
        c0Var.z(dVar.a, dVar.b, this.y, this.z, this.A);
    }
}
