package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    public final long a;
    public final androidx.compose.foundation.layout.z0 b;

    public p1() {
        long jD = androidx.compose.ui.graphics.a0.d(4284900966L);
        androidx.compose.foundation.layout.z0 z0VarB = androidx.compose.foundation.layout.b.b(3, 0.0f);
        this.a = jD;
        this.b = z0VarB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        p1 p1Var = (p1) obj;
        return androidx.compose.ui.graphics.t.c(this.a, p1Var.a) && kotlin.jvm.internal.l.a(this.b, p1Var.b);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
