package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.foundation.interaction.m A;
    public final /* synthetic */ int e = 1;
    public int y;
    public final /* synthetic */ androidx.compose.foundation.interaction.k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.m mVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = kVar;
        this.A = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(this.A, this.z, dVar);
            default:
                return new f(this.z, this.A, dVar);
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
        return ((f) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.n nVar = new androidx.compose.foundation.interaction.n(this.A);
                    this.y = 1;
                    Object objB = this.z.b(nVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar) {
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
                    this.y = 1;
                    Object objB2 = this.z.b(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objB2 == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.compose.foundation.interaction.m mVar, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = mVar;
        this.z = kVar;
    }
}
