package androidx.compose.foundation;

import androidx.compose.foundation.gestures.k2;
import androidx.compose.foundation.gestures.l2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends androidx.compose.ui.node.k implements androidx.compose.ui.node.i, androidx.compose.ui.node.h1 {
    public l2 N;
    public androidx.compose.foundation.gestures.o1 O;
    public boolean P;
    public androidx.compose.foundation.gestures.l Q;
    public androidx.compose.foundation.interaction.k R;
    public boolean S;
    public n T;
    public k2 U;
    public androidx.compose.ui.node.j V;
    public o W;
    public n X;
    public boolean Y;

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.Y = Q0();
        P0();
        if (this.U == null) {
            l2 l2Var = this.N;
            k2 k2Var = new k2(this.S ? this.X : this.T, this.Q, this.O, l2Var, this.R, this.P, this.Y);
            M0(k2Var);
            this.U = k2Var;
        }
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        androidx.compose.ui.node.j jVar = this.V;
        if (jVar != null) {
            N0(jVar);
        }
    }

    @Override // androidx.compose.ui.node.j
    public final void O() {
        boolean zQ0 = Q0();
        if (this.Y != zQ0) {
            this.Y = zQ0;
            l2 l2Var = this.N;
            androidx.compose.foundation.gestures.o1 o1Var = this.O;
            boolean z = this.S;
            R0(z ? this.X : this.T, this.Q, o1Var, l2Var, this.R, z, this.P);
        }
    }

    public final void P0() {
        androidx.compose.ui.node.j jVar = this.V;
        if (jVar != null) {
            if (((androidx.compose.ui.q) jVar).e.K) {
                return;
            }
            M0(jVar);
            return;
        }
        if (this.S) {
            androidx.compose.ui.node.l.r(this, new androidx.activity.w(this, 4));
        }
        n nVar = this.S ? this.X : this.T;
        if (nVar != null) {
            androidx.compose.ui.node.k kVar = nVar.i;
            if (kVar.e.K) {
                return;
            }
            M0(kVar);
            this.V = kVar;
        }
    }

    public final boolean Q0() {
        return (this.K ? androidx.compose.ui.node.l.v(this).X : androidx.compose.ui.unit.m.e) != androidx.compose.ui.unit.m.y || this.O == androidx.compose.foundation.gestures.o1.e;
    }

    public final void R0(n nVar, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.gestures.o1 o1Var, l2 l2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        boolean z3;
        this.N = l2Var;
        this.O = o1Var;
        boolean z4 = true;
        if (this.S != z) {
            this.S = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (kotlin.jvm.internal.l.a(this.T, nVar)) {
            z4 = false;
        } else {
            this.T = nVar;
        }
        if (z3 || (z4 && !z)) {
            androidx.compose.ui.node.j jVar = this.V;
            if (jVar != null) {
                N0(jVar);
            }
            this.V = null;
            P0();
        }
        this.P = z2;
        this.Q = lVar;
        this.R = kVar;
        boolean zQ0 = Q0();
        this.Y = zQ0;
        k2 k2Var = this.U;
        if (k2Var != null) {
            k2Var.h1(this.S ? this.X : this.T, lVar, o1Var, l2Var, kVar, z2, zQ0);
        }
    }

    @Override // androidx.compose.ui.node.h1
    public final void g0() {
        o oVar = (o) androidx.compose.ui.node.l.h(this, r1.a);
        if (kotlin.jvm.internal.l.a(oVar, this.W)) {
            return;
        }
        this.W = oVar;
        this.X = null;
        androidx.compose.ui.node.j jVar = this.V;
        if (jVar != null) {
            N0(jVar);
        }
        this.V = null;
        P0();
        k2 k2Var = this.U;
        if (k2Var != null) {
            l2 l2Var = this.N;
            androidx.compose.foundation.gestures.o1 o1Var = this.O;
            k2Var.h1(this.S ? this.X : this.T, this.Q, o1Var, l2Var, this.R, this.P, this.Y);
        }
    }
}
