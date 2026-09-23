package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.media3.decoder.f {
    public Bitmap B;
    public final /* synthetic */ b C;

    public a(b bVar) {
        this.C = bVar;
    }

    @Override // androidx.media3.decoder.f
    public final void o() {
        this.B = null;
        this.y = 0;
        this.z = 0L;
        this.A = false;
    }

    @Override // androidx.media3.decoder.f
    public final void p() {
        this.C.m(this);
    }
}
