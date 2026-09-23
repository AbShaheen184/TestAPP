package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f0(this.z, dVar, 0);
            default:
                return new f0(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a0Var;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 1;
                Object objA = h0.a(this.z, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objA == aVar ? aVar : objA;
            default:
                int i2 = this.y;
                h0 h0Var = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        CompletableJob completableJob = h0Var.n;
                        f0 f0Var = new f0(h0Var, null, 0);
                        this.y = 1;
                        obj = BuildersKt.withContext(completableJob, f0Var, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    a0Var = (d0) obj;
                    break;
                } catch (w e) {
                    a0Var = new c0(e.e);
                } catch (CancellationException unused) {
                    a0Var = new a0();
                } catch (Throwable th) {
                    androidx.work.y.e().d(i0.a, "Unexpected error in WorkerWrapper", th);
                    a0Var = new a0();
                }
                Object objO = h0Var.i.o(new androidx.navigation.internal.h(new e0(0, a0Var, h0Var), 2));
                objO.getClass();
                return objO;
        }
    }
}
