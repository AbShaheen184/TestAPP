package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    public final /* synthetic */ androidx.compose.runtime.tooling.d e;
    public final /* synthetic */ e2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(CoroutineExceptionHandler.Key key, androidx.compose.runtime.tooling.d dVar, e2 e2Var) {
        super(key);
        this.e = dVar;
        this.y = e2Var;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.j jVar, Throwable th) throws Throwable {
        androidx.compose.runtime.tooling.d dVar = this.e;
        e2 e2Var = this.y;
        coil3.network.g.G(th, new androidx.activity.compose.f(18, dVar, e2Var));
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        key.getClass();
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) e2Var.e.get(key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(jVar, th);
    }
}
