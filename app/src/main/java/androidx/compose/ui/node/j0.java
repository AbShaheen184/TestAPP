package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final f0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public r0 q;
    public b0 d = b0.B;
    public final v0 p = new v0(this);

    public j0(f0 f0Var) {
        this.a = f0Var;
    }

    public final d1 a() {
        return (d1) this.a.d0.e;
    }

    public final void b() {
        b0 b0Var = this.a.e0.d;
        b0 b0Var2 = b0.z;
        b0 b0Var3 = b0.A;
        if (b0Var == b0Var2 || b0Var == b0Var3) {
            if (this.p.X) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0Var == b0Var3) {
            r0 r0Var = this.q;
            if (r0Var == null || !r0Var.R) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        r0 r0Var = this.q;
        if (r0Var != null) {
            j0 j0Var = r0Var.C;
            j0Var.d = b0.y;
            f0 f0Var = j0Var.a;
            j0Var.e = false;
            r0Var.V = j;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSnapshotObserver();
            q0 q0Var = r0Var.W;
            snapshotObserver.a.d(f0Var, snapshotObserver.b, q0Var);
            j0Var.f = true;
            j0Var.g = true;
            boolean zQ = l.q(f0Var);
            v0 v0Var = j0Var.p;
            if (zQ) {
                v0Var.S = true;
                v0Var.T = true;
            } else {
                v0Var.R = true;
            }
            j0Var.d = b0.B;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.e0 : null;
            if (j0Var != null) {
                int i3 = j0Var.l;
                if (i == 0) {
                    j0Var.d(i3 - 1);
                } else {
                    j0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.e0 : null;
            if (j0Var != null) {
                int i3 = j0Var.o;
                if (i == 0) {
                    j0Var.e(i3 - 1);
                } else {
                    j0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        v0 v0Var = this.p;
        j0 j0Var = v0Var.C;
        Object obj = v0Var.O;
        f0 f0Var = this.a;
        if ((obj != null || j0Var.a().L() != null) && v0Var.N) {
            v0Var.N = false;
            v0Var.O = j0Var.a().L();
            f0 f0VarV = f0Var.v();
            if (f0VarV != null) {
                f0.X(f0VarV, false, 7);
            }
        }
        r0 r0Var = this.q;
        if (r0Var != null) {
            j0 j0Var2 = r0Var.C;
            if (r0Var.U == null) {
                o0 o0VarS0 = j0Var2.a().S0();
                o0VarS0.getClass();
                if (o0VarS0.L.L() == null) {
                    return;
                }
            }
            if (r0Var.T) {
                r0Var.T = false;
                o0 o0VarS1 = j0Var2.a().S0();
                o0VarS1.getClass();
                r0Var.U = o0VarS1.L.L();
                if (l.q(f0Var)) {
                    f0 f0VarV2 = f0Var.v();
                    if (f0VarV2 != null) {
                        f0.X(f0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                f0 f0VarV3 = f0Var.v();
                if (f0VarV3 != null) {
                    f0.V(f0VarV3, false, 7);
                }
            }
        }
    }
}
