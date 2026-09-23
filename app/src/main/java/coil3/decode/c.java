package coil3.decode;

import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    public final Semaphore a;
    public final n b;

    public c(Semaphore semaphore, n nVar) {
        this.a = semaphore;
        this.b = nVar;
    }

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, coil3.request.n nVar) {
        return new e(kVar.a, nVar, this.a, this.b);
    }
}
