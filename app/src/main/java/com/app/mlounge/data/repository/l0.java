package com.app.mlounge.data.repository;

import androidx.compose.runtime.n1;
import com.app.mlounge.data.local.prefs.u1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ l0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = ((androidx.room.coroutines.j) this.y).collect(new u1(flowCollector, 3), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            case 1:
                Object objCollect2 = ((androidx.room.coroutines.j) this.y).collect(new u1(flowCollector, 4), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
            default:
                Flow[] flowArr = (Flow[]) this.y;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new n1(flowArr, 1), new androidx.compose.material3.internal.n(3, 1, (kotlin.coroutines.d) null), dVar);
                return objCombineInternal == kotlin.coroutines.intrinsics.a.e ? objCombineInternal : kotlin.y.a;
        }
    }
}
