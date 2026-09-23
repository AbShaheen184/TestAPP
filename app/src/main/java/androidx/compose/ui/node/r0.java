package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends androidx.compose.ui.layout.d1 implements androidx.compose.ui.layout.p0, a, x0 {
    public final j0 C;
    public boolean D;
    public boolean H;
    public boolean I;
    public boolean J;
    public androidx.compose.ui.unit.a K;
    public kotlin.jvm.functions.l M;
    public boolean R;
    public Object U;
    public boolean Y;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public d0 G = d0.z;
    public long L = 0;
    public p0 N = p0.z;
    public final g0 O = new g0(this, 1);
    public final androidx.compose.runtime.collection.b P = new androidx.compose.runtime.collection.b(new r0[16]);
    public boolean Q = true;
    public final q0 S = new q0(this, 0);
    public boolean T = true;
    public long V = androidx.compose.ui.unit.b.b(0, 0, 15);
    public final q0 W = new q0(this, 2);
    public final q0 X = new q0(this, 1);

    public r0(j0 j0Var) {
        this.C = j0Var;
        this.U = j0Var.p.O;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    public final void A0(long j, kotlin.jvm.functions.l lVar) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            f0 f0VarV = f0Var.v();
            b0 b0Var = f0VarV != null ? f0VarV.e0.d : null;
            b0 b0Var2 = b0.A;
            if (b0Var == b0Var2) {
                j0Var.c = false;
            }
            if (f0Var2.o0) {
                androidx.compose.ui.internal.a.a("place is called on a deactivated node");
            }
            j0Var.d = b0Var2;
            boolean z = true;
            this.I = true;
            this.Y = false;
            if (!androidx.compose.ui.unit.j.a(j, this.L)) {
                if (j0Var.n || j0Var.m) {
                    j0Var.f = true;
                }
                w0();
            }
            m1 m1VarA = i0.a(f0Var2);
            this.L = j;
            if (j0Var.f) {
                j0Var.h(false);
                this.O.g = false;
                o1 snapshotObserver = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
                snapshotObserver.a.d(f0Var2, snapshotObserver.g, this.X);
            } else {
                if (this.N == p0.z) {
                    z = false;
                }
                if (z) {
                    o0 o0VarS0 = j0Var.a().S0();
                    o0VarS0.getClass();
                    o0VarS0.L0(androidx.compose.ui.unit.j.c(j, o0VarS0.B));
                    y0();
                } else {
                    j0Var.h(false);
                    this.O.g = false;
                    o1 snapshotObserver2 = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
                    snapshotObserver2.a.d(f0Var2, snapshotObserver2.g, this.X);
                }
            }
            this.M = lVar;
            j0Var.d = b0.B;
        } catch (Throwable th) {
            f0Var.a0(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        x0();
        o0 o0VarS0 = this.C.a().S0();
        o0VarS0.getClass();
        return o0VarS0.B(i);
    }

    public final boolean B0(long j) {
        long j2;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.o0) {
                androidx.compose.ui.internal.a.a("measure is called on a deactivated node");
            }
            f0 f0VarV = f0Var2.v();
            f0Var2.c0 = f0Var2.c0 || (f0VarV != null && f0VarV.c0);
            if (!f0Var2.e0.e) {
                androidx.compose.ui.unit.a aVar = this.K;
                if (aVar == null ? false : androidx.compose.ui.unit.a.b(aVar.a, j)) {
                    m1 m1Var = f0Var2.L;
                    if (m1Var != null) {
                        ((androidx.compose.ui.platform.u) m1Var).k(f0Var2, true);
                    }
                    f0Var2.Z();
                    return false;
                }
            }
            this.K = new androidx.compose.ui.unit.a(j);
            o0(j);
            this.O.f = false;
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).e0.q;
                r0Var.getClass();
                r0Var.O.c = false;
            }
            if (this.J) {
                j2 = this.z;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.J = true;
            o0 o0VarS0 = j0Var.a().S0();
            if (!(o0VarS0 != null)) {
                androidx.compose.ui.internal.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            j0Var.c(j);
            n0((((long) o0VarS0.y) & 4294967295L) | (((long) o0VarS0.e) << 32));
            return (((int) (j2 >> 32)) == o0VarS0.e && ((int) (j2 & 4294967295L)) == o0VarS0.y) ? false : true;
        } catch (Throwable th) {
            f0Var.a0(th);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        d0 d0Var;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        f0 f0VarV = f0Var.v();
        if ((f0VarV != null ? f0VarV.e0.d : null) == b0.y) {
            j0Var.b = false;
        } else {
            f0 f0VarV2 = f0Var2.v();
            if ((f0VarV2 != null ? f0VarV2.e0.d : null) == b0.A) {
                j0Var.b = false;
            }
        }
        f0 f0VarV3 = f0Var2.v();
        d0 d0Var2 = d0.z;
        if (f0VarV3 != null) {
            j0 j0Var2 = f0VarV3.e0;
            if (this.G != d0Var2 && !f0Var2.c0) {
                androidx.compose.ui.internal.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                d0Var = d0.e;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    com.google.firebase.platforminfo.b.o(j0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                d0Var = d0.y;
            }
            this.G = d0Var;
        } else {
            this.G = d0Var2;
        }
        if (f0Var2.a0 == d0Var2) {
            f0Var2.e();
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
            r0 r0Var = ((f0) objArr[i2]).e0.q;
            r0Var.getClass();
            eVar.invoke(r0Var);
        }
    }

    @Override // androidx.compose.ui.layout.d1, androidx.compose.ui.layout.p0
    public final Object L() {
        return this.U;
    }

    @Override // androidx.compose.ui.node.x0
    public final void O(boolean z) {
        o0 o0VarS0;
        j0 j0Var = this.C;
        o0 o0VarS1 = j0Var.a().S0();
        if (Boolean.valueOf(z).equals(o0VarS1 != null ? Boolean.valueOf(o0VarS1.F) : null) || (o0VarS0 = j0Var.a().S0()) == null) {
            return;
        }
        o0VarS0.F = z;
    }

    @Override // androidx.compose.ui.node.a
    public final void R() {
        this.R = true;
        g0 g0Var = this.O;
        g0Var.h();
        j0 j0Var = this.C;
        boolean z = j0Var.f;
        f0 f0Var = j0Var.a;
        if (z) {
            androidx.compose.runtime.collection.b bVarZ = f0Var.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var2 = (f0) objArr[i2];
                j0 j0Var2 = f0Var2.e0;
                if (j0Var2.e && f0Var2.t() == d0.e) {
                    r0 r0Var = j0Var2.q;
                    r0Var.getClass();
                    r0 r0Var2 = j0Var2.q;
                    androidx.compose.ui.unit.a aVar = r0Var2 != null ? r0Var2.K : null;
                    aVar.getClass();
                    if (r0Var.B0(aVar.a)) {
                        f0.V(f0Var, false, 7);
                    }
                }
            }
        }
        r rVar = g().p0;
        rVar.getClass();
        if (j0Var.g || (!this.H && !rVar.H && j0Var.f)) {
            j0Var.f = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.A;
            j0Var.i(false);
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var, snapshotObserver.h, this.S);
            j0Var.d = b0Var;
            if (j0Var.m && rVar.H) {
                requestLayout();
            }
            j0Var.g = false;
        }
        if (g0Var.d) {
            g0Var.e = true;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.R = false;
    }

    @Override // androidx.compose.ui.node.a
    public final void Y() {
        f0.V(this.C.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        x0();
        o0 o0VarS0 = this.C.a().S0();
        o0VarS0.getClass();
        return o0VarS0.a0(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        x0();
        o0 o0VarS0 = this.C.a().S0();
        o0VarS0.getClass();
        return o0VarS0.b(i);
    }

    @Override // androidx.compose.ui.layout.d1
    public final int b0(androidx.compose.ui.layout.a aVar) {
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        b0 b0Var = f0VarV != null ? f0VarV.e0.d : null;
        b0 b0Var2 = b0.y;
        g0 g0Var = this.O;
        if (b0Var == b0Var2) {
            g0Var.c = true;
        } else {
            f0 f0VarV2 = j0Var.a.v();
            if ((f0VarV2 != null ? f0VarV2.e0.d : null) == b0.A) {
                g0Var.d = true;
            }
        }
        this.H = true;
        o0 o0VarS0 = j0Var.a().S0();
        o0VarS0.getClass();
        int iB0 = o0VarS0.b0(aVar);
        this.H = false;
        return iB0;
    }

    @Override // androidx.compose.ui.node.a
    public final g0 c() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.a
    public final s g() {
        return (s) this.C.a.d0.d;
    }

    @Override // androidx.compose.ui.node.a
    public final a k() {
        j0 j0Var;
        f0 f0VarV = this.C.a.v();
        if (f0VarV == null || (j0Var = f0VarV.e0) == null) {
            return null;
        }
        return j0Var.q;
    }

    @Override // androidx.compose.ui.layout.d1
    public final void l0(long j, float f, kotlin.jvm.functions.l lVar) {
        A0(j, lVar);
    }

    public final boolean p0() {
        j0 j0Var = this.C;
        return l.q(j0Var.a) || j0Var.c;
    }

    public final void q0(boolean z) {
        if (z && p0()) {
            return;
        }
        if (z || p0()) {
            this.N = p0.z;
            androidx.compose.runtime.collection.b bVarZ = this.C.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).e0.q;
                r0Var.getClass();
                r0Var.q0(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void requestLayout() {
        this.C.a.U(false);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        x0();
        o0 o0VarS0 = this.C.a().S0();
        o0VarS0.getClass();
        return o0VarS0.v(i);
    }

    public final void v0() {
        p0 p0Var = this.N;
        j0 j0Var = this.C;
        boolean z = j0Var.c;
        f0 f0Var = j0Var.a;
        p0 p0Var2 = p0.e;
        if (z) {
            this.N = p0.y;
        } else {
            this.N = p0Var2;
        }
        if (p0Var != p0Var2 && j0Var.e) {
            f0.V(f0Var, true, 6);
        }
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            r0 r0Var = f0Var2.e0.q;
            if (r0Var == null) {
                kotlinx.coroutines.future.a.q("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (r0Var.F != Integer.MAX_VALUE) {
                r0Var.v0();
                f0.Y(f0Var2);
            }
        }
    }

    public final void w0() {
        j0 j0Var = this.C;
        if (j0Var.o > 0) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.e0;
                if ((j0Var2.m || j0Var2.n) && !j0Var2.f) {
                    f0Var.U(false);
                }
                r0 r0Var = j0Var2.q;
                if (r0Var != null) {
                    r0Var.w0();
                }
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
        f0.V(j0Var.a, false, 7);
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
        b0 b0Var;
        this.Y = true;
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        p0 p0Var = this.N;
        if ((p0Var != p0.e && !j0Var.c) || (p0Var != p0.y && j0Var.c)) {
            v0();
            if (this.D && f0VarV != null) {
                f0VarV.U(false);
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (!this.D && ((b0Var = j0Var2.d) == b0.z || b0Var == b0.A)) {
                if (this.F != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.h;
                this.F = i;
                j0Var2.h = i + 1;
            }
        } else {
            this.F = 0;
        }
        R();
    }
}
