package androidx.media3.exoplayer.util;

import com.google.common.util.concurrent.g0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int e;
    public final /* synthetic */ Executor y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(Executor executor, Object obj, int i) {
        this.e = i;
        this.y = executor;
        this.z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                this.y.execute(runnable);
                break;
            default:
                try {
                    this.y.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((g0) this.z).m(e);
                    return;
                }
                break;
        }
    }
}
