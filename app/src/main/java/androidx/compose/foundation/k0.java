package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ l0 A;
    public int e;
    public /* synthetic */ androidx.compose.foundation.gestures.p1 y;
    public /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.A = l0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.geometry.b) obj2).a;
        k0 k0Var = new k0(this.A, (kotlin.coroutines.d) obj3);
        k0Var.y = (androidx.compose.foundation.gestures.p1) obj;
        k0Var.z = j;
        return k0Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objCoroutineScope;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        if (i == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.gestures.p1 p1Var = this.y;
            long j = this.z;
            l0 l0Var = this.A;
            if (l0Var.S) {
                this.e = 1;
                androidx.compose.foundation.interaction.k kVar = l0Var.N;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (kVar == null || (objCoroutineScope = CoroutineScopeKt.coroutineScope(new e(p1Var, j, kVar, l0Var, null), this)) != aVar) {
                    objCoroutineScope = yVar;
                }
                if (objCoroutineScope == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return yVar;
    }
}
