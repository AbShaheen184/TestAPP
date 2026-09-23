package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class h1 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public /* synthetic */ h1(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        j1 j1Var = new j1();
        j1Var.L = this.b;
        j1Var.M = this.c;
        j1Var.N = this.d;
        j1Var.O = this.e;
        j1Var.P = this.f;
        return j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return androidx.compose.ui.unit.f.d(this.b, h1Var.b) && androidx.compose.ui.unit.f.d(this.c, h1Var.c) && androidx.compose.ui.unit.f.d(this.d, h1Var.d) && androidx.compose.ui.unit.f.d(this.e, h1Var.e) && this.f == h1Var.f;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        j1 j1Var = (j1) qVar;
        j1Var.L = this.b;
        j1Var.M = this.c;
        j1Var.N = this.d;
        j1Var.O = this.e;
        j1Var.P = this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public h1(float f, float f2, float f3, float f4, boolean z) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }
}
