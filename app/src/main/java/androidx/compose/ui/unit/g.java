package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final long a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.e(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.e(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a == ((g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
