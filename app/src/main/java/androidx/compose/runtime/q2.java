package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(kotlin.jvm.functions.p pVar, a1 a1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = pVar;
        this.B = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                q2 q2Var = new q2(this.A, this.B, dVar, 0);
                q2Var.z = obj;
                return q2Var;
            default:
                q2 q2Var2 = new q2(this.A, this.B, dVar, 1);
                q2Var2.z = obj;
                return q2Var2;
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
        return ((q2) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    q1 q1Var = new q1(this.B, ((CoroutineScope) this.z).getCoroutineContext());
                    this.y = 1;
                    Object objInvoke = this.A.invoke(q1Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    q1 q1Var2 = new q1(this.B, ((CoroutineScope) this.z).getCoroutineContext());
                    this.y = 1;
                    Object objInvoke2 = this.A.invoke(q1Var2, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }
}
