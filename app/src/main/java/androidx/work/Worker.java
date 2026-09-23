package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public abstract w doWork();

    public n getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.x
    public ListenableFuture getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return kotlin.math.a.s(new androidx.media3.exoplayer.analytics.c(5, backgroundExecutor, new l0(this, 1)));
    }

    @Override // androidx.work.x
    public final ListenableFuture startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return kotlin.math.a.s(new androidx.media3.exoplayer.analytics.c(5, backgroundExecutor, new l0(this, 0)));
    }
}
