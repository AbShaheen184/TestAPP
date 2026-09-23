package androidx.compose.ui.node;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.compose.ui.q implements w, n, u1, r1, androidx.compose.ui.modifier.c, p1, v, o, androidx.compose.ui.focus.g, androidx.compose.ui.focus.w, androidx.compose.ui.focus.a0, n1, androidx.compose.ui.draw.a {
    public androidx.compose.ui.p L;

    @Override // androidx.compose.ui.node.w
    public final int B(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return ((androidx.compose.ui.layout.c0) pVar).c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, androidx.compose.ui.layout.t0.e, androidx.compose.ui.layout.u0.e, 1), androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        com.google.firebase.messaging.n nVar2 = ((androidx.compose.ui.input.pointer.a0) pVar).e;
        androidx.compose.ui.input.pointer.a0 a0Var = (androidx.compose.ui.input.pointer.a0) nVar2.B;
        ?? r0 = mVar.a;
        int size = r0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) r0.get(i);
            if (androidx.compose.ui.input.pointer.u.b(vVar) || androidx.compose.ui.input.pointer.u.d(vVar)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = r0.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((androidx.compose.ui.input.pointer.v) r0.get(i2)).b()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (a0Var.d) {
            z3 = true;
            break;
        }
        int size3 = r0.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) r0.get(i3);
                if (!androidx.compose.ui.input.pointer.u.b(vVar2) && !androidx.compose.ui.input.pointer.u.d(vVar2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        androidx.compose.ui.input.pointer.z zVar = (androidx.compose.ui.input.pointer.z) nVar2.z;
        androidx.compose.ui.input.pointer.z zVar2 = androidx.compose.ui.input.pointer.z.z;
        androidx.compose.ui.input.pointer.n nVar3 = androidx.compose.ui.input.pointer.n.z;
        if (zVar != zVar2) {
            if (nVar == androidx.compose.ui.input.pointer.n.e && z3) {
                nVar2.A = mVar;
                nVar2.r(mVar, !z || a0Var.d);
            }
            if (nVar == androidx.compose.ui.input.pointer.n.y && z && mVar.equals((androidx.compose.ui.input.pointer.m) nVar2.A) && a0Var.d) {
                int size4 = r0.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((androidx.compose.ui.input.pointer.v) r0.get(i4)).a();
                }
            }
            if (nVar == nVar3 && !z3 && !mVar.equals((androidx.compose.ui.input.pointer.m) nVar2.A)) {
                nVar2.r(mVar, true);
            }
        }
        if (nVar == nVar3) {
            int size5 = r0.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    nVar2.z = androidx.compose.ui.input.pointer.z.e;
                    ((androidx.compose.ui.input.pointer.a0) nVar2.B).d = false;
                    nVar2.A = null;
                    break;
                } else if (!androidx.compose.ui.input.pointer.u.d((androidx.compose.ui.input.pointer.v) r0.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (mVar.equals((androidx.compose.ui.input.pointer.m) nVar2.A) && z) {
                int size6 = r0.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((androidx.compose.ui.input.pointer.v) r0.get(i6)).b()) {
                        if (a0Var.d) {
                            break;
                        }
                        nVar2.H(mVar);
                        return;
                    }
                }
                int size7 = r0.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((androidx.compose.ui.input.pointer.v) r0.get(i7)).a();
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        com.google.firebase.messaging.n nVar = ((androidx.compose.ui.input.pointer.a0) pVar).e;
        androidx.compose.ui.input.pointer.z zVar = (androidx.compose.ui.input.pointer.z) nVar.z;
        androidx.compose.ui.input.pointer.a0 a0Var = (androidx.compose.ui.input.pointer.a0) nVar.B;
        if (zVar == androidx.compose.ui.input.pointer.z.y) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((androidx.compose.ui.input.pointer.b0) a0Var.e()).invoke(motionEventObtain);
            motionEventObtain.recycle();
            nVar.z = androidx.compose.ui.input.pointer.z.e;
            a0Var.d = false;
            nVar.A = null;
        }
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        M0(true);
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.z & 8) != 0) {
            ((androidx.compose.ui.platform.u) l.w(this)).D();
        }
    }

    @Override // androidx.compose.ui.node.n
    public final void K() {
        l.k(this);
    }

    @Override // androidx.compose.ui.node.r1
    public final void L() {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        ((androidx.compose.ui.input.pointer.a0) pVar).e.getClass();
    }

    public final void M0(boolean z) {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("initializeModifier called on unattached node");
        }
        androidx.compose.ui.p pVar = this.L;
        if ((this.z & 4) != 0 && !z) {
            l.t(this, 2).b1();
        }
        if ((this.z & 2) != 0) {
            w1 w1Var = (w1) l.v(this).d0.f;
            w1Var.getClass();
            if (w1Var.L) {
                d1 d1Var = this.E;
                d1Var.getClass();
                ((y) d1Var).v1(this);
                l1 l1Var = d1Var.i0;
                if (l1Var != null) {
                    ((androidx.compose.ui.platform.r1) l1Var).c();
                }
            }
            if (!z) {
                l.t(this, 2).b1();
                l.v(this).E();
            }
        }
        if (pVar instanceof androidx.compose.foundation.lazy.w) {
            androidx.compose.foundation.lazy.w wVar = (androidx.compose.foundation.lazy.w) pVar;
            f0 f0VarV = l.v(this);
            switch (wVar.b) {
                case 0:
                    ((androidx.compose.foundation.lazy.y) wVar.c).k = f0VarV;
                    break;
                default:
                    ((androidx.compose.foundation.lazy.grid.x) wVar.c).j = f0VarV;
                    break;
            }
        }
        int i = this.z;
        if ((i & 16) != 0 && (pVar instanceof androidx.compose.ui.input.pointer.a0)) {
            ((androidx.compose.ui.input.pointer.a0) pVar).e.y = this.E;
        }
        if ((i & 8) != 0) {
            ((androidx.compose.ui.platform.u) l.w(this)).D();
        }
    }

    @Override // androidx.compose.ui.modifier.c
    public final androidx.compose.ui.modifier.a T() {
        return androidx.compose.ui.modifier.a.a;
    }

    @Override // androidx.compose.ui.node.n
    public final void X(h0 h0Var) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        h0Var.b();
    }

    @Override // androidx.compose.ui.focus.g
    public final void Y(androidx.compose.ui.focus.c0 c0Var) {
        androidx.compose.ui.p pVar = this.L;
        androidx.compose.ui.internal.a.b("onFocusEvent called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.c a() {
        return l.v(this).W;
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.r1
    public final void b() {
        if (this.L instanceof androidx.compose.ui.input.pointer.a0) {
            E();
        }
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return ((androidx.compose.ui.layout.c0) pVar).c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, androidx.compose.ui.layout.t0.e, androidx.compose.ui.layout.u0.y, 1), androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return ((androidx.compose.ui.layout.c0) pVar).c(s0Var, p0Var, j);
    }

    @Override // androidx.compose.ui.draw.a
    public final long d() {
        return coil3.network.g.F(l.t(this, 128).z);
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return l.v(this).X;
    }

    @Override // androidx.compose.ui.node.r1
    public final boolean l0() {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        ((androidx.compose.ui.input.pointer.a0) pVar).e.getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        androidx.compose.ui.semantics.n nVarF = ((androidx.compose.ui.semantics.p) pVar).f();
        a0Var.getClass();
        androidx.compose.ui.semantics.n nVar = (androidx.compose.ui.semantics.n) a0Var;
        androidx.collection.o0 o0Var = nVar.e;
        if (nVarF.z) {
            nVar.z = true;
        }
        if (nVarF.A) {
            nVar.A = true;
        }
        androidx.collection.o0 o0Var2 = nVarF.e;
        Object[] objArr = o0Var2.b;
        Object[] objArr2 = o0Var2.c;
        long[] jArr = o0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        androidx.compose.ui.semantics.z zVar = (androidx.compose.ui.semantics.z) obj;
                        if (!o0Var.b(zVar)) {
                            o0Var.m(zVar, obj2);
                        } else if (obj2 instanceof androidx.compose.ui.semantics.a) {
                            Object objG = o0Var.g(zVar);
                            objG.getClass();
                            androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG;
                            String str = aVar.a;
                            if (str == null) {
                                str = ((androidx.compose.ui.semantics.a) obj2).a;
                            }
                            kotlin.d dVar = aVar.b;
                            if (dVar == null) {
                                dVar = ((androidx.compose.ui.semantics.a) obj2).b;
                            }
                            o0Var.m(zVar, new androidx.compose.ui.semantics.a(str, dVar));
                        }
                    }
                    j >>= i2;
                    i4++;
                    i2 = i2;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return this.K;
    }

    public final String toString() {
        return this.L.toString();
    }

    @Override // androidx.compose.ui.focus.w
    public final void u(androidx.compose.ui.focus.r rVar) {
        androidx.compose.ui.p pVar = this.L;
        androidx.compose.ui.internal.a.b("applyFocusProperties called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.node.w
    public final int v(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return ((androidx.compose.ui.layout.c0) pVar).c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, androidx.compose.ui.layout.t0.y, androidx.compose.ui.layout.u0.e, 1), androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    @Override // androidx.compose.ui.node.o
    public final void w0(d1 d1Var) {
        this.L.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return ((androidx.compose.ui.layout.c0) pVar).c(new androidx.compose.ui.layout.w(n0Var, n0Var.getLayoutDirection()), new androidx.compose.ui.layout.k(p0Var, androidx.compose.ui.layout.t0.y, androidx.compose.ui.layout.u0.y, 1), androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }

    @Override // androidx.compose.ui.node.p1
    public final Object y0(Object obj) {
        androidx.compose.ui.p pVar = this.L;
        pVar.getClass();
        return (androidx.compose.animation.q) pVar;
    }

    @Override // androidx.compose.ui.node.v
    public final void l(long j) {
    }

    @Override // androidx.compose.ui.node.v
    public final void s(androidx.compose.ui.layout.x xVar) {
    }
}
