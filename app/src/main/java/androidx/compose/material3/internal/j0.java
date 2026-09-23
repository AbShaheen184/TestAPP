package androidx.compose.material3.internal;

import com.app.mlounge.ui.viewmodel.w1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j0(Flow flow, Object obj, int i) {
        this.e = i;
        this.y = flow;
        this.z = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Object objCollect = this.y.collect(new androidx.compose.foundation.interaction.f(4, flowCollector, (k0) this.z), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
            case 1:
                Object objCollect2 = this.y.collect(new androidx.compose.foundation.interaction.f(10, flowCollector, (com.app.mlounge.ui.viewmodel.o) this.z), dVar);
                return objCollect2 == kotlin.coroutines.intrinsics.a.e ? objCollect2 : kotlin.y.a;
            default:
                Object objCollect3 = this.y.collect(new androidx.compose.foundation.interaction.f(11, flowCollector, (w1) this.z), dVar);
                return objCollect3 == kotlin.coroutines.intrinsics.a.e ? objCollect3 : kotlin.y.a;
        }
    }
}
