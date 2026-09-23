package androidx.work;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ CoroutineWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CoroutineWorker coroutineWorker, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g(this.z, dVar, 0);
            default:
                return new g(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                g gVar = (g) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                gVar.invokeSuspend(yVar);
                return yVar;
            default:
                return ((g) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    kotlinx.coroutines.future.a.u("Not implemented");
                } else {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 1;
                Object objA = this.z.a(this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objA == aVar ? aVar : objA;
        }
    }
}
