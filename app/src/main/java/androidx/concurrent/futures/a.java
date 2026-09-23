package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a c;
    public static final a d;
    public final boolean a;
    public final Throwable b;

    static {
        if (h.A) {
            d = null;
            c = null;
        } else {
            d = new a(null, false);
            c = new a(null, true);
        }
    }

    public a(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
