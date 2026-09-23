package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ListenableFuture {
    public final WeakReference e;
    public final k y = new k(this);

    public l(i iVar) {
        this.e = new WeakReference(iVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i iVar = (i) this.e.get();
        boolean zCancel = this.y.cancel(z);
        if (zCancel && iVar != null) {
            iVar.a = null;
            iVar.b = null;
            iVar.c.l(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.y.e instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.y.isDone();
    }

    public final String toString() {
        return this.y.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.y.get(j, timeUnit);
    }
}
