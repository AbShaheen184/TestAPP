package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.core.c1;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.navigation.compose.r;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.j;
import androidx.work.impl.constraints.trackers.i;
import androidx.work.impl.model.p;
import androidx.work.u;
import androidx.work.w;
import androidx.work.x;
import androidx.work.y;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.c = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(ConstraintTrackingWorker constraintTrackingWorker, x xVar, t tVar, p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        constraintTrackingWorker.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.z = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(constraintTrackingWorker, cVar);
            }
        } else {
            bVar = new b(constraintTrackingWorker, cVar);
        }
        Object objCoroutineScope = bVar.e;
        int i2 = bVar.z;
        if (i2 == 0) {
            kotlin.a.e(objCoroutineScope);
            c cVar2 = new c(xVar, tVar, pVar, null);
            bVar.z = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(cVar2, bVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCoroutineScope == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objCoroutineScope);
        }
        objCoroutineScope.getClass();
        return objCoroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.work.m0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.WorkerParameters] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.work.x] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final Object c(ConstraintTrackingWorker constraintTrackingWorker, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int stopReason;
        ?? r2 = constraintTrackingWorker.c;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.A = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(constraintTrackingWorker, cVar);
            }
        } else {
            dVar = new d(constraintTrackingWorker, cVar);
        }
        d dVar2 = dVar;
        Object objWithContext = dVar2.y;
        int i2 = dVar2.A;
        try {
            if (i2 == 0) {
                kotlin.a.e(objWithContext);
                String strA = constraintTrackingWorker.getInputData().a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strA == null || strA.length() == 0) {
                    y.e().c(g.a, "No worker to delegate to.");
                    return new androidx.work.t();
                }
                androidx.work.impl.t tVarB = androidx.work.impl.t.b(constraintTrackingWorker.getApplicationContext());
                androidx.work.impl.model.t tVarW = tVarB.c.w();
                String string = constraintTrackingWorker.getId().toString();
                string.getClass();
                p pVarC = tVarW.c(string);
                if (pVarC == null) {
                    return new androidx.work.t();
                }
                i iVar = tVarB.j;
                iVar.getClass();
                t tVar = new t(iVar);
                ArrayList arrayList = (ArrayList) tVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((androidx.work.impl.constraints.controllers.d) obj).c(pVarC)) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    y.e().a(j.a, "Work " + pVarC.a + " constrained by " + kotlin.collections.p.I(arrayList2, null, null, null, new r(10), 31));
                }
                if (!arrayList2.isEmpty()) {
                    String str = g.a;
                    y.e().a(str, "Constraints not met for delegate " + strA + ". Requesting retry.");
                    return new u();
                }
                y.e().a(g.a, "Constraints met for delegate ".concat(strA));
                try {
                    ?? workerFactory = constraintTrackingWorker.getWorkerFactory();
                    Context applicationContext = constraintTrackingWorker.getApplicationContext();
                    applicationContext.getClass();
                    x xVarA = workerFactory.a(applicationContext, strA, r2);
                    androidx.work.impl.utils.taskexecutor.b bVar = r2.h.d;
                    bVar.getClass();
                    try {
                        CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(bVar);
                        x xVar = xVarA;
                        androidx.compose.animation.core.f fVar = new androidx.compose.animation.core.f(constraintTrackingWorker, xVar, tVar, pVarC, null, 10);
                        dVar2.e = xVar;
                        dVar2.A = 1;
                        objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, fVar, dVar2);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        r2 = xVar;
                        if (objWithContext == aVar) {
                            return aVar;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        r2 = xVarA;
                        if (constraintTrackingWorker.isStopped() || (e instanceof a)) {
                            if (Build.VERSION.SDK_INT < 31) {
                                stopReason = -512;
                            } else if (constraintTrackingWorker.isStopped()) {
                                stopReason = constraintTrackingWorker.getStopReason();
                            } else {
                                if (!(e instanceof a)) {
                                    kotlinx.coroutines.future.a.u("Unreachable");
                                    return null;
                                }
                                stopReason = ((a) e).e;
                            }
                            r2.stop(stopReason);
                        }
                        if (e instanceof a) {
                            return new u();
                        }
                        throw e;
                    }
                } catch (Throwable unused) {
                    y.e().a(g.a, "No worker to delegate to.");
                    tVarB.b.getClass();
                    return new androidx.work.t();
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x xVar2 = dVar2.e;
                kotlin.a.e(objWithContext);
                r2 = xVar2;
            }
            return (w) objWithContext;
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(androidx.work.g gVar) {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new c1(this, null, 20), gVar);
    }
}
