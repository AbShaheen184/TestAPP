package androidx.compose.ui.graphics;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class z extends w0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final n0 g;
    public final boolean h;
    public final long i;
    public final long j;

    public z(float f, float f2, float f3, float f4, long j, n0 n0Var, boolean z, long j2, long j3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j;
        this.g = n0Var;
        this.h = z;
        this.i = j2;
        this.j = j3;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        o0 o0Var = new o0();
        o0Var.L = this.b;
        o0Var.M = this.c;
        o0Var.N = this.d;
        o0Var.O = this.e;
        o0Var.P = 8.0f;
        o0Var.Q = this.f;
        o0Var.R = this.g;
        o0Var.S = this.h;
        o0Var.T = this.i;
        o0Var.U = this.j;
        o0Var.V = 3;
        o0Var.W = new androidx.compose.animation.e(o0Var, 5);
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.b, zVar.b) == 0 && Float.compare(this.c, zVar.c) == 0 && Float.compare(this.d, zVar.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.e, zVar.e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && q0.a(this.f, zVar.f) && kotlin.jvm.internal.l.a(this.g, zVar.g) && this.h == zVar.h && t.c(this.i, zVar.i) && t.c(this.j, zVar.j);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        d1 d1Var;
        o0 o0Var = (o0) qVar;
        o0Var.L = this.b;
        o0Var.M = this.c;
        o0Var.N = this.d;
        o0Var.O = this.e;
        o0Var.P = 8.0f;
        o0Var.Q = this.f;
        o0Var.R = this.g;
        o0Var.S = this.h;
        o0Var.T = this.i;
        o0Var.U = this.j;
        o0Var.V = 3;
        androidx.compose.animation.e eVar = o0Var.W;
        if (o0Var.e.K && (d1Var = androidx.compose.ui.node.l.t(o0Var, 2).M) != null) {
            d1Var.s1(eVar, true);
        }
    }

    public final int hashCode() {
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(8.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.c(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = q0.c;
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h((this.g.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(iC, 31, this.f)) * 31, 961, this.h);
        int i2 = t.j;
        return androidx.privacysandbox.ads.adservices.java.internal.a.d(3, androidx.privacysandbox.ads.adservices.java.internal.a.d(0, androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(iH, 31, this.i), 31, this.j), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.b);
        sb.append(", scaleY=");
        sb.append(this.c);
        sb.append(", alpha=");
        sb.append(this.d);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) q0.b(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.i, ", spotShadowColor=", sb);
        sb.append((Object) t.i(this.j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) a0.B(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
