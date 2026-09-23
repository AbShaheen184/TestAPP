package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ p1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(p1 p1Var, boolean z, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = p1Var;
        this.A = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new i1(this.z, this.A, dVar, 0);
            case 1:
                return new i1(this.z, this.A, dVar, 1);
            case 2:
                return new i1(this.z, this.A, dVar, 2);
            case 3:
                return new i1(this.z, this.A, dVar, 3);
            case 4:
                return new i1(this.z, this.A, dVar, 4);
            case 5:
                return new i1(this.z, this.A, dVar, 5);
            case 6:
                return new i1(this.z, this.A, dVar, 6);
            case 7:
                return new i1(this.z, this.A, dVar, 7);
            case 8:
                return new i1(this.z, this.A, dVar, 8);
            case 9:
                return new i1(this.z, this.A, dVar, 9);
            default:
                return new i1(this.z, this.A, dVar, 10);
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((i1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
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
                Object objH = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 0), this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objH != aVar) {
                    objH = yVar;
                }
                return objH == aVar ? aVar : yVar;
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
                Object objH2 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var2.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 1), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objH2 != aVar2) {
                    objH2 = yVar2;
                }
                return objH2 == aVar2 ? aVar2 : yVar2;
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
                Object objH3 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var3.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 2), this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (objH3 != aVar3) {
                    objH3 = yVar3;
                }
                return objH3 == aVar3 ? aVar3 : yVar3;
            case 3:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.prefs.y1 y1Var4 = this.z.b;
                    this.y = 1;
                    Object objJ = y1Var4.j(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objJ == aVar4) {
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
                    Object objK = y1Var5.k(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objK == aVar5) {
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
                    com.app.mlounge.data.local.prefs.y1 y1Var6 = this.z.b;
                    this.y = 1;
                    Object objN = y1Var6.n(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objN == aVar6) {
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
            case 6:
                int i7 = this.y;
                kotlin.y yVar4 = kotlin.y.a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        kotlin.a.e(obj);
                        return yVar4;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var7 = this.z.b;
                this.y = 1;
                Object objH4 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var7.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 8), this);
                kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                if (objH4 != aVar7) {
                    objH4 = yVar4;
                }
                return objH4 == aVar7 ? aVar7 : yVar4;
            case 7:
                int i8 = this.y;
                kotlin.y yVar5 = kotlin.y.a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        kotlin.a.e(obj);
                        return yVar5;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var8 = this.z.b;
                this.y = 1;
                Object objH5 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var8.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 9), this);
                kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                if (objH5 != aVar8) {
                    objH5 = yVar5;
                }
                return objH5 == aVar8 ? aVar8 : yVar5;
            case 8:
                int i9 = this.y;
                kotlin.y yVar6 = kotlin.y.a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kotlin.a.e(obj);
                        return yVar6;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var9 = this.z.b;
                this.y = 1;
                Object objH6 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var9.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 10), this);
                kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                if (objH6 != aVar9) {
                    objH6 = yVar6;
                }
                return objH6 == aVar9 ? aVar9 : yVar6;
            case 9:
                int i10 = this.y;
                kotlin.y yVar7 = kotlin.y.a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.a.e(obj);
                        return yVar7;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var10 = this.z.b;
                this.y = 1;
                Object objH7 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var10.a), new com.app.mlounge.data.local.prefs.b(this.A, null, 11), this);
                kotlin.coroutines.intrinsics.a aVar10 = kotlin.coroutines.intrinsics.a.e;
                if (objH7 != aVar10) {
                    objH7 = yVar7;
                }
                return objH7 == aVar10 ? aVar10 : yVar7;
            default:
                int i11 = this.y;
                kotlin.y yVar8 = kotlin.y.a;
                boolean z = this.A;
                p1 p1Var = this.z;
                kotlin.coroutines.intrinsics.a aVar11 = kotlin.coroutines.intrinsics.a.e;
                if (i11 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.prefs.y1 y1Var11 = p1Var.b;
                    this.y = 1;
                    Object objH8 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var11.a), new com.app.mlounge.data.local.prefs.b(z, null, 12), this);
                    if (objH8 != aVar11) {
                        objH8 = yVar8;
                    }
                    if (objH8 != aVar11) {
                    }
                    return aVar11;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        kotlin.a.e(obj);
                        return yVar8;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                if (z) {
                    return yVar8;
                }
                this.y = 2;
                if (p1.e(p1Var, this) != aVar11) {
                    return yVar8;
                }
                return aVar11;
        }
    }
}
