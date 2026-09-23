package androidx.compose.ui.node;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends androidx.compose.ui.layout.d1 implements androidx.compose.ui.layout.p0, a, x0 {
    public final j0 C;
    public boolean D;
    public boolean G;
    public boolean H;
    public boolean J;
    public kotlin.jvm.functions.l L;
    public float M;
    public Object O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean X;
    public float b0;
    public boolean c0;
    public kotlin.jvm.functions.l d0;
    public float f0;
    public boolean h0;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public d0 I = d0.z;
    public long K = 0;
    public boolean N = true;
    public final g0 U = new g0(this, 0);
    public final androidx.compose.runtime.collection.b V = new androidx.compose.runtime.collection.b(new v0[16]);
    public boolean W = true;
    public long Y = androidx.compose.ui.unit.b.b(0, 0, 15);
    public final u0 Z = new u0(this, 1);
    public final u0 a0 = new u0(this, 0);
    public long e0 = 0;
    public final u0 g0 = new u0(this, 2);

    public v0(j0 j0Var) {
        this.C = j0Var;
    }

    public final void A0(long j, float f, kotlin.jvm.functions.l lVar) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        if (f0Var.o0) {
            androidx.compose.ui.internal.a.a("place is called on a deactivated node");
        }
        j0Var.d = b0.z;
        this.K = j;
        this.M = f;
        this.L = lVar;
        this.c0 = false;
        m1 m1VarA = i0.a(f0Var2);
        if (this.S || !this.P) {
            this.U.g = false;
            j0Var.f(false);
            this.d0 = lVar;
            this.e0 = j;
            this.f0 = f;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.f, this.g0);
        } else {
            d1 d1VarA = j0Var.a();
            d1VarA.k1(androidx.compose.ui.unit.j.c(j, d1VarA.B), f, lVar);
            y0();
        }
        j0Var.d = b0.B;
        if (j0Var.a().H && (j0Var.k || j0Var.j)) {
            requestLayout();
        }
        this.H = true;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        j0 j0Var = this.C;
        if (!l.q(j0Var.a)) {
            x0();
            return j0Var.a().B(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.B(i);
    }

    public final boolean B0(long j) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.o0) {
                androidx.compose.ui.internal.a.a("measure is called on a deactivated node");
            }
            m1 m1VarA = i0.a(f0Var2);
            f0 f0VarV = f0Var2.v();
            boolean z = true;
            f0Var2.c0 = f0Var2.c0 || (f0VarV != null && f0VarV.c0);
            if (!f0Var2.r() && androidx.compose.ui.unit.a.b(this.A, j)) {
                ((androidx.compose.ui.platform.u) m1VarA).k(f0Var2, false);
                f0Var2.Z();
                return false;
            }
            this.U.f = false;
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).e0.p.U.c = false;
            }
            this.G = true;
            long j2 = j0Var.a().z;
            o0(j);
            b0 b0Var = j0Var.d;
            b0 b0Var2 = b0.B;
            if (b0Var != b0Var2) {
                androidx.compose.ui.internal.a.b("layout state is not idle before measure starts");
            }
            this.Y = j;
            b0 b0Var3 = b0.e;
            j0Var.d = b0Var3;
            this.R = false;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.c, this.Z);
            if (j0Var.d == b0Var3) {
                this.S = true;
                this.T = true;
                j0Var.d = b0Var2;
            }
            if (androidx.compose.ui.unit.l.a(j0Var.a().z, j2) && j0Var.a().e == this.e && j0Var.a().y == this.y) {
                z = false;
            }
            n0((((long) j0Var.a().y) & 4294967295L) | (((long) j0Var.a().e) << 32));
            return z;
        } catch (Throwable th) {
            f0Var.a0(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        d0 d0Var;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        d0 d0Var2 = f0Var.a0;
        d0 d0Var3 = d0.z;
        if (d0Var2 == d0Var3) {
            f0Var.e();
        }
        if (l.q(f0Var2)) {
            r0 r0Var = j0Var.q;
            r0Var.getClass();
            r0Var.G = d0Var3;
            r0Var.F(j);
        }
        f0 f0VarV = f0Var2.v();
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (this.I != d0Var3 && !f0Var2.c0) {
                androidx.compose.ui.internal.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0) {
                d0Var = d0.e;
            } else {
                if (iOrdinal != 2) {
                    com.google.firebase.platforminfo.b.o(j0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                d0Var = d0.y;
            }
            this.I = d0Var;
        } else {
            this.I = d0Var3;
        }
        B0(j);
        return this;
    }

    @Override // androidx.compose.ui.node.a
    public final void J(androidx.compose.animation.e eVar) {
        androidx.compose.runtime.collection.b bVarZ = this.C.a.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            eVar.invoke(((f0) objArr[i2]).e0.p);
        }
    }

    @Override // androidx.compose.ui.layout.d1, androidx.compose.ui.layout.p0
    public final Object L() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.x0
    public final void O(boolean z) {
        j0 j0Var = this.C;
        if (z != j0Var.a().F) {
            j0Var.a().F = z;
            this.h0 = true;
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void R() {
        this.X = true;
        g0 g0Var = this.U;
        g0Var.h();
        boolean z = this.S;
        j0 j0Var = this.C;
        if (z) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                if (f0Var.r() && f0Var.s() == d0.e && f0.Q(f0Var)) {
                    f0.X(j0Var.a, false, 7);
                }
            }
        }
        if (this.T || (!this.J && !g().H && this.S)) {
            this.S = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.z;
            j0Var.g(false);
            f0 f0Var2 = j0Var.a;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.e, this.a0);
            j0Var.d = b0Var;
            this.T = false;
        }
        if (g0Var.d) {
            g0Var.e = true;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.X = false;
    }

    @Override // androidx.compose.ui.node.a
    public final void Y() {
        f0.X(this.C.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        j0 j0Var = this.C;
        if (!l.q(j0Var.a)) {
            x0();
            return j0Var.a().a0(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.a0(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        j0 j0Var = this.C;
        if (!l.q(j0Var.a)) {
            x0();
            return j0Var.a().b(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.b(i);
    }

    @Override // androidx.compose.ui.layout.d1
    public final int b0(androidx.compose.ui.layout.a aVar) {
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        b0 b0Var = f0VarV != null ? f0VarV.e0.d : null;
        b0 b0Var2 = b0.e;
        g0 g0Var = this.U;
        if (b0Var == b0Var2) {
            g0Var.c = true;
        } else {
            f0 f0VarV2 = j0Var.a.v();
            if ((f0VarV2 != null ? f0VarV2.e0.d : null) == b0.z) {
                g0Var.d = true;
            }
        }
        this.J = true;
        int iB0 = j0Var.a().b0(aVar);
        this.J = false;
        return iB0;
    }

    @Override // androidx.compose.ui.node.a
    public final g0 c() {
        return this.U;
    }

    @Override // androidx.compose.ui.layout.d1
    public final int d0() {
        return this.C.a().d0();
    }

    @Override // androidx.compose.ui.node.a
    public final s g() {
        return (s) this.C.a.d0.d;
    }

    @Override // androidx.compose.ui.layout.d1
    public final int g0() {
        return this.C.a().g0();
    }

    @Override // androidx.compose.ui.node.a
    public final a k() {
        j0 j0Var;
        f0 f0VarV = this.C.a.v();
        if (f0VarV == null || (j0Var = f0VarV.e0) == null) {
            return null;
        }
        return j0Var.p;
    }

    @Override // androidx.compose.ui.layout.d1
    public final void l0(long j, float f, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.layout.c1 placementScope;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            this.Q = true;
            if (!androidx.compose.ui.unit.j.a(j, this.K) || this.h0) {
                if (j0Var.k || j0Var.j || this.h0) {
                    this.S = true;
                    this.h0 = false;
                }
                w0();
            }
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                j0 j0Var2 = r0Var.C;
                if (r0Var.N == p0.z && !l.q(j0Var2.a)) {
                    j0Var2.c = true;
                }
            }
            r0 r0Var2 = j0Var.q;
            if (r0Var2 != null && r0Var2.p0()) {
                d1 d1Var = j0Var.a().N;
                if (d1Var == null || (placementScope = d1Var.I) == null) {
                    placementScope = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getPlacementScope();
                }
                r0 r0Var3 = j0Var.q;
                r0Var3.getClass();
                f0 f0VarV = f0Var2.v();
                if (f0VarV != null) {
                    f0VarV.e0.h = 0;
                }
                r0Var3.F = Integer.MAX_VALUE;
                androidx.compose.ui.layout.c1.i(placementScope, r0Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            r0 r0Var4 = j0Var.q;
            if (r0Var4 != null && !r0Var4.I) {
                androidx.compose.ui.internal.a.b("Error: Placement happened before lookahead.");
            }
            A0(j, f, lVar);
        } catch (Throwable th) {
            f0Var.a0(th);
            throw null;
        }
    }

    public final List p0() {
        j0 j0Var = this.C;
        j0Var.a.h0();
        boolean z = this.W;
        androidx.compose.runtime.collection.b bVar = this.V;
        if (!z) {
            return bVar.f();
        }
        f0 f0Var = j0Var.a;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (bVar.z <= i2) {
                bVar.b(f0Var2.e0.p);
            } else {
                v0 v0Var = f0Var2.e0.p;
                Object[] objArr2 = bVar.e;
                Object obj = objArr2[i2];
                objArr2[i2] = v0Var;
            }
        }
        bVar.l(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z, bVar.z);
        this.W = false;
        return bVar.f();
    }

    public final void q0() {
        boolean z = this.P;
        this.P = true;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.d0;
        if (!z) {
            ((s) a1Var.d).f1();
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().f(j0Var.a, true);
            if (f0Var.r()) {
                f0.X(f0Var, true, 6);
            } else if (f0Var.e0.e) {
                f0.V(f0Var, true, 6);
            }
        }
        d1 d1Var = ((s) a1Var.d).M;
        for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
            if (d1Var2.h0) {
                d1Var2.b1();
            }
        }
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.w() != Integer.MAX_VALUE) {
                f0Var2.e0.p.q0();
                f0.Y(f0Var2);
            }
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void requestLayout() {
        this.C.a.W(false);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        j0 j0Var = this.C;
        if (!l.q(j0Var.a)) {
            x0();
            return j0Var.a().v(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.v(i);
    }

    public final void v0() {
        if (this.P) {
            this.P = false;
            j0 j0Var = this.C;
            f0 f0Var = j0Var.a;
            f0 f0Var2 = j0Var.a;
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().h(f0Var2);
            a1 a1Var = f0Var2.d0;
            d1 d1Var = ((s) a1Var.d).M;
            for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
                d1Var2.h1();
                d1Var2.m1();
            }
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).e0.p.v0();
            }
        }
    }

    public final void w0() {
        j0 j0Var = this.C;
        if (j0Var.l > 0) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.e0;
                boolean z = j0Var2.j;
                v0 v0Var = j0Var2.p;
                if ((z || j0Var2.k) && !v0Var.S) {
                    f0Var.W(false);
                }
                v0Var.w0();
            }
        }
    }

    @Override // androidx.compose.ui.node.a
    public final int x() {
        return this.F;
    }

    public final void x0() {
        d0 d0Var;
        j0 j0Var = this.C;
        f0.X(j0Var.a, false, 7);
        f0 f0Var = j0Var.a;
        f0 f0VarV = f0Var.v();
        if (f0VarV == null || f0Var.a0 != d0.z) {
            return;
        }
        int iOrdinal = f0VarV.e0.d.ordinal();
        if (iOrdinal != 0) {
            d0Var = iOrdinal != 2 ? f0VarV.a0 : d0.y;
        } else {
            d0Var = d0.e;
        }
        f0Var.a0 = d0Var;
    }

    public final void y0() {
        this.c0 = true;
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        float f = g().X;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.d0;
        d1 d1Var = (d1) a1Var.e;
        s sVar = (s) a1Var.d;
        while (d1Var != sVar) {
            d1Var.getClass();
            y yVar = (y) d1Var;
            f += yVar.X;
            d1Var = yVar.M;
        }
        if (f != this.b0) {
            this.b0 = f;
            if (f0VarV != null) {
                f0VarV.O();
            }
            if (f0VarV != null) {
                f0VarV.C();
            }
        }
        if (!g().H) {
            boolean z = this.P;
            if (!z || this.U.d()) {
                q0();
            }
            if (z) {
                ((s) f0Var.d0.d).f1();
            } else {
                if (f0VarV != null) {
                    f0VarV.C();
                }
                if (this.D && f0VarV != null) {
                    f0VarV.W(false);
                }
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (!this.D && j0Var2.d == b0.z) {
                if (this.F != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.i;
                this.F = i;
                j0Var2.i = i + 1;
            }
        } else {
            this.F = 0;
        }
        R();
    }
}
