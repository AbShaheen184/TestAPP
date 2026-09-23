package androidx.compose.animation;

import android.content.Context;
import androidx.compose.animation.core.e2;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.w2;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.viewmodel.o1;
import com.app.mlounge.ui.viewmodel.s1;
import com.app.mlounge.ui.viewmodel.w1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements FlowCollector {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public a0(androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.a1 a1Var2, androidx.compose.runtime.f1 f1Var) {
        this.e = 2;
        this.A = a1Var;
        this.y = a1Var2;
        this.z = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object a(com.app.mlounge.data.repository.b0 b0Var, kotlin.coroutines.d dVar) {
        s1 s1Var;
        List list;
        List list2;
        ArrayList arrayList;
        ChqStream chqStream;
        String strJ;
        com.app.mlounge.data.repository.b0 b0Var2 = b0Var;
        if (dVar instanceof s1) {
            s1Var = (s1) dVar;
            int i = s1Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                s1Var.B = i - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, dVar);
            }
        } else {
            s1Var = new s1(this, dVar);
        }
        Object objWithContext = s1Var.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = s1Var.B;
        int i3 = 1;
        int i4 = 2;
        kotlin.coroutines.d dVar2 = null;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (kotlin.jvm.internal.l.a(((w1) this.y).r, "anime") && (list = b0Var2.d) != null && !list.isEmpty()) {
                ((w1) this.y).g = b0Var2.d;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            o1 o1Var = new o1(b0Var2, (w1) this.y, dVar2, i4);
            s1Var.e = b0Var2;
            s1Var.B = 1;
            objWithContext = BuildersKt.withContext(io2, o1Var, s1Var);
            if (objWithContext != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            b0Var2 = s1Var.e;
            kotlin.a.e(objWithContext);
        } else {
            if (i2 != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = s1Var.y;
            kotlin.a.e(objWithContext);
        }
        ((w1) this.y).h.setValue((List) objWithContext);
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.A;
        arrayList = new ArrayList();
        for (Object obj : list2) {
            chqStream = (ChqStream) obj;
            strJ = chqStream.j();
            if (strJ != null || kotlin.text.k.J(strJ)) {
                if (kotlin.jvm.internal.l.a(chqStream.n(), Boolean.TRUE) && !kotlin.jvm.internal.l.a(chqStream.k(), "torrent") && !kotlin.jvm.internal.l.a(chqStream.l(), "hls") && !kotlin.jvm.internal.l.a(chqStream.k(), "hls") && kotlin.text.r.u(chqStream.m(), "http", false) && linkedHashSet.add(chqStream.m())) {
                    arrayList.add(obj);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g((w1) this.y), Dispatchers.getIO(), null, new o1(arrayList, (w1) this.y, dVar2, i3), 2, null);
        }
        return kotlin.y.a;
        List list3 = (List) objWithContext;
        int size = b0Var2.b.size() - list3.size();
        if (size > 0) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "SourcesViewModel", "Filtered " + size + " dead stream(s) from " + b0Var2.a);
        }
        boolean z = b0Var2.c;
        String str = b0Var2.a;
        com.app.mlounge.ui.viewmodel.o0 o0Var = z ? new com.app.mlounge.ui.viewmodel.o0(str, com.app.mlounge.ui.viewmodel.n0.y, list3.size()) : new com.app.mlounge.ui.viewmodel.o0(str, com.app.mlounge.ui.viewmodel.n0.z, 0);
        MutableStateFlow mutableStateFlow = ((w1) this.y).l;
        Iterable<com.app.mlounge.ui.viewmodel.o0> iterable = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(iterable, 10));
        for (com.app.mlounge.ui.viewmodel.o0 o0Var2 : iterable) {
            if (kotlin.jvm.internal.l.a(o0Var2.a, b0Var2.a)) {
                o0Var2 = o0Var;
            }
            arrayList2.add(o0Var2);
        }
        mutableStateFlow.setValue(arrayList2);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        androidx.compose.foundation.text.input.internal.k kVar = new androidx.compose.foundation.text.input.internal.k((ArrayList) this.z, list3, dVar2, 17);
        s1Var.e = null;
        s1Var.y = list3;
        s1Var.B = 2;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher, kVar, s1Var);
        if (objWithContext2 != aVar) {
            objWithContext = objWithContext2;
            list2 = list3;
            ((w1) this.y).h.setValue((List) objWithContext);
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.A;
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                chqStream = (ChqStream) obj;
                strJ = chqStream.j();
                if (strJ != null) {
                }
                if (kotlin.jvm.internal.l.a(chqStream.n(), Boolean.TRUE)) {
                }
            }
            if (!arrayList.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g((w1) this.y), Dispatchers.getIO(), null, new o1(arrayList, (w1) this.y, dVar2, i3), 2, null);
            }
            return kotlin.y.a;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        androidx.compose.material3.internal.h hVar;
        androidx.room.coroutines.i iVar;
        FlowCollector flowCollector;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e2 e2Var = (e2) this.z;
                ((q1) this.y).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((kotlin.jvm.functions.p) ((androidx.compose.runtime.a1) this.A).getValue()).invoke(e2Var.a.n(), e2Var.d.getValue())).booleanValue() : false));
                return kotlin.y.a;
            case 1:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) this.y;
                if (dVar instanceof androidx.compose.material3.internal.h) {
                    hVar = (androidx.compose.material3.internal.h) dVar;
                    int i = hVar.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hVar.B = i - Integer.MIN_VALUE;
                    } else {
                        hVar = new androidx.compose.material3.internal.h(this, dVar);
                    }
                } else {
                    hVar = new androidx.compose.material3.internal.h(this, dVar);
                }
                Object obj2 = hVar.z;
                int i2 = hVar.B;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    Job job = (Job) zVar.e;
                    if (job != null) {
                        job.cancel((CancellationException) new androidx.compose.material3.internal.e());
                        hVar.e = obj;
                        hVar.y = job;
                        hVar.B = 1;
                        Object objJoin = job.join(hVar);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objJoin == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = hVar.e;
                    kotlin.a.e(obj2);
                }
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                zVar.e = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new b0((kotlin.jvm.functions.p) this.A, obj, coroutineScope, (kotlin.coroutines.d) null), 1, null);
                return kotlin.y.a;
            case 2:
                androidx.activity.a aVar2 = (androidx.activity.a) obj;
                if (((List) ((androidx.compose.runtime.a1) this.A).getValue()).size() > 1) {
                    ((androidx.compose.runtime.a1) this.y).setValue(Boolean.TRUE);
                    ((androidx.compose.runtime.f1) this.z).h(aVar2.c);
                }
                return kotlin.y.a;
            case 3:
                if (dVar instanceof androidx.room.coroutines.i) {
                    iVar = (androidx.room.coroutines.i) dVar;
                    int i3 = iVar.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iVar.y = i3 - Integer.MIN_VALUE;
                    } else {
                        iVar = new androidx.room.coroutines.i(this, dVar);
                    }
                } else {
                    iVar = new androidx.room.coroutines.i(this, dVar);
                }
                Object obj3 = iVar.e;
                int i4 = iVar.y;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        flowCollector = iVar.z;
                        kotlin.a.e(obj3);
                    } else {
                        if (i4 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj3);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj3);
                FlowCollector flowCollector2 = (FlowCollector) this.y;
                androidx.room.r rVar = (androidx.room.r) this.z;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                iVar.z = flowCollector2;
                iVar.y = 1;
                Object objU = okhttp3.internal.platform.android.g.u(rVar, true, false, lVar, iVar);
                if (objU == aVar3) {
                    return aVar3;
                }
                obj3 = objU;
                flowCollector = flowCollector2;
                iVar.z = null;
                iVar.y = 2;
                if (flowCollector.emit(obj3, iVar) == aVar3) {
                    return aVar3;
                }
                return kotlin.y.a;
            case 4:
                Integer num = (Integer) obj;
                w2 w2Var = (w2) this.A;
                int iIntValue = num != null ? num.intValue() : 0;
                if (!((Boolean) ((w2) this.z).getValue()).booleanValue() && iIntValue >= ((List) w2Var.getValue()).size() - 6 && !((List) w2Var.getValue()).isEmpty()) {
                    com.app.mlounge.ui.viewmodel.r rVar2 = (com.app.mlounge.ui.viewmodel.r) this.y;
                    if (!((Boolean) rVar2.i.getValue()).booleanValue() && rVar2.M < rVar2.N) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(rVar2), null, null, new com.app.mlounge.ui.viewmodel.q(rVar2, null, 1), 3, null);
                    }
                }
                return kotlin.y.a;
            default:
                return a((com.app.mlounge.data.repository.b0) obj, dVar);
        }
    }

    public /* synthetic */ a0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
