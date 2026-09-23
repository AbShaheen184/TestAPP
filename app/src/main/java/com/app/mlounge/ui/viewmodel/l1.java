package com.app.mlounge.ui.viewmodel;

import androidx.compose.foundation.gestures.h2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ p1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(p1 p1Var, long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = p1Var;
        this.A = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l1(this.z, this.A, dVar, 0);
            default:
                return new l1(this.z, this.A, dVar, 1);
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
        return ((l1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var = this.z.b;
                this.y = 1;
                Object objH = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new h2(this.A, null, 2), this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objH != aVar) {
                    objH = yVar;
                }
                return objH == aVar ? aVar : yVar;
            default:
                int i2 = this.y;
                kotlin.y yVar2 = kotlin.y.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return yVar2;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var2 = this.z.b;
                this.y = 1;
                Object objH2 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var2.a), new h2(this.A, null, 3), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objH2 != aVar2) {
                    objH2 = yVar2;
                }
                return objH2 == aVar2 ? aVar2 : yVar2;
        }
    }
}
