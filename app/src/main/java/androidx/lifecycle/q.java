package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements t, CoroutineScope {
    public final p e;
    public final kotlin.coroutines.j y;

    public q(p pVar, kotlin.coroutines.j jVar) {
        jVar.getClass();
        this.e = pVar;
        this.y = jVar;
        if (((x) pVar).d == o.e) {
            JobKt__JobKt.cancel$default(jVar, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        p pVar = this.e;
        if (((x) pVar).d.compareTo(o.e) <= 0) {
            pVar.b(this);
            JobKt__JobKt.cancel$default(this.y, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.j getCoroutineContext() {
        return this.y;
    }
}
