package com.app.mlounge.ui.viewmodel;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ p1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(p1 p1Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = p1Var;
        this.A = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new j1(this.z, this.A, dVar, 0);
            case 1:
                return new j1(this.z, this.A, dVar, 1);
            case 2:
                return new j1(this.z, this.A, dVar, 2);
            case 3:
                return new j1(this.z, this.A, dVar, 3);
            case 4:
                return new j1(this.z, this.A, dVar, 4);
            case 5:
                return new j1(this.z, this.A, dVar, 5);
            case 6:
                return new j1(this.z, this.A, dVar, 6);
            default:
                return new j1(this.z, this.A, dVar, 7);
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
        return ((j1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                com.app.mlounge.data.local.prefs.y1 y1Var = this.z.b;
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objH = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.c(0, this.A, null), this);
                    if (objH != aVar) {
                        objH = yVar;
                    }
                    if (objH != aVar) {
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 2;
                Object objH2 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.b(true, null, 0), this);
                if (objH2 != aVar) {
                    objH2 = yVar;
                }
                if (objH2 != aVar) {
                    return yVar;
                }
                return aVar;
            case 1:
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
                Object objH3 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var2.a), new com.app.mlounge.data.local.prefs.c(2, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objH3 != aVar2) {
                    objH3 = yVar2;
                }
                return objH3 == aVar2 ? aVar2 : yVar2;
            case 2:
                int i3 = this.y;
                kotlin.y yVar3 = kotlin.y.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return yVar3;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var3 = this.z.b;
                this.y = 1;
                Object objH4 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var3.a), new com.app.mlounge.data.local.prefs.c(12, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (objH4 != aVar3) {
                    objH4 = yVar3;
                }
                return objH4 == aVar3 ? aVar3 : yVar3;
            case 3:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.prefs.y1 y1Var4 = this.z.b;
                    this.y = 1;
                    Object objI = y1Var4.i(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objI == aVar4) {
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
                    com.app.mlounge.data.local.prefs.y1 y1Var5 = this.z.b;
                    this.y = 1;
                    Object objM = y1Var5.m(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objM == aVar5) {
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
                kotlin.y yVar4 = kotlin.y.a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlin.a.e(obj);
                        return yVar4;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var6 = this.z.b;
                this.y = 1;
                Object objH5 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var6.a), new com.app.mlounge.data.local.prefs.c(18, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                if (objH5 != aVar6) {
                    objH5 = yVar4;
                }
                return objH5 == aVar6 ? aVar6 : yVar4;
            case 6:
                com.app.mlounge.data.local.prefs.y1 y1Var7 = this.z.b;
                int i7 = this.y;
                kotlin.y yVar5 = kotlin.y.a;
                kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    Flow flow = y1Var7.u;
                    this.y = 1;
                    obj = FlowKt.first(flow, this);
                    if (obj != aVar7) {
                    }
                    return aVar7;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        kotlin.a.e(obj);
                        return yVar5;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Set set = (Set) obj;
                String str = this.A;
                LinkedHashSet linkedHashSetF = set.contains(str) ? kotlin.collections.g0.f(set, str) : kotlin.collections.g0.i(set, str);
                this.y = 2;
                Object objH6 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var7.a), new com.app.mlounge.data.local.prefs.d(linkedHashSetF, null, 1), this);
                if (objH6 != aVar7) {
                    objH6 = yVar5;
                }
                if (objH6 != aVar7) {
                    return yVar5;
                }
                return aVar7;
            default:
                com.app.mlounge.data.local.prefs.y1 y1Var8 = this.z.b;
                int i8 = this.y;
                kotlin.y yVar6 = kotlin.y.a;
                kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    Flow flow2 = y1Var8.P;
                    this.y = 1;
                    obj = FlowKt.first(flow2, this);
                    if (obj != aVar8) {
                    }
                    return aVar8;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        kotlin.a.e(obj);
                        return yVar6;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Set set2 = (Set) obj;
                String str2 = this.A;
                LinkedHashSet linkedHashSetF2 = set2.contains(str2) ? kotlin.collections.g0.f(set2, str2) : kotlin.collections.g0.i(set2, str2);
                this.y = 2;
                Object objH7 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var8.a), new com.app.mlounge.data.local.prefs.d(linkedHashSetF2, null, 0), this);
                if (objH7 != aVar8) {
                    objH7 = yVar6;
                }
                if (objH7 != aVar8) {
                    return yVar6;
                }
                return aVar8;
        }
    }
}
