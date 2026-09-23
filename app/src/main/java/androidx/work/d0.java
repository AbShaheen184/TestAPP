package androidx.work;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.room.t {
    public final Throwable j;

    public d0(Throwable th) {
        this.j = th;
    }

    public final String toString() {
        return "FAILURE (" + this.j.getMessage() + ")";
    }
}
