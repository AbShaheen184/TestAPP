package androidx.compose.ui.geometry;

import okhttp3.internal.platform.android.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        _COROUTINE.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0 && kotlin.math.a.o(this.e, dVar.e) && kotlin.math.a.o(this.f, dVar.f) && kotlin.math.a.o(this.g, dVar.g) && kotlin.math.a.o(this.h, dVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = g.A(this.a) + ", " + g.A(this.b) + ", " + g.A(this.c) + ", " + g.A(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zO = kotlin.math.a.o(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zO || !kotlin.math.a.o(j2, j3) || !kotlin.math.a.o(j3, j4)) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", topLeft=");
            sbX.append((Object) kotlin.math.a.Q(j));
            sbX.append(", topRight=");
            sbX.append((Object) kotlin.math.a.Q(j2));
            sbX.append(", bottomRight=");
            sbX.append((Object) kotlin.math.a.Q(j3));
            sbX.append(", bottomLeft=");
            sbX.append((Object) kotlin.math.a.Q(j4));
            sbX.append(')');
            return sbX.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbX2 = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", radius=");
            sbX2.append(g.A(Float.intBitsToFloat(i)));
            sbX2.append(')');
            return sbX2.toString();
        }
        StringBuilder sbX3 = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", x=");
        sbX3.append(g.A(Float.intBitsToFloat(i)));
        sbX3.append(", y=");
        sbX3.append(g.A(Float.intBitsToFloat(i2)));
        sbX3.append(')');
        return sbX3.toString();
    }
}
