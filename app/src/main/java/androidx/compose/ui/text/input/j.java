package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final int a;

    public static String a(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
