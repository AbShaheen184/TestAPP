package androidx.compose.animation.core;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ e2 B;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ h1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h1 h1Var, Object obj, e2 e2Var, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.z = h1Var;
        this.A = obj;
        this.B = e2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a1(this.B, this.z, this.A, dVar);
            default:
                return new a1(this.z, this.A, this.B, dVar);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
        }
        return ((a1) create(dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f;
        switch (this.e) {
            case 0:
                int i = this.y;
                e2 e2Var = this.B;
                if (i == 0) {
                    kotlin.a.e(obj);
                    z0 z0Var = new z0(this.z, this.A, e2Var, (kotlin.coroutines.d) null);
                    this.y = 1;
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(z0Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCoroutineScope == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                e2Var.i();
                return kotlin.y.a;
            default:
                int i2 = this.y;
                e2 e2Var2 = this.B;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    h1 h1Var = this.z;
                    h1Var.B();
                    androidx.compose.runtime.j1 j1Var = h1Var.y;
                    h1Var.I = Long.MIN_VALUE;
                    h1Var.F(0.0f);
                    Object value = h1Var.z.getValue();
                    Object obj2 = this.A;
                    if (obj2.equals(value)) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(j1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    e2Var2.p(obj2);
                    e2Var2.n(0L);
                    j1Var.setValue(obj2);
                    h1Var.F(0.0f);
                    h1Var.s(obj2);
                    e2Var2.j(f);
                    if (f == -3.0f) {
                        this.y = 1;
                        Object objZ = h1.z(h1Var, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objZ == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                e2Var2.i();
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e2 e2Var, h1 h1Var, Object obj, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.B = e2Var;
        this.z = h1Var;
        this.A = obj;
    }
}
