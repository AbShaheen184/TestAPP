package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public g0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return androidx.compose.ui.graphics.t.c(this.a, g0Var.a) && androidx.compose.ui.graphics.t.c(this.b, g0Var.b) && androidx.compose.ui.graphics.t.c(this.c, g0Var.c) && androidx.compose.ui.graphics.t.c(this.d, g0Var.d);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
