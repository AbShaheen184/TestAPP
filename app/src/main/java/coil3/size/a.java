package coil3.size;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.q("Pixels(px=", this.a, ")");
    }
}
