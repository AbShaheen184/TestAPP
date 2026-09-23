package com.app.mlounge.ui.components;

import androidx.compose.runtime.a1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ androidx.compose.foundation.interaction.k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(androidx.compose.foundation.interaction.k kVar, a1 a1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = kVar;
        this.A = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new x(this.z, this.A, dVar, 0);
            case 1:
                return new x(this.z, this.A, dVar, 1);
            case 2:
                return new x(this.z, this.A, dVar, 2);
            case 3:
                return new x(this.z, this.A, dVar, 3);
            case 4:
                return new x(this.z, this.A, dVar, 4);
            case 5:
                return new x(this.z, this.A, dVar, 5);
            default:
                return new x(this.z, this.A, dVar, 6);
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
        }
        return ((x) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow = this.z.a;
                    w wVar = new w(this.A, 0);
                    this.y = 1;
                    Object objCollect = mutableSharedFlow.collect(wVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect == aVar) {
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
                    MutableSharedFlow mutableSharedFlow2 = this.z.a;
                    w wVar2 = new w(this.A, 1);
                    this.y = 1;
                    Object objCollect2 = mutableSharedFlow2.collect(wVar2, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect2 == aVar2) {
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
                    MutableSharedFlow mutableSharedFlow3 = this.z.a;
                    w wVar3 = new w(this.A, 2);
                    this.y = 1;
                    Object objCollect3 = mutableSharedFlow3.collect(wVar3, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect3 == aVar3) {
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
                    MutableSharedFlow mutableSharedFlow4 = this.z.a;
                    w wVar4 = new w(this.A, 3);
                    this.y = 1;
                    Object objCollect4 = mutableSharedFlow4.collect(wVar4, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect4 == aVar4) {
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
                    MutableSharedFlow mutableSharedFlow5 = this.z.a;
                    w wVar5 = new w(this.A, 4);
                    this.y = 1;
                    Object objCollect5 = mutableSharedFlow5.collect(wVar5, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect5 == aVar5) {
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
                    MutableSharedFlow mutableSharedFlow6 = this.z.a;
                    w wVar6 = new w(this.A, 5);
                    this.y = 1;
                    Object objCollect6 = mutableSharedFlow6.collect(wVar6, this);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect6 == aVar6) {
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
            default:
                int i7 = this.y;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow7 = this.z.a;
                    w wVar7 = new w(this.A, 6);
                    this.y = 1;
                    Object objCollect7 = mutableSharedFlow7.collect(wVar7, this);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect7 == aVar7) {
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
        }
    }
}
