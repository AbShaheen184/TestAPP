package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.foundation.text.input.internal.k;
import kotlin.coroutines.intrinsics.h;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends android.support.v4.media.session.b {
    public final MeasurementManager j;

    public c(MeasurementManager measurementManager) {
        this.j = measurementManager;
    }

    public static Object M(c cVar, a aVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(h.f(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.j;
        throw null;
    }

    public static Object N(c cVar, kotlin.coroutines.d<? super Integer> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.j.getMeasurementApiStatus(new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        return cancellableContinuationImpl.getResult();
    }

    public static Object P(c cVar, Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super y> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.j.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    public static Object Q(c cVar, d dVar, kotlin.coroutines.d<? super y> dVar2) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new k(cVar, null, 4), dVar2);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public static Object R(c cVar, Uri uri, kotlin.coroutines.d<? super y> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cVar.j.registerTrigger(uri, new androidx.arch.core.executor.a(2), new androidx.core.os.c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    public static Object T(c cVar, e eVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(h.f(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.j;
        throw null;
    }

    public static Object V(c cVar, f fVar, kotlin.coroutines.d<? super y> dVar) {
        new CancellableContinuationImpl(h.f(dVar), 1).initCancellability();
        MeasurementManager measurementManager = cVar.j;
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public Object B(Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super y> dVar) {
        return P(this, uri, inputEvent, dVar);
    }

    @Override // android.support.v4.media.session.b
    public Object C(Uri uri, kotlin.coroutines.d<? super y> dVar) {
        return R(this, uri, dVar);
    }

    public Object L(a aVar, kotlin.coroutines.d<? super y> dVar) {
        return M(this, aVar, dVar);
    }

    public Object O(d dVar, kotlin.coroutines.d<? super y> dVar2) {
        return Q(this, dVar, dVar2);
    }

    public Object S(e eVar, kotlin.coroutines.d<? super y> dVar) {
        return T(this, eVar, dVar);
    }

    public Object U(f fVar, kotlin.coroutines.d<? super y> dVar) {
        return V(this, fVar, dVar);
    }

    @Override // android.support.v4.media.session.b
    public Object o(kotlin.coroutines.d<? super Integer> dVar) {
        return N(this, dVar);
    }
}
