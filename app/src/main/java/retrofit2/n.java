package retrofit2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d {
    public final Executor e;
    public final d y;

    public n(Executor executor, d dVar) {
        this.e = executor;
        this.y = dVar;
    }

    @Override // retrofit2.d
    public final boolean A() {
        return this.y.A();
    }

    @Override // retrofit2.d
    public final okhttp3.b0 N() {
        return this.y.N();
    }

    @Override // retrofit2.d
    public final void cancel() {
        this.y.cancel();
    }

    @Override // retrofit2.d
    public final d clone() {
        return new n(this.e, this.y.clone());
    }

    @Override // retrofit2.d
    public final void x(g gVar) {
        this.y.x(new com.google.android.material.internal.k(28, this, gVar, false));
    }
}
