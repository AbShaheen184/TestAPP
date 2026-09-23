package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.o1;
import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends androidx.compose.ui.q implements u1 {
    public kotlin.jvm.functions.a L;
    public q0 M;
    public o1 N;
    public boolean O;
    public androidx.compose.ui.semantics.k P;
    public final s0 Q = new s0(this, 0);
    public s0 R;

    public v0(kotlin.jvm.functions.a aVar, q0 q0Var, o1 o1Var, boolean z) {
        this.L = aVar;
        this.M = q0Var;
        this.N = o1Var;
        this.O = z;
        M0();
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    public final void M0() {
        this.P = new androidx.compose.ui.semantics.k(new t0(this, 0), new t0(this, 1));
        this.R = this.O ? new s0(this, 1) : null;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        androidx.compose.ui.semantics.y.g(a0Var);
        a0Var.b(androidx.compose.ui.semantics.w.M, this.Q);
        o1 o1Var = this.N;
        androidx.compose.ui.semantics.k kVar = this.P;
        if (o1Var == o1.e) {
            if (kVar == null) {
                kotlin.jvm.internal.l.f("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.v;
            kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[13];
            a0Var.b(zVar, kVar);
        } else {
            if (kVar == null) {
                kotlin.jvm.internal.l.f("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.z zVar2 = androidx.compose.ui.semantics.w.u;
            kotlin.reflect.j jVar2 = androidx.compose.ui.semantics.y.a[12];
            a0Var.b(zVar2, kVar);
        }
        s0 s0Var = this.R;
        if (s0Var != null) {
            a0Var.b(androidx.compose.ui.semantics.m.f, new androidx.compose.ui.semantics.a(null, s0Var));
        }
        a0Var.b(androidx.compose.ui.semantics.m.C, new androidx.compose.ui.semantics.a(null, new androidx.compose.animation.e(new t0(this, 2), 23)));
        androidx.compose.ui.semantics.d dVarF = this.M.f();
        androidx.compose.ui.semantics.z zVar3 = androidx.compose.ui.semantics.w.f;
        kotlin.reflect.j jVar3 = androidx.compose.ui.semantics.y.a[23];
        a0Var.b(zVar3, dVarF);
    }
}
