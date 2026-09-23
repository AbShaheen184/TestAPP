package kotlin.time;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d e = new d(4611686018427387903L, true);
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;

    static {
        new d(Long.MAX_VALUE, false);
    }

    public d(long j, boolean z) {
        this.a = j;
        this.b = z;
        long j2 = 10;
        this.c = j / j2;
        this.d = j % j2;
    }
}
