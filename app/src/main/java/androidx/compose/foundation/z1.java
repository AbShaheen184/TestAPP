package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends androidx.compose.ui.q implements androidx.compose.ui.node.w, androidx.compose.ui.node.u1 {
    public c2 L;
    public boolean M;

    @Override // androidx.compose.ui.node.w
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.v(i);
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.a0(i);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        s.h(j, this.M ? androidx.compose.foundation.gestures.o1.e : androidx.compose.foundation.gestures.o1.y);
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.a.a(j, 0, this.M ? androidx.compose.ui.unit.a.h(j) : Integer.MAX_VALUE, 0, this.M ? Integer.MAX_VALUE : androidx.compose.ui.unit.a.g(j), 5));
        int i = d1VarF.e;
        int iH = androidx.compose.ui.unit.a.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = d1VarF.y;
        int iG = androidx.compose.ui.unit.a.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = d1VarF.y - i2;
        int i4 = d1VarF.e - i;
        if (!this.M) {
            i3 = i4;
        }
        c2 c2Var = this.L;
        androidx.compose.runtime.g1 g1Var = c2Var.e;
        androidx.compose.runtime.g1 g1Var2 = c2Var.a;
        g1Var.h(i3);
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            if (g1Var2.g() > i3) {
                g1Var2.h(i3);
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            this.L.b.h(this.M ? i2 : i);
            this.L.c.h(this.M ? d1VarF.y : d1VarF.e);
            return s0Var.q(i, i2, kotlin.collections.x.e, new x1(this, i3, d1VarF, 0));
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        androidx.compose.ui.semantics.y.g(a0Var);
        final int i = 0;
        final int i2 = 1;
        androidx.compose.ui.semantics.k kVar = new androidx.compose.ui.semantics.k(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.y1
            public final /* synthetic */ z1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int iG;
                switch (i) {
                    case 0:
                        iG = this.y.L.a.g();
                        break;
                    default:
                        iG = this.y.L.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.y1
            public final /* synthetic */ z1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int iG;
                switch (i2) {
                    case 0:
                        iG = this.y.L.a.g();
                        break;
                    default:
                        iG = this.y.L.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.M) {
            androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.v;
            kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[13];
            a0Var.b(zVar, kVar);
        } else {
            androidx.compose.ui.semantics.z zVar2 = androidx.compose.ui.semantics.w.u;
            kotlin.reflect.j jVar2 = androidx.compose.ui.semantics.y.a[12];
            a0Var.b(zVar2, kVar);
        }
    }

    @Override // androidx.compose.ui.node.w
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.b(i);
    }
}
