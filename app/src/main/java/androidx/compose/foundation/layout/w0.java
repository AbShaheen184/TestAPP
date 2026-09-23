package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class w0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public w0(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            androidx.compose.foundation.layout.internal.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        x0 x0Var = new x0();
        x0Var.L = this.b;
        x0Var.M = this.c;
        x0Var.N = this.d;
        x0Var.O = this.e;
        x0Var.P = true;
        return x0Var;
    }

    public final boolean equals(Object obj) {
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        return w0Var != null && androidx.compose.ui.unit.f.d(this.b, w0Var.b) && androidx.compose.ui.unit.f.d(this.c, w0Var.c) && androidx.compose.ui.unit.f.d(this.d, w0Var.d) && androidx.compose.ui.unit.f.d(this.e, w0Var.e);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        x0 x0Var = (x0) qVar;
        x0Var.L = this.b;
        x0Var.M = this.c;
        x0Var.N = this.d;
        x0Var.O = this.e;
        x0Var.P = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }
}
