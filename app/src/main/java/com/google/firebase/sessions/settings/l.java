package com.google.firebase.sessions.settings;

import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = nVar;
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
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((l) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    n nVar = this.z;
                    Flow flowB = nVar.c.b();
                    k kVar = new k(nVar.d);
                    this.y = 1;
                    Object objCollect = flowB.collect(kVar, this);
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
                return y.a;
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
                Flow flowB2 = this.z.c.b();
                this.y = 1;
                Object objFirst = FlowKt.first(flowB2, this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                return objFirst == aVar2 ? aVar2 : objFirst;
        }
    }
}
