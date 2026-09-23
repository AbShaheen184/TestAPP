package androidx.compose.material3;

import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k6(androidx.room.coroutines.o oVar, androidx.room.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.e = 2;
        this.z = oVar;
        this.A = zVar;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new k6((l6) this.z, (androidx.compose.foundation.text.selection.u0) this.A, (androidx.compose.foundation.j1) this.B, dVar, 0);
            case 1:
                return new k6((androidx.compose.material3.internal.p) this.z, this.A, (kotlin.jvm.functions.r) this.B, dVar, 1);
            default:
                return new k6((androidx.room.coroutines.o) this.z, (androidx.room.z) this.A, (kotlin.coroutines.jvm.internal.i) this.B, dVar);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((k6) create(dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.foundation.j1 j1Var = (androidx.compose.foundation.j1) this.B;
                androidx.compose.foundation.text.selection.u0 u0Var = (androidx.compose.foundation.text.selection.u0) this.A;
                l6 l6Var = (l6) this.z;
                int i = this.y;
                androidx.compose.foundation.j1 j1Var2 = androidx.compose.foundation.j1.z;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        androidx.compose.animation.core.c1 c1Var = new androidx.compose.animation.core.c1(u0Var, null, 14);
                        this.y = 2;
                        Object objWithTimeout = TimeoutKt.withTimeout(1500L, c1Var, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objWithTimeout == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    if (j1Var != j1Var2) {
                        l6Var.a();
                    }
                    return kotlin.y.a;
                } catch (Throwable th) {
                    if (j1Var != j1Var2) {
                        l6Var.a();
                    }
                    throw th;
                }
            case 1:
                androidx.compose.material3.internal.p pVar = (androidx.compose.material3.internal.p) this.z;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    pVar.h(this.A);
                    androidx.compose.material3.internal.j jVar = new androidx.compose.material3.internal.j(pVar, 4);
                    androidx.compose.animation.b0 b0Var = new androidx.compose.animation.b0((kotlin.jvm.functions.r) this.B, pVar, (kotlin.coroutines.d) null, 18);
                    this.y = 1;
                    Object objE = androidx.compose.material3.internal.i.e(jVar, b0Var, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objE == aVar2) {
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
                androidx.room.coroutines.o oVar = (androidx.room.coroutines.o) this.z;
                androidx.room.z zVar = (androidx.room.z) this.A;
                ?? r2 = (kotlin.coroutines.jvm.internal.i) this.B;
                this.y = 1;
                Object objE2 = oVar.e(zVar, r2, this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                return objE2 == aVar3 ? aVar3 : objE2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
