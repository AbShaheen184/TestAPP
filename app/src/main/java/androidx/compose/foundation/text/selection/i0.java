package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final androidx.compose.foundation.text.f0 a;
    public final long b;
    public final h0 c;
    public final boolean d;

    public i0(androidx.compose.foundation.text.f0 f0Var, long j, h0 h0Var, boolean z) {
        this.a = f0Var;
        this.b = j;
        this.c = h0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && androidx.compose.ui.geometry.b.b(this.b, i0Var.b) && this.c == i0Var.c && this.d == i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) androidx.compose.ui.geometry.b.g(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
