package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.compose.ui.q implements androidx.compose.ui.node.w, u1 {
    public kotlin.jvm.functions.l L;

    public o(kotlin.jvm.functions.l lVar) {
        this.L = lVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.node.w
    public final r0 c(s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        d1 d1VarF = p0Var.F(j);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.animation.c(1, d1VarF, this));
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        boolean z;
        n0 n0Var;
        androidx.compose.ui.node.d1 d1VarT = androidx.compose.ui.node.l.t(this, 2);
        if (d1VarT.c0) {
            n0 n0Var2 = d1VarT.a0;
            z = d1VarT.b0;
            n0Var = n0Var2;
        } else {
            k0 k0Var = a0.a;
            if (k0Var == null) {
                a0.a = new k0();
            } else {
                k0Var.b();
            }
            k0 k0Var2 = a0.a;
            k0Var2.getClass();
            k0Var2.J = d1VarT.L.W;
            k0Var2.I = coil3.network.g.F(d1VarT.z);
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                this.L.invoke(k0Var2);
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                n0Var = k0Var2.G;
                z = k0Var2.H;
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        }
        if (z) {
            androidx.compose.ui.semantics.y.e(a0Var, n0Var);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.L + ')';
    }
}
