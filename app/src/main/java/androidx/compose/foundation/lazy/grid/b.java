package androidx.compose.foundation.lazy.grid;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a == ((b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
