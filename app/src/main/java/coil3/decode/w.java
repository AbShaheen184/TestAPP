package coil3.decode;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ kotlin.jvm.internal.v b;

    public w(x xVar, kotlin.jvm.internal.v vVar) {
        this.a = xVar;
        this.b = vVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        coil3.request.n nVar = this.a.c;
        coil3.size.h hVar = nVar.b;
        coil3.size.g gVar = nVar.c;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar = coil3.request.h.b;
        long jH = com.google.firebase.b.h(width, height, hVar, gVar, (coil3.size.h) coil3.l.e(nVar, eVar));
        int i = (int) (jH >> 32);
        int i2 = (int) (jH & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            coil3.request.n nVar2 = this.a.c;
            double dI = com.google.firebase.b.i(width, height, i, i2, nVar2.c, (coil3.size.h) coil3.l.e(nVar2, eVar));
            boolean z = dI < 1.0d;
            this.b.e = z;
            if (z || this.a.c.d == coil3.size.d.e) {
                imageDecoder.setTargetSize(kotlin.math.a.G(((double) width) * dI), kotlin.math.a.G(dI * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new t());
        coil3.request.n nVar3 = this.a.c;
        imageDecoder.setAllocator(com.google.android.gms.common.wrappers.a.d(coil3.request.i.a(nVar3)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) coil3.l.e(nVar3, coil3.request.i.g)).booleanValue() ? 1 : 0);
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar2 = coil3.request.i.c;
        if (androidx.transition.k.g(coil3.l.e(nVar3, eVar2)) != null) {
            imageDecoder.setTargetColorSpace(androidx.transition.k.g(coil3.l.e(nVar3, eVar2)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) coil3.l.e(nVar3, coil3.request.i.d)).booleanValue());
    }
}
