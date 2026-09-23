package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DownstreamExceptionContext implements j {
    private final /* synthetic */ j $$delegate_0;
    public final Throwable e;

    public DownstreamExceptionContext(Throwable th, j jVar) {
        this.$$delegate_0 = jVar;
        this.e = th;
    }

    @Override // kotlin.coroutines.j
    public <R> R fold(R r, p pVar) {
        return (R) this.$$delegate_0.fold(r, pVar);
    }

    @Override // kotlin.coroutines.j
    public <E extends h> E get(i iVar) {
        return (E) this.$$delegate_0.get(iVar);
    }

    @Override // kotlin.coroutines.j
    public j minusKey(i iVar) {
        return this.$$delegate_0.minusKey(iVar);
    }

    @Override // kotlin.coroutines.j
    public j plus(j jVar) {
        return this.$$delegate_0.plus(jVar);
    }
}
