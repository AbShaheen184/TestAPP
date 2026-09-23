package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public t4(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return androidx.compose.ui.graphics.t.c(this.a, t4Var.a) && androidx.compose.ui.graphics.t.c(this.b, t4Var.b) && androidx.compose.ui.graphics.t.c(this.c, t4Var.c) && androidx.compose.ui.graphics.t.c(this.d, t4Var.d);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
