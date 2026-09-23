package com.app.mlounge.ui.screens.player;

import androidx.compose.runtime.f1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ androidx.compose.runtime.a1 B;
    public final /* synthetic */ f1 C;
    public int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(long j, boolean z, kotlin.jvm.functions.l lVar, androidx.compose.runtime.a1 a1Var, f1 f1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = j;
        this.z = z;
        this.A = lVar;
        this.B = a1Var;
        this.C = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new g0(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        long j = this.y;
        androidx.compose.runtime.a1 a1Var = this.B;
        if (i == 0) {
            kotlin.a.e(obj);
            Object obj2 = k0.a;
            if (((Boolean) a1Var.getValue()).booleanValue() && j > 0 && this.z) {
                this.e = 1;
                Object objDelay = DelayKt.delay(1000L, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objDelay == aVar) {
                    return aVar;
                }
            }
            return kotlin.y.a;
        }
        if (i != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Object obj3 = k0.a;
        this.A.invoke(new Long((long) (this.C.g() * j)));
        a1Var.setValue(Boolean.FALSE);
        return kotlin.y.a;
    }
}
