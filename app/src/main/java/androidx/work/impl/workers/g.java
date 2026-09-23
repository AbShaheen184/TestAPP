package androidx.work.impl.workers;

import androidx.compose.foundation.text.selection.q;
import androidx.datastore.core.o;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.work.impl.model.p;
import androidx.work.y;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final String a = y.g("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t tVar, p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.y = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object objFirst = fVar.e;
        int i2 = fVar.y;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            o oVar = new o(FlowKt.onEach(tVar.N(pVar), new q(pVar, null, 2)), 1);
            fVar.y = 1;
            objFirst = FlowKt.first(oVar, fVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        return new Integer(((androidx.work.impl.constraints.b) objFirst).a);
    }
}
