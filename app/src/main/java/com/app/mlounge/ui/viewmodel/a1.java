package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ b1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = b1Var;
        this.A = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a1(this.z, this.A, dVar, 0);
            case 1:
                return new a1(this.z, this.A, dVar, 1);
            case 2:
                return new a1(this.z, this.A, dVar, 2);
            case 3:
                return new a1(this.z, this.A, dVar, 3);
            default:
                return new a1(this.z, this.A, dVar, 4);
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
        }
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objE = b1.e(this.z, this.A, this);
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
                    Object objE2 = b1.e(this.z, this.A, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objE2 == aVar2) {
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
                    Object objE3 = b1.e(this.z, this.A, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objE3 == aVar3) {
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
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i4 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                if (DelayKt.delay(500L, this) == aVar4) {
                    return aVar4;
                }
                this.y = 2;
                if (b1.e(this.z, this.A, this) == aVar4) {
                    return aVar4;
                }
                return kotlin.y.a;
            default:
                int i5 = this.y;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objE4 = b1.e(this.z, this.A, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objE4 == aVar5) {
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
        }
    }
}
