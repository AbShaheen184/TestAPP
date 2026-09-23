package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.y1 A;
    public final /* synthetic */ androidx.lifecycle.v B;
    public final /* synthetic */ a3 C;
    public final /* synthetic */ View D;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(kotlin.jvm.internal.z zVar, androidx.compose.runtime.y1 y1Var, androidx.lifecycle.v vVar, a3 a3Var, View view, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = zVar;
        this.A = y1Var;
        this.B = vVar;
        this.C = a3Var;
        this.D = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        z2 z2Var = new z2(this.z, this.A, this.B, this.C, this.D, dVar);
        z2Var.y = obj;
        return z2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Job jobLaunch$default;
        int i = this.e;
        a3 a3Var = this.C;
        androidx.lifecycle.v vVar = this.B;
        kotlin.y yVar = kotlin.y.a;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                try {
                    c2 c2Var = (c2) this.z.e;
                    if (c2Var != null) {
                        StateFlow stateFlowA = c3.a(this.D.getContext().getApplicationContext());
                        c2Var.e.h(((Number) stateFlowA.getValue()).floatValue());
                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(stateFlowA, c2Var, null, 20), 3, null);
                    } else {
                        jobLaunch$default = null;
                    }
                    androidx.compose.runtime.y1 y1Var = this.A;
                    this.y = jobLaunch$default;
                    this.e = 1;
                    Object objWithContext = BuildersKt.withContext(y1Var.a, new androidx.compose.animation.core.z0(y1Var, new androidx.compose.runtime.x1(y1Var, null), androidx.compose.runtime.t.o(getContext()), (kotlin.coroutines.d) null), this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objWithContext != aVar) {
                        objWithContext = yVar;
                    }
                    if (objWithContext != aVar) {
                        objWithContext = yVar;
                    }
                    if (objWithContext == aVar) {
                        return aVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jobLaunch$default = null;
                    if (jobLaunch$default != null) {
                        Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                    }
                    vVar.getLifecycle().b(a3Var);
                    throw th;
                }
            } else {
                if (i != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jobLaunch$default = (Job) this.y;
                kotlin.a.e(obj);
            }
            if (jobLaunch$default != null) {
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            }
            vVar.getLifecycle().b(a3Var);
            return yVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
