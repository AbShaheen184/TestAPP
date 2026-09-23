package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Executor {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ b0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                ((Choreographer) this.y).postFrameCallback(new c0(0, runnable));
                break;
            case 1:
                ((androidx.media3.common.util.f0) this.y).d(runnable);
                break;
            default:
                ((Handler) this.y).post(runnable);
                break;
        }
    }
}
