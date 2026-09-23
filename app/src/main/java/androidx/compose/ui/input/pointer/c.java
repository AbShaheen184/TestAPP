package androidx.compose.ui.input.pointer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final long a;
    public final long b;
    public final long c;

    public c(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + ((Object) androidx.compose.ui.geometry.b.g(this.b)) + ')';
    }
}
