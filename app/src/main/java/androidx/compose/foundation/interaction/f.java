package androidx.compose.foundation.interaction;

import android.os.Environment;
import androidx.compose.animation.core.a0;
import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.k2;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.foundation.text.selection.l0;
import androidx.compose.material3.c6;
import androidx.compose.material3.e1;
import androidx.compose.material3.internal.i0;
import androidx.compose.material3.internal.k0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.j0;
import com.app.mlounge.ui.viewmodel.u1;
import com.app.mlounge.ui.viewmodel.w1;
import com.app.mlounge.ui.viewmodel.z1;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0337  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        float f;
        i0 i0Var;
        n nVar;
        l lVar;
        Object nVar2;
        String str;
        com.app.mlounge.ui.viewmodel.n nVar3;
        u1 u1Var;
        switch (this.e) {
            case 0:
                i iVar = (i) obj;
                ArrayList arrayList = (ArrayList) this.y;
                if (iVar instanceof d) {
                    arrayList.add(iVar);
                } else if (iVar instanceof e) {
                    arrayList.remove(((e) iVar).a);
                }
                ((a1) this.z).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return y.a;
            case 1:
                long j = ((androidx.compose.ui.geometry.b) obj).a;
                androidx.compose.animation.core.d dVar2 = (androidx.compose.animation.core.d) this.y;
                long j2 = ((androidx.compose.ui.geometry.b) dVar2.d()).a & 9223372034707292159L;
                y yVar = y.a;
                if (j2 == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) dVar2.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objE = dVar2.e(new androidx.compose.ui.geometry.b(j), dVar);
                    return objE == kotlin.coroutines.intrinsics.a.e ? objE : yVar;
                }
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.z, null, null, new l0(dVar2, j, null, 0), 3, null);
                return yVar;
            case 2:
                i iVar2 = (i) obj;
                boolean z = iVar2 instanceof o;
                androidx.compose.material.ripple.a aVar = (androidx.compose.material.ripple.a) this.y;
                if (!z) {
                    CoroutineScope coroutineScope = (CoroutineScope) this.z;
                    androidx.compose.material.ripple.g gVar = aVar.Q;
                    if (gVar == null) {
                        boolean z2 = aVar.M;
                        e1 e1Var = aVar.P;
                        gVar = new androidx.compose.material.ripple.g();
                        gVar.a = z2;
                        gVar.b = e1Var;
                        gVar.c = androidx.compose.animation.core.e.a(0.0f);
                        gVar.d = new ArrayList();
                        androidx.compose.ui.node.l.k(aVar);
                        aVar.Q = gVar;
                    }
                    ArrayList arrayList2 = (ArrayList) gVar.d;
                    if (iVar2 instanceof g) {
                        arrayList2.add(iVar2);
                    } else if (iVar2 instanceof h) {
                        arrayList2.remove(((h) iVar2).a);
                    } else if (iVar2 instanceof d) {
                        arrayList2.add(iVar2);
                    } else if (iVar2 instanceof e) {
                        arrayList2.remove(((e) iVar2).a);
                    } else if (iVar2 instanceof b) {
                        arrayList2.add(iVar2);
                    } else if (iVar2 instanceof c) {
                        arrayList2.remove(((c) iVar2).a);
                    } else if (iVar2 instanceof a) {
                        arrayList2.remove(((a) iVar2).a);
                    }
                    i iVar3 = (i) p.K(arrayList2);
                    if (!kotlin.jvm.internal.l.a((i) gVar.e, iVar3)) {
                        kotlin.coroutines.d dVar3 = null;
                        if (iVar3 != null) {
                            ((e1) gVar.b).invoke();
                            boolean z3 = iVar3 instanceof g;
                            if (z3) {
                                f = 0.08f;
                            } else if (iVar3 instanceof d) {
                                f = 0.1f;
                            } else {
                                f = iVar3 instanceof b ? 0.16f : 0.0f;
                            }
                            k2 k2Var = androidx.compose.material.ripple.f.a;
                            if (!z3 && ((iVar3 instanceof d) || (iVar3 instanceof b))) {
                                k2Var = new k2(45, 0, a0.b);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c2(gVar, f, k2Var, (kotlin.coroutines.d) null), 3, null);
                        } else {
                            i iVar4 = (i) gVar.e;
                            k2 k2Var2 = androidx.compose.material.ripple.f.a;
                            if (!(iVar4 instanceof g) && !(iVar4 instanceof d) && (iVar4 instanceof b)) {
                                k2Var2 = new k2(150, 0, a0.b);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(gVar, k2Var2, dVar3, 15), 3, null);
                        }
                        gVar.e = iVar3;
                    }
                } else if (aVar.T) {
                    aVar.M0((o) iVar2);
                } else {
                    aVar.U.a(iVar2);
                }
                return y.a;
            case 3:
                i iVar5 = (i) obj;
                x xVar = (x) this.y;
                if (iVar5 instanceof m) {
                    xVar.e++;
                } else if ((iVar5 instanceof n) || (iVar5 instanceof l)) {
                    xVar.e--;
                }
                boolean z4 = xVar.e > 0;
                c6 c6Var = (c6) this.z;
                if (c6Var.O != z4) {
                    c6Var.O = z4;
                    androidx.compose.ui.node.l.l(c6Var);
                }
                return y.a;
            case 4:
                k0 k0Var = (k0) this.z;
                LinkedHashMap linkedHashMap = k0Var.b;
                if (dVar instanceof i0) {
                    i0Var = (i0) dVar;
                    int i = i0Var.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i0Var.y = i - Integer.MIN_VALUE;
                    } else {
                        i0Var = new i0(this, dVar);
                    }
                } else {
                    i0Var = new i0(this, dVar);
                }
                Object obj2 = i0Var.e;
                int i2 = i0Var.y;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.y;
                    i iVar6 = (i) obj;
                    if (iVar6 instanceof m) {
                        m mVar = new m(androidx.compose.ui.geometry.b.d(((m) iVar6).a, k0Var.a));
                        linkedHashMap.put(iVar6, mVar);
                        nVar2 = mVar;
                    } else if (iVar6 instanceof l) {
                        lVar = (l) iVar6;
                        m mVar2 = (m) linkedHashMap.remove(lVar.a);
                        if (mVar2 != null) {
                            nVar2 = lVar;
                            nVar2 = new l(mVar2);
                        }
                    } else if (iVar6 instanceof n) {
                        nVar = (n) iVar6;
                        m mVar3 = (m) linkedHashMap.remove(nVar.a);
                        if (mVar3 != null) {
                            nVar2 = iVar6;
                            nVar2 = nVar;
                            nVar2 = new n(mVar3);
                        }
                    }
                    nVar2 = iVar6;
                    nVar2 = nVar;
                    nVar2 = iVar6;
                    nVar2 = lVar;
                    i0Var.y = 1;
                    Object objEmit = flowCollector.emit(nVar2, i0Var);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj2);
                }
                return y.a;
            case 5:
                ((androidx.work.impl.constraints.h) this.y).d((androidx.work.impl.model.p) this.z, (androidx.work.impl.constraints.c) obj);
                return y.a;
            case 6:
                Integer num = (Integer) obj;
                w2 w2Var = (w2) this.z;
                if ((num != null ? num.intValue() : 0) >= ((List) w2Var.getValue()).size() - 6 && !((List) w2Var.getValue()).isEmpty()) {
                    com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                    if (!((Boolean) cVar.k.getValue()).booleanValue() && cVar.F && (str = (String) cVar.q.getValue()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.b(cVar, (com.app.mlounge.data.repository.a) cVar.o.getValue(), str, null, 0), 3, null);
                    }
                }
                return y.a;
            case 7:
                Integer num2 = (Integer) obj;
                w2 w2Var2 = (w2) this.z;
                if ((num2 != null ? num2.intValue() : 0) >= ((List) w2Var2.getValue()).size() - 6 && !((List) w2Var2.getValue()).isEmpty()) {
                    f0 f0Var = (f0) this.y;
                    if (!((Boolean) f0Var.m.getValue()).booleanValue() && f0Var.L < f0Var.M) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(f0Var), null, null, new com.app.mlounge.ui.screens.movies.g(f0Var, (kotlin.coroutines.d) null, 2), 3, null);
                    }
                }
                return y.a;
            case 8:
                Integer num3 = (Integer) obj;
                w2 w2Var3 = (w2) this.z;
                int iIntValue = num3 != null ? num3.intValue() : 0;
                if (!((List) w2Var3.getValue()).isEmpty() && iIntValue >= ((List) w2Var3.getValue()).size() - 6) {
                    j0 j0Var = (j0) this.y;
                    if (!((Boolean) j0Var.j.getValue()).booleanValue() && j0Var.m && j0Var.l != null) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var), null, null, new com.app.mlounge.ui.viewmodel.i0(j0Var, null, 1), 3, null);
                    }
                }
                return y.a;
            case 9:
                Integer num4 = (Integer) obj;
                w2 w2Var4 = (w2) this.z;
                if ((num4 != null ? num4.intValue() : 0) >= ((List) w2Var4.getValue()).size() - 6 && !((List) w2Var4.getValue()).isEmpty()) {
                    b2 b2Var = (b2) this.y;
                    if (!((Boolean) b2Var.s.getValue()).booleanValue() && b2Var.T < b2Var.U) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(b2Var), null, null, new com.app.mlounge.ui.screens.tvshows.l(b2Var, (kotlin.coroutines.d) null, 1), 3, null);
                    }
                }
                return y.a;
            case 10:
                if (dVar instanceof com.app.mlounge.ui.viewmodel.n) {
                    nVar3 = (com.app.mlounge.ui.viewmodel.n) dVar;
                    int i3 = nVar3.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nVar3.y = i3 - Integer.MIN_VALUE;
                    } else {
                        nVar3 = new com.app.mlounge.ui.viewmodel.n(this, dVar);
                    }
                } else {
                    nVar3 = new com.app.mlounge.ui.viewmodel.n(this, dVar);
                }
                Object obj3 = nVar3.e;
                int i4 = nVar3.y;
                if (i4 == 0) {
                    kotlin.a.e(obj3);
                    FlowCollector flowCollector2 = (FlowCollector) this.y;
                    String absolutePath = (String) obj;
                    if (absolutePath == null) {
                        com.app.mlounge.data.download.h hVar = ((com.app.mlounge.ui.viewmodel.o) this.z).b;
                        hVar.getClass();
                        absolutePath = new File(hVar.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "CinemaHQ").getAbsolutePath();
                    }
                    nVar3.y = 1;
                    Object objEmit2 = flowCollector2.emit(absolutePath, nVar3);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj3);
                }
                return y.a;
            case 11:
                if (dVar instanceof u1) {
                    u1Var = (u1) dVar;
                    int i5 = u1Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        u1Var.y = i5 - Integer.MIN_VALUE;
                    } else {
                        u1Var = new u1(this, dVar);
                    }
                } else {
                    u1Var = new u1(this, dVar);
                }
                Object obj4 = u1Var.e;
                int i6 = u1Var.y;
                if (i6 == 0) {
                    kotlin.a.e(obj4);
                    FlowCollector flowCollector3 = (FlowCollector) this.y;
                    List list = (List) obj;
                    if (kotlin.jvm.internal.l.a(((w1) this.z).x, "download")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            ChqStream chqStream = (ChqStream) obj5;
                            if (!kotlin.jvm.internal.l.a(chqStream.l(), "hls") && !kotlin.jvm.internal.l.a(chqStream.k(), "hls")) {
                                arrayList3.add(obj5);
                            }
                        }
                        list = arrayList3;
                    }
                    u1Var.y = 1;
                    Object objEmit3 = flowCollector3.emit(list, u1Var);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit3 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj4);
                }
                return y.a;
            case 12:
                b2 b2Var2 = (b2) this.y;
                Map map = (Map) b2Var2.h.getValue();
                CoroutineScope coroutineScope2 = (CoroutineScope) this.z;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    int iIntValue2 = ((Number) entry.getKey()).intValue();
                    if (((Number) entry.getValue()).intValue() > 0 && !map.containsKey(new Integer(iIntValue2))) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new z1(b2Var2, iIntValue2, null, 0), 3, null);
                    }
                }
                return y.a;
            default:
                d2 d2Var = (d2) this.y;
                Map map2 = (Map) d2Var.h.getValue();
                CoroutineScope coroutineScope3 = (CoroutineScope) this.z;
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    int iIntValue3 = ((Number) entry2.getKey()).intValue();
                    if (((Number) entry2.getValue()).intValue() > 0 && !map2.containsKey(new Integer(iIntValue3))) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new u0(d2Var, iIntValue3, null, 2), 3, null);
                    }
                }
                return y.a;
        }
    }
}
