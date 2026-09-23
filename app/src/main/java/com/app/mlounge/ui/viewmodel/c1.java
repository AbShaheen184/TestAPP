package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.AllDebridPinData;
import com.app.mlounge.data.remote.debrid.AllDebridUserInfo;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;
import com.app.mlounge.data.remote.debrid.RealDebridDeviceCodeResponse;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.RealDebridUserInfo;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.debrid.TorBoxUserInfo;
import com.app.mlounge.data.remote.trakt.TraktDeviceCodeResponse;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktUserSettings;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ h1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(h1 h1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = h1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c1(this.z, dVar, 0);
            case 1:
                return new c1(this.z, dVar, 1);
            case 2:
                return new c1(this.z, dVar, 2);
            case 3:
                return new c1(this.z, dVar, 3);
            case 4:
                return new c1(this.z, dVar, 4);
            case 5:
                return new c1(this.z, dVar, 5);
            case 6:
                return new c1(this.z, dVar, 6);
            case 7:
                return new c1(this.z, dVar, 7);
            case 8:
                return new c1(this.z, dVar, 8);
            case 9:
                return new c1(this.z, dVar, 9);
            case 10:
                return new c1(this.z, dVar, 10);
            case 11:
                return new c1(this.z, dVar, 11);
            case 12:
                return new c1(this.z, dVar, 12);
            case 13:
                return new c1(this.z, dVar, 13);
            default:
                return new c1(this.z, dVar, 14);
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
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return ((c1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x041c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0420  */
    /* JADX WARN: Code duplicated, block: B:176:0x0430  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:222:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:246:0x0575  */
    /* JADX WARN: Code duplicated, block: B:248:0x0579  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:296:0x065d  */
    /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objFirst;
        Object objB;
        Object objFirst2;
        Object objD;
        Object objFirst3;
        Object objD2;
        AllDebridUserInfo allDebridUserInfo;
        String str;
        Object objFirst4;
        Object objD3;
        RealDebridUserInfo realDebridUserInfo;
        String str2;
        Object objFirst5;
        Object objFirst6;
        Object objL;
        Object objH;
        TraktUserSettings traktUserSettings;
        String str3;
        Object objC;
        Object objC2;
        Object objE;
        switch (this.e) {
            case 0:
                h1 h1Var = this.z;
                MutableStateFlow mutableStateFlow = h1Var.i;
                int i = this.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        objFirst = obj;
                    } else {
                        if (i != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objB = obj;
                    }
                    PremiumizeUserInfo premiumizeUserInfo = (PremiumizeUserInfo) objB;
                    mutableStateFlow.setValue(m0.a((m0) mutableStateFlow.getValue(), false, premiumizeUserInfo, premiumizeUserInfo == null ? "Failed to load account info" : null, 1));
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                Flow flow = h1Var.b.h;
                this.y = 1;
                objFirst = FlowKt.first(flow, this);
                if (objFirst == aVar) {
                    return aVar;
                }
                String str4 = (String) objFirst;
                if (str4 != null && str4.length() != 0) {
                    mutableStateFlow.setValue(m0.a((m0) mutableStateFlow.getValue(), true, null, null, 12));
                    PremiumizeManager premiumizeManager = h1Var.c;
                    this.y = 2;
                    objB = premiumizeManager.b(this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    PremiumizeUserInfo premiumizeUserInfo2 = (PremiumizeUserInfo) objB;
                    mutableStateFlow.setValue(m0.a((m0) mutableStateFlow.getValue(), false, premiumizeUserInfo2, premiumizeUserInfo2 == null ? "Failed to load account info" : null, 1));
                }
                return kotlin.y.a;
            case 1:
                h1 h1Var2 = this.z;
                MutableStateFlow mutableStateFlow2 = h1Var2.k;
                int i2 = this.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        objFirst2 = obj;
                    } else {
                        if (i2 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objD = obj;
                    }
                    TorBoxUserInfo torBoxUserInfo = (TorBoxUserInfo) objD;
                    mutableStateFlow2.setValue(x1.a((x1) mutableStateFlow2.getValue(), false, torBoxUserInfo, torBoxUserInfo == null ? "Failed to load account info" : null, 1));
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                Flow flow2 = h1Var2.b.i;
                this.y = 1;
                objFirst2 = FlowKt.first(flow2, this);
                if (objFirst2 == aVar2) {
                    return aVar2;
                }
                String str5 = (String) objFirst2;
                if (str5 != null && str5.length() != 0) {
                    mutableStateFlow2.setValue(x1.a((x1) mutableStateFlow2.getValue(), true, null, null, 12));
                    TorBoxManager torBoxManager = h1Var2.d;
                    this.y = 2;
                    objD = torBoxManager.d(this);
                    if (objD == aVar2) {
                        return aVar2;
                    }
                    TorBoxUserInfo torBoxUserInfo2 = (TorBoxUserInfo) objD;
                    mutableStateFlow2.setValue(x1.a((x1) mutableStateFlow2.getValue(), false, torBoxUserInfo2, torBoxUserInfo2 == null ? "Failed to load account info" : null, 1));
                }
                return kotlin.y.a;
            case 2:
                h1 h1Var3 = this.z;
                MutableStateFlow mutableStateFlow3 = h1Var3.m;
                int i3 = this.y;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        objFirst3 = obj;
                    } else {
                        if (i3 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objD2 = obj;
                    }
                    allDebridUserInfo = (AllDebridUserInfo) objD2;
                    d dVar = (d) mutableStateFlow3.getValue();
                    if (allDebridUserInfo == null) {
                        str = "Failed to load account info";
                    } else {
                        str = null;
                    }
                    mutableStateFlow3.setValue(d.a(dVar, false, allDebridUserInfo, null, false, str, 25));
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                Flow flow3 = h1Var3.b.j;
                this.y = 1;
                objFirst3 = FlowKt.first(flow3, this);
                if (objFirst3 == aVar3) {
                    return aVar3;
                }
                String str6 = (String) objFirst3;
                if (str6 != null && str6.length() != 0) {
                    mutableStateFlow3.setValue(d.a((d) mutableStateFlow3.getValue(), true, null, null, false, null, 60));
                    AllDebridManager allDebridManager = h1Var3.e;
                    this.y = 2;
                    objD2 = allDebridManager.d(this);
                    if (objD2 == aVar3) {
                        return aVar3;
                    }
                    allDebridUserInfo = (AllDebridUserInfo) objD2;
                    d dVar2 = (d) mutableStateFlow3.getValue();
                    if (allDebridUserInfo == null) {
                        str = "Failed to load account info";
                    } else {
                        str = null;
                    }
                    mutableStateFlow3.setValue(d.a(dVar2, false, allDebridUserInfo, null, false, str, 25));
                }
                return kotlin.y.a;
            case 3:
                h1 h1Var4 = this.z;
                RealDebridManager realDebridManager = h1Var4.f;
                MutableStateFlow mutableStateFlow4 = h1Var4.o;
                int i4 = this.y;
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                        objFirst4 = obj;
                    } else if (i4 == 2) {
                        kotlin.a.e(obj);
                        this.y = 3;
                        objD3 = realDebridManager.d(this);
                        if (objD3 == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i4 != 3) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objD3 = obj;
                    }
                    realDebridUserInfo = (RealDebridUserInfo) objD3;
                    p0 p0Var = (p0) mutableStateFlow4.getValue();
                    if (realDebridUserInfo == null) {
                        str2 = "Token may be expired. Re-authenticate in Services.";
                    } else {
                        str2 = null;
                    }
                    mutableStateFlow4.setValue(p0.a(p0Var, false, realDebridUserInfo, null, false, str2, 25));
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                Flow flow4 = h1Var4.b.k;
                this.y = 1;
                objFirst4 = FlowKt.first(flow4, this);
                if (objFirst4 == aVar4) {
                    return aVar4;
                }
                String str7 = (String) objFirst4;
                if (str7 != null && str7.length() != 0) {
                    mutableStateFlow4.setValue(p0.a((p0) mutableStateFlow4.getValue(), true, null, null, false, null, 60));
                    this.y = 2;
                    if (realDebridManager.i(this) == aVar4) {
                        return aVar4;
                    }
                    this.y = 3;
                    objD3 = realDebridManager.d(this);
                    if (objD3 == aVar4) {
                        return aVar4;
                    }
                    realDebridUserInfo = (RealDebridUserInfo) objD3;
                    p0 p0Var2 = (p0) mutableStateFlow4.getValue();
                    if (realDebridUserInfo == null) {
                        str2 = "Token may be expired. Re-authenticate in Services.";
                    } else {
                        str2 = null;
                    }
                    mutableStateFlow4.setValue(p0.a(p0Var2, false, realDebridUserInfo, null, false, str2, 25));
                }
                return kotlin.y.a;
            case 4:
                int i5 = this.y;
                h1 h1Var5 = this.z;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    Flow flow5 = h1Var5.b.p;
                    this.y = 1;
                    objFirst5 = FlowKt.first(flow5, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objFirst5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objFirst5 = obj;
                }
                String str8 = (String) objFirst5;
                if (str8 != null && str8.length() != 0) {
                    h1Var5.q.setValue(new p(str8, 10));
                }
                return kotlin.y.a;
            case 5:
                h1 h1Var6 = this.z;
                MutableStateFlow mutableStateFlow5 = h1Var6.s;
                TraktManager traktManager = h1Var6.g;
                int i6 = this.y;
                kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlin.a.e(obj);
                        objFirst6 = obj;
                    } else if (i6 == 2) {
                        kotlin.a.e(obj);
                        objL = obj;
                        if (((Boolean) objL).booleanValue()) {
                            this.y = 3;
                            if (traktManager.n(this) == aVar6) {
                                return aVar6;
                            }
                        }
                        this.y = 4;
                        objH = traktManager.h(this);
                        if (objH == aVar6) {
                            return aVar6;
                        }
                    } else if (i6 == 3) {
                        kotlin.a.e(obj);
                        this.y = 4;
                        objH = traktManager.h(this);
                        if (objH == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i6 != 4) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objH = obj;
                    }
                    traktUserSettings = (TraktUserSettings) objH;
                    y1 y1Var = (y1) mutableStateFlow5.getValue();
                    if (traktUserSettings == null) {
                        str3 = "Failed to load account info";
                    } else {
                        str3 = null;
                    }
                    mutableStateFlow5.setValue(y1.a(y1Var, false, traktUserSettings, null, false, str3, 25));
                    if (traktUserSettings != null) {
                        h1Var6.h.o();
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                Flow flow6 = h1Var6.b.r;
                this.y = 1;
                objFirst6 = FlowKt.first(flow6, this);
                if (objFirst6 == aVar6) {
                    return aVar6;
                }
                String str9 = (String) objFirst6;
                if (str9 != null && str9.length() != 0) {
                    mutableStateFlow5.setValue(y1.a((y1) mutableStateFlow5.getValue(), true, null, null, false, null, 60));
                    this.y = 2;
                    objL = traktManager.l(this);
                    if (objL == aVar6) {
                        return aVar6;
                    }
                    if (((Boolean) objL).booleanValue()) {
                        this.y = 3;
                        if (traktManager.n(this) == aVar6) {
                            return aVar6;
                        }
                    }
                    this.y = 4;
                    objH = traktManager.h(this);
                    if (objH == aVar6) {
                        return aVar6;
                    }
                    traktUserSettings = (TraktUserSettings) objH;
                    y1 y1Var2 = (y1) mutableStateFlow5.getValue();
                    if (traktUserSettings == null) {
                        str3 = "Failed to load account info";
                    } else {
                        str3 = null;
                    }
                    mutableStateFlow5.setValue(y1.a(y1Var2, false, traktUserSettings, null, false, str3, 25));
                    if (traktUserSettings != null) {
                        h1Var6.h.o();
                    }
                }
                return kotlin.y.a;
            case 6:
                int i7 = this.y;
                h1 h1Var7 = this.z;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    AllDebridManager allDebridManager2 = h1Var7.e;
                    this.y = 1;
                    Object objF = allDebridManager2.f(this);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var7.m.setValue(new d(null, 63));
                return kotlin.y.a;
            case 7:
                int i8 = this.y;
                kotlin.y yVar = kotlin.y.a;
                String str10 = null;
                byte b = 0;
                byte b2 = 0;
                h1 h1Var8 = this.z;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.prefs.y1 y1Var3 = h1Var8.b;
                    this.y = 1;
                    Object objH2 = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var3.a), new com.app.mlounge.data.local.prefs.e(str10, b2 == true ? 1 : 0, b == true ? 1 : 0, 0), this);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objH2 != aVar8) {
                        objH2 = yVar;
                    }
                    if (objH2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i8 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var8.q.setValue(new p(null, 15));
                return yVar;
            case 8:
                int i9 = this.y;
                h1 h1Var9 = this.z;
                if (i9 == 0) {
                    kotlin.a.e(obj);
                    PremiumizeManager premiumizeManager2 = h1Var9.c;
                    this.y = 1;
                    Object objE2 = premiumizeManager2.e(this);
                    kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                    if (objE2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i9 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var9.i.setValue(new m0(null, 15));
                return kotlin.y.a;
            case 9:
                int i10 = this.y;
                h1 h1Var10 = this.z;
                if (i10 == 0) {
                    kotlin.a.e(obj);
                    RealDebridManager realDebridManager2 = h1Var10.f;
                    this.y = 1;
                    Object objF2 = realDebridManager2.f(this);
                    kotlin.coroutines.intrinsics.a aVar10 = kotlin.coroutines.intrinsics.a.e;
                    if (objF2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i10 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var10.o.setValue(new p0(null, 63));
                return kotlin.y.a;
            case 10:
                int i11 = this.y;
                h1 h1Var11 = this.z;
                if (i11 == 0) {
                    kotlin.a.e(obj);
                    TorBoxManager torBoxManager2 = h1Var11.d;
                    this.y = 1;
                    Object objF3 = torBoxManager2.f(this);
                    kotlin.coroutines.intrinsics.a aVar11 = kotlin.coroutines.intrinsics.a.e;
                    if (objF3 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i11 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var11.k.setValue(new x1(null, 15));
                return kotlin.y.a;
            case 11:
                int i12 = this.y;
                h1 h1Var12 = this.z;
                if (i12 == 0) {
                    kotlin.a.e(obj);
                    h1Var12.h.p();
                    TraktManager traktManager2 = h1Var12.g;
                    this.y = 1;
                    Object objK = traktManager2.k(this);
                    kotlin.coroutines.intrinsics.a aVar12 = kotlin.coroutines.intrinsics.a.e;
                    if (objK == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i12 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                h1Var12.s.setValue(new y1(null, 63));
                return kotlin.y.a;
            case 12:
                h1 h1Var13 = this.z;
                MutableStateFlow mutableStateFlow6 = h1Var13.m;
                int i13 = this.y;
                try {
                    if (i13 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow6.setValue(d.a((d) mutableStateFlow6.getValue(), true, null, null, false, null, 29));
                        AllDebridManager allDebridManager3 = h1Var13.e;
                        this.y = 1;
                        objC = allDebridManager3.c(this);
                        kotlin.coroutines.intrinsics.a aVar13 = kotlin.coroutines.intrinsics.a.e;
                        if (objC == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i13 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objC = obj;
                    }
                    AllDebridPinData allDebridPinData = (AllDebridPinData) objC;
                    if (allDebridPinData != null) {
                        mutableStateFlow6.setValue(d.a((d) mutableStateFlow6.getValue(), false, null, allDebridPinData, true, null, 37));
                        String strB = allDebridPinData.b();
                        String strA = allDebridPinData.a();
                        Job job = h1Var13.u;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        h1Var13.u = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var13), null, null, new e1(h1Var13, strB, strA, null), 3, null);
                    } else {
                        mutableStateFlow6.setValue(d.a((d) mutableStateFlow6.getValue(), false, null, null, false, "Failed to get PIN. Please try again.", 29));
                    }
                } catch (Exception e) {
                    mutableStateFlow6.setValue(d.a((d) mutableStateFlow6.getValue(), false, null, null, false, androidx.compose.runtime.j.i("Failed to start authentication: ", e.getMessage()), 29));
                }
                return kotlin.y.a;
            case 13:
                h1 h1Var14 = this.z;
                MutableStateFlow mutableStateFlow7 = h1Var14.o;
                int i14 = this.y;
                try {
                    if (i14 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow7.setValue(p0.a((p0) mutableStateFlow7.getValue(), true, null, null, false, null, 29));
                        RealDebridManager realDebridManager3 = h1Var14.f;
                        this.y = 1;
                        objC2 = realDebridManager3.c(this);
                        kotlin.coroutines.intrinsics.a aVar14 = kotlin.coroutines.intrinsics.a.e;
                        if (objC2 == aVar14) {
                            return aVar14;
                        }
                    } else {
                        if (i14 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objC2 = obj;
                    }
                    RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = (RealDebridDeviceCodeResponse) objC2;
                    if (realDebridDeviceCodeResponse != null) {
                        mutableStateFlow7.setValue(p0.a((p0) mutableStateFlow7.getValue(), false, null, realDebridDeviceCodeResponse, true, null, 37));
                        String strA2 = realDebridDeviceCodeResponse.a();
                        int iB = realDebridDeviceCodeResponse.b();
                        Job job2 = h1Var14.v;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        h1Var14.v = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var14), null, null, new f1(iB, h1Var14, strA2, null), 3, null);
                    } else {
                        mutableStateFlow7.setValue(p0.a((p0) mutableStateFlow7.getValue(), false, null, null, false, "Failed to get device code. Please try again.", 29));
                    }
                } catch (Exception e2) {
                    mutableStateFlow7.setValue(p0.a((p0) mutableStateFlow7.getValue(), false, null, null, false, androidx.compose.runtime.j.i("Failed to start authentication: ", e2.getMessage()), 29));
                }
                return kotlin.y.a;
            default:
                h1 h1Var15 = this.z;
                MutableStateFlow mutableStateFlow8 = h1Var15.s;
                int i15 = this.y;
                try {
                    if (i15 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow8.setValue(y1.a((y1) mutableStateFlow8.getValue(), true, null, null, false, null, 29));
                        TraktManager traktManager3 = h1Var15.g;
                        this.y = 1;
                        objE = traktManager3.e(this);
                        kotlin.coroutines.intrinsics.a aVar15 = kotlin.coroutines.intrinsics.a.e;
                        if (objE == aVar15) {
                            return aVar15;
                        }
                    } else {
                        if (i15 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objE = obj;
                    }
                    TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) objE;
                    if (traktDeviceCodeResponse != null) {
                        mutableStateFlow8.setValue(y1.a((y1) mutableStateFlow8.getValue(), false, null, traktDeviceCodeResponse, true, null, 37));
                        String strA3 = traktDeviceCodeResponse.a();
                        int iB2 = traktDeviceCodeResponse.b();
                        Job job3 = h1Var15.w;
                        if (job3 != null) {
                            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                        }
                        h1Var15.w = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(h1Var15), null, null, new g1(iB2, h1Var15, strA3, null), 3, null);
                    } else {
                        mutableStateFlow8.setValue(y1.a((y1) mutableStateFlow8.getValue(), false, null, null, false, "Failed to get device code", 29));
                    }
                } catch (Exception e3) {
                    mutableStateFlow8.setValue(y1.a((y1) mutableStateFlow8.getValue(), false, null, null, false, androidx.compose.runtime.j.i("Failed to start authentication: ", e3.getMessage()), 29));
                }
                return kotlin.y.a;
        }
    }
}
