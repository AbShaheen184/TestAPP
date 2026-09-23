package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ s1 A;
    public final /* synthetic */ androidx.compose.ui.input.pointer.v B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ kotlin.jvm.functions.q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(kotlin.jvm.functions.q qVar, s1 s1Var, androidx.compose.ui.input.pointer.v vVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = qVar;
        this.A = s1Var;
        this.B = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new y2(this.z, this.A, this.B, dVar, 0);
            default:
                return new y2(this.z, this.A, this.B, dVar, 1);
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
        return ((y2) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b(this.B.c);
                    this.y = 1;
                    Object objInvoke = this.z.invoke(this.A, bVar, this);
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
                    androidx.compose.ui.geometry.b bVar2 = new androidx.compose.ui.geometry.b(this.B.c);
                    this.y = 1;
                    Object objInvoke2 = this.z.invoke(this.A, bVar2, this);
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
