package coil3.disk;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements AutoCloseable {
    public final b e;

    public f(b bVar) {
        this.e = bVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }
}
