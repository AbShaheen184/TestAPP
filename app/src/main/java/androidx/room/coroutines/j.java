package androidx.room.coroutines;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Flow {
    public final /* synthetic */ Flow e;
    public final /* synthetic */ androidx.room.r y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public j(Flow flow, androidx.room.r rVar, kotlin.jvm.functions.l lVar) {
        this.e = flow;
        this.y = rVar;
        this.z = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        Object objCollect = this.e.collect(new androidx.compose.animation.a0(3, flowCollector, this.y, this.z), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
    }
}
