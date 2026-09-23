package com.appsalt.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new t4((androidx.work.impl.z) this.z, dVar, 0);
            case 1:
                return new t4((g) this.z, dVar, 1);
            default:
                return new t4((com.google.firebase.datastorage.b) this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return new t4((androidx.work.impl.z) this.z, dVar, 0).invokeSuspend(kotlin.y.a);
            case 1:
                return new t4((g) this.z, dVar, 1).invokeSuspend(kotlin.y.a);
            default:
                return ((t4) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    c cVar = (c) ((androidx.work.impl.z) this.z).d;
                    this.y = 1;
                    Object objInvoke = cVar.invoke(this);
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
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    g gVar = (g) this.z;
                    MutableSharedFlow mutableSharedFlow = gVar.c.g;
                    androidx.compose.foundation.text.input.internal.a aVar2 = new androidx.compose.foundation.text.input.internal.a(gVar, 10);
                    this.y = 1;
                    Object objCollect = mutableSharedFlow.collect(aVar2, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect == aVar3) {
                        return aVar3;
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
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    Flow flowB = ((com.google.firebase.datastorage.b) this.z).c.b();
                    this.y = 1;
                    obj = FlowKt.firstOrNull(flowB, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                androidx.datastore.preferences.core.a aVar5 = (androidx.datastore.preferences.core.a) obj;
                return aVar5 != null ? aVar5.a() : kotlin.collections.x.e;
        }
    }
}
