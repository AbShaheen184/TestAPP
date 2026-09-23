package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.gestures.r2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public long A;
    public /* synthetic */ long B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, long j, long j2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a1Var;
        this.A = j;
        this.B = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new y0((a1) this.z, this.A, this.B, dVar, 0);
            case 1:
                return new y0((a1) this.z, this.A, this.B, dVar, 1);
            default:
                y0 y0Var = new y0((r2) this.z, dVar);
                y0Var.B = ((androidx.compose.ui.unit.q) obj).a;
                return y0Var;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((y0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((y0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                long j = ((androidx.compose.ui.unit.q) obj).a;
                y0 y0Var = new y0((r2) this.z, (kotlin.coroutines.d) obj2);
                y0Var.B = j;
                return y0Var.invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long jD;
        long j2;
        long j3;
        long j4;
        long j5;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    a1 a1Var = (a1) this.z;
                    com.app.mlounge.data.local.dao.k kVar = a1Var.b;
                    com.app.mlounge.data.local.entity.e eVar = new com.app.mlounge.data.local.entity.e(this.A, this.B, a1Var.o);
                    this.y = 1;
                    Object objA = kVar.a(eVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
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
                    a1 a1Var2 = (a1) this.z;
                    com.app.mlounge.data.local.dao.k kVar2 = a1Var2.b;
                    com.app.mlounge.data.local.entity.e eVar2 = new com.app.mlounge.data.local.entity.e(this.A, this.B, a1Var2.o);
                    this.y = 1;
                    Object objA2 = kVar2.a(eVar2, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objA2 == aVar2) {
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
                r2 r2Var = (r2) this.z;
                int i3 = this.y;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    j = this.B;
                    androidx.compose.ui.input.nestedscroll.d dVar = r2Var.f;
                    this.B = j;
                    this.y = 1;
                    obj = dVar.b(j, this);
                    if (obj != aVar3) {
                        jD = androidx.compose.ui.unit.q.d(j, ((androidx.compose.ui.unit.q) obj).a);
                        this.B = j;
                        this.A = jD;
                        this.y = 2;
                        obj = r2Var.a(jD, this);
                        if (obj != aVar3) {
                            j2 = jD;
                            j3 = ((androidx.compose.ui.unit.q) obj).a;
                            androidx.compose.ui.input.nestedscroll.d dVar2 = r2Var.f;
                            long jD2 = androidx.compose.ui.unit.q.d(j2, j3);
                            this.B = j;
                            this.A = j3;
                            this.y = 3;
                            obj = dVar2.a(jD2, j3, this);
                            if (obj == aVar3) {
                                return aVar3;
                            }
                            j4 = j;
                            j5 = j3;
                        }
                    }
                    return aVar3;
                }
                if (i3 == 1) {
                    j = this.B;
                    kotlin.a.e(obj);
                    jD = androidx.compose.ui.unit.q.d(j, ((androidx.compose.ui.unit.q) obj).a);
                    this.B = j;
                    this.A = jD;
                    this.y = 2;
                    obj = r2Var.a(jD, this);
                    if (obj != aVar3) {
                        j2 = jD;
                        j3 = ((androidx.compose.ui.unit.q) obj).a;
                        androidx.compose.ui.input.nestedscroll.d dVar3 = r2Var.f;
                        long jD3 = androidx.compose.ui.unit.q.d(j2, j3);
                        this.B = j;
                        this.A = j3;
                        this.y = 3;
                        obj = dVar3.a(jD3, j3, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        j4 = j;
                        j5 = j3;
                    }
                    return aVar3;
                }
                if (i3 == 2) {
                    j2 = this.A;
                    j = this.B;
                    kotlin.a.e(obj);
                    j3 = ((androidx.compose.ui.unit.q) obj).a;
                    androidx.compose.ui.input.nestedscroll.d dVar4 = r2Var.f;
                    long jD4 = androidx.compose.ui.unit.q.d(j2, j3);
                    this.B = j;
                    this.A = j3;
                    this.y = 3;
                    obj = dVar4.a(jD4, j3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    j4 = j;
                    j5 = j3;
                } else {
                    if (i3 != 3) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        aVar3 = null;
                        return aVar3;
                    }
                    j5 = this.A;
                    j4 = this.B;
                    kotlin.a.e(obj);
                }
                return new androidx.compose.ui.unit.q(androidx.compose.ui.unit.q.d(j4, androidx.compose.ui.unit.q.d(j5, ((androidx.compose.ui.unit.q) obj).a)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(r2 r2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.z = r2Var;
    }
}
