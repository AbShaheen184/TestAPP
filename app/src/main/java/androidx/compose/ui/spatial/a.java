package androidx.compose.ui.spatial;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a = (((long) 1023) << 50) ^ (-1);
    public static final long b = (-1) ^ (((long) 33554431) << 25);
    public static final long c;

    static {
        long j = 33554431;
        c = j | (((long) Math.min(0, 1023)) << 50) | (j << 25);
    }
}
