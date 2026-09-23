package androidx.compose.material3.internal;

import java.io.IOException;
import java.io.Serializable;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public /* synthetic */ Serializable A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.foundation.text.input.internal.o oVar, androidx.compose.animation.b0 b0Var, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.e = 0;
        this.z = oVar;
        this.A = b0Var;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                return new n((androidx.compose.foundation.text.input.internal.o) this.z, (androidx.compose.animation.b0) this.A, (kotlin.coroutines.d) obj3).invokeSuspend(kotlin.y.a);
            case 1:
                n nVar = new n(3, 1, (kotlin.coroutines.d) obj3);
                nVar.z = (FlowCollector) obj;
                nVar.A = (Object[]) obj2;
                return nVar.invokeSuspend(kotlin.y.a);
            default:
                n nVar2 = new n(3, 2, (kotlin.coroutines.d) obj3);
                nVar2.z = (FlowCollector) obj;
                nVar2.A = (Throwable) obj2;
                return nVar2.invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.work.impl.constraints.c cVar;
        androidx.work.impl.constraints.c cVar2;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    o oVar = (o) ((androidx.compose.foundation.text.input.internal.o) this.z).y;
                    androidx.compose.animation.b0 b0Var = (androidx.compose.animation.b0) this.A;
                    this.y = 1;
                    Object objInvoke = b0Var.invoke(oVar, this);
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
                    FlowCollector flowCollector = (FlowCollector) this.z;
                    androidx.work.impl.constraints.c[] cVarArr = (androidx.work.impl.constraints.c[]) ((Object[]) this.A);
                    int length = cVarArr.length;
                    int i3 = 0;
                    while (true) {
                        cVar = androidx.work.impl.constraints.a.a;
                        if (i3 < length) {
                            cVar2 = cVarArr[i3];
                            if (kotlin.jvm.internal.l.a(cVar2, cVar)) {
                                i3++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.y = 1;
                    Object objEmit = flowCollector.emit(cVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit == aVar2) {
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
                FlowCollector flowCollector2 = (FlowCollector) this.z;
                Throwable th = (Throwable) this.A;
                int i4 = this.y;
                boolean z = true;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    androidx.datastore.preferences.core.a aVar3 = new androidx.datastore.preferences.core.a(z);
                    this.z = null;
                    this.A = null;
                    this.y = 1;
                    Object objEmit2 = flowCollector2.emit(aVar3, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar4) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }
}
