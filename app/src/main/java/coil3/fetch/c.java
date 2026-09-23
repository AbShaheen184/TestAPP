package coil3.fetch;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {
    public final Bitmap a;

    public c(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) {
        return new j(new coil3.a(this.a), false, coil3.decode.h.y);
    }
}
