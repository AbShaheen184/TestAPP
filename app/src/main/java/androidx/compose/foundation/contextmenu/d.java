package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public d(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.a, dVar.a) && t.c(this.b, dVar.b) && t.c(this.c, dVar.c) && t.c(this.d, dVar.d) && t.c(this.e, dVar.e);
    }

    public final int hashCode() {
        int i = t.j;
        return Long.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", textColor=", sb);
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.b, ", iconColor=", sb);
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.c, ", disabledTextColor=", sb);
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.d, ", disabledIconColor=", sb);
        sb.append((Object) t.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
