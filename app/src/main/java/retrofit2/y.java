package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends okhttp3.j0 {
    public final long A;
    public final okhttp3.u z;

    public y(okhttp3.u uVar, long j) {
        this.z = uVar;
        this.A = j;
    }

    @Override // okhttp3.j0
    public final okio.h P() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // okhttp3.j0
    public final long n() {
        return this.A;
    }

    @Override // okhttp3.j0
    public final okhttp3.u x() {
        return this.z;
    }
}
