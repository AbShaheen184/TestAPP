package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {
    public final float e;
    public final float y;

    public d(float f, float f2) {
        this.e = f;
        this.y = f2;
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.y;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.e, dVar.e) == 0 && Float.compare(this.y, dVar.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.e);
        sb.append(", fontScale=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.y, ')');
    }
}
