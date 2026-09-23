package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.a == ((c0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
