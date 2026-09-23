package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public x(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public abstract ListenableFuture getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final i getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.A;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public androidx.work.impl.utils.taskexecutor.a getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.y;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.z;
    }

    public m0 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture setForegroundAsync(n nVar) {
        androidx.work.impl.utils.n nVar2 = this.mWorkerParams.k;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        androidx.room.y yVar = nVar2.a.a;
        androidx.compose.animation.core.l0 l0Var = new androidx.compose.animation.core.l0(nVar2, id, nVar, applicationContext, 4);
        yVar.getClass();
        return kotlin.math.a.s(new androidx.media3.exoplayer.source.a0(3, yVar, "setForegroundAsync", l0Var));
    }

    public ListenableFuture setProgressAsync(i iVar) {
        androidx.work.impl.utils.o oVar = this.mWorkerParams.j;
        getApplicationContext();
        UUID id = getId();
        androidx.room.y yVar = oVar.b.a;
        androidx.compose.foundation.gestures.g gVar = new androidx.compose.foundation.gestures.g(9, oVar, id, iVar);
        yVar.getClass();
        return kotlin.math.a.s(new androidx.media3.exoplayer.source.a0(3, yVar, "updateProgress", gVar));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
