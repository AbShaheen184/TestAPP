package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements m0 {
    public final androidx.compose.ui.i a;
    public final int b;

    public d1(androidx.compose.ui.i iVar, int i) {
        this.a = iVar;
        this.b = i;
    }

    @Override // androidx.compose.material3.internal.m0
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        if (i < i2 - (i3 * 2)) {
            return kotlin.collections.i0.d(this.a.a(i, i2), i3, (i2 - i3) - i);
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.a.equals(d1Var.a) && this.b == d1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }
}
