package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    private final d<y> continuation;

    public LazyStandaloneCoroutine(j jVar, p pVar) {
        super(jVar, false);
        this.continuation = h.d(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }
}
