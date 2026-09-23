package androidx.compose.ui.text.input;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Runnable y;

    public /* synthetic */ c0(int i, Runnable runnable) {
        this.e = i;
        this.y = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.e) {
            case 0:
                this.y.run();
                break;
            default:
                this.y.run();
                break;
        }
    }
}
