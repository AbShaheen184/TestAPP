package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public g0(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a.equals(g0Var.a) && this.b == g0Var.b && this.c == g0Var.c && this.d == g0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
