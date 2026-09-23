package coil3;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    public final /* synthetic */ androidx.media3.exoplayer.hls.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CoroutineExceptionHandler.Key key, androidx.media3.exoplayer.hls.c cVar) {
        super(key);
        this.e = cVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.j jVar, Throwable th) {
        androidx.media3.exoplayer.hls.c cVar = this.e;
        if (cVar != null) {
            coil3.util.h hVar = (coil3.util.h) cVar.y;
            coil3.util.h hVar2 = coil3.util.h.B;
            if (hVar.compareTo(hVar2) <= 0) {
                androidx.media3.exoplayer.hls.c.E("RealImageLoader", hVar2, null, th);
            }
        }
    }
}
