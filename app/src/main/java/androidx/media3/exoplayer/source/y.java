package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements androidx.media3.common.util.h {
    public final /* synthetic */ s A;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d y;
    public final /* synthetic */ n z;

    public /* synthetic */ y(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, int i) {
        this.e = i;
        this.y = dVar;
        this.z = nVar;
        this.A = sVar;
    }

    @Override // androidx.media3.common.util.h
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.drm.d dVar = this.y;
                c0Var.j(dVar.a, dVar.b, this.z, this.A);
                break;
            default:
                androidx.media3.exoplayer.drm.d dVar2 = this.y;
                c0Var.F(dVar2.a, dVar2.b, this.z, this.A);
                break;
        }
    }
}
