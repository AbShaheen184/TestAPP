package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {
    public final float a;

    public h(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.d
    public final int a(int i, int i2, androidx.compose.ui.unit.m mVar) {
        float f = (i2 - i) / 2.0f;
        androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
        float f2 = this.a;
        if (mVar != mVar2) {
            f2 *= -1;
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.a(1, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.a, ((h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
