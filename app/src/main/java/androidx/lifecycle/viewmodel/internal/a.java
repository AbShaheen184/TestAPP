package androidx.lifecycle.viewmodel.internal;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, CoroutineScope {
    public final j e;

    public a(j jVar) {
        jVar.getClass();
        this.e = jVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final j getCoroutineContext() {
        return this.e;
    }
}
