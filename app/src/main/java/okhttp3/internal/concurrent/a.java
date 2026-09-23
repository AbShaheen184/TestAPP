package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final String a;
    public final boolean b;
    public c c;
    public long d;

    public a(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
