package com.app.mlounge.data.repository;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 {
    public final int a;
    public final int b;
    public final String c;

    public f0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.b == f0Var.b && this.c.equals(f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.w("Trying(index=", ", total=", this.a, ", name=", this.b), this.c, ")");
    }
}
