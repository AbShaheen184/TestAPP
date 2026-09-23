package androidx.compose.ui.input.pointer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {
    public final int b;

    public a(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((a) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
