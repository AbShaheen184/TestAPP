package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public l0(String str, String str2, long j, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.l.a(this.a, l0Var.a) && kotlin.jvm.internal.l.a(this.b, l0Var.b) && this.c == l0Var.c && this.d == l0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.runtime.j.q("ResolvedStreamInfo(url=", this.a, ", contentType=", this.b, ", contentLength=");
        sbQ.append(this.c);
        sbQ.append(", acceptRanges=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
