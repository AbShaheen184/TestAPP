package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 {
    public final androidx.compose.ui.window.e0 a = androidx.compose.ui.window.e0.e;
    public final boolean b = true;
    public final boolean c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.a == i3Var.a && this.c == i3Var.c && this.b == i3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.a.hashCode() * 31, 29791, this.b);
    }
}
