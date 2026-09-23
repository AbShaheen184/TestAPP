package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public final long a;
    public final long b;

    public i1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return androidx.compose.ui.graphics.t.c(this.a, i1Var.a) && androidx.compose.ui.graphics.t.c(this.b, i1Var.b);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) androidx.compose.ui.graphics.t.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
