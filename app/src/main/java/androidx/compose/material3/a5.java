package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a5(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return androidx.compose.ui.unit.f.d(this.a, a5Var.a) && androidx.compose.ui.unit.f.d(this.b, a5Var.b) && androidx.compose.ui.unit.f.d(this.c, a5Var.c) && androidx.compose.ui.unit.f.d(this.d, a5Var.d) && androidx.compose.ui.unit.f.d(this.f, a5Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
