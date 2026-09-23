package coil3.svg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ViewBox(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
