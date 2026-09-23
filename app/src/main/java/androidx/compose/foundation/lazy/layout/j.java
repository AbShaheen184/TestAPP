package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final int a;
    public final int b;
    public final r c;

    public j(int i, int i2, r rVar) {
        this.a = i;
        this.b = i2;
        this.c = rVar;
        if (i < 0) {
            androidx.compose.foundation.internal.b.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        androidx.compose.foundation.internal.b.a("size should be > 0");
    }
}
