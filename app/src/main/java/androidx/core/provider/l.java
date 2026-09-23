package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor {
    public final /* synthetic */ int e;
    public final Handler y;

    public l() {
        this.e = 2;
        this.y = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                runnable.getClass();
                Handler handler = this.y;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.y.post(runnable);
                return;
            default:
                this.y.post(runnable);
                return;
        }
    }

    public /* synthetic */ l(Handler handler, int i) {
        this.e = i;
        this.y = handler;
    }
}
