package com.app.mlounge.data.remote.ntv;

import androidx.compose.foundation.text.selection.u0;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, kotlin.coroutines.d dVar2, int i) {
        super(2, dVar2);
        this.e = i;
        this.z = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c(this.z, dVar, 0);
            default:
                return new c(this.z, dVar, 1);
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
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                u0 u0Var = this.z.b;
                this.y = 1;
                Object objInvoke = u0Var.invoke(this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objInvoke == aVar ? aVar : objInvoke;
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
                c cVar = new c(this.z, null, 0);
                this.y = 1;
                Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(20000L, cVar, this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                return objWithTimeoutOrNull == aVar2 ? aVar2 : objWithTimeoutOrNull;
        }
    }
}
