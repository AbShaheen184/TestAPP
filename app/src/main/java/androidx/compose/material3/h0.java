package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public h0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return androidx.compose.ui.unit.f.d(this.a, h0Var.a) && androidx.compose.ui.unit.f.d(this.b, h0Var.b) && androidx.compose.ui.unit.f.d(this.c, h0Var.c) && androidx.compose.ui.unit.f.d(this.d, h0Var.d) && androidx.compose.ui.unit.f.d(this.e, h0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
