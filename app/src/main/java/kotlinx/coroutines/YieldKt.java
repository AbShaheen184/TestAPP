package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.y;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class YieldKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object yield(d<? super y> dVar) {
        Object obj;
        j context = dVar.getContext();
        JobKt.ensureActive(context);
        d dVarF = h.f(dVar);
        DispatchedContinuation dispatchedContinuation = dVarF instanceof DispatchedContinuation ? (DispatchedContinuation) dVarF : null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        y yVar = y.a;
        if (dispatchedContinuation != null) {
            if (DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, yVar);
            } else {
                YieldContext yieldContext = new YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context.plus(yieldContext), yVar);
                if (yieldContext.dispatcherWasUnconfined && !DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) {
                    obj = yVar;
                }
            }
            obj = aVar;
        } else {
            obj = yVar;
        }
        return obj == aVar ? obj : yVar;
    }
}
