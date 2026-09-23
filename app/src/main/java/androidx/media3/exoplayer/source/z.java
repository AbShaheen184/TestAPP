package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements androidx.media3.common.util.h {
    public final /* synthetic */ IOException A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d e;
    public final /* synthetic */ n y;
    public final /* synthetic */ s z;

    public /* synthetic */ z(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, IOException iOException, boolean z) {
        this.e = dVar;
        this.y = nVar;
        this.z = sVar;
        this.A = iOException;
        this.B = z;
    }

    @Override // androidx.media3.common.util.h
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        androidx.media3.exoplayer.drm.d dVar = this.e;
        c0Var.C(dVar.a, dVar.b, this.y, this.z, this.A, this.B);
    }
}
