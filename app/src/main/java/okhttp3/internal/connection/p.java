package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r {
    public final n a;

    public p(n nVar) {
        nVar.getClass();
        this.a = nVar;
    }

    @Override // okhttp3.internal.connection.r
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.connection.r
    public final r b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.r, okhttp3.internal.http.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.r
    public final n d() {
        return this.a;
    }

    @Override // okhttp3.internal.connection.r
    public final q e() {
        throw new IllegalStateException("already connected");
    }

    @Override // okhttp3.internal.connection.r
    public final q g() {
        throw new IllegalStateException("already connected");
    }
}
