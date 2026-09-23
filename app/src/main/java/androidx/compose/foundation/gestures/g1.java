package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public final long a;
    public final long b;
    public final boolean c;

    public g1(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final g1 a(g1 g1Var) {
        return new g1(androidx.compose.ui.geometry.b.e(this.a, g1Var.a), Math.max(this.b, g1Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return androidx.compose.ui.geometry.b.b(this.a, g1Var.a) && this.b == g1Var.b && this.c == g1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) androidx.compose.ui.geometry.b.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
