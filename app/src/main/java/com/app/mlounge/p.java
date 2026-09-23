package com.app.mlounge;

import com.app.mlounge.data.local.prefs.y1;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements FlowCollector {
    public final /* synthetic */ FlowCollector e;
    public final /* synthetic */ boolean y;

    public p(FlowCollector flowCollector, boolean z) {
        this.e = flowCollector;
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i = oVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.y = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, dVar);
            }
        } else {
            oVar = new o(this, dVar);
        }
        Object obj2 = oVar.e;
        int i2 = oVar.y;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            Boolean bool = (Boolean) ((androidx.datastore.preferences.core.a) obj).c(y1.c1);
            Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : this.y);
            oVar.y = 1;
            Object objEmit = this.e.emit(boolValueOf, oVar);
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
        return y.a;
    }
}
