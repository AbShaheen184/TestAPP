package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final float a;
    public final float b;

    public s(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.a, sVar.a) == 0 && Float.compare(this.b, sVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
