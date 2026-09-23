package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public i2(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return androidx.compose.ui.graphics.t.c(this.a, i2Var.a) && androidx.compose.ui.graphics.t.c(this.b, i2Var.b) && androidx.compose.ui.graphics.t.c(this.c, i2Var.c) && androidx.compose.ui.graphics.t.c(this.d, i2Var.d) && androidx.compose.ui.graphics.t.c(this.e, i2Var.e) && androidx.compose.ui.graphics.t.c(this.f, i2Var.f);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
