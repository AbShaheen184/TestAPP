package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public z0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            androidx.compose.foundation.layout.internal.a.a("Padding must be non-negative");
        }
    }

    public final float a(androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? this.a : this.c;
    }

    public final float b(androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? this.c : this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return androidx.compose.ui.unit.f.d(this.a, z0Var.a) && androidx.compose.ui.unit.f.d(this.b, z0Var.b) && androidx.compose.ui.unit.f.d(this.c, z0Var.c) && androidx.compose.ui.unit.f.d(this.d, z0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) androidx.compose.ui.unit.f.e(this.a)) + ", top=" + ((Object) androidx.compose.ui.unit.f.e(this.b)) + ", end=" + ((Object) androidx.compose.ui.unit.f.e(this.c)) + ", bottom=" + ((Object) androidx.compose.ui.unit.f.e(this.d)) + ')';
    }
}
