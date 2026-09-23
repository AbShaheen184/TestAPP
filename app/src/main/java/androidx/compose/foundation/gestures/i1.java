package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Channel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Channel channel, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        i1 i1Var = new i1(this.z, dVar);
        i1Var.y = obj;
        return i1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        int i = this.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, null, new h1(2, 0, null), 3, null);
                Channel channel = this.z;
                this.y = jobLaunch$default;
                this.e = 1;
                obj = channel.receive(this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jobLaunch$default = (Job) this.y;
                kotlin.a.e(obj);
            }
            g1 g1Var = (g1) obj;
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            return g1Var;
        } catch (Throwable th) {
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }
}
