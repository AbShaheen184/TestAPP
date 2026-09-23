package androidx.compose.material3;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ j5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(j5 j5Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = j5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b3(this.z, dVar, 0);
            case 1:
                return new b3(this.z, dVar, 1);
            case 2:
                return new b3(this.z, dVar, 2);
            case 3:
                return new b3(this.z, dVar, 3);
            case 4:
                return new b3(this.z, dVar, 4);
            case 5:
                return new b3(this.z, dVar, 5);
            case 6:
                return new b3(this.z, dVar, 6);
            default:
                return new b3(this.z, dVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((b3) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objE = this.z.e(this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objE == aVar) {
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
                    this.y = 1;
                    Object objC = this.z.c(this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objC == aVar2) {
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
            case 2:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objF = this.z.f(this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 3:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objC2 = this.z.c(this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objC2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 4:
                int i5 = this.y;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objB = this.z.b(this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 5:
                int i6 = this.y;
                if (i6 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objF2 = this.z.f(this);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objF2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 6:
                int i7 = this.y;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objB2 = this.z.b(this);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objB2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i8 = this.y;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objE2 = this.z.e(this);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objE2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i8 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }
}
