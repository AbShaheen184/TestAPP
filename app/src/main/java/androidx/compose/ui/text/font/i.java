package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.a == ((i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
