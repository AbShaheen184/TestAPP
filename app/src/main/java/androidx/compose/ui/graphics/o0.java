package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends androidx.compose.ui.q implements androidx.compose.ui.node.w, u1 {
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public n0 R;
    public boolean S;
    public long T;
    public long U;
    public int V;
    public androidx.compose.animation.e W;

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.node.w
    public final r0 c(s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        d1 d1VarF = p0Var.F(j);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.animation.c(2, d1VarF, this));
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        if (this.S) {
            androidx.compose.ui.semantics.y.e(a0Var, this.R);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.L);
        sb.append(", scaleY=");
        sb.append(this.M);
        sb.append(", alpha = ");
        sb.append(this.N);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.O);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.P);
        sb.append(", transformOrigin=");
        sb.append((Object) q0.b(this.Q));
        sb.append(", shape=");
        sb.append(this.R);
        sb.append(", clip=");
        sb.append(this.S);
        sb.append(", renderEffect=null, ambientShadowColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.T, ", spotShadowColor=", sb);
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.U, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) a0.B(this.V));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
