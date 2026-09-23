package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements j {
    public final Semaphore a;

    public u(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, coil3.request.n nVar) {
        ImageDecoder.Source sourceD;
        Bitmap.Config configA = coil3.request.i.a(nVar);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceD = androidx.compose.ui.platform.coreshims.b.D(kVar.a, nVar)) != null) {
            return new x(sourceD, kVar.a, nVar, this.a);
        }
        return null;
    }
}
