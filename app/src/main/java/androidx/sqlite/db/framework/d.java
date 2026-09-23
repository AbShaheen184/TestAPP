package androidx.sqlite.db.framework;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {
    public final e e;
    public final Throwable y;

    public d(e eVar, Throwable th) {
        super(th);
        this.e = eVar;
        this.y = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.y;
    }
}
