package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ g3 A;
    public final /* synthetic */ c B;
    public final /* synthetic */ long C;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, g3 g3Var, c cVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = jVar;
        this.A = g3Var;
        this.B = cVar;
        this.C = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        i iVar = new i(this.z, this.A, this.B, this.C, dVar);
        iVar.y = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.z;
        com.app.mlounge.data.music.e eVar = jVar.P;
        int i = this.e;
        try {
            try {
                if (i == 0) {
                    kotlin.a.e(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.y).getCoroutineContext());
                    jVar.S = true;
                    r2 r2Var = jVar.M;
                    androidx.compose.foundation.j1 j1Var = androidx.compose.foundation.j1.e;
                    h hVar = new h(this.A, jVar, this.B, this.C, job, null);
                    this.e = 1;
                    Object objF = r2Var.f(j1Var, hVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                eVar.A();
                jVar.S = false;
                eVar.h(null);
                jVar.Q = false;
                return kotlin.y.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            jVar.S = false;
            eVar.h(null);
            jVar.Q = false;
            throw th;
        }
    }
}
