package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends d1 {
    public static final com.google.android.gms.cloudmessaging.n q0;
    public w o0;
    public x p0;

    static {
        com.google.android.gms.cloudmessaging.n nVarG = androidx.compose.ui.graphics.a0.g();
        int i = androidx.compose.ui.graphics.t.j;
        nVarG.h(androidx.compose.ui.graphics.t.f);
        nVarG.n(1.0f);
        nVarG.o(1);
        q0 = nVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(f0 f0Var, w wVar) {
        super(f0Var);
        this.o0 = wVar;
        this.p0 = f0Var.F != null ? new x(this) : null;
        if ((((androidx.compose.ui.q) wVar).e.z & 512) == 0) {
            return;
        }
        androidx.transition.k.h();
        throw null;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        w wVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return wVar.v(this, d1Var, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        o0(j);
        w wVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        n1(wVar.c(this, d1Var, j));
        e1();
        return this;
    }

    @Override // androidx.compose.ui.node.d1
    public final void P0() {
        if (this.p0 == null) {
            this.p0 = new x(this);
        }
    }

    @Override // androidx.compose.ui.node.d1
    public final o0 S0() {
        return this.p0;
    }

    @Override // androidx.compose.ui.node.d1
    public final androidx.compose.ui.q U0() {
        return ((androidx.compose.ui.q) this.o0).e;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        w wVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return wVar.b0(this, d1Var, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        w wVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return wVar.x0(this, d1Var, i);
    }

    @Override // androidx.compose.ui.node.d1
    public final void j1(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        d1 d1Var;
        d1 d1Var2 = this.M;
        d1Var2.getClass();
        d1Var2.N0(rVar, bVar);
        if (!((androidx.compose.ui.platform.u) i0.a(this.L)).getShowLayoutBounds() || (d1Var = this.M) == null) {
            return;
        }
        if (androidx.compose.ui.unit.l.a(this.z, d1Var.z) && androidx.compose.ui.unit.j.a(d1Var.W, 0L)) {
            return;
        }
        long j = this.z;
        rVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, q0);
    }

    @Override // androidx.compose.ui.layout.d1
    public final void l0(long j, float f, kotlin.jvm.functions.l lVar) {
        k1(j, f, lVar);
        if (this.G) {
            return;
        }
        f1();
        d1 d1Var = this.M;
        d1Var.getClass();
        d1Var.H = this.H;
        C0().d();
        d1Var.H = false;
    }

    @Override // androidx.compose.ui.node.n0
    public final int q0(androidx.compose.ui.layout.a aVar) {
        x xVar = this.p0;
        if (xVar == null) {
            return l.c(this, aVar);
        }
        androidx.collection.f0 f0Var = xVar.Q;
        int iD = f0Var.d(aVar);
        if (iD >= 0) {
            return f0Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        w wVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return wVar.B(this, d1Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1(w wVar) {
        if (wVar.equals(this.o0) || (((androidx.compose.ui.q) wVar).e.z & 512) == 0) {
            this.o0 = wVar;
        } else {
            androidx.transition.k.h();
        }
    }
}
