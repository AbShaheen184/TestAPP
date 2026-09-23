package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends u {
    @Override // com.google.common.util.concurrent.u
    public final Object q(Object obj, Object obj2) {
        z zVar = (z) obj;
        ListenableFuture listenableFutureApply = zVar.apply(obj2);
        _COROUTINE.a.u(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zVar);
        return listenableFutureApply;
    }

    @Override // com.google.common.util.concurrent.u
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
