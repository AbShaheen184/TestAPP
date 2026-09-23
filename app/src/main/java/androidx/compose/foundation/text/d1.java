package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.p1;
import androidx.compose.foundation.gestures.s1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ CoroutineScope A;
    public final /* synthetic */ androidx.compose.runtime.a1 B;
    public final /* synthetic */ androidx.compose.foundation.interaction.k C;
    public int e;
    public /* synthetic */ p1 y;
    public /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(CoroutineScope coroutineScope, androidx.compose.runtime.a1 a1Var, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.A = coroutineScope;
        this.B = a1Var;
        this.C = kVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.geometry.b) obj2).a;
        androidx.compose.runtime.a1 a1Var = this.B;
        androidx.compose.foundation.interaction.k kVar = this.C;
        d1 d1Var = new d1(this.A, a1Var, kVar, (kotlin.coroutines.d) obj3);
        d1Var.y = (p1) obj;
        d1Var.z = j;
        return d1Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            p1 p1Var = this.y;
            BuildersKt__Builders_commonKt.launch$default(this.A, null, null, new androidx.compose.foundation.d(this.B, this.z, this.C, null, 3), 3, null);
            this.e = 1;
            obj = ((s1) p1Var).f(this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        BuildersKt__Builders_commonKt.launch$default(this.A, null, null, new androidx.compose.foundation.g(this.B, ((Boolean) obj).booleanValue(), this.C, (kotlin.coroutines.d) null), 3, null);
        return kotlin.y.a;
    }
}
