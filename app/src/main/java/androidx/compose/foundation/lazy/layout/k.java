package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final int a;
    public final int b;

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            androidx.compose.foundation.internal.b.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        androidx.compose.foundation.internal.b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }
}
