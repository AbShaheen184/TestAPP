package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements x {
    public final androidx.compose.ui.node.o0 e;

    public o0(androidx.compose.ui.node.o0 o0Var) {
        this.e = o0Var;
    }

    @Override // androidx.compose.ui.layout.x
    public final long D(x xVar, long j) {
        boolean z = xVar instanceof o0;
        androidx.compose.ui.node.o0 o0Var = this.e;
        if (!z) {
            androidx.compose.ui.node.o0 o0VarI = a0.i(o0Var);
            androidx.compose.ui.node.d1 d1Var = o0VarI.L;
            long jD = D(o0VarI.O, j);
            long j2 = o0VarI.M;
            long jD2 = androidx.compose.ui.geometry.b.d(jD, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!d1Var.U0().K) {
                androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            d1Var.d1();
            androidx.compose.ui.node.d1 d1Var2 = d1Var.N;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            return androidx.compose.ui.geometry.b.e(jD2, d1Var.D(xVar, 0L));
        }
        androidx.compose.ui.node.o0 o0Var2 = ((o0) xVar).e;
        androidx.compose.ui.node.d1 d1Var3 = o0Var2.L;
        d1Var3.d1();
        androidx.compose.ui.node.o0 o0VarS0 = o0Var.L.Q0(d1Var3).S0();
        if (o0VarS0 != null) {
            long jB = androidx.compose.ui.unit.j.b(androidx.compose.ui.unit.j.c(o0Var2.M0(o0VarS0, false), androidx.room.t.F(j)), o0Var.M0(o0VarS0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        androidx.compose.ui.node.o0 o0VarI2 = a0.i(o0Var2);
        long jC = androidx.compose.ui.unit.j.c(androidx.compose.ui.unit.j.c(o0Var2.M0(o0VarI2, false), o0VarI2.M), androidx.room.t.F(j));
        androidx.compose.ui.node.o0 o0VarI3 = a0.i(o0Var);
        long jB2 = androidx.compose.ui.unit.j.b(jC, androidx.compose.ui.unit.j.c(o0Var.M0(o0VarI3, false), o0VarI3.M));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        androidx.compose.ui.node.d1 d1Var4 = o0VarI3.L.N;
        d1Var4.getClass();
        androidx.compose.ui.node.d1 d1Var5 = o0VarI2.L.N;
        d1Var5.getClass();
        return d1Var4.D(d1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // androidx.compose.ui.layout.x
    public final long E(long j) {
        return this.e.L.E(androidx.compose.ui.geometry.b.e(0L, a()));
    }

    @Override // androidx.compose.ui.layout.x
    public final long I(long j) {
        return androidx.compose.ui.geometry.b.e(this.e.L.I(j), a());
    }

    @Override // androidx.compose.ui.layout.x
    public final void K(x xVar, float[] fArr) {
        this.e.L.K(xVar, fArr);
    }

    @Override // androidx.compose.ui.layout.x
    public final x N() {
        androidx.compose.ui.node.o0 o0VarS0;
        if (!l()) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.node.d1 d1Var = ((androidx.compose.ui.node.d1) this.e.L.L.d0.e).N;
        if (d1Var == null || (o0VarS0 = d1Var.S0()) == null) {
            return null;
        }
        return o0VarS0.O;
    }

    @Override // androidx.compose.ui.layout.x
    public final long T(long j) {
        return androidx.compose.ui.geometry.b.e(this.e.L.T(j), a());
    }

    @Override // androidx.compose.ui.layout.x
    public final long X(long j) {
        return this.e.L.X(androidx.compose.ui.geometry.b.e(j, a()));
    }

    public final long a() {
        androidx.compose.ui.node.o0 o0Var = this.e;
        androidx.compose.ui.node.o0 o0VarI = a0.i(o0Var);
        return androidx.compose.ui.geometry.b.d(D(o0VarI.O, 0L), o0Var.L.D(o0VarI.L, 0L));
    }

    @Override // androidx.compose.ui.layout.x
    public final long f(long j) {
        return this.e.L.f(androidx.compose.ui.geometry.b.e(j, a()));
    }

    @Override // androidx.compose.ui.layout.x
    public final long i(x xVar, long j) {
        return D(xVar, j);
    }

    @Override // androidx.compose.ui.layout.x
    public final boolean l() {
        return this.e.L.U0().K;
    }

    @Override // androidx.compose.ui.layout.x
    public final void m(float[] fArr) {
        this.e.L.m(fArr);
    }

    @Override // androidx.compose.ui.layout.x
    public final androidx.compose.ui.geometry.c s(x xVar, boolean z) {
        return this.e.L.s(xVar, z);
    }

    @Override // androidx.compose.ui.layout.x
    public final long u() {
        androidx.compose.ui.node.o0 o0Var = this.e;
        return (((long) o0Var.e) << 32) | (((long) o0Var.y) & 4294967295L);
    }
}
