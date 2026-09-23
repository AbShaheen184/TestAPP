package androidx.compose.ui.graphics.vector;

import androidx.appcompat.widget.c2;
import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends androidx.compose.ui.graphics.painter.b {
    public final j1 C = androidx.compose.runtime.t.r(new androidx.compose.ui.geometry.e(0));
    public final j1 D = androidx.compose.runtime.t.r(Boolean.FALSE);
    public final f0 E;
    public final j1 F;
    public float G;
    public androidx.compose.ui.graphics.m H;

    public j0(c cVar) {
        f0 f0Var = new f0(cVar);
        f0Var.f = new androidx.compose.animation.z(this, 2);
        this.E = f0Var;
        this.F = new j1(kotlin.y.a, androidx.compose.runtime.f.A);
        this.G = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.G = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(androidx.compose.ui.graphics.m mVar) {
        this.H = mVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return ((androidx.compose.ui.geometry.e) this.C.getValue()).a;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(androidx.compose.ui.node.h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        androidx.compose.ui.graphics.m mVar = this.H;
        f0 f0Var = this.E;
        if (mVar == null) {
            mVar = (androidx.compose.ui.graphics.m) f0Var.g.getValue();
        }
        if (((Boolean) this.D.getValue()).booleanValue() && h0Var.getLayoutDirection() == androidx.compose.ui.unit.m.y) {
            long jK0 = bVar.k0();
            c2 c2Var = bVar.y;
            long jG = c2Var.G();
            c2Var.v().f();
            try {
                ((com.google.firebase.platforminfo.d) c2Var.y).n(-1.0f, 1.0f, jK0);
                f0Var.e(h0Var, this.G, mVar);
                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
            } catch (Throwable th) {
                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
                throw th;
            }
        } else {
            f0Var.e(h0Var, this.G, mVar);
        }
        this.F.getValue();
    }
}
