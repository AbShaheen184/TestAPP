package androidx.media3.exoplayer.source.chunk;

import androidx.media3.exoplayer.source.w0;
import androidx.media3.exoplayer.source.x0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements x0 {
    public boolean A;
    public final /* synthetic */ h B;
    public final h e;
    public final w0 y;
    public final int z;

    public g(h hVar, h hVar2, w0 w0Var, int i) {
        this.B = hVar;
        this.e = hVar2;
        this.y = w0Var;
        this.z = i;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        h hVar = this.B;
        return !hVar.z() && this.y.z(hVar.W);
    }

    public final void c() {
        if (this.A) {
            return;
        }
        h hVar = this.B;
        androidx.media3.exoplayer.drm.d dVar = hVar.D;
        int[] iArr = hVar.y;
        int i = this.z;
        dVar.b(iArr[i], hVar.z[i], 0, null, hVar.Q);
        this.A = true;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        h hVar = this.B;
        if (hVar.z()) {
            return -3;
        }
        a aVar = hVar.S;
        w0 w0Var = this.y;
        if (aVar != null && aVar.c(this.z + 1) <= w0Var.u()) {
            return -3;
        }
        c();
        return w0Var.E(bVar, eVar, i, hVar.W);
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        h hVar = this.B;
        if (hVar.z()) {
            return 0;
        }
        boolean z = hVar.W;
        w0 w0Var = this.y;
        int iW = w0Var.w(j, z);
        a aVar = hVar.S;
        if (aVar != null) {
            iW = Math.min(iW, aVar.c(this.z + 1) - w0Var.u());
        }
        w0Var.J(iW);
        if (iW > 0) {
            c();
        }
        return iW;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() {
    }
}
