package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements l0 {
    public final androidx.compose.ui.f a;

    public c1(androidx.compose.ui.f fVar) {
        this.a = fVar;
    }

    @Override // androidx.compose.material3.internal.l0
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i, androidx.compose.ui.unit.m mVar) {
        int i2 = (int) (j >> 32);
        if (i < i2) {
            return kotlin.collections.i0.d(this.a.a(i, i2, mVar), 0, i2 - i);
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.a(1, mVar != androidx.compose.ui.unit.m.e ? 0.0f * (-1) : 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.a.equals(((c1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
