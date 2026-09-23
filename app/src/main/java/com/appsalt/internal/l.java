package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ t0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(t0 t0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l(this.z, dVar, 0);
            default:
                return new l(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return new l(this.z, dVar, 0).invokeSuspend(kotlin.y.a);
            default:
                return new l(this.z, dVar, 1).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                t0 t0Var = this.z;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                obj = t0.d(t0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((o1) obj) == o1.e) {
                    c cVar = t0Var.g;
                    this.y = 2;
                    if (cVar.invoke(this) == aVar) {
                        return aVar;
                    }
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                t0 t0Var2 = this.z;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i2 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                obj = t0.d(t0Var2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (((o1) obj) == o1.e) {
                    c cVar2 = t0Var2.g;
                    this.y = 2;
                    if (cVar2.invoke(this) == aVar2) {
                        return aVar2;
                    }
                }
                return kotlin.y.a;
        }
    }
}
