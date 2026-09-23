package androidx.work.impl.workers;

import androidx.media3.exoplayer.dash.manifest.t;
import androidx.work.w;
import androidx.work.x;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements p {
    public /* synthetic */ Object A;
    public final /* synthetic */ x B;
    public final /* synthetic */ t C;
    public final /* synthetic */ androidx.work.impl.model.p D;
    public ListenableFuture e;
    public Job y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x xVar, t tVar, androidx.work.impl.model.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = xVar;
        this.C = tVar;
        this.D = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        c cVar = new c(this.B, this.C, this.D, dVar);
        cVar.A = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        ListenableFuture listenableFuture;
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        boolean z;
        int i = this.z;
        x xVar = this.B;
        try {
            try {
                if (i == 0) {
                    kotlin.a.e(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.A;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    ListenableFuture listenableFutureStartWork = xVar.startWork();
                    listenableFutureStartWork.getClass();
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.f(this.C, this.D, atomicInteger2, listenableFutureStartWork, null, 9), 3, null);
                    try {
                        this.A = atomicInteger2;
                        this.e = listenableFutureStartWork;
                        this.y = jobLaunch$default;
                        this.z = 1;
                        Object objC = okhttp3.internal.platform.android.g.c(listenableFutureStartWork, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objC == aVar) {
                            return aVar;
                        }
                        listenableFuture = listenableFutureStartWork;
                        obj = objC;
                        atomicInteger = atomicInteger2;
                    } catch (CancellationException e) {
                        listenableFuture = listenableFutureStartWork;
                        cancellationException = e;
                        atomicInteger = atomicInteger2;
                        String str = g.a;
                        androidx.work.y.e().b(str, "Delegated worker " + xVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (listenableFuture.isCancelled() || !z) {
                            throw cancellationException;
                        }
                        throw new a(atomicInteger.get());
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jobLaunch$default = this.y;
                    listenableFuture = this.e;
                    atomicInteger = (AtomicInteger) this.A;
                    try {
                        kotlin.a.e(obj);
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        String str2 = g.a;
                        androidx.work.y.e().b(str2, "Delegated worker " + xVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (listenableFuture.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                }
                w wVar = (w) obj;
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                return wVar;
            } catch (Throwable th) {
                String str3 = g.a;
                androidx.work.y.e().b(str3, "Delegated worker " + xVar.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            throw th2;
        }
    }
}
