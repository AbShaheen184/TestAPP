package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ long A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ k2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(k2 k2Var, long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = k2Var;
        this.A = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new i2(this.z, this.A, dVar, 0);
            case 1:
                return new i2(this.z, this.A, dVar, 1);
            default:
                i2 i2Var = new i2(this.z, dVar);
                i2Var.A = ((androidx.compose.ui.geometry.b) obj).a;
                return i2Var;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((i2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((i2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                long j = ((androidx.compose.ui.geometry.b) obj).a;
                i2 i2Var = new i2(this.z, (kotlin.coroutines.d) obj2);
                i2Var.A = j;
                return i2Var.invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    r2 r2Var = this.z.k0;
                    h2 h2Var = new h2(this.A, null, 0);
                    this.y = 1;
                    Object objF = r2Var.f(androidx.compose.foundation.j1.y, h2Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar) {
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
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    r2 r2Var2 = this.z.k0;
                    long j = this.A;
                    this.y = 1;
                    Object objB = r2Var2.b(j, true, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar2) {
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
            default:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                long j2 = this.A;
                r2 r2Var3 = this.z.k0;
                this.y = 1;
                Object objA = c2.a(r2Var3, j2, this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                return objA == aVar3 ? aVar3 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.z = k2Var;
    }
}
