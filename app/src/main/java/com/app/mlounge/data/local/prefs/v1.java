package com.app.mlounge.data.local.prefs;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow y;

    public /* synthetic */ v1(Flow flow, int i) {
        this.e = i;
        this.y = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new u1(flowCollector, 0), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            case 1:
                Object objCollect2 = this.y.collect(new u1(flowCollector, 1), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
            case 2:
                Object objCollect3 = this.y.collect(new u1(flowCollector, 2), dVar);
                return objCollect3 == kotlin.coroutines.intrinsics.a.e ? objCollect3 : kotlin.y.a;
            case 3:
                Object objCollect4 = this.y.collect(new u1(flowCollector, 5), dVar);
                return objCollect4 == kotlin.coroutines.intrinsics.a.e ? objCollect4 : kotlin.y.a;
            case 4:
                Object objCollect5 = this.y.collect(new u1(flowCollector, 6), dVar);
                return objCollect5 == kotlin.coroutines.intrinsics.a.e ? objCollect5 : kotlin.y.a;
            case 5:
                Object objCollect6 = this.y.collect(new u1(flowCollector, 7), dVar);
                return objCollect6 == kotlin.coroutines.intrinsics.a.e ? objCollect6 : kotlin.y.a;
            default:
                Object objCollect7 = this.y.collect(new u1(flowCollector, 8), dVar);
                return objCollect7 == kotlin.coroutines.intrinsics.a.e ? objCollect7 : kotlin.y.a;
        }
    }
}
