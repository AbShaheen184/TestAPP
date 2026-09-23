package retrofit2;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CompletableFuture {
    public final z e;

    public j(z zVar) {
        this.e = zVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.e.cancel();
        }
        return super.cancel(z);
    }
}
