package androidx.datastore.core;

import com.app.mlounge.C0008r;
import com.app.mlounge.data.local.prefs.y1;
import java.util.Collection;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector y;

    public /* synthetic */ n(FlowCollector flowCollector, int i) {
        this.e = i;
        this.y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0216  */
    /* JADX WARN: Code duplicated, block: B:144:0x025e  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:200:0x0354  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:240:0x0402  */
    /* JADX WARN: Code duplicated, block: B:260:0x0458  */
    /* JADX WARN: Code duplicated, block: B:279:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:295:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:314:0x053c  */
    /* JADX WARN: Code duplicated, block: B:334:0x0594  */
    /* JADX WARN: Code duplicated, block: B:350:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:366:0x0624  */
    /* JADX WARN: Code duplicated, block: B:382:0x066c  */
    /* JADX WARN: Code duplicated, block: B:398:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:414:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:430:0x0744  */
    /* JADX WARN: Code duplicated, block: B:446:0x078c  */
    /* JADX WARN: Code duplicated, block: B:466:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:486:0x083a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:505:0x0888  */
    /* JADX WARN: Code duplicated, block: B:524:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:542:0x091a  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) throws Throwable {
        m mVar;
        androidx.work.impl.workers.e eVar;
        com.app.mlounge.q qVar;
        C0008r c0008r;
        com.app.mlounge.data.local.prefs.n nVar;
        com.app.mlounge.data.local.prefs.o oVar;
        com.app.mlounge.data.local.prefs.p pVar;
        com.app.mlounge.data.local.prefs.q qVar2;
        com.app.mlounge.data.local.prefs.r rVar;
        com.app.mlounge.data.local.prefs.s sVar;
        com.app.mlounge.data.local.prefs.t tVar;
        com.app.mlounge.data.local.prefs.u uVar;
        com.app.mlounge.data.local.prefs.v vVar;
        com.app.mlounge.data.local.prefs.w wVar;
        com.app.mlounge.data.local.prefs.x xVar;
        com.app.mlounge.data.local.prefs.y yVar;
        com.app.mlounge.data.local.prefs.z zVar;
        com.app.mlounge.data.local.prefs.a0 a0Var;
        com.app.mlounge.data.local.prefs.b0 b0Var;
        com.app.mlounge.data.local.prefs.c0 c0Var;
        com.app.mlounge.data.local.prefs.d0 d0Var;
        com.app.mlounge.data.local.prefs.e0 e0Var;
        com.app.mlounge.data.local.prefs.f0 f0Var;
        com.app.mlounge.data.local.prefs.g0 g0Var;
        com.app.mlounge.data.local.prefs.h0 h0Var;
        com.app.mlounge.data.local.prefs.i0 i0Var;
        com.app.mlounge.data.local.prefs.j0 j0Var;
        com.app.mlounge.data.local.prefs.k0 k0Var;
        com.app.mlounge.data.local.prefs.l0 l0Var;
        com.app.mlounge.data.local.prefs.m0 m0Var;
        switch (this.e) {
            case 0:
                if (dVar instanceof m) {
                    mVar = (m) dVar;
                    int i = mVar.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mVar.y = i - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, dVar);
                    }
                } else {
                    mVar = new m(this, dVar);
                }
                Object obj2 = mVar.e;
                int i2 = mVar.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj2);
                        return kotlin.y.a;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj2);
                f1 f1Var = (f1) obj;
                if (f1Var instanceof v0) {
                    throw ((v0) f1Var).b;
                }
                if (!(f1Var instanceof c)) {
                    if ((f1Var instanceof j0) || (f1Var instanceof h1) || (f1Var instanceof u0)) {
                        kotlinx.coroutines.future.a.u("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        coil3.g.a();
                    }
                    return null;
                }
                Object obj3 = ((c) f1Var).b;
                mVar.y = 1;
                Object objEmit = this.y.emit(obj3, mVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
                return kotlin.y.a;
            case 1:
                if (dVar instanceof androidx.work.impl.workers.e) {
                    eVar = (androidx.work.impl.workers.e) dVar;
                    int i3 = eVar.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        eVar.y = i3 - Integer.MIN_VALUE;
                    } else {
                        eVar = new androidx.work.impl.workers.e(this, dVar);
                    }
                } else {
                    eVar = new androidx.work.impl.workers.e(this, dVar);
                }
                Object obj4 = eVar.e;
                int i4 = eVar.y;
                if (i4 == 0) {
                    kotlin.a.e(obj4);
                    if (obj instanceof androidx.work.impl.constraints.b) {
                        eVar.y = 1;
                        Object objEmit2 = this.y.emit(obj, eVar);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objEmit2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj4);
                }
                return kotlin.y.a;
            case 2:
                if (dVar instanceof com.app.mlounge.q) {
                    qVar = (com.app.mlounge.q) dVar;
                    int i5 = qVar.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.y = i5 - Integer.MIN_VALUE;
                    } else {
                        qVar = new com.app.mlounge.q(this, dVar);
                    }
                } else {
                    qVar = new com.app.mlounge.q(this, dVar);
                }
                Object obj5 = qVar.e;
                int i6 = qVar.y;
                if (i6 == 0) {
                    kotlin.a.e(obj5);
                    String str = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.d1);
                    if (str == null) {
                        str = "MEDIUM";
                    }
                    qVar.y = 1;
                    Object objEmit3 = this.y.emit(str, qVar);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj5);
                }
                return kotlin.y.a;
            case 3:
                if (dVar instanceof C0008r) {
                    c0008r = (C0008r) dVar;
                    int i7 = c0008r.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0008r.y = i7 - Integer.MIN_VALUE;
                    } else {
                        c0008r = new C0008r(this, dVar);
                    }
                } else {
                    c0008r = new C0008r(this, dVar);
                }
                Object obj6 = c0008r.e;
                int i8 = c0008r.y;
                if (i8 == 0) {
                    kotlin.a.e(obj6);
                    String str2 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.e1);
                    if (str2 == null) {
                        str2 = "MEDIUM";
                    }
                    c0008r.y = 1;
                    Object objEmit4 = this.y.emit(str2, c0008r);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i8 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj6);
                }
                return kotlin.y.a;
            case 4:
                if (dVar instanceof com.app.mlounge.data.local.prefs.n) {
                    nVar = (com.app.mlounge.data.local.prefs.n) dVar;
                    int i9 = nVar.y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nVar.y = i9 - Integer.MIN_VALUE;
                    } else {
                        nVar = new com.app.mlounge.data.local.prefs.n(this, dVar);
                    }
                } else {
                    nVar = new com.app.mlounge.data.local.prefs.n(this, dVar);
                }
                Object obj7 = nVar.e;
                int i10 = nVar.y;
                if (i10 == 0) {
                    kotlin.a.e(obj7);
                    Boolean bool = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.k0);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    nVar.y = 1;
                    Object objEmit5 = this.y.emit(boolValueOf, nVar);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i10 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj7);
                }
                return kotlin.y.a;
            case 5:
                if (dVar instanceof com.app.mlounge.data.local.prefs.o) {
                    oVar = (com.app.mlounge.data.local.prefs.o) dVar;
                    int i11 = oVar.y;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        oVar.y = i11 - Integer.MIN_VALUE;
                    } else {
                        oVar = new com.app.mlounge.data.local.prefs.o(this, dVar);
                    }
                } else {
                    oVar = new com.app.mlounge.data.local.prefs.o(this, dVar);
                }
                Object obj8 = oVar.e;
                int i12 = oVar.y;
                if (i12 == 0) {
                    kotlin.a.e(obj8);
                    Long l = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.t0);
                    Long l2 = new Long(l != null ? l.longValue() : 0L);
                    oVar.y = 1;
                    Object objEmit6 = this.y.emit(l2, oVar);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj8);
                }
                return kotlin.y.a;
            case 6:
                if (dVar instanceof com.app.mlounge.data.local.prefs.p) {
                    pVar = (com.app.mlounge.data.local.prefs.p) dVar;
                    int i13 = pVar.y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        pVar.y = i13 - Integer.MIN_VALUE;
                    } else {
                        pVar = new com.app.mlounge.data.local.prefs.p(this, dVar);
                    }
                } else {
                    pVar = new com.app.mlounge.data.local.prefs.p(this, dVar);
                }
                Object obj9 = pVar.e;
                int i14 = pVar.y;
                if (i14 == 0) {
                    kotlin.a.e(obj9);
                    Object objC = ((androidx.datastore.preferences.core.a) obj).c(y1.u0);
                    pVar.y = 1;
                    Object objEmit7 = this.y.emit(objC, pVar);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit7 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj9);
                }
                return kotlin.y.a;
            case 7:
                if (dVar instanceof com.app.mlounge.data.local.prefs.q) {
                    qVar2 = (com.app.mlounge.data.local.prefs.q) dVar;
                    int i15 = qVar2.y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        qVar2.y = i15 - Integer.MIN_VALUE;
                    } else {
                        qVar2 = new com.app.mlounge.data.local.prefs.q(this, dVar);
                    }
                } else {
                    qVar2 = new com.app.mlounge.data.local.prefs.q(this, dVar);
                }
                Object obj10 = qVar2.e;
                int i16 = qVar2.y;
                if (i16 == 0) {
                    kotlin.a.e(obj10);
                    Object objC2 = ((androidx.datastore.preferences.core.a) obj).c(y1.v0);
                    qVar2.y = 1;
                    Object objEmit8 = this.y.emit(objC2, qVar2);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit8 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj10);
                }
                return kotlin.y.a;
            case 8:
                if (dVar instanceof com.app.mlounge.data.local.prefs.r) {
                    rVar = (com.app.mlounge.data.local.prefs.r) dVar;
                    int i17 = rVar.y;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        rVar.y = i17 - Integer.MIN_VALUE;
                    } else {
                        rVar = new com.app.mlounge.data.local.prefs.r(this, dVar);
                    }
                } else {
                    rVar = new com.app.mlounge.data.local.prefs.r(this, dVar);
                }
                Object obj11 = rVar.e;
                int i18 = rVar.y;
                if (i18 == 0) {
                    kotlin.a.e(obj11);
                    Object objC3 = ((androidx.datastore.preferences.core.a) obj).c(y1.w0);
                    rVar.y = 1;
                    Object objEmit9 = this.y.emit(objC3, rVar);
                    kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit9 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj11);
                }
                return kotlin.y.a;
            case 9:
                if (dVar instanceof com.app.mlounge.data.local.prefs.s) {
                    sVar = (com.app.mlounge.data.local.prefs.s) dVar;
                    int i19 = sVar.y;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        sVar.y = i19 - Integer.MIN_VALUE;
                    } else {
                        sVar = new com.app.mlounge.data.local.prefs.s(this, dVar);
                    }
                } else {
                    sVar = new com.app.mlounge.data.local.prefs.s(this, dVar);
                }
                Object obj12 = sVar.e;
                int i20 = sVar.y;
                if (i20 == 0) {
                    kotlin.a.e(obj12);
                    Object objC4 = ((androidx.datastore.preferences.core.a) obj).c(y1.x0);
                    sVar.y = 1;
                    Object objEmit10 = this.y.emit(objC4, sVar);
                    kotlin.coroutines.intrinsics.a aVar10 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit10 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj12);
                }
                return kotlin.y.a;
            case 10:
                if (dVar instanceof com.app.mlounge.data.local.prefs.t) {
                    tVar = (com.app.mlounge.data.local.prefs.t) dVar;
                    int i21 = tVar.y;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        tVar.y = i21 - Integer.MIN_VALUE;
                    } else {
                        tVar = new com.app.mlounge.data.local.prefs.t(this, dVar);
                    }
                } else {
                    tVar = new com.app.mlounge.data.local.prefs.t(this, dVar);
                }
                Object obj13 = tVar.e;
                int i22 = tVar.y;
                if (i22 == 0) {
                    kotlin.a.e(obj13);
                    Object objC5 = ((androidx.datastore.preferences.core.a) obj).c(y1.y0);
                    tVar.y = 1;
                    Object objEmit11 = this.y.emit(objC5, tVar);
                    kotlin.coroutines.intrinsics.a aVar11 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit11 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj13);
                }
                return kotlin.y.a;
            case 11:
                if (dVar instanceof com.app.mlounge.data.local.prefs.u) {
                    uVar = (com.app.mlounge.data.local.prefs.u) dVar;
                    int i23 = uVar.y;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        uVar.y = i23 - Integer.MIN_VALUE;
                    } else {
                        uVar = new com.app.mlounge.data.local.prefs.u(this, dVar);
                    }
                } else {
                    uVar = new com.app.mlounge.data.local.prefs.u(this, dVar);
                }
                Object obj14 = uVar.e;
                int i24 = uVar.y;
                if (i24 == 0) {
                    kotlin.a.e(obj14);
                    Object objC6 = ((androidx.datastore.preferences.core.a) obj).c(y1.z0);
                    uVar.y = 1;
                    Object objEmit12 = this.y.emit(objC6, uVar);
                    kotlin.coroutines.intrinsics.a aVar12 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit12 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i24 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj14);
                }
                return kotlin.y.a;
            case 12:
                if (dVar instanceof com.app.mlounge.data.local.prefs.v) {
                    vVar = (com.app.mlounge.data.local.prefs.v) dVar;
                    int i25 = vVar.y;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        vVar.y = i25 - Integer.MIN_VALUE;
                    } else {
                        vVar = new com.app.mlounge.data.local.prefs.v(this, dVar);
                    }
                } else {
                    vVar = new com.app.mlounge.data.local.prefs.v(this, dVar);
                }
                Object obj15 = vVar.e;
                int i26 = vVar.y;
                if (i26 == 0) {
                    kotlin.a.e(obj15);
                    Object objC7 = ((androidx.datastore.preferences.core.a) obj).c(y1.A0);
                    vVar.y = 1;
                    Object objEmit13 = this.y.emit(objC7, vVar);
                    kotlin.coroutines.intrinsics.a aVar13 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit13 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i26 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj15);
                }
                return kotlin.y.a;
            case 13:
                if (dVar instanceof com.app.mlounge.data.local.prefs.w) {
                    wVar = (com.app.mlounge.data.local.prefs.w) dVar;
                    int i27 = wVar.y;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        wVar.y = i27 - Integer.MIN_VALUE;
                    } else {
                        wVar = new com.app.mlounge.data.local.prefs.w(this, dVar);
                    }
                } else {
                    wVar = new com.app.mlounge.data.local.prefs.w(this, dVar);
                }
                Object obj16 = wVar.e;
                int i28 = wVar.y;
                if (i28 == 0) {
                    kotlin.a.e(obj16);
                    Long l3 = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.B0);
                    Long l4 = new Long(l3 != null ? l3.longValue() : 0L);
                    wVar.y = 1;
                    Object objEmit14 = this.y.emit(l4, wVar);
                    kotlin.coroutines.intrinsics.a aVar14 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit14 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i28 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj16);
                }
                return kotlin.y.a;
            case 14:
                if (dVar instanceof com.app.mlounge.data.local.prefs.x) {
                    xVar = (com.app.mlounge.data.local.prefs.x) dVar;
                    int i29 = xVar.y;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        xVar.y = i29 - Integer.MIN_VALUE;
                    } else {
                        xVar = new com.app.mlounge.data.local.prefs.x(this, dVar);
                    }
                } else {
                    xVar = new com.app.mlounge.data.local.prefs.x(this, dVar);
                }
                Object obj17 = xVar.e;
                int i30 = xVar.y;
                if (i30 == 0) {
                    kotlin.a.e(obj17);
                    Collection collection = (Set) ((androidx.datastore.preferences.core.a) obj).c(y1.C0);
                    if (collection == null) {
                        collection = kotlin.collections.y.e;
                    }
                    xVar.y = 1;
                    Object objEmit15 = this.y.emit(collection, xVar);
                    kotlin.coroutines.intrinsics.a aVar15 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit15 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i30 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj17);
                }
                return kotlin.y.a;
            case 15:
                if (dVar instanceof com.app.mlounge.data.local.prefs.y) {
                    yVar = (com.app.mlounge.data.local.prefs.y) dVar;
                    int i31 = yVar.y;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        yVar.y = i31 - Integer.MIN_VALUE;
                    } else {
                        yVar = new com.app.mlounge.data.local.prefs.y(this, dVar);
                    }
                } else {
                    yVar = new com.app.mlounge.data.local.prefs.y(this, dVar);
                }
                Object obj18 = yVar.e;
                int i32 = yVar.y;
                if (i32 == 0) {
                    kotlin.a.e(obj18);
                    Object objC8 = ((androidx.datastore.preferences.core.a) obj).c(y1.l0);
                    yVar.y = 1;
                    Object objEmit16 = this.y.emit(objC8, yVar);
                    kotlin.coroutines.intrinsics.a aVar16 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit16 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i32 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj18);
                }
                return kotlin.y.a;
            case 16:
                if (dVar instanceof com.app.mlounge.data.local.prefs.z) {
                    zVar = (com.app.mlounge.data.local.prefs.z) dVar;
                    int i33 = zVar.y;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        zVar.y = i33 - Integer.MIN_VALUE;
                    } else {
                        zVar = new com.app.mlounge.data.local.prefs.z(this, dVar);
                    }
                } else {
                    zVar = new com.app.mlounge.data.local.prefs.z(this, dVar);
                }
                Object obj19 = zVar.e;
                int i34 = zVar.y;
                if (i34 == 0) {
                    kotlin.a.e(obj19);
                    String str3 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.D0);
                    if (str3 == null) {
                        str3 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    }
                    zVar.y = 1;
                    Object objEmit17 = this.y.emit(str3, zVar);
                    kotlin.coroutines.intrinsics.a aVar17 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit17 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i34 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj19);
                }
                return kotlin.y.a;
            case 17:
                if (dVar instanceof com.app.mlounge.data.local.prefs.a0) {
                    a0Var = (com.app.mlounge.data.local.prefs.a0) dVar;
                    int i35 = a0Var.y;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        a0Var.y = i35 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new com.app.mlounge.data.local.prefs.a0(this, dVar);
                    }
                } else {
                    a0Var = new com.app.mlounge.data.local.prefs.a0(this, dVar);
                }
                Object obj20 = a0Var.e;
                int i36 = a0Var.y;
                if (i36 == 0) {
                    kotlin.a.e(obj20);
                    Boolean bool2 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.E0);
                    Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
                    a0Var.y = 1;
                    Object objEmit18 = this.y.emit(boolValueOf2, a0Var);
                    kotlin.coroutines.intrinsics.a aVar18 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit18 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i36 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj20);
                }
                return kotlin.y.a;
            case 18:
                if (dVar instanceof com.app.mlounge.data.local.prefs.b0) {
                    b0Var = (com.app.mlounge.data.local.prefs.b0) dVar;
                    int i37 = b0Var.y;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        b0Var.y = i37 - Integer.MIN_VALUE;
                    } else {
                        b0Var = new com.app.mlounge.data.local.prefs.b0(this, dVar);
                    }
                } else {
                    b0Var = new com.app.mlounge.data.local.prefs.b0(this, dVar);
                }
                Object obj21 = b0Var.e;
                int i38 = b0Var.y;
                if (i38 == 0) {
                    kotlin.a.e(obj21);
                    Boolean bool3 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.F0);
                    Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
                    b0Var.y = 1;
                    Object objEmit19 = this.y.emit(boolValueOf3, b0Var);
                    kotlin.coroutines.intrinsics.a aVar19 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit19 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i38 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj21);
                }
                return kotlin.y.a;
            case 19:
                if (dVar instanceof com.app.mlounge.data.local.prefs.c0) {
                    c0Var = (com.app.mlounge.data.local.prefs.c0) dVar;
                    int i39 = c0Var.y;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        c0Var.y = i39 - Integer.MIN_VALUE;
                    } else {
                        c0Var = new com.app.mlounge.data.local.prefs.c0(this, dVar);
                    }
                } else {
                    c0Var = new com.app.mlounge.data.local.prefs.c0(this, dVar);
                }
                Object obj22 = c0Var.e;
                int i40 = c0Var.y;
                if (i40 == 0) {
                    kotlin.a.e(obj22);
                    Long l5 = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.G0);
                    Long l6 = new Long(l5 != null ? l5.longValue() : 30000L);
                    c0Var.y = 1;
                    Object objEmit20 = this.y.emit(l6, c0Var);
                    kotlin.coroutines.intrinsics.a aVar20 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit20 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i40 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj22);
                }
                return kotlin.y.a;
            case 20:
                if (dVar instanceof com.app.mlounge.data.local.prefs.d0) {
                    d0Var = (com.app.mlounge.data.local.prefs.d0) dVar;
                    int i41 = d0Var.y;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        d0Var.y = i41 - Integer.MIN_VALUE;
                    } else {
                        d0Var = new com.app.mlounge.data.local.prefs.d0(this, dVar);
                    }
                } else {
                    d0Var = new com.app.mlounge.data.local.prefs.d0(this, dVar);
                }
                Object obj23 = d0Var.e;
                int i42 = d0Var.y;
                if (i42 == 0) {
                    kotlin.a.e(obj23);
                    Long l7 = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.H0);
                    Long l8 = new Long(l7 != null ? l7.longValue() : 30000L);
                    d0Var.y = 1;
                    Object objEmit21 = this.y.emit(l8, d0Var);
                    kotlin.coroutines.intrinsics.a aVar21 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit21 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i42 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj23);
                }
                return kotlin.y.a;
            case 21:
                if (dVar instanceof com.app.mlounge.data.local.prefs.e0) {
                    e0Var = (com.app.mlounge.data.local.prefs.e0) dVar;
                    int i43 = e0Var.y;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        e0Var.y = i43 - Integer.MIN_VALUE;
                    } else {
                        e0Var = new com.app.mlounge.data.local.prefs.e0(this, dVar);
                    }
                } else {
                    e0Var = new com.app.mlounge.data.local.prefs.e0(this, dVar);
                }
                Object obj24 = e0Var.e;
                int i44 = e0Var.y;
                if (i44 == 0) {
                    kotlin.a.e(obj24);
                    Boolean bool4 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.I0);
                    Boolean boolValueOf4 = Boolean.valueOf(bool4 != null ? bool4.booleanValue() : true);
                    e0Var.y = 1;
                    Object objEmit22 = this.y.emit(boolValueOf4, e0Var);
                    kotlin.coroutines.intrinsics.a aVar22 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit22 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i44 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj24);
                }
                return kotlin.y.a;
            case 22:
                if (dVar instanceof com.app.mlounge.data.local.prefs.f0) {
                    f0Var = (com.app.mlounge.data.local.prefs.f0) dVar;
                    int i45 = f0Var.y;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        f0Var.y = i45 - Integer.MIN_VALUE;
                    } else {
                        f0Var = new com.app.mlounge.data.local.prefs.f0(this, dVar);
                    }
                } else {
                    f0Var = new com.app.mlounge.data.local.prefs.f0(this, dVar);
                }
                Object obj25 = f0Var.e;
                int i46 = f0Var.y;
                if (i46 == 0) {
                    kotlin.a.e(obj25);
                    Object objC9 = ((androidx.datastore.preferences.core.a) obj).c(y1.M0);
                    f0Var.y = 1;
                    Object objEmit23 = this.y.emit(objC9, f0Var);
                    kotlin.coroutines.intrinsics.a aVar23 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit23 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i46 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj25);
                }
                return kotlin.y.a;
            case 23:
                if (dVar instanceof com.app.mlounge.data.local.prefs.g0) {
                    g0Var = (com.app.mlounge.data.local.prefs.g0) dVar;
                    int i47 = g0Var.y;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        g0Var.y = i47 - Integer.MIN_VALUE;
                    } else {
                        g0Var = new com.app.mlounge.data.local.prefs.g0(this, dVar);
                    }
                } else {
                    g0Var = new com.app.mlounge.data.local.prefs.g0(this, dVar);
                }
                Object obj26 = g0Var.e;
                int i48 = g0Var.y;
                if (i48 == 0) {
                    kotlin.a.e(obj26);
                    Object objC10 = ((androidx.datastore.preferences.core.a) obj).c(y1.N0);
                    g0Var.y = 1;
                    Object objEmit24 = this.y.emit(objC10, g0Var);
                    kotlin.coroutines.intrinsics.a aVar24 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit24 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i48 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj26);
                }
                return kotlin.y.a;
            case 24:
                if (dVar instanceof com.app.mlounge.data.local.prefs.h0) {
                    h0Var = (com.app.mlounge.data.local.prefs.h0) dVar;
                    int i49 = h0Var.y;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        h0Var.y = i49 - Integer.MIN_VALUE;
                    } else {
                        h0Var = new com.app.mlounge.data.local.prefs.h0(this, dVar);
                    }
                } else {
                    h0Var = new com.app.mlounge.data.local.prefs.h0(this, dVar);
                }
                Object obj27 = h0Var.e;
                int i50 = h0Var.y;
                if (i50 == 0) {
                    kotlin.a.e(obj27);
                    String str4 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.O0);
                    if (str4 == null) {
                        str4 = "fit";
                    }
                    h0Var.y = 1;
                    Object objEmit25 = this.y.emit(str4, h0Var);
                    kotlin.coroutines.intrinsics.a aVar25 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit25 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i50 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj27);
                }
                return kotlin.y.a;
            case 25:
                if (dVar instanceof com.app.mlounge.data.local.prefs.i0) {
                    i0Var = (com.app.mlounge.data.local.prefs.i0) dVar;
                    int i51 = i0Var.y;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        i0Var.y = i51 - Integer.MIN_VALUE;
                    } else {
                        i0Var = new com.app.mlounge.data.local.prefs.i0(this, dVar);
                    }
                } else {
                    i0Var = new com.app.mlounge.data.local.prefs.i0(this, dVar);
                }
                Object obj28 = i0Var.e;
                int i52 = i0Var.y;
                if (i52 == 0) {
                    kotlin.a.e(obj28);
                    Boolean bool5 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.P0);
                    Boolean boolValueOf5 = Boolean.valueOf(bool5 != null ? bool5.booleanValue() : true);
                    i0Var.y = 1;
                    Object objEmit26 = this.y.emit(boolValueOf5, i0Var);
                    kotlin.coroutines.intrinsics.a aVar26 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit26 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i52 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj28);
                }
                return kotlin.y.a;
            case 26:
                if (dVar instanceof com.app.mlounge.data.local.prefs.j0) {
                    j0Var = (com.app.mlounge.data.local.prefs.j0) dVar;
                    int i53 = j0Var.y;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        j0Var.y = i53 - Integer.MIN_VALUE;
                    } else {
                        j0Var = new com.app.mlounge.data.local.prefs.j0(this, dVar);
                    }
                } else {
                    j0Var = new com.app.mlounge.data.local.prefs.j0(this, dVar);
                }
                Object obj29 = j0Var.e;
                int i54 = j0Var.y;
                if (i54 == 0) {
                    kotlin.a.e(obj29);
                    Boolean bool6 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.m0);
                    Boolean boolValueOf6 = Boolean.valueOf(bool6 != null ? bool6.booleanValue() : false);
                    j0Var.y = 1;
                    Object objEmit27 = this.y.emit(boolValueOf6, j0Var);
                    kotlin.coroutines.intrinsics.a aVar27 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit27 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i54 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj29);
                }
                return kotlin.y.a;
            case 27:
                if (dVar instanceof com.app.mlounge.data.local.prefs.k0) {
                    k0Var = (com.app.mlounge.data.local.prefs.k0) dVar;
                    int i55 = k0Var.y;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        k0Var.y = i55 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new com.app.mlounge.data.local.prefs.k0(this, dVar);
                    }
                } else {
                    k0Var = new com.app.mlounge.data.local.prefs.k0(this, dVar);
                }
                Object obj30 = k0Var.e;
                int i56 = k0Var.y;
                if (i56 == 0) {
                    kotlin.a.e(obj30);
                    Float f = (Float) ((androidx.datastore.preferences.core.a) obj).c(y1.Q0);
                    Float f2 = new Float(f != null ? f.floatValue() : 0.5f);
                    k0Var.y = 1;
                    Object objEmit28 = this.y.emit(f2, k0Var);
                    kotlin.coroutines.intrinsics.a aVar28 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit28 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i56 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj30);
                }
                return kotlin.y.a;
            case 28:
                if (dVar instanceof com.app.mlounge.data.local.prefs.l0) {
                    l0Var = (com.app.mlounge.data.local.prefs.l0) dVar;
                    int i57 = l0Var.y;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        l0Var.y = i57 - Integer.MIN_VALUE;
                    } else {
                        l0Var = new com.app.mlounge.data.local.prefs.l0(this, dVar);
                    }
                } else {
                    l0Var = new com.app.mlounge.data.local.prefs.l0(this, dVar);
                }
                Object obj31 = l0Var.e;
                int i58 = l0Var.y;
                if (i58 == 0) {
                    kotlin.a.e(obj31);
                    Boolean bool7 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.R0);
                    Boolean boolValueOf7 = Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false);
                    l0Var.y = 1;
                    Object objEmit29 = this.y.emit(boolValueOf7, l0Var);
                    kotlin.coroutines.intrinsics.a aVar29 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit29 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i58 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj31);
                }
                return kotlin.y.a;
            default:
                if (dVar instanceof com.app.mlounge.data.local.prefs.m0) {
                    m0Var = (com.app.mlounge.data.local.prefs.m0) dVar;
                    int i59 = m0Var.y;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        m0Var.y = i59 - Integer.MIN_VALUE;
                    } else {
                        m0Var = new com.app.mlounge.data.local.prefs.m0(this, dVar);
                    }
                } else {
                    m0Var = new com.app.mlounge.data.local.prefs.m0(this, dVar);
                }
                Object obj32 = m0Var.e;
                int i60 = m0Var.y;
                if (i60 == 0) {
                    kotlin.a.e(obj32);
                    Boolean bool8 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.S0);
                    Boolean boolValueOf8 = Boolean.valueOf(bool8 != null ? bool8.booleanValue() : true);
                    m0Var.y = 1;
                    Object objEmit30 = this.y.emit(boolValueOf8, m0Var);
                    kotlin.coroutines.intrinsics.a aVar30 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit30 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i60 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj32);
                }
                return kotlin.y.a;
        }
    }
}
