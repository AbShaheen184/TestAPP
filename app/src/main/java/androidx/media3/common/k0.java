package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends Exception {
    public final int e;
    public final long y;

    static {
        androidx.compose.runtime.j.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.i0.K(5);
    }

    public k0(String str, Throwable th, int i, long j) {
        super(str, th);
        this.e = i;
        this.y = j;
    }
}
