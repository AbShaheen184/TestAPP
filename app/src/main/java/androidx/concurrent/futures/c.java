package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Throwable a;

    static {
        new c(new b("Failure occurred while trying to finish a future.", 0));
    }

    public c(Throwable th) {
        boolean z = h.A;
        th.getClass();
        this.a = th;
    }
}
