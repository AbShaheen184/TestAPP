package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c0 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public s(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.c, sVar.c) == 0 && Float.compare(this.d, sVar.d) == 0 && Float.compare(this.e, sVar.e) == 0 && this.f == sVar.f && this.g == sVar.g && Float.compare(this.h, sVar.h) == 0 && Float.compare(this.i, sVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.c(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.i, ')');
    }
}
