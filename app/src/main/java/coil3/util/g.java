package coil3.util;

import androidx.lifecycle.v;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.lifecycle.f {
    public final /* synthetic */ CancellableContinuationImpl e;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = cancellableContinuationImpl;
    }

    @Override // androidx.lifecycle.f
    public final void A(v vVar) {
        this.e.resumeWith(y.a);
    }
}
