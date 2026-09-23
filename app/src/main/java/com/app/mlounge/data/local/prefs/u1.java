package com.app.mlounge.data.local.prefs;

import com.app.mlounge.ui.viewmodel.a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector y;

    public /* synthetic */ u1(FlowCollector flowCollector, int i) {
        this.e = i;
        this.y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0211  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:178:0x0315  */
    /* JADX WARN: Code duplicated, block: B:194:0x035d  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        t1 t1Var;
        w1 w1Var;
        x1 x1Var;
        com.app.mlounge.data.repository.k0 k0Var;
        com.app.mlounge.data.repository.n0 n0Var;
        com.app.mlounge.data.repository.o0 o0Var;
        com.app.mlounge.ui.viewmodel.e0 e0Var;
        com.app.mlounge.ui.viewmodel.m1 m1Var;
        a2 a2Var;
        switch (this.e) {
            case 0:
                if (dVar instanceof t1) {
                    t1Var = (t1) dVar;
                    int i = t1Var.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t1Var.y = i - Integer.MIN_VALUE;
                    } else {
                        t1Var = new t1(this, dVar);
                    }
                } else {
                    t1Var = new t1(this, dVar);
                }
                Object obj2 = t1Var.e;
                int i2 = t1Var.y;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    Object objC = ((androidx.datastore.preferences.core.a) obj).c(y1.q0);
                    t1Var.y = 1;
                    Object objEmit = this.y.emit(objC, t1Var);
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
                if (dVar instanceof w1) {
                    w1Var = (w1) dVar;
                    int i3 = w1Var.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w1Var.y = i3 - Integer.MIN_VALUE;
                    } else {
                        w1Var = new w1(this, dVar);
                    }
                } else {
                    w1Var = new w1(this, dVar);
                }
                Object obj3 = w1Var.e;
                int i4 = w1Var.y;
                if (i4 == 0) {
                    kotlin.a.e(obj3);
                    Object objC2 = ((androidx.datastore.preferences.core.a) obj).c(y1.r0);
                    w1Var.y = 1;
                    Object objEmit2 = this.y.emit(objC2, w1Var);
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
                if (dVar instanceof x1) {
                    x1Var = (x1) dVar;
                    int i5 = x1Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        x1Var.y = i5 - Integer.MIN_VALUE;
                    } else {
                        x1Var = new x1(this, dVar);
                    }
                } else {
                    x1Var = new x1(this, dVar);
                }
                Object obj4 = x1Var.e;
                int i6 = x1Var.y;
                if (i6 == 0) {
                    kotlin.a.e(obj4);
                    Object objC3 = ((androidx.datastore.preferences.core.a) obj).c(y1.s0);
                    x1Var.y = 1;
                    Object objEmit3 = this.y.emit(objC3, x1Var);
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
                if (dVar instanceof com.app.mlounge.data.repository.k0) {
                    k0Var = (com.app.mlounge.data.repository.k0) dVar;
                    int i7 = k0Var.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        k0Var.y = i7 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new com.app.mlounge.data.repository.k0(this, dVar);
                    }
                } else {
                    k0Var = new com.app.mlounge.data.repository.k0(this, dVar);
                }
                Object obj5 = k0Var.e;
                int i8 = k0Var.y;
                if (i8 == 0) {
                    kotlin.a.e(obj5);
                    List<com.app.mlounge.data.local.entity.e> list = (List) obj;
                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(list, 10));
                    if (iJ < 16) {
                        iJ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
                    for (com.app.mlounge.data.local.entity.e eVar : list) {
                        linkedHashMap.put(eVar.a, new Float(eVar.a()));
                    }
                    k0Var.y = 1;
                    Object objEmit4 = this.y.emit(linkedHashMap, k0Var);
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
                if (dVar instanceof com.app.mlounge.data.repository.n0) {
                    n0Var = (com.app.mlounge.data.repository.n0) dVar;
                    int i9 = n0Var.y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        n0Var.y = i9 - Integer.MIN_VALUE;
                    } else {
                        n0Var = new com.app.mlounge.data.repository.n0(this, dVar);
                    }
                } else {
                    n0Var = new com.app.mlounge.data.repository.n0(this, dVar);
                }
                Object obj6 = n0Var.e;
                int i10 = n0Var.y;
                if (i10 == 0) {
                    kotlin.a.e(obj6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : (List) obj) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj7).b, "tv")) {
                            arrayList.add(obj7);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = ((com.app.mlounge.data.local.entity.c) it.next()).l;
                        Integer numW = str != null ? kotlin.text.r.w(str) : null;
                        if (numW != null) {
                            arrayList2.add(numW);
                        }
                    }
                    Set setF0 = kotlin.collections.p.f0(arrayList2);
                    n0Var.y = 1;
                    Object objEmit5 = this.y.emit(setF0, n0Var);
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
                if (dVar instanceof com.app.mlounge.data.repository.o0) {
                    o0Var = (com.app.mlounge.data.repository.o0) dVar;
                    int i11 = o0Var.y;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        o0Var.y = i11 - Integer.MIN_VALUE;
                    } else {
                        o0Var = new com.app.mlounge.data.repository.o0(this, dVar);
                    }
                } else {
                    o0Var = new com.app.mlounge.data.repository.o0(this, dVar);
                }
                Object obj8 = o0Var.e;
                int i12 = o0Var.y;
                if (i12 == 0) {
                    kotlin.a.e(obj8);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((Set) obj).iterator();
                    while (true) {
                        Integer numW2 = null;
                        if (it2.hasNext()) {
                            List listU = kotlin.text.k.U((String) it2.next(), new String[]{":"}, 6);
                            if (listU.size() == 4 && kotlin.jvm.internal.l.a(listU.get(0), "tv")) {
                                numW2 = kotlin.text.r.w((String) listU.get(1));
                            }
                            if (numW2 != null) {
                                arrayList3.add(numW2);
                            }
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                Integer numValueOf = Integer.valueOf(((Number) it3.next()).intValue());
                                Object xVar = linkedHashMap2.get(numValueOf);
                                if (xVar == null && !linkedHashMap2.containsKey(numValueOf)) {
                                    xVar = new kotlin.jvm.internal.x();
                                }
                                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) xVar;
                                xVar2.e++;
                                linkedHashMap2.put(numValueOf, xVar2);
                            }
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                entry.getClass();
                                if ((entry instanceof kotlin.jvm.internal.markers.a) && !(entry instanceof kotlin.jvm.internal.markers.c)) {
                                    kotlin.jvm.internal.c0.g(entry, "kotlin.collections.MutableMap.MutableEntry");
                                    throw null;
                                }
                                entry.setValue(Integer.valueOf(((kotlin.jvm.internal.x) entry.getValue()).e));
                            }
                            Map mapB = kotlin.jvm.internal.c0.b(linkedHashMap2);
                            o0Var.y = 1;
                            Object objEmit6 = this.y.emit(mapB, o0Var);
                            kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                            if (objEmit6 == aVar6) {
                                return aVar6;
                            }
                        }
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
                if (dVar instanceof com.app.mlounge.ui.viewmodel.e0) {
                    e0Var = (com.app.mlounge.ui.viewmodel.e0) dVar;
                    int i13 = e0Var.y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        e0Var.y = i13 - Integer.MIN_VALUE;
                    } else {
                        e0Var = new com.app.mlounge.ui.viewmodel.e0(this, dVar);
                    }
                } else {
                    e0Var = new com.app.mlounge.ui.viewmodel.e0(this, dVar);
                }
                Object obj9 = e0Var.e;
                int i14 = e0Var.y;
                if (i14 == 0) {
                    kotlin.a.e(obj9);
                    String str2 = (String) obj;
                    Boolean boolValueOf = Boolean.valueOf(!(str2 == null || kotlin.text.k.J(str2)));
                    e0Var.y = 1;
                    Object objEmit7 = this.y.emit(boolValueOf, e0Var);
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
                if (dVar instanceof com.app.mlounge.ui.viewmodel.m1) {
                    m1Var = (com.app.mlounge.ui.viewmodel.m1) dVar;
                    int i15 = m1Var.y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        m1Var.y = i15 - Integer.MIN_VALUE;
                    } else {
                        m1Var = new com.app.mlounge.ui.viewmodel.m1(this, dVar);
                    }
                } else {
                    m1Var = new com.app.mlounge.ui.viewmodel.m1(this, dVar);
                }
                Object obj10 = m1Var.e;
                int i16 = m1Var.y;
                if (i16 == 0) {
                    kotlin.a.e(obj10);
                    String str3 = (String) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(!(str3 == null || kotlin.text.k.J(str3)));
                    m1Var.y = 1;
                    Object objEmit8 = this.y.emit(boolValueOf2, m1Var);
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
            default:
                if (dVar instanceof a2) {
                    a2Var = (a2) dVar;
                    int i17 = a2Var.y;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        a2Var.y = i17 - Integer.MIN_VALUE;
                    } else {
                        a2Var = new a2(this, dVar);
                    }
                } else {
                    a2Var = new a2(this, dVar);
                }
                Object obj11 = a2Var.e;
                int i18 = a2Var.y;
                if (i18 == 0) {
                    kotlin.a.e(obj11);
                    String str4 = (String) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(!(str4 == null || kotlin.text.k.J(str4)));
                    a2Var.y = 1;
                    Object objEmit9 = this.y.emit(boolValueOf3, a2Var);
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
        }
    }
}
