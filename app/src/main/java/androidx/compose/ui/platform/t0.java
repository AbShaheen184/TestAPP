package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Choreographer.FrameCallback {
    public final /* synthetic */ CancellableContinuationImpl e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public t0(CancellableContinuationImpl cancellableContinuationImpl, androidx.compose.runtime.e eVar, kotlin.jvm.functions.l lVar) {
        this.e = cancellableContinuationImpl;
        this.y = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object lVar;
        try {
            lVar = this.y.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        this.e.resumeWith(lVar);
    }
}
