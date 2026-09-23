package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 {
    public final androidx.compose.ui.h a;
    public final androidx.compose.ui.h b;

    public x5() {
        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
        this.a = hVar;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return kotlin.jvm.internal.l.a(this.a, x5Var.a) && kotlin.jvm.internal.l.a(this.b, x5Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
