package com.app.mlounge.data.local.prefs;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector y;

    public /* synthetic */ o0(FlowCollector flowCollector, int i) {
        this.e = i;
        this.y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:142:0x024e  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:200:0x0341  */
    /* JADX WARN: Code duplicated, block: B:219:0x038f  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:258:0x0433  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:277:0x0481  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:315:0x051d  */
    /* JADX WARN: Code duplicated, block: B:350:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:369:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:388:0x0643  */
    /* JADX WARN: Code duplicated, block: B:408:0x0699  */
    /* JADX WARN: Code duplicated, block: B:431:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:450:0x0748  */
    /* JADX WARN: Code duplicated, block: B:470:0x079e  */
    /* JADX WARN: Code duplicated, block: B:490:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:506:0x083c  */
    /* JADX WARN: Code duplicated, block: B:522:0x0884  */
    /* JADX WARN: Code duplicated, block: B:542:0x08db  */
    /* JADX WARN: Code duplicated, block: B:558:0x0923  */
    /* JADX WARN: Code duplicated, block: B:577:0x0971  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0152  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        n0 n0Var;
        p0 p0Var;
        r0 r0Var;
        s0 s0Var;
        t0 t0Var;
        u0 u0Var;
        v0 v0Var;
        w0 w0Var;
        x0 x0Var;
        y0 y0Var;
        z0 z0Var;
        a1 a1Var;
        b1 b1Var;
        c1 c1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        d1 d1Var;
        e1 e1Var;
        f1 f1Var;
        g1 g1Var;
        h1 h1Var;
        i1 i1Var;
        j1 j1Var;
        k1 k1Var;
        l1 l1Var;
        m1 m1Var;
        n1 n1Var;
        o1 o1Var;
        p1 p1Var;
        q1 q1Var;
        r1 r1Var;
        s1 s1Var;
        switch (this.e) {
            case 0:
                if (dVar instanceof n0) {
                    n0Var = (n0) dVar;
                    int i = n0Var.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n0Var.y = i - Integer.MIN_VALUE;
                    } else {
                        n0Var = new n0(this, dVar);
                    }
                } else {
                    n0Var = new n0(this, dVar);
                }
                Object obj2 = n0Var.e;
                int i2 = n0Var.y;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    Boolean bool = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.T0);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    n0Var.y = 1;
                    Object objEmit = this.y.emit(boolValueOf, n0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj2);
                }
                return kotlin.y.a;
            case 1:
                if (dVar instanceof p0) {
                    p0Var = (p0) dVar;
                    int i3 = p0Var.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p0Var.y = i3 - Integer.MIN_VALUE;
                    } else {
                        p0Var = new p0(this, dVar);
                    }
                } else {
                    p0Var = new p0(this, dVar);
                }
                Object obj3 = p0Var.e;
                int i4 = p0Var.y;
                if (i4 == 0) {
                    kotlin.a.e(obj3);
                    String str = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.U0);
                    if (str == null) {
                        str = "";
                    }
                    p0Var.y = 1;
                    Object objEmit2 = this.y.emit(str, p0Var);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj3);
                }
                return kotlin.y.a;
            case 2:
                if (dVar instanceof r0) {
                    r0Var = (r0) dVar;
                    int i5 = r0Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        r0Var.y = i5 - Integer.MIN_VALUE;
                    } else {
                        r0Var = new r0(this, dVar);
                    }
                } else {
                    r0Var = new r0(this, dVar);
                }
                Object obj4 = r0Var.e;
                int i6 = r0Var.y;
                if (i6 == 0) {
                    kotlin.a.e(obj4);
                    Object objC = ((androidx.datastore.preferences.core.a) obj).c(y1.V0);
                    r0Var.y = 1;
                    Object objEmit3 = this.y.emit(objC, r0Var);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj4);
                }
                return kotlin.y.a;
            case 3:
                if (dVar instanceof s0) {
                    s0Var = (s0) dVar;
                    int i7 = s0Var.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        s0Var.y = i7 - Integer.MIN_VALUE;
                    } else {
                        s0Var = new s0(this, dVar);
                    }
                } else {
                    s0Var = new s0(this, dVar);
                }
                Object obj5 = s0Var.e;
                int i8 = s0Var.y;
                if (i8 == 0) {
                    kotlin.a.e(obj5);
                    Integer num = (Integer) ((androidx.datastore.preferences.core.a) obj).c(y1.W0);
                    Integer num2 = new Integer(num != null ? num.intValue() : 3);
                    s0Var.y = 1;
                    Object objEmit4 = this.y.emit(num2, s0Var);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i8 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj5);
                }
                return kotlin.y.a;
            case 4:
                if (dVar instanceof t0) {
                    t0Var = (t0) dVar;
                    int i9 = t0Var.y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        t0Var.y = i9 - Integer.MIN_VALUE;
                    } else {
                        t0Var = new t0(this, dVar);
                    }
                } else {
                    t0Var = new t0(this, dVar);
                }
                Object obj6 = t0Var.e;
                int i10 = t0Var.y;
                if (i10 == 0) {
                    kotlin.a.e(obj6);
                    Object objC2 = ((androidx.datastore.preferences.core.a) obj).c(y1.X0);
                    t0Var.y = 1;
                    Object objEmit5 = this.y.emit(objC2, t0Var);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i10 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj6);
                }
                return kotlin.y.a;
            case 5:
                if (dVar instanceof u0) {
                    u0Var = (u0) dVar;
                    int i11 = u0Var.y;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        u0Var.y = i11 - Integer.MIN_VALUE;
                    } else {
                        u0Var = new u0(this, dVar);
                    }
                } else {
                    u0Var = new u0(this, dVar);
                }
                Object obj7 = u0Var.e;
                int i12 = u0Var.y;
                if (i12 == 0) {
                    kotlin.a.e(obj7);
                    Object objC3 = ((androidx.datastore.preferences.core.a) obj).c(y1.Y0);
                    u0Var.y = 1;
                    Object objEmit6 = this.y.emit(objC3, u0Var);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj7);
                }
                return kotlin.y.a;
            case 6:
                if (dVar instanceof v0) {
                    v0Var = (v0) dVar;
                    int i13 = v0Var.y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        v0Var.y = i13 - Integer.MIN_VALUE;
                    } else {
                        v0Var = new v0(this, dVar);
                    }
                } else {
                    v0Var = new v0(this, dVar);
                }
                Object obj8 = v0Var.e;
                int i14 = v0Var.y;
                if (i14 == 0) {
                    kotlin.a.e(obj8);
                    Boolean bool2 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.Z0);
                    Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
                    v0Var.y = 1;
                    Object objEmit7 = this.y.emit(boolValueOf2, v0Var);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit7 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj8);
                }
                return kotlin.y.a;
            case 7:
                if (dVar instanceof w0) {
                    w0Var = (w0) dVar;
                    int i15 = w0Var.y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        w0Var.y = i15 - Integer.MIN_VALUE;
                    } else {
                        w0Var = new w0(this, dVar);
                    }
                } else {
                    w0Var = new w0(this, dVar);
                }
                Object obj9 = w0Var.e;
                int i16 = w0Var.y;
                if (i16 == 0) {
                    kotlin.a.e(obj9);
                    Boolean bool3 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.n0);
                    Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
                    w0Var.y = 1;
                    Object objEmit8 = this.y.emit(boolValueOf3, w0Var);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit8 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj9);
                }
                return kotlin.y.a;
            case 8:
                if (dVar instanceof x0) {
                    x0Var = (x0) dVar;
                    int i17 = x0Var.y;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        x0Var.y = i17 - Integer.MIN_VALUE;
                    } else {
                        x0Var = new x0(this, dVar);
                    }
                } else {
                    x0Var = new x0(this, dVar);
                }
                Object obj10 = x0Var.e;
                int i18 = x0Var.y;
                if (i18 == 0) {
                    kotlin.a.e(obj10);
                    Collection collection = (Set) ((androidx.datastore.preferences.core.a) obj).c(y1.a1);
                    if (collection == null) {
                        collection = kotlin.collections.y.e;
                    }
                    x0Var.y = 1;
                    Object objEmit9 = this.y.emit(collection, x0Var);
                    kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit9 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj10);
                }
                return kotlin.y.a;
            case 9:
                if (dVar instanceof y0) {
                    y0Var = (y0) dVar;
                    int i19 = y0Var.y;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        y0Var.y = i19 - Integer.MIN_VALUE;
                    } else {
                        y0Var = new y0(this, dVar);
                    }
                } else {
                    y0Var = new y0(this, dVar);
                }
                Object obj11 = y0Var.e;
                int i20 = y0Var.y;
                if (i20 == 0) {
                    kotlin.a.e(obj11);
                    String str2 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.b1);
                    List listU = (str2 == null || str2.length() == 0) ? kotlin.collections.w.e : kotlin.text.k.U(str2, new String[]{","}, 6);
                    y0Var.y = 1;
                    Object objEmit10 = this.y.emit(listU, y0Var);
                    kotlin.coroutines.intrinsics.a aVar10 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit10 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj11);
                }
                return kotlin.y.a;
            case 10:
                if (dVar instanceof z0) {
                    z0Var = (z0) dVar;
                    int i21 = z0Var.y;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        z0Var.y = i21 - Integer.MIN_VALUE;
                    } else {
                        z0Var = new z0(this, dVar);
                    }
                } else {
                    z0Var = new z0(this, dVar);
                }
                Object obj12 = z0Var.e;
                int i22 = z0Var.y;
                if (i22 == 0) {
                    kotlin.a.e(obj12);
                    Boolean bool4 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.c1);
                    Boolean boolValueOf4 = Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false);
                    z0Var.y = 1;
                    Object objEmit11 = this.y.emit(boolValueOf4, z0Var);
                    kotlin.coroutines.intrinsics.a aVar11 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit11 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj12);
                }
                return kotlin.y.a;
            case 11:
                if (dVar instanceof a1) {
                    a1Var = (a1) dVar;
                    int i23 = a1Var.y;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        a1Var.y = i23 - Integer.MIN_VALUE;
                    } else {
                        a1Var = new a1(this, dVar);
                    }
                } else {
                    a1Var = new a1(this, dVar);
                }
                Object obj13 = a1Var.e;
                int i24 = a1Var.y;
                if (i24 == 0) {
                    kotlin.a.e(obj13);
                    String str3 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.d1);
                    if (str3 == null) {
                        str3 = "MEDIUM";
                    }
                    a1Var.y = 1;
                    Object objEmit12 = this.y.emit(str3, a1Var);
                    kotlin.coroutines.intrinsics.a aVar12 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit12 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i24 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj13);
                }
                return kotlin.y.a;
            case 12:
                if (dVar instanceof b1) {
                    b1Var = (b1) dVar;
                    int i25 = b1Var.y;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        b1Var.y = i25 - Integer.MIN_VALUE;
                    } else {
                        b1Var = new b1(this, dVar);
                    }
                } else {
                    b1Var = new b1(this, dVar);
                }
                Object obj14 = b1Var.e;
                int i26 = b1Var.y;
                if (i26 == 0) {
                    kotlin.a.e(obj14);
                    String str4 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.e1);
                    if (str4 == null) {
                        str4 = "MEDIUM";
                    }
                    b1Var.y = 1;
                    Object objEmit13 = this.y.emit(str4, b1Var);
                    kotlin.coroutines.intrinsics.a aVar13 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit13 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i26 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj14);
                }
                return kotlin.y.a;
            case 13:
                if (dVar instanceof c1) {
                    c1Var = (c1) dVar;
                    int i27 = c1Var.y;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c1Var.y = i27 - Integer.MIN_VALUE;
                    } else {
                        c1Var = new c1(this, dVar);
                    }
                } else {
                    c1Var = new c1(this, dVar);
                }
                Object obj15 = c1Var.e;
                int i28 = c1Var.y;
                if (i28 == 0) {
                    kotlin.a.e(obj15);
                    androidx.datastore.preferences.core.a aVar14 = (androidx.datastore.preferences.core.a) obj;
                    CharSequence charSequence4 = (CharSequence) aVar14.c(y1.p0);
                    Boolean boolValueOf5 = Boolean.valueOf(((charSequence4 == null || charSequence4.length() == 0) && ((charSequence = (CharSequence) aVar14.c(y1.q0)) == null || charSequence.length() == 0) && (((charSequence2 = (CharSequence) aVar14.c(y1.r0)) == null || charSequence2.length() == 0) && ((charSequence3 = (CharSequence) aVar14.c(y1.s0)) == null || charSequence3.length() == 0))) ? false : true);
                    c1Var.y = 1;
                    Object objEmit14 = this.y.emit(boolValueOf5, c1Var);
                    kotlin.coroutines.intrinsics.a aVar15 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit14 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i28 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj15);
                }
                return kotlin.y.a;
            case 14:
                if (dVar instanceof d1) {
                    d1Var = (d1) dVar;
                    int i29 = d1Var.y;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        d1Var.y = i29 - Integer.MIN_VALUE;
                    } else {
                        d1Var = new d1(this, dVar);
                    }
                } else {
                    d1Var = new d1(this, dVar);
                }
                Object obj16 = d1Var.e;
                int i30 = d1Var.y;
                if (i30 == 0) {
                    kotlin.a.e(obj16);
                    String str5 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.f1);
                    if (str5 == null) {
                        str5 = "m3u";
                    }
                    d1Var.y = 1;
                    Object objEmit15 = this.y.emit(str5, d1Var);
                    kotlin.coroutines.intrinsics.a aVar16 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit15 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i30 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj16);
                }
                return kotlin.y.a;
            case 15:
                if (dVar instanceof e1) {
                    e1Var = (e1) dVar;
                    int i31 = e1Var.y;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        e1Var.y = i31 - Integer.MIN_VALUE;
                    } else {
                        e1Var = new e1(this, dVar);
                    }
                } else {
                    e1Var = new e1(this, dVar);
                }
                Object obj17 = e1Var.e;
                int i32 = e1Var.y;
                if (i32 == 0) {
                    kotlin.a.e(obj17);
                    String str6 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.g1);
                    if (str6 == null) {
                        str6 = "";
                    }
                    e1Var.y = 1;
                    Object objEmit16 = this.y.emit(str6, e1Var);
                    kotlin.coroutines.intrinsics.a aVar17 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit16 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i32 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj17);
                }
                return kotlin.y.a;
            case 16:
                if (dVar instanceof f1) {
                    f1Var = (f1) dVar;
                    int i33 = f1Var.y;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        f1Var.y = i33 - Integer.MIN_VALUE;
                    } else {
                        f1Var = new f1(this, dVar);
                    }
                } else {
                    f1Var = new f1(this, dVar);
                }
                Object obj18 = f1Var.e;
                int i34 = f1Var.y;
                if (i34 == 0) {
                    kotlin.a.e(obj18);
                    String str7 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.h1);
                    if (str7 == null) {
                        str7 = "";
                    }
                    f1Var.y = 1;
                    Object objEmit17 = this.y.emit(str7, f1Var);
                    kotlin.coroutines.intrinsics.a aVar18 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit17 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i34 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj18);
                }
                return kotlin.y.a;
            case 17:
                if (dVar instanceof g1) {
                    g1Var = (g1) dVar;
                    int i35 = g1Var.y;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g1Var.y = i35 - Integer.MIN_VALUE;
                    } else {
                        g1Var = new g1(this, dVar);
                    }
                } else {
                    g1Var = new g1(this, dVar);
                }
                Object obj19 = g1Var.e;
                int i36 = g1Var.y;
                if (i36 == 0) {
                    kotlin.a.e(obj19);
                    String str8 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.i1);
                    if (str8 == null) {
                        str8 = "";
                    }
                    g1Var.y = 1;
                    Object objEmit18 = this.y.emit(str8, g1Var);
                    kotlin.coroutines.intrinsics.a aVar19 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit18 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i36 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj19);
                }
                return kotlin.y.a;
            case 18:
                if (dVar instanceof h1) {
                    h1Var = (h1) dVar;
                    int i37 = h1Var.y;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        h1Var.y = i37 - Integer.MIN_VALUE;
                    } else {
                        h1Var = new h1(this, dVar);
                    }
                } else {
                    h1Var = new h1(this, dVar);
                }
                Object obj20 = h1Var.e;
                int i38 = h1Var.y;
                if (i38 == 0) {
                    kotlin.a.e(obj20);
                    Boolean bool5 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.o0);
                    Boolean boolValueOf6 = Boolean.valueOf(bool5 != null ? bool5.booleanValue() : false);
                    h1Var.y = 1;
                    Object objEmit19 = this.y.emit(boolValueOf6, h1Var);
                    kotlin.coroutines.intrinsics.a aVar20 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit19 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i38 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj20);
                }
                return kotlin.y.a;
            case 19:
                if (dVar instanceof i1) {
                    i1Var = (i1) dVar;
                    int i39 = i1Var.y;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        i1Var.y = i39 - Integer.MIN_VALUE;
                    } else {
                        i1Var = new i1(this, dVar);
                    }
                } else {
                    i1Var = new i1(this, dVar);
                }
                Object obj21 = i1Var.e;
                int i40 = i1Var.y;
                if (i40 == 0) {
                    kotlin.a.e(obj21);
                    String str9 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.j1);
                    if (str9 == null) {
                        str9 = "";
                    }
                    i1Var.y = 1;
                    Object objEmit20 = this.y.emit(str9, i1Var);
                    kotlin.coroutines.intrinsics.a aVar21 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit20 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i40 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj21);
                }
                return kotlin.y.a;
            case 20:
                if (dVar instanceof j1) {
                    j1Var = (j1) dVar;
                    int i41 = j1Var.y;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        j1Var.y = i41 - Integer.MIN_VALUE;
                    } else {
                        j1Var = new j1(this, dVar);
                    }
                } else {
                    j1Var = new j1(this, dVar);
                }
                Object obj22 = j1Var.e;
                int i42 = j1Var.y;
                if (i42 == 0) {
                    kotlin.a.e(obj22);
                    String str10 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.k1);
                    if (str10 == null) {
                        str10 = "";
                    }
                    j1Var.y = 1;
                    Object objEmit21 = this.y.emit(str10, j1Var);
                    kotlin.coroutines.intrinsics.a aVar22 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit21 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i42 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj22);
                }
                return kotlin.y.a;
            case 21:
                if (dVar instanceof k1) {
                    k1Var = (k1) dVar;
                    int i43 = k1Var.y;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        k1Var.y = i43 - Integer.MIN_VALUE;
                    } else {
                        k1Var = new k1(this, dVar);
                    }
                } else {
                    k1Var = new k1(this, dVar);
                }
                Object obj23 = k1Var.e;
                int i44 = k1Var.y;
                if (i44 == 0) {
                    kotlin.a.e(obj23);
                    String str11 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.l1);
                    if (str11 == null) {
                        str11 = "";
                    }
                    k1Var.y = 1;
                    Object objEmit22 = this.y.emit(str11, k1Var);
                    kotlin.coroutines.intrinsics.a aVar23 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit22 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i44 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj23);
                }
                return kotlin.y.a;
            case 22:
                if (dVar instanceof l1) {
                    l1Var = (l1) dVar;
                    int i45 = l1Var.y;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        l1Var.y = i45 - Integer.MIN_VALUE;
                    } else {
                        l1Var = new l1(this, dVar);
                    }
                } else {
                    l1Var = new l1(this, dVar);
                }
                Object obj24 = l1Var.e;
                int i46 = l1Var.y;
                if (i46 == 0) {
                    kotlin.a.e(obj24);
                    Integer num3 = (Integer) ((androidx.datastore.preferences.core.a) obj).c(y1.m1);
                    Integer num4 = new Integer(num3 != null ? num3.intValue() : 0);
                    l1Var.y = 1;
                    Object objEmit23 = this.y.emit(num4, l1Var);
                    kotlin.coroutines.intrinsics.a aVar24 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit23 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i46 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj24);
                }
                return kotlin.y.a;
            case 23:
                if (dVar instanceof m1) {
                    m1Var = (m1) dVar;
                    int i47 = m1Var.y;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        m1Var.y = i47 - Integer.MIN_VALUE;
                    } else {
                        m1Var = new m1(this, dVar);
                    }
                } else {
                    m1Var = new m1(this, dVar);
                }
                Object obj25 = m1Var.e;
                int i48 = m1Var.y;
                if (i48 == 0) {
                    kotlin.a.e(obj25);
                    Long l = (Long) ((androidx.datastore.preferences.core.a) obj).c(y1.n1);
                    Long l2 = new Long(l != null ? l.longValue() : 0L);
                    m1Var.y = 1;
                    Object objEmit24 = this.y.emit(l2, m1Var);
                    kotlin.coroutines.intrinsics.a aVar25 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit24 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i48 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj25);
                }
                return kotlin.y.a;
            case 24:
                if (dVar instanceof n1) {
                    n1Var = (n1) dVar;
                    int i49 = n1Var.y;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        n1Var.y = i49 - Integer.MIN_VALUE;
                    } else {
                        n1Var = new n1(this, dVar);
                    }
                } else {
                    n1Var = new n1(this, dVar);
                }
                Object obj26 = n1Var.e;
                int i50 = n1Var.y;
                if (i50 == 0) {
                    kotlin.a.e(obj26);
                    Boolean bool6 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.o1);
                    Boolean boolValueOf7 = Boolean.valueOf(bool6 != null ? bool6.booleanValue() : false);
                    n1Var.y = 1;
                    Object objEmit25 = this.y.emit(boolValueOf7, n1Var);
                    kotlin.coroutines.intrinsics.a aVar26 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit25 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i50 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj26);
                }
                return kotlin.y.a;
            case 25:
                if (dVar instanceof o1) {
                    o1Var = (o1) dVar;
                    int i51 = o1Var.y;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        o1Var.y = i51 - Integer.MIN_VALUE;
                    } else {
                        o1Var = new o1(this, dVar);
                    }
                } else {
                    o1Var = new o1(this, dVar);
                }
                Object obj27 = o1Var.e;
                int i52 = o1Var.y;
                if (i52 == 0) {
                    kotlin.a.e(obj27);
                    String str12 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.q1);
                    if (str12 == null) {
                        str12 = "";
                    }
                    o1Var.y = 1;
                    Object objEmit26 = this.y.emit(str12, o1Var);
                    kotlin.coroutines.intrinsics.a aVar27 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit26 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i52 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj27);
                }
                return kotlin.y.a;
            case 26:
                if (dVar instanceof p1) {
                    p1Var = (p1) dVar;
                    int i53 = p1Var.y;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        p1Var.y = i53 - Integer.MIN_VALUE;
                    } else {
                        p1Var = new p1(this, dVar);
                    }
                } else {
                    p1Var = new p1(this, dVar);
                }
                Object obj28 = p1Var.e;
                int i54 = p1Var.y;
                if (i54 == 0) {
                    kotlin.a.e(obj28);
                    String str13 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.r1);
                    if (str13 == null) {
                        str13 = "";
                    }
                    p1Var.y = 1;
                    Object objEmit27 = this.y.emit(str13, p1Var);
                    kotlin.coroutines.intrinsics.a aVar28 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit27 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i54 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj28);
                }
                return kotlin.y.a;
            case 27:
                if (dVar instanceof q1) {
                    q1Var = (q1) dVar;
                    int i55 = q1Var.y;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        q1Var.y = i55 - Integer.MIN_VALUE;
                    } else {
                        q1Var = new q1(this, dVar);
                    }
                } else {
                    q1Var = new q1(this, dVar);
                }
                Object obj29 = q1Var.e;
                int i56 = q1Var.y;
                if (i56 == 0) {
                    kotlin.a.e(obj29);
                    Boolean bool7 = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.p1);
                    Boolean boolValueOf8 = Boolean.valueOf(bool7 != null ? bool7.booleanValue() : true);
                    q1Var.y = 1;
                    Object objEmit28 = this.y.emit(boolValueOf8, q1Var);
                    kotlin.coroutines.intrinsics.a aVar29 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit28 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i56 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj29);
                }
                return kotlin.y.a;
            case 28:
                if (dVar instanceof r1) {
                    r1Var = (r1) dVar;
                    int i57 = r1Var.y;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        r1Var.y = i57 - Integer.MIN_VALUE;
                    } else {
                        r1Var = new r1(this, dVar);
                    }
                } else {
                    r1Var = new r1(this, dVar);
                }
                Object obj30 = r1Var.e;
                int i58 = r1Var.y;
                if (i58 == 0) {
                    kotlin.a.e(obj30);
                    String str14 = (String) ((androidx.datastore.preferences.core.a) obj).c(y1.s1);
                    if (str14 == null) {
                        str14 = "";
                    }
                    r1Var.y = 1;
                    Object objEmit29 = this.y.emit(str14, r1Var);
                    kotlin.coroutines.intrinsics.a aVar30 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit29 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i58 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj30);
                }
                return kotlin.y.a;
            default:
                if (dVar instanceof s1) {
                    s1Var = (s1) dVar;
                    int i59 = s1Var.y;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        s1Var.y = i59 - Integer.MIN_VALUE;
                    } else {
                        s1Var = new s1(this, dVar);
                    }
                } else {
                    s1Var = new s1(this, dVar);
                }
                Object obj31 = s1Var.e;
                int i60 = s1Var.y;
                if (i60 == 0) {
                    kotlin.a.e(obj31);
                    Object objC4 = ((androidx.datastore.preferences.core.a) obj).c(y1.p0);
                    s1Var.y = 1;
                    Object objEmit30 = this.y.emit(objC4, s1Var);
                    kotlin.coroutines.intrinsics.a aVar31 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit30 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i60 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj31);
                }
                return kotlin.y.a;
        }
    }
}
