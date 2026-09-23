package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public n3(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return androidx.compose.ui.graphics.t.c(this.a, n3Var.a) && androidx.compose.ui.graphics.t.c(this.d, n3Var.d) && androidx.compose.ui.graphics.t.c(this.b, n3Var.b) && androidx.compose.ui.graphics.t.c(this.e, n3Var.e) && androidx.compose.ui.graphics.t.c(this.c, n3Var.c) && androidx.compose.ui.graphics.t.c(this.f, n3Var.f) && androidx.compose.ui.graphics.t.c(this.g, n3Var.g);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.g) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}
