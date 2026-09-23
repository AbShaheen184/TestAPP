package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends x {
    public final WorkerParameters a;
    public final f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = workerParameters;
        this.b = f.e;
    }

    public abstract Object a(g gVar);

    @Override // androidx.work.x
    public final ListenableFuture getForegroundInfoAsync() {
        return s.a(this.b.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), new g(this, null, 0));
    }

    @Override // androidx.work.x
    public final ListenableFuture startWork() {
        f fVar = f.e;
        kotlin.coroutines.j jVar = this.b;
        if (kotlin.jvm.internal.l.a(jVar, fVar)) {
            jVar = this.a.g;
        }
        jVar.getClass();
        return s.a(jVar.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), new g(this, null, 1));
    }
}
